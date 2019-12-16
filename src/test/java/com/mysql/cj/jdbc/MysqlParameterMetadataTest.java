package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.MysqlType;
import com.mysql.cj.MysqlxSession;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.result.Field;
import java.sql.SQLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysqlParameterMetadataTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void unwrapTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlParameterMetadata(1)).<Object>unwrap(null);
  }

  @Test
  public void isWrapperForTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlParameterMetadata(1)).isWrapperFor(null);
  }

  @Test
  public void getParameterModeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(1, (new MysqlParameterMetadata(1)).getParameterMode(1));
  }

  @Test
  public void getParameterClassNameTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("java.lang.String", (new MysqlParameterMetadata(1)).getParameterClassName(1));
  }

  @Test
  public void getParameterTypeNameTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("VARCHAR", (new MysqlParameterMetadata(1)).getParameterTypeName(1));
  }

  @Test
  public void getParameterTypeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(12, (new MysqlParameterMetadata(1)).getParameterType(1));
  }

  @Test
  public void getScaleTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0, (new MysqlParameterMetadata(1)).getScale(1));
  }

  @Test
  public void getPrecisionTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0, (new MysqlParameterMetadata(1)).getPrecision(1));
  }

  @Test
  public void isSignedTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlParameterMetadata(1)).isSigned(1));
  }

  @Test
  public void isNullableTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new MysqlParameterMetadata(1)).isNullable(1);
  }

  @Test
  public void getParameterCountTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(1, (new MysqlParameterMetadata(1)).getParameterCount());
  }

  @Test
  public void constructorTest2() throws SQLException {
    // Arrange and Act
    MysqlParameterMetadata actualMysqlParameterMetadata = new MysqlParameterMetadata(1);

    // Assert
    assertEquals(1, actualMysqlParameterMetadata.getParameterCount());
    assertTrue(actualMysqlParameterMetadata.returnSimpleMetadata);
    assertNull(actualMysqlParameterMetadata.metadata);
  }

  @Test
  public void constructorTest() throws SQLException {
    // Arrange and Act
    MysqlParameterMetadata actualMysqlParameterMetadata = new MysqlParameterMetadata(null,
        new Field[]{new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1), null,
            new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1)},
        1, null);

    // Assert
    assertEquals(1, actualMysqlParameterMetadata.getParameterCount());
    assertFalse(actualMysqlParameterMetadata.returnSimpleMetadata);
    assertEquals(3, actualMysqlParameterMetadata.metadata.getFields().length);
  }
}
