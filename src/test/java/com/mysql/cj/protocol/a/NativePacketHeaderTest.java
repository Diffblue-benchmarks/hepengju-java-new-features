package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NativePacketHeaderTest {
  @Test
  public void getMessageSequenceTest() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, (new NativePacketHeader()).getMessageSequence());
  }

  @Test
  public void getMessageSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NativePacketHeader()).getMessageSize());
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, (new NativePacketHeader(new byte[24])).getMessageSequence());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, (new NativePacketHeader()).getMessageSequence());
  }
}
