package com.mysql.cj.jdbc;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class AbandonedConnectionCleanupThreadTest {
  @Test
  public void isAliveTest() {
    // Arrange, Act and Assert
    assertFalse(AbandonedConnectionCleanupThread.isAlive());
  }
}
