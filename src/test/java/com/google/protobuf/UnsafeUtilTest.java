package com.google.protobuf;

import static org.junit.Assert.assertFalse;
import java.lang.reflect.Field;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UnsafeUtilTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getStaticObjectTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getStaticObject(null);
  }

  @Test
  public void getLongTest3() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getLong(1L);
  }

  @Test
  public void getIntTest3() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getInt(1L);
  }

  @Test
  public void getByteTest3() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getByte(1L);
  }

  @Test
  public void getObjectTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getObject(new Object[]{"aaaaa", "aaaaa", null}, 1L);
  }

  @Test
  public void getDoubleTest2() {
    // Arrange
    double[] doubleArray = new double[8];
    Arrays.fill(doubleArray, 1.0);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getDouble(doubleArray, 1L);
  }

  @Test
  public void getFloatTest2() {
    // Arrange
    float[] floatArray = new float[8];
    Arrays.fill(floatArray, 1.0f);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getFloat(floatArray, 1L);
  }

  @Test
  public void getBooleanTest2() {
    // Arrange
    boolean[] booleanArray = new boolean[8];
    Arrays.fill(booleanArray, true);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getBoolean(booleanArray, 1L);
  }

  @Test
  public void getLongTest2() {
    // Arrange
    long[] longArray = new long[8];
    Arrays.fill(longArray, 1L);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getLong(longArray, 1L);
  }

  @Test
  public void getIntTest2() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getInt(intArray, 1L);
  }

  @Test
  public void getByteTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getByte(new byte[24], 1L);
  }

  @Test
  public void getObjectTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getObject("aaaaa", 1L);
  }

  @Test
  public void getDoubleTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getDouble("aaaaa", 1L);
  }

  @Test
  public void getFloatTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getFloat("aaaaa", 1L);
  }

  @Test
  public void getBooleanTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getBoolean("aaaaa", 1L);
  }

  @Test
  public void getLongTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getLong("aaaaa", 1L);
  }

  @Test
  public void getIntTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getInt("aaaaa", 1L);
  }

  @Test
  public void getByteTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.getByte("aaaaa", 1L);
  }

  @Test
  public void objectFieldOffsetTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnsafeUtil.objectFieldOffset(null);
  }

  @Test
  public void hasUnsafeByteBufferOperationsTest() {
    // Arrange, Act and Assert
    assertFalse(UnsafeUtil.hasUnsafeByteBufferOperations());
  }

  @Test
  public void hasUnsafeArrayOperationsTest() {
    // Arrange, Act and Assert
    assertFalse(UnsafeUtil.hasUnsafeArrayOperations());
  }
}
