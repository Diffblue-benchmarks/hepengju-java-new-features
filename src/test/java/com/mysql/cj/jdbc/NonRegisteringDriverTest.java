package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.sql.Connection;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NonRegisteringDriverTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getParentLoggerTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLFeatureNotSupportedException.class);
    (new NonRegisteringDriver()).getParentLogger();
  }

  @Test
  public void jdbcCompliantTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new NonRegisteringDriver()).jdbcCompliant());
  }

  @Test
  public void getPropertyInfoTest() throws SQLException {
    // Arrange and Act
    DriverPropertyInfo[] actualPropertyInfo = (new NonRegisteringDriver()).getPropertyInfo("", null);

    // Assert
    assertEquals(194, actualPropertyInfo.length);
    DriverPropertyInfo driverPropertyInfo = actualPropertyInfo[0];
    DriverPropertyInfo driverPropertyInfo1 = actualPropertyInfo[1];
    DriverPropertyInfo driverPropertyInfo2 = actualPropertyInfo[2];
    DriverPropertyInfo driverPropertyInfo3 = actualPropertyInfo[3];
    DriverPropertyInfo driverPropertyInfo4 = actualPropertyInfo[4];
    DriverPropertyInfo driverPropertyInfo5 = actualPropertyInfo[5];
    DriverPropertyInfo driverPropertyInfo6 = actualPropertyInfo[188];
    DriverPropertyInfo driverPropertyInfo7 = actualPropertyInfo[189];
    DriverPropertyInfo driverPropertyInfo8 = actualPropertyInfo[190];
    DriverPropertyInfo driverPropertyInfo9 = actualPropertyInfo[191];
    DriverPropertyInfo driverPropertyInfo10 = actualPropertyInfo[192];
    DriverPropertyInfo driverPropertyInfo11 = actualPropertyInfo[193];
    assertEquals("true", driverPropertyInfo5.value);
    assertEquals("false", driverPropertyInfo6.value);
    assertEquals(4, driverPropertyInfo6.choices.length);
    assertFalse(driverPropertyInfo6.required);
    assertEquals(
        "This will cause a 'streaming' ResultSet to be automatically closed, and any outstanding data still streaming from the server to be discarded if another query is executed before all the data has been read from the server.",
        driverPropertyInfo6.description);
    assertEquals(4, driverPropertyInfo5.choices.length);
    assertFalse(driverPropertyInfo5.required);
    assertEquals("If connecting using TCP/IP, should the driver set SO_TCP_NODELAY (disabling the Nagle Algorithm)?",
        driverPropertyInfo5.description);
    assertFalse(driverPropertyInfo2.required);
    assertEquals("Database name;", driverPropertyInfo2.description);
    assertEquals(4, driverPropertyInfo10.choices.length);
    assertFalse(driverPropertyInfo10.required);
    assertEquals(
        "Should the driver cache the parsing stage of PreparedStatements of client-side prepared statements, the \"check\" for suitability of server-side prepared and server-side prepared statements themselves?",
        driverPropertyInfo10.description);
    assertEquals(4, driverPropertyInfo9.choices.length);
    assertFalse(driverPropertyInfo9.required);
    assertEquals(
        "Honor stream length parameter in PreparedStatement/ResultSet.setXXXStream() method calls (true/false, defaults to 'true')?",
        driverPropertyInfo9.description);
    assertTrue(driverPropertyInfo4.required);
    assertEquals("Password to use for authentication", driverPropertyInfo4.description);
    assertEquals(4, driverPropertyInfo8.choices.length);
    assertFalse(driverPropertyInfo8.required);
    assertEquals(
        "Should the driver always treat BLOBs as Strings - specifically to work around dubious metadata returned by the server for GROUP BY clauses?",
        driverPropertyInfo8.description);
    assertNull(driverPropertyInfo7.choices);
    assertFalse(driverPropertyInfo7.required);
    assertEquals(
        "X DevAPI-specific type of the trusted CA certificates key store. If not specified, use trustCertificateKeyStoreType value.",
        driverPropertyInfo7.description);
    assertTrue(driverPropertyInfo3.required);
    assertEquals("Username to authenticate as", driverPropertyInfo3.description);
    assertFalse(driverPropertyInfo1.required);
    assertEquals("Port number of MySQL Server", driverPropertyInfo1.description);
    assertEquals(4, driverPropertyInfo11.choices.length);
    assertFalse(driverPropertyInfo11.required);
    assertEquals(
        "Should the driver gather performance metrics, and report them via the configured logger every 'reportMetricsIntervalMillis' milliseconds?",
        driverPropertyInfo11.description);
    assertTrue(driverPropertyInfo.required);
    assertEquals("Hostname of MySQL Server", driverPropertyInfo.description);
    assertEquals("JKS", driverPropertyInfo7.value);
    assertEquals("false", driverPropertyInfo11.value);
    assertEquals("false", driverPropertyInfo10.value);
    assertEquals("true", driverPropertyInfo9.value);
    assertEquals("false", driverPropertyInfo8.value);
  }

  @Test
  public void getMinorVersionTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0, (new NonRegisteringDriver()).getMinorVersion());
  }

  @Test
  public void getMajorVersionTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(8, (new NonRegisteringDriver()).getMajorVersion());
  }

  @Test
  public void connectTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new NonRegisteringDriver()).connect("", null));
  }

  @Test
  public void acceptsURLTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new NonRegisteringDriver()).acceptsURL(""));
  }

  @Test
  public void getMinorVersionInternalTest() {
    // Arrange, Act and Assert
    assertEquals(0, NonRegisteringDriver.getMinorVersionInternal());
  }

  @Test
  public void getMajorVersionInternalTest() {
    // Arrange, Act and Assert
    assertEquals(8, NonRegisteringDriver.getMajorVersionInternal());
  }

  @Test
  public void getPlatformTest() {
    // Arrange, Act and Assert
    assertEquals("amd64", NonRegisteringDriver.getPlatform());
  }

  @Test
  public void getOSNameTest() {
    // Arrange, Act and Assert
    assertEquals("Linux", NonRegisteringDriver.getOSName());
  }
}
