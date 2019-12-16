package com.mysql.cj.protocol;

import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.exceptions.CJCommunicationsException;
import com.mysql.cj.protocol.a.NativeServerSession;
import com.mysql.cj.protocol.a.NativeSocketConnection;
import java.io.Closeable;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AsyncSocketFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void performTlsHandshakeTest() throws IOException {
    // Arrange
    AsyncSocketFactory asyncSocketFactory = new AsyncSocketFactory();
    NativeSocketConnection socketConnection = new NativeSocketConnection();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    asyncSocketFactory.<Closeable>performTlsHandshake(socketConnection,
        new NativeServerSession(new DefaultPropertySet()));
  }
  @Test
  public void connectTest() throws IOException {
    // Arrange
    AsyncSocketFactory asyncSocketFactory = new AsyncSocketFactory();

    // Act and Assert
    thrown.expect(CJCommunicationsException.class);
    asyncSocketFactory.<Closeable>connect("aaaaa", 1, new DefaultPropertySet(), 1);
  }
}
