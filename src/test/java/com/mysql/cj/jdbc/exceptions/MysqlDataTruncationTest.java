package com.mysql.cj.jdbc.exceptions;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MysqlDataTruncationTest {
  @Test
  public void getMessageTest() {
    // Arrange, Act and Assert
    assertEquals("Data truncation: aaaaa", (new MysqlDataTruncation("aaaaa", 1, true, true, 1, 1, 1)).getMessage());
  }

  @Test
  public void getErrorCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new MysqlDataTruncation("aaaaa", 1, true, true, 1, 1, 1)).getErrorCode());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    MysqlDataTruncation actualMysqlDataTruncation = new MysqlDataTruncation("aaaaa", 1, true, true, 1, 1, 1);

    // Assert
    int actualErrorCode = actualMysqlDataTruncation.getErrorCode();
    assertEquals(1, actualErrorCode);
    assertEquals("Data truncation: aaaaa", actualMysqlDataTruncation.getMessage());
  }
}
