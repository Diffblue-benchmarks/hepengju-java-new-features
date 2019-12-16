package com.mysql.cj.jdbc;

import static org.junit.Assert.assertNull;
import com.mysql.cj.exceptions.ExceptionInterceptor;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysqlPooledConnectionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getExceptionInterceptorTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull(MysqlPooledConnection.getInstance(new ConnectionImpl()).getExceptionInterceptor());
  }

  @Test
  public void closeTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlPooledConnection.getInstance(new ConnectionImpl()).close();
  }

  @Test
  public void getConnectionTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlPooledConnection.getInstance(new ConnectionImpl()).getConnection(true, true);
  }

  @Test
  public void getConnectionTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlPooledConnection.getInstance(new ConnectionImpl()).getConnection();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new MysqlPooledConnection(new ConnectionImpl())).getExceptionInterceptor());
  }

  @Test
  public void getInstanceTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull(MysqlPooledConnection.getInstance(new ConnectionImpl()).getExceptionInterceptor());
  }
}
