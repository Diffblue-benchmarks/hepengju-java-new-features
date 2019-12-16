package com.google.protobuf.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ProtocolStringList;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PluginProtosTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest4() {
    // Arrange and Act
    PluginProtos.Version.Builder actualToBuilderResult = PluginProtos.Version.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getSuffix());
  }

  @Test
  public void newBuilderTest8() {
    // Arrange and Act
    PluginProtos.Version.Builder actualNewBuilderResult = PluginProtos.Version
        .newBuilder(PluginProtos.Version.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getSuffix());
  }

  @Test
  public void newBuilderTest7() {
    // Arrange and Act
    PluginProtos.Version.Builder actualNewBuilderResult = PluginProtos.Version.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getSuffix());
  }

  @Test
  public void newBuilderForTypeTest4() {
    // Arrange and Act
    PluginProtos.Version.Builder actualNewBuilderForTypeResult = PluginProtos.Version.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getSuffix());
  }

  @Test
  public void parseFromTest32() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    PluginProtos.Version.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest31() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    PluginProtos.Version.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest8() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    PluginProtos.Version actualParseDelimitedFromResult = PluginProtos.Version.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualMajor = actualParseDelimitedFromResult.getMajor();
    int actualPatch = actualParseDelimitedFromResult.getPatch();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    String actualSuffix = actualParseDelimitedFromResult.getSuffix();
    assertEquals(0, actualSerializedSize);
    assertEquals("", actualSuffix);
    assertEquals(0, actualParseDelimitedFromResult.getMinor());
    assertEquals(0, actualMajor);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualPatch);
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void parseDelimitedFromTest7() throws IOException {
    // Arrange and Act
    PluginProtos.Version actualParseDelimitedFromResult = PluginProtos.Version
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualMajor = actualParseDelimitedFromResult.getMajor();
    int actualPatch = actualParseDelimitedFromResult.getPatch();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    String actualSuffix = actualParseDelimitedFromResult.getSuffix();
    assertEquals(0, actualSerializedSize);
    assertEquals("", actualSuffix);
    assertEquals(0, actualParseDelimitedFromResult.getMinor());
    assertEquals(0, actualMajor);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualPatch);
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void parseFromTest30() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    PluginProtos.Version.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest29() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    PluginProtos.Version.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest28() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    PluginProtos.Version.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest27() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    PluginProtos.Version.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest26() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    PluginProtos.Version.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest25() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    PluginProtos.Version.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest4() {
    // Arrange, Act and Assert
    assertEquals(-655412398, PluginProtos.Version.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest4() {
    // Arrange, Act and Assert
    assertFalse(PluginProtos.Version.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest4() {
    // Arrange, Act and Assert
    assertEquals(0, PluginProtos.Version.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest4() {
    // Arrange, Act and Assert
    assertTrue(PluginProtos.Version.getDefaultInstance().isInitialized());
  }

  @Test
  public void getSuffixTest() {
    // Arrange, Act and Assert
    assertEquals("", PluginProtos.Version.getDefaultInstance().getSuffix());
  }

  @Test
  public void hasSuffixTest() {
    // Arrange, Act and Assert
    assertFalse(PluginProtos.Version.getDefaultInstance().hasSuffix());
  }

  @Test
  public void getPatchTest() {
    // Arrange, Act and Assert
    assertEquals(0, PluginProtos.Version.getDefaultInstance().getPatch());
  }

  @Test
  public void hasPatchTest() {
    // Arrange, Act and Assert
    assertFalse(PluginProtos.Version.getDefaultInstance().hasPatch());
  }

  @Test
  public void getMinorTest() {
    // Arrange, Act and Assert
    assertEquals(0, PluginProtos.Version.getDefaultInstance().getMinor());
  }

  @Test
  public void hasMinorTest() {
    // Arrange, Act and Assert
    assertFalse(PluginProtos.Version.getDefaultInstance().hasMinor());
  }

  @Test
  public void getMajorTest() {
    // Arrange, Act and Assert
    assertEquals(0, PluginProtos.Version.getDefaultInstance().getMajor());
  }

  @Test
  public void hasMajorTest() {
    // Arrange, Act and Assert
    assertFalse(PluginProtos.Version.getDefaultInstance().hasMajor());
  }

  @Test
  public void toBuilderTest3() {
    // Arrange and Act
    PluginProtos.CodeGeneratorResponse.File.Builder actualToBuilderResult = PluginProtos.CodeGeneratorResponse.File
        .getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    String actualToStringResult = actualToBuilderResult.toString();
    String actualInsertionPoint = actualToBuilderResult.getInsertionPoint();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getContent());
    assertEquals("", actualInsertionPoint);
  }

  @Test
  public void newBuilderTest6() {
    // Arrange and Act
    PluginProtos.CodeGeneratorResponse.File.Builder actualNewBuilderResult = PluginProtos.CodeGeneratorResponse.File
        .newBuilder(PluginProtos.CodeGeneratorResponse.File.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualInsertionPoint = actualNewBuilderResult.getInsertionPoint();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getContent());
    assertEquals("", actualInsertionPoint);
  }

  @Test
  public void newBuilderTest5() {
    // Arrange and Act
    PluginProtos.CodeGeneratorResponse.File.Builder actualNewBuilderResult = PluginProtos.CodeGeneratorResponse.File
        .newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualInsertionPoint = actualNewBuilderResult.getInsertionPoint();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getContent());
    assertEquals("", actualInsertionPoint);
  }

  @Test
  public void newBuilderForTypeTest3() {
    // Arrange and Act
    PluginProtos.CodeGeneratorResponse.File.Builder actualNewBuilderForTypeResult = PluginProtos.CodeGeneratorResponse.File
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    String actualInsertionPoint = actualNewBuilderForTypeResult.getInsertionPoint();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getContent());
    assertEquals("", actualInsertionPoint);
  }

  @Test
  public void parseFromTest24() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    PluginProtos.CodeGeneratorResponse.File.parseFrom((CodedInputStream) null,
        ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest23() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    PluginProtos.CodeGeneratorResponse.File.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    PluginProtos.CodeGeneratorResponse.File actualParseDelimitedFromResult = PluginProtos.CodeGeneratorResponse.File
        .parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualName = actualParseDelimitedFromResult.getName();
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    String actualInsertionPoint = actualParseDelimitedFromResult.getInsertionPoint();
    String actualContent = actualParseDelimitedFromResult.getContent();
    assertEquals("", actualName);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals("", actualToStringResult);
    assertEquals("", actualContent);
    assertEquals(0, actualSerializedSize);
    assertEquals("", actualInsertionPoint);
  }

  @Test
  public void parseDelimitedFromTest5() throws IOException {
    // Arrange and Act
    PluginProtos.CodeGeneratorResponse.File actualParseDelimitedFromResult = PluginProtos.CodeGeneratorResponse.File
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualName = actualParseDelimitedFromResult.getName();
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    String actualInsertionPoint = actualParseDelimitedFromResult.getInsertionPoint();
    String actualContent = actualParseDelimitedFromResult.getContent();
    assertEquals("", actualName);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals("", actualToStringResult);
    assertEquals("", actualContent);
    assertEquals(0, actualSerializedSize);
    assertEquals("", actualInsertionPoint);
  }

  @Test
  public void parseFromTest22() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    PluginProtos.CodeGeneratorResponse.File.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest21() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    PluginProtos.CodeGeneratorResponse.File.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest20() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    PluginProtos.CodeGeneratorResponse.File.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest19() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    PluginProtos.CodeGeneratorResponse.File.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest18() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    PluginProtos.CodeGeneratorResponse.File.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest17() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    PluginProtos.CodeGeneratorResponse.File.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(1557808045, PluginProtos.CodeGeneratorResponse.File.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest3() {
    // Arrange, Act and Assert
    assertFalse(PluginProtos.CodeGeneratorResponse.File.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest3() {
    // Arrange, Act and Assert
    assertEquals(0, PluginProtos.CodeGeneratorResponse.File.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest3() {
    // Arrange, Act and Assert
    assertTrue(PluginProtos.CodeGeneratorResponse.File.getDefaultInstance().isInitialized());
  }

  @Test
  public void getContentTest() {
    // Arrange, Act and Assert
    assertEquals("", PluginProtos.CodeGeneratorResponse.File.getDefaultInstance().getContent());
  }

  @Test
  public void hasContentTest() {
    // Arrange, Act and Assert
    assertFalse(PluginProtos.CodeGeneratorResponse.File.getDefaultInstance().hasContent());
  }

  @Test
  public void getInsertionPointTest() {
    // Arrange, Act and Assert
    assertEquals("", PluginProtos.CodeGeneratorResponse.File.getDefaultInstance().getInsertionPoint());
  }

  @Test
  public void hasInsertionPointTest() {
    // Arrange, Act and Assert
    assertFalse(PluginProtos.CodeGeneratorResponse.File.getDefaultInstance().hasInsertionPoint());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("", PluginProtos.CodeGeneratorResponse.File.getDefaultInstance().getName());
  }

  @Test
  public void hasNameTest() {
    // Arrange, Act and Assert
    assertFalse(PluginProtos.CodeGeneratorResponse.File.getDefaultInstance().hasName());
  }

  @Test
  public void toBuilderTest2() {
    // Arrange and Act
    PluginProtos.CodeGeneratorResponse.Builder actualToBuilderResult = PluginProtos.CodeGeneratorResponse
        .getDefaultInstance().toBuilder();

    // Assert
    String actualError = actualToBuilderResult.getError();
    assertEquals("", actualError);
    assertEquals("", actualToBuilderResult.toString());
  }

  @Test
  public void newBuilderTest4() {
    // Arrange and Act
    PluginProtos.CodeGeneratorResponse.Builder actualNewBuilderResult = PluginProtos.CodeGeneratorResponse
        .newBuilder(PluginProtos.CodeGeneratorResponse.getDefaultInstance());

    // Assert
    String actualError = actualNewBuilderResult.getError();
    assertEquals("", actualError);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderTest3() {
    // Arrange and Act
    PluginProtos.CodeGeneratorResponse.Builder actualNewBuilderResult = PluginProtos.CodeGeneratorResponse.newBuilder();

    // Assert
    String actualError = actualNewBuilderResult.getError();
    assertEquals("", actualError);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderForTypeTest2() {
    // Arrange and Act
    PluginProtos.CodeGeneratorResponse.Builder actualNewBuilderForTypeResult = PluginProtos.CodeGeneratorResponse
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualError = actualNewBuilderForTypeResult.getError();
    assertEquals("", actualError);
    assertEquals("", actualNewBuilderForTypeResult.toString());
  }

  @Test
  public void parseFromTest16() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    PluginProtos.CodeGeneratorResponse.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest15() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    PluginProtos.CodeGeneratorResponse.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    PluginProtos.CodeGeneratorResponse actualParseDelimitedFromResult = PluginProtos.CodeGeneratorResponse
        .parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualError = actualParseDelimitedFromResult.getError();
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualError);
    assertEquals(0, actualParseDelimitedFromResult.getFileCount());
    assertEquals("", actualToStringResult);
    assertTrue(actualIsInitializedResult);
    assertEquals(0, actualSerializedSize);
  }

  @Test
  public void parseDelimitedFromTest3() throws IOException {
    // Arrange and Act
    PluginProtos.CodeGeneratorResponse actualParseDelimitedFromResult = PluginProtos.CodeGeneratorResponse
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualError = actualParseDelimitedFromResult.getError();
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualError);
    assertEquals(0, actualParseDelimitedFromResult.getFileCount());
    assertEquals("", actualToStringResult);
    assertTrue(actualIsInitializedResult);
    assertEquals(0, actualSerializedSize);
  }

  @Test
  public void parseFromTest14() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    PluginProtos.CodeGeneratorResponse.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest13() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    PluginProtos.CodeGeneratorResponse.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest12() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    PluginProtos.CodeGeneratorResponse.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest11() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    PluginProtos.CodeGeneratorResponse.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest10() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    PluginProtos.CodeGeneratorResponse.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest9() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    PluginProtos.CodeGeneratorResponse.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(-820802601, PluginProtos.CodeGeneratorResponse.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(PluginProtos.CodeGeneratorResponse.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, PluginProtos.CodeGeneratorResponse.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest2() {
    // Arrange, Act and Assert
    assertTrue(PluginProtos.CodeGeneratorResponse.getDefaultInstance().isInitialized());
  }

  @Test
  public void getFileOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    PluginProtos.CodeGeneratorResponse.getDefaultInstance().getFileOrBuilder(1);
  }

  @Test
  public void getFileTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    PluginProtos.CodeGeneratorResponse.getDefaultInstance().getFile(1);
  }

  @Test
  public void getFileCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, PluginProtos.CodeGeneratorResponse.getDefaultInstance().getFileCount());
  }

  @Test
  public void getFileOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, PluginProtos.CodeGeneratorResponse.getDefaultInstance().getFileOrBuilderList().size());
  }

  @Test
  public void getFileListTest() {
    // Arrange, Act and Assert
    assertEquals(0, PluginProtos.CodeGeneratorResponse.getDefaultInstance().getFileList().size());
  }

  @Test
  public void getErrorTest() {
    // Arrange, Act and Assert
    assertEquals("", PluginProtos.CodeGeneratorResponse.getDefaultInstance().getError());
  }

  @Test
  public void hasErrorTest() {
    // Arrange, Act and Assert
    assertFalse(PluginProtos.CodeGeneratorResponse.getDefaultInstance().hasError());
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    PluginProtos.CodeGeneratorRequest.Builder actualToBuilderResult = PluginProtos.CodeGeneratorRequest
        .getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    int actualFileToGenerateCount = actualToBuilderResult.getFileToGenerateCount();
    assertEquals("", actualToBuilderResult.getParameter());
    assertEquals(0, actualFileToGenerateCount);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    PluginProtos.CodeGeneratorRequest.Builder actualNewBuilderResult = PluginProtos.CodeGeneratorRequest
        .newBuilder(PluginProtos.CodeGeneratorRequest.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualFileToGenerateCount = actualNewBuilderResult.getFileToGenerateCount();
    assertEquals("", actualNewBuilderResult.getParameter());
    assertEquals(0, actualFileToGenerateCount);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    PluginProtos.CodeGeneratorRequest.Builder actualNewBuilderResult = PluginProtos.CodeGeneratorRequest.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualFileToGenerateCount = actualNewBuilderResult.getFileToGenerateCount();
    assertEquals("", actualNewBuilderResult.getParameter());
    assertEquals(0, actualFileToGenerateCount);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    PluginProtos.CodeGeneratorRequest.Builder actualNewBuilderForTypeResult = PluginProtos.CodeGeneratorRequest
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    int actualFileToGenerateCount = actualNewBuilderForTypeResult.getFileToGenerateCount();
    assertEquals("", actualNewBuilderForTypeResult.getParameter());
    assertEquals(0, actualFileToGenerateCount);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void parseFromTest8() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    PluginProtos.CodeGeneratorRequest.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    PluginProtos.CodeGeneratorRequest.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    PluginProtos.CodeGeneratorRequest actualParseDelimitedFromResult = PluginProtos.CodeGeneratorRequest
        .parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualProtoFileCount = actualParseDelimitedFromResult.getProtoFileCount();
    int actualFileToGenerateCount = actualParseDelimitedFromResult.getFileToGenerateCount();
    String actualParameter = actualParseDelimitedFromResult.getParameter();
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals(0, actualSerializedSize);
    assertEquals(0, actualFileToGenerateCount);
    assertEquals("", actualParameter);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualProtoFileCount);
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange and Act
    PluginProtos.CodeGeneratorRequest actualParseDelimitedFromResult = PluginProtos.CodeGeneratorRequest
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualProtoFileCount = actualParseDelimitedFromResult.getProtoFileCount();
    int actualFileToGenerateCount = actualParseDelimitedFromResult.getFileToGenerateCount();
    String actualParameter = actualParseDelimitedFromResult.getParameter();
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals(0, actualSerializedSize);
    assertEquals(0, actualFileToGenerateCount);
    assertEquals("", actualParameter);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualProtoFileCount);
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    PluginProtos.CodeGeneratorRequest.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    PluginProtos.CodeGeneratorRequest.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest4() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    PluginProtos.CodeGeneratorRequest.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    PluginProtos.CodeGeneratorRequest.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    PluginProtos.CodeGeneratorRequest.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    PluginProtos.CodeGeneratorRequest.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(992603172, PluginProtos.CodeGeneratorRequest.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(PluginProtos.CodeGeneratorRequest.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, PluginProtos.CodeGeneratorRequest.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(PluginProtos.CodeGeneratorRequest.getDefaultInstance().isInitialized());
  }

  @Test
  public void getCompilerVersionOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(PluginProtos.CodeGeneratorRequest.getDefaultInstance()
        .getCompilerVersionOrBuilder() instanceof PluginProtos.Version);
  }

  @Test
  public void hasCompilerVersionTest() {
    // Arrange, Act and Assert
    assertFalse(PluginProtos.CodeGeneratorRequest.getDefaultInstance().hasCompilerVersion());
  }

  @Test
  public void getProtoFileOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    PluginProtos.CodeGeneratorRequest.getDefaultInstance().getProtoFileOrBuilder(1);
  }

  @Test
  public void getProtoFileTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    PluginProtos.CodeGeneratorRequest.getDefaultInstance().getProtoFile(1);
  }

  @Test
  public void getProtoFileCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, PluginProtos.CodeGeneratorRequest.getDefaultInstance().getProtoFileCount());
  }

  @Test
  public void getProtoFileOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, PluginProtos.CodeGeneratorRequest.getDefaultInstance().getProtoFileOrBuilderList().size());
  }

  @Test
  public void getProtoFileListTest() {
    // Arrange, Act and Assert
    assertEquals(0, PluginProtos.CodeGeneratorRequest.getDefaultInstance().getProtoFileList().size());
  }

  @Test
  public void getParameterTest() {
    // Arrange, Act and Assert
    assertEquals("", PluginProtos.CodeGeneratorRequest.getDefaultInstance().getParameter());
  }

  @Test
  public void hasParameterTest() {
    // Arrange, Act and Assert
    assertFalse(PluginProtos.CodeGeneratorRequest.getDefaultInstance().hasParameter());
  }

  @Test
  public void getFileToGenerateBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    PluginProtos.CodeGeneratorRequest.getDefaultInstance().getFileToGenerateBytes(1);
  }

  @Test
  public void getFileToGenerateTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    PluginProtos.CodeGeneratorRequest.getDefaultInstance().getFileToGenerate(1);
  }

  @Test
  public void getFileToGenerateCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, PluginProtos.CodeGeneratorRequest.getDefaultInstance().getFileToGenerateCount());
  }

  @Test
  public void getFileToGenerateListTest() {
    // Arrange, Act and Assert
    assertEquals(0, PluginProtos.CodeGeneratorRequest.getDefaultInstance().getFileToGenerateList().size());
  }
}
