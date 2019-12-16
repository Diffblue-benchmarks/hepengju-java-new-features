package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.NativeSession;
import com.mysql.cj.ServerVersion;
import com.mysql.cj.conf.HostInfo;
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
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ConnectionImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest3() {
    // Arrange and Act
    ConnectionImpl.CompoundCacheKey actualCompoundCacheKey = new ConnectionImpl.CompoundCacheKey("aaaaa", "aaaaa");

    // Assert
    assertEquals("aaaaa", actualCompoundCacheKey.componentOne);
    assertEquals("aaaaa", actualCompoundCacheKey.componentTwo);
    assertEquals(-1332788239, actualCompoundCacheKey.hashCode);
  }
  @Test
  public void handleReconnectTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).handleReconnect();
  }
  @Test
  public void handleNormalCloseTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).handleNormalClose();
  }
  @Test
  public void getHostPortPairTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getHostPortPair();
  }
  @Test
  public void getSessionTest() {
    // Arrange, Act and Assert
    assertNull((new ConnectionImpl()).getSession());
  }
  @Test
  public void isWrapperForTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).isWrapperFor(null);
  }
  @Test
  public void unwrapTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).<Object>unwrap(null);
  }
  @Test
  public void createStructTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLFeatureNotSupportedException.class);
    (new ConnectionImpl()).createStruct("", new Object[]{"", "", null});
  }
  @Test
  public void createArrayOfTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLFeatureNotSupportedException.class);
    (new ConnectionImpl()).createArrayOf("", new Object[]{"", "", null});
  }
  @Test
  public void getClientInfoTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getClientInfo();
  }
  @Test
  public void getClientInfoTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getClientInfo("");
  }
  @Test
  public void setClientInfoTest2() throws SQLClientInfoException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).setClientInfo(null);
  }
  @Test
  public void setClientInfoTest() throws SQLClientInfoException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).setClientInfo("", "");
  }
  @Test
  public void getClientInfoProviderImplTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getClientInfoProviderImpl();
  }
  @Test
  public void isValidTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).isValid(1);
  }
  @Test
  public void createSQLXMLTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new ConnectionImpl()).createSQLXML().getString());
  }
  @Test
  public void createNClobTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new ConnectionImpl()).createNClob().getAsciiStream() instanceof java.io.ByteArrayInputStream);
  }
  @Test
  public void createBlobTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new ConnectionImpl()).createBlob().getBinaryStream() instanceof java.io.ByteArrayInputStream);
  }
  @Test
  public void createClobTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new ConnectionImpl()).createClob().getAsciiStream() instanceof java.io.ByteArrayInputStream);
  }
  @Test
  public void getNetworkTimeoutTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getNetworkTimeout();
  }
  @Test
  public void getSchemaTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getSchema();
  }
  @Test
  public void setSchemaTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).setSchema("");
  }
  @Test
  public void setSessionMaxRowsTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).setSessionMaxRows(1);
  }
  @Test
  public void getSessionMaxRowsTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getSessionMaxRows();
  }
  @Test
  public void isServerLocalTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).isServerLocal();
  }
  @Test
  public void getExceptionInterceptorTest() {
    // Arrange, Act and Assert
    assertNull((new ConnectionImpl()).getExceptionInterceptor());
  }
  @Test
  public void storesLowerCaseTableNameTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).storesLowerCaseTableName();
  }
  @Test
  public void setStatementCommentTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).setStatementComment("");
  }
  @Test
  public void getStatementCommentTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getStatementComment();
  }
  @Test
  public void getCachedMetaDataTest() {
    // Arrange, Act and Assert
    assertNull((new ConnectionImpl()).getCachedMetaData(""));
  }
  @Test
  public void versionMeetsMinimumTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).versionMeetsMinimum(1, 1, 1);
  }
  @Test
  public void shutdownServerTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).shutdownServer();
  }
  @Test
  public void setTransactionIsolationTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).setTransactionIsolation(1);
  }
  @Test
  public void setSavepointTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new ConnectionImpl()).setSavepoint("");
  }
  @Test
  public void setSavepointTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).setSavepoint();
  }
  @Test
  public void setReadOnlyInternalTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).setReadOnlyInternal(true);
  }
  @Test
  public void setReadOnlyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).setReadOnly(true);
  }
  @Test
  public void setInGlobalTxTest() {
    // Arrange
    ConnectionImpl connectionImpl = new ConnectionImpl();

    // Act
    connectionImpl.setInGlobalTx(true);

    // Assert
    assertTrue(connectionImpl.isInGlobalTx());
  }
  @Test
  public void getDatabaseTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new ConnectionImpl()).getDatabase());
  }
  @Test
  public void setDatabaseTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).setDatabase("");
  }
  @Test
  public void setCatalogTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).setCatalog("");
  }
  @Test
  public void setAutoCommitTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).setAutoCommit(true);
  }
  @Test
  public void serverPrepareStatementTest6() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).serverPrepareStatement("", new String[]{"", "", ""});
  }
  @Test
  public void serverPrepareStatementTest5() throws SQLException {
    // Arrange
    ConnectionImpl connectionImpl = new ConnectionImpl();
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    connectionImpl.serverPrepareStatement("", intArray);
  }
  @Test
  public void serverPrepareStatementTest4() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).serverPrepareStatement("", 1, 1, 1);
  }
  @Test
  public void serverPrepareStatementTest3() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).serverPrepareStatement("", 1, 1);
  }
  @Test
  public void serverPrepareStatementTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).serverPrepareStatement("", 1);
  }
  @Test
  public void serverPrepareStatementTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).serverPrepareStatement("");
  }
  @Test
  public void rollbackTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).rollback();
  }
  @Test
  public void resetServerStateTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).resetServerState();
  }
  @Test
  public void realCloseTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).realClose(true, true, true, null);
  }
  @Test
  public void prepareStatementTest6() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).prepareStatement("", new String[]{"", "", ""});
  }
  @Test
  public void prepareStatementTest5() throws SQLException {
    // Arrange
    ConnectionImpl connectionImpl = new ConnectionImpl();
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    connectionImpl.prepareStatement("", intArray);
  }
  @Test
  public void prepareStatementTest4() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).prepareStatement("", 1, 1, 1);
  }
  @Test
  public void prepareStatementTest3() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).prepareStatement("", 1, 1);
  }
  @Test
  public void prepareStatementTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).prepareStatement("", 1);
  }
  @Test
  public void prepareStatementTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).prepareStatement("");
  }
  @Test
  public void prepareCallTest3() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).prepareCall("", 1, 1, 1);
  }
  @Test
  public void prepareCallTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).prepareCall("", 1, 1);
  }
  @Test
  public void prepareCallTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).prepareCall("");
  }
  @Test
  public void pingInternalTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).pingInternal(true, 1);
  }
  @Test
  public void pingTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).ping();
  }
  @Test
  public void nativeSQLTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).nativeSQL("");
  }
  @Test
  public void lowerCaseTableNamesTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).lowerCaseTableNames();
  }
  @Test
  public void getAutoIncrementIncrementTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ConnectionImpl()).getAutoIncrementIncrement());
  }
  @Test
  public void isSameResourceTest() {
    // Arrange
    ConnectionImpl connectionImpl = new ConnectionImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    connectionImpl.isSameResource(new ConnectionImpl());
  }
  @Test
  public void isReadOnlyTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).isReadOnly(true);
  }
  @Test
  public void isReadOnlyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).isReadOnly();
  }
  @Test
  public void isMasterConnectionTest() {
    // Arrange, Act and Assert
    assertFalse((new ConnectionImpl()).isMasterConnection());
  }
  @Test
  public void isInGlobalTxTest() {
    // Arrange, Act and Assert
    assertFalse((new ConnectionImpl()).isInGlobalTx());
  }
  @Test
  public void isClosedTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).isClosed();
  }
  @Test
  public void hasTriedMasterTest() {
    // Arrange, Act and Assert
    assertFalse((new ConnectionImpl()).hasTriedMaster());
  }
  @Test
  public void getPropertiesTest() {
    // Arrange, Act and Assert
    assertNull((new ConnectionImpl()).getProperties());
  }
  @Test
  public void hasSamePropertiesTest() {
    // Arrange
    ConnectionImpl connectionImpl = new ConnectionImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    connectionImpl.hasSameProperties(new ConnectionImpl());
  }
  @Test
  public void getWarningsTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new ConnectionImpl()).getWarnings());
  }
  @Test
  public void getUserTest() {
    // Arrange, Act and Assert
    assertNull((new ConnectionImpl()).getUser());
  }
  @Test
  public void getURLTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getURL();
  }
  @Test
  public void getTypeMapTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0, (new ConnectionImpl()).getTypeMap().size());
  }
  @Test
  public void getTransactionIsolationTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getTransactionIsolation();
  }
  @Test
  public void getServerVersionTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getServerVersion();
  }
  @Test
  public void getMetadataSafeStatementTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getMetadataSafeStatement(1);
  }
  @Test
  public void getMetadataSafeStatementTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getMetadataSafeStatement();
  }
  @Test
  public void getMetaDataTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getMetaData();
  }
  @Test
  public void getIdleForTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getIdleFor();
  }
  @Test
  public void getIdTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getId();
  }
  @Test
  public void getHoldabilityTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(2, (new ConnectionImpl()).getHoldability());
  }
  @Test
  public void getCharacterSetMetadataTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getCharacterSetMetadata();
  }
  @Test
  public void getCatalogTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getCatalog();
  }
  @Test
  public void getAutoCommitTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getAutoCommit();
  }
  @Test
  public void getActiveStatementCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ConnectionImpl()).getActiveStatementCount());
  }
  @Test
  public void createStatementTest3() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).createStatement(1, 1, 1);
  }
  @Test
  public void createStatementTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).createStatement(1, 1);
  }
  @Test
  public void createStatementTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).createStatement();
  }
  @Test
  public void createNewIOTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).createNewIO(true);
  }
  @Test
  public void commitTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).commit();
  }
  @Test
  public void normalCloseTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).normalClose();
  }
  @Test
  public void closeTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).close();
  }
  @Test
  public void clientPrepareStatementTest7() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).clientPrepareStatement("", 1, 1, 1);
  }
  @Test
  public void clientPrepareStatementTest6() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).clientPrepareStatement("", new String[]{"", "", ""});
  }
  @Test
  public void clientPrepareStatementTest5() throws SQLException {
    // Arrange
    ConnectionImpl connectionImpl = new ConnectionImpl();
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    connectionImpl.clientPrepareStatement("", intArray);
  }
  @Test
  public void clientPrepareStatementTest4() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).clientPrepareStatement("", 1, 1, true);
  }
  @Test
  public void clientPrepareStatementTest3() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).clientPrepareStatement("", 1, 1);
  }
  @Test
  public void clientPrepareStatementTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).clientPrepareStatement("", 1);
  }
  @Test
  public void clientPrepareStatementTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).clientPrepareStatement("");
  }
  @Test
  public void clearHasTriedMasterTest() {
    // Arrange
    ConnectionImpl connectionImpl = new ConnectionImpl();

    // Act
    connectionImpl.clearHasTriedMaster();

    // Assert
    assertFalse(connectionImpl.hasTriedMaster());
  }
  @Test
  public void abortInternalTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).abortInternal();
  }
  @Test
  public void throwConnectionClosedExceptionTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).throwConnectionClosedException();
  }
  @Test
  public void checkClosedTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).checkClosed();
  }
  @Test
  public void changeUserTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).changeUser("", "");
  }
  @Test
  public void getQueryInterceptorsInstancesTest() {
    // Arrange, Act and Assert
    assertNull((new ConnectionImpl()).getQueryInterceptorsInstances());
  }
  @Test
  public void initializeSafeQueryInterceptorsTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).initializeSafeQueryInterceptors();
  }
  @Test
  public void unSafeQueryInterceptorsTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).unSafeQueryInterceptors();
  }
  @Test
  public void getPropertySetTest() {
    // Arrange, Act and Assert
    assertNull((new ConnectionImpl()).getPropertySet());
  }
  @Test
  public void constructorTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new ConnectionImpl(new HostInfo());
  }
  @Test
  public void constructorTest() throws SQLException {
    // Arrange and Act
    ConnectionImpl actualConnectionImpl = new ConnectionImpl();

    // Assert
    NativeSession actualSession = actualConnectionImpl.getSession();
    boolean actualIsProxySetResult = actualConnectionImpl.isProxySet();
    boolean actualIsInGlobalTxResult = actualConnectionImpl.isInGlobalTx();
    String actualDatabase = actualConnectionImpl.getDatabase();
    Properties actualProperties = actualConnectionImpl.getProperties();
    int actualAutoIncrementIncrement = actualConnectionImpl.getAutoIncrementIncrement();
    int actualActiveStatementCount = actualConnectionImpl.getActiveStatementCount();
    JdbcConnection actualMultiHostParentProxy = actualConnectionImpl.getMultiHostParentProxy();
    String actualUser = actualConnectionImpl.getUser();
    assertNull(actualSession);
    assertFalse(actualConnectionImpl.hasTriedMaster());
    assertNull(actualUser);
    assertNull(actualMultiHostParentProxy);
    assertEquals(0, actualActiveStatementCount);
    assertEquals(0, actualAutoIncrementIncrement);
    assertNull(actualProperties);
    assertNull(actualDatabase);
    assertFalse(actualIsInGlobalTxResult);
    assertFalse(actualIsProxySetResult);
  }
  @Test
  public void getNextRoundRobinHostIndexTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionImpl.getNextRoundRobinHostIndex("", null);
  }
  @Test
  public void getInstanceTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    ConnectionImpl.getInstance(new HostInfo());
  }
  @Test
  public void getConnectionMutexTest() {
    // Arrange
    ConnectionImpl connectionImpl = new ConnectionImpl();

    // Act and Assert
    assertSame(connectionImpl, connectionImpl.getConnectionMutex());
  }
  @Test
  public void getActiveMySQLConnectionTest() {
    // Arrange
    ConnectionImpl connectionImpl = new ConnectionImpl();

    // Act and Assert
    assertSame(connectionImpl, connectionImpl.getActiveMySQLConnection());
  }
  @Test
  public void getMultiHostParentProxyTest() {
    // Arrange, Act and Assert
    assertNull((new ConnectionImpl()).getMultiHostParentProxy());
  }
  @Test
  public void getMultiHostSafeProxyTest() {
    // Arrange
    ConnectionImpl connectionImpl = new ConnectionImpl();

    // Act and Assert
    assertSame(connectionImpl, connectionImpl.getMultiHostSafeProxy());
  }
  @Test
  public void setProxyTest() {
    // Arrange
    ConnectionImpl connectionImpl = new ConnectionImpl();

    // Act
    connectionImpl.setProxy(new ConnectionImpl());

    // Assert
    assertTrue(connectionImpl.isProxySet());
  }
  @Test
  public void isProxySetTest() {
    // Arrange, Act and Assert
    assertFalse((new ConnectionImpl()).isProxySet());
  }
  @Test
  public void getHostTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionImpl()).getHost();
  }
}
