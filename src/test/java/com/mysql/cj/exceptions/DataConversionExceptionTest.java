package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class DataConversionExceptionTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    DataConversionException actualDataConversionException = new DataConversionException("22018");

    // Assert
    String actualSQLState = actualDataConversionException.getSQLState();
    int actualVendorCode = actualDataConversionException.getVendorCode();
    assertFalse(actualDataConversionException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("22018", actualSQLState);
  }
}
