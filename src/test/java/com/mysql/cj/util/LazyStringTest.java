package com.mysql.cj.util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LazyStringTest {
  @Test
  public void getTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new LazyString("aaaaa")).get());
  }

  @Test
  public void lengthTest() {
    // Arrange, Act and Assert
    assertEquals(5, (new LazyString("aaaaa")).length());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new LazyString("aaaaa")).toString());
  }

  @Test
  public void constructorTest3() {
    // Arrange, Act and Assert
    assertEquals("\u0000", (new LazyString(new byte[24], 1, 1)).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals(1, (new LazyString(new byte[24], 1, 1, "aaaaa")).length());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new LazyString("aaaaa")).toString());
  }
}
