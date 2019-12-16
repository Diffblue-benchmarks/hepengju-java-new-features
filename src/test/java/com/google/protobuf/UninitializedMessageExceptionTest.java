package com.google.protobuf;

import static org.junit.Assert.assertNull;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UninitializedMessageExceptionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void asInvalidProtocolBufferExceptionTest() {
    // Arrange, Act and Assert
    assertNull((new UninitializedMessageException((MessageLite) null)).asInvalidProtocolBufferException()
        .getUnfinishedMessage());
  }
  @Test
  public void getMissingFieldsTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new UninitializedMessageException((MessageLite) null)).getMissingFields();
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new UninitializedMessageException((List<String>) null);
  }
}
