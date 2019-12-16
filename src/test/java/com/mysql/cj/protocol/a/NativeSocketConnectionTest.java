package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.exceptions.CJOperationNotSupportedException;
import com.mysql.cj.exceptions.FeatureNotAvailableException;
import com.mysql.cj.exceptions.SSLParamsException;
import com.mysql.cj.protocol.SocketFactory;
import java.io.IOException;
import java.net.Socket;
import java.nio.channels.AsynchronousSocketChannel;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NativeSocketConnectionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getAsynchronousSocketChannelTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new NativeSocketConnection()).getAsynchronousSocketChannel();
  }

  @Test
  public void performTlsHandshakeTest() throws FeatureNotAvailableException, SSLParamsException, IOException {
    // Arrange
    NativeSocketConnection nativeSocketConnection = new NativeSocketConnection();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    nativeSocketConnection.performTlsHandshake(new NativeServerSession(new DefaultPropertySet()));
  }

  @Test
  public void constructorTest() throws IOException {
    // Arrange and Act
    NativeSocketConnection actualNativeSocketConnection = new NativeSocketConnection();

    // Assert
    String actualHost = actualNativeSocketConnection.getHost();
    Socket actualMysqlSocket = actualNativeSocketConnection.getMysqlSocket();
    SocketFactory actualSocketFactory = actualNativeSocketConnection.getSocketFactory();
    assertNull(actualHost);
    assertEquals(3306, actualNativeSocketConnection.getPort());
    assertNull(actualSocketFactory);
    assertNull(actualMysqlSocket);
  }
}
