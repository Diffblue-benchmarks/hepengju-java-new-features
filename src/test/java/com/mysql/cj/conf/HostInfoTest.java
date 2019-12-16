package com.mysql.cj.conf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class HostInfoTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getDatabaseUrlTest() {
    // Arrange, Act and Assert
    assertEquals("", (new HostInfo()).getDatabaseUrl());
  }

  @Test
  public void exposeAsPropertiesTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new HostInfo()).exposeAsProperties();
  }

  @Test
  public void getDatabaseTest() {
    // Arrange, Act and Assert
    assertEquals("", (new HostInfo()).getDatabase());
  }

  @Test
  public void getPropertyTest() {
    // Arrange, Act and Assert
    assertNull((new HostInfo()).getProperty("aaaaa"));
  }

  @Test
  public void getHostPropertiesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new HostInfo()).getHostProperties().size());
  }

  @Test
  public void isPasswordlessTest() {
    // Arrange, Act and Assert
    assertTrue((new HostInfo()).isPasswordless());
  }

  @Test
  public void getPasswordTest() {
    // Arrange, Act and Assert
    assertNull((new HostInfo()).getPassword());
  }

  @Test
  public void getUserTest() {
    // Arrange, Act and Assert
    assertNull((new HostInfo()).getUser());
  }

  @Test
  public void getHostPortPairTest() {
    // Arrange, Act and Assert
    assertEquals("null:-1", (new HostInfo()).getHostPortPair());
  }

  @Test
  public void getPortTest() {
    // Arrange, Act and Assert
    assertEquals(-1, (new HostInfo()).getPort());
  }

  @Test
  public void getHostTest() {
    // Arrange, Act and Assert
    assertNull((new HostInfo()).getHost());
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    HostInfo actualHostInfo = new HostInfo(new HostInfo(), "aaaaa", 1, "aaaaa", "aaaaa", true, null);

    // Assert
    String actualPassword = actualHostInfo.getPassword();
    String actualHost = actualHostInfo.getHost();
    boolean actualIsPasswordlessResult = actualHostInfo.isPasswordless();
    String actualUser = actualHostInfo.getUser();
    String actualDatabaseUrl = actualHostInfo.getDatabaseUrl();
    int actualPort = actualHostInfo.getPort();
    assertEquals("aaaaa", actualPassword);
    assertEquals("", actualHostInfo.getDatabase());
    assertEquals(1, actualPort);
    assertEquals("", actualDatabaseUrl);
    assertEquals("aaaaa", actualUser);
    assertTrue(actualIsPasswordlessResult);
    assertEquals("aaaaa", actualHost);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    HostInfo actualHostInfo = new HostInfo(new HostInfo(), "aaaaa", 1, "aaaaa", "aaaaa", null);

    // Assert
    String actualPassword = actualHostInfo.getPassword();
    String actualHost = actualHostInfo.getHost();
    boolean actualIsPasswordlessResult = actualHostInfo.isPasswordless();
    String actualUser = actualHostInfo.getUser();
    String actualDatabaseUrl = actualHostInfo.getDatabaseUrl();
    int actualPort = actualHostInfo.getPort();
    assertEquals("aaaaa", actualPassword);
    assertEquals("", actualHostInfo.getDatabase());
    assertEquals(1, actualPort);
    assertEquals("", actualDatabaseUrl);
    assertEquals("aaaaa", actualUser);
    assertFalse(actualIsPasswordlessResult);
    assertEquals("aaaaa", actualHost);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    HostInfo actualHostInfo = new HostInfo(new HostInfo(), "aaaaa", 1, "aaaaa", "aaaaa");

    // Assert
    String actualPassword = actualHostInfo.getPassword();
    String actualHost = actualHostInfo.getHost();
    boolean actualIsPasswordlessResult = actualHostInfo.isPasswordless();
    String actualUser = actualHostInfo.getUser();
    String actualDatabaseUrl = actualHostInfo.getDatabaseUrl();
    int actualPort = actualHostInfo.getPort();
    assertEquals("aaaaa", actualPassword);
    assertEquals("", actualHostInfo.getDatabase());
    assertEquals(1, actualPort);
    assertEquals("", actualDatabaseUrl);
    assertEquals("aaaaa", actualUser);
    assertFalse(actualIsPasswordlessResult);
    assertEquals("aaaaa", actualHost);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    HostInfo actualHostInfo = new HostInfo();

    // Assert
    String actualPassword = actualHostInfo.getPassword();
    String actualHost = actualHostInfo.getHost();
    boolean actualIsPasswordlessResult = actualHostInfo.isPasswordless();
    String actualUser = actualHostInfo.getUser();
    String actualDatabaseUrl = actualHostInfo.getDatabaseUrl();
    int actualPort = actualHostInfo.getPort();
    assertNull(actualPassword);
    assertEquals("", actualHostInfo.getDatabase());
    assertEquals(-1, actualPort);
    assertEquals("", actualDatabaseUrl);
    assertNull(actualUser);
    assertTrue(actualIsPasswordlessResult);
    assertNull(actualHost);
  }
}
