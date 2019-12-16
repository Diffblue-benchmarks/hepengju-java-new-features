package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertNull;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.conf.PropertySet;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.protocol.a.NativeServerSession;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class XAuthenticationProviderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getEncodingForHandshakeTest() {
    // Arrange, Act and Assert
    assertNull((new XAuthenticationProvider()).getEncodingForHandshake());
  }

  @Test
  public void changeUserTest() {
    // Arrange
    XAuthenticationProvider xAuthenticationProvider = new XAuthenticationProvider();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    xAuthenticationProvider.changeUser(new NativeServerSession(new DefaultPropertySet()), "'.", "'.", "'.");
  }

  @Test
  public void connectTest() {
    // Arrange
    XAuthenticationProvider xAuthenticationProvider = new XAuthenticationProvider();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    xAuthenticationProvider.connect(new NativeServerSession(new DefaultPropertySet()), "'.", "'.", "'.");
  }

  @Test
  public void initTest() {
    // Arrange
    XAuthenticationProvider xAuthenticationProvider = new XAuthenticationProvider();

    // Act
    xAuthenticationProvider.init(null, null, null);

    // Assert
    assertNull(xAuthenticationProvider.protocol);
  }
}
