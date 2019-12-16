package com.mysql.cj.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class EscapeTokenizerTest {
  @Test
  public void sawVariableUseTest() {
    // Arrange, Act and Assert
    assertFalse((new EscapeTokenizer("{")).sawVariableUse());
  }

  @Test
  public void nextTokenTest() {
    // Arrange
    EscapeTokenizer escapeTokenizer = new EscapeTokenizer("{");

    // Act and Assert
    assertEquals("", escapeTokenizer.nextToken());
    assertFalse(escapeTokenizer.hasMoreTokens());
  }

  @Test
  public void hasMoreTokensTest() {
    // Arrange, Act and Assert
    assertTrue((new EscapeTokenizer("{")).hasMoreTokens());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new EscapeTokenizer("{")).hasMoreTokens());
  }
}
