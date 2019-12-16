package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AssertionFailedExceptionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest2() {
    // Arrange and Act
    AssertionFailedException actualAssertionFailedException = new AssertionFailedException(
        "AssertionFailedException.1");

    // Assert
    String actualSQLState = actualAssertionFailedException.getSQLState();
    int actualVendorCode = actualAssertionFailedException.getVendorCode();
    assertFalse(actualAssertionFailedException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new AssertionFailedException((Exception) null);
  }
  @Test
  public void shouldNotHappenTest2() throws AssertionFailedException {
    // Arrange and Act
    AssertionFailedException actualShouldNotHappenResult = AssertionFailedException
        .shouldNotHappen("AssertionFailedException.1");

    // Assert
    String actualSQLState = actualShouldNotHappenResult.getSQLState();
    int actualVendorCode = actualShouldNotHappenResult.getVendorCode();
    assertFalse(actualShouldNotHappenResult.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
  @Test
  public void shouldNotHappenTest() throws AssertionFailedException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    AssertionFailedException.shouldNotHappen((Exception) null);
  }
}
