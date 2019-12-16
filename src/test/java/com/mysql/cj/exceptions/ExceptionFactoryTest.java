package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.log.Jdk14Logger;
import com.mysql.cj.log.Log;
import com.mysql.cj.protocol.a.MultiPacketReader;
import com.mysql.cj.protocol.a.NativeServerSession;
import com.mysql.cj.protocol.a.TimeTrackingPacketReader;
import com.mysql.cj.protocol.a.TimeTrackingPacketSender;
import com.mysql.cj.protocol.a.TracingPacketSender;
import org.junit.Test;

public class ExceptionFactoryTest {
  @Test
  public void createLinkFailureMessageBasedOnHeuristicsTest() {
    // Arrange
    DefaultPropertySet propertySet = new DefaultPropertySet();
    NativeServerSession serverSession = new NativeServerSession(new DefaultPropertySet());
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "CommunicationsException.2", 1L);
    TimeTrackingPacketSender packetSentTimeHolder = new TimeTrackingPacketSender(
        new TracingPacketSender(new TracingPacketSender(packetSender, new Jdk14Logger("CommunicationsException.2"),
            "CommunicationsException.2", 1L), null, "CommunicationsException.2", 1L));

    // Act and Assert
    assertEquals(
        "Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.",
        ExceptionFactory.createLinkFailureMessageBasedOnHeuristics(propertySet, serverSession, packetSentTimeHolder,
            new TimeTrackingPacketReader(new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null)))),
            null));
  }

  @Test
  public void createCommunicationsExceptionTest() {
    // Arrange
    DefaultPropertySet propertySet = new DefaultPropertySet();
    NativeServerSession serverSession = new NativeServerSession(new DefaultPropertySet());
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "CommunicationsException.2", 1L);
    TimeTrackingPacketSender packetSentTimeHolder = new TimeTrackingPacketSender(
        new TracingPacketSender(new TracingPacketSender(packetSender, new Jdk14Logger("CommunicationsException.2"),
            "CommunicationsException.2", 1L), null, "CommunicationsException.2", 1L));

    // Act
    CJCommunicationsException actualCreateCommunicationsExceptionResult = ExceptionFactory
        .createCommunicationsException(propertySet, serverSession, packetSentTimeHolder,
            new TimeTrackingPacketReader(new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null)))),
            null, null);

    // Assert
    String actualMessage = actualCreateCommunicationsExceptionResult.getMessage();
    String actualSQLState = actualCreateCommunicationsExceptionResult.getSQLState();
    int actualVendorCode = actualCreateCommunicationsExceptionResult.getVendorCode();
    assertEquals(
        "Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.",
        actualMessage);
    assertFalse(actualCreateCommunicationsExceptionResult.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void createExceptionTest9() {
    // Arrange and Act
    CJException actualCreateExceptionResult = ExceptionFactory.<CJException>createException(null,
        "CommunicationsException.2", null, null);

    // Assert
    String actualSQLState = actualCreateExceptionResult.getSQLState();
    int actualVendorCode = actualCreateExceptionResult.getVendorCode();
    assertFalse(actualCreateExceptionResult.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void createExceptionTest8() {
    // Arrange and Act
    CJException actualCreateExceptionResult = ExceptionFactory.createException("CommunicationsException.2",
        "CommunicationsException.2", 1, true, null, null);

    // Assert
    String actualSQLState = actualCreateExceptionResult.getSQLState();
    int actualVendorCode = actualCreateExceptionResult.getVendorCode();
    assertTrue(actualCreateExceptionResult.isTransient());
    assertEquals(1, actualVendorCode);
    assertEquals("CommunicationsException.2", actualSQLState);
  }

  @Test
  public void createExceptionTest7() {
    // Arrange and Act
    CJException actualCreateExceptionResult = ExceptionFactory.createException("CommunicationsException.2", null, null);

    // Assert
    String actualSQLState = actualCreateExceptionResult.getSQLState();
    int actualVendorCode = actualCreateExceptionResult.getVendorCode();
    assertFalse(actualCreateExceptionResult.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void createExceptionTest6() {
    // Arrange and Act
    CJException actualCreateExceptionResult = ExceptionFactory.<CJException>createException(null,
        "CommunicationsException.2", (Throwable) null);

    // Assert
    String actualSQLState = actualCreateExceptionResult.getSQLState();
    int actualVendorCode = actualCreateExceptionResult.getVendorCode();
    assertFalse(actualCreateExceptionResult.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void createExceptionTest5() {
    // Arrange and Act
    CJException actualCreateExceptionResult = ExceptionFactory.createException("CommunicationsException.2",
        (Throwable) null);

    // Assert
    String actualSQLState = actualCreateExceptionResult.getSQLState();
    int actualVendorCode = actualCreateExceptionResult.getVendorCode();
    assertFalse(actualCreateExceptionResult.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void createExceptionTest4() {
    // Arrange and Act
    CJException actualCreateExceptionResult = ExceptionFactory.<CJException>createException(null,
        "CommunicationsException.2", (ExceptionInterceptor) null);

    // Assert
    String actualSQLState = actualCreateExceptionResult.getSQLState();
    int actualVendorCode = actualCreateExceptionResult.getVendorCode();
    assertFalse(actualCreateExceptionResult.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void createExceptionTest3() {
    // Arrange and Act
    CJException actualCreateExceptionResult = ExceptionFactory.createException("CommunicationsException.2",
        (ExceptionInterceptor) null);

    // Assert
    String actualSQLState = actualCreateExceptionResult.getSQLState();
    int actualVendorCode = actualCreateExceptionResult.getVendorCode();
    assertFalse(actualCreateExceptionResult.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void createExceptionTest2() {
    // Arrange and Act
    CJException actualCreateExceptionResult = ExceptionFactory.<CJException>createException(null,
        "CommunicationsException.2");

    // Assert
    String actualSQLState = actualCreateExceptionResult.getSQLState();
    int actualVendorCode = actualCreateExceptionResult.getVendorCode();
    assertFalse(actualCreateExceptionResult.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void createExceptionTest() {
    // Arrange and Act
    CJException actualCreateExceptionResult = ExceptionFactory.createException("CommunicationsException.2");

    // Assert
    String actualSQLState = actualCreateExceptionResult.getSQLState();
    int actualVendorCode = actualCreateExceptionResult.getVendorCode();
    assertFalse(actualCreateExceptionResult.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
}
