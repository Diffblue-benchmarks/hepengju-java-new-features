package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.log.Jdk14Logger;
import com.mysql.cj.protocol.a.MultiPacketReader;
import com.mysql.cj.protocol.a.NativeServerSession;
import com.mysql.cj.protocol.a.TimeTrackingPacketReader;
import com.mysql.cj.protocol.a.TimeTrackingPacketSender;
import com.mysql.cj.protocol.a.TracingPacketSender;
import org.junit.Test;

public class CJCommunicationsExceptionTest {
  @Test
  public void initTest() {
    // Arrange
    CJCommunicationsException cjCommunicationsException = new CJCommunicationsException();
    DefaultPropertySet defaultPropertySet = new DefaultPropertySet();
    NativeServerSession serverSession = new NativeServerSession(defaultPropertySet);
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "aaaaa", 1L);
    TracingPacketSender packetSender1 = new TracingPacketSender(packetSender, new Jdk14Logger("aaaaa"), "aaaaa", 1L);
    TimeTrackingPacketSender packetSentTimeHolder = new TimeTrackingPacketSender(
        new TracingPacketSender(packetSender1, new Jdk14Logger("aaaaa"), "aaaaa", 1L));

    // Act
    cjCommunicationsException.init(defaultPropertySet, serverSession, packetSentTimeHolder,
        new TimeTrackingPacketReader(new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null)))));

    // Assert
    assertEquals(
        "Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.",
        cjCommunicationsException.getMessage());
  }

  @Test
  public void constructorTest5() {
    // Arrange and Act
    CJCommunicationsException actualCjCommunicationsException = new CJCommunicationsException("aaaaa", null, true,
        true);

    // Assert
    String actualSQLState = actualCjCommunicationsException.getSQLState();
    int actualVendorCode = actualCjCommunicationsException.getVendorCode();
    assertFalse(actualCjCommunicationsException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    CJCommunicationsException actualCjCommunicationsException = new CJCommunicationsException((Throwable) null);

    // Assert
    String actualSQLState = actualCjCommunicationsException.getSQLState();
    int actualVendorCode = actualCjCommunicationsException.getVendorCode();
    assertFalse(actualCjCommunicationsException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    CJCommunicationsException actualCjCommunicationsException = new CJCommunicationsException("aaaaa", null);

    // Assert
    String actualSQLState = actualCjCommunicationsException.getSQLState();
    int actualVendorCode = actualCjCommunicationsException.getVendorCode();
    assertFalse(actualCjCommunicationsException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    CJCommunicationsException actualCjCommunicationsException = new CJCommunicationsException("aaaaa");

    // Assert
    String actualSQLState = actualCjCommunicationsException.getSQLState();
    int actualVendorCode = actualCjCommunicationsException.getVendorCode();
    assertFalse(actualCjCommunicationsException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    CJCommunicationsException actualCjCommunicationsException = new CJCommunicationsException();

    // Assert
    String actualSQLState = actualCjCommunicationsException.getSQLState();
    int actualVendorCode = actualCjCommunicationsException.getVendorCode();
    assertFalse(actualCjCommunicationsException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
}
