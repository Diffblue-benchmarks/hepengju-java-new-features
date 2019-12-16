package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.ServerVersion;
import com.mysql.cj.Session;
import com.mysql.cj.exceptions.ExceptionInterceptor;
import com.mysql.cj.interceptors.QueryInterceptor;
import com.mysql.cj.jdbc.result.CachedResultSetMetaData;
import java.io.InputStream;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ConnectionWrapperTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void normalCloseTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).normalClose();
  }

  @Test
  public void getHostPortPairTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getHostPortPair();
  }

  @Test
  public void getClientInfoProviderImplTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getClientInfoProviderImpl();
  }

  @Test
  public void getActiveMySQLConnectionTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());
    ConnectionImpl connectionImpl = new ConnectionImpl();

    // Act and Assert
    assertSame(connectionImpl,
        ConnectionWrapper.getInstance(mysqlPooledConnection, connectionImpl, true).getActiveMySQLConnection());
  }

  @Test
  public void getMultiHostParentProxyTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertNull(
        ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getMultiHostParentProxy());
  }

  @Test
  public void getMultiHostSafeProxyTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());
    ConnectionImpl connectionImpl = new ConnectionImpl();

    // Act and Assert
    assertSame(connectionImpl,
        ConnectionWrapper.getInstance(mysqlPooledConnection, connectionImpl, true).getMultiHostSafeProxy());
  }

  @Test
  public void unSafeQueryInterceptorsTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).unSafeQueryInterceptors();
  }

  @Test
  public void throwConnectionClosedExceptionTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).throwConnectionClosedException();
  }

  @Test
  public void storesLowerCaseTableNameTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).storesLowerCaseTableName();
  }

  @Test
  public void setReadOnlyInternalTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).setReadOnlyInternal(true);
  }

  @Test
  public void realCloseTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).realClose(true, true, true, null);
  }

  @Test
  public void pingInternalTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).pingInternal(true, 1);
  }

  @Test
  public void isReadOnlyTest2() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).isReadOnly(true);
  }

  @Test
  public void initializeSafeQueryInterceptorsTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).initializeSafeQueryInterceptors();
  }

  @Test
  public void getQueryInterceptorsInstancesTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertNull(ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .getQueryInterceptorsInstances());
  }

  @Test
  public void getServerVersionTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getServerVersion();
  }

  @Test
  public void getMetadataSafeStatementTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getMetadataSafeStatement();
  }

  @Test
  public void getCharacterSetMetadataTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getCharacterSetMetadata();
  }

  @Test
  public void getCachedMetaDataTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertNull(ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .getCachedMetaData("java.sql.Connection"));
  }

  @Test
  public void getPropertySetTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertNull(ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getPropertySet());
  }

  @Test
  public void isProxySetTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertFalse(ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).isProxySet());
  }

  @Test
  public void createNewIOTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).createNewIO(true);
  }

  @Test
  public void getUserTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertNull(ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getUser());
  }

  @Test
  public void getURLTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getURL();
  }

  @Test
  public void getIdTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getId();
  }

  @Test
  public void getSessionTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertNull(ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getSession());
  }

  @Test
  public void isWrapperForTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).isWrapperFor(null);
  }

  @Test
  public void unwrapTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).<Object>unwrap(null);
  }

  @Test
  public void createStructTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(SQLFeatureNotSupportedException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).createStruct("java.sql.Connection",
        new Object[]{"java.sql.Connection", "java.sql.Connection", null});
  }

  @Test
  public void createArrayOfTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(SQLFeatureNotSupportedException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .createArrayOf("java.sql.Connection", new Object[]{"java.sql.Connection", "java.sql.Connection", null});
  }

  @Test
  public void getClientInfoTest2() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getClientInfo();
  }

  @Test
  public void getClientInfoTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .getClientInfo("java.sql.Connection");
  }

  @Test
  public void setClientInfoTest2() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).setClientInfo(null);
  }

  @Test
  public void setClientInfoTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .setClientInfo("java.sql.Connection", "java.sql.Connection");
  }

  @Test
  public void isValidTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).isValid(1);
  }

  @Test
  public void createSQLXMLTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertNull(
        ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).createSQLXML().getString());
  }

  @Test
  public void createNClobTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertTrue(ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).createNClob()
        .getAsciiStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void createBlobTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertTrue(ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).createBlob()
        .getBinaryStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void createClobTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertTrue(ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).createClob()
        .getAsciiStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void setSessionMaxRowsTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).setSessionMaxRows(1);
  }

  @Test
  public void getSessionMaxRowsTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getSessionMaxRows();
  }

  @Test
  public void getConnectionMutexTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());
    ConnectionImpl connectionImpl = new ConnectionImpl();

    // Act and Assert
    assertSame(connectionImpl,
        ConnectionWrapper.getInstance(mysqlPooledConnection, connectionImpl, true).getConnectionMutex());
  }

  @Test
  public void abortInternalTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).abortInternal();
  }

  @Test
  public void getNetworkTimeoutTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getNetworkTimeout();
  }

  @Test
  public void getSchemaTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getSchema();
  }

  @Test
  public void setSchemaTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).setSchema("java.sql.Connection");
  }

  @Test
  public void isServerLocalTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).isServerLocal();
  }

  @Test
  public void setTypeMapTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());
    ConnectionWrapper instance = ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true);

    // Act
    instance.setTypeMap(null);

    // Assert
    Map<String, Class<?>> typeMap = instance.getTypeMap();
    assertSame(typeMap, instance.mc.getTypeMap());
  }

  @Test
  public void setProxyTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());
    ConnectionWrapper instance = ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true);

    // Act
    instance.setProxy(null);

    // Assert
    String actualDatabase = instance.getDatabase();
    JdbcConnection actualMultiHostParentProxy = instance.getMultiHostParentProxy();
    assertNull(actualMultiHostParentProxy);
    assertNull(actualDatabase);
    assertFalse(instance.mc.isProxySet());
  }

  @Test
  public void getHostTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getHost();
  }

  @Test
  public void getPropertiesTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertNull(ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getProperties());
  }

  @Test
  public void hasSamePropertiesTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).hasSameProperties(null);
  }

  @Test
  public void getExceptionInterceptorTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertNull(
        ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getExceptionInterceptor());
  }

  @Test
  public void getAutoIncrementIncrementTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertEquals(0,
        ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getAutoIncrementIncrement());
  }

  @Test
  public void shutdownServerTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).shutdownServer();
  }

  @Test
  public void setStatementCommentTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .setStatementComment("java.sql.Connection");
  }

  @Test
  public void serverPrepareStatementTest6() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).serverPrepareStatement(
        "java.sql.Connection", new String[]{"java.sql.Connection", "java.sql.Connection", "java.sql.Connection"});
  }

  @Test
  public void serverPrepareStatementTest5() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());
    ConnectionWrapper instance = ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true);
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    instance.serverPrepareStatement("java.sql.Connection", intArray);
  }

  @Test
  public void serverPrepareStatementTest4() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .serverPrepareStatement("java.sql.Connection", 1, 1, 1);
  }

  @Test
  public void serverPrepareStatementTest3() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .serverPrepareStatement("java.sql.Connection", 1, 1);
  }

  @Test
  public void serverPrepareStatementTest2() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .serverPrepareStatement("java.sql.Connection", 1);
  }

  @Test
  public void serverPrepareStatementTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .serverPrepareStatement("java.sql.Connection");
  }

  @Test
  public void resetServerStateTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).resetServerState();
  }

  @Test
  public void lowerCaseTableNamesTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).lowerCaseTableNames();
  }

  @Test
  public void hasTriedMasterTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertFalse(ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).hasTriedMaster());
  }

  @Test
  public void getStatementCommentTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getStatementComment();
  }

  @Test
  public void getActiveStatementCountTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertEquals(0,
        ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getActiveStatementCount());
  }

  @Test
  public void clientPrepareStatementTest6() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).clientPrepareStatement(
        "java.sql.Connection", new String[]{"java.sql.Connection", "java.sql.Connection", "java.sql.Connection"});
  }

  @Test
  public void clientPrepareStatementTest5() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());
    ConnectionWrapper instance = ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true);
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    instance.clientPrepareStatement("java.sql.Connection", intArray);
  }

  @Test
  public void clientPrepareStatementTest4() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .clientPrepareStatement("java.sql.Connection", 1, 1, 1);
  }

  @Test
  public void clientPrepareStatementTest3() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .clientPrepareStatement("java.sql.Connection", 1, 1);
  }

  @Test
  public void clientPrepareStatementTest2() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .clientPrepareStatement("java.sql.Connection", 1);
  }

  @Test
  public void clientPrepareStatementTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .clientPrepareStatement("java.sql.Connection");
  }

  @Test
  public void clearHasTriedMasterTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());
    ConnectionWrapper instance = ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true);

    // Act
    instance.clearHasTriedMaster();

    // Assert
    assertFalse(instance.hasTriedMaster());
  }

  @Test
  public void changeUserTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).changeUser("java.sql.Connection",
        "java.sql.Connection");
  }

  @Test
  public void pingTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).ping();
  }

  @Test
  public void setInGlobalTxTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());
    ConnectionWrapper instance = ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true);

    // Act
    instance.setInGlobalTx(true);

    // Assert
    assertTrue(instance.mc.isInGlobalTx());
  }

  @Test
  public void isInGlobalTxTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertFalse(ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).isInGlobalTx());
  }

  @Test
  public void closeTest2() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).close(true);
  }

  @Test
  public void isSameResourceTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertFalse(ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).isSameResource(null));
  }

  @Test
  public void rollbackTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).rollback();
  }

  @Test
  public void prepareStatementTest6() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).prepareStatement(
        "java.sql.Connection", new String[]{"java.sql.Connection", "java.sql.Connection", "java.sql.Connection"});
  }

  @Test
  public void prepareStatementTest5() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());
    ConnectionWrapper instance = ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true);
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    instance.prepareStatement("java.sql.Connection", intArray);
  }

  @Test
  public void prepareStatementTest4() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .prepareStatement("java.sql.Connection", 1);
  }

  @Test
  public void prepareStatementTest3() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .prepareStatement("java.sql.Connection", 1, 1, 1);
  }

  @Test
  public void prepareStatementTest2() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .prepareStatement("java.sql.Connection", 1, 1);
  }

  @Test
  public void prepareStatementTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .prepareStatement("java.sql.Connection");
  }

  @Test
  public void clientPrepareTest2() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .clientPrepare("java.sql.Connection", 1, 1);
  }

  @Test
  public void clientPrepareTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .clientPrepare("java.sql.Connection");
  }

  @Test
  public void prepareCallTest3() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).prepareCall("java.sql.Connection",
        1, 1, 1);
  }

  @Test
  public void prepareCallTest2() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).prepareCall("java.sql.Connection",
        1, 1);
  }

  @Test
  public void prepareCallTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).prepareCall("java.sql.Connection");
  }

  @Test
  public void nativeSQLTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).nativeSQL("java.sql.Connection");
  }

  @Test
  public void createStatementTest3() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).createStatement(1, 1, 1);
  }

  @Test
  public void createStatementTest2() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).createStatement(1, 1);
  }

  @Test
  public void createStatementTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).createStatement();
  }

  @Test
  public void commitTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).commit();
  }

  @Test
  public void closeTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).close();
  }

  @Test
  public void getWarningsTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertNull(ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getWarnings());
  }

  @Test
  public void getTypeMapTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());
    ConnectionWrapper instance = ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true);

    // Act
    Map<String, Class<?>> actualTypeMap = instance.getTypeMap();

    // Assert
    assertEquals(0, actualTypeMap.size());
    assertSame(actualTypeMap, instance.mc.getTypeMap());
  }

  @Test
  public void getTransactionIsolationTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getTransactionIsolation();
  }

  @Test
  public void setTransactionIsolationTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).setTransactionIsolation(1);
  }

  @Test
  public void setSavepointTest2() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true)
        .setSavepoint("java.sql.Connection");
  }

  @Test
  public void setSavepointTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).setSavepoint();
  }

  @Test
  public void isReadOnlyTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).isReadOnly();
  }

  @Test
  public void setReadOnlyTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).setReadOnly(true);
  }

  @Test
  public void getMetaDataTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getMetaData();
  }

  @Test
  public void getIdleForTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getIdleFor();
  }

  @Test
  public void getHoldabilityTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertEquals(2, ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getHoldability());
  }

  @Test
  public void isMasterConnectionTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertFalse(ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).isMasterConnection());
  }

  @Test
  public void isClosedTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).isClosed();
  }

  @Test
  public void getCatalogTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getCatalog();
  }

  @Test
  public void setCatalogTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).setCatalog("java.sql.Connection");
  }

  @Test
  public void getDatabaseTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    assertNull(ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getDatabase());
  }

  @Test
  public void setDatabaseTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).setDatabase("java.sql.Connection");
  }

  @Test
  public void getAutoCommitTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).getAutoCommit();
  }

  @Test
  public void setAutoCommitTest() throws SQLException {
    // Arrange
    MysqlPooledConnection mysqlPooledConnection = MysqlPooledConnection.getInstance(new ConnectionImpl());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionWrapper.getInstance(mysqlPooledConnection, new ConnectionImpl(), true).setAutoCommit(true);
  }

  @Test
  public void constructorTest() throws SQLException {
    // Arrange
    ConnectionImpl connectionImpl = new ConnectionImpl();

    // Act
    ConnectionWrapper actualConnectionWrapper = new ConnectionWrapper(MysqlPooledConnection.getInstance(connectionImpl),
        connectionImpl, true);

    // Assert
    boolean actualIsMasterConnectionResult = actualConnectionWrapper.isMasterConnection();
    ExceptionInterceptor actualExceptionInterceptor = actualConnectionWrapper.getExceptionInterceptor();
    int actualHoldability = actualConnectionWrapper.getHoldability();
    assertEquals(2, actualHoldability);
    assertNull(actualExceptionInterceptor);
    assertFalse(actualIsMasterConnectionResult);
    assertFalse(actualConnectionWrapper.mc.isInGlobalTx());
  }

  @Test
  public void getInstanceTest() throws SQLException {
    // Arrange
    ConnectionImpl connectionImpl = new ConnectionImpl();

    // Act
    ConnectionWrapper actualInstance = ConnectionWrapper.getInstance(MysqlPooledConnection.getInstance(connectionImpl),
        connectionImpl, true);

    // Assert
    boolean actualIsMasterConnectionResult = actualInstance.isMasterConnection();
    ExceptionInterceptor actualExceptionInterceptor = actualInstance.getExceptionInterceptor();
    int actualHoldability = actualInstance.getHoldability();
    assertEquals(2, actualHoldability);
    assertNull(actualExceptionInterceptor);
    assertFalse(actualIsMasterConnectionResult);
    assertFalse(actualInstance.mc.isInGlobalTx());
  }
}
