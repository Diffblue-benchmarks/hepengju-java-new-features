package com.mysql.cj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MysqlTypeTest {
  @Test
  public void getVendorTypeNumberTest() {
    // Arrange, Act and Assert
    assertEquals(Integer.valueOf(3), MysqlType.DECIMAL.getVendorTypeNumber());
  }

  @Test
  public void getVendorTest() {
    // Arrange, Act and Assert
    assertEquals("com.mysql.cj", MysqlType.DECIMAL.getVendor());
  }

  @Test
  public void getCreateParamsTest() {
    // Arrange, Act and Assert
    assertEquals("[(M[,D])] [UNSIGNED] [ZEROFILL]", MysqlType.DECIMAL.getCreateParams());
  }

  @Test
  public void getPrecisionTest() {
    // Arrange, Act and Assert
    assertEquals(Long.valueOf(65L), MysqlType.DECIMAL.getPrecision());
  }

  @Test
  public void isDecimalTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlType.DECIMAL.isDecimal());
  }

  @Test
  public void getClassNameTest() {
    // Arrange, Act and Assert
    assertEquals("java.math.BigDecimal", MysqlType.DECIMAL.getClassName());
  }

  @Test
  public void isAllowedTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlType.DECIMAL.isAllowed(1));
  }

  @Test
  public void getJdbcTypeTest() {
    // Arrange, Act and Assert
    assertEquals(3, MysqlType.DECIMAL.getJdbcType());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("DECIMAL", MysqlType.DECIMAL.getName());
  }

  @Test
  public void isSignedTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlType.isSigned(MysqlType.DECIMAL));
  }

  @Test
  public void supportsConvertTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlType.supportsConvert(1, 1));
  }

  @Test
  public void getByJdbcTypeTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlType.CHAR, MysqlType.getByJdbcType(1));
  }

  @Test
  public void getByNameTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlType.UNKNOWN, MysqlType.getByName(""));
  }
}
