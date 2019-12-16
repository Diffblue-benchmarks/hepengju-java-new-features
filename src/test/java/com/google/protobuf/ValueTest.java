package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ValueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(1, Value.KindCase.NULL_VALUE.getNumber());
  }

  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertEquals(Value.KindCase.NULL_VALUE, Value.KindCase.forNumber(1));
  }

  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertEquals(Value.KindCase.NULL_VALUE, Value.KindCase.valueOf(1));
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    Value.Builder actualToBuilderResult = Value.getDefaultInstance().toBuilder();

    // Assert
    String actualStringValue = actualToBuilderResult.getStringValue();
    assertEquals("", actualStringValue);
    assertEquals("", actualToBuilderResult.toString());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    Value.Builder actualNewBuilderResult = Value.newBuilder(Value.getDefaultInstance());

    // Assert
    String actualStringValue = actualNewBuilderResult.getStringValue();
    assertEquals("", actualStringValue);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    Value.Builder actualNewBuilderResult = Value.newBuilder();

    // Assert
    String actualStringValue = actualNewBuilderResult.getStringValue();
    assertEquals("", actualStringValue);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    Value.Builder actualNewBuilderForTypeResult = Value.getDefaultInstance().newBuilderForType();

    // Assert
    String actualStringValue = actualNewBuilderForTypeResult.getStringValue();
    assertEquals("", actualStringValue);
    assertEquals("", actualNewBuilderForTypeResult.toString());
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Value.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Value.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Value.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Value.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Value.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Value.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-268266796, Value.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Value.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Value.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Value.getDefaultInstance().isInitialized());
  }

  @Test
  public void getListValueOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(Value.getDefaultInstance().getListValueOrBuilder() instanceof ListValue);
  }

  @Test
  public void hasListValueTest() {
    // Arrange, Act and Assert
    assertFalse(Value.getDefaultInstance().hasListValue());
  }

  @Test
  public void getStructValueOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(Value.getDefaultInstance().getStructValueOrBuilder() instanceof Struct);
  }

  @Test
  public void hasStructValueTest() {
    // Arrange, Act and Assert
    assertFalse(Value.getDefaultInstance().hasStructValue());
  }

  @Test
  public void getBoolValueTest() {
    // Arrange, Act and Assert
    assertFalse(Value.getDefaultInstance().getBoolValue());
  }

  @Test
  public void getStringValueTest() {
    // Arrange, Act and Assert
    assertEquals("", Value.getDefaultInstance().getStringValue());
  }

  @Test
  public void getNumberValueTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, Value.getDefaultInstance().getNumberValue(), 0.0);
  }

  @Test
  public void getNullValueTest() {
    // Arrange, Act and Assert
    assertEquals(NullValue.NULL_VALUE, Value.getDefaultInstance().getNullValue());
  }

  @Test
  public void getNullValueValueTest() {
    // Arrange, Act and Assert
    assertEquals(0, Value.getDefaultInstance().getNullValueValue());
  }

  @Test
  public void getKindCaseTest() {
    // Arrange, Act and Assert
    assertEquals(Value.KindCase.KIND_NOT_SET, Value.getDefaultInstance().getKindCase());
  }
}
