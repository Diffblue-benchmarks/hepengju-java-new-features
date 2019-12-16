package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ClosedOnExpiredPasswordExceptionTest {
  @Test
  public void constructorTest5() {
    // Arrange and Act
    ClosedOnExpiredPasswordException actualClosedOnExpiredPasswordException = new ClosedOnExpiredPasswordException(
        "aaaaa", null, true, true);

    // Assert
    String actualSQLState = actualClosedOnExpiredPasswordException.getSQLState();
    int actualVendorCode = actualClosedOnExpiredPasswordException.getVendorCode();
    assertFalse(actualClosedOnExpiredPasswordException.isTransient());
    assertEquals(1862, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    ClosedOnExpiredPasswordException actualClosedOnExpiredPasswordException = new ClosedOnExpiredPasswordException(
        (Throwable) null);

    // Assert
    String actualSQLState = actualClosedOnExpiredPasswordException.getSQLState();
    int actualVendorCode = actualClosedOnExpiredPasswordException.getVendorCode();
    assertFalse(actualClosedOnExpiredPasswordException.isTransient());
    assertEquals(1862, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    ClosedOnExpiredPasswordException actualClosedOnExpiredPasswordException = new ClosedOnExpiredPasswordException(
        "aaaaa", null);

    // Assert
    String actualSQLState = actualClosedOnExpiredPasswordException.getSQLState();
    int actualVendorCode = actualClosedOnExpiredPasswordException.getVendorCode();
    assertFalse(actualClosedOnExpiredPasswordException.isTransient());
    assertEquals(1862, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ClosedOnExpiredPasswordException actualClosedOnExpiredPasswordException = new ClosedOnExpiredPasswordException(
        "aaaaa");

    // Assert
    String actualSQLState = actualClosedOnExpiredPasswordException.getSQLState();
    int actualVendorCode = actualClosedOnExpiredPasswordException.getVendorCode();
    assertFalse(actualClosedOnExpiredPasswordException.isTransient());
    assertEquals(1862, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ClosedOnExpiredPasswordException actualClosedOnExpiredPasswordException = new ClosedOnExpiredPasswordException();

    // Assert
    String actualSQLState = actualClosedOnExpiredPasswordException.getSQLState();
    int actualVendorCode = actualClosedOnExpiredPasswordException.getVendorCode();
    assertFalse(actualClosedOnExpiredPasswordException.isTransient());
    assertEquals(1862, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
}
