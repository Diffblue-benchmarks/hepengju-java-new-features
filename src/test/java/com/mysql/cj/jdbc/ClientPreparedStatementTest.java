package com.mysql.cj.jdbc;

import com.mysql.cj.ParseInfo;
import java.sql.SQLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ClientPreparedStatementTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest3() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new ClientPreparedStatement(new ConnectionImpl(), "'\"", "'\"", null);
  }
  @Test
  public void constructorTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new ClientPreparedStatement(new ConnectionImpl(), "'\"", "'\"");
  }
  @Test
  public void constructorTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new ClientPreparedStatement(new ConnectionImpl(), "'\"");
  }
  @Test
  public void getInstanceTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    ClientPreparedStatement.getInstance(new ConnectionImpl(), "'\"", "'\"", null);
  }
  @Test
  public void getInstanceTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    ClientPreparedStatement.getInstance(new ConnectionImpl(), "'\"", "'\"");
  }
}
