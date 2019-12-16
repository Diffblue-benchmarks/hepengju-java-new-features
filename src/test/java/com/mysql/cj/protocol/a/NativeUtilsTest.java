package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NativeUtilsTest {
  @Test
  public void getBinaryEncodedLengthTest() {
    // Arrange, Act and Assert
    assertEquals(1, NativeUtils.getBinaryEncodedLength(1));
  }

  @Test
  public void decodeMysqlThreeByteIntegerTest2() {
    // Arrange, Act and Assert
    assertEquals(0, NativeUtils.decodeMysqlThreeByteInteger(new byte[24], 1));
  }

  @Test
  public void decodeMysqlThreeByteIntegerTest() {
    // Arrange, Act and Assert
    assertEquals(0, NativeUtils.decodeMysqlThreeByteInteger(new byte[24]));
  }

  @Test
  public void encodeMysqlThreeByteIntegerTest() {
    // Arrange, Act and Assert
    assertEquals(3, NativeUtils.encodeMysqlThreeByteInteger(1).length);
  }
}
