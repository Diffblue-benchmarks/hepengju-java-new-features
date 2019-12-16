package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AnyTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void toBuilderTest() {
    // Arrange and Act
    Any.Builder actualToBuilderResult = Any.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    String actualTypeUrl = actualToBuilderResult.getTypeUrl();
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getInitializationErrorString());
    assertEquals("", actualTypeUrl);
  }
  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    Any.Builder actualNewBuilderResult = Any.newBuilder(Any.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualTypeUrl = actualNewBuilderResult.getTypeUrl();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getInitializationErrorString());
    assertEquals("", actualTypeUrl);
  }
  @Test
  public void newBuilderTest() {
    // Arrange and Act
    Any.Builder actualNewBuilderResult = Any.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualTypeUrl = actualNewBuilderResult.getTypeUrl();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getInitializationErrorString());
    assertEquals("", actualTypeUrl);
  }
  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    Any.Builder actualNewBuilderForTypeResult = Any.getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    String actualTypeUrl = actualNewBuilderForTypeResult.getTypeUrl();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getInitializationErrorString());
    assertEquals("", actualTypeUrl);
  }
  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Any.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Any.parseFrom((CodedInputStream) null);
  }
  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Any.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Any.parseFrom(new ByteArrayInputStream(new byte[24]));
  }
  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Any.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Any.parseFrom(new byte[24]);
  }
  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-1721433573, Any.getDefaultInstance().hashCode());
  }
  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Any.getDefaultInstance().equals(""));
  }
  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Any.getDefaultInstance().getSerializedSize());
  }
  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Any.getDefaultInstance().isInitialized());
  }
  @Test
  public void getTypeUrlTest() {
    // Arrange, Act and Assert
    assertEquals("", Any.getDefaultInstance().getTypeUrl());
  }
  @Test
  public void unpackTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Any.getDefaultInstance().<Message>unpack(null);
  }
  @Test
  public void isTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Any.getDefaultInstance().<Message>is(null);
  }
  @Test
  public void packTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Any.<Message>pack(null, "");
  }
  @Test
  public void packTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Any.<Message>pack(null);
  }
}
