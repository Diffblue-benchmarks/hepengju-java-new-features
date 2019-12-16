package com.mysql.cj.protocol.a.authentication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.conf.RuntimeProperty;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.exceptions.WrongArgumentException;
import com.mysql.cj.log.Jdk14Logger;
import com.mysql.cj.protocol.a.NativePacketPayload;
import com.mysql.cj.protocol.a.NativeProtocol;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Sha256PasswordPluginTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void readRSAKeyTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    Sha256PasswordPlugin.readRSAKey("", new DefaultPropertySet(), null);
  }

  @Test
  public void encryptPasswordTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new Sha256PasswordPlugin()).encryptPassword("");
  }

  @Test
  public void encryptPasswordTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new Sha256PasswordPlugin()).encryptPassword();
  }

  @Test
  public void nextAuthenticationStepTest() {
    // Arrange
    Sha256PasswordPlugin sha256PasswordPlugin = new Sha256PasswordPlugin();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    sha256PasswordPlugin.nextAuthenticationStep(new NativePacketPayload(1), null);
  }

  @Test
  public void setAuthenticationParametersTest() {
    // Arrange
    Sha256PasswordPlugin sha256PasswordPlugin = new Sha256PasswordPlugin();

    // Act
    sha256PasswordPlugin.setAuthenticationParameters("", "");

    // Assert
    assertEquals("", sha256PasswordPlugin.password);
  }

  @Test
  public void isReusableTest() {
    // Arrange, Act and Assert
    assertTrue((new Sha256PasswordPlugin()).isReusable());
  }

  @Test
  public void requiresConfidentialityTest() {
    // Arrange, Act and Assert
    assertFalse((new Sha256PasswordPlugin()).requiresConfidentiality());
  }

  @Test
  public void getProtocolPluginNameTest() {
    // Arrange, Act and Assert
    assertEquals("sha256_password", (new Sha256PasswordPlugin()).getProtocolPluginName());
  }

  @Test
  public void destroyTest() {
    // Arrange
    Sha256PasswordPlugin sha256PasswordPlugin = new Sha256PasswordPlugin();

    // Act
    sha256PasswordPlugin.destroy();

    // Assert
    assertNull(sha256PasswordPlugin.seed);
    assertNull(sha256PasswordPlugin.password);
    assertFalse(sha256PasswordPlugin.publicKeyRequested);
  }

  @Test
  public void initTest() {
    // Arrange
    Sha256PasswordPlugin sha256PasswordPlugin = new Sha256PasswordPlugin();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    sha256PasswordPlugin.init(new NativeProtocol(new Jdk14Logger("")));
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Sha256PasswordPlugin actualSha256PasswordPlugin = new Sha256PasswordPlugin();

    // Assert
    assertNull(actualSha256PasswordPlugin.publicKeyString);
    assertNull(actualSha256PasswordPlugin.serverRSAPublicKeyFile);
    assertNull(actualSha256PasswordPlugin.seed);
    assertNull(actualSha256PasswordPlugin.password);
    assertFalse(actualSha256PasswordPlugin.publicKeyRequested);
  }
}
