package com.mysql.cj.util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SequentialIdLeaseTest {
  @Test
  public void allocateSequentialIdTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new SequentialIdLease()).allocateSequentialId());
  }
}
