package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PacketSplitterTest {
  @Test
  public void nextPacketTest() {
    // Arrange
    PacketSplitter packetSplitter = new PacketSplitter(1);

    // Act and Assert
    assertTrue(packetSplitter.nextPacket());
    int actualPacketLen = packetSplitter.getPacketLen();
    assertEquals(1, actualPacketLen);
    assertEquals(0, packetSplitter.getOffset());
  }

  @Test
  public void getOffsetTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PacketSplitter(1)).getOffset());
  }

  @Test
  public void getPacketLenTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PacketSplitter(1)).getPacketLen());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    PacketSplitter actualPacketSplitter = new PacketSplitter(1);

    // Assert
    int actualPacketLen = actualPacketSplitter.getPacketLen();
    assertEquals(0, actualPacketLen);
    assertEquals(0, actualPacketSplitter.getOffset());
  }
}
