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

public class EnumTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    Enum.Builder actualToBuilderResult = Enum.getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    int actualSyntaxValue = actualToBuilderResult.getSyntaxValue();
    assertEquals("", actualName);
    assertEquals("", actualToBuilderResult.toString());
    assertEquals(0, actualSyntaxValue);
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    Enum.Builder actualNewBuilderResult = Enum.newBuilder(Enum.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    int actualSyntaxValue = actualNewBuilderResult.getSyntaxValue();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.toString());
    assertEquals(0, actualSyntaxValue);
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    Enum.Builder actualNewBuilderResult = Enum.newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    int actualSyntaxValue = actualNewBuilderResult.getSyntaxValue();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.toString());
    assertEquals(0, actualSyntaxValue);
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    Enum.Builder actualNewBuilderForTypeResult = Enum.getDefaultInstance().newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    int actualSyntaxValue = actualNewBuilderForTypeResult.getSyntaxValue();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderForTypeResult.toString());
    assertEquals(0, actualSyntaxValue);
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Enum.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Enum.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Enum.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Enum.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Enum.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Enum.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-256917299, Enum.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Enum.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Enum.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Enum.getDefaultInstance().isInitialized());
  }

  @Test
  public void getSyntaxTest() {
    // Arrange, Act and Assert
    assertEquals(Syntax.SYNTAX_PROTO2, Enum.getDefaultInstance().getSyntax());
  }

  @Test
  public void getSyntaxValueTest() {
    // Arrange, Act and Assert
    assertEquals(0, Enum.getDefaultInstance().getSyntaxValue());
  }

  @Test
  public void getSourceContextOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(Enum.getDefaultInstance().getSourceContextOrBuilder() instanceof SourceContext);
  }

  @Test
  public void hasSourceContextTest() {
    // Arrange, Act and Assert
    assertFalse(Enum.getDefaultInstance().hasSourceContext());
  }

  @Test
  public void getOptionsOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Enum.getDefaultInstance().getOptionsOrBuilder(1);
  }

  @Test
  public void getOptionsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Enum.getDefaultInstance().getOptions(1);
  }

  @Test
  public void getOptionsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Enum.getDefaultInstance().getOptionsCount());
  }

  @Test
  public void getOptionsOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Enum.getDefaultInstance().getOptionsOrBuilderList().size());
  }

  @Test
  public void getOptionsListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Enum.getDefaultInstance().getOptionsList().size());
  }

  @Test
  public void getEnumvalueOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Enum.getDefaultInstance().getEnumvalueOrBuilder(1);
  }

  @Test
  public void getEnumvalueTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Enum.getDefaultInstance().getEnumvalue(1);
  }

  @Test
  public void getEnumvalueCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Enum.getDefaultInstance().getEnumvalueCount());
  }

  @Test
  public void getEnumvalueOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Enum.getDefaultInstance().getEnumvalueOrBuilderList().size());
  }

  @Test
  public void getEnumvalueListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Enum.getDefaultInstance().getEnumvalueList().size());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("", Enum.getDefaultInstance().getName());
  }
}
