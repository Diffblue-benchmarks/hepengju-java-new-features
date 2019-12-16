package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FloatArrayListTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FloatArrayList()).size());
  }

  @Test
  public void emptyListTest() {
    // Arrange, Act and Assert
    assertEquals(0, FloatArrayList.emptyList().size());
  }
}
