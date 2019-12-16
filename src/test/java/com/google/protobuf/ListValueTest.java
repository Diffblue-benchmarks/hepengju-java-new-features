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

public class ListValueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    ListValue.Builder actualToBuilderResult = ListValue.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualToBuilderResult.getValuesCount());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    ListValue.Builder actualNewBuilderResult = ListValue.newBuilder(ListValue.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getValuesCount());
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    ListValue.Builder actualNewBuilderResult = ListValue.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getValuesCount());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    ListValue.Builder actualNewBuilderForTypeResult = ListValue.getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderForTypeResult.getValuesCount());
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    ListValue.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    ListValue.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    ListValue.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    ListValue.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    ListValue.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    ListValue.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(878625303, ListValue.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(ListValue.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, ListValue.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(ListValue.getDefaultInstance().isInitialized());
  }

  @Test
  public void getValuesOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ListValue.getDefaultInstance().getValuesOrBuilder(1);
  }

  @Test
  public void getValuesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ListValue.getDefaultInstance().getValues(1);
  }

  @Test
  public void getValuesCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, ListValue.getDefaultInstance().getValuesCount());
  }

  @Test
  public void getValuesOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, ListValue.getDefaultInstance().getValuesOrBuilderList().size());
  }

  @Test
  public void getValuesListTest() {
    // Arrange, Act and Assert
    assertEquals(0, ListValue.getDefaultInstance().getValuesList().size());
  }
}
