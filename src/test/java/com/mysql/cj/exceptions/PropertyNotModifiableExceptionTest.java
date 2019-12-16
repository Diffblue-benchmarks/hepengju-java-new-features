package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PropertyNotModifiableExceptionTest {
  @Test
  public void constructorTest5() {
    // Arrange and Act
    PropertyNotModifiableException actualPropertyNotModifiableException = new PropertyNotModifiableException("aaaaa",
        null, true, true);

    // Assert
    String actualSQLState = actualPropertyNotModifiableException.getSQLState();
    int actualVendorCode = actualPropertyNotModifiableException.getVendorCode();
    assertFalse(actualPropertyNotModifiableException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    PropertyNotModifiableException actualPropertyNotModifiableException = new PropertyNotModifiableException(
        (Throwable) null);

    // Assert
    String actualSQLState = actualPropertyNotModifiableException.getSQLState();
    int actualVendorCode = actualPropertyNotModifiableException.getVendorCode();
    assertFalse(actualPropertyNotModifiableException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    PropertyNotModifiableException actualPropertyNotModifiableException = new PropertyNotModifiableException("aaaaa",
        null);

    // Assert
    String actualSQLState = actualPropertyNotModifiableException.getSQLState();
    int actualVendorCode = actualPropertyNotModifiableException.getVendorCode();
    assertFalse(actualPropertyNotModifiableException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    PropertyNotModifiableException actualPropertyNotModifiableException = new PropertyNotModifiableException("aaaaa");

    // Assert
    String actualSQLState = actualPropertyNotModifiableException.getSQLState();
    int actualVendorCode = actualPropertyNotModifiableException.getVendorCode();
    assertFalse(actualPropertyNotModifiableException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    PropertyNotModifiableException actualPropertyNotModifiableException = new PropertyNotModifiableException();

    // Assert
    String actualSQLState = actualPropertyNotModifiableException.getSQLState();
    int actualVendorCode = actualPropertyNotModifiableException.getVendorCode();
    assertFalse(actualPropertyNotModifiableException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
}
