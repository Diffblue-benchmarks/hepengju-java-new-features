package com.mysql.cj.protocol.x;

import com.google.protobuf.MessageLite;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MessageConstantsTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getTypeForMessageClassTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MessageConstants.getTypeForMessageClass(null);
  }
}
