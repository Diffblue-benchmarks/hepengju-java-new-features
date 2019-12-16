package com.google.protobuf;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MessageLiteToStringTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MessageLiteToString.toString(null, "");
  }
}
