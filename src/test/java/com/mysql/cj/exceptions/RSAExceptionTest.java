package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class RSAExceptionTest {
  @Test
  public void constructorTest5() {
    // Arrange and Act
    RSAException actualRsaException = new RSAException("aaaaa", null, true, true);

    // Assert
    String actualSQLState = actualRsaException.getSQLState();
    int actualVendorCode = actualRsaException.getVendorCode();
    assertFalse(actualRsaException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    RSAException actualRsaException = new RSAException((Throwable) null);

    // Assert
    String actualSQLState = actualRsaException.getSQLState();
    int actualVendorCode = actualRsaException.getVendorCode();
    assertFalse(actualRsaException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    RSAException actualRsaException = new RSAException("aaaaa", null);

    // Assert
    String actualSQLState = actualRsaException.getSQLState();
    int actualVendorCode = actualRsaException.getVendorCode();
    assertFalse(actualRsaException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    RSAException actualRsaException = new RSAException("aaaaa");

    // Assert
    String actualSQLState = actualRsaException.getSQLState();
    int actualVendorCode = actualRsaException.getVendorCode();
    assertFalse(actualRsaException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    RSAException actualRsaException = new RSAException();

    // Assert
    String actualSQLState = actualRsaException.getSQLState();
    int actualVendorCode = actualRsaException.getVendorCode();
    assertFalse(actualRsaException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
}
