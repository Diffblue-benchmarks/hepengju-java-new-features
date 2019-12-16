package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class CJPacketTooBigExceptionTest {
  @Test
  public void constructorTest5() {
    // Arrange and Act
    CJPacketTooBigException actualCjPacketTooBigException = new CJPacketTooBigException(1L, 1L);

    // Assert
    String actualSQLState = actualCjPacketTooBigException.getSQLState();
    int actualVendorCode = actualCjPacketTooBigException.getVendorCode();
    assertFalse(actualCjPacketTooBigException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    CJPacketTooBigException actualCjPacketTooBigException = new CJPacketTooBigException("aaaaa", (Throwable) null);

    // Assert
    String actualSQLState = actualCjPacketTooBigException.getSQLState();
    int actualVendorCode = actualCjPacketTooBigException.getVendorCode();
    assertFalse(actualCjPacketTooBigException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    CJPacketTooBigException actualCjPacketTooBigException = new CJPacketTooBigException((Throwable) null);

    // Assert
    String actualSQLState = actualCjPacketTooBigException.getSQLState();
    int actualVendorCode = actualCjPacketTooBigException.getVendorCode();
    assertFalse(actualCjPacketTooBigException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    CJPacketTooBigException actualCjPacketTooBigException = new CJPacketTooBigException("aaaaa");

    // Assert
    String actualSQLState = actualCjPacketTooBigException.getSQLState();
    int actualVendorCode = actualCjPacketTooBigException.getVendorCode();
    assertFalse(actualCjPacketTooBigException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    CJPacketTooBigException actualCjPacketTooBigException = new CJPacketTooBigException();

    // Assert
    String actualSQLState = actualCjPacketTooBigException.getSQLState();
    int actualVendorCode = actualCjPacketTooBigException.getVendorCode();
    assertFalse(actualCjPacketTooBigException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
}
