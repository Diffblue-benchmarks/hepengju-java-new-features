package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class UnableToConnectExceptionTest {
  @Test
  public void constructorTest5() {
    // Arrange and Act
    UnableToConnectException actualUnableToConnectException = new UnableToConnectException("08001", null, true, true);

    // Assert
    String actualSQLState = actualUnableToConnectException.getSQLState();
    int actualVendorCode = actualUnableToConnectException.getVendorCode();
    assertFalse(actualUnableToConnectException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("08001", actualSQLState);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    UnableToConnectException actualUnableToConnectException = new UnableToConnectException((Throwable) null);

    // Assert
    String actualSQLState = actualUnableToConnectException.getSQLState();
    int actualVendorCode = actualUnableToConnectException.getVendorCode();
    assertFalse(actualUnableToConnectException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("08001", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    UnableToConnectException actualUnableToConnectException = new UnableToConnectException("08001", null);

    // Assert
    String actualSQLState = actualUnableToConnectException.getSQLState();
    int actualVendorCode = actualUnableToConnectException.getVendorCode();
    assertFalse(actualUnableToConnectException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("08001", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    UnableToConnectException actualUnableToConnectException = new UnableToConnectException("08001");

    // Assert
    String actualSQLState = actualUnableToConnectException.getSQLState();
    int actualVendorCode = actualUnableToConnectException.getVendorCode();
    assertFalse(actualUnableToConnectException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("08001", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    UnableToConnectException actualUnableToConnectException = new UnableToConnectException();

    // Assert
    String actualSQLState = actualUnableToConnectException.getSQLState();
    int actualVendorCode = actualUnableToConnectException.getVendorCode();
    assertFalse(actualUnableToConnectException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("08001", actualSQLState);
  }
}
