package com.mysql.cj.util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Base64DecoderTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new Base64Decoder.IntWrapper(1)).value);
  }

  @Test
  public void decodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Base64Decoder.decode(new byte[24], 1, 1).length);
  }
}
