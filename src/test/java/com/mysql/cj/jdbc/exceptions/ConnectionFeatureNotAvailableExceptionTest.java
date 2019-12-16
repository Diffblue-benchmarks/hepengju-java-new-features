package com.mysql.cj.jdbc.exceptions;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.log.Jdk14Logger;
import com.mysql.cj.protocol.a.TimeTrackingPacketSender;
import com.mysql.cj.protocol.a.TracingPacketSender;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ConnectionFeatureNotAvailableExceptionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getSQLStateTest() {
    // Arrange, Act and Assert
    assertEquals("01S00", (new ConnectionFeatureNotAvailableException("aaaaa", null)).getSQLState());
  }
  @Test
  public void getMessageTest() {
    // Arrange, Act and Assert
    assertEquals("Feature not available in this distribution of Connector/J",
        (new ConnectionFeatureNotAvailableException("aaaaa", null)).getMessage());
  }
  @Test
  public void constructorTest() {
    // Arrange
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "aaaaa", 1L);
    Jdk14Logger jdk14Logger = new Jdk14Logger("aaaaa");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new ConnectionFeatureNotAvailableException(null, new TimeTrackingPacketSender(new TracingPacketSender(
        new TracingPacketSender(packetSender, jdk14Logger, "aaaaa", 1L), jdk14Logger, "aaaaa", 1L)), null);
  }
}
