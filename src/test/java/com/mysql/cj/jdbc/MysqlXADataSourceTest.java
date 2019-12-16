package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.sql.SQLException;
import java.sql.SQLNonTransientConnectionException;
import javax.sql.XAConnection;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysqlXADataSourceTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getXAConnectionTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLNonTransientConnectionException.class);
    (new MysqlXADataSource()).getXAConnection("aaaaa", "aaaaa");
  }

  @Test
  public void getXAConnectionTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLNonTransientConnectionException.class);
    (new MysqlXADataSource()).getXAConnection();
  }

  @Test
  public void constructorTest() throws SQLException {
    // Arrange and Act
    MysqlXADataSource actualMysqlXADataSource = new MysqlXADataSource();

    // Assert
    String actualXdevapiSSLMode = actualMysqlXADataSource.getXdevapiSSLMode();
    boolean actualReadOnlyPropagatesToServer = actualMysqlXADataSource.getReadOnlyPropagatesToServer();
    String actualXdevapiSSLTruststore = actualMysqlXADataSource.getXdevapiSSLTruststore();
    String actualEnabledSSLCipherSuites = actualMysqlXADataSource.getEnabledSSLCipherSuites();
    int actualLoadBalanceAutoCommitStatementThreshold = actualMysqlXADataSource
        .getLoadBalanceAutoCommitStatementThreshold();
    String actualTrustCertificateKeyStoreUrl = actualMysqlXADataSource.getTrustCertificateKeyStoreUrl();
    boolean actualDetectCustomCollations = actualMysqlXADataSource.getDetectCustomCollations();
    boolean actualVerifyServerCertificate = actualMysqlXADataSource.getVerifyServerCertificate();
    boolean actualRewriteBatchedStatements = actualMysqlXADataSource.getRewriteBatchedStatements();
    long actualSlowQueryThresholdNanos = actualMysqlXADataSource.getSlowQueryThresholdNanos();
    boolean actualUseColumnNamesInFindColumn = actualMysqlXADataSource.getUseColumnNamesInFindColumn();
    int actualSocketTimeout = actualMysqlXADataSource.getSocketTimeout();
    boolean actualUseOnlyServerErrorMessages = actualMysqlXADataSource.getUseOnlyServerErrorMessages();
    boolean actualAutoDeserialize = actualMysqlXADataSource.getAutoDeserialize();
    boolean actualGenerateSimpleParameterMetadata = actualMysqlXADataSource.getGenerateSimpleParameterMetadata();
    String actualLocalSocketAddress = actualMysqlXADataSource.getLocalSocketAddress();
    boolean actualInteractiveClient = actualMysqlXADataSource.getInteractiveClient();
    String actualAuthenticationPlugins = actualMysqlXADataSource.getAuthenticationPlugins();
    int actualTcpRcvBuf = actualMysqlXADataSource.getTcpRcvBuf();
    String actualTrustCertificateKeyStorePassword = actualMysqlXADataSource.getTrustCertificateKeyStorePassword();
    boolean actualContinueBatchOnError = actualMysqlXADataSource.getContinueBatchOnError();
    boolean actualAllowMasterDownConnections = actualMysqlXADataSource.getAllowMasterDownConnections();
    int actualPortNumber = actualMysqlXADataSource.getPortNumber();
    int actualXdevapiConnectTimeout = actualMysqlXADataSource.getXdevapiConnectTimeout();
    boolean actualOverrideSupportsIntegrityEnhancementFacility = actualMysqlXADataSource
        .getOverrideSupportsIntegrityEnhancementFacility();
    boolean actualTraceProtocol = actualMysqlXADataSource.getTraceProtocol();
    String actualSocketFactory = actualMysqlXADataSource.getSocketFactory();
    String actualConnectionLifecycleInterceptors = actualMysqlXADataSource.getConnectionLifecycleInterceptors();
    String actualConnectionAttributes = actualMysqlXADataSource.getConnectionAttributes();
    boolean actualUseCompression = actualMysqlXADataSource.getUseCompression();
    int actualMaxQuerySizeToLog = actualMysqlXADataSource.getMaxQuerySizeToLog();
    boolean actualGatherPerfMetrics = actualMysqlXADataSource.getGatherPerfMetrics();
    int actualNetTimeoutForStreamingResults = actualMysqlXADataSource.getNetTimeoutForStreamingResults();
    boolean actualUseOldAliasMetadataBehavior = actualMysqlXADataSource.getUseOldAliasMetadataBehavior();
    boolean actualCacheServerConfiguration = actualMysqlXADataSource.getCacheServerConfiguration();
    boolean actualEnableEscapeProcessing = actualMysqlXADataSource.getEnableEscapeProcessing();
    boolean actualUseServerPrepStmts = actualMysqlXADataSource.getUseServerPrepStmts();
    boolean actualFailOverReadOnly = actualMysqlXADataSource.getFailOverReadOnly();
    String actualReplicationConnectionGroup = actualMysqlXADataSource.getReplicationConnectionGroup();
    boolean actualJdbcCompliantTruncation = actualMysqlXADataSource.getJdbcCompliantTruncation();
    boolean actualTcpKeepAlive = actualMysqlXADataSource.getTcpKeepAlive();
    String actualClobCharacterEncoding = actualMysqlXADataSource.getClobCharacterEncoding();
    boolean actualUseSSL = actualMysqlXADataSource.getUseSSL();
    int actualInitialTimeout = actualMysqlXADataSource.getInitialTimeout();
    String actualCharacterEncoding = actualMysqlXADataSource.getCharacterEncoding();
    String actualHaLoadBalanceStrategy = actualMysqlXADataSource.getHaLoadBalanceStrategy();
    String actualPassword = actualMysqlXADataSource.getPassword();
    assertEquals("REQUIRED", actualXdevapiSSLMode);
    assertEquals(0, actualMysqlXADataSource.getDefaultFetchSize());
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
