package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.ServerVersion;
import com.mysql.cj.conf.DefaultPropertySet;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NativeServerSessionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

//failed_compile @Test
//  public void getDefaultTimeZoneTest() {
//    // Arrange, Act and Assert
//    assertTrue(
//        (new NativeServerSession(new DefaultPropertySet())).getDefaultTimeZone() instanceof sun.util.calendar.ZoneInfo);
//  }

  @Test
  public void getServerTimeZoneTest() {
    // Arrange, Act and Assert
    assertNull((new NativeServerSession(new DefaultPropertySet())).getServerTimeZone());
  }

  @Test
  public void setAutoCommitTest() {
    // Arrange
    NativeServerSession nativeServerSession = new NativeServerSession(new DefaultPropertySet());

    // Act
    nativeServerSession.setAutoCommit(true);

    // Assert
    assertTrue(nativeServerSession.isAutoCommit());
  }

  @Test
  public void isAutoCommitTest() {
    // Arrange, Act and Assert
    assertTrue((new NativeServerSession(new DefaultPropertySet())).isAutoCommit());
  }

  @Test
  public void setThreadIdTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeServerSession(new DefaultPropertySet())).setThreadId(1L);
  }

  @Test
  public void getThreadIdTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeServerSession(new DefaultPropertySet())).getThreadId();
  }

  @Test
  public void isServerTruncatesFracSecsTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).isServerTruncatesFracSecs());
  }

  @Test
  public void useAnsiQuotedIdentifiersTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).useAnsiQuotedIdentifiers());
  }

  @Test
  public void isNoBackslashEscapesSetTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).isNoBackslashEscapesSet());
  }

  @Test
  public void isQueryCacheEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).isQueryCacheEnabled());
  }

  @Test
  public void storesLowerCaseTableNamesTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).storesLowerCaseTableNames());
  }

  @Test
  public void isLowerCaseTableNamesTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).isLowerCaseTableNames());
  }

  @Test
  public void preserveOldTransactionStateTest() {
    // Arrange
    NativeServerSession nativeServerSession = new NativeServerSession(new DefaultPropertySet());

    // Act
    nativeServerSession.preserveOldTransactionState();

    // Assert
    assertFalse(nativeServerSession.hasMoreResults());
  }

  @Test
  public void setCharacterSetResultsOnServerTest() {
    // Arrange
    NativeServerSession nativeServerSession = new NativeServerSession(new DefaultPropertySet());

    // Act
    nativeServerSession.setCharacterSetResultsOnServer("0");

    // Assert
    assertEquals("0", nativeServerSession.getCharacterSetResultsOnServer());
  }

  @Test
  public void getCharacterSetResultsOnServerTest() {
    // Arrange, Act and Assert
    assertNull((new NativeServerSession(new DefaultPropertySet())).getCharacterSetResultsOnServer());
  }

  @Test
  public void setMetadataCollationIndexTest() {
    // Arrange
    NativeServerSession nativeServerSession = new NativeServerSession(new DefaultPropertySet());

    // Act
    nativeServerSession.setMetadataCollationIndex(1);

    // Assert
    assertEquals(1, nativeServerSession.getMetadataCollationIndex());
  }

  @Test
  public void getMetadataCollationIndexTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NativeServerSession(new DefaultPropertySet())).getMetadataCollationIndex());
  }

  @Test
  public void setCharacterSetMetadataTest() {
    // Arrange
    NativeServerSession nativeServerSession = new NativeServerSession(new DefaultPropertySet());

    // Act
    nativeServerSession.setCharacterSetMetadata("0");

    // Assert
    assertEquals("0", nativeServerSession.getCharacterSetMetadata());
  }

  @Test
  public void getCharacterSetMetadataTest() {
    // Arrange, Act and Assert
    assertNull((new NativeServerSession(new DefaultPropertySet())).getCharacterSetMetadata());
  }

  @Test
  public void configureCharacterSetsTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeServerSession(new DefaultPropertySet())).configureCharacterSets();
  }

  @Test
  public void getEncodingForIndexTest() {
    // Arrange, Act and Assert
    assertEquals("BIG5", (new NativeServerSession(new DefaultPropertySet())).getEncodingForIndex(1));
  }

  @Test
  public void getMaxBytesPerCharTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeServerSession(new DefaultPropertySet())).getMaxBytesPerChar(null, "0");
  }

  @Test
  public void getMaxBytesPerCharTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeServerSession(new DefaultPropertySet())).getMaxBytesPerChar("0");
  }

  @Test
  public void getServerDefaultCharsetTest() {
    // Arrange, Act and Assert
    assertEquals("utf8", (new NativeServerSession(new DefaultPropertySet())).getServerDefaultCharset());
  }

  @Test
  public void setErrorMessageEncodingTest() {
    // Arrange
    NativeServerSession nativeServerSession = new NativeServerSession(new DefaultPropertySet());

    // Act
    nativeServerSession.setErrorMessageEncoding("0");

    // Assert
    assertEquals("0", nativeServerSession.getErrorMessageEncoding());
  }

  @Test
  public void getErrorMessageEncodingTest() {
    // Arrange, Act and Assert
    assertEquals("Cp1252", (new NativeServerSession(new DefaultPropertySet())).getErrorMessageEncoding());
  }

  @Test
  public void isSetNeededForAutoCommitModeTest() {
    // Arrange, Act and Assert
    assertTrue((new NativeServerSession(new DefaultPropertySet())).isSetNeededForAutoCommitMode(true, true));
  }

  @Test
  public void isVersionTest() {
    // Arrange
    NativeServerSession nativeServerSession = new NativeServerSession(new DefaultPropertySet());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    nativeServerSession.isVersion(ServerVersion.parseVersion("0"));
  }

  @Test
  public void getServerVersionTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeServerSession(new DefaultPropertySet())).getServerVersion();
  }

  @Test
  public void characterSetNamesMatchesTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).characterSetNamesMatches("0"));
  }

  @Test
  public void setServerVariablesTest() {
    // Arrange
    NativeServerSession nativeServerSession = new NativeServerSession(new DefaultPropertySet());

    // Act
    nativeServerSession.setServerVariables(null);

    // Assert
    assertNull(nativeServerSession.getServerVariables());
  }

  @Test
  public void getServerVariableTest2() {
    // Arrange, Act and Assert
    assertEquals(1, (new NativeServerSession(new DefaultPropertySet())).getServerVariable("0", 1));
  }

  @Test
  public void getServerVariableTest() {
    // Arrange, Act and Assert
    assertNull((new NativeServerSession(new DefaultPropertySet())).getServerVariable("0"));
  }

  @Test
  public void getServerVariablesTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new NativeServerSession(new DefaultPropertySet())).getServerVariables().size());
  }

  @Test
  public void setHasLongColumnInfoTest() {
    // Arrange
    NativeServerSession nativeServerSession = new NativeServerSession(new DefaultPropertySet());

    // Act
    nativeServerSession.setHasLongColumnInfo(true);

    // Assert
    assertTrue(nativeServerSession.hasLongColumnInfo());
  }

  @Test
  public void hasLongColumnInfoTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).hasLongColumnInfo());
  }

  @Test
  public void setServerDefaultCollationIndexTest() {
    // Arrange
    NativeServerSession nativeServerSession = new NativeServerSession(new DefaultPropertySet());

    // Act
    nativeServerSession.setServerDefaultCollationIndex(1);

    // Assert
    assertEquals(1, nativeServerSession.getServerDefaultCollationIndex());
  }

  @Test
  public void getServerDefaultCollationIndexTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NativeServerSession(new DefaultPropertySet())).getServerDefaultCollationIndex());
  }

  @Test
  public void isEOFDeprecatedTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).isEOFDeprecated());
  }

  @Test
  public void useMultiResultsTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).useMultiResults());
  }

  @Test
  public void setClientParamTest() {
    // Arrange
    NativeServerSession nativeServerSession = new NativeServerSession(new DefaultPropertySet());

    // Act
    nativeServerSession.setClientParam(1L);

    // Assert
    assertEquals(1L, nativeServerSession.getClientParam());
  }

  @Test
  public void getClientParamTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new NativeServerSession(new DefaultPropertySet())).getClientParam());
  }

  @Test
  public void isLastRowSentTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).isLastRowSent());
  }

  @Test
  public void queryWasSlowTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).queryWasSlow());
  }

  @Test
  public void noIndexUsedTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).noIndexUsed());
  }

  @Test
  public void noGoodIndexUsedTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).noGoodIndexUsed());
  }

  @Test
  public void hasMoreResultsTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).hasMoreResults());
  }

  @Test
  public void isAutocommitTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).isAutocommit());
  }

  @Test
  public void cursorExistsTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).cursorExists());
  }

  @Test
  public void inTransactionOnServerTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeServerSession(new DefaultPropertySet())).inTransactionOnServer());
  }

  @Test
  public void getTransactionStateTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NativeServerSession(new DefaultPropertySet())).getTransactionState());
  }

  @Test
  public void setOldStatusFlagsTest() {
    // Arrange
    NativeServerSession nativeServerSession = new NativeServerSession(new DefaultPropertySet());

    // Act
    nativeServerSession.setOldStatusFlags(1);

    // Assert
    assertEquals(1, nativeServerSession.getOldStatusFlags());
  }

  @Test
  public void getOldStatusFlagsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NativeServerSession(new DefaultPropertySet())).getOldStatusFlags());
  }

  @Test
  public void setStatusFlagsTest2() {
    // Arrange
    NativeServerSession nativeServerSession = new NativeServerSession(new DefaultPropertySet());

    // Act
    nativeServerSession.setStatusFlags(1, true);

    // Assert
    int actualOldStatusFlags = nativeServerSession.getOldStatusFlags();
    assertFalse(nativeServerSession.hasMoreResults());
    assertEquals(0, actualOldStatusFlags);
  }

  @Test
  public void setStatusFlagsTest() {
    // Arrange
    NativeServerSession nativeServerSession = new NativeServerSession(new DefaultPropertySet());

    // Act
    nativeServerSession.setStatusFlags(1);

    // Assert
    assertFalse(nativeServerSession.hasMoreResults());
  }

  @Test
  public void getStatusFlagsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NativeServerSession(new DefaultPropertySet())).getStatusFlags());
  }

  @Test
  public void setCapabilitiesTest() {
    // Arrange
    NativeServerSession nativeServerSession = new NativeServerSession(new DefaultPropertySet());

    // Act
    nativeServerSession.setCapabilities(new NativeCapabilities());

    // Assert
    assertEquals(-1L, nativeServerSession.getThreadId());
  }

  @Test
  public void getCapabilitiesTest() {
    // Arrange, Act and Assert
    assertNull((new NativeServerSession(new DefaultPropertySet())).getCapabilities());
  }

//failed_compile @Test
//  public void constructorTest() {
//    // Arrange and Act
//    NativeServerSession actualNativeServerSession = new NativeServerSession(new DefaultPropertySet());
//
//    // Assert
//    String actualServerDefaultCharset = actualNativeServerSession.getServerDefaultCharset();
//    boolean actualHasLongColumnInfoResult = actualNativeServerSession.hasLongColumnInfo();
//    String actualCharacterSetMetadata = actualNativeServerSession.getCharacterSetMetadata();
//    TimeZone defaultTimeZone = actualNativeServerSession.getDefaultTimeZone();
//    String actualCharacterSetResultsOnServer = actualNativeServerSession.getCharacterSetResultsOnServer();
//    int actualOldStatusFlags = actualNativeServerSession.getOldStatusFlags();
//    long actualClientParam = actualNativeServerSession.getClientParam();
//    String actualErrorMessageEncoding = actualNativeServerSession.getErrorMessageEncoding();
//    TimeZone actualServerTimeZone = actualNativeServerSession.getServerTimeZone();
//    boolean actualIsAutoCommitResult = actualNativeServerSession.isAutoCommit();
//    assertEquals("utf8", actualServerDefaultCharset);
//    assertNull(actualNativeServerSession.mysqlCharsetToCustomMblen);
//    assertNull(actualNativeServerSession.indexToCustomMysqlCharset);
//    assertFalse(actualNativeServerSession.hasMoreResults());
//    assertTrue(actualIsAutoCommitResult);
//    assertNull(actualServerTimeZone);
//    assertEquals("Cp1252", actualErrorMessageEncoding);
//    assertEquals(0L, actualClientParam);
//    assertEquals(0, actualOldStatusFlags);
//    assertNull(actualCharacterSetResultsOnServer);
//    assertTrue(defaultTimeZone instanceof sun.util.calendar.ZoneInfo);
//    assertNull(actualCharacterSetMetadata);
//    assertFalse(actualHasLongColumnInfoResult);
//  }
}
