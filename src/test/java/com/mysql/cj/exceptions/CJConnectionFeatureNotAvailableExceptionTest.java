package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.log.Jdk14Logger;
import com.mysql.cj.log.Log;
import com.mysql.cj.protocol.a.NativeServerSession;
import com.mysql.cj.protocol.a.TimeTrackingPacketSender;
import com.mysql.cj.protocol.a.TracingPacketSender;
import org.junit.Test;

public class CJConnectionFeatureNotAvailableExceptionTest {
  @Test
  public void getMessageTest() {
    // Arrange, Act and Assert
    assertEquals("Feature not available in this distribution of Connector/J",
        (new CJConnectionFeatureNotAvailableException()).getMessage());
  }

  @Test
  public void constructorTest2() {
    // Arrange
    DefaultPropertySet propertySet = new DefaultPropertySet();
    NativeServerSession serverSession = new NativeServerSession(new DefaultPropertySet());
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "aaaaa", 1L);

    // Act
    CJConnectionFeatureNotAvailableException actualCjConnectionFeatureNotAvailableException = new CJConnectionFeatureNotAvailableException(
        propertySet, serverSession, new TimeTrackingPacketSender(new TracingPacketSender(
            new TracingPacketSender(packetSender, new Jdk14Logger("aaaaa"), "aaaaa", 1L), null, "aaaaa", 1L)),
        null);

    // Assert
    String actualSQLState = actualCjConnectionFeatureNotAvailableException.getSQLState();
    int actualVendorCode = actualCjConnectionFeatureNotAvailableException.getVendorCode();
    assertFalse(actualCjConnectionFeatureNotAvailableException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    CJConnectionFeatureNotAvailableException actualCjConnectionFeatureNotAvailableException = new CJConnectionFeatureNotAvailableException();

    // Assert
    String actualSQLState = actualCjConnectionFeatureNotAvailableException.getSQLState();
    int actualVendorCode = actualCjConnectionFeatureNotAvailableException.getVendorCode();
    assertFalse(actualCjConnectionFeatureNotAvailableException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
}
