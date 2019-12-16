package com.mysql.cj.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class InternalTimeTest {
  @Test
  public void isZeroTest() {
    // Arrange, Act and Assert
    assertTrue((new InternalTime()).isZero());
  }

  @Test
  public void setNanosTest() {
    // Arrange
    InternalTime internalTime = new InternalTime();

    // Act
    internalTime.setNanos(1);

    // Assert
    assertEquals(1, internalTime.getNanos());
  }

  @Test
  public void getNanosTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new InternalTime()).getNanos());
  }

  @Test
  public void setSecondsTest() {
    // Arrange
    InternalTime internalTime = new InternalTime();

    // Act
    internalTime.setSeconds(1);

    // Assert
    assertEquals(1, internalTime.getSeconds());
  }

  @Test
  public void getSecondsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new InternalTime()).getSeconds());
  }

  @Test
  public void setMinutesTest() {
    // Arrange
    InternalTime internalTime = new InternalTime();

    // Act
    internalTime.setMinutes(1);

    // Assert
    assertEquals(1, internalTime.getMinutes());
  }

  @Test
  public void getMinutesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new InternalTime()).getMinutes());
  }

  @Test
  public void setHoursTest() {
    // Arrange
    InternalTime internalTime = new InternalTime();

    // Act
    internalTime.setHours(1);

    // Assert
    assertEquals(1, internalTime.getHours());
  }

  @Test
  public void getHoursTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new InternalTime()).getHours());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    InternalTime actualInternalTime = new InternalTime(1, 1, 1, 1);

    // Assert
    int actualHours = actualInternalTime.getHours();
    int actualMinutes = actualInternalTime.getMinutes();
    int actualSeconds = actualInternalTime.getSeconds();
    assertEquals(1, actualHours);
    assertEquals(1, actualInternalTime.getNanos());
    assertEquals(1, actualSeconds);
    assertEquals(1, actualMinutes);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    InternalTime actualInternalTime = new InternalTime();

    // Assert
    int actualHours = actualInternalTime.getHours();
    int actualMinutes = actualInternalTime.getMinutes();
    int actualSeconds = actualInternalTime.getSeconds();
    assertEquals(0, actualHours);
    assertEquals(0, actualInternalTime.getNanos());
    assertEquals(0, actualSeconds);
    assertEquals(0, actualMinutes);
  }
}
