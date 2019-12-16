package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.mysql.cj.log.Jdk14Logger;
import com.mysql.cj.log.Log;
import com.mysql.cj.protocol.MessageSender;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TimeTrackingPacketSenderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void undecorateTest() {
    // Arrange
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "aaaaa", 1L);
    TracingPacketSender tracingPacketSender = new TracingPacketSender(
        new TracingPacketSender(packetSender, new Jdk14Logger("aaaaa"), "aaaaa", 1L), null, "aaaaa", 1L);

    // Act and Assert
    assertSame(tracingPacketSender, (new TimeTrackingPacketSender(tracingPacketSender)).undecorate());
  }

  @Test
  public void undecorateAllTest() {
    // Arrange
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "aaaaa", 1L);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new TimeTrackingPacketSender(new TracingPacketSender(
        new TracingPacketSender(packetSender, new Jdk14Logger("aaaaa"), "aaaaa", 1L), null, "aaaaa", 1L)))
            .undecorateAll();
  }

  @Test
  public void getPreviousPacketSentTimeTest() {
    // Arrange
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "aaaaa", 1L);

    // Act and Assert
    assertEquals(0L,
        (new TimeTrackingPacketSender(new TracingPacketSender(
            new TracingPacketSender(packetSender, new Jdk14Logger("aaaaa"), "aaaaa", 1L), null, "aaaaa", 1L)))
                .getPreviousPacketSentTime());
  }

  @Test
  public void getLastPacketSentTimeTest() {
    // Arrange
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "aaaaa", 1L);

    // Act and Assert
    assertEquals(0L,
        (new TimeTrackingPacketSender(new TracingPacketSender(
            new TracingPacketSender(packetSender, new Jdk14Logger("aaaaa"), "aaaaa", 1L), null, "aaaaa", 1L)))
                .getLastPacketSentTime());
  }

  @Test
  public void sendTest() throws IOException {
    // Arrange
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "aaaaa", 1L);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new TimeTrackingPacketSender(new TracingPacketSender(
        new TracingPacketSender(packetSender, new Jdk14Logger("aaaaa"), "aaaaa", 1L), null, "aaaaa", 1L)))
            .send(new byte[24], 1, (byte) 0);
  }

  @Test
  public void constructorTest() {
    // Arrange
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "aaaaa", 1L);
    Jdk14Logger jdk14Logger = new Jdk14Logger("aaaaa");
    TracingPacketSender tracingPacketSender = new TracingPacketSender(
        new TracingPacketSender(new TracingPacketSender(packetSender, jdk14Logger, "aaaaa", 1L), null, "aaaaa", 1L),
        jdk14Logger, "aaaaa", 1L);

    // Act
    TimeTrackingPacketSender actualTimeTrackingPacketSender = new TimeTrackingPacketSender(tracingPacketSender);

    // Assert
    MessageSender<NativePacketPayload> actualUndecorateResult = actualTimeTrackingPacketSender.undecorate();
    long actualLastPacketSentTime = actualTimeTrackingPacketSender.getLastPacketSentTime();
    assertSame(tracingPacketSender, actualUndecorateResult);
    assertEquals(0L, actualTimeTrackingPacketSender.getPreviousPacketSentTime());
    assertEquals(0L, actualLastPacketSentTime);
  }
}
