package com.mysql.cj.protocol.a.authentication;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.log.Jdk14Logger;
import com.mysql.cj.protocol.a.NativePacketPayload;
import com.mysql.cj.protocol.a.NativeProtocol;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CachingSha2PasswordPluginTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void encryptPasswordTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new CachingSha2PasswordPlugin()).encryptPassword();
  }
  @Test
  public void nextAuthenticationStepTest() {
    // Arrange
    CachingSha2PasswordPlugin cachingSha2PasswordPlugin = new CachingSha2PasswordPlugin();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    cachingSha2PasswordPlugin.nextAuthenticationStep(new NativePacketPayload(1), null);
  }
  @Test
  public void getProtocolPluginNameTest() {
    // Arrange, Act and Assert
    assertEquals("caching_sha2_password", (new CachingSha2PasswordPlugin()).getProtocolPluginName());
  }
  @Test
  public void initTest() {
    // Arrange
    CachingSha2PasswordPlugin cachingSha2PasswordPlugin = new CachingSha2PasswordPlugin();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    cachingSha2PasswordPlugin.init(new NativeProtocol(new Jdk14Logger("caching_sha2_password")));
  }
}
