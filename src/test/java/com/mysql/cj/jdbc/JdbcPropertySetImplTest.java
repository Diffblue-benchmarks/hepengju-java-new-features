package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Properties;
import org.junit.Test;

public class JdbcPropertySetImplTest {
  @Test
  public void exposeAsDriverPropertyInfoTest() throws SQLException {
    // Arrange and Act
    DriverPropertyInfo[] actualExposeAsDriverPropertyInfoResult = (new JdbcPropertySetImpl())
        .exposeAsDriverPropertyInfo(null, 1);

    // Assert
    assertEquals(190, actualExposeAsDriverPropertyInfoResult.length);
    DriverPropertyInfo driverPropertyInfo = actualExposeAsDriverPropertyInfoResult[1];
    DriverPropertyInfo driverPropertyInfo1 = actualExposeAsDriverPropertyInfoResult[2];
    DriverPropertyInfo driverPropertyInfo2 = actualExposeAsDriverPropertyInfoResult[3];
    DriverPropertyInfo driverPropertyInfo3 = actualExposeAsDriverPropertyInfoResult[4];
    DriverPropertyInfo driverPropertyInfo4 = actualExposeAsDriverPropertyInfoResult[5];
    DriverPropertyInfo driverPropertyInfo5 = actualExposeAsDriverPropertyInfoResult[184];
    DriverPropertyInfo driverPropertyInfo6 = actualExposeAsDriverPropertyInfoResult[185];
    DriverPropertyInfo driverPropertyInfo7 = actualExposeAsDriverPropertyInfoResult[186];
    DriverPropertyInfo driverPropertyInfo8 = actualExposeAsDriverPropertyInfoResult[187];
    DriverPropertyInfo driverPropertyInfo9 = actualExposeAsDriverPropertyInfoResult[188];
    DriverPropertyInfo driverPropertyInfo10 = actualExposeAsDriverPropertyInfoResult[189];
    assertNull(driverPropertyInfo4.value);
    assertEquals("false", driverPropertyInfo5.value);
    assertEquals(4, driverPropertyInfo5.choices.length);
    assertFalse(driverPropertyInfo5.required);
    assertEquals(
        "This will cause a 'streaming' ResultSet to be automatically closed, and any outstanding data still streaming from the server to be discarded if another query is executed before all the data has been read from the server.",
        driverPropertyInfo5.description);
    assertNull(driverPropertyInfo4.choices);
    assertFalse(driverPropertyInfo4.required);
    assertEquals(
        "Override detection/mapping of time zone. Used when time zone from server doesn't map to Java time zone",
        driverPropertyInfo4.description);
    assertNull(driverPropertyInfo1.choices);
    assertFalse(driverPropertyInfo1.required);
    assertEquals(
        "KeyStore type for trusted root certificates (NULL or empty means use the default, which is \"JKS\". Standard keystore types supported by the JVM are \"JKS\" and \"PKCS12\", your environment may have more available depending on what security products are installed and available to the JVM.",
        driverPropertyInfo1.description);
    assertEquals(4, driverPropertyInfo8.choices.length);
    assertFalse(driverPropertyInfo8.required);
    assertEquals(
        "Honor stream length parameter in PreparedStatement/ResultSet.setXXXStream() method calls (true/false, defaults to 'true')?",
        driverPropertyInfo8.description);
    assertEquals(4, driverPropertyInfo3.choices.length);
    assertFalse(driverPropertyInfo3.required);
    assertEquals(
        "Pre-JDBC4 DatabaseMetaData API has only the getProcedures() and getProcedureColumns() methods, so they return metadata info for both stored procedures and functions. JDBC4 was extended with the getFunctions() and getFunctionColumns() methods and the expected behaviours of previous methods are not well defined. For JDBC4 and higher, default 'true' value of the option means that calls of DatabaseMetaData.getProcedures() and DatabaseMetaData.getProcedureColumns() return metadata for both procedures and functions as before, keeping backward compatibility. Setting this property to 'false' decouples Connector/J from its pre-JDBC4 behaviours for DatabaseMetaData.getProcedures() and DatabaseMetaData.getProcedureColumns(), forcing them to return metadata for procedures only.",
        driverPropertyInfo3.description);
    assertEquals(4, driverPropertyInfo7.choices.length);
    assertFalse(driverPropertyInfo7.required);
    assertEquals(
        "Should the driver always treat BLOBs as Strings - specifically to work around dubious metadata returned by the server for GROUP BY clauses?",
        driverPropertyInfo7.description);
    assertNull(driverPropertyInfo6.choices);
    assertFalse(driverPropertyInfo6.required);
    assertEquals(
        "X DevAPI-specific type of the trusted CA certificates key store. If not specified, use trustCertificateKeyStoreType value.",
        driverPropertyInfo6.description);
    assertEquals(4, driverPropertyInfo2.choices.length);
    assertFalse(driverPropertyInfo2.required);
    assertEquals(
        "Should the driver do strict checking (all primary keys selected) of updatable result sets (true, false, defaults to 'true')?",
        driverPropertyInfo2.description);
    assertEquals(4, driverPropertyInfo.choices.length);
    assertFalse(driverPropertyInfo.required);
    assertEquals("If connecting using TCP/IP, should the driver set SO_TCP_NODELAY (disabling the Nagle Algorithm)?",
        driverPropertyInfo.description);
    assertEquals(4, driverPropertyInfo9.choices.length);
    assertFalse(driverPropertyInfo9.required);
    assertEquals(
        "Should the driver cache the parsing stage of PreparedStatements of client-side prepared statements, the \"check\" for suitability of server-side prepared and server-side prepared statements themselves?",
        driverPropertyInfo9.description);
    assertEquals(4, driverPropertyInfo10.choices.length);
    assertFalse(driverPropertyInfo10.required);
    assertEquals(
        "Should the driver gather performance metrics, and report them via the configured logger every 'reportMetricsIntervalMillis' milliseconds?",
        driverPropertyInfo10.description);
    assertEquals("true", driverPropertyInfo2.value);
    assertEquals("false", driverPropertyInfo9.value);
    assertEquals("false", driverPropertyInfo10.value);
    assertEquals("true", driverPropertyInfo8.value);
    assertEquals("true", driverPropertyInfo3.value);
    assertEquals("JKS", driverPropertyInfo6.value);
    assertEquals("true", driverPropertyInfo.value);
    assertEquals("JKS", driverPropertyInfo1.value);
    assertEquals("false", driverPropertyInfo7.value);
  }
}
