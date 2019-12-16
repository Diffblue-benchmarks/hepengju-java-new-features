package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntArrayListTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new IntArrayList()).size());
  }

  @Test
  public void emptyListTest() {
    // Arrange, Act and Assert
    assertEquals(0, IntArrayList.emptyList().size());
  }
}
