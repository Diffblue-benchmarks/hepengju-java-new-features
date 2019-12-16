package com.mysql.cj.log;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class Slf4JLoggerTest {
  @Test
  public void isWarnEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new Slf4JLogger("aaaaa")).isWarnEnabled());
  }

  @Test
  public void isTraceEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new Slf4JLogger("aaaaa")).isTraceEnabled());
  }

  @Test
  public void isInfoEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new Slf4JLogger("aaaaa")).isInfoEnabled());
  }

  @Test
  public void isFatalEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new Slf4JLogger("aaaaa")).isFatalEnabled());
  }

  @Test
  public void isErrorEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new Slf4JLogger("aaaaa")).isErrorEnabled());
  }

  @Test
  public void isDebugEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new Slf4JLogger("aaaaa")).isDebugEnabled());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertFalse((new Slf4JLogger("aaaaa")).isTraceEnabled());
  }
}
