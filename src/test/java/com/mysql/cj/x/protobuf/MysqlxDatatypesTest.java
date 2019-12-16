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

public class MysqlxDatatypesTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void valueOfTest4() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Scalar.Type.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(MysqlxDatatypes.Scalar.Type.V_SINT, MysqlxDatatypes.Scalar.Type.forNumber(1));
  }

  @Test
  public void valueOfTest3() {
    // Arrange, Act and Assert
    assertEquals(MysqlxDatatypes.Scalar.Type.V_SINT, MysqlxDatatypes.Scalar.Type.valueOf(1));
  }

  @Test
  public void getNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxDatatypes.Scalar.Type.V_SINT.getNumber());
  }

  @Test
  public void toBuilderTest7() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxDatatypes.Scalar.String.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest14() {
    // Arrange, Act and Assert
    assertEquals("",
        MysqlxDatatypes.Scalar.String.newBuilder(MysqlxDatatypes.Scalar.String.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest13() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxDatatypes.Scalar.String.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest7() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxDatatypes.Scalar.String.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest56() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Scalar.String.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest55() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Scalar.String.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest14() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.String.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest13() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.String.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest54() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.String.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest53() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.String.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest52() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.String.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest51() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.String.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest50() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Scalar.String.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest49() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Scalar.String.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest7() {
    // Arrange, Act and Assert
    assertEquals(371237149, MysqlxDatatypes.Scalar.String.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest7() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.String.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest7() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxDatatypes.Scalar.String.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest7() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.String.getDefaultInstance().isInitialized());
  }

  @Test
  public void getCollationTest() {
    // Arrange, Act and Assert
    assertEquals(0L, MysqlxDatatypes.Scalar.String.getDefaultInstance().getCollation());
  }

  @Test
  public void hasCollationTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.String.getDefaultInstance().hasCollation());
  }

  @Test
  public void hasValueTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.String.getDefaultInstance().hasValue());
  }

  @Test
  public void toBuilderTest6() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxDatatypes.Scalar.Octets.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest12() {
    // Arrange, Act and Assert
    assertEquals("",
        MysqlxDatatypes.Scalar.Octets.newBuilder(MysqlxDatatypes.Scalar.Octets.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest11() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxDatatypes.Scalar.Octets.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest6() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxDatatypes.Scalar.Octets.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest48() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Scalar.Octets.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest47() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Scalar.Octets.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest12() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.Octets.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest11() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.Octets.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest46() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.Octets.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest45() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.Octets.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest44() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.Octets.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest43() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.Octets.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest42() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Scalar.Octets.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest41() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Scalar.Octets.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest6() {
    // Arrange, Act and Assert
    assertEquals(-1673158733, MysqlxDatatypes.Scalar.Octets.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest6() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.Octets.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest6() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxDatatypes.Scalar.Octets.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest6() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.Octets.getDefaultInstance().isInitialized());
  }

  @Test
  public void getContentTypeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxDatatypes.Scalar.Octets.getDefaultInstance().getContentType());
  }

  @Test
  public void hasContentTypeTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.Octets.getDefaultInstance().hasContentType());
  }

  @Test
  public void hasValueTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.Octets.getDefaultInstance().hasValue());
  }

  @Test
  public void toBuilderTest5() {
    // Arrange and Act
    MysqlxDatatypes.Scalar.Builder actualToBuilderResult = MysqlxDatatypes.Scalar.getDefaultInstance().toBuilder();

    // Assert
    MysqlxDatatypes.Scalar.String.Builder actualVStringBuilder = actualToBuilderResult.getVStringBuilder();
    MysqlxDatatypes.Scalar.Type actualType = actualToBuilderResult.getType();
    MysqlxDatatypes.Scalar.StringOrBuilder vStringOrBuilder = actualToBuilderResult.getVStringOrBuilder();
    String actualToStringResult = actualToBuilderResult.toString();
    MysqlxDatatypes.Scalar.Octets.Builder actualVOctetsBuilder = actualToBuilderResult.getVOctetsBuilder();
    assertEquals(MysqlxDatatypes.Scalar.Type.V_SINT, actualType);
    assertEquals("v_string {\n}\n", actualToStringResult);
    assertSame(vStringOrBuilder, actualVStringBuilder);
    assertSame(actualToBuilderResult.getVOctetsOrBuilder(), actualVOctetsBuilder);
  }

  @Test
  public void newBuilderTest10() {
    // Arrange and Act
    MysqlxDatatypes.Scalar.Builder actualNewBuilderResult = MysqlxDatatypes.Scalar
        .newBuilder(MysqlxDatatypes.Scalar.getDefaultInstance());

    // Assert
    MysqlxDatatypes.Scalar.String.Builder actualVStringBuilder = actualNewBuilderResult.getVStringBuilder();
    MysqlxDatatypes.Scalar.Type actualType = actualNewBuilderResult.getType();
    MysqlxDatatypes.Scalar.StringOrBuilder vStringOrBuilder = actualNewBuilderResult.getVStringOrBuilder();
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxDatatypes.Scalar.Octets.Builder actualVOctetsBuilder = actualNewBuilderResult.getVOctetsBuilder();
    assertEquals(MysqlxDatatypes.Scalar.Type.V_SINT, actualType);
    assertEquals("v_string {\n}\n", actualToStringResult);
    assertSame(vStringOrBuilder, actualVStringBuilder);
    assertSame(actualNewBuilderResult.getVOctetsOrBuilder(), actualVOctetsBuilder);
  }

  @Test
  public void newBuilderTest9() {
    // Arrange and Act
    MysqlxDatatypes.Scalar.Builder actualNewBuilderResult = MysqlxDatatypes.Scalar.newBuilder();

    // Assert
    MysqlxDatatypes.Scalar.String.Builder actualVStringBuilder = actualNewBuilderResult.getVStringBuilder();
    MysqlxDatatypes.Scalar.Type actualType = actualNewBuilderResult.getType();
    MysqlxDatatypes.Scalar.StringOrBuilder vStringOrBuilder = actualNewBuilderResult.getVStringOrBuilder();
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxDatatypes.Scalar.Octets.Builder actualVOctetsBuilder = actualNewBuilderResult.getVOctetsBuilder();
    assertEquals(MysqlxDatatypes.Scalar.Type.V_SINT, actualType);
    assertEquals("v_string {\n}\n", actualToStringResult);
    assertSame(vStringOrBuilder, actualVStringBuilder);
    assertSame(actualNewBuilderResult.getVOctetsOrBuilder(), actualVOctetsBuilder);
  }

  @Test
  public void newBuilderForTypeTest5() {
    // Arrange and Act
    MysqlxDatatypes.Scalar.Builder actualNewBuilderForTypeResult = MysqlxDatatypes.Scalar.getDefaultInstance()
        .newBuilderForType();

    // Assert
    MysqlxDatatypes.Scalar.String.Builder actualVStringBuilder = actualNewBuilderForTypeResult.getVStringBuilder();
    MysqlxDatatypes.Scalar.Type actualType = actualNewBuilderForTypeResult.getType();
    MysqlxDatatypes.Scalar.StringOrBuilder vStringOrBuilder = actualNewBuilderForTypeResult.getVStringOrBuilder();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    MysqlxDatatypes.Scalar.Octets.Builder actualVOctetsBuilder = actualNewBuilderForTypeResult.getVOctetsBuilder();
    assertEquals(MysqlxDatatypes.Scalar.Type.V_SINT, actualType);
    assertEquals("v_string {\n}\n", actualToStringResult);
    assertSame(vStringOrBuilder, actualVStringBuilder);
    assertSame(actualNewBuilderForTypeResult.getVOctetsOrBuilder(), actualVOctetsBuilder);
  }

  @Test
  public void parseFromTest40() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Scalar.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest39() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Scalar.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest10() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest9() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest38() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest37() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest36() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest35() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Scalar.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest34() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Scalar.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest33() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Scalar.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest5() {
    // Arrange, Act and Assert
    assertEquals(-1960987977, MysqlxDatatypes.Scalar.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest5() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest5() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxDatatypes.Scalar.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest5() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.getDefaultInstance().isInitialized());
  }

  @Test
  public void getVStringOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(
        MysqlxDatatypes.Scalar.getDefaultInstance().getVStringOrBuilder() instanceof MysqlxDatatypes.Scalar.String);
  }

  @Test
  public void hasVStringTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.getDefaultInstance().hasVString());
  }

  @Test
  public void getVBoolTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.getDefaultInstance().getVBool());
  }

  @Test
  public void hasVBoolTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.getDefaultInstance().hasVBool());
  }

  @Test
  public void getVFloatTest() {
    // Arrange, Act and Assert
    assertEquals(0.0f, MysqlxDatatypes.Scalar.getDefaultInstance().getVFloat(), 0.0f);
  }

  @Test
  public void hasVFloatTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.getDefaultInstance().hasVFloat());
  }

  @Test
  public void getVDoubleTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, MysqlxDatatypes.Scalar.getDefaultInstance().getVDouble(), 0.0);
  }

  @Test
  public void hasVDoubleTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.getDefaultInstance().hasVDouble());
  }

  @Test
  public void getVOctetsOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(
        MysqlxDatatypes.Scalar.getDefaultInstance().getVOctetsOrBuilder() instanceof MysqlxDatatypes.Scalar.Octets);
  }

  @Test
  public void hasVOctetsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.getDefaultInstance().hasVOctets());
  }

  @Test
  public void getVUnsignedIntTest() {
    // Arrange, Act and Assert
    assertEquals(0L, MysqlxDatatypes.Scalar.getDefaultInstance().getVUnsignedInt());
  }

  @Test
  public void hasVUnsignedIntTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.getDefaultInstance().hasVUnsignedInt());
  }

  @Test
  public void getVSignedIntTest() {
    // Arrange, Act and Assert
    assertEquals(0L, MysqlxDatatypes.Scalar.getDefaultInstance().getVSignedInt());
  }

  @Test
  public void hasVSignedIntTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.getDefaultInstance().hasVSignedInt());
  }

  @Test
  public void getTypeTest2() {
    // Arrange, Act and Assert
    assertEquals(MysqlxDatatypes.Scalar.Type.V_SINT, MysqlxDatatypes.Scalar.getDefaultInstance().getType());
  }

  @Test
  public void hasTypeTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Scalar.getDefaultInstance().hasType());
  }

  @Test
  public void toBuilderTest4() {
    // Arrange and Act
    MysqlxDatatypes.Object.ObjectField.Builder actualToBuilderResult = MysqlxDatatypes.Object.ObjectField
        .getDefaultInstance().toBuilder();

    // Assert
    MysqlxDatatypes.AnyOrBuilder valueOrBuilder = actualToBuilderResult.getValueOrBuilder();
    String actualToStringResult = actualToBuilderResult.toString();
    MysqlxDatatypes.Any actualValue = actualToBuilderResult.getValue();
    assertEquals("", actualToStringResult);
    assertSame(valueOrBuilder, actualValue);
    assertEquals("", actualToBuilderResult.getKey());
  }

  @Test
  public void newBuilderTest8() {
    // Arrange and Act
    MysqlxDatatypes.Object.ObjectField.Builder actualNewBuilderResult = MysqlxDatatypes.Object.ObjectField
        .newBuilder(MysqlxDatatypes.Object.ObjectField.getDefaultInstance());

    // Assert
    MysqlxDatatypes.AnyOrBuilder valueOrBuilder = actualNewBuilderResult.getValueOrBuilder();
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxDatatypes.Any actualValue = actualNewBuilderResult.getValue();
    assertEquals("", actualToStringResult);
    assertSame(valueOrBuilder, actualValue);
    assertEquals("", actualNewBuilderResult.getKey());
  }

  @Test
  public void newBuilderTest7() {
    // Arrange and Act
    MysqlxDatatypes.Object.ObjectField.Builder actualNewBuilderResult = MysqlxDatatypes.Object.ObjectField.newBuilder();

    // Assert
    MysqlxDatatypes.AnyOrBuilder valueOrBuilder = actualNewBuilderResult.getValueOrBuilder();
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxDatatypes.Any actualValue = actualNewBuilderResult.getValue();
    assertEquals("", actualToStringResult);
    assertSame(valueOrBuilder, actualValue);
    assertEquals("", actualNewBuilderResult.getKey());
  }

  @Test
  public void newBuilderForTypeTest4() {
    // Arrange and Act
    MysqlxDatatypes.Object.ObjectField.Builder actualNewBuilderForTypeResult = MysqlxDatatypes.Object.ObjectField
        .getDefaultInstance().newBuilderForType();

    // Assert
    MysqlxDatatypes.AnyOrBuilder valueOrBuilder = actualNewBuilderForTypeResult.getValueOrBuilder();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    MysqlxDatatypes.Any actualValue = actualNewBuilderForTypeResult.getValue();
    assertEquals("", actualToStringResult);
    assertSame(valueOrBuilder, actualValue);
    assertEquals("", actualNewBuilderForTypeResult.getKey());
  }

  @Test
  public void parseFromTest32() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Object.ObjectField.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest31() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Object.ObjectField.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest8() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Object.ObjectField.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Object.ObjectField.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest30() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Object.ObjectField.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest29() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Object.ObjectField.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest28() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Object.ObjectField.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest27() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Object.ObjectField.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest26() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Object.ObjectField.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest25() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Object.ObjectField.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest4() {
    // Arrange, Act and Assert
    assertEquals(950412792, MysqlxDatatypes.Object.ObjectField.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Object.ObjectField.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest4() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxDatatypes.Object.ObjectField.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Object.ObjectField.getDefaultInstance().isInitialized());
  }

  @Test
  public void getValueOrBuilderTest2() {
    // Arrange, Act and Assert
    assertTrue(
        MysqlxDatatypes.Object.ObjectField.getDefaultInstance().getValueOrBuilder() instanceof MysqlxDatatypes.Any);
  }

  @Test
  public void hasValueTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Object.ObjectField.getDefaultInstance().hasValue());
  }

  @Test
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxDatatypes.Object.ObjectField.getDefaultInstance().getKey());
  }

  @Test
  public void hasKeyTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Object.ObjectField.getDefaultInstance().hasKey());
  }

  @Test
  public void toBuilderTest3() {
    // Arrange and Act
    MysqlxDatatypes.Object.Builder actualToBuilderResult = MysqlxDatatypes.Object.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualToBuilderResult.getFldCount());
  }

  @Test
  public void newBuilderTest6() {
    // Arrange and Act
    MysqlxDatatypes.Object.Builder actualNewBuilderResult = MysqlxDatatypes.Object
        .newBuilder(MysqlxDatatypes.Object.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getFldCount());
  }

  @Test
  public void newBuilderTest5() {
    // Arrange and Act
    MysqlxDatatypes.Object.Builder actualNewBuilderResult = MysqlxDatatypes.Object.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getFldCount());
  }

  @Test
  public void newBuilderForTypeTest3() {
    // Arrange and Act
    MysqlxDatatypes.Object.Builder actualNewBuilderForTypeResult = MysqlxDatatypes.Object.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderForTypeResult.getFldCount());
  }

  @Test
  public void parseFromTest24() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Object.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest23() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Object.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxDatatypes.Object actualParseDelimitedFromResult = MysqlxDatatypes.Object.parseDelimitedFrom(input,
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
  public void parseDelimitedFromTest5() throws IOException {
    // Arrange and Act
    MysqlxDatatypes.Object actualParseDelimitedFromResult = MysqlxDatatypes.Object
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
  public void parseFromTest22() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Object.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest21() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Object.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest20() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Object.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest19() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Object.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest18() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Object.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest17() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Object.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(-1380482043, MysqlxDatatypes.Object.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Object.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxDatatypes.Object.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest3() {
    // Arrange, Act and Assert
    assertTrue(MysqlxDatatypes.Object.getDefaultInstance().isInitialized());
  }

  @Test
  public void getFldOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxDatatypes.Object.getDefaultInstance().getFldOrBuilder(1);
  }

  @Test
  public void getFldTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxDatatypes.Object.getDefaultInstance().getFld(1);
  }

  @Test
  public void getFldCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxDatatypes.Object.getDefaultInstance().getFldCount());
  }

  @Test
  public void getFldOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxDatatypes.Object.getDefaultInstance().getFldOrBuilderList().size());
  }

  @Test
  public void getFldListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxDatatypes.Object.getDefaultInstance().getFldList().size());
  }

  @Test
  public void toBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxDatatypes.Array.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest4() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxDatatypes.Array.newBuilder(MysqlxDatatypes.Array.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest3() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxDatatypes.Array.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxDatatypes.Array.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest16() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Array.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest15() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Array.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxDatatypes.Array actualParseDelimitedFromResult = MysqlxDatatypes.Array.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualValueCount = actualParseDelimitedFromResult.getValueCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertEquals(0, actualValueCount);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseDelimitedFromTest3() throws IOException {
    // Arrange and Act
    MysqlxDatatypes.Array actualParseDelimitedFromResult = MysqlxDatatypes.Array
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualValueCount = actualParseDelimitedFromResult.getValueCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertEquals(0, actualValueCount);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseFromTest14() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Array.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest13() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Array.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest12() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Array.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest11() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Array.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest10() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Array.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest9() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Array.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(-684212360, MysqlxDatatypes.Array.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Array.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxDatatypes.Array.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest2() {
    // Arrange, Act and Assert
    assertTrue(MysqlxDatatypes.Array.getDefaultInstance().isInitialized());
  }

  @Test
  public void getValueOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxDatatypes.Array.getDefaultInstance().getValueOrBuilder(1);
  }

  @Test
  public void getValueTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxDatatypes.Array.getDefaultInstance().getValue(1);
  }

  @Test
  public void getValueCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxDatatypes.Array.getDefaultInstance().getValueCount());
  }

  @Test
  public void getValueOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxDatatypes.Array.getDefaultInstance().getValueOrBuilderList().size());
  }

  @Test
  public void getValueListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxDatatypes.Array.getDefaultInstance().getValueList().size());
  }

  @Test
  public void valueOfTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Any.Type.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxDatatypes.Any.Type.SCALAR, MysqlxDatatypes.Any.Type.forNumber(1));
  }

  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxDatatypes.Any.Type.SCALAR, MysqlxDatatypes.Any.Type.valueOf(1));
  }

  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxDatatypes.Any.Type.SCALAR.getNumber());
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    MysqlxDatatypes.Any.Builder actualToBuilderResult = MysqlxDatatypes.Any.getDefaultInstance().toBuilder();

    // Assert
    MysqlxDatatypes.Object expectedObjOrBuilder = actualToBuilderResult.getObj();
    String actualToStringResult = actualToBuilderResult.toString();
    MysqlxDatatypes.Any.Type actualType = actualToBuilderResult.getType();
    MysqlxDatatypes.ArrayOrBuilder actualArrayOrBuilder = actualToBuilderResult.getArrayOrBuilder();
    MysqlxDatatypes.ObjectOrBuilder actualObjOrBuilder = actualToBuilderResult.getObjOrBuilder();
    assertEquals("", actualToStringResult);
    assertSame(expectedObjOrBuilder, actualObjOrBuilder);
    assertSame(actualToBuilderResult.getArray(), actualArrayOrBuilder);
    assertEquals(MysqlxDatatypes.Any.Type.SCALAR, actualType);
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    MysqlxDatatypes.Any.Builder actualNewBuilderResult = MysqlxDatatypes.Any
        .newBuilder(MysqlxDatatypes.Any.getDefaultInstance());

    // Assert
    MysqlxDatatypes.Object expectedObjOrBuilder = actualNewBuilderResult.getObj();
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxDatatypes.Any.Type actualType = actualNewBuilderResult.getType();
    MysqlxDatatypes.ArrayOrBuilder actualArrayOrBuilder = actualNewBuilderResult.getArrayOrBuilder();
    MysqlxDatatypes.ObjectOrBuilder actualObjOrBuilder = actualNewBuilderResult.getObjOrBuilder();
    assertEquals("", actualToStringResult);
    assertSame(expectedObjOrBuilder, actualObjOrBuilder);
    assertSame(actualNewBuilderResult.getArray(), actualArrayOrBuilder);
    assertEquals(MysqlxDatatypes.Any.Type.SCALAR, actualType);
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    MysqlxDatatypes.Any.Builder actualNewBuilderResult = MysqlxDatatypes.Any.newBuilder();

    // Assert
    MysqlxDatatypes.Object expectedObjOrBuilder = actualNewBuilderResult.getObj();
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxDatatypes.Any.Type actualType = actualNewBuilderResult.getType();
    MysqlxDatatypes.ArrayOrBuilder actualArrayOrBuilder = actualNewBuilderResult.getArrayOrBuilder();
    MysqlxDatatypes.ObjectOrBuilder actualObjOrBuilder = actualNewBuilderResult.getObjOrBuilder();
    assertEquals("", actualToStringResult);
    assertSame(expectedObjOrBuilder, actualObjOrBuilder);
    assertSame(actualNewBuilderResult.getArray(), actualArrayOrBuilder);
    assertEquals(MysqlxDatatypes.Any.Type.SCALAR, actualType);
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    MysqlxDatatypes.Any.Builder actualNewBuilderForTypeResult = MysqlxDatatypes.Any.getDefaultInstance()
        .newBuilderForType();

    // Assert
    MysqlxDatatypes.Object expectedObjOrBuilder = actualNewBuilderForTypeResult.getObj();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    MysqlxDatatypes.Any.Type actualType = actualNewBuilderForTypeResult.getType();
    MysqlxDatatypes.ArrayOrBuilder actualArrayOrBuilder = actualNewBuilderForTypeResult.getArrayOrBuilder();
    MysqlxDatatypes.ObjectOrBuilder actualObjOrBuilder = actualNewBuilderForTypeResult.getObjOrBuilder();
    assertEquals("", actualToStringResult);
    assertSame(expectedObjOrBuilder, actualObjOrBuilder);
    assertSame(actualNewBuilderForTypeResult.getArray(), actualArrayOrBuilder);
    assertEquals(MysqlxDatatypes.Any.Type.SCALAR, actualType);
  }

  @Test
  public void parseFromTest8() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Any.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Any.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Any.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Any.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Any.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Any.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest4() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Any.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxDatatypes.Any.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Any.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxDatatypes.Any.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1341541058, MysqlxDatatypes.Any.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Any.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxDatatypes.Any.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Any.getDefaultInstance().isInitialized());
  }

  @Test
  public void getArrayOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxDatatypes.Any.getDefaultInstance().getArrayOrBuilder() instanceof MysqlxDatatypes.Array);
  }

  @Test
  public void hasArrayTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Any.getDefaultInstance().hasArray());
  }

  @Test
  public void getObjOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxDatatypes.Any.getDefaultInstance().getObjOrBuilder() instanceof MysqlxDatatypes.Object);
  }

  @Test
  public void hasObjTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Any.getDefaultInstance().hasObj());
  }

  @Test
  public void getScalarOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxDatatypes.Any.getDefaultInstance().getScalarOrBuilder() instanceof MysqlxDatatypes.Scalar);
  }

  @Test
  public void hasScalarTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Any.getDefaultInstance().hasScalar());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxDatatypes.Any.Type.SCALAR, MysqlxDatatypes.Any.getDefaultInstance().getType());
  }

  @Test
  public void hasTypeTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxDatatypes.Any.getDefaultInstance().hasType());
  }
}
