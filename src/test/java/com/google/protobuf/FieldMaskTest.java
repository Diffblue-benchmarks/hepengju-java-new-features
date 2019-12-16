package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FieldMaskTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    FieldMask.Builder actualToBuilderResult = FieldMask.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualToBuilderResult.getPathsCount());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    FieldMask.Builder actualNewBuilderResult = FieldMask.newBuilder(FieldMask.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getPathsCount());
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    FieldMask.Builder actualNewBuilderResult = FieldMask.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getPathsCount());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    FieldMask.Builder actualNewBuilderForTypeResult = FieldMask.getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderForTypeResult.getPathsCount());
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    FieldMask.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    FieldMask.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    FieldMask.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    FieldMask.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    FieldMask.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    FieldMask.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(838791705, FieldMask.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(FieldMask.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, FieldMask.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(FieldMask.getDefaultInstance().isInitialized());
  }

  @Test
  public void getPathsBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    FieldMask.getDefaultInstance().getPathsBytes(1);
  }

  @Test
  public void getPathsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    FieldMask.getDefaultInstance().getPaths(1);
  }

  @Test
  public void getPathsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, FieldMask.getDefaultInstance().getPathsCount());
  }

  @Test
  public void getPathsListTest() {
    // Arrange, Act and Assert
    assertEquals(0, FieldMask.getDefaultInstance().getPathsList().size());
  }
}
