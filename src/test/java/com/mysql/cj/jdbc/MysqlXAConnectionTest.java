package com.mysql.cj.jdbc;

import java.sql.SQLException;
import javax.transaction.xa.XAException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysqlXAConnectionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void mapXAExceptionFromSQLExceptionTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlXAConnection.mapXAExceptionFromSQLException(null);
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new MysqlXAConnection(new ConnectionImpl(), true);
  }
  @Test
  public void getInstanceTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlXAConnection.getInstance(new ConnectionImpl(), true);
  }
}
