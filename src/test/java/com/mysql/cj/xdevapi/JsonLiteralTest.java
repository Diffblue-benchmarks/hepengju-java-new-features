package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JsonLiteralTest {
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("true", JsonLiteral.TRUE.toString());
  }
}
