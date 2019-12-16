package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertSame;
import com.mysql.cj.log.Jdk14Logger;
import com.mysql.cj.log.Log;
import com.mysql.cj.protocol.MessageSender;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TracingPacketSenderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void undecorateTest() {
    // Arrange
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "aaaaa", 1L);
    Jdk14Logger jdk14Logger = new Jdk14Logger("aaaaa");
    TracingPacketSender tracingPacketSender = new TracingPacketSender(
        new TracingPacketSender(packetSender, jdk14Logger, "aaaaa", 1L), null, "aaaaa", 1L);

    // Act and Assert
    assertSame(tracingPacketSender,
        (new TracingPacketSender(tracingPacketSender, jdk14Logger, "aaaaa", 1L)).undecorate());
  }

  @Test
  public void undecorateAllTest() {
    // Arrange
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "aaaaa", 1L);
    Jdk14Logger jdk14Logger = new Jdk14Logger("aaaaa");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new TracingPacketSender(
        new TracingPacketSender(new TracingPacketSender(packetSender, jdk14Logger, "aaaaa", 1L), null, "aaaaa", 1L),
        jdk14Logger, "aaaaa", 1L)).undecorateAll();
  }

  @Test
  public void sendTest() throws IOException {
    // Arrange
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "aaaaa", 1L);
    Jdk14Logger jdk14Logger = new Jdk14Logger("aaaaa");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new TracingPacketSender(
        new TracingPacketSender(new TracingPacketSender(packetSender, jdk14Logger, "aaaaa", 1L), null, "aaaaa", 1L),
        jdk14Logger, "aaaaa", 1L)).send(new byte[24], 1, (byte) 0);
  }

  @Test
  public void constructorTest() {
    // Arrange
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "aaaaa", 1L);
    Jdk14Logger jdk14Logger = new Jdk14Logger("aaaaa");
    TracingPacketSender tracingPacketSender = new TracingPacketSender(
        new TracingPacketSender(new TracingPacketSender(packetSender, jdk14Logger, "aaaaa", 1L), null, "aaaaa", 1L),
        jdk14Logger, "aaaaa", 1L);

    // Act and Assert
    assertSame(tracingPacketSender,
        (new TracingPacketSender(tracingPacketSender, new Jdk14Logger("aaaaa"), "aaaaa", 1L)).undecorate());
  }
}
