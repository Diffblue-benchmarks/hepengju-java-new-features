package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class CJTimeoutExceptionTest {
  @Test
  public void constructorTest4() {
    // Arrange and Act
    CJTimeoutException actualCjTimeoutException = new CJTimeoutException("MySQLTimeoutException.0", null);

    // Assert
    String actualSQLState = actualCjTimeoutException.getSQLState();
    int actualVendorCode = actualCjTimeoutException.getVendorCode();
    assertFalse(actualCjTimeoutException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    CJTimeoutException actualCjTimeoutException = new CJTimeoutException((Throwable) null);

    // Assert
    String actualSQLState = actualCjTimeoutException.getSQLState();
    int actualVendorCode = actualCjTimeoutException.getVendorCode();
    assertFalse(actualCjTimeoutException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    CJTimeoutException actualCjTimeoutException = new CJTimeoutException("MySQLTimeoutException.0");

    // Assert
    String actualSQLState = actualCjTimeoutException.getSQLState();
    int actualVendorCode = actualCjTimeoutException.getVendorCode();
    assertFalse(actualCjTimeoutException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    CJTimeoutException actualCjTimeoutException = new CJTimeoutException();

    // Assert
    String actualSQLState = actualCjTimeoutException.getSQLState();
    int actualVendorCode = actualCjTimeoutException.getVendorCode();
    assertFalse(actualCjTimeoutException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
}
