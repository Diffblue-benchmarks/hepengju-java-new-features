package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLNonTransientConnectionException;
import java.util.Properties;
import java.util.logging.Logger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysqlDataSourceTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void setSocketTimeoutTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setSocketTimeout(1);

    // Assert
    assertEquals(1, mysqlDataSource.getSocketTimeout());
  }

  @Test
  public void getSocketTimeoutTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0, (new MysqlDataSource()).getSocketTimeout());
  }

  @Test
  public void getDontCheckOnDuplicateKeyUpdateInSQLTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getDontCheckOnDuplicateKeyUpdateInSQL());
  }

  @Test
  public void getMaintainTimeStatsTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getMaintainTimeStats());
  }

  @Test
  public void getUseStreamLengthsInPrepStmtsTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getUseStreamLengthsInPrepStmts());
  }

  @Test
  public void getReconnectAtTxEndTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getReconnectAtTxEnd());
  }

  @Test
  public void setSslModeTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new MysqlDataSource()).setSslMode("");
  }

  @Test
  public void getSslModeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("PREFERRED", (new MysqlDataSource()).getSslMode());
  }

  @Test
  public void setUseSSLTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setUseSSL(true);

    // Assert
    assertTrue(mysqlDataSource.getUseSSL());
  }

  @Test
  public void getUseSSLTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getUseSSL());
  }

  @Test
  public void getResourceIdTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getResourceId());
  }

  @Test
  public void setRewriteBatchedStatementsTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setRewriteBatchedStatements(true);

    // Assert
    assertTrue(mysqlDataSource.getRewriteBatchedStatements());
  }

  @Test
  public void getRewriteBatchedStatementsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getRewriteBatchedStatements());
  }

  @Test
  public void getEnableQueryTimeoutsTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getEnableQueryTimeouts());
  }

  @Test
  public void getNoDatetimeStringSyncTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getNoDatetimeStringSync());
  }

  @Test
  public void getLargeRowSizeThresholdTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(2048, (new MysqlDataSource()).getLargeRowSizeThreshold());
  }

  @Test
  public void setDatabaseTermTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new MysqlDataSource()).setDatabaseTerm("");
  }

  @Test
  public void getDatabaseTermTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("CATALOG", (new MysqlDataSource()).getDatabaseTerm());
  }

  @Test
  public void getQueryTimeoutKillsConnectionTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getQueryTimeoutKillsConnection());
  }

  @Test
  public void getIncludeThreadDumpInDeadlockExceptionsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getIncludeThreadDumpInDeadlockExceptions());
  }

  @Test
  public void setInteractiveClientTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setInteractiveClient(true);

    // Assert
    assertTrue(mysqlDataSource.getInteractiveClient());
  }

  @Test
  public void getInteractiveClientTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getInteractiveClient());
  }

  @Test
  public void getLoggerTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("com.mysql.cj.log.StandardLogger", (new MysqlDataSource()).getLogger());
  }

  @Test
  public void getLoadBalanceBlacklistTimeoutTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0, (new MysqlDataSource()).getLoadBalanceBlacklistTimeout());
  }

  @Test
  public void getAllowMultiQueriesTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getAllowMultiQueries());
  }

  @Test
  public void setTraceProtocolTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setTraceProtocol(true);

    // Assert
    assertTrue(mysqlDataSource.getTraceProtocol());
  }

  @Test
  public void getTraceProtocolTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getTraceProtocol());
  }

  @Test
  public void getEnablePacketDebugTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getEnablePacketDebug());
  }

  @Test
  public void setLocalSocketAddressTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setLocalSocketAddress("");

    // Assert
    assertEquals("", mysqlDataSource.getLocalSocketAddress());
  }

  @Test
  public void getLocalSocketAddressTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getLocalSocketAddress());
  }

  @Test
  public void getEnabledTLSProtocolsTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getEnabledTLSProtocols());
  }

  @Test
  public void getPinGlobalTxToPhysicalConnectionTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getPinGlobalTxToPhysicalConnection());
  }

  @Test
  public void setHaLoadBalanceStrategyTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setHaLoadBalanceStrategy("");

    // Assert
    assertEquals("", mysqlDataSource.getHaLoadBalanceStrategy());
  }

  @Test
  public void getHaLoadBalanceStrategyTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("random", (new MysqlDataSource()).getHaLoadBalanceStrategy());
  }

  @Test
  public void getAllowNanAndInfTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getAllowNanAndInf());
  }

  @Test
  public void getUseLocalTransactionStateTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getUseLocalTransactionState());
  }

  @Test
  public void setBlobsAreStringsTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setBlobsAreStrings(true);

    // Assert
    assertTrue(mysqlDataSource.getBlobsAreStrings());
  }

  @Test
  public void getBlobsAreStringsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getBlobsAreStrings());
  }

  @Test
  public void getSocksProxyPortTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(1080, (new MysqlDataSource()).getSocksProxyPort());
  }

  @Test
  public void getXdevapiAsyncResponseTimeoutTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(300, (new MysqlDataSource()).getXdevapiAsyncResponseTimeout());
  }

  @Test
  public void getAllowUrlInLocalInfileTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getAllowUrlInLocalInfile());
  }

  @Test
  public void getClobberStreamingResultsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getClobberStreamingResults());
  }

  @Test
  public void getAutoSlowLogTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getAutoSlowLog());
  }

  @Test
  public void getAllowPublicKeyRetrievalTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getAllowPublicKeyRetrieval());
  }

  @Test
  public void getIgnoreNonTxTablesTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getIgnoreNonTxTables());
  }

  @Test
  public void getLoadBalanceConnectionGroupTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getLoadBalanceConnectionGroup());
  }

  @Test
  public void getAlwaysSendSetIsolationTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getAlwaysSendSetIsolation());
  }

  @Test
  public void setCharacterEncodingTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setCharacterEncoding("");

    // Assert
    assertEquals("", mysqlDataSource.getCharacterEncoding());
  }

  @Test
  public void getCharacterEncodingTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getCharacterEncoding());
  }

  @Test
  public void setConnectionAttributesTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setConnectionAttributes("");

    // Assert
    assertEquals("", mysqlDataSource.getConnectionAttributes());
  }

  @Test
  public void getConnectionAttributesTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getConnectionAttributes());
  }

  @Test
  public void getMaxReconnectsTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(3, (new MysqlDataSource()).getMaxReconnects());
  }

  @Test
  public void setLoadBalanceAutoCommitStatementThresholdTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setLoadBalanceAutoCommitStatementThreshold(1);

    // Assert
    assertEquals(1, mysqlDataSource.getLoadBalanceAutoCommitStatementThreshold());
  }

  @Test
  public void getLoadBalanceAutoCommitStatementThresholdTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0, (new MysqlDataSource()).getLoadBalanceAutoCommitStatementThreshold());
  }

  @Test
  public void getUseCursorFetchTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getUseCursorFetch());
  }

  @Test
  public void getLoadBalanceSQLStateFailoverTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getLoadBalanceSQLStateFailover());
  }

  @Test
  public void getMaxRowsTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(-1, (new MysqlDataSource()).getMaxRows());
  }

  @Test
  public void getServerTimezoneTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getServerTimezone());
  }

  @Test
  public void setMaxQuerySizeToLogTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setMaxQuerySizeToLog(1);

    // Assert
    assertEquals(1, mysqlDataSource.getMaxQuerySizeToLog());
  }

  @Test
  public void getMaxQuerySizeToLogTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(2048, (new MysqlDataSource()).getMaxQuerySizeToLog());
  }

  @Test
  public void setUseOldAliasMetadataBehaviorTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setUseOldAliasMetadataBehavior(true);

    // Assert
    assertTrue(mysqlDataSource.getUseOldAliasMetadataBehavior());
  }

  @Test
  public void getUseOldAliasMetadataBehaviorTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getUseOldAliasMetadataBehavior());
  }

  @Test
  public void getFunctionsNeverReturnBlobsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getFunctionsNeverReturnBlobs());
  }

  @Test
  public void getProcessEscapeCodesForPrepStmtsTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getProcessEscapeCodesForPrepStmts());
  }

  @Test
  public void getTreatUtilDateAsTimestampTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getTreatUtilDateAsTimestamp());
  }

  @Test
  public void getBlobSendChunkSizeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(1048576, (new MysqlDataSource()).getBlobSendChunkSize());
  }

  @Test
  public void getMetadataCacheSizeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(50, (new MysqlDataSource()).getMetadataCacheSize());
  }

  @Test
  public void getSendFractionalSecondsTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getSendFractionalSeconds());
  }

  @Test
  public void getPedanticTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getPedantic());
  }

  @Test
  public void getAllowSlaveDownConnectionsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getAllowSlaveDownConnections());
  }

  @Test
  public void setReplicationConnectionGroupTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setReplicationConnectionGroup("");

    // Assert
    assertEquals("", mysqlDataSource.getReplicationConnectionGroup());
  }

  @Test
  public void getReplicationConnectionGroupTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getReplicationConnectionGroup());
  }

  @Test
  public void getSlowQueryThresholdMillisTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(2000, (new MysqlDataSource()).getSlowQueryThresholdMillis());
  }

  @Test
  public void setXdevapiSSLTruststoreTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setXdevapiSSLTruststore("");

    // Assert
    assertEquals("", mysqlDataSource.getXdevapiSSLTruststore());
  }

  @Test
  public void getXdevapiSSLTruststoreTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getXdevapiSSLTruststore());
  }

  @Test
  public void getSocksProxyHostTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getSocksProxyHost());
  }

  @Test
  public void getSelfDestructOnPingMaxOperationsTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0, (new MysqlDataSource()).getSelfDestructOnPingMaxOperations());
  }

  @Test
  public void getTcpNoDelayTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getTcpNoDelay());
  }

  @Test
  public void getCacheResultSetMetadataTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getCacheResultSetMetadata());
  }

  @Test
  public void getLoadBalanceHostRemovalGracePeriodTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(15000, (new MysqlDataSource()).getLoadBalanceHostRemovalGracePeriod());
  }

  @Test
  public void setDetectCustomCollationsTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setDetectCustomCollations(true);

    // Assert
    assertTrue(mysqlDataSource.getDetectCustomCollations());
  }

  @Test
  public void getDetectCustomCollationsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getDetectCustomCollations());
  }

  @Test
  public void setOverrideSupportsIntegrityEnhancementFacilityTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setOverrideSupportsIntegrityEnhancementFacility(true);

    // Assert
    assertTrue(mysqlDataSource.getOverrideSupportsIntegrityEnhancementFacility());
  }

  @Test
  public void getOverrideSupportsIntegrityEnhancementFacilityTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getOverrideSupportsIntegrityEnhancementFacility());
  }

  @Test
  public void getPrepStmtCacheSqlLimitTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(256, (new MysqlDataSource()).getPrepStmtCacheSqlLimit());
  }

  @Test
  public void setEnabledSSLCipherSuitesTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setEnabledSSLCipherSuites("");

    // Assert
    assertEquals("", mysqlDataSource.getEnabledSSLCipherSuites());
  }

  @Test
  public void getEnabledSSLCipherSuitesTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getEnabledSSLCipherSuites());
  }

  @Test
  public void setUseOnlyServerErrorMessagesTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setUseOnlyServerErrorMessages(true);

    // Assert
    assertTrue(mysqlDataSource.getUseOnlyServerErrorMessages());
  }

  @Test
  public void getUseOnlyServerErrorMessagesTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getUseOnlyServerErrorMessages());
  }

  @Test
  public void getPrepStmtCacheSizeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(25, (new MysqlDataSource()).getPrepStmtCacheSize());
  }

  @Test
  public void getXdevapiConnectionAttributesTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getXdevapiConnectionAttributes());
  }

  @Test
  public void getAutoReconnectTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getAutoReconnect());
  }

  @Test
  public void getUseUnbufferedInputTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getUseUnbufferedInput());
  }

  @Test
  public void setEnableEscapeProcessingTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setEnableEscapeProcessing(true);

    // Assert
    assertTrue(mysqlDataSource.getEnableEscapeProcessing());
  }

  @Test
  public void getEnableEscapeProcessingTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getEnableEscapeProcessing());
  }

  @Test
  public void getCacheCallableStmtsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getCacheCallableStmts());
  }

  @Test
  public void setZeroDateTimeBehaviorTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new MysqlDataSource()).setZeroDateTimeBehavior("");
  }

  @Test
  public void getZeroDateTimeBehaviorTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("EXCEPTION", (new MysqlDataSource()).getZeroDateTimeBehavior());
  }

  @Test
  public void getHoldResultsOpenOverStatementCloseTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getHoldResultsOpenOverStatementClose());
  }

  @Test
  public void getLogSlowQueriesTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getLogSlowQueries());
  }

  @Test
  public void getCachePrepStmtsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getCachePrepStmts());
  }

  @Test
  public void getDumpQueriesOnExceptionTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getDumpQueriesOnException());
  }

  @Test
  public void setXdevapiAuthTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new MysqlDataSource()).setXdevapiAuth("");
  }

  @Test
  public void getXdevapiAuthTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("PLAIN", (new MysqlDataSource()).getXdevapiAuth());
  }

  @Test
  public void setGatherPerfMetricsTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setGatherPerfMetrics(true);

    // Assert
    assertTrue(mysqlDataSource.getGatherPerfMetrics());
  }

  @Test
  public void getGatherPerfMetricsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getGatherPerfMetrics());
  }

  @Test
  public void getEmulateUnsupportedPstmtsTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getEmulateUnsupportedPstmts());
  }

  @Test
  public void getDontTrackOpenResourcesTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getDontTrackOpenResources());
  }

  @Test
  public void setSocketFactoryTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setSocketFactory("");

    // Assert
    assertEquals("", mysqlDataSource.getSocketFactory());
  }

  @Test
  public void getSocketFactoryTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("com.mysql.cj.protocol.StandardSocketFactory", (new MysqlDataSource()).getSocketFactory());
  }

  @Test
  public void getQueriesBeforeRetryMasterTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(50, (new MysqlDataSource()).getQueriesBeforeRetryMaster());
  }

  @Test
  public void getNoAccessToProcedureBodiesTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getNoAccessToProcedureBodies());
  }

  @Test
  public void getTrustCertificateKeyStoreTypeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("JKS", (new MysqlDataSource()).getTrustCertificateKeyStoreType());
  }

  @Test
  public void setTrustCertificateKeyStoreUrlTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setTrustCertificateKeyStoreUrl("");

    // Assert
    assertEquals("", mysqlDataSource.getTrustCertificateKeyStoreUrl());
  }

  @Test
  public void getTrustCertificateKeyStoreUrlTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getTrustCertificateKeyStoreUrl());
  }

  @Test
  public void getDefaultAuthenticationPluginTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("com.mysql.cj.protocol.a.authentication.MysqlNativePasswordPlugin",
        (new MysqlDataSource()).getDefaultAuthenticationPlugin());
  }

  @Test
  public void getCreateDatabaseIfNotExistTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getCreateDatabaseIfNotExist());
  }

  @Test
  public void setClobCharacterEncodingTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setClobCharacterEncoding("");

    // Assert
    assertEquals("", mysqlDataSource.getClobCharacterEncoding());
  }

  @Test
  public void getClobCharacterEncodingTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getClobCharacterEncoding());
  }

  @Test
  public void getDisabledAuthenticationPluginsTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getDisabledAuthenticationPlugins());
  }

  @Test
  public void getLocatorFetchBufferSizeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(1048576, (new MysqlDataSource()).getLocatorFetchBufferSize());
  }

  @Test
  public void getTcpSndBufTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0, (new MysqlDataSource()).getTcpSndBuf());
  }

  @Test
  public void getDisconnectOnExpiredPasswordsTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getDisconnectOnExpiredPasswords());
  }

  @Test
  public void getUseUsageAdvisorTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getUseUsageAdvisor());
  }

  @Test
  public void getClientCertificateKeyStoreTypeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("JKS", (new MysqlDataSource()).getClientCertificateKeyStoreType());
  }

  @Test
  public void getParanoidTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getParanoid());
  }

  @Test
  public void getLoadBalanceSQLExceptionSubclassFailoverTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getLoadBalanceSQLExceptionSubclassFailover());
  }

  @Test
  public void setVerifyServerCertificateTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setVerifyServerCertificate(true);

    // Assert
    assertTrue(mysqlDataSource.getVerifyServerCertificate());
  }

  @Test
  public void getVerifyServerCertificateTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getVerifyServerCertificate());
  }

  @Test
  public void setDefaultFetchSizeTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setDefaultFetchSize(1);

    // Assert
    assertEquals(1, mysqlDataSource.getDefaultFetchSize());
  }

  @Test
  public void getDefaultFetchSizeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0, (new MysqlDataSource()).getDefaultFetchSize());
  }

  @Test
  public void getLoadBalancePingTimeoutTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0, (new MysqlDataSource()).getLoadBalancePingTimeout());
  }

  @Test
  public void setConnectionLifecycleInterceptorsTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setConnectionLifecycleInterceptors("");

    // Assert
    assertEquals("", mysqlDataSource.getConnectionLifecycleInterceptors());
  }

  @Test
  public void getConnectionLifecycleInterceptorsTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getConnectionLifecycleInterceptors());
  }

  @Test
  public void setCacheServerConfigurationTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setCacheServerConfiguration(true);

    // Assert
    assertTrue(mysqlDataSource.getCacheServerConfiguration());
  }

  @Test
  public void getCacheServerConfigurationTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getCacheServerConfiguration());
  }

  @Test
  public void setUseColumnNamesInFindColumnTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setUseColumnNamesInFindColumn(true);

    // Assert
    assertTrue(mysqlDataSource.getUseColumnNamesInFindColumn());
  }

  @Test
  public void getUseColumnNamesInFindColumnTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getUseColumnNamesInFindColumn());
  }

  @Test
  public void setAllowMasterDownConnectionsTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setAllowMasterDownConnections(true);

    // Assert
    assertTrue(mysqlDataSource.getAllowMasterDownConnections());
  }

  @Test
  public void getAllowMasterDownConnectionsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getAllowMasterDownConnections());
  }

  @Test
  public void getIncludeInnodbStatusInDeadlockExceptionsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getIncludeInnodbStatusInDeadlockExceptions());
  }

  @Test
  public void getYearIsDateTypeTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getYearIsDateType());
  }

  @Test
  public void getReportMetricsIntervalMillisTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(30000, (new MysqlDataSource()).getReportMetricsIntervalMillis());
  }

  @Test
  public void getAutoClosePStmtStreamsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getAutoClosePStmtStreams());
  }

  @Test
  public void getUseNanosForElapsedTimeTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getUseNanosForElapsedTime());
  }

  @Test
  public void getPopulateInsertRowWithDefaultValuesTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getPopulateInsertRowWithDefaultValues());
  }

  @Test
  public void getIncludeThreadNamesAsStatementCommentTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getIncludeThreadNamesAsStatementComment());
  }

  @Test
  public void setGenerateSimpleParameterMetadataTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setGenerateSimpleParameterMetadata(true);

    // Assert
    assertTrue(mysqlDataSource.getGenerateSimpleParameterMetadata());
  }

  @Test
  public void getGenerateSimpleParameterMetadataTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getGenerateSimpleParameterMetadata());
  }

  @Test
  public void getXdevapiSSLTruststorePasswordTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getXdevapiSSLTruststorePassword());
  }

  @Test
  public void getElideSetAutoCommitsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getElideSetAutoCommits());
  }

  @Test
  public void getLoadBalanceValidateConnectionOnSwapServerTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getLoadBalanceValidateConnectionOnSwapServer());
  }

  @Test
  public void getEmulateLocatorsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getEmulateLocators());
  }

  @Test
  public void getUseInformationSchemaTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getUseInformationSchema());
  }

  @Test
  public void getNullCatalogMeansCurrentTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getNullCatalogMeansCurrent());
  }

  @Test
  public void getXdevapiUseAsyncProtocolTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getXdevapiUseAsyncProtocol());
  }

  @Test
  public void setXdevapiSSLModeTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new MysqlDataSource()).setXdevapiSSLMode("");
  }

  @Test
  public void getXdevapiSSLModeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("REQUIRED", (new MysqlDataSource()).getXdevapiSSLMode());
  }

  @Test
  public void setContinueBatchOnErrorTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setContinueBatchOnError(true);

    // Assert
    assertTrue(mysqlDataSource.getContinueBatchOnError());
  }

  @Test
  public void getContinueBatchOnErrorTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getContinueBatchOnError());
  }

  @Test
  public void getExplainSlowQueriesTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getExplainSlowQueries());
  }

  @Test
  public void setTrustCertificateKeyStorePasswordTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setTrustCertificateKeyStorePassword("");

    // Assert
    assertEquals("", mysqlDataSource.getTrustCertificateKeyStorePassword());
  }

  @Test
  public void getTrustCertificateKeyStorePasswordTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getTrustCertificateKeyStorePassword());
  }

  @Test
  public void getXdevapiSSLTruststoreTypeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("JKS", (new MysqlDataSource()).getXdevapiSSLTruststoreType());
  }

  @Test
  public void getProfileSQLTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getProfileSQL());
  }

  @Test
  public void getPadCharsWithSpaceTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getPadCharsWithSpace());
  }

  @Test
  public void getSecondsBeforeRetryMasterTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(30, (new MysqlDataSource()).getSecondsBeforeRetryMaster());
  }

  @Test
  public void setInitialTimeoutTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setInitialTimeout(1);

    // Assert
    assertEquals(1, mysqlDataSource.getInitialTimeout());
  }

  @Test
  public void getInitialTimeoutTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(2, (new MysqlDataSource()).getInitialTimeout());
  }

  @Test
  public void getGetProceduresReturnsFunctionsTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getGetProceduresReturnsFunctions());
  }

  @Test
  public void getRetriesAllDownTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(120, (new MysqlDataSource()).getRetriesAllDown());
  }

  @Test
  public void getPacketDebugBufferSizeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(20, (new MysqlDataSource()).getPacketDebugBufferSize());
  }

  @Test
  public void getServerRSAPublicKeyFileTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getServerRSAPublicKeyFile());
  }

  @Test
  public void setReadOnlyPropagatesToServerTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setReadOnlyPropagatesToServer(true);

    // Assert
    assertTrue(mysqlDataSource.getReadOnlyPropagatesToServer());
  }

  @Test
  public void getReadOnlyPropagatesToServerTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getReadOnlyPropagatesToServer());
  }

  @Test
  public void getUltraDevHackTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getUltraDevHack());
  }

  @Test
  public void getTransformedBitIsBooleanTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getTransformedBitIsBoolean());
  }

  @Test
  public void setTcpRcvBufTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setTcpRcvBuf(1);

    // Assert
    assertEquals(1, mysqlDataSource.getTcpRcvBuf());
  }

  @Test
  public void getTcpRcvBufTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0, (new MysqlDataSource()).getTcpRcvBuf());
  }

  @Test
  public void getLogXaCommandsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getLogXaCommands());
  }

  @Test
  public void getParseInfoCacheFactoryTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("com.mysql.cj.PerConnectionLRUFactory", (new MysqlDataSource()).getParseInfoCacheFactory());
  }

  @Test
  public void getAutoReconnectForPoolsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getAutoReconnectForPools());
  }

  @Test
  public void setSlowQueryThresholdNanosTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setSlowQueryThresholdNanos(1L);

    // Assert
    assertEquals(1L, mysqlDataSource.getSlowQueryThresholdNanos());
  }

  @Test
  public void getSlowQueryThresholdNanosTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0L, (new MysqlDataSource()).getSlowQueryThresholdNanos());
  }

  @Test
  public void setXdevapiConnectTimeoutTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setXdevapiConnectTimeout(1);

    // Assert
    assertEquals(1, mysqlDataSource.getXdevapiConnectTimeout());
  }

  @Test
  public void getXdevapiConnectTimeoutTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(10000, (new MysqlDataSource()).getXdevapiConnectTimeout());
  }

  @Test
  public void getUseReadAheadInputTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getUseReadAheadInput());
  }

  @Test
  public void getQueryInterceptorsTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getQueryInterceptors());
  }

  @Test
  public void getUseConfigsTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getUseConfigs());
  }

  @Test
  public void getSelfDestructOnPingSecondsLifetimeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0, (new MysqlDataSource()).getSelfDestructOnPingSecondsLifetime());
  }

  @Test
  public void getCharacterSetResultsTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getCharacterSetResults());
  }

  @Test
  public void setAuthenticationPluginsTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setAuthenticationPlugins("");

    // Assert
    assertEquals("", mysqlDataSource.getAuthenticationPlugins());
  }

  @Test
  public void getAuthenticationPluginsTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getAuthenticationPlugins());
  }

  @Test
  public void getStrictUpdatesTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getStrictUpdates());
  }

  @Test
  public void getProfilerEventHandlerTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("com.mysql.cj.log.LoggingProfilerEventHandler", (new MysqlDataSource()).getProfilerEventHandler());
  }

  @Test
  public void getCallableStmtCacheSizeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(100, (new MysqlDataSource()).getCallableStmtCacheSize());
  }

  @Test
  public void getReadFromMasterWhenNoSlavesTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getReadFromMasterWhenNoSlaves());
  }

  @Test
  public void setJdbcCompliantTruncationTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setJdbcCompliantTruncation(true);

    // Assert
    assertTrue(mysqlDataSource.getJdbcCompliantTruncation());
  }

  @Test
  public void getJdbcCompliantTruncationTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getJdbcCompliantTruncation());
  }

  @Test
  public void getResultSetSizeThresholdTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(100, (new MysqlDataSource()).getResultSetSizeThreshold());
  }

  @Test
  public void getServerAffinityOrderTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getServerAffinityOrder());
  }

  @Test
  public void getPropertiesTransformTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getPropertiesTransform());
  }

  @Test
  public void getCompensateOnDuplicateKeyUpdateCountsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getCompensateOnDuplicateKeyUpdateCounts());
  }

  @Test
  public void setTcpKeepAliveTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setTcpKeepAlive(true);

    // Assert
    assertTrue(mysqlDataSource.getTcpKeepAlive());
  }

  @Test
  public void getTcpKeepAliveTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getTcpKeepAlive());
  }

  @Test
  public void setNetTimeoutForStreamingResultsTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setNetTimeoutForStreamingResults(1);

    // Assert
    assertEquals(1, mysqlDataSource.getNetTimeoutForStreamingResults());
  }

  @Test
  public void getNetTimeoutForStreamingResultsTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(600, (new MysqlDataSource()).getNetTimeoutForStreamingResults());
  }

  @Test
  public void getLoadBalanceAutoCommitStatementRegexTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getLoadBalanceAutoCommitStatementRegex());
  }

  @Test
  public void getRequireSSLTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getRequireSSL());
  }

  @Test
  public void setUseCompressionTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setUseCompression(true);

    // Assert
    assertTrue(mysqlDataSource.getUseCompression());
  }

  @Test
  public void getUseCompressionTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getUseCompression());
  }

  @Test
  public void getUseAffectedRowsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getUseAffectedRows());
  }

  @Test
  public void setFailOverReadOnlyTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setFailOverReadOnly(true);

    // Assert
    assertTrue(mysqlDataSource.getFailOverReadOnly());
  }

  @Test
  public void getFailOverReadOnlyTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getFailOverReadOnly());
  }

  @Test
  public void getConnectionCollationTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getConnectionCollation());
  }

  @Test
  public void getExceptionInterceptorsTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getExceptionInterceptors());
  }

  @Test
  public void getAllowLoadLocalInfileTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getAllowLoadLocalInfile());
  }

  @Test
  public void getUseLocalSessionStateTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getUseLocalSessionState());
  }

  @Test
  public void getTinyInt1isBitTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getTinyInt1isBit());
  }

  @Test
  public void setUseServerPrepStmtsTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setUseServerPrepStmts(true);

    // Assert
    assertTrue(mysqlDataSource.getUseServerPrepStmts());
  }

  @Test
  public void getUseServerPrepStmtsTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getUseServerPrepStmts());
  }

  @Test
  public void getTcpTrafficClassTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0, (new MysqlDataSource()).getTcpTrafficClass());
  }

  @Test
  public void getClientInfoProviderTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("com.mysql.cj.jdbc.CommentClientInfoProvider", (new MysqlDataSource()).getClientInfoProvider());
  }

  @Test
  public void getRollbackOnPooledCloseTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getRollbackOnPooledClose());
  }

  @Test
  public void getAutoGenerateTestcaseScriptTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getAutoGenerateTestcaseScript());
  }

  @Test
  public void getServerConfigCacheFactoryTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("com.mysql.cj.util.PerVmServerConfigCacheFactory",
        (new MysqlDataSource()).getServerConfigCacheFactory());
  }

  @Test
  public void getLoadBalanceExceptionCheckerTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals("com.mysql.cj.jdbc.ha.StandardLoadBalanceExceptionChecker",
        (new MysqlDataSource()).getLoadBalanceExceptionChecker());
  }

  @Test
  public void getClientCertificateKeyStoreUrlTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getClientCertificateKeyStoreUrl());
  }

  @Test
  public void getClientCertificateKeyStorePasswordTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getClientCertificateKeyStorePassword());
  }

  @Test
  public void getHaEnableJMXTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getHaEnableJMX());
  }

  @Test
  public void getConnectTimeoutTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0, (new MysqlDataSource()).getConnectTimeout());
  }

  @Test
  public void getPasswordCharacterEncodingTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getPasswordCharacterEncoding());
  }

  @Test
  public void getMaxAllowedPacketTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(65535, (new MysqlDataSource()).getMaxAllowedPacket());
  }

  @Test
  public void getEmptyStringsConvertToZeroTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getEmptyStringsConvertToZero());
  }

  @Test
  public void getUseHostsInPrivilegesTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlDataSource()).getUseHostsInPrivileges());
  }

  @Test
  public void setAutoDeserializeTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setAutoDeserialize(true);

    // Assert
    assertTrue(mysqlDataSource.getAutoDeserialize());
  }

  @Test
  public void getAutoDeserializeTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).getAutoDeserialize());
  }

  @Test
  public void getSessionVariablesTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getSessionVariables());
  }

  @Test
  public void exposeAsPropertiesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new MysqlDataSource()).exposeAsProperties().size());
  }

  @Test
  public void setEnumRuntimePropertyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlDataSource()).setEnumRuntimeProperty("", "");
  }

  @Test
  public void getEnumRuntimePropertyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlDataSource()).getEnumRuntimeProperty("");
  }

  @Test
  public void setMemorySizeRuntimePropertyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlDataSource()).setMemorySizeRuntimeProperty("", 1);
  }

  @Test
  public void getMemorySizeRuntimePropertyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlDataSource()).getMemorySizeRuntimeProperty("");
  }

  @Test
  public void setLongRuntimePropertyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlDataSource()).setLongRuntimeProperty("", 1L);
  }

  @Test
  public void getLongRuntimePropertyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlDataSource()).getLongRuntimeProperty("");
  }

  @Test
  public void setIntegerRuntimePropertyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlDataSource()).setIntegerRuntimeProperty("", 1);
  }

  @Test
  public void getIntegerRuntimePropertyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlDataSource()).getIntegerRuntimeProperty("");
  }

  @Test
  public void setBooleanRuntimePropertyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlDataSource()).setBooleanRuntimeProperty("", true);
  }

  @Test
  public void getBooleanRuntimePropertyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlDataSource()).getBooleanRuntimeProperty("");
  }

  @Test
  public void setStringRuntimePropertyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlDataSource()).setStringRuntimeProperty("", "");
  }

  @Test
  public void getStringRuntimePropertyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlDataSource()).getStringRuntimeProperty("");
  }

  @Test
  public void isWrapperForTest() throws SQLException {
    // Arrange, Act and Assert
    assertFalse((new MysqlDataSource()).isWrapperFor(null));
  }

  @Test
  public void unwrapTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).<Object>unwrap(null));
  }

  @Test
  public void getParentLoggerTest() throws SQLFeatureNotSupportedException {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getParentLogger());
  }

  @Test
  public void getConnectionTest3() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLNonTransientConnectionException.class);
    (new MysqlDataSource()).getConnection(null);
  }

  @Test
  public void getUserTest() {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getUser());
  }

  @Test
  public void getUrlTest() {
    // Arrange, Act and Assert
    assertEquals("jdbc:mysql://:3306/", (new MysqlDataSource()).getUrl());
  }

  @Test
  public void setUrlTest() {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setUrl("");

    // Assert
    assertTrue(mysqlDataSource.explicitUrl);
    assertEquals("", mysqlDataSource.url);
  }

  @Test
  public void getURLTest() {
    // Arrange, Act and Assert
    assertEquals("jdbc:mysql://:3306/", (new MysqlDataSource()).getURL());
  }

  @Test
  public void setURLTest() {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setURL("");

    // Assert
    assertTrue(mysqlDataSource.explicitUrl);
    assertEquals("", mysqlDataSource.url);
  }

  @Test
  public void getServerNameTest() {
    // Arrange, Act and Assert
    assertEquals("", (new MysqlDataSource()).getServerName());
  }

  @Test
  public void setServerNameTest() {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setServerName("");

    // Assert
    assertEquals("", mysqlDataSource.hostName);
  }

  @Test
  public void getPortNumberTest() {
    // Arrange, Act and Assert
    assertEquals(3306, (new MysqlDataSource()).getPortNumber());
  }

  @Test
  public void setPortNumberTest() {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setPortNumber(1);

    // Assert
    assertEquals(1, mysqlDataSource.getPortNumber());
  }

  @Test
  public void getPortTest() {
    // Arrange, Act and Assert
    assertEquals(3306, (new MysqlDataSource()).getPort());
  }

  @Test
  public void setPortTest() {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setPort(1);

    // Assert
    assertEquals(1, mysqlDataSource.getPortNumber());
  }

  @Test
  public void getPasswordTest() {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getPassword());
  }

  @Test
  public void setPasswordTest() {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setPassword("");

    // Assert
    assertEquals("", mysqlDataSource.getPassword());
  }

  @Test
  public void getLoginTimeoutTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new MysqlDataSource()).getLoginTimeout());
  }

  @Test
  public void getLogWriterTest() {
    // Arrange, Act and Assert
    assertNull((new MysqlDataSource()).getLogWriter());
  }

  @Test
  public void setLogWriterTest() throws SQLException {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setLogWriter(null);

    // Assert
    assertNull(mysqlDataSource.logWriter);
  }

  @Test
  public void getDatabaseNameTest() {
    // Arrange, Act and Assert
    assertEquals("", (new MysqlDataSource()).getDatabaseName());
  }

  @Test
  public void setDatabaseNameTest() {
    // Arrange
    MysqlDataSource mysqlDataSource = new MysqlDataSource();

    // Act
    mysqlDataSource.setDatabaseName("");

    // Assert
    assertEquals("", mysqlDataSource.databaseName);
  }

  @Test
  public void getDescriptionTest() {
    // Arrange, Act and Assert
    assertEquals("MySQL Connector/J Data Source", (new MysqlDataSource()).getDescription());
  }

  @Test
  public void getConnectionTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLNonTransientConnectionException.class);
    (new MysqlDataSource()).getConnection("", "");
  }

  @Test
  public void getConnectionTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLNonTransientConnectionException.class);
    (new MysqlDataSource()).getConnection();
  }

  @Test
  public void constructorTest() throws SQLException {
    // Arrange and Act
    MysqlDataSource actualMysqlDataSource = new MysqlDataSource();

    // Assert
    String actualXdevapiSSLMode = actualMysqlDataSource.getXdevapiSSLMode();
    boolean actualReadOnlyPropagatesToServer = actualMysqlDataSource.getReadOnlyPropagatesToServer();
    String actualXdevapiSSLTruststore = actualMysqlDataSource.getXdevapiSSLTruststore();
    String actualEnabledSSLCipherSuites = actualMysqlDataSource.getEnabledSSLCipherSuites();
    int actualLoadBalanceAutoCommitStatementThreshold = actualMysqlDataSource
        .getLoadBalanceAutoCommitStatementThreshold();
    String actualTrustCertificateKeyStoreUrl = actualMysqlDataSource.getTrustCertificateKeyStoreUrl();
    boolean actualDetectCustomCollations = actualMysqlDataSource.getDetectCustomCollations();
    boolean actualVerifyServerCertificate = actualMysqlDataSource.getVerifyServerCertificate();
    boolean actualRewriteBatchedStatements = actualMysqlDataSource.getRewriteBatchedStatements();
    long actualSlowQueryThresholdNanos = actualMysqlDataSource.getSlowQueryThresholdNanos();
    boolean actualUseColumnNamesInFindColumn = actualMysqlDataSource.getUseColumnNamesInFindColumn();
    int actualSocketTimeout = actualMysqlDataSource.getSocketTimeout();
    boolean actualUseOnlyServerErrorMessages = actualMysqlDataSource.getUseOnlyServerErrorMessages();
    boolean actualAutoDeserialize = actualMysqlDataSource.getAutoDeserialize();
    boolean actualGenerateSimpleParameterMetadata = actualMysqlDataSource.getGenerateSimpleParameterMetadata();
    String actualLocalSocketAddress = actualMysqlDataSource.getLocalSocketAddress();
    boolean actualInteractiveClient = actualMysqlDataSource.getInteractiveClient();
    String actualAuthenticationPlugins = actualMysqlDataSource.getAuthenticationPlugins();
    int actualTcpRcvBuf = actualMysqlDataSource.getTcpRcvBuf();
    String actualTrustCertificateKeyStorePassword = actualMysqlDataSource.getTrustCertificateKeyStorePassword();
    boolean actualContinueBatchOnError = actualMysqlDataSource.getContinueBatchOnError();
    boolean actualAllowMasterDownConnections = actualMysqlDataSource.getAllowMasterDownConnections();
    int actualPortNumber = actualMysqlDataSource.getPortNumber();
    int actualXdevapiConnectTimeout = actualMysqlDataSource.getXdevapiConnectTimeout();
    boolean actualOverrideSupportsIntegrityEnhancementFacility = actualMysqlDataSource
        .getOverrideSupportsIntegrityEnhancementFacility();
    boolean actualTraceProtocol = actualMysqlDataSource.getTraceProtocol();
    String actualSocketFactory = actualMysqlDataSource.getSocketFactory();
    String actualConnectionLifecycleInterceptors = actualMysqlDataSource.getConnectionLifecycleInterceptors();
    String actualConnectionAttributes = actualMysqlDataSource.getConnectionAttributes();
    boolean actualUseCompression = actualMysqlDataSource.getUseCompression();
    int actualMaxQuerySizeToLog = actualMysqlDataSource.getMaxQuerySizeToLog();
    boolean actualGatherPerfMetrics = actualMysqlDataSource.getGatherPerfMetrics();
    int actualNetTimeoutForStreamingResults = actualMysqlDataSource.getNetTimeoutForStreamingResults();
    boolean actualUseOldAliasMetadataBehavior = actualMysqlDataSource.getUseOldAliasMetadataBehavior();
    boolean actualCacheServerConfiguration = actualMysqlDataSource.getCacheServerConfiguration();
    boolean actualEnableEscapeProcessing = actualMysqlDataSource.getEnableEscapeProcessing();
    boolean actualUseServerPrepStmts = actualMysqlDataSource.getUseServerPrepStmts();
    boolean actualFailOverReadOnly = actualMysqlDataSource.getFailOverReadOnly();
    String actualReplicationConnectionGroup = actualMysqlDataSource.getReplicationConnectionGroup();
    boolean actualJdbcCompliantTruncation = actualMysqlDataSource.getJdbcCompliantTruncation();
    boolean actualTcpKeepAlive = actualMysqlDataSource.getTcpKeepAlive();
    String actualClobCharacterEncoding = actualMysqlDataSource.getClobCharacterEncoding();
    boolean actualUseSSL = actualMysqlDataSource.getUseSSL();
    int actualInitialTimeout = actualMysqlDataSource.getInitialTimeout();
    String actualCharacterEncoding = actualMysqlDataSource.getCharacterEncoding();
    String actualHaLoadBalanceStrategy = actualMysqlDataSource.getHaLoadBalanceStrategy();
    String actualPassword = actualMysqlDataSource.getPassword();
    int actualDefaultFetchSize = actualMysqlDataSource.getDefaultFetchSize();
    assertEquals("REQUIRED", actualXdevapiSSLMode);
    assertFalse(actualMysqlDataSource.explicitUrl);
    assertNull(actualMysqlDataSource.url);
    assertEquals("false", actualMysqlDataSource.profileSQLString);
    assertNull(actualMysqlDataSource.encoding);
    assertNull(actualMysqlDataSource.hostName);
    assertNull(actualMysqlDataSource.logWriter);
    assertNull(actualMysqlDataSource.databaseName);
    assertFalse(actualMysqlDataSource.getBlobsAreStrings());
    assertEquals(0, actualDefaultFetchSize);
    assertNull(actualPassword);
    assertEquals("random", actualHaLoadBalanceStrategy);
    assertNull(actualCharacterEncoding);
    assertEquals(2, actualInitialTimeout);
    assertTrue(actualUseSSL);
    assertNull(actualClobCharacterEncoding);
    assertTrue(actualTcpKeepAlive);
    assertTrue(actualJdbcCompliantTruncation);
    assertNull(actualReplicationConnectionGroup);
    assertTrue(actualFailOverReadOnly);
    assertFalse(actualUseServerPrepStmts);
    assertTrue(actualEnableEscapeProcessing);
    assertFalse(actualCacheServerConfiguration);
    assertFalse(actualUseOldAliasMetadataBehavior);
    assertEquals(600, actualNetTimeoutForStreamingResults);
    assertFalse(actualGatherPerfMetrics);
    assertEquals(2048, actualMaxQuerySizeToLog);
    assertFalse(actualUseCompression);
    assertNull(actualConnectionAttributes);
    assertNull(actualConnectionLifecycleInterceptors);
    assertEquals("com.mysql.cj.protocol.StandardSocketFactory", actualSocketFactory);
    assertFalse(actualTraceProtocol);
    assertFalse(actualOverrideSupportsIntegrityEnhancementFacility);
    assertEquals(10000, actualXdevapiConnectTimeout);
    assertEquals(3306, actualPortNumber);
    assertFalse(actualAllowMasterDownConnections);
    assertTrue(actualContinueBatchOnError);
    assertNull(actualTrustCertificateKeyStorePassword);
    assertEquals(0, actualTcpRcvBuf);
    assertNull(actualAuthenticationPlugins);
    assertFalse(actualInteractiveClient);
    assertNull(actualLocalSocketAddress);
    assertFalse(actualGenerateSimpleParameterMetadata);
    assertFalse(actualAutoDeserialize);
    assertTrue(actualUseOnlyServerErrorMessages);
    assertEquals(0, actualSocketTimeout);
    assertFalse(actualUseColumnNamesInFindColumn);
    assertEquals(0L, actualSlowQueryThresholdNanos);
    assertFalse(actualRewriteBatchedStatements);
    assertFalse(actualVerifyServerCertificate);
    assertFalse(actualDetectCustomCollations);
    assertNull(actualTrustCertificateKeyStoreUrl);
    assertEquals(0, actualLoadBalanceAutoCommitStatementThreshold);
    assertNull(actualEnabledSSLCipherSuites);
    assertNull(actualXdevapiSSLTruststore);
    assertTrue(actualReadOnlyPropagatesToServer);
  }
}
