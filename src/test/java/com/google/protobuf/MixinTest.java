package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MixinTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    Mixin.Builder actualToBuilderResult = Mixin.getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getRoot());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    Mixin.Builder actualNewBuilderResult = Mixin.newBuilder(Mixin.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getRoot());
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    Mixin.Builder actualNewBuilderResult = Mixin.newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getRoot());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    Mixin.Builder actualNewBuilderForTypeResult = Mixin.getDefaultInstance().newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getRoot());
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mixin.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mixin.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mixin.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mixin.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mixin.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mixin.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1500795055, Mixin.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Mixin.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Mixin.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Mixin.getDefaultInstance().isInitialized());
  }

  @Test
  public void getRootTest() {
    // Arrange, Act and Assert
    assertEquals("", Mixin.getDefaultInstance().getRoot());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("", Mixin.getDefaultInstance().getName());
  }
}
