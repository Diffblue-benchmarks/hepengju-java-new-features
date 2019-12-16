package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.sql.SQLException;
import java.sql.SQLNonTransientConnectionException;
import javax.sql.PooledConnection;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysqlConnectionPoolDataSourceTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getPooledConnectionTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLNonTransientConnectionException.class);
    (new MysqlConnectionPoolDataSource()).getPooledConnection("aaaaa", "aaaaa");
  }

  @Test
  public void getPooledConnectionTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLNonTransientConnectionException.class);
    (new MysqlConnectionPoolDataSource()).getPooledConnection();
  }

  @Test
  public void constructorTest() throws SQLException {
    // Arrange and Act
    MysqlConnectionPoolDataSource actualMysqlConnectionPoolDataSource = new MysqlConnectionPoolDataSource();

    // Assert
    String actualXdevapiSSLMode = actualMysqlConnectionPoolDataSource.getXdevapiSSLMode();
    boolean actualReadOnlyPropagatesToServer = actualMysqlConnectionPoolDataSource.getReadOnlyPropagatesToServer();
    String actualXdevapiSSLTruststore = actualMysqlConnectionPoolDataSource.getXdevapiSSLTruststore();
    String actualEnabledSSLCipherSuites = actualMysqlConnectionPoolDataSource.getEnabledSSLCipherSuites();
    int actualLoadBalanceAutoCommitStatementThreshold = actualMysqlConnectionPoolDataSource
        .getLoadBalanceAutoCommitStatementThreshold();
    String actualTrustCertificateKeyStoreUrl = actualMysqlConnectionPoolDataSource.getTrustCertificateKeyStoreUrl();
    boolean actualDetectCustomCollations = actualMysqlConnectionPoolDataSource.getDetectCustomCollations();
    boolean actualVerifyServerCertificate = actualMysqlConnectionPoolDataSource.getVerifyServerCertificate();
    boolean actualRewriteBatchedStatements = actualMysqlConnectionPoolDataSource.getRewriteBatchedStatements();
    long actualSlowQueryThresholdNanos = actualMysqlConnectionPoolDataSource.getSlowQueryThresholdNanos();
    boolean actualUseColumnNamesInFindColumn = actualMysqlConnectionPoolDataSource.getUseColumnNamesInFindColumn();
    int actualSocketTimeout = actualMysqlConnectionPoolDataSource.getSocketTimeout();
    boolean actualUseOnlyServerErrorMessages = actualMysqlConnectionPoolDataSource.getUseOnlyServerErrorMessages();
    boolean actualAutoDeserialize = actualMysqlConnectionPoolDataSource.getAutoDeserialize();
    boolean actualGenerateSimpleParameterMetadata = actualMysqlConnectionPoolDataSource
        .getGenerateSimpleParameterMetadata();
    String actualLocalSocketAddress = actualMysqlConnectionPoolDataSource.getLocalSocketAddress();
    boolean actualInteractiveClient = actualMysqlConnectionPoolDataSource.getInteractiveClient();
    String actualAuthenticationPlugins = actualMysqlConnectionPoolDataSource.getAuthenticationPlugins();
    int actualTcpRcvBuf = actualMysqlConnectionPoolDataSource.getTcpRcvBuf();
    String actualTrustCertificateKeyStorePassword = actualMysqlConnectionPoolDataSource
        .getTrustCertificateKeyStorePassword();
    boolean actualContinueBatchOnError = actualMysqlConnectionPoolDataSource.getContinueBatchOnError();
    boolean actualAllowMasterDownConnections = actualMysqlConnectionPoolDataSource.getAllowMasterDownConnections();
    int actualPortNumber = actualMysqlConnectionPoolDataSource.getPortNumber();
    int actualXdevapiConnectTimeout = actualMysqlConnectionPoolDataSource.getXdevapiConnectTimeout();
    boolean actualOverrideSupportsIntegrityEnhancementFacility = actualMysqlConnectionPoolDataSource
        .getOverrideSupportsIntegrityEnhancementFacility();
    boolean actualTraceProtocol = actualMysqlConnectionPoolDataSource.getTraceProtocol();
    String actualSocketFactory = actualMysqlConnectionPoolDataSource.getSocketFactory();
    String actualConnectionLifecycleInterceptors = actualMysqlConnectionPoolDataSource
        .getConnectionLifecycleInterceptors();
    String actualConnectionAttributes = actualMysqlConnectionPoolDataSource.getConnectionAttributes();
    boolean actualUseCompression = actualMysqlConnectionPoolDataSource.getUseCompression();
    int actualMaxQuerySizeToLog = actualMysqlConnectionPoolDataSource.getMaxQuerySizeToLog();
    boolean actualGatherPerfMetrics = actualMysqlConnectionPoolDataSource.getGatherPerfMetrics();
    int actualNetTimeoutForStreamingResults = actualMysqlConnectionPoolDataSource.getNetTimeoutForStreamingResults();
    boolean actualUseOldAliasMetadataBehavior = actualMysqlConnectionPoolDataSource.getUseOldAliasMetadataBehavior();
    boolean actualCacheServerConfiguration = actualMysqlConnectionPoolDataSource.getCacheServerConfiguration();
    boolean actualEnableEscapeProcessing = actualMysqlConnectionPoolDataSource.getEnableEscapeProcessing();
    boolean actualUseServerPrepStmts = actualMysqlConnectionPoolDataSource.getUseServerPrepStmts();
    boolean actualFailOverReadOnly = actualMysqlConnectionPoolDataSource.getFailOverReadOnly();
    String actualReplicationConnectionGroup = actualMysqlConnectionPoolDataSource.getReplicationConnectionGroup();
    boolean actualJdbcCompliantTruncation = actualMysqlConnectionPoolDataSource.getJdbcCompliantTruncation();
    boolean actualTcpKeepAlive = actualMysqlConnectionPoolDataSource.getTcpKeepAlive();
    String actualClobCharacterEncoding = actualMysqlConnectionPoolDataSource.getClobCharacterEncoding();
    boolean actualUseSSL = actualMysqlConnectionPoolDataSource.getUseSSL();
    int actualInitialTimeout = actualMysqlConnectionPoolDataSource.getInitialTimeout();
    String actualCharacterEncoding = actualMysqlConnectionPoolDataSource.getCharacterEncoding();
    String actualHaLoadBalanceStrategy = actualMysqlConnectionPoolDataSource.getHaLoadBalanceStrategy();
    String actualPassword = actualMysqlConnectionPoolDataSource.getPassword();
    int actualDefaultFetchSize = actualMysqlConnectionPoolDataSource.getDefaultFetchSize();
    assertEquals("REQUIRED", actualXdevapiSSLMode);
    assertFalse(actualMysqlConnectionPoolDataSource.getBlobsAreStrings());
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
