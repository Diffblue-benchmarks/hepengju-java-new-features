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

public class TypeTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    Type.Builder actualToBuilderResult = Type.getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    int actualOneofsCount = actualToBuilderResult.getOneofsCount();
    int actualSyntaxValue = actualToBuilderResult.getSyntaxValue();
    assertEquals("", actualName);
    assertEquals(0, actualSyntaxValue);
    assertEquals("", actualToBuilderResult.toString());
    assertEquals(0, actualOneofsCount);
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    Type.Builder actualNewBuilderResult = Type.newBuilder(Type.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    int actualOneofsCount = actualNewBuilderResult.getOneofsCount();
    int actualSyntaxValue = actualNewBuilderResult.getSyntaxValue();
    assertEquals("", actualName);
    assertEquals(0, actualSyntaxValue);
    assertEquals("", actualNewBuilderResult.toString());
    assertEquals(0, actualOneofsCount);
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    Type.Builder actualNewBuilderResult = Type.newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    int actualOneofsCount = actualNewBuilderResult.getOneofsCount();
    int actualSyntaxValue = actualNewBuilderResult.getSyntaxValue();
    assertEquals("", actualName);
    assertEquals(0, actualSyntaxValue);
    assertEquals("", actualNewBuilderResult.toString());
    assertEquals(0, actualOneofsCount);
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    Type.Builder actualNewBuilderForTypeResult = Type.getDefaultInstance().newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    int actualOneofsCount = actualNewBuilderForTypeResult.getOneofsCount();
    int actualSyntaxValue = actualNewBuilderForTypeResult.getSyntaxValue();
    assertEquals("", actualName);
    assertEquals(0, actualSyntaxValue);
    assertEquals("", actualNewBuilderForTypeResult.toString());
    assertEquals(0, actualOneofsCount);
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Type.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Type.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Type.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Type.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Type.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Type.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(180717271, Type.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Type.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Type.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Type.getDefaultInstance().isInitialized());
  }

  @Test
  public void getSyntaxTest() {
    // Arrange, Act and Assert
    assertEquals(Syntax.SYNTAX_PROTO2, Type.getDefaultInstance().getSyntax());
  }

  @Test
  public void getSyntaxValueTest() {
    // Arrange, Act and Assert
    assertEquals(0, Type.getDefaultInstance().getSyntaxValue());
  }

  @Test
  public void getSourceContextOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(Type.getDefaultInstance().getSourceContextOrBuilder() instanceof SourceContext);
  }

  @Test
  public void hasSourceContextTest() {
    // Arrange, Act and Assert
    assertFalse(Type.getDefaultInstance().hasSourceContext());
  }

  @Test
  public void getOptionsOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Type.getDefaultInstance().getOptionsOrBuilder(1);
  }

  @Test
  public void getOptionsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Type.getDefaultInstance().getOptions(1);
  }

  @Test
  public void getOptionsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Type.getDefaultInstance().getOptionsCount());
  }

  @Test
  public void getOptionsOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Type.getDefaultInstance().getOptionsOrBuilderList().size());
  }

  @Test
  public void getOptionsListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Type.getDefaultInstance().getOptionsList().size());
  }

  @Test
  public void getOneofsBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Type.getDefaultInstance().getOneofsBytes(1);
  }

  @Test
  public void getOneofsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Type.getDefaultInstance().getOneofs(1);
  }

  @Test
  public void getOneofsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Type.getDefaultInstance().getOneofsCount());
  }

  @Test
  public void getOneofsListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Type.getDefaultInstance().getOneofsList().size());
  }

  @Test
  public void getFieldsOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Type.getDefaultInstance().getFieldsOrBuilder(1);
  }

  @Test
  public void getFieldsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Type.getDefaultInstance().getFields(1);
  }

  @Test
  public void getFieldsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Type.getDefaultInstance().getFieldsCount());
  }

  @Test
  public void getFieldsOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Type.getDefaultInstance().getFieldsOrBuilderList().size());
  }

  @Test
  public void getFieldsListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Type.getDefaultInstance().getFieldsList().size());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("", Type.getDefaultInstance().getName());
  }
}
