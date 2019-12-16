package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class UnsafeByteOperationsTest {
  @Test
  public void unsafeWrapTest() {
    // Arrange and Act
    ByteString actualUnsafeWrapResult = UnsafeByteOperations.unsafeWrap(new byte[24], 1, 1);

    // Assert
    String actualToStringUtf8Result = actualUnsafeWrapResult.toStringUtf8();
    assertFalse(actualUnsafeWrapResult.isEmpty());
    assertEquals("\u0000", actualToStringUtf8Result);
  }
}
