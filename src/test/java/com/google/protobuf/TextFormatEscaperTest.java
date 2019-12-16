package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TextFormatEscaperTest {
  @Test
  public void escapeDoubleQuotesAndBackslashesTest() {
    // Arrange, Act and Assert
    assertEquals("\\\\\\\"", TextFormatEscaper.escapeDoubleQuotesAndBackslashes("\\\""));
  }

  @Test
  public void escapeTextTest() {
    // Arrange, Act and Assert
    assertEquals("\\\\\\\"", TextFormatEscaper.escapeText("\\\""));
  }

  @Test
  public void escapeBytesTest() {
    // Arrange, Act and Assert
    assertEquals(
        "\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000",
        TextFormatEscaper.escapeBytes(new byte[24]));
  }
}
