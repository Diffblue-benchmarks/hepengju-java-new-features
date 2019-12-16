package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class XMessageHeaderTest {
  @Test
  public void getMessageTypeTest() {
    // Arrange
    XMessageHeader xMessageHeader = new XMessageHeader();

    // Act and Assert
    assertEquals(0, xMessageHeader.getMessageType());
    int actualMessageSize = xMessageHeader.getMessageSize();
    assertEquals(0, xMessageHeader.getMessageType());
    assertEquals(-1, actualMessageSize);
  }

  @Test
  public void getMessageSequenceTest() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, (new XMessageHeader()).getMessageSequence());
  }

  @Test
  public void getMessageSizeTest() {
    // Arrange
    XMessageHeader xMessageHeader = new XMessageHeader();

    // Act and Assert
    assertEquals(-1, xMessageHeader.getMessageSize());
    int actualMessageSize = xMessageHeader.getMessageSize();
    assertEquals(0, xMessageHeader.getMessageType());
    assertEquals(-1, actualMessageSize);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    XMessageHeader actualXMessageHeader = new XMessageHeader(new byte[24]);

    // Assert
    int actualMessageSize = actualXMessageHeader.getMessageSize();
    assertEquals(0, actualXMessageHeader.getMessageType());
    assertEquals(-1, actualMessageSize);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    XMessageHeader actualXMessageHeader = new XMessageHeader();

    // Assert
    int actualMessageSize = actualXMessageHeader.getMessageSize();
    assertEquals(0, actualXMessageHeader.getMessageType());
    assertEquals(-1, actualMessageSize);
  }
}
