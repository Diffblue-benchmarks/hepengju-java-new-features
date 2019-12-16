package com.mysql.cj.log;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StandardLoggerTest {
  @Test
  public void logInternalTest() {
    // Arrange, Act and Assert
    assertEquals("Mon Dec 16 16:59:03 GMT 2019 ERROR: aaaaa",
        (new StandardLogger("aaaaa")).logInternal(1, "aaaaa", null));
  }

  @Test
  public void isWarnEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new StandardLogger("aaaaa")).isWarnEnabled());
  }

  @Test
  public void isTraceEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new StandardLogger("aaaaa")).isTraceEnabled());
  }

  @Test
  public void isInfoEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new StandardLogger("aaaaa")).isInfoEnabled());
  }

  @Test
  public void isFatalEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new StandardLogger("aaaaa")).isFatalEnabled());
  }

  @Test
  public void isErrorEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new StandardLogger("aaaaa")).isErrorEnabled());
  }

  @Test
  public void isDebugEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new StandardLogger("aaaaa")).isDebugEnabled());
  }
}
