package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ConnectionIsClosedExceptionTest {
  @Test
  public void constructorTest5() {
    // Arrange and Act
    ConnectionIsClosedException actualConnectionIsClosedException = new ConnectionIsClosedException("08003", null, true,
        true);

    // Assert
    String actualSQLState = actualConnectionIsClosedException.getSQLState();
    int actualVendorCode = actualConnectionIsClosedException.getVendorCode();
    assertFalse(actualConnectionIsClosedException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("08003", actualSQLState);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    ConnectionIsClosedException actualConnectionIsClosedException = new ConnectionIsClosedException((Throwable) null);

    // Assert
    String actualSQLState = actualConnectionIsClosedException.getSQLState();
    int actualVendorCode = actualConnectionIsClosedException.getVendorCode();
    assertFalse(actualConnectionIsClosedException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("08003", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    ConnectionIsClosedException actualConnectionIsClosedException = new ConnectionIsClosedException("08003", null);

    // Assert
    String actualSQLState = actualConnectionIsClosedException.getSQLState();
    int actualVendorCode = actualConnectionIsClosedException.getVendorCode();
    assertFalse(actualConnectionIsClosedException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("08003", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ConnectionIsClosedException actualConnectionIsClosedException = new ConnectionIsClosedException("08003");

    // Assert
    String actualSQLState = actualConnectionIsClosedException.getSQLState();
    int actualVendorCode = actualConnectionIsClosedException.getVendorCode();
    assertFalse(actualConnectionIsClosedException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("08003", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConnectionIsClosedException actualConnectionIsClosedException = new ConnectionIsClosedException();

    // Assert
    String actualSQLState = actualConnectionIsClosedException.getSQLState();
    int actualVendorCode = actualConnectionIsClosedException.getVendorCode();
    assertFalse(actualConnectionIsClosedException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("08003", actualSQLState);
  }
}
