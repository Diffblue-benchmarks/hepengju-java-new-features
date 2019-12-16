package com.mysql.cj.conf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConnectionUrlParserTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    ConnectionUrlParser.Pair<Object, Object> actualPair = new ConnectionUrlParser.Pair<Object, Object>("aaaaa", null);

    // Assert
    assertTrue(actualPair.left instanceof String);
    assertNull(actualPair.right);
  }

  @Test
  public void parseHostPortPairTest() {
    // Arrange and Act
    ConnectionUrlParser.Pair<String, Integer> actualParseHostPortPairResult = ConnectionUrlParser
        .parseHostPortPair("(");

    // Assert
    assertEquals("(", actualParseHostPortPairResult.left);
    assertEquals(Integer.valueOf(-1), actualParseHostPortPairResult.right);
  }

  @Test
  public void parseUserInfoTest() {
    // Arrange and Act
    ConnectionUrlParser.Pair<String, String> actualParseUserInfoResult = ConnectionUrlParser.parseUserInfo("(");

    // Assert
    assertEquals("(", actualParseUserInfoResult.left);
    assertNull(actualParseUserInfoResult.right);
  }

  @Test
  public void isConnectionStringSupportedTest() {
    // Arrange, Act and Assert
    assertFalse(ConnectionUrlParser.isConnectionStringSupported("("));
  }
}
