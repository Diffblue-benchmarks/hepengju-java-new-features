package com.mysql.cj.protocol.a.result;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;
import org.junit.Test;

public class ByteArrayRowTest {
  @Test
  public void getNullTest() {
    // Arrange, Act and Assert
    assertFalse((new ByteArrayRow(new byte[][]{new byte[24], new byte[24], new byte[24]}, null)).getNull(1));
  }

  @Test
  public void getBytesTest() {
    // Arrange and Act
    byte[] actualBytes = (new ByteArrayRow(new byte[][]{new byte[24], new byte[24], new byte[24]}, null)).getBytes(1);

    // Assert
    assertEquals(24, actualBytes.length);
    assertEquals((byte) 0, actualBytes[0]);
    assertEquals((byte) 0, actualBytes[1]);
    assertEquals((byte) 0, actualBytes[2]);
    assertEquals((byte) 0, actualBytes[3]);
    assertEquals((byte) 0, actualBytes[4]);
    assertEquals((byte) 0, actualBytes[5]);
    assertEquals((byte) 0, actualBytes[18]);
    assertEquals((byte) 0, actualBytes[19]);
    assertEquals((byte) 0, actualBytes[20]);
    assertEquals((byte) 0, actualBytes[21]);
    assertEquals((byte) 0, actualBytes[22]);
    assertEquals((byte) 0, actualBytes[23]);
  }

  @Test
  public void isBinaryEncodedTest() {
    // Arrange, Act and Assert
    assertFalse((new ByteArrayRow(new byte[][]{new byte[24], new byte[24], new byte[24]}, null)).isBinaryEncoded());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ByteArrayRow actualByteArrayRow = new ByteArrayRow(new byte[][]{new byte[24], new byte[24], new byte[24]}, null);

    // Assert
    assertFalse(actualByteArrayRow.isBinaryEncoded());
    assertEquals(3, actualByteArrayRow.internalRowData.length);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ByteArrayRow actualByteArrayRow = new ByteArrayRow(new byte[][]{new byte[24], new byte[24], new byte[24]}, null,
        new MysqlBinaryValueDecoder());

    // Assert
    assertTrue(actualByteArrayRow.isBinaryEncoded());
    assertEquals(3, actualByteArrayRow.internalRowData.length);
  }
}
