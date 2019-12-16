package com.mysql.cj.jdbc.result;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.MysqlType;
import com.mysql.cj.MysqlxSession;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.result.Field;
import java.sql.SQLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResultSetMetaDataTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getFieldsTest() {
    // Arrange, Act and Assert
    assertEquals(3,
        (new ResultSetMetaData(null,
            new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
            true, true, null)).getFields().length);
  }

  @Test
  public void unwrapTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultSetMetaData(null,
        new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
        true, true, null)).<Object>unwrap(null);
  }

  @Test
  public void isWrapperForTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultSetMetaData(null,
        new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
        true, true, null)).isWrapperFor(null);
  }

  @Test
  public void isWritableTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new ResultSetMetaData(null,
        new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
        true, true, null)).isWritable(1));
  }

  @Test
  public void isSignedTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new ResultSetMetaData(null,
        new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
        true, true, null)).isSigned(1));
  }

  @Test
  public void isSearchableTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new ResultSetMetaData(null,
        new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
        true, true, null)).isSearchable(1));
  }

  @Test
  public void isReadOnlyTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new ResultSetMetaData(null,
        new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
        true, true, null)).isReadOnly(1));
  }

  @Test
  public void isNullableTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(1,
        (new ResultSetMetaData(null,
            new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
            true, true, null)).isNullable(1));
  }

  @Test
  public void isDefinitelyWritableTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new ResultSetMetaData(null,
        new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
        true, true, null)).isDefinitelyWritable(1));
  }

  @Test
  public void isCurrencyTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new ResultSetMetaData(null,
        new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
        true, true, null)).isCurrency(1));
  }

  @Test
  public void isCaseSensitiveTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new ResultSetMetaData(null,
        new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
        true, true, null)).isCaseSensitive(1));
  }

  @Test
  public void isAutoIncrementTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new ResultSetMetaData(null,
        new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
        true, true, null)).isAutoIncrement(1));
  }

  @Test
  public void getTableNameTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("_ci",
        (new ResultSetMetaData(null,
            new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
            true, true, null)).getTableName(1));
  }

  @Test
  public void getSchemaNameTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultSetMetaData(null,
        new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
        true, true, null)).getSchemaName(1);
  }

  @Test
  public void getScaleTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0,
        (new ResultSetMetaData(null,
            new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
            true, true, null)).getScale(1));
  }

  @Test
  public void getPrecisionAdjustFactorTest() {
    // Arrange
    Field field = new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1);

    // Act and Assert
    assertEquals(0, (new ResultSetMetaData(null, new Field[]{field, field, field}, true, true, null))
        .getPrecisionAdjustFactor(field));
  }

  @Test
  public void getPrecisionTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(1,
        (new ResultSetMetaData(null,
            new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
            true, true, null)).getPrecision(1));
  }

  @Test
  public void getFieldTest() throws SQLException {
    // Arrange
    Field field = new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1);

    // Act and Assert
    assertSame(field, (new ResultSetMetaData(null, new Field[]{field, field, field}, true, true, null)).getField(1));
  }

  @Test
  public void getColumnTypeNameTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("DECIMAL",
        (new ResultSetMetaData(null,
            new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
            true, true, null)).getColumnTypeName(1));
  }

  @Test
  public void getColumnTypeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(3,
        (new ResultSetMetaData(null,
            new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
            true, true, null)).getColumnType(1));
  }

  @Test
  public void getColumnNameTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("_ci",
        (new ResultSetMetaData(null,
            new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
            true, true, null)).getColumnName(1));
  }

  @Test
  public void getColumnLabelTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("_ci",
        (new ResultSetMetaData(null,
            new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
            true, true, null)).getColumnLabel(1));
  }

  @Test
  public void getColumnDisplaySizeTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultSetMetaData(null,
        new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
        true, true, null)).getColumnDisplaySize(1);
  }

  @Test
  public void getColumnCountTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(3,
        (new ResultSetMetaData(null,
            new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
            true, true, null)).getColumnCount());
  }

  @Test
  public void getColumnClassNameTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("java.math.BigDecimal",
        (new ResultSetMetaData(null,
            new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
            true, true, null)).getColumnClassName(1));
  }

  @Test
  public void getColumnCharacterSetTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultSetMetaData(null,
        new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
        true, true, null)).getColumnCharacterSet(1);
  }

  @Test
  public void getColumnCharacterEncodingTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("US-ASCII",
        (new ResultSetMetaData(null,
            new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
                new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
            true, true, null)).getColumnCharacterEncoding(1));
  }

  @Test
  public void getCatalogNameTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultSetMetaData(null,
        new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1),
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
        true, true, null)).getCatalogName(1);
  }

  @Test
  public void constructorTest() throws SQLException {
    // Arrange and Act
    ResultSetMetaData actualResultSetMetaData = new ResultSetMetaData(null,
        new Field[]{new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1), null,
            new Field("_ci", "_ci", 1, "_ci", MysqlType.DECIMAL, 1)},
        true, true, null);

    // Assert
    assertEquals(3, actualResultSetMetaData.getColumnCount());
    assertTrue(actualResultSetMetaData.treatYearAsDate);
    assertTrue(actualResultSetMetaData.useOldAliasBehavior);
  }
}
