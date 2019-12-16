package com.mysql.cj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class CharsetMappingTest {
  @Test
  public void getMblenTest() {
    // Arrange, Act and Assert
    assertEquals(0, CharsetMapping.getMblen("ASCII"));
  }

  @Test
  public void isMultibyteCharsetTest() {
    // Arrange, Act and Assert
    assertFalse(CharsetMapping.isMultibyteCharset("ASCII"));
  }

  @Test
  public void getNumberOfCharsetsConfiguredTest() {
    // Arrange, Act and Assert
    assertEquals(268, CharsetMapping.getNumberOfCharsetsConfigured());
  }

  @Test
  public void getJavaEncodingForCollationIndexTest2() {
    // Arrange, Act and Assert
    assertNull(CharsetMapping.getJavaEncodingForCollationIndex(null));
  }

  @Test
  public void getJavaEncodingForCollationIndexTest() {
    // Arrange, Act and Assert
    assertNull(CharsetMapping.getJavaEncodingForCollationIndex(null, "ASCII"));
  }

  @Test
  public void getJavaEncodingForMysqlCharsetTest2() {
    // Arrange, Act and Assert
    assertNull(CharsetMapping.getJavaEncodingForMysqlCharset("ASCII"));
  }

  @Test
  public void getJavaEncodingForMysqlCharsetTest() {
    // Arrange, Act and Assert
    assertEquals("ASCII", CharsetMapping.getJavaEncodingForMysqlCharset("ASCII", "ASCII"));
  }

  @Test
  public void getMysqlCharsetNameForCollationIndexTest() {
    // Arrange, Act and Assert
    assertNull(CharsetMapping.getMysqlCharsetNameForCollationIndex(null));
  }

  @Test
  public void getCollationIndexForJavaEncodingTest() {
    // Arrange, Act and Assert
    assertEquals(11, CharsetMapping.getCollationIndexForJavaEncoding("ASCII", ServerVersion.parseVersion("ASCII")));
  }

  @Test
  public void getMysqlCharsetForJavaEncodingTest() {
    // Arrange, Act and Assert
    assertEquals("ascii", CharsetMapping.getMysqlCharsetForJavaEncoding("ASCII", ServerVersion.parseVersion("ASCII")));
  }
}
