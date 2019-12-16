package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class XDevAPIErrorTest {
  @Test
  public void constructorTest2() {
    // Arrange and Act
    XDevAPIError actualXDevAPIError = new XDevAPIError("aaaaa", null);

    // Assert
    String actualSQLState = actualXDevAPIError.getSQLState();
    int actualVendorCode = actualXDevAPIError.getVendorCode();
    assertFalse(actualXDevAPIError.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    XDevAPIError actualXDevAPIError = new XDevAPIError("aaaaa");

    // Assert
    String actualSQLState = actualXDevAPIError.getSQLState();
    int actualVendorCode = actualXDevAPIError.getVendorCode();
    assertFalse(actualXDevAPIError.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
}
