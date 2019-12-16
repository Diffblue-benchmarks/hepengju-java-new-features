package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class FeatureNotAvailableExceptionTest {
  @Test
  public void constructorTest5() {
    // Arrange and Act
    FeatureNotAvailableException actualFeatureNotAvailableException = new FeatureNotAvailableException("aaaaa", null,
        true, true);

    // Assert
    String actualSQLState = actualFeatureNotAvailableException.getSQLState();
    int actualVendorCode = actualFeatureNotAvailableException.getVendorCode();
    assertFalse(actualFeatureNotAvailableException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    FeatureNotAvailableException actualFeatureNotAvailableException = new FeatureNotAvailableException(
        (Throwable) null);

    // Assert
    String actualSQLState = actualFeatureNotAvailableException.getSQLState();
    int actualVendorCode = actualFeatureNotAvailableException.getVendorCode();
    assertFalse(actualFeatureNotAvailableException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    FeatureNotAvailableException actualFeatureNotAvailableException = new FeatureNotAvailableException("aaaaa", null);

    // Assert
    String actualSQLState = actualFeatureNotAvailableException.getSQLState();
    int actualVendorCode = actualFeatureNotAvailableException.getVendorCode();
    assertFalse(actualFeatureNotAvailableException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    FeatureNotAvailableException actualFeatureNotAvailableException = new FeatureNotAvailableException("aaaaa");

    // Assert
    String actualSQLState = actualFeatureNotAvailableException.getSQLState();
    int actualVendorCode = actualFeatureNotAvailableException.getVendorCode();
    assertFalse(actualFeatureNotAvailableException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    FeatureNotAvailableException actualFeatureNotAvailableException = new FeatureNotAvailableException();

    // Assert
    String actualSQLState = actualFeatureNotAvailableException.getSQLState();
    int actualVendorCode = actualFeatureNotAvailableException.getVendorCode();
    assertFalse(actualFeatureNotAvailableException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
}
