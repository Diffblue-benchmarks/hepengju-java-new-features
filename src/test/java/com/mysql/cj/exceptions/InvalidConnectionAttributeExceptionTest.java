package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class InvalidConnectionAttributeExceptionTest {
  @Test
  public void constructorTest5() {
    // Arrange and Act
    InvalidConnectionAttributeException actualInvalidConnectionAttributeException = new InvalidConnectionAttributeException(
        "01S00", null, true, true);

    // Assert
    String actualSQLState = actualInvalidConnectionAttributeException.getSQLState();
    int actualVendorCode = actualInvalidConnectionAttributeException.getVendorCode();
    assertFalse(actualInvalidConnectionAttributeException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("01S00", actualSQLState);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    InvalidConnectionAttributeException actualInvalidConnectionAttributeException = new InvalidConnectionAttributeException(
        (Throwable) null);

    // Assert
    String actualSQLState = actualInvalidConnectionAttributeException.getSQLState();
    int actualVendorCode = actualInvalidConnectionAttributeException.getVendorCode();
    assertFalse(actualInvalidConnectionAttributeException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("01S00", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    InvalidConnectionAttributeException actualInvalidConnectionAttributeException = new InvalidConnectionAttributeException(
        "01S00", null);

    // Assert
    String actualSQLState = actualInvalidConnectionAttributeException.getSQLState();
    int actualVendorCode = actualInvalidConnectionAttributeException.getVendorCode();
    assertFalse(actualInvalidConnectionAttributeException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("01S00", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    InvalidConnectionAttributeException actualInvalidConnectionAttributeException = new InvalidConnectionAttributeException(
        "01S00");

    // Assert
    String actualSQLState = actualInvalidConnectionAttributeException.getSQLState();
    int actualVendorCode = actualInvalidConnectionAttributeException.getVendorCode();
    assertFalse(actualInvalidConnectionAttributeException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("01S00", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    InvalidConnectionAttributeException actualInvalidConnectionAttributeException = new InvalidConnectionAttributeException();

    // Assert
    String actualSQLState = actualInvalidConnectionAttributeException.getSQLState();
    int actualVendorCode = actualInvalidConnectionAttributeException.getVendorCode();
    assertFalse(actualInvalidConnectionAttributeException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("01S00", actualSQLState);
  }
}
