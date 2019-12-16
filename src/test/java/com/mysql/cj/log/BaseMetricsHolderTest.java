package com.mysql.cj.log;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class BaseMetricsHolderTest {
  @Test
  public void checkAbonormallyLongQueryTest() {
    // Arrange, Act and Assert
    assertFalse((new BaseMetricsHolder()).checkAbonormallyLongQuery(1L));
  }
}
