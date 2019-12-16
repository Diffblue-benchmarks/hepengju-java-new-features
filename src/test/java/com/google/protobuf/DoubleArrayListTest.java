package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DoubleArrayListTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DoubleArrayList()).size());
  }

  @Test
  public void emptyListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DoubleArrayList.emptyList().size());
  }
}
