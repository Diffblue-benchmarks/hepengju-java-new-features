package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class StatementIsClosedExceptionTest {
  @Test
  public void constructorTest5() {
    // Arrange and Act
    StatementIsClosedException actualStatementIsClosedException = new StatementIsClosedException("S1009", null, true,
        true);

    // Assert
    String actualSQLState = actualStatementIsClosedException.getSQLState();
    int actualVendorCode = actualStatementIsClosedException.getVendorCode();
    assertFalse(actualStatementIsClosedException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    StatementIsClosedException actualStatementIsClosedException = new StatementIsClosedException((Throwable) null);

    // Assert
    String actualSQLState = actualStatementIsClosedException.getSQLState();
    int actualVendorCode = actualStatementIsClosedException.getVendorCode();
    assertFalse(actualStatementIsClosedException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    StatementIsClosedException actualStatementIsClosedException = new StatementIsClosedException("S1009", null);

    // Assert
    String actualSQLState = actualStatementIsClosedException.getSQLState();
    int actualVendorCode = actualStatementIsClosedException.getVendorCode();
    assertFalse(actualStatementIsClosedException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    StatementIsClosedException actualStatementIsClosedException = new StatementIsClosedException("S1009");

    // Assert
    String actualSQLState = actualStatementIsClosedException.getSQLState();
    int actualVendorCode = actualStatementIsClosedException.getVendorCode();
    assertFalse(actualStatementIsClosedException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    StatementIsClosedException actualStatementIsClosedException = new StatementIsClosedException();

    // Assert
    String actualSQLState = actualStatementIsClosedException.getSQLState();
    int actualVendorCode = actualStatementIsClosedException.getVendorCode();
    assertFalse(actualStatementIsClosedException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1009", actualSQLState);
  }
}
