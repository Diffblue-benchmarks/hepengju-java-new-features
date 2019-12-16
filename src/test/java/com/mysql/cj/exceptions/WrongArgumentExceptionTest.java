package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class WrongArgumentExceptionTest {
  @Test
  public void constructorTest5() {
    // Arrange and Act
    WrongArgumentException actualWrongArgumentException = new WrongArgumentException("S1009", null, true, true);

    // Assert
    String actualSQLState = actualWrongArgumentException.getSQLState();
    int actualVendorCode = actualWrongArgumentException.getVendorCode();
    assertFalse(actualWrongArgumentException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    WrongArgumentException actualWrongArgumentException = new WrongArgumentException((Throwable) null);

    // Assert
    String actualSQLState = actualWrongArgumentException.getSQLState();
    int actualVendorCode = actualWrongArgumentException.getVendorCode();
    assertFalse(actualWrongArgumentException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    WrongArgumentException actualWrongArgumentException = new WrongArgumentException("S1009", null);

    // Assert
    String actualSQLState = actualWrongArgumentException.getSQLState();
    int actualVendorCode = actualWrongArgumentException.getVendorCode();
    assertFalse(actualWrongArgumentException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    WrongArgumentException actualWrongArgumentException = new WrongArgumentException("S1009");

    // Assert
    String actualSQLState = actualWrongArgumentException.getSQLState();
    int actualVendorCode = actualWrongArgumentException.getVendorCode();
    assertFalse(actualWrongArgumentException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    WrongArgumentException actualWrongArgumentException = new WrongArgumentException();

    // Assert
    String actualSQLState = actualWrongArgumentException.getSQLState();
    int actualVendorCode = actualWrongArgumentException.getVendorCode();
    assertFalse(actualWrongArgumentException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }
}
