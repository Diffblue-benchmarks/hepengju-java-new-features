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

public class MethodTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    Method.Builder actualToBuilderResult = Method.getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    String actualResponseTypeUrl = actualToBuilderResult.getResponseTypeUrl();
    String actualRequestTypeUrl = actualToBuilderResult.getRequestTypeUrl();
    int actualSyntaxValue = actualToBuilderResult.getSyntaxValue();
    assertEquals("", actualName);
    assertEquals("", actualToBuilderResult.toString());
    assertEquals("", actualResponseTypeUrl);
    assertEquals("", actualRequestTypeUrl);
    assertEquals(0, actualSyntaxValue);
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    Method.Builder actualNewBuilderResult = Method.newBuilder(Method.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    String actualResponseTypeUrl = actualNewBuilderResult.getResponseTypeUrl();
    String actualRequestTypeUrl = actualNewBuilderResult.getRequestTypeUrl();
    int actualSyntaxValue = actualNewBuilderResult.getSyntaxValue();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.toString());
    assertEquals("", actualResponseTypeUrl);
    assertEquals("", actualRequestTypeUrl);
    assertEquals(0, actualSyntaxValue);
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    Method.Builder actualNewBuilderResult = Method.newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    String actualResponseTypeUrl = actualNewBuilderResult.getResponseTypeUrl();
    String actualRequestTypeUrl = actualNewBuilderResult.getRequestTypeUrl();
    int actualSyntaxValue = actualNewBuilderResult.getSyntaxValue();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.toString());
    assertEquals("", actualResponseTypeUrl);
    assertEquals("", actualRequestTypeUrl);
    assertEquals(0, actualSyntaxValue);
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    Method.Builder actualNewBuilderForTypeResult = Method.getDefaultInstance().newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    String actualResponseTypeUrl = actualNewBuilderForTypeResult.getResponseTypeUrl();
    String actualRequestTypeUrl = actualNewBuilderForTypeResult.getRequestTypeUrl();
    int actualSyntaxValue = actualNewBuilderForTypeResult.getSyntaxValue();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderForTypeResult.toString());
    assertEquals("", actualResponseTypeUrl);
    assertEquals("", actualRequestTypeUrl);
    assertEquals(0, actualSyntaxValue);
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Method.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Method.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Method.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Method.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Method.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Method.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(2050766977, Method.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Method.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Method.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Method.getDefaultInstance().isInitialized());
  }

  @Test
  public void getSyntaxTest() {
    // Arrange, Act and Assert
    assertEquals(Syntax.SYNTAX_PROTO2, Method.getDefaultInstance().getSyntax());
  }

  @Test
  public void getSyntaxValueTest() {
    // Arrange, Act and Assert
    assertEquals(0, Method.getDefaultInstance().getSyntaxValue());
  }

  @Test
  public void getOptionsOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Method.getDefaultInstance().getOptionsOrBuilder(1);
  }

  @Test
  public void getOptionsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Method.getDefaultInstance().getOptions(1);
  }

  @Test
  public void getOptionsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Method.getDefaultInstance().getOptionsCount());
  }

  @Test
  public void getOptionsOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Method.getDefaultInstance().getOptionsOrBuilderList().size());
  }

  @Test
  public void getOptionsListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Method.getDefaultInstance().getOptionsList().size());
  }

  @Test
  public void getResponseStreamingTest() {
    // Arrange, Act and Assert
    assertFalse(Method.getDefaultInstance().getResponseStreaming());
  }

  @Test
  public void getResponseTypeUrlTest() {
    // Arrange, Act and Assert
    assertEquals("", Method.getDefaultInstance().getResponseTypeUrl());
  }

  @Test
  public void getRequestStreamingTest() {
    // Arrange, Act and Assert
    assertFalse(Method.getDefaultInstance().getRequestStreaming());
  }

  @Test
  public void getRequestTypeUrlTest() {
    // Arrange, Act and Assert
    assertEquals("", Method.getDefaultInstance().getRequestTypeUrl());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("", Method.getDefaultInstance().getName());
  }
}
