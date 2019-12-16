package com.mysql.cj.log;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ProfilerEventImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void packTest() {
    // Arrange and Act
    byte[] actualPackResult = (new ProfilerEventImpl((byte) 0, "", "", 1L, 1, 1, 1L, "", null, "")).pack();

    // Assert
    assertEquals(88, actualPackResult.length);
    assertEquals((byte) 0, actualPackResult[0]);
    assertEquals((byte) 0, actualPackResult[1]);
    assertEquals((byte) 0, actualPackResult[2]);
    assertEquals((byte) 0, actualPackResult[3]);
    assertEquals((byte) 0, actualPackResult[4]);
    assertEquals((byte) 0, actualPackResult[5]);
    assertEquals((byte) 108, actualPackResult[82]);
    assertEquals((byte) 101, actualPackResult[83]);
    assertEquals((byte) 0, actualPackResult[84]);
    assertEquals((byte) 0, actualPackResult[85]);
    assertEquals((byte) 0, actualPackResult[86]);
    assertEquals((byte) 0, actualPackResult[87]);
  }

  @Test
  public void unpackTest() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    ProfilerEventImpl.unpack(new byte[24]);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals(
        "[USAGE ADVISOR]  [Created on: Mon Dec 16 16:59:02 GMT 2019, duration: 1, connection-id: 1, statement-id: 1, resultset-id: 1,at Caller information not available]",
        (new ProfilerEventImpl((byte) 0, "", "", 1L, 1, 1, 1L, "", null, "")).toString());
  }

  @Test
  public void getMessageTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ProfilerEventImpl((byte) 0, "", "", 1L, 1, 1, 1L, "", null, "")).getMessage());
  }

  @Test
  public void getEventCreationPointAsStringTest() {
    // Arrange, Act and Assert
    assertEquals("at Caller information not available",
        (new ProfilerEventImpl((byte) 0, "", "", 1L, 1, 1, 1L, "", null, "")).getEventCreationPointAsString());
  }

  @Test
  public void getDurationUnitsTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ProfilerEventImpl((byte) 0, "", "", 1L, 1, 1, 1L, "", null, "")).getDurationUnits());
  }

  @Test
  public void getEventDurationTest() {
    // Arrange, Act and Assert
    assertEquals(1L, (new ProfilerEventImpl((byte) 0, "", "", 1L, 1, 1, 1L, "", null, "")).getEventDuration());
  }

  @Test
  public void getResultSetIdTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new ProfilerEventImpl((byte) 0, "", "", 1L, 1, 1, 1L, "", null, "")).getResultSetId());
  }

  @Test
  public void getStatementIdTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new ProfilerEventImpl((byte) 0, "", "", 1L, 1, 1, 1L, "", null, "")).getStatementId());
  }

  @Test
  public void getConnectionIdTest() {
    // Arrange, Act and Assert
    assertEquals(1L, (new ProfilerEventImpl((byte) 0, "", "", 1L, 1, 1, 1L, "", null, "")).getConnectionId());
  }

  @Test
  public void getDatabaseTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ProfilerEventImpl((byte) 0, "", "", 1L, 1, 1, 1L, "", null, "")).getDatabase());
  }

  @Test
  public void getHostNameTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ProfilerEventImpl((byte) 0, "", "", 1L, 1, 1, 1L, "", null, "")).getHostName());
  }

  @Test
  public void getEventTypeTest() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, (new ProfilerEventImpl((byte) 0, "", "", 1L, 1, 1, 1L, "", null, "")).getEventType());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ProfilerEventImpl actualProfilerEventImpl = new ProfilerEventImpl((byte) 0, "", "", 1L, 1, 1, 1L, "", null, "");

    // Assert
    byte actualEventType = actualProfilerEventImpl.getEventType();
    String actualHostName = actualProfilerEventImpl.getHostName();
    long actualConnectionId = actualProfilerEventImpl.getConnectionId();
    String actualEventCreationPointAsString = actualProfilerEventImpl.getEventCreationPointAsString();
    String actualToStringResult = actualProfilerEventImpl.toString();
    String actualDurationUnits = actualProfilerEventImpl.getDurationUnits();
    long actualEventDuration = actualProfilerEventImpl.getEventDuration();
    String actualMessage = actualProfilerEventImpl.getMessage();
    int actualStatementId = actualProfilerEventImpl.getStatementId();
    int actualResultSetId = actualProfilerEventImpl.getResultSetId();
    assertEquals((byte) 0, actualEventType);
    assertEquals("", actualProfilerEventImpl.getDatabase());
    assertEquals(1, actualResultSetId);
    assertEquals(1, actualStatementId);
    assertEquals("", actualMessage);
    assertEquals(1L, actualEventDuration);
    assertEquals("", actualDurationUnits);
    assertEquals(
        "[USAGE ADVISOR]  [Created on: Mon Dec 16 16:59:02 GMT 2019, duration: 1, connection-id: 1, statement-id: 1, resultset-id: 1,at Caller information not available]",
        actualToStringResult);
    assertEquals("at Caller information not available", actualEventCreationPointAsString);
    assertEquals(1L, actualConnectionId);
    assertEquals("", actualHostName);
  }
}
