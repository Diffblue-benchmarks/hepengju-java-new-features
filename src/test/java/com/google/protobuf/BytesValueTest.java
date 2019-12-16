package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BytesValueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    BytesValue.Builder actualToBuilderResult = BytesValue.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getInitializationErrorString());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    BytesValue.Builder actualNewBuilderResult = BytesValue.newBuilder(BytesValue.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getInitializationErrorString());
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    BytesValue.Builder actualNewBuilderResult = BytesValue.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getInitializationErrorString());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    BytesValue.Builder actualNewBuilderForTypeResult = BytesValue.getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getInitializationErrorString());
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    BytesValue.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    BytesValue.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    BytesValue.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    BytesValue.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    BytesValue.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    BytesValue.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(894104060, BytesValue.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(BytesValue.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, BytesValue.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(BytesValue.getDefaultInstance().isInitialized());
  }
}
