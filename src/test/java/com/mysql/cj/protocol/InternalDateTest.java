package com.mysql.cj.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class InternalDateTest {
  @Test
  public void isZeroTest() {
    // Arrange, Act and Assert
    assertTrue((new InternalDate()).isZero());
  }

  @Test
  public void setDayTest() {
    // Arrange
    InternalDate internalDate = new InternalDate();

    // Act
    internalDate.setDay(1);

    // Assert
    assertEquals(1, internalDate.getDay());
  }

  @Test
  public void getDayTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new InternalDate()).getDay());
  }

  @Test
  public void setMonthTest() {
    // Arrange
    InternalDate internalDate = new InternalDate();

    // Act
    internalDate.setMonth(1);

    // Assert
    assertEquals(1, internalDate.getMonth());
  }

  @Test
  public void getMonthTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new InternalDate()).getMonth());
  }

  @Test
  public void setYearTest() {
    // Arrange
    InternalDate internalDate = new InternalDate();

    // Act
    internalDate.setYear(1);

    // Assert
    assertEquals(1, internalDate.getYear());
  }

  @Test
  public void getYearTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new InternalDate()).getYear());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    InternalDate actualInternalDate = new InternalDate(1, 1, 1);

    // Assert
    int actualYear = actualInternalDate.getYear();
    int actualMonth = actualInternalDate.getMonth();
    assertEquals(1, actualYear);
    assertEquals(1, actualInternalDate.getDay());
    assertEquals(1, actualMonth);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    InternalDate actualInternalDate = new InternalDate();

    // Assert
    int actualYear = actualInternalDate.getYear();
    int actualMonth = actualInternalDate.getMonth();
    assertEquals(0, actualYear);
    assertEquals(0, actualInternalDate.getDay());
    assertEquals(0, actualMonth);
  }
}
