package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import java.sql.SQLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StatementImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void findStartOfStatementTest() {
    // Arrange, Act and Assert
    assertEquals(0, StatementImpl.findStartOfStatement(""));
  }
  @Test
  public void constructorTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new StatementImpl(new ConnectionImpl(), "");
  }
}
