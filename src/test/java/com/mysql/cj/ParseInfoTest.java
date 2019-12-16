package com.mysql.cj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ParseInfoTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void canRewriteTest() {
    // Arrange, Act and Assert
    assertFalse(ParseInfo.canRewrite("\"'`", true, 1, 1));
  }
  @Test
  public void getOnDuplicateKeyLocationTest() {
    // Arrange, Act and Assert
    assertEquals(-1, ParseInfo.getOnDuplicateKeyLocation("\"'`", true, true, true));
  }
  @Test
  public void findStartOfStatementTest() {
    // Arrange, Act and Assert
    assertEquals(0, ParseInfo.findStartOfStatement("\"'`"));
  }
  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new ParseInfo("\"'`", null, "\"'`", true);
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new ParseInfo("\"'`", null, "\"'`");
  }
}
