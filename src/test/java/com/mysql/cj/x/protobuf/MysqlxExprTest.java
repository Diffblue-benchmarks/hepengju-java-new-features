package com.mysql.cj.x.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysqlxExprTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest8() {
    // Arrange and Act
    MysqlxExpr.Operator.Builder actualToBuilderResult = MysqlxExpr.Operator.getDefaultInstance().toBuilder();

    // Assert
    int actualParamCount = actualToBuilderResult.getParamCount();
    String actualName = actualToBuilderResult.getName();
    assertEquals(0, actualParamCount);
    assertEquals("", actualName);
    assertEquals("", actualToBuilderResult.toString());
  }

  @Test
  public void newBuilderTest16() {
    // Arrange and Act
    MysqlxExpr.Operator.Builder actualNewBuilderResult = MysqlxExpr.Operator
        .newBuilder(MysqlxExpr.Operator.getDefaultInstance());

    // Assert
    int actualParamCount = actualNewBuilderResult.getParamCount();
    String actualName = actualNewBuilderResult.getName();
    assertEquals(0, actualParamCount);
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderTest15() {
    // Arrange and Act
    MysqlxExpr.Operator.Builder actualNewBuilderResult = MysqlxExpr.Operator.newBuilder();

    // Assert
    int actualParamCount = actualNewBuilderResult.getParamCount();
    String actualName = actualNewBuilderResult.getName();
    assertEquals(0, actualParamCount);
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderForTypeTest8() {
    // Arrange and Act
    MysqlxExpr.Operator.Builder actualNewBuilderForTypeResult = MysqlxExpr.Operator.getDefaultInstance()
        .newBuilderForType();

    // Assert
    int actualParamCount = actualNewBuilderForTypeResult.getParamCount();
    String actualName = actualNewBuilderForTypeResult.getName();
    assertEquals(0, actualParamCount);
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderForTypeResult.toString());
  }

  @Test
  public void parseFromTest72() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Operator.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest71() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Operator.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest18() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Operator.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest17() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Operator.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest70() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Operator.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest69() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Operator.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest68() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Operator.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest67() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Operator.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest66() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Operator.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest65() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Operator.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest9() {
    // Arrange, Act and Assert
    assertEquals(-595972352, MysqlxExpr.Operator.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest9() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Operator.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest9() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.Operator.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest9() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Operator.getDefaultInstance().isInitialized());
  }

  @Test
  public void getParamOrBuilderTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxExpr.Operator.getDefaultInstance().getParamOrBuilder(1);
  }

  @Test
  public void getParamTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxExpr.Operator.getDefaultInstance().getParam(1);
  }

  @Test
  public void getParamCountTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.Operator.getDefaultInstance().getParamCount());
  }

  @Test
  public void getParamOrBuilderListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.Operator.getDefaultInstance().getParamOrBuilderList().size());
  }

  @Test
  public void getParamListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.Operator.getDefaultInstance().getParamList().size());
  }

  @Test
  public void getNameTest3() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpr.Operator.getDefaultInstance().getName());
  }

  @Test
  public void hasNameTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Operator.getDefaultInstance().hasName());
  }

  @Test
  public void toBuilderTest7() {
    // Arrange and Act
    MysqlxExpr.Object.ObjectField.Builder actualToBuilderResult = MysqlxExpr.Object.ObjectField.getDefaultInstance()
        .toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    MysqlxExpr.Expr expectedValueOrBuilder = actualToBuilderResult.getValue();
    MysqlxExpr.ExprOrBuilder actualValueOrBuilder = actualToBuilderResult.getValueOrBuilder();
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getKey());
    assertSame(expectedValueOrBuilder, actualValueOrBuilder);
  }

  @Test
  public void newBuilderTest14() {
    // Arrange and Act
    MysqlxExpr.Object.ObjectField.Builder actualNewBuilderResult = MysqlxExpr.Object.ObjectField
        .newBuilder(MysqlxExpr.Object.ObjectField.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxExpr.Expr expectedValueOrBuilder = actualNewBuilderResult.getValue();
    MysqlxExpr.ExprOrBuilder actualValueOrBuilder = actualNewBuilderResult.getValueOrBuilder();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getKey());
    assertSame(expectedValueOrBuilder, actualValueOrBuilder);
  }

  @Test
  public void newBuilderTest13() {
    // Arrange and Act
    MysqlxExpr.Object.ObjectField.Builder actualNewBuilderResult = MysqlxExpr.Object.ObjectField.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxExpr.Expr expectedValueOrBuilder = actualNewBuilderResult.getValue();
    MysqlxExpr.ExprOrBuilder actualValueOrBuilder = actualNewBuilderResult.getValueOrBuilder();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getKey());
    assertSame(expectedValueOrBuilder, actualValueOrBuilder);
  }

  @Test
  public void newBuilderForTypeTest7() {
    // Arrange and Act
    MysqlxExpr.Object.ObjectField.Builder actualNewBuilderForTypeResult = MysqlxExpr.Object.ObjectField
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    MysqlxExpr.Expr expectedValueOrBuilder = actualNewBuilderForTypeResult.getValue();
    MysqlxExpr.ExprOrBuilder actualValueOrBuilder = actualNewBuilderForTypeResult.getValueOrBuilder();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getKey());
    assertSame(expectedValueOrBuilder, actualValueOrBuilder);
  }

  @Test
  public void parseFromTest64() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Object.ObjectField.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest63() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Object.ObjectField.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest16() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Object.ObjectField.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest15() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Object.ObjectField.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest62() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Object.ObjectField.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest61() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Object.ObjectField.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest60() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Object.ObjectField.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest59() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Object.ObjectField.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest58() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Object.ObjectField.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest57() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Object.ObjectField.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest8() {
    // Arrange, Act and Assert
    assertEquals(1633114717, MysqlxExpr.Object.ObjectField.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest8() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Object.ObjectField.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest8() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.Object.ObjectField.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest8() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Object.ObjectField.getDefaultInstance().isInitialized());
  }

  @Test
  public void getValueOrBuilderTest2() {
    // Arrange, Act and Assert
    assertTrue(MysqlxExpr.Object.ObjectField.getDefaultInstance().getValueOrBuilder() instanceof MysqlxExpr.Expr);
  }

  @Test
  public void hasValueTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Object.ObjectField.getDefaultInstance().hasValue());
  }

  @Test
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpr.Object.ObjectField.getDefaultInstance().getKey());
  }

  @Test
  public void hasKeyTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Object.ObjectField.getDefaultInstance().hasKey());
  }

  @Test
  public void toBuilderTest6() {
    // Arrange and Act
    MysqlxExpr.Object.Builder actualToBuilderResult = MysqlxExpr.Object.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualToBuilderResult.getFldCount());
  }

  @Test
  public void newBuilderTest12() {
    // Arrange and Act
    MysqlxExpr.Object.Builder actualNewBuilderResult = MysqlxExpr.Object
        .newBuilder(MysqlxExpr.Object.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getFldCount());
  }

  @Test
  public void newBuilderTest11() {
    // Arrange and Act
    MysqlxExpr.Object.Builder actualNewBuilderResult = MysqlxExpr.Object.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getFldCount());
  }

  @Test
  public void newBuilderForTypeTest6() {
    // Arrange and Act
    MysqlxExpr.Object.Builder actualNewBuilderForTypeResult = MysqlxExpr.Object.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderForTypeResult.getFldCount());
  }

  @Test
  public void parseFromTest56() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Object.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest55() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Object.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest14() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxExpr.Object actualParseDelimitedFromResult = MysqlxExpr.Object.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualFldCount = actualParseDelimitedFromResult.getFldCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertEquals(0, actualFldCount);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseDelimitedFromTest13() throws IOException {
    // Arrange and Act
    MysqlxExpr.Object actualParseDelimitedFromResult = MysqlxExpr.Object
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualFldCount = actualParseDelimitedFromResult.getFldCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertEquals(0, actualFldCount);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseFromTest54() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Object.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest53() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Object.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest52() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Object.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest51() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Object.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest50() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Object.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest49() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Object.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest7() {
    // Arrange, Act and Assert
    assertEquals(648017767, MysqlxExpr.Object.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest7() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Object.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest7() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.Object.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest7() {
    // Arrange, Act and Assert
    assertTrue(MysqlxExpr.Object.getDefaultInstance().isInitialized());
  }

  @Test
  public void getFldOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxExpr.Object.getDefaultInstance().getFldOrBuilder(1);
  }

  @Test
  public void getFldTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxExpr.Object.getDefaultInstance().getFld(1);
  }

  @Test
  public void getFldCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.Object.getDefaultInstance().getFldCount());
  }

  @Test
  public void getFldOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.Object.getDefaultInstance().getFldOrBuilderList().size());
  }

  @Test
  public void getFldListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.Object.getDefaultInstance().getFldList().size());
  }

  @Test
  public void toBuilderTest5() {
    // Arrange and Act
    MysqlxExpr.Identifier.Builder actualToBuilderResult = MysqlxExpr.Identifier.getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getSchemaName());
  }

  @Test
  public void newBuilderTest10() {
    // Arrange and Act
    MysqlxExpr.Identifier.Builder actualNewBuilderResult = MysqlxExpr.Identifier
        .newBuilder(MysqlxExpr.Identifier.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getSchemaName());
  }

  @Test
  public void newBuilderTest9() {
    // Arrange and Act
    MysqlxExpr.Identifier.Builder actualNewBuilderResult = MysqlxExpr.Identifier.newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getSchemaName());
  }

  @Test
  public void newBuilderForTypeTest5() {
    // Arrange and Act
    MysqlxExpr.Identifier.Builder actualNewBuilderForTypeResult = MysqlxExpr.Identifier.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getSchemaName());
  }

  @Test
  public void parseFromTest48() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Identifier.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest47() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Identifier.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest12() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Identifier.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest11() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Identifier.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest46() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Identifier.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest45() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Identifier.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest44() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Identifier.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest43() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Identifier.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest42() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Identifier.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest41() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Identifier.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest6() {
    // Arrange, Act and Assert
    assertEquals(-1091674455, MysqlxExpr.Identifier.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest6() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Identifier.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest6() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.Identifier.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest6() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Identifier.getDefaultInstance().isInitialized());
  }

  @Test
  public void getSchemaNameTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpr.Identifier.getDefaultInstance().getSchemaName());
  }

  @Test
  public void hasSchemaNameTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Identifier.getDefaultInstance().hasSchemaName());
  }

  @Test
  public void getNameTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpr.Identifier.getDefaultInstance().getName());
  }

  @Test
  public void hasNameTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Identifier.getDefaultInstance().hasName());
  }

  @Test
  public void toBuilderTest4() {
    // Arrange and Act
    MysqlxExpr.FunctionCall.Builder actualToBuilderResult = MysqlxExpr.FunctionCall.getDefaultInstance().toBuilder();

    // Assert
    int actualParamCount = actualToBuilderResult.getParamCount();
    String actualToStringResult = actualToBuilderResult.toString();
    MysqlxExpr.Identifier.Builder actualNameBuilder = actualToBuilderResult.getNameBuilder();
    assertEquals(0, actualParamCount);
    assertEquals("", actualToStringResult);
    assertSame(actualToBuilderResult.getNameOrBuilder(), actualNameBuilder);
  }

  @Test
  public void newBuilderTest8() {
    // Arrange and Act
    MysqlxExpr.FunctionCall.Builder actualNewBuilderResult = MysqlxExpr.FunctionCall
        .newBuilder(MysqlxExpr.FunctionCall.getDefaultInstance());

    // Assert
    int actualParamCount = actualNewBuilderResult.getParamCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxExpr.Identifier.Builder actualNameBuilder = actualNewBuilderResult.getNameBuilder();
    assertEquals(0, actualParamCount);
    assertEquals("", actualToStringResult);
    assertSame(actualNewBuilderResult.getNameOrBuilder(), actualNameBuilder);
  }

  @Test
  public void newBuilderTest7() {
    // Arrange and Act
    MysqlxExpr.FunctionCall.Builder actualNewBuilderResult = MysqlxExpr.FunctionCall.newBuilder();

    // Assert
    int actualParamCount = actualNewBuilderResult.getParamCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxExpr.Identifier.Builder actualNameBuilder = actualNewBuilderResult.getNameBuilder();
    assertEquals(0, actualParamCount);
    assertEquals("", actualToStringResult);
    assertSame(actualNewBuilderResult.getNameOrBuilder(), actualNameBuilder);
  }

  @Test
  public void newBuilderForTypeTest4() {
    // Arrange and Act
    MysqlxExpr.FunctionCall.Builder actualNewBuilderForTypeResult = MysqlxExpr.FunctionCall.getDefaultInstance()
        .newBuilderForType();

    // Assert
    int actualParamCount = actualNewBuilderForTypeResult.getParamCount();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    MysqlxExpr.Identifier.Builder actualNameBuilder = actualNewBuilderForTypeResult.getNameBuilder();
    assertEquals(0, actualParamCount);
    assertEquals("", actualToStringResult);
    assertSame(actualNewBuilderForTypeResult.getNameOrBuilder(), actualNameBuilder);
  }

  @Test
  public void parseFromTest40() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.FunctionCall.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest39() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.FunctionCall.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest10() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.FunctionCall.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest9() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.FunctionCall.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest38() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.FunctionCall.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest37() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.FunctionCall.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest36() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.FunctionCall.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest35() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.FunctionCall.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest34() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.FunctionCall.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest33() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.FunctionCall.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest5() {
    // Arrange, Act and Assert
    assertEquals(-599762214, MysqlxExpr.FunctionCall.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest5() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.FunctionCall.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest5() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.FunctionCall.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest5() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.FunctionCall.getDefaultInstance().isInitialized());
  }

  @Test
  public void getParamOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxExpr.FunctionCall.getDefaultInstance().getParamOrBuilder(1);
  }

  @Test
  public void getParamTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxExpr.FunctionCall.getDefaultInstance().getParam(1);
  }

  @Test
  public void getParamCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.FunctionCall.getDefaultInstance().getParamCount());
  }

  @Test
  public void getParamOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.FunctionCall.getDefaultInstance().getParamOrBuilderList().size());
  }

  @Test
  public void getParamListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.FunctionCall.getDefaultInstance().getParamList().size());
  }

  @Test
  public void getNameOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxExpr.FunctionCall.getDefaultInstance().getNameOrBuilder() instanceof MysqlxExpr.Identifier);
  }

  @Test
  public void hasNameTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.FunctionCall.getDefaultInstance().hasName());
  }

  @Test
  public void valueOfTest4() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Expr.Type.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(MysqlxExpr.Expr.Type.IDENT, MysqlxExpr.Expr.Type.forNumber(1));
  }

  @Test
  public void valueOfTest3() {
    // Arrange, Act and Assert
    assertEquals(MysqlxExpr.Expr.Type.IDENT, MysqlxExpr.Expr.Type.valueOf(1));
  }

  @Test
  public void getNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxExpr.Expr.Type.IDENT.getNumber());
  }

  @Test
  public void parseFromTest32() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Expr.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest31() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Expr.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest8() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Expr.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Expr.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest30() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Expr.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest29() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Expr.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest28() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Expr.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest27() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Expr.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest26() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Expr.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest25() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Expr.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest4() {
    // Arrange, Act and Assert
    assertEquals(1660423372, MysqlxExpr.Expr.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Expr.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest4() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.Expr.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Expr.getDefaultInstance().isInitialized());
  }

  @Test
  public void getArrayOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxExpr.Expr.getDefaultInstance().getArrayOrBuilder() instanceof MysqlxExpr.Array);
  }

  @Test
  public void hasArrayTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Expr.getDefaultInstance().hasArray());
  }

  @Test
  public void getObjectOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxExpr.Expr.getDefaultInstance().getObjectOrBuilder() instanceof MysqlxExpr.Object);
  }

  @Test
  public void hasObjectTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Expr.getDefaultInstance().hasObject());
  }

  @Test
  public void getPositionTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.Expr.getDefaultInstance().getPosition());
  }

  @Test
  public void hasPositionTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Expr.getDefaultInstance().hasPosition());
  }

  @Test
  public void getOperatorOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxExpr.Expr.getDefaultInstance().getOperatorOrBuilder() instanceof MysqlxExpr.Operator);
  }

  @Test
  public void hasOperatorTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Expr.getDefaultInstance().hasOperator());
  }

  @Test
  public void getFunctionCallOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxExpr.Expr.getDefaultInstance().getFunctionCallOrBuilder() instanceof MysqlxExpr.FunctionCall);
  }

  @Test
  public void hasFunctionCallTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Expr.getDefaultInstance().hasFunctionCall());
  }

  @Test
  public void getLiteralOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxExpr.Expr.getDefaultInstance().getLiteralOrBuilder() instanceof MysqlxDatatypes.Scalar);
  }

  @Test
  public void hasLiteralTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Expr.getDefaultInstance().hasLiteral());
  }

  @Test
  public void getVariableTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpr.Expr.getDefaultInstance().getVariable());
  }

  @Test
  public void hasVariableTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Expr.getDefaultInstance().hasVariable());
  }

  @Test
  public void getIdentifierOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxExpr.Expr.getDefaultInstance().getIdentifierOrBuilder() instanceof MysqlxExpr.ColumnIdentifier);
  }

  @Test
  public void hasIdentifierTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Expr.getDefaultInstance().hasIdentifier());
  }

  @Test
  public void getTypeTest2() {
    // Arrange, Act and Assert
    assertEquals(MysqlxExpr.Expr.Type.IDENT, MysqlxExpr.Expr.getDefaultInstance().getType());
  }

  @Test
  public void hasTypeTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Expr.getDefaultInstance().hasType());
  }

  @Test
  public void valueOfTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.DocumentPathItem.Type.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxExpr.DocumentPathItem.Type.MEMBER, MysqlxExpr.DocumentPathItem.Type.forNumber(1));
  }

  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxExpr.DocumentPathItem.Type.MEMBER, MysqlxExpr.DocumentPathItem.Type.valueOf(1));
  }

  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxExpr.DocumentPathItem.Type.MEMBER.getNumber());
  }

  @Test
  public void toBuilderTest3() {
    // Arrange and Act
    MysqlxExpr.DocumentPathItem.Builder actualToBuilderResult = MysqlxExpr.DocumentPathItem.getDefaultInstance()
        .toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    MysqlxExpr.DocumentPathItem.Type actualType = actualToBuilderResult.getType();
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getValue());
    assertEquals(MysqlxExpr.DocumentPathItem.Type.MEMBER, actualType);
  }

  @Test
  public void newBuilderTest6() {
    // Arrange and Act
    MysqlxExpr.DocumentPathItem.Builder actualNewBuilderResult = MysqlxExpr.DocumentPathItem
        .newBuilder(MysqlxExpr.DocumentPathItem.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxExpr.DocumentPathItem.Type actualType = actualNewBuilderResult.getType();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getValue());
    assertEquals(MysqlxExpr.DocumentPathItem.Type.MEMBER, actualType);
  }

  @Test
  public void newBuilderTest5() {
    // Arrange and Act
    MysqlxExpr.DocumentPathItem.Builder actualNewBuilderResult = MysqlxExpr.DocumentPathItem.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxExpr.DocumentPathItem.Type actualType = actualNewBuilderResult.getType();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getValue());
    assertEquals(MysqlxExpr.DocumentPathItem.Type.MEMBER, actualType);
  }

  @Test
  public void newBuilderForTypeTest3() {
    // Arrange and Act
    MysqlxExpr.DocumentPathItem.Builder actualNewBuilderForTypeResult = MysqlxExpr.DocumentPathItem.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    MysqlxExpr.DocumentPathItem.Type actualType = actualNewBuilderForTypeResult.getType();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getValue());
    assertEquals(MysqlxExpr.DocumentPathItem.Type.MEMBER, actualType);
  }

  @Test
  public void parseFromTest24() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.DocumentPathItem.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest23() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.DocumentPathItem.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.DocumentPathItem.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.DocumentPathItem.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest22() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.DocumentPathItem.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest21() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.DocumentPathItem.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest20() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.DocumentPathItem.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest19() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.DocumentPathItem.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest18() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.DocumentPathItem.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest17() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.DocumentPathItem.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(276332607, MysqlxExpr.DocumentPathItem.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.DocumentPathItem.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.DocumentPathItem.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.DocumentPathItem.getDefaultInstance().isInitialized());
  }

  @Test
  public void getIndexTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.DocumentPathItem.getDefaultInstance().getIndex());
  }

  @Test
  public void hasIndexTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.DocumentPathItem.getDefaultInstance().hasIndex());
  }

  @Test
  public void getValueTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpr.DocumentPathItem.getDefaultInstance().getValue());
  }

  @Test
  public void hasValueTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.DocumentPathItem.getDefaultInstance().hasValue());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxExpr.DocumentPathItem.Type.MEMBER, MysqlxExpr.DocumentPathItem.getDefaultInstance().getType());
  }

  @Test
  public void hasTypeTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.DocumentPathItem.getDefaultInstance().hasType());
  }

  @Test
  public void toBuilderTest2() {
    // Arrange and Act
    MysqlxExpr.ColumnIdentifier.Builder actualToBuilderResult = MysqlxExpr.ColumnIdentifier.getDefaultInstance()
        .toBuilder();

    // Assert
    String actualTableName = actualToBuilderResult.getTableName();
    String actualName = actualToBuilderResult.getName();
    String actualToStringResult = actualToBuilderResult.toString();
    int actualDocumentPathCount = actualToBuilderResult.getDocumentPathCount();
    assertEquals("", actualTableName);
    assertEquals("", actualToBuilderResult.getSchemaName());
    assertEquals("", actualName);
    assertEquals(0, actualDocumentPathCount);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderTest4() {
    // Arrange and Act
    MysqlxExpr.ColumnIdentifier.Builder actualNewBuilderResult = MysqlxExpr.ColumnIdentifier
        .newBuilder(MysqlxExpr.ColumnIdentifier.getDefaultInstance());

    // Assert
    String actualTableName = actualNewBuilderResult.getTableName();
    String actualName = actualNewBuilderResult.getName();
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualDocumentPathCount = actualNewBuilderResult.getDocumentPathCount();
    assertEquals("", actualTableName);
    assertEquals("", actualNewBuilderResult.getSchemaName());
    assertEquals("", actualName);
    assertEquals(0, actualDocumentPathCount);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderTest3() {
    // Arrange and Act
    MysqlxExpr.ColumnIdentifier.Builder actualNewBuilderResult = MysqlxExpr.ColumnIdentifier.newBuilder();

    // Assert
    String actualTableName = actualNewBuilderResult.getTableName();
    String actualName = actualNewBuilderResult.getName();
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualDocumentPathCount = actualNewBuilderResult.getDocumentPathCount();
    assertEquals("", actualTableName);
    assertEquals("", actualNewBuilderResult.getSchemaName());
    assertEquals("", actualName);
    assertEquals(0, actualDocumentPathCount);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderForTypeTest2() {
    // Arrange and Act
    MysqlxExpr.ColumnIdentifier.Builder actualNewBuilderForTypeResult = MysqlxExpr.ColumnIdentifier.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualTableName = actualNewBuilderForTypeResult.getTableName();
    String actualName = actualNewBuilderForTypeResult.getName();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    int actualDocumentPathCount = actualNewBuilderForTypeResult.getDocumentPathCount();
    assertEquals("", actualTableName);
    assertEquals("", actualNewBuilderForTypeResult.getSchemaName());
    assertEquals("", actualName);
    assertEquals(0, actualDocumentPathCount);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void parseFromTest16() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.ColumnIdentifier.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest15() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.ColumnIdentifier.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxExpr.ColumnIdentifier actualParseDelimitedFromResult = MysqlxExpr.ColumnIdentifier.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualTableName = actualParseDelimitedFromResult.getTableName();
    String actualName = actualParseDelimitedFromResult.getName();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualDocumentPathCount = actualParseDelimitedFromResult.getDocumentPathCount();
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualTableName);
    assertEquals("", actualParseDelimitedFromResult.getSchemaName());
    assertTrue(actualIsInitializedResult);
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertEquals(0, actualDocumentPathCount);
  }

  @Test
  public void parseDelimitedFromTest3() throws IOException {
    // Arrange and Act
    MysqlxExpr.ColumnIdentifier actualParseDelimitedFromResult = MysqlxExpr.ColumnIdentifier
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualTableName = actualParseDelimitedFromResult.getTableName();
    String actualName = actualParseDelimitedFromResult.getName();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualDocumentPathCount = actualParseDelimitedFromResult.getDocumentPathCount();
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualTableName);
    assertEquals("", actualParseDelimitedFromResult.getSchemaName());
    assertTrue(actualIsInitializedResult);
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertEquals(0, actualDocumentPathCount);
  }

  @Test
  public void parseFromTest14() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.ColumnIdentifier.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest13() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.ColumnIdentifier.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest12() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.ColumnIdentifier.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest11() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.ColumnIdentifier.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest10() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.ColumnIdentifier.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest9() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.ColumnIdentifier.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(-1663250081, MysqlxExpr.ColumnIdentifier.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.ColumnIdentifier.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.ColumnIdentifier.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest2() {
    // Arrange, Act and Assert
    assertTrue(MysqlxExpr.ColumnIdentifier.getDefaultInstance().isInitialized());
  }

  @Test
  public void getSchemaNameTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpr.ColumnIdentifier.getDefaultInstance().getSchemaName());
  }

  @Test
  public void hasSchemaNameTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.ColumnIdentifier.getDefaultInstance().hasSchemaName());
  }

  @Test
  public void getTableNameTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpr.ColumnIdentifier.getDefaultInstance().getTableName());
  }

  @Test
  public void hasTableNameTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.ColumnIdentifier.getDefaultInstance().hasTableName());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpr.ColumnIdentifier.getDefaultInstance().getName());
  }

  @Test
  public void hasNameTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.ColumnIdentifier.getDefaultInstance().hasName());
  }

  @Test
  public void getDocumentPathOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxExpr.ColumnIdentifier.getDefaultInstance().getDocumentPathOrBuilder(1);
  }

  @Test
  public void getDocumentPathTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxExpr.ColumnIdentifier.getDefaultInstance().getDocumentPath(1);
  }

  @Test
  public void getDocumentPathCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.ColumnIdentifier.getDefaultInstance().getDocumentPathCount());
  }

  @Test
  public void getDocumentPathOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.ColumnIdentifier.getDefaultInstance().getDocumentPathOrBuilderList().size());
  }

  @Test
  public void getDocumentPathListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.ColumnIdentifier.getDefaultInstance().getDocumentPathList().size());
  }

  @Test
  public void toBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpr.Array.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpr.Array.newBuilder(MysqlxExpr.Array.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpr.Array.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpr.Array.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest8() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Array.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Array.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxExpr.Array actualParseDelimitedFromResult = MysqlxExpr.Array.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualValueCount = actualParseDelimitedFromResult.getValueCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualValueCount);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals(0, actualSerializedSize);
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange and Act
    MysqlxExpr.Array actualParseDelimitedFromResult = MysqlxExpr.Array
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualValueCount = actualParseDelimitedFromResult.getValueCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualValueCount);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals(0, actualSerializedSize);
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Array.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Array.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest4() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Array.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpr.Array.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Array.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpr.Array.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1470981420, MysqlxExpr.Array.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpr.Array.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.Array.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxExpr.Array.getDefaultInstance().isInitialized());
  }

  @Test
  public void getValueOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxExpr.Array.getDefaultInstance().getValueOrBuilder(1);
  }

  @Test
  public void getValueTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxExpr.Array.getDefaultInstance().getValue(1);
  }

  @Test
  public void getValueCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.Array.getDefaultInstance().getValueCount());
  }

  @Test
  public void getValueOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.Array.getDefaultInstance().getValueOrBuilderList().size());
  }

  @Test
  public void getValueListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpr.Array.getDefaultInstance().getValueList().size());
  }
}
