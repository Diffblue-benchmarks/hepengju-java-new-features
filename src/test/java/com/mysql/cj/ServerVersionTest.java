package com.mysql.cj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ServerVersionTest {
  @Test
  public void parseVersionTest() {
    // Arrange and Act
    ServerVersion actualParseVersionResult = ServerVersion.parseVersion("aaaaa");

    // Assert
    String actualToStringResult = actualParseVersionResult.toString();
    int actualMajor = actualParseVersionResult.getMajor();
    int actualMinor = actualParseVersionResult.getMinor();
    assertEquals("0.0.0", actualToStringResult);
    assertEquals(0, actualParseVersionResult.getSubminor());
    assertEquals(0, actualMinor);
    assertEquals(0, actualMajor);
  }

  @Test
  public void meetsMinimumTest() {
    // Arrange, Act and Assert
    assertTrue(ServerVersion.parseVersion("aaaaa").meetsMinimum(ServerVersion.parseVersion("aaaaa")));
  }

  @Test
  public void compareToTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServerVersion.parseVersion("aaaaa").compareTo(ServerVersion.parseVersion("aaaaa")));
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(184000, ServerVersion.parseVersion("aaaaa").hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(ServerVersion.parseVersion("aaaaa").equals("aaaaa"));
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("0.0.0", ServerVersion.parseVersion("aaaaa").toString());
  }

  @Test
  public void getSubminorTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServerVersion.parseVersion("aaaaa").getSubminor());
  }

  @Test
  public void getMinorTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServerVersion.parseVersion("aaaaa").getMinor());
  }

  @Test
  public void getMajorTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServerVersion.parseVersion("aaaaa").getMajor());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ServerVersion actualServerVersion = new ServerVersion(1, 1, 1);

    // Assert
    String actualToStringResult = actualServerVersion.toString();
    int actualMajor = actualServerVersion.getMajor();
    int actualMinor = actualServerVersion.getMinor();
    assertEquals("1.1.1", actualToStringResult);
    assertEquals(1, actualServerVersion.getSubminor());
    assertEquals(1, actualMinor);
    assertEquals(1, actualMajor);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ServerVersion actualServerVersion = new ServerVersion("aaaaa", 1, 1, 1);

    // Assert
    String actualToStringResult = actualServerVersion.toString();
    int actualMajor = actualServerVersion.getMajor();
    int actualMinor = actualServerVersion.getMinor();
    assertEquals("aaaaa", actualToStringResult);
    assertEquals(1, actualServerVersion.getSubminor());
    assertEquals(1, actualMinor);
    assertEquals(1, actualMajor);
  }
}
