package com.mysql.cj;

import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.conf.HostInfo;
import com.mysql.cj.exceptions.CJCommunicationsException;
import com.mysql.cj.exceptions.CJException;
import com.mysql.cj.exceptions.ConnectionIsClosedException;
import com.mysql.cj.interceptors.QueryInterceptor;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import com.mysql.cj.protocol.NetworkResources;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.protocol.a.NativePacketPayload;
import com.mysql.cj.protocol.a.ResultsetFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketAddress;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NativeSessionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void checkClosedTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(ConnectionIsClosedException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).checkClosed();
  }
  @Test
  public void pingTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(ConnectionIsClosedException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).ping(true, 1);
  }
  @Test
  public void execSQLTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();
    NativeSession nativeSession = new NativeSession(hostInfo, new DefaultPropertySet());
    NativePacketPayload packet = new NativePacketPayload(1);
    ResultsetFactory resultSetFactory = new ResultsetFactory(Resultset.Type.FORWARD_ONLY,
        Resultset.Concurrency.READ_ONLY);

    // Act and Assert
    thrown.expect(CJException.class);
    nativeSession.<Resultset>execSQL(null, "", 1, packet, true, resultSetFactory, new CachedResultSetMetaDataImpl(),
        true);
  }
  @Test
  public void queryServerVariableTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).queryServerVariable("");
  }
  @Test
  public void getProcessHostTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).getProcessHost();
  }
  @Test
  public void buildCollationMappingTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).buildCollationMapping();
  }
  @Test
  public void loadServerVariablesTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).loadServerVariables("", "");
  }
  @Test
  public void configureClientCharacterSetTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).configureClientCharacterSet(true);
  }
  @Test
  public void setLocalInfileInputStreamTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();
    NativeSession nativeSession = new NativeSession(hostInfo, new DefaultPropertySet());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    nativeSession.setLocalInfileInputStream(new ByteArrayInputStream(new byte[24]));
  }
  @Test
  public void getLocalInfileInputStreamTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).getLocalInfileInputStream();
  }
  @Test
  public void getRemoteSocketAddressTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).getRemoteSocketAddress();
  }
  @Test
  public void getCommandCountTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).getCommandCount();
  }
  @Test
  public void isSSLEstablishedTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).isSSLEstablished();
  }
  @Test
  public void getNetworkResourcesTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).getNetworkResources();
  }
  @Test
  public void clearInputStreamTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).clearInputStream();
  }
  @Test
  public void hadWarningsTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).hadWarnings();
  }
  @Test
  public void getSlowQueryThresholdTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).getSlowQueryThreshold();
  }
  @Test
  public void sendCommandTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();
    NativeSession nativeSession = new NativeSession(hostInfo, new DefaultPropertySet());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    nativeSession.sendCommand(new NativePacketPayload(1), true, 1);
  }
  @Test
  public void getCurrentTimeNanosOrMillisTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).getCurrentTimeNanosOrMillis();
  }
  @Test
  public void shouldInterceptTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).shouldIntercept();
  }
  @Test
  public void dumpPacketRingBufferTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).dumpPacketRingBuffer();
  }
  @Test
  public void getSharedSendPacketTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).getSharedSendPacket();
  }
  @Test
  public void checkForCharsetMismatchTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).checkForCharsetMismatch();
  }
  @Test
  public void setSocketTimeoutTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).setSocketTimeout(1);
  }
  @Test
  public void shutdownServerTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).shutdownServer();
  }
  @Test
  public void isServerLocalTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).isServerLocal(null);
  }
  @Test
  public void setQueryInterceptorsTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).setQueryInterceptors(null);
  }
  @Test
  public void isSetNeededForAutoCommitModeTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).isSetNeededForAutoCommitMode(true);
  }
  @Test
  public void disableMultiQueriesTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).disableMultiQueries();
  }
  @Test
  public void enableMultiQueriesTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).enableMultiQueries();
  }
  @Test
  public void connectTest() throws IOException {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(CJCommunicationsException.class);
    (new NativeSession(hostInfo, new DefaultPropertySet())).connect(hostInfo, "", "", "", 1, null);
  }
}
