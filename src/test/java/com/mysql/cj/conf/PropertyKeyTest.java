package com.mysql.cj.conf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class PropertyKeyTest {
  @Test
  public void normalizeCaseTest() {
    // Arrange, Act and Assert
    assertEquals("address", PropertyKey.normalizeCase("ADDRESS"));
  }

  @Test
  public void fromValueTest() {
    // Arrange, Act and Assert
    assertEquals(PropertyKey.ADDRESS, PropertyKey.fromValue("ADDRESS"));
  }

  @Test
  public void getCcAliasTest() {
    // Arrange, Act and Assert
    assertNull(PropertyKey.USER.getCcAlias());
  }

  @Test
  public void getKeyNameTest() {
    // Arrange, Act and Assert
    assertEquals("user", PropertyKey.USER.getKeyName());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("user", PropertyKey.USER.toString());
  }
}
