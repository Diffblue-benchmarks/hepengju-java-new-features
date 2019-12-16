package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BooleanArrayListTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new BooleanArrayList()).size());
  }

  @Test
  public void emptyListTest() {
    // Arrange, Act and Assert
    assertEquals(0, BooleanArrayList.emptyList().size());
  }
}
