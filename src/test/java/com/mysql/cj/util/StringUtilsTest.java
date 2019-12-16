package com.mysql.cj.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.ServerVersion;
import com.mysql.cj.exceptions.WrongArgumentException;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringUtilsTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void quoteBytesTest() {
    // Arrange and Act
    byte[] actualQuoteBytesResult = StringUtils.quoteBytes(new byte[24]);

    // Assert
    assertEquals(26, actualQuoteBytesResult.length);
    assertEquals((byte) 39, actualQuoteBytesResult[0]);
    assertEquals((byte) 0, actualQuoteBytesResult[1]);
    assertEquals((byte) 0, actualQuoteBytesResult[2]);
    assertEquals((byte) 0, actualQuoteBytesResult[3]);
    assertEquals((byte) 0, actualQuoteBytesResult[4]);
    assertEquals((byte) 0, actualQuoteBytesResult[5]);
    assertEquals((byte) 0, actualQuoteBytesResult[20]);
    assertEquals((byte) 0, actualQuoteBytesResult[21]);
    assertEquals((byte) 0, actualQuoteBytesResult[22]);
    assertEquals((byte) 0, actualQuoteBytesResult[23]);
    assertEquals((byte) 0, actualQuoteBytesResult[24]);
    assertEquals((byte) 39, actualQuoteBytesResult[25]);
  }

  @Test
  public void unquoteBytesTest() {
    // Arrange and Act
    byte[] actualUnquoteBytesResult = StringUtils.unquoteBytes(new byte[24]);

    // Assert
    assertEquals(24, actualUnquoteBytesResult.length);
    assertEquals((byte) 0, actualUnquoteBytesResult[0]);
    assertEquals((byte) 0, actualUnquoteBytesResult[1]);
    assertEquals((byte) 0, actualUnquoteBytesResult[2]);
    assertEquals((byte) 0, actualUnquoteBytesResult[3]);
    assertEquals((byte) 0, actualUnquoteBytesResult[4]);
    assertEquals((byte) 0, actualUnquoteBytesResult[5]);
    assertEquals((byte) 0, actualUnquoteBytesResult[18]);
    assertEquals((byte) 0, actualUnquoteBytesResult[19]);
    assertEquals((byte) 0, actualUnquoteBytesResult[20]);
    assertEquals((byte) 0, actualUnquoteBytesResult[21]);
    assertEquals((byte) 0, actualUnquoteBytesResult[22]);
    assertEquals((byte) 0, actualUnquoteBytesResult[23]);
  }

  @Test
  public void joinWithSerialCommaTest() {
    // Arrange, Act and Assert
    assertEquals("", StringUtils.joinWithSerialComma(null));
  }

  @Test
  public void hasWildcardsTest() {
    // Arrange, Act and Assert
    assertFalse(StringUtils.hasWildcards(""));
  }

  @Test
  public void stringArrayToStringTest() {
    // Arrange, Act and Assert
    assertEquals("", StringUtils.stringArrayToString(new String[]{"", "", ""}, "", "", "", ""));
  }

  @Test
  public void safeTrimTest() {
    // Arrange, Act and Assert
    assertEquals("", StringUtils.safeTrim(""));
  }

  @Test
  public void safeIntParseTest() {
    // Arrange, Act and Assert
    assertEquals(0, StringUtils.safeIntParse(""));
  }

  @Test
  public void padStringTest() {
    // Arrange, Act and Assert
    assertEquals(" ", StringUtils.padString("", 1));
  }

  @Test
  public void canHandleAsServerPreparedStatementNoCacheTest() {
    // Arrange, Act and Assert
    assertTrue(
        StringUtils.canHandleAsServerPreparedStatementNoCache("", ServerVersion.parseVersion(""), true, true, true));
  }

  @Test
  public void getBytesNullTerminatedTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalCharsetNameException.class);
    StringUtils.getBytesNullTerminated("", "");
  }

  @Test
  public void isValidIdCharTest() {
    // Arrange, Act and Assert
    assertTrue(StringUtils.isValidIdChar('c'));
  }

  @Test
  public void getBytesTest8() {
    // Arrange, Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    StringUtils.getBytes("", 1, 1, "");
  }

  @Test
  public void getBytesTest7() {
    // Arrange, Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    StringUtils.getBytes("", 1, 1);
  }

  @Test
  public void getBytesTest6() {
    // Arrange, Act and Assert
    assertEquals(0, StringUtils.getBytes("").length);
  }

  @Test
  public void getBytesTest5() {
    // Arrange
    char[] charArray = new char[8];
    Arrays.fill(charArray, 'c');

    // Act and Assert
    thrown.expect(IllegalCharsetNameException.class);
    StringUtils.getBytes(charArray, 1, 1, "");
  }

  @Test
  public void getBytesTest4() {
    // Arrange
    char[] charArray = new char[8];
    Arrays.fill(charArray, 'c');

    // Act and Assert
    assertEquals(1, StringUtils.getBytes(charArray, 1, 1).length);
  }

  @Test
  public void getBytesTest3() {
    // Arrange
    char[] charArray = new char[8];
    Arrays.fill(charArray, 'c');

    // Act and Assert
    thrown.expect(IllegalCharsetNameException.class);
    StringUtils.getBytes(charArray, "");
  }

  @Test
  public void getBytesTest2() {
    // Arrange
    char[] charArray = new char[8];
    Arrays.fill(charArray, 'c');

    // Act and Assert
    assertEquals(8, StringUtils.getBytes(charArray).length);
  }

  @Test
  public void toStringTest4() {
    // Arrange, Act and Assert
    assertEquals(
        "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000",
        StringUtils.toString(new byte[24]));
  }

  @Test
  public void toStringTest3() {
    // Arrange, Act and Assert
    assertEquals("\u0000", StringUtils.toString(new byte[24], 1, 1));
  }

  @Test
  public void toStringTest2() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    StringUtils.toString(new byte[24], "");
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    StringUtils.toString(new byte[24], 1, 1, "");
  }

  @Test
  public void indexOfQuoteDoubleAwareTest() {
    // Arrange, Act and Assert
    assertEquals(-1, StringUtils.indexOfQuoteDoubleAware("", "", 1));
  }

  @Test
  public void unQuoteIdentifierTest() {
    // Arrange, Act and Assert
    assertEquals("", StringUtils.unQuoteIdentifier("", ""));
  }

  @Test
  public void quoteIdentifierTest2() {
    // Arrange, Act and Assert
    assertEquals("``", StringUtils.quoteIdentifier("", true));
  }

  @Test
  public void quoteIdentifierTest() {
    // Arrange, Act and Assert
    assertEquals("", StringUtils.quoteIdentifier("", "", true));
  }

  @Test
  public void escapeQuoteTest() {
    // Arrange, Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    StringUtils.escapeQuote("", "");
  }

  @Test
  public void isEmptyOrWhitespaceOnlyTest() {
    // Arrange, Act and Assert
    assertTrue(StringUtils.isEmptyOrWhitespaceOnly(""));
  }

  @Test
  public void getFullyQualifiedNameTest() {
    // Arrange, Act and Assert
    assertEquals(".", StringUtils.getFullyQualifiedName("", "", "", true));
  }

  @Test
  public void sanitizeProcOrFuncNameTest() {
    // Arrange, Act and Assert
    assertEquals("", StringUtils.sanitizeProcOrFuncName(""));
  }

  @Test
  public void stripCommentsTest() {
    // Arrange, Act and Assert
    assertEquals("", StringUtils.stripComments("", "", "", true, true, true, true));
  }

  @Test
  public void isNullOrEmptyTest() {
    // Arrange, Act and Assert
    assertTrue(StringUtils.isNullOrEmpty(""));
  }

  @Test
  public void indexOfTest() {
    // Arrange, Act and Assert
    assertEquals(-1, StringUtils.indexOf(new byte[24], 'c'));
  }

  @Test
  public void lastIndexOfTest() {
    // Arrange, Act and Assert
    assertEquals(-1, StringUtils.lastIndexOf(new byte[24], 'c'));
  }

  @Test
  public void wildCompareIgnoreCaseTest() {
    // Arrange, Act and Assert
    assertTrue(StringUtils.wildCompareIgnoreCase("", ""));
  }

  @Test
  public void toAsciiStringTest2() {
    // Arrange, Act and Assert
    assertEquals("\u0000", StringUtils.toAsciiString(new byte[24], 1, 1));
  }

  @Test
  public void toAsciiStringTest() {
    // Arrange, Act and Assert
    assertEquals(
        "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000",
        StringUtils.toAsciiString(new byte[24]));
  }

  @Test
  public void stripEnclosureTest() {
    // Arrange and Act
    byte[] actualStripEnclosureResult = StringUtils.stripEnclosure(new byte[24], "", "");

    // Assert
    assertEquals(24, actualStripEnclosureResult.length);
    assertEquals((byte) 0, actualStripEnclosureResult[0]);
    assertEquals((byte) 0, actualStripEnclosureResult[1]);
    assertEquals((byte) 0, actualStripEnclosureResult[2]);
    assertEquals((byte) 0, actualStripEnclosureResult[3]);
    assertEquals((byte) 0, actualStripEnclosureResult[4]);
    assertEquals((byte) 0, actualStripEnclosureResult[5]);
    assertEquals((byte) 0, actualStripEnclosureResult[18]);
    assertEquals((byte) 0, actualStripEnclosureResult[19]);
    assertEquals((byte) 0, actualStripEnclosureResult[20]);
    assertEquals((byte) 0, actualStripEnclosureResult[21]);
    assertEquals((byte) 0, actualStripEnclosureResult[22]);
    assertEquals((byte) 0, actualStripEnclosureResult[23]);
  }

  @Test
  public void startsWithIgnoreCaseAndWsTest3() {
    // Arrange, Act and Assert
    assertEquals(0, StringUtils.startsWithIgnoreCaseAndWs("", new String[]{"", "", ""}));
  }

  @Test
  public void startsWithIgnoreCaseAndWsTest2() {
    // Arrange, Act and Assert
    assertFalse(StringUtils.startsWithIgnoreCaseAndWs("", "", 1));
  }

  @Test
  public void startsWithIgnoreCaseAndWsTest() {
    // Arrange, Act and Assert
    assertTrue(StringUtils.startsWithIgnoreCaseAndWs("", ""));
  }

  @Test
  public void startsWithIgnoreCaseAndNonAlphaNumericTest() {
    // Arrange, Act and Assert
    assertTrue(StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric("", ""));
  }

  @Test
  public void startsWithIgnoreCaseTest2() {
    // Arrange, Act and Assert
    assertTrue(StringUtils.startsWithIgnoreCase("", ""));
  }

  @Test
  public void startsWithIgnoreCaseTest() {
    // Arrange, Act and Assert
    assertFalse(StringUtils.startsWithIgnoreCase("", 1, ""));
  }

  @Test
  public void indexOfIgnoreCaseTest5() {
    // Arrange, Act and Assert
    assertEquals(-1, StringUtils.indexOfIgnoreCase(1, "", "", "", "", "", null));
  }

  @Test
  public void indexOfIgnoreCaseTest4() {
    // Arrange, Act and Assert
    assertEquals(-1, StringUtils.indexOfIgnoreCase(1, "", "", "", "", null));
  }

  @Test
  public void indexOfIgnoreCaseTest3() {
    // Arrange, Act and Assert
    assertEquals(-1, StringUtils.indexOfIgnoreCase(1, "", new String[]{"", "", ""}, "", "", null));
  }

  @Test
  public void indexOfIgnoreCaseTest2() {
    // Arrange, Act and Assert
    assertEquals(-1, StringUtils.indexOfIgnoreCase(1, "", ""));
  }

  @Test
  public void indexOfIgnoreCaseTest() {
    // Arrange, Act and Assert
    assertEquals(-1, StringUtils.indexOfIgnoreCase("", ""));
  }

  @Test
  public void getBytesWrappedTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    StringUtils.getBytesWrapped("", 'c', 'c', "");
  }

  @Test
  public void getBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    StringUtils.getBytes("", "");
  }

  @Test
  public void fixDecimalExponentTest() {
    // Arrange, Act and Assert
    assertEquals("", StringUtils.fixDecimalExponent(""));
  }

  @Test
  public void firstAlphaCharUcTest() {
    // Arrange, Act and Assert
    assertEquals('\u0000', StringUtils.firstAlphaCharUc("", 1));
  }

  @Test
  public void firstNonWsCharUcTest2() {
    // Arrange, Act and Assert
    assertEquals('\u0000', StringUtils.firstNonWsCharUc("", 1));
  }

  @Test
  public void firstNonWsCharUcTest() {
    // Arrange, Act and Assert
    assertEquals('\u0000', StringUtils.firstNonWsCharUc(""));
  }

  @Test
  public void toHexStringTest() {
    // Arrange, Act and Assert
    assertEquals("00", StringUtils.toHexString(new byte[24], 1));
  }

  @Test
  public void dumpAsHexTest() {
    // Arrange, Act and Assert
    assertEquals("00                          .\n", StringUtils.dumpAsHex(new byte[24], 1));
  }
}
