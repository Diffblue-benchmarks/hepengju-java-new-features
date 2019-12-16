package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MysqlErrorNumbersTest {
  @Test
  public void mysqlToSqlStateTest() {
    // Arrange, Act and Assert
    assertEquals("HY000", MysqlErrorNumbers.mysqlToSqlState(1));
  }

  @Test
  public void mysqlToSql99Test() {
    // Arrange, Act and Assert
    assertEquals("HY000", MysqlErrorNumbers.mysqlToSql99(1));
  }

  @Test
  public void getTest() {
    // Arrange, Act and Assert
    assertEquals("Deadlock found when trying to get lock; Try restarting transaction", MysqlErrorNumbers.get("40001"));
  }
}
