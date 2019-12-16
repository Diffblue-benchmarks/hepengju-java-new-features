package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PasswordExpiredExceptionTest {
  @Test
  public void constructorTest5() {
    // Arrange and Act
    PasswordExpiredException actualPasswordExpiredException = new PasswordExpiredException("aaaaa", null, true, true);

    // Assert
    String actualSQLState = actualPasswordExpiredException.getSQLState();
    int actualVendorCode = actualPasswordExpiredException.getVendorCode();
    assertFalse(actualPasswordExpiredException.isTransient());
    assertEquals(1820, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    PasswordExpiredException actualPasswordExpiredException = new PasswordExpiredException((Throwable) null);

    // Assert
    String actualSQLState = actualPasswordExpiredException.getSQLState();
    int actualVendorCode = actualPasswordExpiredException.getVendorCode();
    assertFalse(actualPasswordExpiredException.isTransient());
    assertEquals(1820, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    PasswordExpiredException actualPasswordExpiredException = new PasswordExpiredException("aaaaa", null);

    // Assert
    String actualSQLState = actualPasswordExpiredException.getSQLState();
    int actualVendorCode = actualPasswordExpiredException.getVendorCode();
    assertFalse(actualPasswordExpiredException.isTransient());
    assertEquals(1820, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    PasswordExpiredException actualPasswordExpiredException = new PasswordExpiredException("aaaaa");

    // Assert
    String actualSQLState = actualPasswordExpiredException.getSQLState();
    int actualVendorCode = actualPasswordExpiredException.getVendorCode();
    assertFalse(actualPasswordExpiredException.isTransient());
    assertEquals(1820, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    PasswordExpiredException actualPasswordExpiredException = new PasswordExpiredException();

    // Assert
    String actualSQLState = actualPasswordExpiredException.getSQLState();
    int actualVendorCode = actualPasswordExpiredException.getVendorCode();
    assertFalse(actualPasswordExpiredException.isTransient());
    assertEquals(1820, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
}
