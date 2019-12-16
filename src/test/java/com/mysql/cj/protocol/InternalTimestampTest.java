package com.mysql.cj.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class InternalTimestampTest {
  @Test
  public void isZeroTest() {
    // Arrange, Act and Assert
    assertTrue((new InternalTimestamp()).isZero());
  }

  @Test
  public void setNanosTest() {
    // Arrange
    InternalTimestamp internalTimestamp = new InternalTimestamp();

    // Act
    internalTimestamp.setNanos(1);

    // Assert
    assertEquals(1, internalTimestamp.getNanos());
  }

  @Test
  public void getNanosTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new InternalTimestamp()).getNanos());
  }

  @Test
  public void setSecondsTest() {
    // Arrange
    InternalTimestamp internalTimestamp = new InternalTimestamp();

    // Act
    internalTimestamp.setSeconds(1);

    // Assert
    assertEquals(1, internalTimestamp.getSeconds());
  }

  @Test
  public void getSecondsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new InternalTimestamp()).getSeconds());
  }

  @Test
  public void setMinutesTest() {
    // Arrange
    InternalTimestamp internalTimestamp = new InternalTimestamp();

    // Act
    internalTimestamp.setMinutes(1);

    // Assert
    assertEquals(1, internalTimestamp.getMinutes());
  }

  @Test
  public void getMinutesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new InternalTimestamp()).getMinutes());
  }

  @Test
  public void setHoursTest() {
    // Arrange
    InternalTimestamp internalTimestamp = new InternalTimestamp();

    // Act
    internalTimestamp.setHours(1);

    // Assert
    assertEquals(1, internalTimestamp.getHours());
  }

  @Test
  public void getHoursTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new InternalTimestamp()).getHours());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    InternalTimestamp actualInternalTimestamp = new InternalTimestamp(1, 1, 1, 1, 1, 1, 1);

    // Assert
    int actualYear = actualInternalTimestamp.getYear();
    int actualHours = actualInternalTimestamp.getHours();
    int actualMinutes = actualInternalTimestamp.getMinutes();
    int actualSeconds = actualInternalTimestamp.getSeconds();
    int actualNanos = actualInternalTimestamp.getNanos();
    int actualMonth = actualInternalTimestamp.getMonth();
    assertEquals(1, actualYear);
    assertEquals(1, actualInternalTimestamp.getDay());
    assertEquals(1, actualMonth);
    assertEquals(1, actualNanos);
    assertEquals(1, actualSeconds);
    assertEquals(1, actualMinutes);
    assertEquals(1, actualHours);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    InternalTimestamp actualInternalTimestamp = new InternalTimestamp();

    // Assert
    int actualYear = actualInternalTimestamp.getYear();
    int actualHours = actualInternalTimestamp.getHours();
    int actualMinutes = actualInternalTimestamp.getMinutes();
    int actualSeconds = actualInternalTimestamp.getSeconds();
    int actualNanos = actualInternalTimestamp.getNanos();
    int actualMonth = actualInternalTimestamp.getMonth();
    assertEquals(0, actualYear);
    assertEquals(0, actualInternalTimestamp.getDay());
    assertEquals(0, actualMonth);
    assertEquals(0, actualNanos);
    assertEquals(0, actualSeconds);
    assertEquals(0, actualMinutes);
    assertEquals(0, actualHours);
  }
}
