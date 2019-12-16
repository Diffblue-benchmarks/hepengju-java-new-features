package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.mysql.cj.x.protobuf.Mysqlx;
import org.junit.Test;

public class XProtocolErrorTest {
  @Test
  public void getSQLStateTest() {
    // Arrange, Act and Assert
    assertEquals("", (new XProtocolError(Mysqlx.Error.getDefaultInstance())).getSQLState());
  }

  @Test
  public void getErrorCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new XProtocolError(Mysqlx.Error.getDefaultInstance())).getErrorCode());
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    XProtocolError actualXProtocolError = new XProtocolError("aaaaa", null);

    // Assert
    String actualSQLState = actualXProtocolError.getSQLState();
    int actualVendorCode = actualXProtocolError.getVendorCode();
    assertFalse(actualXProtocolError.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    XProtocolError actualXProtocolError = new XProtocolError(new XProtocolError(Mysqlx.Error.getDefaultInstance()));

    // Assert
    int actualErrorCode = actualXProtocolError.getErrorCode();
    int actualVendorCode = actualXProtocolError.getVendorCode();
    assertEquals(0, actualErrorCode);
    assertFalse(actualXProtocolError.isTransient());
    assertEquals(0, actualVendorCode);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    XProtocolError actualXProtocolError = new XProtocolError(Mysqlx.Error.getDefaultInstance());

    // Assert
    int actualErrorCode = actualXProtocolError.getErrorCode();
    int actualVendorCode = actualXProtocolError.getVendorCode();
    assertEquals(0, actualErrorCode);
    assertFalse(actualXProtocolError.isTransient());
    assertEquals(0, actualVendorCode);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    XProtocolError actualXProtocolError = new XProtocolError("aaaaa");

    // Assert
    String actualSQLState = actualXProtocolError.getSQLState();
    int actualVendorCode = actualXProtocolError.getVendorCode();
    assertFalse(actualXProtocolError.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
}
