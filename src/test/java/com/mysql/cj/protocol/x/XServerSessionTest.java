package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.ServerVersion;
import com.mysql.cj.exceptions.CJOperationNotSupportedException;
import com.mysql.cj.protocol.ServerCapabilities;
import com.mysql.cj.protocol.a.NativeCapabilities;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class XServerSessionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

//failed_compile @Test
//  public void getDefaultTimeZoneTest() {
//    // Arrange, Act and Assert
//    assertTrue((new XServerSession()).getDefaultTimeZone() instanceof sun.util.calendar.ZoneInfo);
//  }

  @Test
  public void getServerTimeZoneTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getServerTimeZone();
  }

  @Test
  public void setAutoCommitTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).setAutoCommit(true);
  }

  @Test
  public void isAutoCommitTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).isAutoCommit();
  }

  @Test
  public void setThreadIdTest() {
    // Arrange
    XServerSession xServerSession = new XServerSession();

    // Act
    xServerSession.setThreadId(1L);

    // Assert
    assertEquals(1L, xServerSession.getThreadId());
  }

  @Test
  public void getThreadIdTest() {
    // Arrange, Act and Assert
    assertEquals(-1L, (new XServerSession()).getThreadId());
  }

  @Test
  public void isServerTruncatesFracSecsTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).isServerTruncatesFracSecs();
  }

  @Test
  public void useAnsiQuotedIdentifiersTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).useAnsiQuotedIdentifiers();
  }

  @Test
  public void isNoBackslashEscapesSetTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).isNoBackslashEscapesSet();
  }

  @Test
  public void isQueryCacheEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new XServerSession()).isQueryCacheEnabled());
  }

  @Test
  public void storesLowerCaseTableNamesTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).storesLowerCaseTableNames();
  }

  @Test
  public void isLowerCaseTableNamesTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).isLowerCaseTableNames();
  }

  @Test
  public void setCharacterSetResultsOnServerTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).setCharacterSetResultsOnServer("aaaaa");
  }

  @Test
  public void getCharacterSetResultsOnServerTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getCharacterSetResultsOnServer();
  }

  @Test
  public void setMetadataCollationIndexTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).setMetadataCollationIndex(1);
  }

  @Test
  public void getMetadataCollationIndexTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getMetadataCollationIndex();
  }

  @Test
  public void setCharacterSetMetadataTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).setCharacterSetMetadata("aaaaa");
  }

  @Test
  public void getCharacterSetMetadataTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getCharacterSetMetadata();
  }

  @Test
  public void configureCharacterSetsTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).configureCharacterSets();
  }

  @Test
  public void getEncodingForIndexTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getEncodingForIndex(1);
  }

  @Test
  public void getMaxBytesPerCharTest2() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getMaxBytesPerChar(null, "aaaaa");
  }

  @Test
  public void getMaxBytesPerCharTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getMaxBytesPerChar("aaaaa");
  }

  @Test
  public void setErrorMessageEncodingTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).setErrorMessageEncoding("aaaaa");
  }

  @Test
  public void getErrorMessageEncodingTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getErrorMessageEncoding();
  }

  @Test
  public void getServerDefaultCharsetTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getServerDefaultCharset();
  }

  @Test
  public void isVersionTest() {
    // Arrange
    XServerSession xServerSession = new XServerSession();

    // Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    xServerSession.isVersion(ServerVersion.parseVersion("aaaaa"));
  }

  @Test
  public void getServerVersionTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getServerVersion();
  }

  @Test
  public void characterSetNamesMatchesTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).characterSetNamesMatches("aaaaa");
  }

  @Test
  public void setServerVariablesTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).setServerVariables(null);
  }

  @Test
  public void getServerVariableTest2() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getServerVariable("aaaaa", 1);
  }

  @Test
  public void getServerVariableTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getServerVariable("aaaaa");
  }

  @Test
  public void getServerVariablesTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getServerVariables();
  }

  @Test
  public void setHasLongColumnInfoTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).setHasLongColumnInfo(true);
  }

  @Test
  public void hasLongColumnInfoTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).hasLongColumnInfo();
  }

  @Test
  public void isEOFDeprecatedTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).isEOFDeprecated();
  }

  @Test
  public void useMultiResultsTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).useMultiResults();
  }

  @Test
  public void setClientParamTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).setClientParam(1L);
  }

  @Test
  public void getClientParamTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getClientParam();
  }

  @Test
  public void queryWasSlowTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).queryWasSlow();
  }

  @Test
  public void noIndexUsedTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).noIndexUsed();
  }

  @Test
  public void noGoodIndexUsedTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).noGoodIndexUsed();
  }

  @Test
  public void isLastRowSentTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).isLastRowSent();
  }

  @Test
  public void hasMoreResultsTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).hasMoreResults();
  }

  @Test
  public void isAutocommitTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).isAutocommit();
  }

  @Test
  public void cursorExistsTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).cursorExists();
  }

  @Test
  public void inTransactionOnServerTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).inTransactionOnServer();
  }

  @Test
  public void getTransactionStateTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getTransactionState();
  }

  @Test
  public void setServerDefaultCollationIndexTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).setServerDefaultCollationIndex(1);
  }

  @Test
  public void getServerDefaultCollationIndexTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getServerDefaultCollationIndex();
  }

  @Test
  public void setOldStatusFlagsTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).setOldStatusFlags(1);
  }

  @Test
  public void getOldStatusFlagsTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getOldStatusFlags();
  }

  @Test
  public void setStatusFlagsTest2() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).setStatusFlags(1, true);
  }

  @Test
  public void setStatusFlagsTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).setStatusFlags(1);
  }

  @Test
  public void getStatusFlagsTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new XServerSession()).getStatusFlags();
  }

  @Test
  public void setCapabilitiesTest() {
    // Arrange
    XServerSession xServerSession = new XServerSession();

    // Act and Assert
    thrown.expect(ClassCastException.class);
    xServerSession.setCapabilities(new NativeCapabilities());
  }

  @Test
  public void getCapabilitiesTest() {
    // Arrange, Act and Assert
    assertNull((new XServerSession()).getCapabilities());
  }

//failed_compile @Test
//  public void constructorTest() {
//    // Arrange and Act
//    XServerSession actualXServerSession = new XServerSession();
//
//    // Assert
//    long actualThreadId = actualXServerSession.getThreadId();
//    TimeZone defaultTimeZone = actualXServerSession.getDefaultTimeZone();
//    assertEquals(-1L, actualThreadId);
//    assertNull(actualXServerSession.getCapabilities());
//    assertTrue(defaultTimeZone instanceof sun.util.calendar.ZoneInfo);
//  }
}
