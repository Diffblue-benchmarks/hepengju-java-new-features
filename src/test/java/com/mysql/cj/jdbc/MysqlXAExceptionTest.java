package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MysqlXAExceptionTest {
  @Test
  public void constructorTest2() {
    // Arrange and Act
    MysqlXAException actualMysqlXAException = new MysqlXAException("aaaaa", "aaaaa");

    // Assert
    assertEquals("aaaaa", actualMysqlXAException.getMessage());
    assertEquals("aaaaa", actualMysqlXAException.xidAsString);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    MysqlXAException actualMysqlXAException = new MysqlXAException(1, "aaaaa", "aaaaa");

    // Assert
    assertEquals("aaaaa", actualMysqlXAException.getMessage());
    assertEquals("aaaaa", actualMysqlXAException.xidAsString);
  }
}
