package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JsonStringTest {
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("\"\"", (new JsonString()).toString());
  }

  @Test
  public void setValueTest() {
    // Arrange, Act and Assert
    assertEquals("", (new JsonString()).setValue("").getString());
  }

  @Test
  public void getStringTest() {
    // Arrange, Act and Assert
    assertEquals("", (new JsonString()).getString());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("", (new JsonString()).getString());
  }
}
