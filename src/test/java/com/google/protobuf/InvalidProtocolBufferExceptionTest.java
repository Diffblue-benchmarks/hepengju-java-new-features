package com.google.protobuf;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class InvalidProtocolBufferExceptionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest4() {
    // Arrange, Act and Assert
    assertNull((new InvalidProtocolBufferException.InvalidWireTypeException("aaaaa")).getUnfinishedMessage());
  }

  @Test
  public void invalidUtf8Test() {
    // Arrange, Act and Assert
    assertNull(InvalidProtocolBufferException.invalidUtf8().getUnfinishedMessage());
  }

  @Test
  public void parseFailureTest() {
    // Arrange, Act and Assert
    assertNull(InvalidProtocolBufferException.parseFailure().getUnfinishedMessage());
  }

  @Test
  public void sizeLimitExceededTest() {
    // Arrange, Act and Assert
    assertNull(InvalidProtocolBufferException.sizeLimitExceeded().getUnfinishedMessage());
  }

  @Test
  public void recursionLimitExceededTest() {
    // Arrange, Act and Assert
    assertNull(InvalidProtocolBufferException.recursionLimitExceeded().getUnfinishedMessage());
  }

  @Test
  public void invalidWireTypeTest() {
    // Arrange, Act and Assert
    assertNull(InvalidProtocolBufferException.invalidWireType().getUnfinishedMessage());
  }

  @Test
  public void invalidEndTagTest() {
    // Arrange, Act and Assert
    assertNull(InvalidProtocolBufferException.invalidEndTag().getUnfinishedMessage());
  }

  @Test
  public void invalidTagTest() {
    // Arrange, Act and Assert
    assertNull(InvalidProtocolBufferException.invalidTag().getUnfinishedMessage());
  }

  @Test
  public void malformedVarintTest() {
    // Arrange, Act and Assert
    assertNull(InvalidProtocolBufferException.malformedVarint().getUnfinishedMessage());
  }

  @Test
  public void negativeSizeTest() {
    // Arrange, Act and Assert
    assertNull(InvalidProtocolBufferException.negativeSize().getUnfinishedMessage());
  }

  @Test
  public void truncatedMessageTest() {
    // Arrange, Act and Assert
    assertNull(InvalidProtocolBufferException.truncatedMessage().getUnfinishedMessage());
  }

  @Test
  public void unwrapIOExceptionTest() {
    // Arrange, Act and Assert
    assertTrue(
        InvalidProtocolBufferException.parseFailure().unwrapIOException() instanceof InvalidProtocolBufferException);
  }

  @Test
  public void getUnfinishedMessageTest() {
    // Arrange, Act and Assert
    assertNull(InvalidProtocolBufferException.parseFailure().getUnfinishedMessage());
  }

  @Test
  public void setUnfinishedMessageTest() {
    // Arrange, Act and Assert
    assertNull(InvalidProtocolBufferException.parseFailure().setUnfinishedMessage(null).getUnfinishedMessage());
  }

  @Test
  public void constructorTest3() {
    // Arrange, Act and Assert
    assertNull((new InvalidProtocolBufferException("aaaaa", null)).getUnfinishedMessage());
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new InvalidProtocolBufferException((IOException) null);
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new InvalidProtocolBufferException("aaaaa")).getUnfinishedMessage());
  }
}
