package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class NumberOutOfRangeTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    NumberOutOfRange actualNumberOutOfRange = new NumberOutOfRange("22003");

    // Assert
    String actualSQLState = actualNumberOutOfRange.getSQLState();
    int actualVendorCode = actualNumberOutOfRange.getVendorCode();
    assertFalse(actualNumberOutOfRange.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("22003", actualSQLState);
  }
}
