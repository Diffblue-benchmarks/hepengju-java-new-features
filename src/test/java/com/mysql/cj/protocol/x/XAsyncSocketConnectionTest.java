package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.exceptions.CJCommunicationsException;
import com.mysql.cj.exceptions.CJOperationNotSupportedException;
import com.mysql.cj.exceptions.ExceptionInterceptor;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.exceptions.FeatureNotAvailableException;
import com.mysql.cj.exceptions.SSLParamsException;
import com.mysql.cj.log.Jdk14Logger;
import com.mysql.cj.protocol.FullReadInputStream;
import com.mysql.cj.protocol.NetworkResources;
import com.mysql.cj.protocol.SocketFactory;
import com.mysql.cj.protocol.a.NativeServerSession;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.channels.AsynchronousSocketChannel;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class XAsyncSocketConnectionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void isSynchronousTest() {
    // Arrange, Act and Assert
    assertFalse((new XAsyncSocketConnection()).isSynchronous());
  }

  @Test
  public void getExceptionInterceptorTest() {
    // Arrange, Act and Assert
    assertNull((new XAsyncSocketConnection()).getExceptionInterceptor());
  }

  @Test
  public void isSSLEstablishedTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XAsyncSocketConnection()).isSSLEstablished();
  }

  @Test
  public void getMysqlOutputTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XAsyncSocketConnection()).getMysqlOutput();
  }

  @Test
  public void setMysqlInputTest() {
    // Arrange
    XAsyncSocketConnection xAsyncSocketConnection = new XAsyncSocketConnection();

    // Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    xAsyncSocketConnection.setMysqlInput(new FullReadInputStream(new ByteArrayInputStream(new byte[24])));
  }

  @Test
  public void getMysqlInputTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XAsyncSocketConnection()).getMysqlInput();
  }

  @Test
  public void getMysqlSocketTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XAsyncSocketConnection()).getMysqlSocket();
  }

  @Test
  public void getNetworkResourcesTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XAsyncSocketConnection()).getNetworkResources();
  }

  @Test
  public void forceCloseTest() {
    // Arrange
    XAsyncSocketConnection xAsyncSocketConnection = new XAsyncSocketConnection();

    // Act
    xAsyncSocketConnection.forceClose();

    // Assert
    assertNull(xAsyncSocketConnection.getAsynchronousSocketChannel());
  }

  @Test
  public void getAsynchronousSocketChannelTest() {
    // Arrange, Act and Assert
    assertNull((new XAsyncSocketConnection()).getAsynchronousSocketChannel());
  }

  @Test
  public void performTlsHandshakeTest() throws FeatureNotAvailableException, SSLParamsException, IOException {
    // Arrange
    XAsyncSocketConnection xAsyncSocketConnection = new XAsyncSocketConnection();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    xAsyncSocketConnection.performTlsHandshake(new NativeServerSession(new DefaultPropertySet()));
  }

  @Test
  public void connectTest() {
    // Arrange
    XAsyncSocketConnection xAsyncSocketConnection = new XAsyncSocketConnection();
    DefaultPropertySet propSet = new DefaultPropertySet();

    // Act and Assert
    thrown.expect(CJCommunicationsException.class);
    xAsyncSocketConnection.connect("aaaaa", 1, propSet, null, new Jdk14Logger("aaaaa"), 1);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    XAsyncSocketConnection actualXAsyncSocketConnection = new XAsyncSocketConnection();

    // Assert
    String actualHost = actualXAsyncSocketConnection.getHost();
    SocketFactory actualSocketFactory = actualXAsyncSocketConnection.getSocketFactory();
    assertEquals(3306, actualXAsyncSocketConnection.getPort());
    assertNull(actualSocketFactory);
    assertNull(actualHost);
  }
}
