package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class UnsupportedConnectionStringExceptionTest {
  @Test
  public void constructorTest5() {
    // Arrange and Act
    UnsupportedConnectionStringException actualUnsupportedConnectionStringException = new UnsupportedConnectionStringException(
        "S1009", null, true, true);

    // Assert
    String actualSQLState = actualUnsupportedConnectionStringException.getSQLState();
    int actualVendorCode = actualUnsupportedConnectionStringException.getVendorCode();
    assertFalse(actualUnsupportedConnectionStringException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    UnsupportedConnectionStringException actualUnsupportedConnectionStringException = new UnsupportedConnectionStringException(
        (Throwable) null);

    // Assert
    String actualSQLState = actualUnsupportedConnectionStringException.getSQLState();
    int actualVendorCode = actualUnsupportedConnectionStringException.getVendorCode();
    assertFalse(actualUnsupportedConnectionStringException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    UnsupportedConnectionStringException actualUnsupportedConnectionStringException = new UnsupportedConnectionStringException(
        "S1009", null);

    // Assert
    String actualSQLState = actualUnsupportedConnectionStringException.getSQLState();
    int actualVendorCode = actualUnsupportedConnectionStringException.getVendorCode();
    assertFalse(actualUnsupportedConnectionStringException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    UnsupportedConnectionStringException actualUnsupportedConnectionStringException = new UnsupportedConnectionStringException(
        "S1009");

    // Assert
    String actualSQLState = actualUnsupportedConnectionStringException.getSQLState();
    int actualVendorCode = actualUnsupportedConnectionStringException.getVendorCode();
    assertFalse(actualUnsupportedConnectionStringException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    UnsupportedConnectionStringException actualUnsupportedConnectionStringException = new UnsupportedConnectionStringException();

    // Assert
    String actualSQLState = actualUnsupportedConnectionStringException.getSQLState();
    int actualVendorCode = actualUnsupportedConnectionStringException.getVendorCode();
    assertFalse(actualUnsupportedConnectionStringException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }
}
