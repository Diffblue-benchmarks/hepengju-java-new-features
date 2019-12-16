package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import java.sql.SQLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysqlSavepointTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getSavepointIdTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new MysqlSavepoint(null)).getSavepointId();
  }

  @Test
  public void constructorTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new MysqlSavepoint("aaaaa", null)).getSavepointName());
  }
}
