package com.mysql.cj.jdbc.ha;

import static org.junit.Assert.assertNull;
import com.mysql.cj.ServerVersion;
import com.mysql.cj.Session;
import com.mysql.cj.exceptions.ExceptionInterceptor;
import com.mysql.cj.interceptors.QueryInterceptor;
import com.mysql.cj.jdbc.ClientInfoProvider;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.jdbc.JdbcPropertySet;
import com.mysql.cj.jdbc.result.CachedResultSetMetaData;
import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import com.mysql.cj.jdbc.result.ResultSetImpl;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
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

public class MultiHostMySQLConnectionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void cleanupTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).cleanup(null);
  }

  @Test
  public void normalCloseTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).normalClose();
  }

  @Test
  public void getHostPortPairTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getHostPortPair();
  }

  @Test
  public void getPropertySetTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getPropertySet();
  }

  @Test
  public void getClientInfoProviderImplTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getClientInfoProviderImpl();
  }

  @Test
  public void createNClobTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).createNClob();
  }

  @Test
  public void createClobTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).createClob();
  }

  @Test
  public void createBlobTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).createBlob();
  }

  @Test
  public void unwrapTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).<Object>unwrap(null);
  }

  @Test
  public void isWrapperForTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).isWrapperFor(null);
  }

  @Test
  public void setClientInfoTest2() throws SQLClientInfoException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setClientInfo("aaaaa", "aaaaa");
  }

  @Test
  public void setClientInfoTest() throws SQLClientInfoException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setClientInfo(null);
  }

  @Test
  public void isValidTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).isValid(1);
  }

  @Test
  public void getClientInfoTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getClientInfo("aaaaa");
  }

  @Test
  public void getClientInfoTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getClientInfo();
  }

  @Test
  public void createStructTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).createStruct("aaaaa", new Object[]{"aaaaa", "aaaaa", null});
  }

  @Test
  public void createArrayOfTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).createArrayOf("aaaaa", new Object[]{"aaaaa", "aaaaa", null});
  }

  @Test
  public void createSQLXMLTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).createSQLXML();
  }

  @Test
  public void setSessionMaxRowsTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setSessionMaxRows(1);
  }

  @Test
  public void getSessionMaxRowsTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getSessionMaxRows();
  }

  @Test
  public void getConnectionMutexTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getConnectionMutex();
  }

  @Test
  public void getNetworkTimeoutTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getNetworkTimeout();
  }

  @Test
  public void getSchemaTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getSchema();
  }

  @Test
  public void setSchemaTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setSchema("aaaaa");
  }

  @Test
  public void isServerLocalTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).isServerLocal();
  }

  @Test
  public void setTypeMapTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setTypeMap(null);
  }

  @Test
  public void isProxySetTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).isProxySet();
  }

  @Test
  public void isClosedTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).isClosed();
  }

  @Test
  public void unSafeQueryInterceptorsTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).unSafeQueryInterceptors();
  }

  @Test
  public void unregisterStatementTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).unregisterStatement(null);
  }

  @Test
  public void transactionCompletedTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).transactionCompleted();
  }

  @Test
  public void transactionBegunTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).transactionBegun();
  }

  @Test
  public void throwConnectionClosedExceptionTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).throwConnectionClosedException();
  }

  @Test
  public void storesLowerCaseTableNameTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).storesLowerCaseTableName();
  }

  @Test
  public void shutdownServerTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).shutdownServer();
  }

  @Test
  public void setTransactionIsolationTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setTransactionIsolation(1);
  }

  @Test
  public void setStatementCommentTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setStatementComment("aaaaa");
  }

  @Test
  public void setSavepointTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setSavepoint("aaaaa");
  }

  @Test
  public void setSavepointTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setSavepoint();
  }

  @Test
  public void setReadOnlyInternalTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setReadOnlyInternal(true);
  }

  @Test
  public void setReadOnlyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setReadOnly(true);
  }

  @Test
  public void setProxyTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setProxy(null);
  }

  @Test
  public void setInGlobalTxTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setInGlobalTx(true);
  }

  @Test
  public void setHoldabilityTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setHoldability(1);
  }

  @Test
  public void setFailedOverTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setFailedOver(true);
  }

  @Test
  public void setCatalogTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setCatalog("aaaaa");
  }

  @Test
  public void getDatabaseTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getDatabase();
  }

  @Test
  public void setDatabaseTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setDatabase("aaaaa");
  }

  @Test
  public void setAutoCommitTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).setAutoCommit(true);
  }

  @Test
  public void serverPrepareStatementTest5() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).serverPrepareStatement("aaaaa");
  }

  @Test
  public void serverPrepareStatementTest4() throws SQLException {
    // Arrange
    MultiHostMySQLConnection multiHostMySQLConnection = new MultiHostMySQLConnection(null);
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    multiHostMySQLConnection.serverPrepareStatement("aaaaa", intArray);
  }

  @Test
  public void serverPrepareStatementTest3() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).serverPrepareStatement("aaaaa", 1);
  }

  @Test
  public void serverPrepareStatementTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).serverPrepareStatement("aaaaa", 1, 1);
  }

  @Test
  public void serverPrepareStatementTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).serverPrepareStatement("aaaaa", 1, 1, 1);
  }

  @Test
  public void rollbackTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).rollback();
  }

  @Test
  public void resetServerStateTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).resetServerState();
  }

  @Test
  public void registerStatementTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).registerStatement(null);
  }

  @Test
  public void decachePreparedStatementTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).decachePreparedStatement(null);
  }

  @Test
  public void recachePreparedStatementTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).recachePreparedStatement(null);
  }

  @Test
  public void realCloseTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).realClose(true, true, true, null);
  }

  @Test
  public void prepareStatementTest5() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).prepareStatement("aaaaa");
  }

  @Test
  public void prepareStatementTest4() throws SQLException {
    // Arrange
    MultiHostMySQLConnection multiHostMySQLConnection = new MultiHostMySQLConnection(null);
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    multiHostMySQLConnection.prepareStatement("aaaaa", intArray);
  }

  @Test
  public void prepareStatementTest3() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).prepareStatement("aaaaa", 1);
  }

  @Test
  public void prepareStatementTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).prepareStatement("aaaaa", 1, 1);
  }

  @Test
  public void prepareStatementTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).prepareStatement("aaaaa", 1, 1, 1);
  }

  @Test
  public void prepareCallTest3() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).prepareCall("aaaaa");
  }

  @Test
  public void prepareCallTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).prepareCall("aaaaa", 1, 1);
  }

  @Test
  public void prepareCallTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).prepareCall("aaaaa", 1, 1, 1);
  }

  @Test
  public void pingInternalTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).pingInternal(true, 1);
  }

  @Test
  public void pingTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).ping();
  }

  @Test
  public void nativeSQLTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).nativeSQL("aaaaa");
  }

  @Test
  public void lowerCaseTableNamesTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).lowerCaseTableNames();
  }

  @Test
  public void isSameResourceTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).isSameResource(null);
  }

  @Test
  public void isReadOnlyTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).isReadOnly(true);
  }

  @Test
  public void isReadOnlyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).isReadOnly();
  }

  @Test
  public void isMasterConnectionTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).isMasterConnection();
  }

  @Test
  public void isInGlobalTxTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).isInGlobalTx();
  }

  @Test
  public void initializeSafeQueryInterceptorsTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).initializeSafeQueryInterceptors();
  }

  @Test
  public void initializeResultsMetadataFromCacheTest() throws SQLException {
    // Arrange
    MultiHostMySQLConnection multiHostMySQLConnection = new MultiHostMySQLConnection(null);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    multiHostMySQLConnection.initializeResultsMetadataFromCache("aaaaa", new CachedResultSetMetaDataImpl(), null);
  }

  @Test
  public void hasTriedMasterTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).hasTriedMaster();
  }

  @Test
  public void hasSamePropertiesTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).hasSameProperties(null);
  }

  @Test
  public void getWarningsTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getWarnings();
  }

  @Test
  public void getUserTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getUser();
  }

  @Test
  public void getURLTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getURL();
  }

  @Test
  public void getTypeMapTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getTypeMap();
  }

  @Test
  public void getTransactionIsolationTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getTransactionIsolation();
  }

  @Test
  public void getQueryInterceptorsInstancesTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getQueryInterceptorsInstances();
  }

  @Test
  public void getStatementCommentTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getStatementComment();
  }

  @Test
  public void getSessionTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getSession();
  }

  @Test
  public void getServerVersionTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getServerVersion();
  }

  @Test
  public void getPropertiesTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getProperties();
  }

  @Test
  public void getMetadataSafeStatementTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getMetadataSafeStatement();
  }

  @Test
  public void getMetaDataTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getMetaData();
  }

  @Test
  public void getMultiHostParentProxyTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getMultiHostParentProxy();
  }

  @Test
  public void getMultiHostSafeProxyTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getMultiHostSafeProxy();
  }

  @Test
  public void getIdleForTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getIdleFor();
  }

  @Test
  public void getIdTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getId();
  }

  @Test
  public void getHostTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getHost();
  }

  @Test
  public void getHoldabilityTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getHoldability();
  }

  @Test
  public void getExceptionInterceptorTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getExceptionInterceptor();
  }

  @Test
  public void getCharacterSetMetadataTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getCharacterSetMetadata();
  }

  @Test
  public void getCatalogTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getCatalog();
  }

  @Test
  public void getCachedMetaDataTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getCachedMetaData("aaaaa");
  }

  @Test
  public void getAutoIncrementIncrementTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getAutoIncrementIncrement();
  }

  @Test
  public void getAutoCommitTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getAutoCommit();
  }

  @Test
  public void getActiveStatementCountTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getActiveStatementCount();
  }

  @Test
  public void createStatementTest3() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).createStatement(1, 1);
  }

  @Test
  public void createStatementTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).createStatement(1, 1, 1);
  }

  @Test
  public void createStatementTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).createStatement();
  }

  @Test
  public void createNewIOTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).createNewIO(true);
  }

  @Test
  public void commitTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).commit();
  }

  @Test
  public void closeTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).close();
  }

  @Test
  public void clientPrepareStatementTest5() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).clientPrepareStatement("aaaaa");
  }

  @Test
  public void clientPrepareStatementTest4() throws SQLException {
    // Arrange
    MultiHostMySQLConnection multiHostMySQLConnection = new MultiHostMySQLConnection(null);
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    multiHostMySQLConnection.clientPrepareStatement("aaaaa", intArray);
  }

  @Test
  public void clientPrepareStatementTest3() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).clientPrepareStatement("aaaaa", 1);
  }

  @Test
  public void clientPrepareStatementTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).clientPrepareStatement("aaaaa", 1, 1);
  }

  @Test
  public void clientPrepareStatementTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).clientPrepareStatement("aaaaa", 1, 1, 1);
  }

  @Test
  public void clearWarningsTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).clearWarnings();
  }

  @Test
  public void clearHasTriedMasterTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).clearHasTriedMaster();
  }

  @Test
  public void checkClosedTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).checkClosed();
  }

  @Test
  public void changeUserTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).changeUser("aaaaa", "aaaaa");
  }

  @Test
  public void abortInternalTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).abortInternal();
  }

  @Test
  public void getActiveMySQLConnectionTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiHostMySQLConnection(null)).getActiveMySQLConnection();
  }

  @Test
  public void getThisAsProxyTest() {
    // Arrange, Act and Assert
    assertNull((new MultiHostMySQLConnection(null)).getThisAsProxy());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new MultiHostMySQLConnection(null)).getThisAsProxy());
  }
}
