package com.mysql.cj.protocol.a.authentication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.protocol.a.NativePacketPayload;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysqlOldPasswordPluginTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void nextAuthenticationStepTest() {
    // Arrange
    MysqlOldPasswordPlugin mysqlOldPasswordPlugin = new MysqlOldPasswordPlugin();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    mysqlOldPasswordPlugin.nextAuthenticationStep(new NativePacketPayload(1), null);
  }

  @Test
  public void isReusableTest() {
    // Arrange, Act and Assert
    assertTrue((new MysqlOldPasswordPlugin()).isReusable());
  }

  @Test
  public void requiresConfidentialityTest() {
    // Arrange, Act and Assert
    assertFalse((new MysqlOldPasswordPlugin()).requiresConfidentiality());
  }

  @Test
  public void getProtocolPluginNameTest() {
    // Arrange, Act and Assert
    assertEquals("mysql_old_password", (new MysqlOldPasswordPlugin()).getProtocolPluginName());
  }
}
