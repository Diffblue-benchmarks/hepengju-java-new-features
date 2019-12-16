package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class CJOperationNotSupportedExceptionTest {
  @Test
  public void constructorTest2() {
    // Arrange and Act
    CJOperationNotSupportedException actualCjOperationNotSupportedException = new CJOperationNotSupportedException(
        "aaaaa");

    // Assert
    String actualSQLState = actualCjOperationNotSupportedException.getSQLState();
    int actualVendorCode = actualCjOperationNotSupportedException.getVendorCode();
    assertFalse(actualCjOperationNotSupportedException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    CJOperationNotSupportedException actualCjOperationNotSupportedException = new CJOperationNotSupportedException();

    // Assert
    String actualSQLState = actualCjOperationNotSupportedException.getSQLState();
    int actualVendorCode = actualCjOperationNotSupportedException.getVendorCode();
    assertFalse(actualCjOperationNotSupportedException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
}
