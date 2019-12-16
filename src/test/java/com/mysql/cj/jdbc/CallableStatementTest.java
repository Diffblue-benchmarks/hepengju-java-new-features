package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.MysqlType;
import java.sql.SQLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CallableStatementTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest2() {
    // Arrange and Act
    CallableStatement.CallableStatementParam actualCallableStatementParam = new CallableStatement.CallableStatementParam(
        "aaaaa", 1, true, true, 1, "aaaaa", 1, 1, (short) 1, 1);

    // Assert
    assertEquals(MysqlType.UNKNOWN, actualCallableStatementParam.desiredMysqlType);
    assertEquals(1, actualCallableStatementParam.inOutModifier);
    assertEquals(1, actualCallableStatementParam.precision);
    assertEquals((short) 1, actualCallableStatementParam.nullability);
    assertEquals(1, actualCallableStatementParam.jdbcType);
    assertEquals("aaaaa", actualCallableStatementParam.paramName);
    assertEquals(1, actualCallableStatementParam.scale);
    assertTrue(actualCallableStatementParam.isOut);
    assertEquals(1, actualCallableStatementParam.index);
    assertEquals("aaaaa", actualCallableStatementParam.typeName);
    assertTrue(actualCallableStatementParam.isIn);
  }
  @Test
  public void constructorTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new CallableStatement(new ConnectionImpl(), "", "", true);
  }
  @Test
  public void getInstanceTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    CallableStatement.getInstance(new ConnectionImpl(), "", "", true);
  }
}
