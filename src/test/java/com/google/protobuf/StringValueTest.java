package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringValueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    StringValue.Builder actualToBuilderResult = StringValue.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getValue());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    StringValue.Builder actualNewBuilderResult = StringValue.newBuilder(StringValue.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getValue());
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    StringValue.Builder actualNewBuilderResult = StringValue.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getValue());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    StringValue.Builder actualNewBuilderForTypeResult = StringValue.getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getValue());
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    StringValue.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    StringValue.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    StringValue.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    StringValue.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    StringValue.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    StringValue.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-544928742, StringValue.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(StringValue.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, StringValue.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(StringValue.getDefaultInstance().isInitialized());
  }

  @Test
  public void getValueTest() {
    // Arrange, Act and Assert
    assertEquals("", StringValue.getDefaultInstance().getValue());
  }
}
