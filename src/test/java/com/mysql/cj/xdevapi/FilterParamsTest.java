package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FilterParamsTest {
  @Test
  public void asNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(1, FilterParams.RowLockOptions.NOWAIT.asNumber());
  }

  @Test
  public void asNumberTest() {
    // Arrange, Act and Assert
    assertEquals(1, FilterParams.RowLock.SHARED_LOCK.asNumber());
  }
}
