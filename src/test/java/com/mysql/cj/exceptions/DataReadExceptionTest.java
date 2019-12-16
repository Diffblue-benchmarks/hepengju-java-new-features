package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class DataReadExceptionTest {
  @Test
  public void constructorTest2() {
    // Arrange and Act
    DataReadException actualDataReadException = new DataReadException("S1009");

    // Assert
    String actualSQLState = actualDataReadException.getSQLState();
    int actualVendorCode = actualDataReadException.getVendorCode();
    assertFalse(actualDataReadException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    DataReadException actualDataReadException = new DataReadException((Exception) null);

    // Assert
    String actualSQLState = actualDataReadException.getSQLState();
    int actualVendorCode = actualDataReadException.getVendorCode();
    assertFalse(actualDataReadException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }
}
