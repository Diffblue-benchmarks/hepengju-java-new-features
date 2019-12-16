package com.google.protobuf;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class IterableByteBufferInputStreamTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new IterableByteBufferInputStream(null);
  }
}
