package com.mysql.cj.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.protocol.a.NativeServerSession;
import com.mysql.cj.protocol.a.NativeSocketConnection;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StandardSocketFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getRealTimeoutTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new StandardSocketFactory()).getRealTimeout(1));
  }

  @Test
  public void afterHandshakeTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new StandardSocketFactory()).afterHandshake();
  }

  @Test
  public void performTlsHandshakeTest() throws IOException {
    // Arrange
    StandardSocketFactory standardSocketFactory = new StandardSocketFactory();
    NativeSocketConnection socketConnection = new NativeSocketConnection();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    standardSocketFactory.<Closeable>performTlsHandshake(socketConnection,
        new NativeServerSession(new DefaultPropertySet()));
  }

  @Test
  public void beforeHandshakeTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new StandardSocketFactory()).beforeHandshake();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    StandardSocketFactory actualStandardSocketFactory = new StandardSocketFactory();

    // Assert
    assertEquals(0, actualStandardSocketFactory.loginTimeoutCountdown);
    assertNull(actualStandardSocketFactory.sslSocket);
    assertNull(actualStandardSocketFactory.host);
    assertNull(actualStandardSocketFactory.rawSocket);
    assertEquals(3306, actualStandardSocketFactory.port);
    assertEquals(0, actualStandardSocketFactory.socketTimeoutBackup);
  }
}
