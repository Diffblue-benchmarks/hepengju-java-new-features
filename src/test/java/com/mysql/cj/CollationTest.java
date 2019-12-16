package com.mysql.cj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class CollationTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    Collation actualCollation = new Collation(1, "aaaaa", 1, "aaaaa");

    // Assert
    assertEquals(1, actualCollation.priority);
    assertNull(actualCollation.mysqlCharset);
    assertEquals(1, actualCollation.index);
    assertEquals("aaaaa", actualCollation.collationName);
  }
}
