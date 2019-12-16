package com.mysql.cj.jdbc;

import java.sql.SQLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ServerPreparedStatementTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new ServerPreparedStatement(new ConnectionImpl(), "ServerPreparedStatement.26", "ServerPreparedStatement.26", 1, 1);
  }
  @Test
  public void getInstanceTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    ServerPreparedStatement.getInstance(new ConnectionImpl(), "ServerPreparedStatement.26",
        "ServerPreparedStatement.26", 1, 1);
  }
}
