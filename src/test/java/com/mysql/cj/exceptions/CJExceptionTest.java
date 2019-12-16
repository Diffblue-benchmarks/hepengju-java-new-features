package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CJExceptionTest {
  @Test
  public void appendMessageTest() {
    // Arrange
    CJException cjException = new CJException();

    // Act
    cjException.appendMessage("S1000");

    // Assert
    assertEquals("nullS1000", cjException.getMessage());
  }

  @Test
  public void getMessageTest() {
    // Arrange, Act and Assert
    assertNull((new CJException()).getMessage());
  }

  @Test
  public void setTransientTest() {
    // Arrange
    CJException cjException = new CJException();

    // Act
    cjException.setTransient(true);

    // Assert
    assertTrue(cjException.isTransient());
  }

  @Test
  public void isTransientTest() {
    // Arrange, Act and Assert
    assertFalse((new CJException()).isTransient());
  }

  @Test
  public void setVendorCodeTest() {
    // Arrange
    CJException cjException = new CJException();

    // Act
    cjException.setVendorCode(1);

    // Assert
    assertEquals(1, cjException.getVendorCode());
  }

  @Test
  public void getVendorCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new CJException()).getVendorCode());
  }

  @Test
  public void setSQLStateTest() {
    // Arrange
    CJException cjException = new CJException();

    // Act
    cjException.setSQLState("S1000");

    // Assert
    assertEquals("S1000", cjException.getSQLState());
  }

  @Test
  public void getSQLStateTest() {
    // Arrange, Act and Assert
    assertEquals("S1000", (new CJException()).getSQLState());
  }

  @Test
  public void constructorTest5() {
    // Arrange and Act
    CJException actualCjException = new CJException("S1000", null, true, true);

    // Assert
    String actualSQLState = actualCjException.getSQLState();
    int actualVendorCode = actualCjException.getVendorCode();
    assertFalse(actualCjException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    CJException actualCjException = new CJException("S1000", null);

    // Assert
    String actualSQLState = actualCjException.getSQLState();
    int actualVendorCode = actualCjException.getVendorCode();
    assertFalse(actualCjException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    CJException actualCjException = new CJException((Throwable) null);

    // Assert
    String actualSQLState = actualCjException.getSQLState();
    int actualVendorCode = actualCjException.getVendorCode();
    assertFalse(actualCjException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    CJException actualCjException = new CJException("S1000");

    // Assert
    String actualSQLState = actualCjException.getSQLState();
    int actualVendorCode = actualCjException.getVendorCode();
    assertFalse(actualCjException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    CJException actualCjException = new CJException();

    // Assert
    String actualSQLState = actualCjException.getSQLState();
    int actualVendorCode = actualCjException.getVendorCode();
    assertFalse(actualCjException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
}
