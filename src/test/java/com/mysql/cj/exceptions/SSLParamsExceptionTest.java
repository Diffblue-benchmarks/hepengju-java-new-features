package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class SSLParamsExceptionTest {
  @Test
  public void constructorTest5() {
    // Arrange and Act
    SSLParamsException actualSslParamsException = new SSLParamsException("08000", null, true, true);

    // Assert
    String actualSQLState = actualSslParamsException.getSQLState();
    int actualVendorCode = actualSslParamsException.getVendorCode();
    assertFalse(actualSslParamsException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("08000", actualSQLState);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    SSLParamsException actualSslParamsException = new SSLParamsException((Throwable) null);

    // Assert
    String actualSQLState = actualSslParamsException.getSQLState();
    int actualVendorCode = actualSslParamsException.getVendorCode();
    assertFalse(actualSslParamsException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("08000", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    SSLParamsException actualSslParamsException = new SSLParamsException("08000", null);

    // Assert
    String actualSQLState = actualSslParamsException.getSQLState();
    int actualVendorCode = actualSslParamsException.getVendorCode();
    assertFalse(actualSslParamsException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("08000", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    SSLParamsException actualSslParamsException = new SSLParamsException("08000");

    // Assert
    String actualSQLState = actualSslParamsException.getSQLState();
    int actualVendorCode = actualSslParamsException.getVendorCode();
    assertFalse(actualSslParamsException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("08000", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    SSLParamsException actualSslParamsException = new SSLParamsException();

    // Assert
    String actualSQLState = actualSslParamsException.getSQLState();
    int actualVendorCode = actualSslParamsException.getVendorCode();
    assertFalse(actualSslParamsException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("08000", actualSQLState);
  }
}
