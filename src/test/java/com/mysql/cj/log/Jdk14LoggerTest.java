package com.mysql.cj.log;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Jdk14LoggerTest {
  @Test
  public void isWarnEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new Jdk14Logger("N/A")).isWarnEnabled());
  }

  @Test
  public void isTraceEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new Jdk14Logger("N/A")).isTraceEnabled());
  }

  @Test
  public void isInfoEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new Jdk14Logger("N/A")).isInfoEnabled());
  }

  @Test
  public void isFatalEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new Jdk14Logger("N/A")).isFatalEnabled());
  }

  @Test
  public void isErrorEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new Jdk14Logger("N/A")).isErrorEnabled());
  }

  @Test
  public void isDebugEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new Jdk14Logger("N/A")).isDebugEnabled());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertFalse((new Jdk14Logger("N/A")).isTraceEnabled());
  }
}
