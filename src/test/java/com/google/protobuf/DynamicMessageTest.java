package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DynamicMessageTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest() throws Descriptors.DescriptorValidationException {
    // Arrange and Act
    DynamicMessage.Builder actualToBuilderResult = DynamicMessage
        .getDefaultInstance(new Descriptors.Descriptor("aaaaa")).toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertTrue(actualToBuilderResult.isInitialized());
  }

  @Test
  public void newBuilderForTypeTest() throws Descriptors.DescriptorValidationException {
    // Arrange and Act
    DynamicMessage.Builder actualNewBuilderForTypeResult = DynamicMessage
        .getDefaultInstance(new Descriptors.Descriptor("aaaaa")).newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertTrue(actualNewBuilderForTypeResult.isInitialized());
  }

  @Test
  public void getSerializedSizeTest() throws Descriptors.DescriptorValidationException {
    // Arrange
    DynamicMessage defaultInstance = DynamicMessage.getDefaultInstance(new Descriptors.Descriptor("aaaaa"));

    // Act and Assert
    assertEquals(0, defaultInstance.getSerializedSize());
    assertEquals(0, defaultInstance.getSerializedSize());
  }

  @Test
  public void isInitializedTest2() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertTrue(DynamicMessage.getDefaultInstance(new Descriptors.Descriptor("aaaaa")).isInitialized());
  }

  @Test
  public void isInitializedTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DynamicMessage.isInitialized(new Descriptors.Descriptor("aaaaa"), null);
  }

  @Test
  public void getRepeatedFieldTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DynamicMessage.getDefaultInstance(new Descriptors.Descriptor("aaaaa")).getRepeatedField(null, 1);
  }

  @Test
  public void getRepeatedFieldCountTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DynamicMessage.getDefaultInstance(new Descriptors.Descriptor("aaaaa")).getRepeatedFieldCount(null);
  }

  @Test
  public void getFieldTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DynamicMessage.getDefaultInstance(new Descriptors.Descriptor("aaaaa")).getField(null);
  }

  @Test
  public void hasFieldTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DynamicMessage.getDefaultInstance(new Descriptors.Descriptor("aaaaa")).hasField(null);
  }

  @Test
  public void getOneofFieldDescriptorTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DynamicMessage.getDefaultInstance(new Descriptors.Descriptor("aaaaa")).getOneofFieldDescriptor(null);
  }

  @Test
  public void hasOneofTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DynamicMessage.getDefaultInstance(new Descriptors.Descriptor("aaaaa")).hasOneof(null);
  }

  @Test
  public void getAllFieldsTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertEquals(0, DynamicMessage.getDefaultInstance(new Descriptors.Descriptor("aaaaa")).getAllFields().size());
  }

  @Test
  public void getDefaultInstanceForTypeTest() throws Descriptors.DescriptorValidationException {
    // Arrange and Act
    DynamicMessage actualDefaultInstanceForType = DynamicMessage.getDefaultInstance(new Descriptors.Descriptor("aaaaa"))
        .getDefaultInstanceForType();

    // Assert
    String actualToStringResult = actualDefaultInstanceForType.toString();
    int actualMemoizedSerializedSize = actualDefaultInstanceForType.getMemoizedSerializedSize();
    assertEquals("", actualToStringResult);
    assertEquals(-1, actualMemoizedSerializedSize);
    assertTrue(actualDefaultInstanceForType.isInitialized());
  }

  @Test
  public void getDescriptorForTypeTest() throws Descriptors.DescriptorValidationException {
    // Arrange
    Descriptors.Descriptor descriptor = new Descriptors.Descriptor("aaaaa");

    // Act and Assert
    assertSame(descriptor, DynamicMessage.getDefaultInstance(descriptor).getDescriptorForType());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DynamicMessage.newBuilder((Message) null);
  }

  @Test
  public void newBuilderTest() throws Descriptors.DescriptorValidationException {
    // Arrange and Act
    DynamicMessage.Builder actualNewBuilderResult = DynamicMessage.newBuilder(new Descriptors.Descriptor("aaaaa"));

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertTrue(actualNewBuilderResult.isInitialized());
  }

  @Test
  public void parseFromTest6() throws Descriptors.DescriptorValidationException, IOException {
    // Arrange
    Descriptors.Descriptor type = new Descriptors.Descriptor("aaaaa");
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DynamicMessage.parseFrom(type, input, ExtensionRegistry.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws Descriptors.DescriptorValidationException, IOException {
    // Arrange
    Descriptors.Descriptor type = new Descriptors.Descriptor("aaaaa");

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DynamicMessage.parseFrom(type, new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest4() throws Descriptors.DescriptorValidationException, InvalidProtocolBufferException {
    // Arrange
    Descriptors.Descriptor type = new Descriptors.Descriptor("aaaaa");

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DynamicMessage.parseFrom(type, new byte[24], ExtensionRegistry.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws Descriptors.DescriptorValidationException, InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DynamicMessage.parseFrom(new Descriptors.Descriptor("aaaaa"), new byte[24]);
  }

  @Test
  public void parseFromTest2() throws Descriptors.DescriptorValidationException, IOException {
    // Arrange
    Descriptors.Descriptor type = new Descriptors.Descriptor("aaaaa");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    DynamicMessage.parseFrom(type, (CodedInputStream) null, ExtensionRegistry.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws Descriptors.DescriptorValidationException, IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DynamicMessage.parseFrom(new Descriptors.Descriptor("aaaaa"), (CodedInputStream) null);
  }

  @Test
  public void getDefaultInstanceTest() throws Descriptors.DescriptorValidationException {
    // Arrange and Act
    DynamicMessage actualDefaultInstance = DynamicMessage.getDefaultInstance(new Descriptors.Descriptor("aaaaa"));

    // Assert
    String actualToStringResult = actualDefaultInstance.toString();
    int actualMemoizedSerializedSize = actualDefaultInstance.getMemoizedSerializedSize();
    assertEquals("", actualToStringResult);
    assertEquals(-1, actualMemoizedSerializedSize);
    assertTrue(actualDefaultInstance.isInitialized());
  }

  @Test
  public void constructorTest() throws Descriptors.DescriptorValidationException {
    // Arrange
    Descriptors.Descriptor descriptor = new Descriptors.Descriptor("aaaaa");

    // Act
    DynamicMessage actualDynamicMessage = new DynamicMessage(descriptor, null,
        new Descriptors.FieldDescriptor[]{null, null, null}, UnknownFieldSet.getDefaultInstance());

    // Assert
    Descriptors.Descriptor actualDescriptorForType = actualDynamicMessage.getDescriptorForType();
    assertSame(descriptor, actualDescriptorForType);
    assertEquals(-1, actualDynamicMessage.getMemoizedSerializedSize());
  }
}
