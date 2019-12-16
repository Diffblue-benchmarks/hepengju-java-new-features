package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProtobufArrayListTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ProtobufArrayList<Object>()).size());
  }

  @Test
  public void emptyListTest() {
    // Arrange, Act and Assert
    assertEquals(0, ProtobufArrayList.<Object>emptyList().size());
  }
}
