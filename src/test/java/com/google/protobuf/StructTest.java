package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StructTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", Struct.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", Struct.newBuilder(Struct.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", Struct.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange, Act and Assert
    assertEquals("", Struct.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Struct.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Struct.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Struct.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Struct.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Struct.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Struct.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1736256849, Struct.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Struct.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Struct.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void writeToTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Struct.getDefaultInstance().writeTo((CodedOutputStream) null);
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Struct.getDefaultInstance().isInitialized());
  }

  @Test
  public void getFieldsOrThrowTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Struct.getDefaultInstance().getFieldsOrThrow("aaaaa");
  }

  @Test
  public void getFieldsMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, Struct.getDefaultInstance().getFieldsMap().size());
  }

  @Test
  public void getFieldsTest() {
    // Arrange, Act and Assert
    assertEquals(0, Struct.getDefaultInstance().getFields().size());
  }

  @Test
  public void containsFieldsTest() {
    // Arrange, Act and Assert
    assertFalse(Struct.getDefaultInstance().containsFields("aaaaa"));
  }

  @Test
  public void getFieldsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Struct.getDefaultInstance().getFieldsCount());
  }

  @Test
  public void internalGetMapFieldTest() {
    // Arrange and Act
    MapField actualInternalGetMapFieldResult = Struct.getDefaultInstance().internalGetMapField(1);

    // Assert
    Message mapEntryMessageDefaultInstance = actualInternalGetMapFieldResult.getMapEntryMessageDefaultInstance();
    assertTrue(actualInternalGetMapFieldResult.isMutable());
    assertTrue(mapEntryMessageDefaultInstance instanceof MapEntry);
  }
}
