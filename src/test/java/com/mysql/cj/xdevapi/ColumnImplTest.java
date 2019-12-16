package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.MysqlType;
import com.mysql.cj.result.Field;
import org.junit.Test;

public class ColumnImplTest {
  @Test
  public void isPartKeyTest() {
    // Arrange, Act and Assert
    assertFalse((new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).isPartKey());
  }

  @Test
  public void isUniqueKeyTest() {
    // Arrange, Act and Assert
    assertFalse((new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).isUniqueKey());
  }

  @Test
  public void isPrimaryKeyTest() {
    // Arrange, Act and Assert
    assertFalse((new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).isPrimaryKey());
  }

  @Test
  public void isAutoIncrementTest() {
    // Arrange, Act and Assert
    assertFalse((new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).isAutoIncrement());
  }

  @Test
  public void isNullableTest() {
    // Arrange, Act and Assert
    assertTrue((new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).isNullable());
  }

  @Test
  public void isPaddedTest() {
    // Arrange, Act and Assert
    assertFalse((new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).isPadded());
  }

  @Test
  public void getCharacterSetNameTest() {
    // Arrange, Act and Assert
    assertNull((new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).getCharacterSetName());
  }

  @Test
  public void getCollationNameTest() {
    // Arrange, Act and Assert
    assertNull((new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).getCollationName());
  }

  @Test
  public void isNumberSignedTest() {
    // Arrange, Act and Assert
    assertTrue((new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).isNumberSigned());
  }

  @Test
  public void getFractionalDigitsTest() {
    // Arrange, Act and Assert
    assertEquals(0,
        (new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).getFractionalDigits());
  }

  @Test
  public void getLengthTest() {
    // Arrange, Act and Assert
    assertEquals(1L, (new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).getLength());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals(Type.DECIMAL,
        (new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).getType());
  }

  @Test
  public void getColumnLabelTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa",
        (new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).getColumnLabel());
  }

  @Test
  public void getColumnNameTest() {
    // Arrange, Act and Assert
    assertNull((new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).getColumnName());
  }

  @Test
  public void getTableLabelTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa",
        (new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).getTableLabel());
  }

  @Test
  public void getTableNameTest() {
    // Arrange, Act and Assert
    assertNull((new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).getTableName());
  }

  @Test
  public void getSchemaNameTest() {
    // Arrange, Act and Assert
    assertNull((new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).getSchemaName());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertFalse((new ColumnImpl(new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1))).isPartKey());
  }
}
