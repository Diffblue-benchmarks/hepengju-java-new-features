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

public class ApiTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    Api.Builder actualToBuilderResult = Api.getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    int actualSyntaxValue = actualToBuilderResult.getSyntaxValue();
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualToBuilderResult.getVersion());
    assertEquals(0, actualSyntaxValue);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    Api.Builder actualNewBuilderResult = Api.newBuilder(Api.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    int actualSyntaxValue = actualNewBuilderResult.getSyntaxValue();
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.getVersion());
    assertEquals(0, actualSyntaxValue);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    Api.Builder actualNewBuilderResult = Api.newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    int actualSyntaxValue = actualNewBuilderResult.getSyntaxValue();
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.getVersion());
    assertEquals(0, actualSyntaxValue);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    Api.Builder actualNewBuilderForTypeResult = Api.getDefaultInstance().newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    int actualSyntaxValue = actualNewBuilderForTypeResult.getSyntaxValue();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderForTypeResult.getVersion());
    assertEquals(0, actualSyntaxValue);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Api.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Api.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Api.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Api.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Api.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Api.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-960038376, Api.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Api.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Api.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Api.getDefaultInstance().isInitialized());
  }

  @Test
  public void getSyntaxTest() {
    // Arrange, Act and Assert
    assertEquals(Syntax.SYNTAX_PROTO2, Api.getDefaultInstance().getSyntax());
  }

  @Test
  public void getSyntaxValueTest() {
    // Arrange, Act and Assert
    assertEquals(0, Api.getDefaultInstance().getSyntaxValue());
  }

  @Test
  public void getMixinsOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Api.getDefaultInstance().getMixinsOrBuilder(1);
  }

  @Test
  public void getMixinsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Api.getDefaultInstance().getMixins(1);
  }

  @Test
  public void getMixinsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Api.getDefaultInstance().getMixinsCount());
  }

  @Test
  public void getMixinsOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Api.getDefaultInstance().getMixinsOrBuilderList().size());
  }

  @Test
  public void getMixinsListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Api.getDefaultInstance().getMixinsList().size());
  }

  @Test
  public void getSourceContextOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(Api.getDefaultInstance().getSourceContextOrBuilder() instanceof SourceContext);
  }

  @Test
  public void hasSourceContextTest() {
    // Arrange, Act and Assert
    assertFalse(Api.getDefaultInstance().hasSourceContext());
  }

  @Test
  public void getVersionTest() {
    // Arrange, Act and Assert
    assertEquals("", Api.getDefaultInstance().getVersion());
  }

  @Test
  public void getOptionsOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Api.getDefaultInstance().getOptionsOrBuilder(1);
  }

  @Test
  public void getOptionsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Api.getDefaultInstance().getOptions(1);
  }

  @Test
  public void getOptionsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Api.getDefaultInstance().getOptionsCount());
  }

  @Test
  public void getOptionsOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Api.getDefaultInstance().getOptionsOrBuilderList().size());
  }

  @Test
  public void getOptionsListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Api.getDefaultInstance().getOptionsList().size());
  }

  @Test
  public void getMethodsOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Api.getDefaultInstance().getMethodsOrBuilder(1);
  }

  @Test
  public void getMethodsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Api.getDefaultInstance().getMethods(1);
  }

  @Test
  public void getMethodsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Api.getDefaultInstance().getMethodsCount());
  }

  @Test
  public void getMethodsOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Api.getDefaultInstance().getMethodsOrBuilderList().size());
  }

  @Test
  public void getMethodsListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Api.getDefaultInstance().getMethodsList().size());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("", Api.getDefaultInstance().getName());
  }
}
