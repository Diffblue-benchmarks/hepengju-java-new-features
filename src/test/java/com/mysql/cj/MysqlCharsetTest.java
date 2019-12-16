package com.mysql.cj;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MysqlCharsetTest {
  @Test
  public void constructorTest2() {
    // Arrange and Act
    MysqlCharset actualMysqlCharset = new MysqlCharset("Cp1252", 1, 1, new String[]{"Cp1252", "Cp1252", "Cp1252"},
        ServerVersion.parseVersion("Cp1252"));

    // Assert
    assertEquals("Cp1252", actualMysqlCharset.charsetName);
    assertEquals(1, actualMysqlCharset.priority);
    assertEquals(1, actualMysqlCharset.mblen);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    MysqlCharset actualMysqlCharset = new MysqlCharset("Cp1252", 1, 1, new String[]{"Cp1252", "Cp1252", "Cp1252"});

    // Assert
    String actualString = actualMysqlCharset.charsetName;
    int actualResultInt = actualMysqlCharset.mblen;
    int actualResultInt1 = actualMysqlCharset.priority;
    ServerVersion serverVersion = actualMysqlCharset.minimumVersion;
    String actualToStringResult = serverVersion.toString();
    int actualMajor = serverVersion.getMajor();
    int actualMinor = serverVersion.getMinor();
    assertEquals("Cp1252", actualString);
    assertEquals(1, actualResultInt1);
    assertEquals(1, actualResultInt);
    assertEquals("0.0.0", actualToStringResult);
    assertEquals(0, serverVersion.getSubminor());
    assertEquals(0, actualMajor);
    assertEquals(0, actualMinor);
  }
}
