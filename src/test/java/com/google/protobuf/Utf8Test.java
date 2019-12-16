package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Utf8Test {
  @Test
  public void isAvailableTest() {
    // Arrange, Act and Assert
    assertFalse(Utf8.UnsafeProcessor.isAvailable());
  }

  @Test
  public void decodeUtf8Test() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    assertEquals("\u0000", Utf8.decodeUtf8(new byte[24], 1, 1));
  }

  @Test
  public void partialIsValidUtf8Test() {
    // Arrange, Act and Assert
    assertEquals(1, Utf8.partialIsValidUtf8(1, new byte[24], 1, 1));
  }

  @Test
  public void isValidUtf8Test2() {
    // Arrange, Act and Assert
    assertTrue(Utf8.isValidUtf8(new byte[24], 1, 1));
  }

  @Test
  public void isValidUtf8Test() {
    // Arrange, Act and Assert
    assertTrue(Utf8.isValidUtf8(new byte[24]));
  }
}
