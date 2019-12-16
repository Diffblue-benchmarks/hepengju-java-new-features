package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class InternalTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void mergeMessageTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    Internal.mergeMessage("ISO-8859-1", null);
  }

  @Test
  public void getDefaultInstanceTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Internal.<MessageLite>getDefaultInstance(null);
  }

  @Test
  public void hashCodeByteBufferTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Internal.hashCodeByteBuffer((List<ByteBuffer>) null);
  }

  @Test
  public void equalsByteBufferTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Internal.equalsByteBuffer((List<ByteBuffer>) null, null);
  }

  @Test
  public void partialHashTest() {
    // Arrange, Act and Assert
    assertEquals(31, Internal.partialHash(1, new byte[24], 1, 1));
  }

  @Test
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(31, Internal.hashCode(new byte[24], 1, 1));
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(1686583320, Internal.hashCode(new byte[24]));
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Internal.hashCode((List<byte[]>) null);
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Internal.equals(null, null);
  }

  @Test
  public void hashEnumListTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Internal.hashEnumList(null);
  }

  @Test
  public void hashEnumTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Internal.hashEnum(null);
  }

  @Test
  public void hashBooleanTest() {
    // Arrange, Act and Assert
    assertEquals(1231, Internal.hashBoolean(true));
  }

  @Test
  public void hashLongTest() {
    // Arrange, Act and Assert
    assertEquals(1, Internal.hashLong(1L));
  }

  @Test
  public void toByteArrayTest() {
    // Arrange, Act and Assert
    assertEquals(10, Internal.toByteArray("ISO-8859-1").length);
  }

  @Test
  public void isValidUtf8Test() {
    // Arrange, Act and Assert
    assertTrue(Internal.isValidUtf8(new byte[24]));
  }

  @Test
  public void byteArrayDefaultValueTest() {
    // Arrange, Act and Assert
    assertEquals(10, Internal.byteArrayDefaultValue("ISO-8859-1").length);
  }
}
