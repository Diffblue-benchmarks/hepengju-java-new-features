package com.mysql.cj.util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LogUtilsTest {
  @Test
  public void findCallingClassAndMethodTest() {
    // Arrange, Act and Assert
    assertEquals("at Caller information not available", LogUtils.findCallingClassAndMethod(null));
  }
}
