package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.exceptions.ExceptionInterceptor;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.log.Jdk14Logger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NativeAuthenticationProviderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void changeUserTest() {
    // Arrange
    NativeAuthenticationProvider nativeAuthenticationProvider = new NativeAuthenticationProvider();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    nativeAuthenticationProvider.changeUser(new NativeServerSession(new DefaultPropertySet()), "", "", "");
  }

  @Test
  public void getExceptionInterceptorTest() {
    // Arrange, Act and Assert
    assertNull((new NativeAuthenticationProvider()).getExceptionInterceptor());
  }

  @Test
  public void getEncodingForHandshakeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeAuthenticationProvider()).getEncodingForHandshake();
  }

  @Test
  public void connectTest() {
    // Arrange
    NativeAuthenticationProvider nativeAuthenticationProvider = new NativeAuthenticationProvider();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    nativeAuthenticationProvider.connect(new NativeServerSession(new DefaultPropertySet()), "", "", "");
  }

  @Test
  public void initTest() {
    // Arrange
    NativeAuthenticationProvider nativeAuthenticationProvider = new NativeAuthenticationProvider();
    NativeProtocol prot = new NativeProtocol(new Jdk14Logger(""));

    // Act
    nativeAuthenticationProvider.init(prot, new DefaultPropertySet(), null);

    // Assert
    String actualEncodingForHandshake = nativeAuthenticationProvider.getEncodingForHandshake();
    assertEquals("UTF-8", actualEncodingForHandshake);
    assertNull(nativeAuthenticationProvider.getExceptionInterceptor());
  }
}
