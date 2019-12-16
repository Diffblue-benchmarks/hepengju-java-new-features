package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LongArrayListTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new LongArrayList()).size());
  }

  @Test
  public void emptyListTest() {
    // Arrange, Act and Assert
    assertEquals(0, LongArrayList.emptyList().size());
  }
}
