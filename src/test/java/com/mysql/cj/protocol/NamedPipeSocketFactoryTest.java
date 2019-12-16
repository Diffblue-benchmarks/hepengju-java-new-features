package com.mysql.cj.protocol;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.MysqlxSession;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.protocol.a.NativeServerSession;
import com.mysql.cj.protocol.a.NativeSocketConnection;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import org.junit.Test;

public class NamedPipeSocketFactoryTest {
  @Test
  public void constructorTest3() {
    // Arrange, Act and Assert
    assertNull(((new NamedPipeSocketFactory()).new RandomAccessFileOutputStream(null)).raFile);
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertNull(((new NamedPipeSocketFactory()).new RandomAccessFileInputStream(null)).raFile);
  }

  @Test
  public void constructorTest() throws IOException {
    // Arrange and Act
    NamedPipeSocketFactory.NamedPipeSocket actualNamedPipeSocket = (new NamedPipeSocketFactory()).new NamedPipeSocket(
        "NamedPipeSocketFactory.4");

    // Assert
    InputStream inputStream = actualNamedPipeSocket.getInputStream();
    assertTrue(inputStream instanceof NamedPipeSocketFactory.RandomAccessFileInputStream);
    assertFalse(actualNamedPipeSocket.isClosed());
  }

  @Test
  public void isLocallyConnectedTest() {
    // Arrange, Act and Assert
    assertTrue((new NamedPipeSocketFactory()).isLocallyConnected(null));
  }

  @Test
  public void performTlsHandshakeTest() throws IOException {
    // Arrange
    NamedPipeSocketFactory namedPipeSocketFactory = new NamedPipeSocketFactory();
    NativeSocketConnection socketConnection = new NativeSocketConnection();

    // Act and Assert
    assertNull(namedPipeSocketFactory.<Closeable>performTlsHandshake(socketConnection,
        new NativeServerSession(new DefaultPropertySet())));
  }
}
