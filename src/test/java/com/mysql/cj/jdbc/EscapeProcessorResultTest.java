package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class EscapeProcessorResultTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    EscapeProcessorResult actualEscapeProcessorResult = new EscapeProcessorResult();

    // Assert
    assertFalse(actualEscapeProcessorResult.callingStoredFunction);
    assertEquals((byte) 0, actualEscapeProcessorResult.usesVariables);
  }
}
