package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FieldTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void valueOfTest4() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Field.Kind.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(Field.Kind.TYPE_DOUBLE, Field.Kind.forNumber(1));
  }

  @Test
  public void valueOfTest3() {
    // Arrange, Act and Assert
    assertEquals(Field.Kind.TYPE_DOUBLE, Field.Kind.valueOf(1));
  }

  @Test
  public void getNumberTest3() {
    // Arrange, Act and Assert
    assertEquals(0, Field.Kind.TYPE_UNKNOWN.getNumber());
  }

  @Test
  public void valueOfTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Field.Cardinality.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertEquals(Field.Cardinality.CARDINALITY_OPTIONAL, Field.Cardinality.forNumber(1));
  }

  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertEquals(Field.Cardinality.CARDINALITY_OPTIONAL, Field.Cardinality.valueOf(1));
  }

  @Test
  public void getNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(0, Field.Cardinality.CARDINALITY_UNKNOWN.getNumber());
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    Field.Builder actualToBuilderResult = Field.getDefaultInstance().toBuilder();

    // Assert
    int actualKindValue = actualToBuilderResult.getKindValue();
    String actualName = actualToBuilderResult.getName();
    String actualTypeUrl = actualToBuilderResult.getTypeUrl();
    String actualJsonName = actualToBuilderResult.getJsonName();
    String actualToStringResult = actualToBuilderResult.toString();
    String actualDefaultValue = actualToBuilderResult.getDefaultValue();
    assertEquals(0, actualKindValue);
    assertEquals(0, actualToBuilderResult.getCardinalityValue());
    assertEquals("", actualDefaultValue);
    assertEquals("", actualTypeUrl);
    assertEquals("", actualJsonName);
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    Field.Builder actualNewBuilderResult = Field.newBuilder(Field.getDefaultInstance());

    // Assert
    int actualKindValue = actualNewBuilderResult.getKindValue();
    String actualName = actualNewBuilderResult.getName();
    String actualTypeUrl = actualNewBuilderResult.getTypeUrl();
    String actualJsonName = actualNewBuilderResult.getJsonName();
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualDefaultValue = actualNewBuilderResult.getDefaultValue();
    assertEquals(0, actualKindValue);
    assertEquals(0, actualNewBuilderResult.getCardinalityValue());
    assertEquals("", actualDefaultValue);
    assertEquals("", actualTypeUrl);
    assertEquals("", actualJsonName);
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    Field.Builder actualNewBuilderResult = Field.newBuilder();

    // Assert
    int actualKindValue = actualNewBuilderResult.getKindValue();
    String actualName = actualNewBuilderResult.getName();
    String actualTypeUrl = actualNewBuilderResult.getTypeUrl();
    String actualJsonName = actualNewBuilderResult.getJsonName();
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualDefaultValue = actualNewBuilderResult.getDefaultValue();
    assertEquals(0, actualKindValue);
    assertEquals(0, actualNewBuilderResult.getCardinalityValue());
    assertEquals("", actualDefaultValue);
    assertEquals("", actualTypeUrl);
    assertEquals("", actualJsonName);
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    Field.Builder actualNewBuilderForTypeResult = Field.getDefaultInstance().newBuilderForType();

    // Assert
    int actualKindValue = actualNewBuilderForTypeResult.getKindValue();
    String actualName = actualNewBuilderForTypeResult.getName();
    String actualTypeUrl = actualNewBuilderForTypeResult.getTypeUrl();
    String actualJsonName = actualNewBuilderForTypeResult.getJsonName();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    String actualDefaultValue = actualNewBuilderForTypeResult.getDefaultValue();
    assertEquals(0, actualKindValue);
    assertEquals(0, actualNewBuilderForTypeResult.getCardinalityValue());
    assertEquals("", actualDefaultValue);
    assertEquals("", actualTypeUrl);
    assertEquals("", actualJsonName);
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Field.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Field.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Field.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Field.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Field.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Field.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(584603523, Field.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Field.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Field.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Field.getDefaultInstance().isInitialized());
  }

  @Test
  public void getDefaultValueTest() {
    // Arrange, Act and Assert
    assertEquals("", Field.getDefaultInstance().getDefaultValue());
  }

  @Test
  public void getJsonNameTest() {
    // Arrange, Act and Assert
    assertEquals("", Field.getDefaultInstance().getJsonName());
  }

  @Test
  public void getOptionsOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Field.getDefaultInstance().getOptionsOrBuilder(1);
  }

  @Test
  public void getOptionsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Field.getDefaultInstance().getOptions(1);
  }

  @Test
  public void getOptionsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Field.getDefaultInstance().getOptionsCount());
  }

  @Test
  public void getOptionsOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Field.getDefaultInstance().getOptionsOrBuilderList().size());
  }

  @Test
  public void getOptionsListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Field.getDefaultInstance().getOptionsList().size());
  }

  @Test
  public void getPackedTest() {
    // Arrange, Act and Assert
    assertFalse(Field.getDefaultInstance().getPacked());
  }

  @Test
  public void getOneofIndexTest() {
    // Arrange, Act and Assert
    assertEquals(0, Field.getDefaultInstance().getOneofIndex());
  }

  @Test
  public void getTypeUrlTest() {
    // Arrange, Act and Assert
    assertEquals("", Field.getDefaultInstance().getTypeUrl());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("", Field.getDefaultInstance().getName());
  }

  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(0, Field.getDefaultInstance().getNumber());
  }

  @Test
  public void getCardinalityTest() {
    // Arrange, Act and Assert
    assertEquals(Field.Cardinality.CARDINALITY_UNKNOWN, Field.getDefaultInstance().getCardinality());
  }

  @Test
  public void getCardinalityValueTest() {
    // Arrange, Act and Assert
    assertEquals(0, Field.getDefaultInstance().getCardinalityValue());
  }

  @Test
  public void getKindTest() {
    // Arrange, Act and Assert
    assertEquals(Field.Kind.TYPE_UNKNOWN, Field.getDefaultInstance().getKind());
  }

  @Test
  public void getKindValueTest() {
    // Arrange, Act and Assert
    assertEquals(0, Field.getDefaultInstance().getKindValue());
  }
}
