package com.mysql.cj.jdbc.exceptions;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.log.Jdk14Logger;
import com.mysql.cj.protocol.a.MultiPacketReader;
import com.mysql.cj.protocol.a.TimeTrackingPacketReader;
import com.mysql.cj.protocol.a.TimeTrackingPacketSender;
import com.mysql.cj.protocol.a.TracingPacketSender;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CommunicationsExceptionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void setWasStreamingResultsTest() {
    // Arrange
    CommunicationsException communicationsException = new CommunicationsException(
        "CommunicationsException.ClientWasStreaming", null);

    // Act
    communicationsException.setWasStreamingResults();

    // Assert
    assertEquals(
        "Application was streaming results when the connection failed. Consider raising value of 'net_write_timeout' on the server.",
        communicationsException.getMessage());
  }
  @Test
  public void getSQLStateTest() {
    // Arrange, Act and Assert
    assertEquals("08S01",
        (new CommunicationsException("CommunicationsException.ClientWasStreaming", null)).getSQLState());
  }
  @Test
  public void getMessageTest() {
    // Arrange, Act and Assert
    assertEquals("CommunicationsException.ClientWasStreaming",
        (new CommunicationsException("CommunicationsException.ClientWasStreaming", null)).getMessage());
  }
  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("CommunicationsException.ClientWasStreaming",
        (new CommunicationsException("CommunicationsException.ClientWasStreaming", null)).getMessage());
  }
  @Test
  public void constructorTest() {
    // Arrange
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "CommunicationsException.ClientWasStreaming",
        1L);
    Jdk14Logger jdk14Logger = new Jdk14Logger("CommunicationsException.ClientWasStreaming");
    TimeTrackingPacketSender packetSentTimeHolder = new TimeTrackingPacketSender(new TracingPacketSender(
        new TracingPacketSender(packetSender, jdk14Logger, "CommunicationsException.ClientWasStreaming", 1L),
        jdk14Logger, "CommunicationsException.ClientWasStreaming", 1L));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new CommunicationsException(null, packetSentTimeHolder,
        new TimeTrackingPacketReader(new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null)))), null);
  }
}
