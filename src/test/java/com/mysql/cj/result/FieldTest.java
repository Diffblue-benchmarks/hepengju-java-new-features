package com.mysql.cj.result;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.MysqlType;
import com.mysql.cj.ServerVersion;
import com.mysql.cj.util.LazyString;
import org.junit.Test;

public class FieldTest {
  @Test
  public void setFlagsTest() {
    // Arrange
    Field field = new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1);

    // Act
    field.setFlags((short) 1);

    // Assert
    assertFalse(field.isAutoIncrement());
  }

  @Test
  public void getFlagsTest() {
    // Arrange, Act and Assert
    assertEquals((short) 0, (new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).getFlags());
  }

  @Test
  public void setMysqlTypeTest() {
    // Arrange
    Field field = new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1);

    // Act
    field.setMysqlType(MysqlType.DECIMAL);

    // Assert
    assertEquals(MysqlType.DECIMAL, field.getMysqlType());
  }

  @Test
  public void getMysqlTypeTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlType.DECIMAL,
        (new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).getMysqlType());
  }

  @Test
  public void getCollationIndexTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).getCollationIndex());
  }

  @Test
  public void getValueNeedsQuotingTest() {
    // Arrange, Act and Assert
    assertFalse((new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).getValueNeedsQuoting());
  }

  @Test
  public void isSingleBitTest() {
    // Arrange, Act and Assert
    assertTrue((new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).isSingleBit());
  }

  @Test
  public void isZeroFillTest() {
    // Arrange, Act and Assert
    assertFalse((new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).isZeroFill());
  }

  @Test
  public void isUnsignedTest() {
    // Arrange, Act and Assert
    assertFalse((new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).isUnsigned());
  }

  @Test
  public void isUniqueKeyTest() {
    // Arrange, Act and Assert
    assertFalse((new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).isUniqueKey());
  }

  @Test
  public void isReadOnlyTest() {
    // Arrange, Act and Assert
    assertTrue((new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).isReadOnly());
  }

  @Test
  public void isFromFunctionTest() {
    // Arrange, Act and Assert
    assertTrue((new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).isFromFunction());
  }

  @Test
  public void isPrimaryKeyTest() {
    // Arrange, Act and Assert
    assertFalse((new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).isPrimaryKey());
  }

  @Test
  public void isNotNullTest() {
    // Arrange, Act and Assert
    assertFalse((new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).isNotNull());
  }

  @Test
  public void isMultipleKeyTest() {
    // Arrange, Act and Assert
    assertFalse((new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).isMultipleKey());
  }

  @Test
  public void setBlobTest() {
    // Arrange
    Field field = new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1);

    // Act
    field.setBlob();

    // Assert
    assertFalse(field.isAutoIncrement());
  }

  @Test
  public void isBlobTest() {
    // Arrange, Act and Assert
    assertFalse((new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).isBlob());
  }

  @Test
  public void setBinaryTest() {
    // Arrange
    Field field = new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1);

    // Act
    field.setBinary();

    // Assert
    assertFalse(field.isAutoIncrement());
  }

  @Test
  public void isBinaryTest() {
    // Arrange, Act and Assert
    assertFalse((new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).isBinary());
  }

  @Test
  public void isAutoIncrementTest() {
    // Arrange, Act and Assert
    assertFalse((new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).isAutoIncrement());
  }

  @Test
  public void getTableNameTest() {
    // Arrange, Act and Assert
    assertEquals(",flags=", (new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).getTableName());
  }

  @Test
  public void getJavaTypeTest() {
    // Arrange, Act and Assert
    assertEquals(3, (new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).getJavaType());
  }

  @Test
  public void getOriginalTableNameTest() {
    // Arrange, Act and Assert
    assertNull((new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).getOriginalTableName());
  }

  @Test
  public void getOriginalNameTest() {
    // Arrange, Act and Assert
    assertNull((new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).getOriginalName());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals(",flags=", (new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).getName());
  }

  @Test
  public void setMysqlTypeIdTest() {
    // Arrange
    Field field = new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1);

    // Act
    field.setMysqlTypeId(1);

    // Assert
    assertEquals(1, field.getMysqlTypeId());
  }

  @Test
  public void getMysqlTypeIdTest() {
    // Arrange, Act and Assert
    assertEquals(-1, (new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).getMysqlTypeId());
  }

  @Test
  public void getLengthTest() {
    // Arrange, Act and Assert
    assertEquals(1L, (new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).getLength());
  }

  @Test
  public void getFullNameTest() {
    // Arrange
    Field field = new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1);

    // Act and Assert
    assertEquals(",flags=.,flags=", field.getFullName());
    assertEquals(",flags=.,flags=", field.getFullName());
  }

  @Test
  public void getDecimalsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).getDecimals());
  }

  @Test
  public void getDatabaseNameTest() {
    // Arrange, Act and Assert
    assertNull((new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).getDatabaseName());
  }

  @Test
  public void getColumnLabelTest() {
    // Arrange, Act and Assert
    assertEquals(",flags=", (new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).getColumnLabel());
  }

  @Test
  public void setEncodingTest() {
    // Arrange
    Field field = new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1);

    // Act
    field.setEncoding(",flags=", ServerVersion.parseVersion(",flags="));

    // Assert
    String actualEncoding = field.getEncoding();
    assertEquals(",flags=", actualEncoding);
    assertEquals(0, field.getCollationIndex());
  }

  @Test
  public void getEncodingTest() {
    // Arrange, Act and Assert
    assertEquals("US-ASCII", (new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1)).getEncoding());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    Field actualField = new Field(",flags=", ",flags=", 1, ",flags=", MysqlType.DECIMAL, 1);

    // Assert
    String actualEncoding = actualField.getEncoding();
    MysqlType actualMysqlType = actualField.getMysqlType();
    String actualTableName = actualField.getTableName();
    int actualDecimals = actualField.getDecimals();
    String actualFullName = actualField.getFullName();
    String actualDatabaseName = actualField.getDatabaseName();
    String actualOriginalName = actualField.getOriginalName();
    String actualColumnLabel = actualField.getColumnLabel();
    boolean actualIsSingleBitResult = actualField.isSingleBit();
    String actualOriginalTableName = actualField.getOriginalTableName();
    int actualCollationIndex = actualField.getCollationIndex();
    int actualMysqlTypeId = actualField.getMysqlTypeId();
    assertEquals("US-ASCII", actualEncoding);
    assertFalse(actualField.isAutoIncrement());
    assertEquals(-1, actualMysqlTypeId);
    assertEquals(0, actualCollationIndex);
    assertNull(actualOriginalTableName);
    assertTrue(actualIsSingleBitResult);
    assertEquals(",flags=", actualColumnLabel);
    assertNull(actualOriginalName);
    assertNull(actualDatabaseName);
    assertEquals(",flags=.,flags=", actualFullName);
    assertEquals(0, actualDecimals);
    assertEquals(",flags=", actualTableName);
    assertEquals(MysqlType.DECIMAL, actualMysqlType);
  }

  @Test
  public void constructorTest() {
    // Arrange
    LazyString databaseName = new LazyString(",flags=");

    // Act
    Field actualField = new Field(databaseName, databaseName, new LazyString(",flags="), new LazyString(",flags="),
        null, 1L, 1, (short) 1, 1, 1, ",flags=", MysqlType.DECIMAL);

    // Assert
    String actualEncoding = actualField.getEncoding();
    MysqlType actualMysqlType = actualField.getMysqlType();
    String actualTableName = actualField.getTableName();
    int actualDecimals = actualField.getDecimals();
    String actualFullName = actualField.getFullName();
    String actualDatabaseName = actualField.getDatabaseName();
    String actualColumnLabel = actualField.getColumnLabel();
    boolean actualIsSingleBitResult = actualField.isSingleBit();
    String actualOriginalTableName = actualField.getOriginalTableName();
    int actualCollationIndex = actualField.getCollationIndex();
    int actualMysqlTypeId = actualField.getMysqlTypeId();
    assertEquals(",flags=", actualEncoding);
    assertFalse(actualField.isAutoIncrement());
    assertEquals(1, actualMysqlTypeId);
    assertEquals(1, actualCollationIndex);
    assertEquals(",flags=", actualOriginalTableName);
    assertTrue(actualIsSingleBitResult);
    assertEquals(",flags=", actualColumnLabel);
    assertEquals(",flags=", actualDatabaseName);
    assertEquals(",flags=.,flags=", actualFullName);
    assertEquals(1, actualDecimals);
    assertEquals(",flags=", actualTableName);
    assertEquals(MysqlType.DECIMAL, actualMysqlType);
  }
}
