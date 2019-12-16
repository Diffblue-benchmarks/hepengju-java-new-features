package com.mysql.cj.util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DataTypeUtilTest {
  @Test
  public void bitToLongTest() {
    // Arrange, Act and Assert
    assertEquals(0L, DataTypeUtil.bitToLong(new byte[24], 1, 1));
  }
}
