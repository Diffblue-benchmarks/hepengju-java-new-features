package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.ServerVersion;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.util.HashMap;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class XServerCapabilitiesTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void serverSupportsFracSecsTest() {
    // Arrange, Act and Assert
    assertTrue((new XServerCapabilities(null)).serverSupportsFracSecs());
  }
  @Test
  public void getServerVersionTest() {
    // Arrange, Act and Assert
    assertNull((new XServerCapabilities(null)).getServerVersion());
  }
  @Test
  public void getCapabilityFlagsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new XServerCapabilities(null)).getCapabilityFlags());
  }
  @Test
  public void getDocFormatsTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XServerCapabilities(null)).getDocFormats();
  }
  @Test
  public void getAuthenticationMechanismsTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XServerCapabilities(null)).getAuthenticationMechanisms();
  }
  @Test
  public void getClientPwdExpireOkTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XServerCapabilities(null)).getClientPwdExpireOk();
  }
  @Test
  public void getTlsTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XServerCapabilities(null)).getTls();
  }
  @Test
  public void getNodeTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XServerCapabilities(null)).getNodeType();
  }
  @Test
  public void hasCapabilityTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XServerCapabilities(null)).hasCapability("authentication.mechanisms");
  }
  @Test
  public void setCapabilityTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XServerCapabilities(null)).setCapability("authentication.mechanisms", "authentication.mechanisms");
  }
}
