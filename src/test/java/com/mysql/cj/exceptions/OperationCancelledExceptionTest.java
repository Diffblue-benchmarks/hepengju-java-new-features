package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class OperationCancelledExceptionTest {
  @Test
  public void constructorTest4() {
    // Arrange and Act
    OperationCancelledException actualOperationCancelledException = new OperationCancelledException(
        "MySQLStatementCancelledException.0", null);

    // Assert
    String actualSQLState = actualOperationCancelledException.getSQLState();
    int actualVendorCode = actualOperationCancelledException.getVendorCode();
    assertFalse(actualOperationCancelledException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    OperationCancelledException actualOperationCancelledException = new OperationCancelledException((Throwable) null);

    // Assert
    String actualSQLState = actualOperationCancelledException.getSQLState();
    int actualVendorCode = actualOperationCancelledException.getVendorCode();
    assertFalse(actualOperationCancelledException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    OperationCancelledException actualOperationCancelledException = new OperationCancelledException(
        "MySQLStatementCancelledException.0");

    // Assert
    String actualSQLState = actualOperationCancelledException.getSQLState();
    int actualVendorCode = actualOperationCancelledException.getVendorCode();
    assertFalse(actualOperationCancelledException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    OperationCancelledException actualOperationCancelledException = new OperationCancelledException();

    // Assert
    String actualSQLState = actualOperationCancelledException.getSQLState();
    int actualVendorCode = actualOperationCancelledException.getVendorCode();
    assertFalse(actualOperationCancelledException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
}
