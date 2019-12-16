package com.mysql.cj.log;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class NullLoggerTest {
  @Test
  public void isWarnEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new NullLogger("aaaaa")).isWarnEnabled());
  }

  @Test
  public void isTraceEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new NullLogger("aaaaa")).isTraceEnabled());
  }

  @Test
  public void isInfoEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new NullLogger("aaaaa")).isInfoEnabled());
  }

  @Test
  public void isFatalEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new NullLogger("aaaaa")).isFatalEnabled());
  }

  @Test
  public void isErrorEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new NullLogger("aaaaa")).isErrorEnabled());
  }

  @Test
  public void isDebugEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new NullLogger("aaaaa")).isDebugEnabled());
  }
}
