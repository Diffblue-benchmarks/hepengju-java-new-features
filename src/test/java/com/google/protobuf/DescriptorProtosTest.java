package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DescriptorProtosTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest26() {
    // Arrange and Act
    DescriptorProtos.UninterpretedOption.NamePart.Builder actualToBuilderResult = DescriptorProtos.UninterpretedOption.NamePart
        .getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getNamePart());
  }

  @Test
  public void newBuilderTest52() {
    // Arrange and Act
    DescriptorProtos.UninterpretedOption.NamePart.Builder actualNewBuilderResult = DescriptorProtos.UninterpretedOption.NamePart
        .newBuilder(DescriptorProtos.UninterpretedOption.NamePart.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getNamePart());
  }

  @Test
  public void newBuilderTest51() {
    // Arrange and Act
    DescriptorProtos.UninterpretedOption.NamePart.Builder actualNewBuilderResult = DescriptorProtos.UninterpretedOption.NamePart
        .newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getNamePart());
  }

  @Test
  public void newBuilderForTypeTest26() {
    // Arrange and Act
    DescriptorProtos.UninterpretedOption.NamePart.Builder actualNewBuilderForTypeResult = DescriptorProtos.UninterpretedOption.NamePart
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getNamePart());
  }

  @Test
  public void parseFromTest162() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.UninterpretedOption.NamePart.parseFrom((CodedInputStream) null,
        ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest161() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.UninterpretedOption.NamePart.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest20() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.UninterpretedOption.NamePart.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest19() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.UninterpretedOption.NamePart.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest160() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.UninterpretedOption.NamePart.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest159() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.UninterpretedOption.NamePart.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest158() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.UninterpretedOption.NamePart.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest157() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.UninterpretedOption.NamePart.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest27() {
    // Arrange, Act and Assert
    assertEquals(1103458791, DescriptorProtos.UninterpretedOption.NamePart.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest27() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.UninterpretedOption.NamePart.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest27() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.UninterpretedOption.NamePart.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest27() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.UninterpretedOption.NamePart.getDefaultInstance().isInitialized());
  }

  @Test
  public void getIsExtensionTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.UninterpretedOption.NamePart.getDefaultInstance().getIsExtension());
  }

  @Test
  public void hasIsExtensionTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.UninterpretedOption.NamePart.getDefaultInstance().hasIsExtension());
  }

  @Test
  public void getNamePartTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.UninterpretedOption.NamePart.getDefaultInstance().getNamePart());
  }

  @Test
  public void hasNamePartTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.UninterpretedOption.NamePart.getDefaultInstance().hasNamePart());
  }

  @Test
  public void toBuilderTest25() {
    // Arrange and Act
    DescriptorProtos.UninterpretedOption.Builder actualToBuilderResult = DescriptorProtos.UninterpretedOption
        .getDefaultInstance().toBuilder();

    // Assert
    int actualNameCount = actualToBuilderResult.getNameCount();
    String actualToStringResult = actualToBuilderResult.toString();
    String actualAggregateValue = actualToBuilderResult.getAggregateValue();
    assertEquals(0, actualNameCount);
    assertEquals("", actualToBuilderResult.getIdentifierValue());
    assertEquals("", actualToStringResult);
    assertEquals("", actualAggregateValue);
  }

  @Test
  public void newBuilderTest50() {
    // Arrange and Act
    DescriptorProtos.UninterpretedOption.Builder actualNewBuilderResult = DescriptorProtos.UninterpretedOption
        .newBuilder(DescriptorProtos.UninterpretedOption.getDefaultInstance());

    // Assert
    int actualNameCount = actualNewBuilderResult.getNameCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualAggregateValue = actualNewBuilderResult.getAggregateValue();
    assertEquals(0, actualNameCount);
    assertEquals("", actualNewBuilderResult.getIdentifierValue());
    assertEquals("", actualToStringResult);
    assertEquals("", actualAggregateValue);
  }

  @Test
  public void newBuilderTest49() {
    // Arrange and Act
    DescriptorProtos.UninterpretedOption.Builder actualNewBuilderResult = DescriptorProtos.UninterpretedOption
        .newBuilder();

    // Assert
    int actualNameCount = actualNewBuilderResult.getNameCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualAggregateValue = actualNewBuilderResult.getAggregateValue();
    assertEquals(0, actualNameCount);
    assertEquals("", actualNewBuilderResult.getIdentifierValue());
    assertEquals("", actualToStringResult);
    assertEquals("", actualAggregateValue);
  }

  @Test
  public void newBuilderForTypeTest25() {
    // Arrange and Act
    DescriptorProtos.UninterpretedOption.Builder actualNewBuilderForTypeResult = DescriptorProtos.UninterpretedOption
        .getDefaultInstance().newBuilderForType();

    // Assert
    int actualNameCount = actualNewBuilderForTypeResult.getNameCount();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    String actualAggregateValue = actualNewBuilderForTypeResult.getAggregateValue();
    assertEquals(0, actualNameCount);
    assertEquals("", actualNewBuilderForTypeResult.getIdentifierValue());
    assertEquals("", actualToStringResult);
    assertEquals("", actualAggregateValue);
  }

  @Test
  public void parseFromTest156() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.UninterpretedOption.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest155() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.UninterpretedOption.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest154() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.UninterpretedOption.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest153() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.UninterpretedOption.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest152() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.UninterpretedOption.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest151() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.UninterpretedOption.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest26() {
    // Arrange, Act and Assert
    assertEquals(-212535042, DescriptorProtos.UninterpretedOption.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest26() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.UninterpretedOption.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest26() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.UninterpretedOption.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest26() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.UninterpretedOption.getDefaultInstance().isInitialized());
  }

  @Test
  public void getAggregateValueTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.UninterpretedOption.getDefaultInstance().getAggregateValue());
  }

  @Test
  public void hasAggregateValueTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.UninterpretedOption.getDefaultInstance().hasAggregateValue());
  }

  @Test
  public void hasStringValueTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.UninterpretedOption.getDefaultInstance().hasStringValue());
  }

  @Test
  public void getDoubleValueTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, DescriptorProtos.UninterpretedOption.getDefaultInstance().getDoubleValue(), 0.0);
  }

  @Test
  public void hasDoubleValueTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.UninterpretedOption.getDefaultInstance().hasDoubleValue());
  }

  @Test
  public void getNegativeIntValueTest() {
    // Arrange, Act and Assert
    assertEquals(0L, DescriptorProtos.UninterpretedOption.getDefaultInstance().getNegativeIntValue());
  }

  @Test
  public void hasNegativeIntValueTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.UninterpretedOption.getDefaultInstance().hasNegativeIntValue());
  }

  @Test
  public void getPositiveIntValueTest() {
    // Arrange, Act and Assert
    assertEquals(0L, DescriptorProtos.UninterpretedOption.getDefaultInstance().getPositiveIntValue());
  }

  @Test
  public void hasPositiveIntValueTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.UninterpretedOption.getDefaultInstance().hasPositiveIntValue());
  }

  @Test
  public void getIdentifierValueTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.UninterpretedOption.getDefaultInstance().getIdentifierValue());
  }

  @Test
  public void hasIdentifierValueTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.UninterpretedOption.getDefaultInstance().hasIdentifierValue());
  }

  @Test
  public void getNameOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.UninterpretedOption.getDefaultInstance().getNameOrBuilder(1);
  }

  @Test
  public void getNameTest9() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.UninterpretedOption.getDefaultInstance().getName(1);
  }

  @Test
  public void getNameCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.UninterpretedOption.getDefaultInstance().getNameCount());
  }

  @Test
  public void getNameOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.UninterpretedOption.getDefaultInstance().getNameOrBuilderList().size());
  }

  @Test
  public void getNameListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.UninterpretedOption.getDefaultInstance().getNameList().size());
  }

  @Test
  public void toBuilderTest24() {
    // Arrange and Act
    DescriptorProtos.SourceCodeInfo.Location.Builder actualToBuilderResult = DescriptorProtos.SourceCodeInfo.Location
        .getDefaultInstance().toBuilder();

    // Assert
    int actualSpanCount = actualToBuilderResult.getSpanCount();
    String actualLeadingComments = actualToBuilderResult.getLeadingComments();
    int actualLeadingDetachedCommentsCount = actualToBuilderResult.getLeadingDetachedCommentsCount();
    String actualToStringResult = actualToBuilderResult.toString();
    String actualTrailingComments = actualToBuilderResult.getTrailingComments();
    assertEquals(0, actualSpanCount);
    assertEquals(0, actualLeadingDetachedCommentsCount);
    assertEquals(0, actualToBuilderResult.getPathCount());
    assertEquals("", actualTrailingComments);
    assertEquals("", actualLeadingComments);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderTest48() {
    // Arrange and Act
    DescriptorProtos.SourceCodeInfo.Location.Builder actualNewBuilderResult = DescriptorProtos.SourceCodeInfo.Location
        .newBuilder(DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance());

    // Assert
    int actualSpanCount = actualNewBuilderResult.getSpanCount();
    String actualLeadingComments = actualNewBuilderResult.getLeadingComments();
    int actualLeadingDetachedCommentsCount = actualNewBuilderResult.getLeadingDetachedCommentsCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualTrailingComments = actualNewBuilderResult.getTrailingComments();
    assertEquals(0, actualSpanCount);
    assertEquals(0, actualLeadingDetachedCommentsCount);
    assertEquals(0, actualNewBuilderResult.getPathCount());
    assertEquals("", actualTrailingComments);
    assertEquals("", actualLeadingComments);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderTest47() {
    // Arrange and Act
    DescriptorProtos.SourceCodeInfo.Location.Builder actualNewBuilderResult = DescriptorProtos.SourceCodeInfo.Location
        .newBuilder();

    // Assert
    int actualSpanCount = actualNewBuilderResult.getSpanCount();
    String actualLeadingComments = actualNewBuilderResult.getLeadingComments();
    int actualLeadingDetachedCommentsCount = actualNewBuilderResult.getLeadingDetachedCommentsCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualTrailingComments = actualNewBuilderResult.getTrailingComments();
    assertEquals(0, actualSpanCount);
    assertEquals(0, actualLeadingDetachedCommentsCount);
    assertEquals(0, actualNewBuilderResult.getPathCount());
    assertEquals("", actualTrailingComments);
    assertEquals("", actualLeadingComments);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderForTypeTest24() {
    // Arrange and Act
    DescriptorProtos.SourceCodeInfo.Location.Builder actualNewBuilderForTypeResult = DescriptorProtos.SourceCodeInfo.Location
        .getDefaultInstance().newBuilderForType();

    // Assert
    int actualSpanCount = actualNewBuilderForTypeResult.getSpanCount();
    String actualLeadingComments = actualNewBuilderForTypeResult.getLeadingComments();
    int actualLeadingDetachedCommentsCount = actualNewBuilderForTypeResult.getLeadingDetachedCommentsCount();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    String actualTrailingComments = actualNewBuilderForTypeResult.getTrailingComments();
    assertEquals(0, actualSpanCount);
    assertEquals(0, actualLeadingDetachedCommentsCount);
    assertEquals(0, actualNewBuilderForTypeResult.getPathCount());
    assertEquals("", actualTrailingComments);
    assertEquals("", actualLeadingComments);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void parseFromTest150() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.SourceCodeInfo.Location.parseFrom((CodedInputStream) null,
        ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest149() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.SourceCodeInfo.Location.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest148() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.SourceCodeInfo.Location.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest147() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.SourceCodeInfo.Location.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest146() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.SourceCodeInfo.Location.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest145() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.SourceCodeInfo.Location.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest25() {
    // Arrange, Act and Assert
    assertEquals(1654677052, DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest25() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest25() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest25() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().isInitialized());
  }

  @Test
  public void getLeadingDetachedCommentsBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().getLeadingDetachedCommentsBytes(1);
  }

  @Test
  public void getLeadingDetachedCommentsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().getLeadingDetachedComments(1);
  }

  @Test
  public void getLeadingDetachedCommentsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().getLeadingDetachedCommentsCount());
  }

  @Test
  public void getLeadingDetachedCommentsListTest() {
    // Arrange, Act and Assert
    assertEquals(0,
        DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().getLeadingDetachedCommentsList().size());
  }

  @Test
  public void getTrailingCommentsTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().getTrailingComments());
  }

  @Test
  public void hasTrailingCommentsTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().hasTrailingComments());
  }

  @Test
  public void getLeadingCommentsTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().getLeadingComments());
  }

  @Test
  public void hasLeadingCommentsTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().hasLeadingComments());
  }

  @Test
  public void getSpanTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().getSpan(1);
  }

  @Test
  public void getSpanCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().getSpanCount());
  }

  @Test
  public void getSpanListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().getSpanList().size());
  }

  @Test
  public void getPathTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().getPath(1);
  }

  @Test
  public void getPathCountTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().getPathCount());
  }

  @Test
  public void getPathListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().getPathList().size());
  }

  @Test
  public void toBuilderTest23() {
    // Arrange and Act
    DescriptorProtos.SourceCodeInfo.Builder actualToBuilderResult = DescriptorProtos.SourceCodeInfo.getDefaultInstance()
        .toBuilder();

    // Assert
    int actualLocationCount = actualToBuilderResult.getLocationCount();
    assertEquals(0, actualLocationCount);
    assertEquals("", actualToBuilderResult.toString());
  }

  @Test
  public void newBuilderTest46() {
    // Arrange and Act
    DescriptorProtos.SourceCodeInfo.Builder actualNewBuilderResult = DescriptorProtos.SourceCodeInfo
        .newBuilder(DescriptorProtos.SourceCodeInfo.getDefaultInstance());

    // Assert
    int actualLocationCount = actualNewBuilderResult.getLocationCount();
    assertEquals(0, actualLocationCount);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderTest45() {
    // Arrange and Act
    DescriptorProtos.SourceCodeInfo.Builder actualNewBuilderResult = DescriptorProtos.SourceCodeInfo.newBuilder();

    // Assert
    int actualLocationCount = actualNewBuilderResult.getLocationCount();
    assertEquals(0, actualLocationCount);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderForTypeTest23() {
    // Arrange and Act
    DescriptorProtos.SourceCodeInfo.Builder actualNewBuilderForTypeResult = DescriptorProtos.SourceCodeInfo
        .getDefaultInstance().newBuilderForType();

    // Assert
    int actualLocationCount = actualNewBuilderForTypeResult.getLocationCount();
    assertEquals(0, actualLocationCount);
    assertEquals("", actualNewBuilderForTypeResult.toString());
  }

  @Test
  public void parseFromTest144() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.SourceCodeInfo.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest143() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.SourceCodeInfo.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest142() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.SourceCodeInfo.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest141() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.SourceCodeInfo.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest140() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.SourceCodeInfo.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest139() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.SourceCodeInfo.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest24() {
    // Arrange, Act and Assert
    assertEquals(-1129434785, DescriptorProtos.SourceCodeInfo.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest24() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.SourceCodeInfo.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest24() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.SourceCodeInfo.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest24() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.SourceCodeInfo.getDefaultInstance().isInitialized());
  }

  @Test
  public void getLocationOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.SourceCodeInfo.getDefaultInstance().getLocationOrBuilder(1);
  }

  @Test
  public void getLocationTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.SourceCodeInfo.getDefaultInstance().getLocation(1);
  }

  @Test
  public void getLocationCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.SourceCodeInfo.getDefaultInstance().getLocationCount());
  }

  @Test
  public void getLocationOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.SourceCodeInfo.getDefaultInstance().getLocationOrBuilderList().size());
  }

  @Test
  public void getLocationListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.SourceCodeInfo.getDefaultInstance().getLocationList().size());
  }

  @Test
  public void toBuilderTest22() {
    // Arrange and Act
    DescriptorProtos.ServiceOptions.Builder actualToBuilderResult = DescriptorProtos.ServiceOptions.getDefaultInstance()
        .toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    int actualUninterpretedOptionCount = actualToBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertTrue(actualToBuilderResult.isInitialized());
    assertEquals(0, actualUninterpretedOptionCount);
  }

  @Test
  public void newBuilderTest44() {
    // Arrange and Act
    DescriptorProtos.ServiceOptions.Builder actualNewBuilderResult = DescriptorProtos.ServiceOptions
        .newBuilder(DescriptorProtos.ServiceOptions.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertTrue(actualNewBuilderResult.isInitialized());
    assertEquals(0, actualUninterpretedOptionCount);
  }

  @Test
  public void newBuilderTest43() {
    // Arrange and Act
    DescriptorProtos.ServiceOptions.Builder actualNewBuilderResult = DescriptorProtos.ServiceOptions.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertTrue(actualNewBuilderResult.isInitialized());
    assertEquals(0, actualUninterpretedOptionCount);
  }

  @Test
  public void newBuilderForTypeTest22() {
    // Arrange and Act
    DescriptorProtos.ServiceOptions.Builder actualNewBuilderForTypeResult = DescriptorProtos.ServiceOptions
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderForTypeResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertTrue(actualNewBuilderForTypeResult.isInitialized());
    assertEquals(0, actualUninterpretedOptionCount);
  }

  @Test
  public void parseFromTest138() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.ServiceOptions.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest137() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.ServiceOptions.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest18() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    DescriptorProtos.ServiceOptions actualParseDelimitedFromResult = DescriptorProtos.ServiceOptions
        .parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    int actualMemoizedSerializedSize = actualParseDelimitedFromResult.getMemoizedSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    String actualInitializationErrorString = actualParseDelimitedFromResult.getInitializationErrorString();
    assertFalse(actualParseDelimitedFromResult.getDeprecated());
    assertEquals("", actualInitializationErrorString);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals(0, actualMemoizedSerializedSize);
    assertTrue(actualIsInitializedResult);
    assertEquals(0, actualSerializedSize);
  }

  @Test
  public void parseDelimitedFromTest17() throws IOException {
    // Arrange and Act
    DescriptorProtos.ServiceOptions actualParseDelimitedFromResult = DescriptorProtos.ServiceOptions
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    int actualMemoizedSerializedSize = actualParseDelimitedFromResult.getMemoizedSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    String actualInitializationErrorString = actualParseDelimitedFromResult.getInitializationErrorString();
    assertFalse(actualParseDelimitedFromResult.getDeprecated());
    assertEquals("", actualInitializationErrorString);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals(0, actualMemoizedSerializedSize);
    assertTrue(actualIsInitializedResult);
    assertEquals(0, actualSerializedSize);
  }

  @Test
  public void parseFromTest136() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.ServiceOptions.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest135() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.ServiceOptions.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest134() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.ServiceOptions.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest133() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.ServiceOptions.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest23() {
    // Arrange, Act and Assert
    assertEquals(251883048, DescriptorProtos.ServiceOptions.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest23() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.ServiceOptions.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest23() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.ServiceOptions.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest23() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.ServiceOptions.getDefaultInstance().isInitialized());
  }

  @Test
  public void getUninterpretedOptionOrBuilderTest9() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.ServiceOptions.getDefaultInstance().getUninterpretedOptionOrBuilder(1);
  }

  @Test
  public void getUninterpretedOptionTest9() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.ServiceOptions.getDefaultInstance().getUninterpretedOption(1);
  }

  @Test
  public void getUninterpretedOptionCountTest9() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.ServiceOptions.getDefaultInstance().getUninterpretedOptionCount());
  }

  @Test
  public void getUninterpretedOptionOrBuilderListTest9() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.ServiceOptions.getDefaultInstance().getUninterpretedOptionOrBuilderList().size());
  }

  @Test
  public void getUninterpretedOptionListTest9() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.ServiceOptions.getDefaultInstance().getUninterpretedOptionList().size());
  }

  @Test
  public void getDeprecatedTest7() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.ServiceOptions.getDefaultInstance().getDeprecated());
  }

  @Test
  public void hasDeprecatedTest7() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.ServiceOptions.getDefaultInstance().hasDeprecated());
  }

  @Test
  public void toBuilderTest21() {
    // Arrange and Act
    DescriptorProtos.ServiceDescriptorProto.Builder actualToBuilderResult = DescriptorProtos.ServiceDescriptorProto
        .getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    assertEquals("", actualName);
    assertEquals("", actualToBuilderResult.toString());
  }

  @Test
  public void newBuilderTest42() {
    // Arrange and Act
    DescriptorProtos.ServiceDescriptorProto.Builder actualNewBuilderResult = DescriptorProtos.ServiceDescriptorProto
        .newBuilder(DescriptorProtos.ServiceDescriptorProto.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderTest41() {
    // Arrange and Act
    DescriptorProtos.ServiceDescriptorProto.Builder actualNewBuilderResult = DescriptorProtos.ServiceDescriptorProto
        .newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderForTypeTest21() {
    // Arrange and Act
    DescriptorProtos.ServiceDescriptorProto.Builder actualNewBuilderForTypeResult = DescriptorProtos.ServiceDescriptorProto
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderForTypeResult.toString());
  }

  @Test
  public void parseFromTest132() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.ServiceDescriptorProto.parseFrom((CodedInputStream) null,
        ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest131() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.ServiceDescriptorProto.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest130() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.ServiceDescriptorProto.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest129() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.ServiceDescriptorProto.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest128() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.ServiceDescriptorProto.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest127() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.ServiceDescriptorProto.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest22() {
    // Arrange, Act and Assert
    assertEquals(254235676, DescriptorProtos.ServiceDescriptorProto.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest22() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.ServiceDescriptorProto.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest22() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.ServiceDescriptorProto.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest22() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.ServiceDescriptorProto.getDefaultInstance().isInitialized());
  }

  @Test
  public void getOptionsOrBuilderTest9() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.ServiceDescriptorProto.getDefaultInstance()
        .getOptionsOrBuilder() instanceof DescriptorProtos.ServiceOptions);
  }

  @Test
  public void hasOptionsTest9() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.ServiceDescriptorProto.getDefaultInstance().hasOptions());
  }

  @Test
  public void getMethodOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.ServiceDescriptorProto.getDefaultInstance().getMethodOrBuilder(1);
  }

  @Test
  public void getMethodTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.ServiceDescriptorProto.getDefaultInstance().getMethod(1);
  }

  @Test
  public void getMethodCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.ServiceDescriptorProto.getDefaultInstance().getMethodCount());
  }

  @Test
  public void getMethodOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.ServiceDescriptorProto.getDefaultInstance().getMethodOrBuilderList().size());
  }

  @Test
  public void getMethodListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.ServiceDescriptorProto.getDefaultInstance().getMethodList().size());
  }

  @Test
  public void getNameTest8() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.ServiceDescriptorProto.getDefaultInstance().getName());
  }

  @Test
  public void hasNameTest8() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.ServiceDescriptorProto.getDefaultInstance().hasName());
  }

  @Test
  public void toBuilderTest20() {
    // Arrange and Act
    DescriptorProtos.OneofOptions.Builder actualToBuilderResult = DescriptorProtos.OneofOptions.getDefaultInstance()
        .toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    int actualUninterpretedOptionCount = actualToBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualToBuilderResult.isInitialized());
  }

  @Test
  public void newBuilderTest40() {
    // Arrange and Act
    DescriptorProtos.OneofOptions.Builder actualNewBuilderResult = DescriptorProtos.OneofOptions
        .newBuilder(DescriptorProtos.OneofOptions.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualNewBuilderResult.isInitialized());
  }

  @Test
  public void newBuilderTest39() {
    // Arrange and Act
    DescriptorProtos.OneofOptions.Builder actualNewBuilderResult = DescriptorProtos.OneofOptions.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualNewBuilderResult.isInitialized());
  }

  @Test
  public void newBuilderForTypeTest20() {
    // Arrange and Act
    DescriptorProtos.OneofOptions.Builder actualNewBuilderForTypeResult = DescriptorProtos.OneofOptions
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderForTypeResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualNewBuilderForTypeResult.isInitialized());
  }

  @Test
  public void parseFromTest126() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.OneofOptions.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest125() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.OneofOptions.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest16() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    DescriptorProtos.OneofOptions actualParseDelimitedFromResult = DescriptorProtos.OneofOptions
        .parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    int actualMemoizedSerializedSize = actualParseDelimitedFromResult.getMemoizedSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualParseDelimitedFromResult.getInitializationErrorString());
    assertEquals(0, actualSerializedSize);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals(0, actualMemoizedSerializedSize);
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void parseDelimitedFromTest15() throws IOException {
    // Arrange and Act
    DescriptorProtos.OneofOptions actualParseDelimitedFromResult = DescriptorProtos.OneofOptions
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    int actualMemoizedSerializedSize = actualParseDelimitedFromResult.getMemoizedSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualParseDelimitedFromResult.getInitializationErrorString());
    assertEquals(0, actualSerializedSize);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals(0, actualMemoizedSerializedSize);
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void parseFromTest124() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.OneofOptions.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest123() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.OneofOptions.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest122() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.OneofOptions.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest121() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.OneofOptions.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest21() {
    // Arrange, Act and Assert
    assertEquals(827090902, DescriptorProtos.OneofOptions.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest21() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.OneofOptions.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest21() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.OneofOptions.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest21() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.OneofOptions.getDefaultInstance().isInitialized());
  }

  @Test
  public void getUninterpretedOptionOrBuilderTest8() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.OneofOptions.getDefaultInstance().getUninterpretedOptionOrBuilder(1);
  }

  @Test
  public void getUninterpretedOptionTest8() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.OneofOptions.getDefaultInstance().getUninterpretedOption(1);
  }

  @Test
  public void getUninterpretedOptionCountTest8() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.OneofOptions.getDefaultInstance().getUninterpretedOptionCount());
  }

  @Test
  public void getUninterpretedOptionOrBuilderListTest8() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.OneofOptions.getDefaultInstance().getUninterpretedOptionOrBuilderList().size());
  }

  @Test
  public void getUninterpretedOptionListTest8() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.OneofOptions.getDefaultInstance().getUninterpretedOptionList().size());
  }

  @Test
  public void toBuilderTest19() {
    // Arrange and Act
    DescriptorProtos.OneofDescriptorProto.Builder actualToBuilderResult = DescriptorProtos.OneofDescriptorProto
        .getDefaultInstance().toBuilder();

    // Assert
    DescriptorProtos.OneofOptionsOrBuilder optionsOrBuilder = actualToBuilderResult.getOptionsOrBuilder();
    String actualName = actualToBuilderResult.getName();
    assertTrue(optionsOrBuilder instanceof DescriptorProtos.OneofOptions);
    assertEquals("", actualName);
    assertEquals("", actualToBuilderResult.toString());
  }

  @Test
  public void newBuilderTest38() {
    // Arrange and Act
    DescriptorProtos.OneofDescriptorProto.Builder actualNewBuilderResult = DescriptorProtos.OneofDescriptorProto
        .newBuilder(DescriptorProtos.OneofDescriptorProto.getDefaultInstance());

    // Assert
    DescriptorProtos.OneofOptionsOrBuilder optionsOrBuilder = actualNewBuilderResult.getOptionsOrBuilder();
    String actualName = actualNewBuilderResult.getName();
    assertTrue(optionsOrBuilder instanceof DescriptorProtos.OneofOptions);
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderTest37() {
    // Arrange and Act
    DescriptorProtos.OneofDescriptorProto.Builder actualNewBuilderResult = DescriptorProtos.OneofDescriptorProto
        .newBuilder();

    // Assert
    DescriptorProtos.OneofOptionsOrBuilder optionsOrBuilder = actualNewBuilderResult.getOptionsOrBuilder();
    String actualName = actualNewBuilderResult.getName();
    assertTrue(optionsOrBuilder instanceof DescriptorProtos.OneofOptions);
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderForTypeTest19() {
    // Arrange and Act
    DescriptorProtos.OneofDescriptorProto.Builder actualNewBuilderForTypeResult = DescriptorProtos.OneofDescriptorProto
        .getDefaultInstance().newBuilderForType();

    // Assert
    DescriptorProtos.OneofOptionsOrBuilder optionsOrBuilder = actualNewBuilderForTypeResult.getOptionsOrBuilder();
    String actualName = actualNewBuilderForTypeResult.getName();
    assertTrue(optionsOrBuilder instanceof DescriptorProtos.OneofOptions);
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderForTypeResult.toString());
  }

  @Test
  public void parseFromTest120() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.OneofDescriptorProto.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest119() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.OneofDescriptorProto.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest118() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.OneofDescriptorProto.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest117() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.OneofDescriptorProto.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest116() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.OneofDescriptorProto.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest115() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.OneofDescriptorProto.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest20() {
    // Arrange, Act and Assert
    assertEquals(-1873064666, DescriptorProtos.OneofDescriptorProto.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest20() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.OneofDescriptorProto.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest20() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.OneofDescriptorProto.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest20() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.OneofDescriptorProto.getDefaultInstance().isInitialized());
  }

  @Test
  public void getOptionsOrBuilderTest8() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.OneofDescriptorProto.getDefaultInstance()
        .getOptionsOrBuilder() instanceof DescriptorProtos.OneofOptions);
  }

  @Test
  public void hasOptionsTest8() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.OneofDescriptorProto.getDefaultInstance().hasOptions());
  }

  @Test
  public void getNameTest7() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.OneofDescriptorProto.getDefaultInstance().getName());
  }

  @Test
  public void hasNameTest7() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.OneofDescriptorProto.getDefaultInstance().hasName());
  }

  @Test
  public void valueOfTest12() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.MethodOptions.IdempotencyLevel.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest6() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.MethodOptions.IdempotencyLevel.NO_SIDE_EFFECTS,
        DescriptorProtos.MethodOptions.IdempotencyLevel.forNumber(1));
  }

  @Test
  public void valueOfTest11() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.MethodOptions.IdempotencyLevel.NO_SIDE_EFFECTS,
        DescriptorProtos.MethodOptions.IdempotencyLevel.valueOf(1));
  }

  @Test
  public void getNumberTest8() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN.getNumber());
  }

  @Test
  public void toBuilderTest18() {
    // Arrange and Act
    DescriptorProtos.MethodOptions.Builder actualToBuilderResult = DescriptorProtos.MethodOptions.getDefaultInstance()
        .toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    int actualUninterpretedOptionCount = actualToBuilderResult.getUninterpretedOptionCount();
    DescriptorProtos.MethodOptions.IdempotencyLevel actualIdempotencyLevel = actualToBuilderResult
        .getIdempotencyLevel();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualToBuilderResult.isInitialized());
    assertEquals(DescriptorProtos.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN, actualIdempotencyLevel);
  }

  @Test
  public void newBuilderTest36() {
    // Arrange and Act
    DescriptorProtos.MethodOptions.Builder actualNewBuilderResult = DescriptorProtos.MethodOptions
        .newBuilder(DescriptorProtos.MethodOptions.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    DescriptorProtos.MethodOptions.IdempotencyLevel actualIdempotencyLevel = actualNewBuilderResult
        .getIdempotencyLevel();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualNewBuilderResult.isInitialized());
    assertEquals(DescriptorProtos.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN, actualIdempotencyLevel);
  }

  @Test
  public void newBuilderTest35() {
    // Arrange and Act
    DescriptorProtos.MethodOptions.Builder actualNewBuilderResult = DescriptorProtos.MethodOptions.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    DescriptorProtos.MethodOptions.IdempotencyLevel actualIdempotencyLevel = actualNewBuilderResult
        .getIdempotencyLevel();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualNewBuilderResult.isInitialized());
    assertEquals(DescriptorProtos.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN, actualIdempotencyLevel);
  }

  @Test
  public void newBuilderForTypeTest18() {
    // Arrange and Act
    DescriptorProtos.MethodOptions.Builder actualNewBuilderForTypeResult = DescriptorProtos.MethodOptions
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderForTypeResult.getUninterpretedOptionCount();
    DescriptorProtos.MethodOptions.IdempotencyLevel actualIdempotencyLevel = actualNewBuilderForTypeResult
        .getIdempotencyLevel();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualNewBuilderForTypeResult.isInitialized());
    assertEquals(DescriptorProtos.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN, actualIdempotencyLevel);
  }

  @Test
  public void parseFromTest114() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.MethodOptions.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest113() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.MethodOptions.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest14() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    DescriptorProtos.MethodOptions actualParseDelimitedFromResult = DescriptorProtos.MethodOptions
        .parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    DescriptorProtos.MethodOptions.IdempotencyLevel actualIdempotencyLevel = actualParseDelimitedFromResult
        .getIdempotencyLevel();
    int actualMemoizedSerializedSize = actualParseDelimitedFromResult.getMemoizedSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    String actualInitializationErrorString = actualParseDelimitedFromResult.getInitializationErrorString();
    assertFalse(actualParseDelimitedFromResult.getDeprecated());
    assertEquals("", actualInitializationErrorString);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals(0, actualMemoizedSerializedSize);
    assertEquals(0, actualSerializedSize);
    assertEquals(DescriptorProtos.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN, actualIdempotencyLevel);
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void parseDelimitedFromTest13() throws IOException {
    // Arrange and Act
    DescriptorProtos.MethodOptions actualParseDelimitedFromResult = DescriptorProtos.MethodOptions
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    DescriptorProtos.MethodOptions.IdempotencyLevel actualIdempotencyLevel = actualParseDelimitedFromResult
        .getIdempotencyLevel();
    int actualMemoizedSerializedSize = actualParseDelimitedFromResult.getMemoizedSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    String actualInitializationErrorString = actualParseDelimitedFromResult.getInitializationErrorString();
    assertFalse(actualParseDelimitedFromResult.getDeprecated());
    assertEquals("", actualInitializationErrorString);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals(0, actualMemoizedSerializedSize);
    assertEquals(0, actualSerializedSize);
    assertEquals(DescriptorProtos.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN, actualIdempotencyLevel);
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void parseFromTest112() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.MethodOptions.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest111() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.MethodOptions.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest110() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.MethodOptions.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest109() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.MethodOptions.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest19() {
    // Arrange, Act and Assert
    assertEquals(2028624482, DescriptorProtos.MethodOptions.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest19() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MethodOptions.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest19() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.MethodOptions.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest19() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.MethodOptions.getDefaultInstance().isInitialized());
  }

  @Test
  public void getUninterpretedOptionOrBuilderTest7() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.MethodOptions.getDefaultInstance().getUninterpretedOptionOrBuilder(1);
  }

  @Test
  public void getUninterpretedOptionTest7() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.MethodOptions.getDefaultInstance().getUninterpretedOption(1);
  }

  @Test
  public void getUninterpretedOptionCountTest7() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.MethodOptions.getDefaultInstance().getUninterpretedOptionCount());
  }

  @Test
  public void getUninterpretedOptionOrBuilderListTest7() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.MethodOptions.getDefaultInstance().getUninterpretedOptionOrBuilderList().size());
  }

  @Test
  public void getUninterpretedOptionListTest7() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.MethodOptions.getDefaultInstance().getUninterpretedOptionList().size());
  }

  @Test
  public void getIdempotencyLevelTest() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN,
        DescriptorProtos.MethodOptions.getDefaultInstance().getIdempotencyLevel());
  }

  @Test
  public void hasIdempotencyLevelTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MethodOptions.getDefaultInstance().hasIdempotencyLevel());
  }

  @Test
  public void getDeprecatedTest6() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MethodOptions.getDefaultInstance().getDeprecated());
  }

  @Test
  public void hasDeprecatedTest6() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MethodOptions.getDefaultInstance().hasDeprecated());
  }

  @Test
  public void toBuilderTest17() {
    // Arrange and Act
    DescriptorProtos.MethodDescriptorProto.Builder actualToBuilderResult = DescriptorProtos.MethodDescriptorProto
        .getDefaultInstance().toBuilder();

    // Assert
    String actualInputType = actualToBuilderResult.getInputType();
    String actualName = actualToBuilderResult.getName();
    DescriptorProtos.MethodOptions.Builder actualOptionsBuilder = actualToBuilderResult.getOptionsBuilder();
    String actualToStringResult = actualToBuilderResult.toString();
    String actualOutputType = actualToBuilderResult.getOutputType();
    assertEquals("", actualInputType);
    assertEquals("", actualName);
    assertEquals("", actualOutputType);
    assertEquals("options {\n}\n", actualToStringResult);
    assertSame(actualToBuilderResult.getOptionsOrBuilder(), actualOptionsBuilder);
  }

  @Test
  public void newBuilderTest34() {
    // Arrange and Act
    DescriptorProtos.MethodDescriptorProto.Builder actualNewBuilderResult = DescriptorProtos.MethodDescriptorProto
        .newBuilder(DescriptorProtos.MethodDescriptorProto.getDefaultInstance());

    // Assert
    String actualInputType = actualNewBuilderResult.getInputType();
    String actualName = actualNewBuilderResult.getName();
    DescriptorProtos.MethodOptions.Builder actualOptionsBuilder = actualNewBuilderResult.getOptionsBuilder();
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualOutputType = actualNewBuilderResult.getOutputType();
    assertEquals("", actualInputType);
    assertEquals("", actualName);
    assertEquals("", actualOutputType);
    assertEquals("options {\n}\n", actualToStringResult);
    assertSame(actualNewBuilderResult.getOptionsOrBuilder(), actualOptionsBuilder);
  }

  @Test
  public void newBuilderTest33() {
    // Arrange and Act
    DescriptorProtos.MethodDescriptorProto.Builder actualNewBuilderResult = DescriptorProtos.MethodDescriptorProto
        .newBuilder();

    // Assert
    String actualInputType = actualNewBuilderResult.getInputType();
    String actualName = actualNewBuilderResult.getName();
    DescriptorProtos.MethodOptions.Builder actualOptionsBuilder = actualNewBuilderResult.getOptionsBuilder();
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualOutputType = actualNewBuilderResult.getOutputType();
    assertEquals("", actualInputType);
    assertEquals("", actualName);
    assertEquals("", actualOutputType);
    assertEquals("options {\n}\n", actualToStringResult);
    assertSame(actualNewBuilderResult.getOptionsOrBuilder(), actualOptionsBuilder);
  }

  @Test
  public void newBuilderForTypeTest17() {
    // Arrange and Act
    DescriptorProtos.MethodDescriptorProto.Builder actualNewBuilderForTypeResult = DescriptorProtos.MethodDescriptorProto
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualInputType = actualNewBuilderForTypeResult.getInputType();
    String actualName = actualNewBuilderForTypeResult.getName();
    DescriptorProtos.MethodOptions.Builder actualOptionsBuilder = actualNewBuilderForTypeResult.getOptionsBuilder();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    String actualOutputType = actualNewBuilderForTypeResult.getOutputType();
    assertEquals("", actualInputType);
    assertEquals("", actualName);
    assertEquals("", actualOutputType);
    assertEquals("options {\n}\n", actualToStringResult);
    assertSame(actualNewBuilderForTypeResult.getOptionsOrBuilder(), actualOptionsBuilder);
  }

  @Test
  public void parseFromTest108() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.MethodDescriptorProto.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest107() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.MethodDescriptorProto.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest106() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.MethodDescriptorProto.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest105() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.MethodDescriptorProto.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest104() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.MethodDescriptorProto.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest103() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.MethodDescriptorProto.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest18() {
    // Arrange, Act and Assert
    assertEquals(-999566837, DescriptorProtos.MethodDescriptorProto.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest18() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MethodDescriptorProto.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest18() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.MethodDescriptorProto.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest18() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.MethodDescriptorProto.getDefaultInstance().isInitialized());
  }

  @Test
  public void getServerStreamingTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MethodDescriptorProto.getDefaultInstance().getServerStreaming());
  }

  @Test
  public void hasServerStreamingTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MethodDescriptorProto.getDefaultInstance().hasServerStreaming());
  }

  @Test
  public void getClientStreamingTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MethodDescriptorProto.getDefaultInstance().getClientStreaming());
  }

  @Test
  public void hasClientStreamingTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MethodDescriptorProto.getDefaultInstance().hasClientStreaming());
  }

  @Test
  public void getOptionsOrBuilderTest7() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.MethodDescriptorProto.getDefaultInstance()
        .getOptionsOrBuilder() instanceof DescriptorProtos.MethodOptions);
  }

  @Test
  public void hasOptionsTest7() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MethodDescriptorProto.getDefaultInstance().hasOptions());
  }

  @Test
  public void getOutputTypeTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.MethodDescriptorProto.getDefaultInstance().getOutputType());
  }

  @Test
  public void hasOutputTypeTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MethodDescriptorProto.getDefaultInstance().hasOutputType());
  }

  @Test
  public void getInputTypeTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.MethodDescriptorProto.getDefaultInstance().getInputType());
  }

  @Test
  public void hasInputTypeTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MethodDescriptorProto.getDefaultInstance().hasInputType());
  }

  @Test
  public void getNameTest6() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.MethodDescriptorProto.getDefaultInstance().getName());
  }

  @Test
  public void hasNameTest6() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MethodDescriptorProto.getDefaultInstance().hasName());
  }

  @Test
  public void toBuilderTest16() {
    // Arrange and Act
    DescriptorProtos.MessageOptions.Builder actualToBuilderResult = DescriptorProtos.MessageOptions.getDefaultInstance()
        .toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    int actualUninterpretedOptionCount = actualToBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualToBuilderResult.isInitialized());
  }

  @Test
  public void newBuilderTest32() {
    // Arrange and Act
    DescriptorProtos.MessageOptions.Builder actualNewBuilderResult = DescriptorProtos.MessageOptions
        .newBuilder(DescriptorProtos.MessageOptions.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualNewBuilderResult.isInitialized());
  }

  @Test
  public void newBuilderTest31() {
    // Arrange and Act
    DescriptorProtos.MessageOptions.Builder actualNewBuilderResult = DescriptorProtos.MessageOptions.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualNewBuilderResult.isInitialized());
  }

  @Test
  public void newBuilderForTypeTest16() {
    // Arrange and Act
    DescriptorProtos.MessageOptions.Builder actualNewBuilderForTypeResult = DescriptorProtos.MessageOptions
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderForTypeResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualNewBuilderForTypeResult.isInitialized());
  }

  @Test
  public void parseFromTest102() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.MessageOptions.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest101() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.MessageOptions.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest12() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    DescriptorProtos.MessageOptions actualParseDelimitedFromResult = DescriptorProtos.MessageOptions
        .parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    boolean actualDeprecated = actualParseDelimitedFromResult.getDeprecated();
    boolean actualNoStandardDescriptorAccessor = actualParseDelimitedFromResult.getNoStandardDescriptorAccessor();
    boolean actualMapEntry = actualParseDelimitedFromResult.getMapEntry();
    int actualMemoizedSerializedSize = actualParseDelimitedFromResult.getMemoizedSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    String actualInitializationErrorString = actualParseDelimitedFromResult.getInitializationErrorString();
    assertEquals(0, actualSerializedSize);
    assertFalse(actualMapEntry);
    assertEquals(0, actualMemoizedSerializedSize);
    assertFalse(actualDeprecated);
    assertTrue(actualIsInitializedResult);
    assertEquals("", actualInitializationErrorString);
    assertFalse(actualParseDelimitedFromResult.getMessageSetWireFormat());
    assertEquals(0, actualUninterpretedOptionCount);
    assertFalse(actualNoStandardDescriptorAccessor);
  }

  @Test
  public void parseDelimitedFromTest11() throws IOException {
    // Arrange and Act
    DescriptorProtos.MessageOptions actualParseDelimitedFromResult = DescriptorProtos.MessageOptions
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    boolean actualDeprecated = actualParseDelimitedFromResult.getDeprecated();
    boolean actualNoStandardDescriptorAccessor = actualParseDelimitedFromResult.getNoStandardDescriptorAccessor();
    boolean actualMapEntry = actualParseDelimitedFromResult.getMapEntry();
    int actualMemoizedSerializedSize = actualParseDelimitedFromResult.getMemoizedSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    String actualInitializationErrorString = actualParseDelimitedFromResult.getInitializationErrorString();
    assertEquals(0, actualSerializedSize);
    assertFalse(actualMapEntry);
    assertEquals(0, actualMemoizedSerializedSize);
    assertFalse(actualDeprecated);
    assertTrue(actualIsInitializedResult);
    assertEquals("", actualInitializationErrorString);
    assertFalse(actualParseDelimitedFromResult.getMessageSetWireFormat());
    assertEquals(0, actualUninterpretedOptionCount);
    assertFalse(actualNoStandardDescriptorAccessor);
  }

  @Test
  public void parseFromTest100() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.MessageOptions.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest99() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.MessageOptions.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest98() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.MessageOptions.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest97() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.MessageOptions.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest17() {
    // Arrange, Act and Assert
    assertEquals(-490951594, DescriptorProtos.MessageOptions.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest17() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MessageOptions.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest17() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.MessageOptions.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest17() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.MessageOptions.getDefaultInstance().isInitialized());
  }

  @Test
  public void getUninterpretedOptionOrBuilderTest6() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.MessageOptions.getDefaultInstance().getUninterpretedOptionOrBuilder(1);
  }

  @Test
  public void getUninterpretedOptionTest6() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.MessageOptions.getDefaultInstance().getUninterpretedOption(1);
  }

  @Test
  public void getUninterpretedOptionCountTest6() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.MessageOptions.getDefaultInstance().getUninterpretedOptionCount());
  }

  @Test
  public void getUninterpretedOptionOrBuilderListTest6() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.MessageOptions.getDefaultInstance().getUninterpretedOptionOrBuilderList().size());
  }

  @Test
  public void getUninterpretedOptionListTest6() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.MessageOptions.getDefaultInstance().getUninterpretedOptionList().size());
  }

  @Test
  public void getMapEntryTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MessageOptions.getDefaultInstance().getMapEntry());
  }

  @Test
  public void hasMapEntryTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MessageOptions.getDefaultInstance().hasMapEntry());
  }

  @Test
  public void getDeprecatedTest5() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MessageOptions.getDefaultInstance().getDeprecated());
  }

  @Test
  public void hasDeprecatedTest5() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MessageOptions.getDefaultInstance().hasDeprecated());
  }

  @Test
  public void getNoStandardDescriptorAccessorTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MessageOptions.getDefaultInstance().getNoStandardDescriptorAccessor());
  }

  @Test
  public void hasNoStandardDescriptorAccessorTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MessageOptions.getDefaultInstance().hasNoStandardDescriptorAccessor());
  }

  @Test
  public void getMessageSetWireFormatTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MessageOptions.getDefaultInstance().getMessageSetWireFormat());
  }

  @Test
  public void hasMessageSetWireFormatTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.MessageOptions.getDefaultInstance().hasMessageSetWireFormat());
  }

  @Test
  public void toBuilderTest15() {
    // Arrange and Act
    DescriptorProtos.GeneratedCodeInfo.Annotation.Builder actualToBuilderResult = DescriptorProtos.GeneratedCodeInfo.Annotation
        .getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    String actualSourceFile = actualToBuilderResult.getSourceFile();
    assertEquals(0, actualToBuilderResult.getPathCount());
    assertEquals("", actualToStringResult);
    assertEquals("", actualSourceFile);
  }

  @Test
  public void newBuilderTest30() {
    // Arrange and Act
    DescriptorProtos.GeneratedCodeInfo.Annotation.Builder actualNewBuilderResult = DescriptorProtos.GeneratedCodeInfo.Annotation
        .newBuilder(DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualSourceFile = actualNewBuilderResult.getSourceFile();
    assertEquals(0, actualNewBuilderResult.getPathCount());
    assertEquals("", actualToStringResult);
    assertEquals("", actualSourceFile);
  }

  @Test
  public void newBuilderTest29() {
    // Arrange and Act
    DescriptorProtos.GeneratedCodeInfo.Annotation.Builder actualNewBuilderResult = DescriptorProtos.GeneratedCodeInfo.Annotation
        .newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualSourceFile = actualNewBuilderResult.getSourceFile();
    assertEquals(0, actualNewBuilderResult.getPathCount());
    assertEquals("", actualToStringResult);
    assertEquals("", actualSourceFile);
  }

  @Test
  public void newBuilderForTypeTest15() {
    // Arrange and Act
    DescriptorProtos.GeneratedCodeInfo.Annotation.Builder actualNewBuilderForTypeResult = DescriptorProtos.GeneratedCodeInfo.Annotation
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    String actualSourceFile = actualNewBuilderForTypeResult.getSourceFile();
    assertEquals(0, actualNewBuilderForTypeResult.getPathCount());
    assertEquals("", actualToStringResult);
    assertEquals("", actualSourceFile);
  }

  @Test
  public void parseFromTest96() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.GeneratedCodeInfo.Annotation.parseFrom((CodedInputStream) null,
        ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest95() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.GeneratedCodeInfo.Annotation.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest94() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.GeneratedCodeInfo.Annotation.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest93() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.GeneratedCodeInfo.Annotation.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest92() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.GeneratedCodeInfo.Annotation.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest91() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.GeneratedCodeInfo.Annotation.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest16() {
    // Arrange, Act and Assert
    assertEquals(785196938, DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest16() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest16() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest16() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance().isInitialized());
  }

  @Test
  public void getEndTest4() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance().getEnd());
  }

  @Test
  public void hasEndTest4() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance().hasEnd());
  }

  @Test
  public void getBeginTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance().getBegin());
  }

  @Test
  public void hasBeginTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance().hasBegin());
  }

  @Test
  public void getSourceFileTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance().getSourceFile());
  }

  @Test
  public void hasSourceFileTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance().hasSourceFile());
  }

  @Test
  public void getPathTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance().getPath(1);
  }

  @Test
  public void getPathCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance().getPathCount());
  }

  @Test
  public void getPathListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance().getPathList().size());
  }

  @Test
  public void toBuilderTest14() {
    // Arrange and Act
    DescriptorProtos.GeneratedCodeInfo.Builder actualToBuilderResult = DescriptorProtos.GeneratedCodeInfo
        .getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualToBuilderResult.getAnnotationCount());
  }

  @Test
  public void newBuilderTest28() {
    // Arrange and Act
    DescriptorProtos.GeneratedCodeInfo.Builder actualNewBuilderResult = DescriptorProtos.GeneratedCodeInfo
        .newBuilder(DescriptorProtos.GeneratedCodeInfo.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getAnnotationCount());
  }

  @Test
  public void newBuilderTest27() {
    // Arrange and Act
    DescriptorProtos.GeneratedCodeInfo.Builder actualNewBuilderResult = DescriptorProtos.GeneratedCodeInfo.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getAnnotationCount());
  }

  @Test
  public void newBuilderForTypeTest14() {
    // Arrange and Act
    DescriptorProtos.GeneratedCodeInfo.Builder actualNewBuilderForTypeResult = DescriptorProtos.GeneratedCodeInfo
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderForTypeResult.getAnnotationCount());
  }

  @Test
  public void parseFromTest90() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.GeneratedCodeInfo.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest89() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.GeneratedCodeInfo.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest88() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.GeneratedCodeInfo.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest87() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.GeneratedCodeInfo.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest86() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.GeneratedCodeInfo.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest85() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.GeneratedCodeInfo.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest15() {
    // Arrange, Act and Assert
    assertEquals(-602420257, DescriptorProtos.GeneratedCodeInfo.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest15() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.GeneratedCodeInfo.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest15() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.GeneratedCodeInfo.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest15() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.GeneratedCodeInfo.getDefaultInstance().isInitialized());
  }

  @Test
  public void getAnnotationOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.GeneratedCodeInfo.getDefaultInstance().getAnnotationOrBuilder(1);
  }

  @Test
  public void getAnnotationTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.GeneratedCodeInfo.getDefaultInstance().getAnnotation(1);
  }

  @Test
  public void getAnnotationCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.GeneratedCodeInfo.getDefaultInstance().getAnnotationCount());
  }

  @Test
  public void getAnnotationOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.GeneratedCodeInfo.getDefaultInstance().getAnnotationOrBuilderList().size());
  }

  @Test
  public void getAnnotationListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.GeneratedCodeInfo.getDefaultInstance().getAnnotationList().size());
  }

  @Test
  public void valueOfTest10() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.FileOptions.OptimizeMode.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest5() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.FileOptions.OptimizeMode.SPEED,
        DescriptorProtos.FileOptions.OptimizeMode.forNumber(1));
  }

  @Test
  public void valueOfTest9() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.FileOptions.OptimizeMode.SPEED, DescriptorProtos.FileOptions.OptimizeMode.valueOf(1));
  }

  @Test
  public void getNumberTest7() {
    // Arrange, Act and Assert
    assertEquals(1, DescriptorProtos.FileOptions.OptimizeMode.SPEED.getNumber());
  }

  @Test
  public void toBuilderTest13() {
    // Arrange and Act
    DescriptorProtos.FileOptions.Builder actualToBuilderResult = DescriptorProtos.FileOptions.getDefaultInstance()
        .toBuilder();

    // Assert
    String actualRubyPackage = actualToBuilderResult.getRubyPackage();
    String actualPhpClassPrefix = actualToBuilderResult.getPhpClassPrefix();
    String actualSwiftPrefix = actualToBuilderResult.getSwiftPrefix();
    String actualJavaOuterClassname = actualToBuilderResult.getJavaOuterClassname();
    DescriptorProtos.FileOptions.OptimizeMode actualOptimizeFor = actualToBuilderResult.getOptimizeFor();
    String actualToStringResult = actualToBuilderResult.toString();
    String actualPhpNamespace = actualToBuilderResult.getPhpNamespace();
    int actualUninterpretedOptionCount = actualToBuilderResult.getUninterpretedOptionCount();
    String actualObjcClassPrefix = actualToBuilderResult.getObjcClassPrefix();
    assertEquals("", actualToBuilderResult.getPhpMetadataNamespace());
    assertEquals("", actualObjcClassPrefix);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals("", actualPhpNamespace);
    assertEquals("", actualToStringResult);
    assertEquals(DescriptorProtos.FileOptions.OptimizeMode.SPEED, actualOptimizeFor);
    assertEquals("", actualJavaOuterClassname);
    assertEquals("", actualSwiftPrefix);
    assertEquals("", actualPhpClassPrefix);
    assertEquals("", actualRubyPackage);
  }

  @Test
  public void newBuilderTest26() {
    // Arrange and Act
    DescriptorProtos.FileOptions.Builder actualNewBuilderResult = DescriptorProtos.FileOptions
        .newBuilder(DescriptorProtos.FileOptions.getDefaultInstance());

    // Assert
    String actualRubyPackage = actualNewBuilderResult.getRubyPackage();
    String actualPhpClassPrefix = actualNewBuilderResult.getPhpClassPrefix();
    String actualSwiftPrefix = actualNewBuilderResult.getSwiftPrefix();
    String actualJavaOuterClassname = actualNewBuilderResult.getJavaOuterClassname();
    DescriptorProtos.FileOptions.OptimizeMode actualOptimizeFor = actualNewBuilderResult.getOptimizeFor();
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualPhpNamespace = actualNewBuilderResult.getPhpNamespace();
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    String actualObjcClassPrefix = actualNewBuilderResult.getObjcClassPrefix();
    assertEquals("", actualNewBuilderResult.getPhpMetadataNamespace());
    assertEquals("", actualObjcClassPrefix);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals("", actualPhpNamespace);
    assertEquals("", actualToStringResult);
    assertEquals(DescriptorProtos.FileOptions.OptimizeMode.SPEED, actualOptimizeFor);
    assertEquals("", actualJavaOuterClassname);
    assertEquals("", actualSwiftPrefix);
    assertEquals("", actualPhpClassPrefix);
    assertEquals("", actualRubyPackage);
  }

  @Test
  public void newBuilderTest25() {
    // Arrange and Act
    DescriptorProtos.FileOptions.Builder actualNewBuilderResult = DescriptorProtos.FileOptions.newBuilder();

    // Assert
    String actualRubyPackage = actualNewBuilderResult.getRubyPackage();
    String actualPhpClassPrefix = actualNewBuilderResult.getPhpClassPrefix();
    String actualSwiftPrefix = actualNewBuilderResult.getSwiftPrefix();
    String actualJavaOuterClassname = actualNewBuilderResult.getJavaOuterClassname();
    DescriptorProtos.FileOptions.OptimizeMode actualOptimizeFor = actualNewBuilderResult.getOptimizeFor();
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualPhpNamespace = actualNewBuilderResult.getPhpNamespace();
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    String actualObjcClassPrefix = actualNewBuilderResult.getObjcClassPrefix();
    assertEquals("", actualNewBuilderResult.getPhpMetadataNamespace());
    assertEquals("", actualObjcClassPrefix);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals("", actualPhpNamespace);
    assertEquals("", actualToStringResult);
    assertEquals(DescriptorProtos.FileOptions.OptimizeMode.SPEED, actualOptimizeFor);
    assertEquals("", actualJavaOuterClassname);
    assertEquals("", actualSwiftPrefix);
    assertEquals("", actualPhpClassPrefix);
    assertEquals("", actualRubyPackage);
  }

  @Test
  public void newBuilderForTypeTest13() {
    // Arrange and Act
    DescriptorProtos.FileOptions.Builder actualNewBuilderForTypeResult = DescriptorProtos.FileOptions
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualRubyPackage = actualNewBuilderForTypeResult.getRubyPackage();
    String actualPhpClassPrefix = actualNewBuilderForTypeResult.getPhpClassPrefix();
    String actualSwiftPrefix = actualNewBuilderForTypeResult.getSwiftPrefix();
    String actualJavaOuterClassname = actualNewBuilderForTypeResult.getJavaOuterClassname();
    DescriptorProtos.FileOptions.OptimizeMode actualOptimizeFor = actualNewBuilderForTypeResult.getOptimizeFor();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    String actualPhpNamespace = actualNewBuilderForTypeResult.getPhpNamespace();
    int actualUninterpretedOptionCount = actualNewBuilderForTypeResult.getUninterpretedOptionCount();
    String actualObjcClassPrefix = actualNewBuilderForTypeResult.getObjcClassPrefix();
    assertEquals("", actualNewBuilderForTypeResult.getPhpMetadataNamespace());
    assertEquals("", actualObjcClassPrefix);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals("", actualPhpNamespace);
    assertEquals("", actualToStringResult);
    assertEquals(DescriptorProtos.FileOptions.OptimizeMode.SPEED, actualOptimizeFor);
    assertEquals("", actualJavaOuterClassname);
    assertEquals("", actualSwiftPrefix);
    assertEquals("", actualPhpClassPrefix);
    assertEquals("", actualRubyPackage);
  }

  @Test
  public void parseFromTest84() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.FileOptions.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest83() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.FileOptions.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest10() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    DescriptorProtos.FileOptions actualParseDelimitedFromResult = DescriptorProtos.FileOptions.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    boolean actualJavaStringCheckUtf8 = actualParseDelimitedFromResult.getJavaStringCheckUtf8();
    String actualRubyPackage = actualParseDelimitedFromResult.getRubyPackage();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    boolean actualPyGenericServices = actualParseDelimitedFromResult.getPyGenericServices();
    String actualPhpClassPrefix = actualParseDelimitedFromResult.getPhpClassPrefix();
    boolean actualJavaGenericServices = actualParseDelimitedFromResult.getJavaGenericServices();
    String actualSwiftPrefix = actualParseDelimitedFromResult.getSwiftPrefix();
    String actualJavaOuterClassname = actualParseDelimitedFromResult.getJavaOuterClassname();
    boolean actualDeprecated = actualParseDelimitedFromResult.getDeprecated();
    DescriptorProtos.FileOptions.OptimizeMode actualOptimizeFor = actualParseDelimitedFromResult.getOptimizeFor();
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    String actualPhpNamespace = actualParseDelimitedFromResult.getPhpNamespace();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    boolean actualCcGenericServices = actualParseDelimitedFromResult.getCcGenericServices();
    boolean actualCcEnableArenas = actualParseDelimitedFromResult.getCcEnableArenas();
    assertFalse(actualJavaStringCheckUtf8);
    assertEquals("", actualParseDelimitedFromResult.getObjcClassPrefix());
    assertFalse(actualCcEnableArenas);
    assertFalse(actualCcGenericServices);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals("", actualPhpNamespace);
    assertEquals("", actualToStringResult);
    assertEquals(DescriptorProtos.FileOptions.OptimizeMode.SPEED, actualOptimizeFor);
    assertFalse(actualDeprecated);
    assertEquals("", actualJavaOuterClassname);
    assertEquals("", actualSwiftPrefix);
    assertFalse(actualJavaGenericServices);
    assertEquals("", actualPhpClassPrefix);
    assertFalse(actualPyGenericServices);
    assertEquals(0, actualSerializedSize);
    assertEquals("", actualRubyPackage);
  }

  @Test
  public void parseDelimitedFromTest9() throws IOException {
    // Arrange and Act
    DescriptorProtos.FileOptions actualParseDelimitedFromResult = DescriptorProtos.FileOptions
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    boolean actualJavaStringCheckUtf8 = actualParseDelimitedFromResult.getJavaStringCheckUtf8();
    String actualRubyPackage = actualParseDelimitedFromResult.getRubyPackage();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    boolean actualPyGenericServices = actualParseDelimitedFromResult.getPyGenericServices();
    String actualPhpClassPrefix = actualParseDelimitedFromResult.getPhpClassPrefix();
    boolean actualJavaGenericServices = actualParseDelimitedFromResult.getJavaGenericServices();
    String actualSwiftPrefix = actualParseDelimitedFromResult.getSwiftPrefix();
    String actualJavaOuterClassname = actualParseDelimitedFromResult.getJavaOuterClassname();
    boolean actualDeprecated = actualParseDelimitedFromResult.getDeprecated();
    DescriptorProtos.FileOptions.OptimizeMode actualOptimizeFor = actualParseDelimitedFromResult.getOptimizeFor();
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    String actualPhpNamespace = actualParseDelimitedFromResult.getPhpNamespace();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    boolean actualCcGenericServices = actualParseDelimitedFromResult.getCcGenericServices();
    boolean actualCcEnableArenas = actualParseDelimitedFromResult.getCcEnableArenas();
    assertFalse(actualJavaStringCheckUtf8);
    assertEquals("", actualParseDelimitedFromResult.getObjcClassPrefix());
    assertFalse(actualCcEnableArenas);
    assertFalse(actualCcGenericServices);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals("", actualPhpNamespace);
    assertEquals("", actualToStringResult);
    assertEquals(DescriptorProtos.FileOptions.OptimizeMode.SPEED, actualOptimizeFor);
    assertFalse(actualDeprecated);
    assertEquals("", actualJavaOuterClassname);
    assertEquals("", actualSwiftPrefix);
    assertFalse(actualJavaGenericServices);
    assertEquals("", actualPhpClassPrefix);
    assertFalse(actualPyGenericServices);
    assertEquals(0, actualSerializedSize);
    assertEquals("", actualRubyPackage);
  }

  @Test
  public void parseFromTest82() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FileOptions.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest81() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FileOptions.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest80() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FileOptions.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest79() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FileOptions.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest14() {
    // Arrange, Act and Assert
    assertEquals(-2104999574, DescriptorProtos.FileOptions.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest14() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest14() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileOptions.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest14() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.FileOptions.getDefaultInstance().isInitialized());
  }

  @Test
  public void getUninterpretedOptionOrBuilderTest5() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FileOptions.getDefaultInstance().getUninterpretedOptionOrBuilder(1);
  }

  @Test
  public void getUninterpretedOptionTest5() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FileOptions.getDefaultInstance().getUninterpretedOption(1);
  }

  @Test
  public void getUninterpretedOptionCountTest5() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileOptions.getDefaultInstance().getUninterpretedOptionCount());
  }

  @Test
  public void getUninterpretedOptionOrBuilderListTest5() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileOptions.getDefaultInstance().getUninterpretedOptionOrBuilderList().size());
  }

  @Test
  public void getUninterpretedOptionListTest5() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileOptions.getDefaultInstance().getUninterpretedOptionList().size());
  }

  @Test
  public void getRubyPackageTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileOptions.getDefaultInstance().getRubyPackage());
  }

  @Test
  public void hasRubyPackageTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasRubyPackage());
  }

  @Test
  public void getPhpMetadataNamespaceTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileOptions.getDefaultInstance().getPhpMetadataNamespace());
  }

  @Test
  public void hasPhpMetadataNamespaceTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasPhpMetadataNamespace());
  }

  @Test
  public void getPhpNamespaceTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileOptions.getDefaultInstance().getPhpNamespace());
  }

  @Test
  public void hasPhpNamespaceTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasPhpNamespace());
  }

  @Test
  public void getPhpClassPrefixTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileOptions.getDefaultInstance().getPhpClassPrefix());
  }

  @Test
  public void hasPhpClassPrefixTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasPhpClassPrefix());
  }

  @Test
  public void getSwiftPrefixTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileOptions.getDefaultInstance().getSwiftPrefix());
  }

  @Test
  public void hasSwiftPrefixTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasSwiftPrefix());
  }

  @Test
  public void getCsharpNamespaceTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileOptions.getDefaultInstance().getCsharpNamespace());
  }

  @Test
  public void hasCsharpNamespaceTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasCsharpNamespace());
  }

  @Test
  public void getObjcClassPrefixTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileOptions.getDefaultInstance().getObjcClassPrefix());
  }

  @Test
  public void hasObjcClassPrefixTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasObjcClassPrefix());
  }

  @Test
  public void getCcEnableArenasTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().getCcEnableArenas());
  }

  @Test
  public void hasCcEnableArenasTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasCcEnableArenas());
  }

  @Test
  public void getDeprecatedTest4() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().getDeprecated());
  }

  @Test
  public void hasDeprecatedTest4() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasDeprecated());
  }

  @Test
  public void getPhpGenericServicesTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().getPhpGenericServices());
  }

  @Test
  public void hasPhpGenericServicesTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasPhpGenericServices());
  }

  @Test
  public void getPyGenericServicesTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().getPyGenericServices());
  }

  @Test
  public void hasPyGenericServicesTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasPyGenericServices());
  }

  @Test
  public void getJavaGenericServicesTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().getJavaGenericServices());
  }

  @Test
  public void hasJavaGenericServicesTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasJavaGenericServices());
  }

  @Test
  public void getCcGenericServicesTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().getCcGenericServices());
  }

  @Test
  public void hasCcGenericServicesTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasCcGenericServices());
  }

  @Test
  public void getGoPackageTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileOptions.getDefaultInstance().getGoPackage());
  }

  @Test
  public void hasGoPackageTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasGoPackage());
  }

  @Test
  public void getOptimizeForTest() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.FileOptions.OptimizeMode.SPEED,
        DescriptorProtos.FileOptions.getDefaultInstance().getOptimizeFor());
  }

  @Test
  public void hasOptimizeForTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasOptimizeFor());
  }

  @Test
  public void getJavaStringCheckUtf8Test() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().getJavaStringCheckUtf8());
  }

  @Test
  public void hasJavaStringCheckUtf8Test() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasJavaStringCheckUtf8());
  }

  @Test
  public void getJavaGenerateEqualsAndHashTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().getJavaGenerateEqualsAndHash());
  }

  @Test
  public void hasJavaGenerateEqualsAndHashTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasJavaGenerateEqualsAndHash());
  }

  @Test
  public void getJavaMultipleFilesTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().getJavaMultipleFiles());
  }

  @Test
  public void hasJavaMultipleFilesTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasJavaMultipleFiles());
  }

  @Test
  public void getJavaOuterClassnameTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileOptions.getDefaultInstance().getJavaOuterClassname());
  }

  @Test
  public void hasJavaOuterClassnameTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasJavaOuterClassname());
  }

  @Test
  public void getJavaPackageTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileOptions.getDefaultInstance().getJavaPackage());
  }

  @Test
  public void hasJavaPackageTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileOptions.getDefaultInstance().hasJavaPackage());
  }

  @Test
  public void toBuilderTest12() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileDescriptorSet.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest24() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileDescriptorSet
        .newBuilder(DescriptorProtos.FileDescriptorSet.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest23() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileDescriptorSet.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest12() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileDescriptorSet.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest78() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.FileDescriptorSet.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest77() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.FileDescriptorSet.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest76() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FileDescriptorSet.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest75() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FileDescriptorSet.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest74() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FileDescriptorSet.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest73() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FileDescriptorSet.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest13() {
    // Arrange, Act and Assert
    assertEquals(-1685385882, DescriptorProtos.FileDescriptorSet.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest13() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileDescriptorSet.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest13() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorSet.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest13() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.FileDescriptorSet.getDefaultInstance().isInitialized());
  }

  @Test
  public void getFileOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FileDescriptorSet.getDefaultInstance().getFileOrBuilder(1);
  }

  @Test
  public void getFileTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FileDescriptorSet.getDefaultInstance().getFile(1);
  }

  @Test
  public void getFileCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorSet.getDefaultInstance().getFileCount());
  }

  @Test
  public void getFileOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorSet.getDefaultInstance().getFileOrBuilderList().size());
  }

  @Test
  public void getFileListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorSet.getDefaultInstance().getFileList().size());
  }

  @Test
  public void toBuilderTest11() {
    // Arrange and Act
    DescriptorProtos.FileDescriptorProto.Builder actualToBuilderResult = DescriptorProtos.FileDescriptorProto
        .getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    int actualExtensionCount = actualToBuilderResult.getExtensionCount();
    String actualSyntax = actualToBuilderResult.getSyntax();
    String actualPackage = actualToBuilderResult.getPackage();
    int actualMessageTypeCount = actualToBuilderResult.getMessageTypeCount();
    int actualWeakDependencyCount = actualToBuilderResult.getWeakDependencyCount();
    int actualPublicDependencyCount = actualToBuilderResult.getPublicDependencyCount();
    int actualDependencyCount = actualToBuilderResult.getDependencyCount();
    String actualToStringResult = actualToBuilderResult.toString();
    DescriptorProtos.FileOptionsOrBuilder actualOptionsOrBuilder = actualToBuilderResult.getOptionsOrBuilder();
    DescriptorProtos.SourceCodeInfo.Builder actualSourceCodeInfoBuilder = actualToBuilderResult
        .getSourceCodeInfoBuilder();
    DescriptorProtos.FileOptions expectedOptionsOrBuilder = actualToBuilderResult.getOptions();
    assertEquals("", actualName);
    assertSame(actualToBuilderResult.getSourceCodeInfoOrBuilder(), actualSourceCodeInfoBuilder);
    assertSame(expectedOptionsOrBuilder, actualOptionsOrBuilder);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualDependencyCount);
    assertEquals(0, actualPublicDependencyCount);
    assertEquals(0, actualWeakDependencyCount);
    assertEquals(0, actualMessageTypeCount);
    assertEquals("", actualPackage);
    assertEquals("", actualSyntax);
    assertEquals(0, actualExtensionCount);
  }

  @Test
  public void newBuilderTest22() {
    // Arrange and Act
    DescriptorProtos.FileDescriptorProto.Builder actualNewBuilderResult = DescriptorProtos.FileDescriptorProto
        .newBuilder(DescriptorProtos.FileDescriptorProto.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    int actualExtensionCount = actualNewBuilderResult.getExtensionCount();
    String actualSyntax = actualNewBuilderResult.getSyntax();
    String actualPackage = actualNewBuilderResult.getPackage();
    int actualMessageTypeCount = actualNewBuilderResult.getMessageTypeCount();
    int actualWeakDependencyCount = actualNewBuilderResult.getWeakDependencyCount();
    int actualPublicDependencyCount = actualNewBuilderResult.getPublicDependencyCount();
    int actualDependencyCount = actualNewBuilderResult.getDependencyCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    DescriptorProtos.FileOptionsOrBuilder actualOptionsOrBuilder = actualNewBuilderResult.getOptionsOrBuilder();
    DescriptorProtos.SourceCodeInfo.Builder actualSourceCodeInfoBuilder = actualNewBuilderResult
        .getSourceCodeInfoBuilder();
    DescriptorProtos.FileOptions expectedOptionsOrBuilder = actualNewBuilderResult.getOptions();
    assertEquals("", actualName);
    assertSame(actualNewBuilderResult.getSourceCodeInfoOrBuilder(), actualSourceCodeInfoBuilder);
    assertSame(expectedOptionsOrBuilder, actualOptionsOrBuilder);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualDependencyCount);
    assertEquals(0, actualPublicDependencyCount);
    assertEquals(0, actualWeakDependencyCount);
    assertEquals(0, actualMessageTypeCount);
    assertEquals("", actualPackage);
    assertEquals("", actualSyntax);
    assertEquals(0, actualExtensionCount);
  }

  @Test
  public void newBuilderTest21() {
    // Arrange and Act
    DescriptorProtos.FileDescriptorProto.Builder actualNewBuilderResult = DescriptorProtos.FileDescriptorProto
        .newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    int actualExtensionCount = actualNewBuilderResult.getExtensionCount();
    String actualSyntax = actualNewBuilderResult.getSyntax();
    String actualPackage = actualNewBuilderResult.getPackage();
    int actualMessageTypeCount = actualNewBuilderResult.getMessageTypeCount();
    int actualWeakDependencyCount = actualNewBuilderResult.getWeakDependencyCount();
    int actualPublicDependencyCount = actualNewBuilderResult.getPublicDependencyCount();
    int actualDependencyCount = actualNewBuilderResult.getDependencyCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    DescriptorProtos.FileOptionsOrBuilder actualOptionsOrBuilder = actualNewBuilderResult.getOptionsOrBuilder();
    DescriptorProtos.SourceCodeInfo.Builder actualSourceCodeInfoBuilder = actualNewBuilderResult
        .getSourceCodeInfoBuilder();
    DescriptorProtos.FileOptions expectedOptionsOrBuilder = actualNewBuilderResult.getOptions();
    assertEquals("", actualName);
    assertSame(actualNewBuilderResult.getSourceCodeInfoOrBuilder(), actualSourceCodeInfoBuilder);
    assertSame(expectedOptionsOrBuilder, actualOptionsOrBuilder);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualDependencyCount);
    assertEquals(0, actualPublicDependencyCount);
    assertEquals(0, actualWeakDependencyCount);
    assertEquals(0, actualMessageTypeCount);
    assertEquals("", actualPackage);
    assertEquals("", actualSyntax);
    assertEquals(0, actualExtensionCount);
  }

  @Test
  public void newBuilderForTypeTest11() {
    // Arrange and Act
    DescriptorProtos.FileDescriptorProto.Builder actualNewBuilderForTypeResult = DescriptorProtos.FileDescriptorProto
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    int actualExtensionCount = actualNewBuilderForTypeResult.getExtensionCount();
    String actualSyntax = actualNewBuilderForTypeResult.getSyntax();
    String actualPackage = actualNewBuilderForTypeResult.getPackage();
    int actualMessageTypeCount = actualNewBuilderForTypeResult.getMessageTypeCount();
    int actualWeakDependencyCount = actualNewBuilderForTypeResult.getWeakDependencyCount();
    int actualPublicDependencyCount = actualNewBuilderForTypeResult.getPublicDependencyCount();
    int actualDependencyCount = actualNewBuilderForTypeResult.getDependencyCount();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    DescriptorProtos.FileOptionsOrBuilder actualOptionsOrBuilder = actualNewBuilderForTypeResult.getOptionsOrBuilder();
    DescriptorProtos.SourceCodeInfo.Builder actualSourceCodeInfoBuilder = actualNewBuilderForTypeResult
        .getSourceCodeInfoBuilder();
    DescriptorProtos.FileOptions expectedOptionsOrBuilder = actualNewBuilderForTypeResult.getOptions();
    assertEquals("", actualName);
    assertSame(actualNewBuilderForTypeResult.getSourceCodeInfoOrBuilder(), actualSourceCodeInfoBuilder);
    assertSame(expectedOptionsOrBuilder, actualOptionsOrBuilder);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualDependencyCount);
    assertEquals(0, actualPublicDependencyCount);
    assertEquals(0, actualWeakDependencyCount);
    assertEquals(0, actualMessageTypeCount);
    assertEquals("", actualPackage);
    assertEquals("", actualSyntax);
    assertEquals(0, actualExtensionCount);
  }

  @Test
  public void parseFromTest72() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.FileDescriptorProto.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest71() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.FileDescriptorProto.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest70() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FileDescriptorProto.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest69() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FileDescriptorProto.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest68() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FileDescriptorProto.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest67() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FileDescriptorProto.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest12() {
    // Arrange, Act and Assert
    assertEquals(-1151506028, DescriptorProtos.FileDescriptorProto.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest12() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileDescriptorProto.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest12() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest12() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.FileDescriptorProto.getDefaultInstance().isInitialized());
  }

  @Test
  public void getSyntaxTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileDescriptorProto.getDefaultInstance().getSyntax());
  }

  @Test
  public void hasSyntaxTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileDescriptorProto.getDefaultInstance().hasSyntax());
  }

  @Test
  public void getSourceCodeInfoOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.FileDescriptorProto.getDefaultInstance()
        .getSourceCodeInfoOrBuilder() instanceof DescriptorProtos.SourceCodeInfo);
  }

  @Test
  public void hasSourceCodeInfoTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileDescriptorProto.getDefaultInstance().hasSourceCodeInfo());
  }

  @Test
  public void getOptionsOrBuilderTest6() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.FileDescriptorProto.getDefaultInstance()
        .getOptionsOrBuilder() instanceof DescriptorProtos.FileOptions);
  }

  @Test
  public void hasOptionsTest6() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileDescriptorProto.getDefaultInstance().hasOptions());
  }

  @Test
  public void getExtensionOrBuilderTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FileDescriptorProto.getDefaultInstance().getExtensionOrBuilder(1);
  }

  @Test
  public void getExtensionTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FileDescriptorProto.getDefaultInstance().getExtension(1);
  }

  @Test
  public void getExtensionCountTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getExtensionCount());
  }

  @Test
  public void getExtensionOrBuilderListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getExtensionOrBuilderList().size());
  }

  @Test
  public void getExtensionListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getExtensionList().size());
  }

  @Test
  public void getServiceOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FileDescriptorProto.getDefaultInstance().getServiceOrBuilder(1);
  }

  @Test
  public void getServiceTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FileDescriptorProto.getDefaultInstance().getService(1);
  }

  @Test
  public void getServiceCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getServiceCount());
  }

  @Test
  public void getServiceOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getServiceOrBuilderList().size());
  }

  @Test
  public void getServiceListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getServiceList().size());
  }

  @Test
  public void getEnumTypeOrBuilderTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FileDescriptorProto.getDefaultInstance().getEnumTypeOrBuilder(1);
  }

  @Test
  public void getEnumTypeTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FileDescriptorProto.getDefaultInstance().getEnumType(1);
  }

  @Test
  public void getEnumTypeCountTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getEnumTypeCount());
  }

  @Test
  public void getEnumTypeOrBuilderListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getEnumTypeOrBuilderList().size());
  }

  @Test
  public void getEnumTypeListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getEnumTypeList().size());
  }

  @Test
  public void getMessageTypeOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FileDescriptorProto.getDefaultInstance().getMessageTypeOrBuilder(1);
  }

  @Test
  public void getMessageTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FileDescriptorProto.getDefaultInstance().getMessageType(1);
  }

  @Test
  public void getMessageTypeCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getMessageTypeCount());
  }

  @Test
  public void getMessageTypeOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getMessageTypeOrBuilderList().size());
  }

  @Test
  public void getMessageTypeListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getMessageTypeList().size());
  }

  @Test
  public void getWeakDependencyTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FileDescriptorProto.getDefaultInstance().getWeakDependency(1);
  }

  @Test
  public void getWeakDependencyCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getWeakDependencyCount());
  }

  @Test
  public void getWeakDependencyListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getWeakDependencyList().size());
  }

  @Test
  public void getPublicDependencyTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FileDescriptorProto.getDefaultInstance().getPublicDependency(1);
  }

  @Test
  public void getPublicDependencyCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getPublicDependencyCount());
  }

  @Test
  public void getPublicDependencyListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getPublicDependencyList().size());
  }

  @Test
  public void getDependencyBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FileDescriptorProto.getDefaultInstance().getDependencyBytes(1);
  }

  @Test
  public void getDependencyTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FileDescriptorProto.getDefaultInstance().getDependency(1);
  }

  @Test
  public void getDependencyCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getDependencyCount());
  }

  @Test
  public void getDependencyListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FileDescriptorProto.getDefaultInstance().getDependencyList().size());
  }

  @Test
  public void getPackageTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileDescriptorProto.getDefaultInstance().getPackage());
  }

  @Test
  public void hasPackageTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileDescriptorProto.getDefaultInstance().hasPackage());
  }

  @Test
  public void getNameTest5() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FileDescriptorProto.getDefaultInstance().getName());
  }

  @Test
  public void hasNameTest5() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FileDescriptorProto.getDefaultInstance().hasName());
  }

  @Test
  public void valueOfTest8() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.FieldOptions.JSType.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest4() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.FieldOptions.JSType.JS_STRING, DescriptorProtos.FieldOptions.JSType.forNumber(1));
  }

  @Test
  public void valueOfTest7() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.FieldOptions.JSType.JS_STRING, DescriptorProtos.FieldOptions.JSType.valueOf(1));
  }

  @Test
  public void getNumberTest6() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FieldOptions.JSType.JS_NORMAL.getNumber());
  }

  @Test
  public void valueOfTest6() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.FieldOptions.CType.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest3() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.FieldOptions.CType.CORD, DescriptorProtos.FieldOptions.CType.forNumber(1));
  }

  @Test
  public void valueOfTest5() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.FieldOptions.CType.CORD, DescriptorProtos.FieldOptions.CType.valueOf(1));
  }

  @Test
  public void getNumberTest5() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FieldOptions.CType.STRING.getNumber());
  }

  @Test
  public void toBuilderTest10() {
    // Arrange and Act
    DescriptorProtos.FieldOptions.Builder actualToBuilderResult = DescriptorProtos.FieldOptions.getDefaultInstance()
        .toBuilder();

    // Assert
    int actualUninterpretedOptionCount = actualToBuilderResult.getUninterpretedOptionCount();
    DescriptorProtos.FieldOptions.CType actualCtype = actualToBuilderResult.getCtype();
    String actualToStringResult = actualToBuilderResult.toString();
    boolean actualIsInitializedResult = actualToBuilderResult.isInitialized();
    assertEquals(DescriptorProtos.FieldOptions.JSType.JS_NORMAL, actualToBuilderResult.getJstype());
    assertTrue(actualIsInitializedResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals(DescriptorProtos.FieldOptions.CType.STRING, actualCtype);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderTest20() {
    // Arrange and Act
    DescriptorProtos.FieldOptions.Builder actualNewBuilderResult = DescriptorProtos.FieldOptions
        .newBuilder(DescriptorProtos.FieldOptions.getDefaultInstance());

    // Assert
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    DescriptorProtos.FieldOptions.CType actualCtype = actualNewBuilderResult.getCtype();
    String actualToStringResult = actualNewBuilderResult.toString();
    boolean actualIsInitializedResult = actualNewBuilderResult.isInitialized();
    assertEquals(DescriptorProtos.FieldOptions.JSType.JS_NORMAL, actualNewBuilderResult.getJstype());
    assertTrue(actualIsInitializedResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals(DescriptorProtos.FieldOptions.CType.STRING, actualCtype);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderTest19() {
    // Arrange and Act
    DescriptorProtos.FieldOptions.Builder actualNewBuilderResult = DescriptorProtos.FieldOptions.newBuilder();

    // Assert
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    DescriptorProtos.FieldOptions.CType actualCtype = actualNewBuilderResult.getCtype();
    String actualToStringResult = actualNewBuilderResult.toString();
    boolean actualIsInitializedResult = actualNewBuilderResult.isInitialized();
    assertEquals(DescriptorProtos.FieldOptions.JSType.JS_NORMAL, actualNewBuilderResult.getJstype());
    assertTrue(actualIsInitializedResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals(DescriptorProtos.FieldOptions.CType.STRING, actualCtype);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderForTypeTest10() {
    // Arrange and Act
    DescriptorProtos.FieldOptions.Builder actualNewBuilderForTypeResult = DescriptorProtos.FieldOptions
        .getDefaultInstance().newBuilderForType();

    // Assert
    int actualUninterpretedOptionCount = actualNewBuilderForTypeResult.getUninterpretedOptionCount();
    DescriptorProtos.FieldOptions.CType actualCtype = actualNewBuilderForTypeResult.getCtype();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    boolean actualIsInitializedResult = actualNewBuilderForTypeResult.isInitialized();
    assertEquals(DescriptorProtos.FieldOptions.JSType.JS_NORMAL, actualNewBuilderForTypeResult.getJstype());
    assertTrue(actualIsInitializedResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals(DescriptorProtos.FieldOptions.CType.STRING, actualCtype);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void parseFromTest66() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.FieldOptions.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest65() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.FieldOptions.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest8() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    DescriptorProtos.FieldOptions actualParseDelimitedFromResult = DescriptorProtos.FieldOptions
        .parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    DescriptorProtos.FieldOptions.CType actualCtype = actualParseDelimitedFromResult.getCtype();
    boolean actualWeak = actualParseDelimitedFromResult.getWeak();
    boolean actualDeprecated = actualParseDelimitedFromResult.getDeprecated();
    boolean actualLazy = actualParseDelimitedFromResult.getLazy();
    int actualMemoizedSerializedSize = actualParseDelimitedFromResult.getMemoizedSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    DescriptorProtos.FieldOptions.JSType actualJstype = actualParseDelimitedFromResult.getJstype();
    String actualInitializationErrorString = actualParseDelimitedFromResult.getInitializationErrorString();
    assertFalse(actualParseDelimitedFromResult.getPacked());
    assertEquals("", actualInitializationErrorString);
    assertEquals(DescriptorProtos.FieldOptions.JSType.JS_NORMAL, actualJstype);
    assertTrue(actualIsInitializedResult);
    assertEquals(0, actualMemoizedSerializedSize);
    assertFalse(actualLazy);
    assertEquals(0, actualSerializedSize);
    assertEquals(DescriptorProtos.FieldOptions.CType.STRING, actualCtype);
    assertFalse(actualWeak);
    assertEquals(0, actualUninterpretedOptionCount);
    assertFalse(actualDeprecated);
  }

  @Test
  public void parseDelimitedFromTest7() throws IOException {
    // Arrange and Act
    DescriptorProtos.FieldOptions actualParseDelimitedFromResult = DescriptorProtos.FieldOptions
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    DescriptorProtos.FieldOptions.CType actualCtype = actualParseDelimitedFromResult.getCtype();
    boolean actualWeak = actualParseDelimitedFromResult.getWeak();
    boolean actualDeprecated = actualParseDelimitedFromResult.getDeprecated();
    boolean actualLazy = actualParseDelimitedFromResult.getLazy();
    int actualMemoizedSerializedSize = actualParseDelimitedFromResult.getMemoizedSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    DescriptorProtos.FieldOptions.JSType actualJstype = actualParseDelimitedFromResult.getJstype();
    String actualInitializationErrorString = actualParseDelimitedFromResult.getInitializationErrorString();
    assertFalse(actualParseDelimitedFromResult.getPacked());
    assertEquals("", actualInitializationErrorString);
    assertEquals(DescriptorProtos.FieldOptions.JSType.JS_NORMAL, actualJstype);
    assertTrue(actualIsInitializedResult);
    assertEquals(0, actualMemoizedSerializedSize);
    assertFalse(actualLazy);
    assertEquals(0, actualSerializedSize);
    assertEquals(DescriptorProtos.FieldOptions.CType.STRING, actualCtype);
    assertFalse(actualWeak);
    assertEquals(0, actualUninterpretedOptionCount);
    assertFalse(actualDeprecated);
  }

  @Test
  public void parseFromTest64() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FieldOptions.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest63() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FieldOptions.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest62() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FieldOptions.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest61() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FieldOptions.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest11() {
    // Arrange, Act and Assert
    assertEquals(2031814985, DescriptorProtos.FieldOptions.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest11() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldOptions.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest11() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FieldOptions.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest11() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.FieldOptions.getDefaultInstance().isInitialized());
  }

  @Test
  public void getUninterpretedOptionOrBuilderTest4() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FieldOptions.getDefaultInstance().getUninterpretedOptionOrBuilder(1);
  }

  @Test
  public void getUninterpretedOptionTest4() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.FieldOptions.getDefaultInstance().getUninterpretedOption(1);
  }

  @Test
  public void getUninterpretedOptionCountTest4() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FieldOptions.getDefaultInstance().getUninterpretedOptionCount());
  }

  @Test
  public void getUninterpretedOptionOrBuilderListTest4() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FieldOptions.getDefaultInstance().getUninterpretedOptionOrBuilderList().size());
  }

  @Test
  public void getUninterpretedOptionListTest4() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FieldOptions.getDefaultInstance().getUninterpretedOptionList().size());
  }

  @Test
  public void getWeakTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldOptions.getDefaultInstance().getWeak());
  }

  @Test
  public void hasWeakTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldOptions.getDefaultInstance().hasWeak());
  }

  @Test
  public void getDeprecatedTest3() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldOptions.getDefaultInstance().getDeprecated());
  }

  @Test
  public void hasDeprecatedTest3() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldOptions.getDefaultInstance().hasDeprecated());
  }

  @Test
  public void getLazyTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldOptions.getDefaultInstance().getLazy());
  }

  @Test
  public void hasLazyTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldOptions.getDefaultInstance().hasLazy());
  }

  @Test
  public void getJstypeTest() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.FieldOptions.JSType.JS_NORMAL,
        DescriptorProtos.FieldOptions.getDefaultInstance().getJstype());
  }

  @Test
  public void hasJstypeTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldOptions.getDefaultInstance().hasJstype());
  }

  @Test
  public void getPackedTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldOptions.getDefaultInstance().getPacked());
  }

  @Test
  public void hasPackedTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldOptions.getDefaultInstance().hasPacked());
  }

  @Test
  public void getCtypeTest() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.FieldOptions.CType.STRING,
        DescriptorProtos.FieldOptions.getDefaultInstance().getCtype());
  }

  @Test
  public void hasCtypeTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldOptions.getDefaultInstance().hasCtype());
  }

  @Test
  public void valueOfTest4() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.FieldDescriptorProto.Type.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.FieldDescriptorProto.Type.TYPE_DOUBLE,
        DescriptorProtos.FieldDescriptorProto.Type.forNumber(1));
  }

  @Test
  public void valueOfTest3() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.FieldDescriptorProto.Type.TYPE_DOUBLE,
        DescriptorProtos.FieldDescriptorProto.Type.valueOf(1));
  }

  @Test
  public void getNumberTest4() {
    // Arrange, Act and Assert
    assertEquals(1, DescriptorProtos.FieldDescriptorProto.Type.TYPE_DOUBLE.getNumber());
  }

  @Test
  public void valueOfTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.FieldDescriptorProto.Label.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL,
        DescriptorProtos.FieldDescriptorProto.Label.forNumber(1));
  }

  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL,
        DescriptorProtos.FieldDescriptorProto.Label.valueOf(1));
  }

  @Test
  public void getNumberTest3() {
    // Arrange, Act and Assert
    assertEquals(1, DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL.getNumber());
  }

  @Test
  public void toBuilderTest9() {
    // Arrange and Act
    DescriptorProtos.FieldDescriptorProto.Builder actualToBuilderResult = DescriptorProtos.FieldDescriptorProto
        .getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    String actualJsonName = actualToBuilderResult.getJsonName();
    DescriptorProtos.FieldDescriptorProto.Type actualType = actualToBuilderResult.getType();
    String actualToStringResult = actualToBuilderResult.toString();
    String actualTypeName = actualToBuilderResult.getTypeName();
    String actualExtendee = actualToBuilderResult.getExtendee();
    String actualDefaultValue = actualToBuilderResult.getDefaultValue();
    DescriptorProtos.FieldDescriptorProto.Label actualLabel = actualToBuilderResult.getLabel();
    DescriptorProtos.FieldOptions.Builder actualOptionsBuilder = actualToBuilderResult.getOptionsBuilder();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertSame(actualToBuilderResult.getOptionsOrBuilder(), actualOptionsBuilder);
    assertEquals(DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL, actualLabel);
    assertEquals("", actualDefaultValue);
    assertEquals("", actualExtendee);
    assertEquals("", actualTypeName);
    assertEquals("", actualJsonName);
    assertEquals(DescriptorProtos.FieldDescriptorProto.Type.TYPE_DOUBLE, actualType);
  }

  @Test
  public void newBuilderTest18() {
    // Arrange and Act
    DescriptorProtos.FieldDescriptorProto.Builder actualNewBuilderResult = DescriptorProtos.FieldDescriptorProto
        .newBuilder(DescriptorProtos.FieldDescriptorProto.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    String actualJsonName = actualNewBuilderResult.getJsonName();
    DescriptorProtos.FieldDescriptorProto.Type actualType = actualNewBuilderResult.getType();
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualTypeName = actualNewBuilderResult.getTypeName();
    String actualExtendee = actualNewBuilderResult.getExtendee();
    String actualDefaultValue = actualNewBuilderResult.getDefaultValue();
    DescriptorProtos.FieldDescriptorProto.Label actualLabel = actualNewBuilderResult.getLabel();
    DescriptorProtos.FieldOptions.Builder actualOptionsBuilder = actualNewBuilderResult.getOptionsBuilder();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertSame(actualNewBuilderResult.getOptionsOrBuilder(), actualOptionsBuilder);
    assertEquals(DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL, actualLabel);
    assertEquals("", actualDefaultValue);
    assertEquals("", actualExtendee);
    assertEquals("", actualTypeName);
    assertEquals("", actualJsonName);
    assertEquals(DescriptorProtos.FieldDescriptorProto.Type.TYPE_DOUBLE, actualType);
  }

  @Test
  public void newBuilderTest17() {
    // Arrange and Act
    DescriptorProtos.FieldDescriptorProto.Builder actualNewBuilderResult = DescriptorProtos.FieldDescriptorProto
        .newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    String actualJsonName = actualNewBuilderResult.getJsonName();
    DescriptorProtos.FieldDescriptorProto.Type actualType = actualNewBuilderResult.getType();
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualTypeName = actualNewBuilderResult.getTypeName();
    String actualExtendee = actualNewBuilderResult.getExtendee();
    String actualDefaultValue = actualNewBuilderResult.getDefaultValue();
    DescriptorProtos.FieldDescriptorProto.Label actualLabel = actualNewBuilderResult.getLabel();
    DescriptorProtos.FieldOptions.Builder actualOptionsBuilder = actualNewBuilderResult.getOptionsBuilder();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertSame(actualNewBuilderResult.getOptionsOrBuilder(), actualOptionsBuilder);
    assertEquals(DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL, actualLabel);
    assertEquals("", actualDefaultValue);
    assertEquals("", actualExtendee);
    assertEquals("", actualTypeName);
    assertEquals("", actualJsonName);
    assertEquals(DescriptorProtos.FieldDescriptorProto.Type.TYPE_DOUBLE, actualType);
  }

  @Test
  public void newBuilderForTypeTest9() {
    // Arrange and Act
    DescriptorProtos.FieldDescriptorProto.Builder actualNewBuilderForTypeResult = DescriptorProtos.FieldDescriptorProto
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    String actualJsonName = actualNewBuilderForTypeResult.getJsonName();
    DescriptorProtos.FieldDescriptorProto.Type actualType = actualNewBuilderForTypeResult.getType();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    String actualTypeName = actualNewBuilderForTypeResult.getTypeName();
    String actualExtendee = actualNewBuilderForTypeResult.getExtendee();
    String actualDefaultValue = actualNewBuilderForTypeResult.getDefaultValue();
    DescriptorProtos.FieldDescriptorProto.Label actualLabel = actualNewBuilderForTypeResult.getLabel();
    DescriptorProtos.FieldOptions.Builder actualOptionsBuilder = actualNewBuilderForTypeResult.getOptionsBuilder();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertSame(actualNewBuilderForTypeResult.getOptionsOrBuilder(), actualOptionsBuilder);
    assertEquals(DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL, actualLabel);
    assertEquals("", actualDefaultValue);
    assertEquals("", actualExtendee);
    assertEquals("", actualTypeName);
    assertEquals("", actualJsonName);
    assertEquals(DescriptorProtos.FieldDescriptorProto.Type.TYPE_DOUBLE, actualType);
  }

  @Test
  public void parseFromTest60() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.FieldDescriptorProto.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest59() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.FieldDescriptorProto.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest58() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FieldDescriptorProto.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest57() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FieldDescriptorProto.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest56() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FieldDescriptorProto.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest55() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.FieldDescriptorProto.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest10() {
    // Arrange, Act and Assert
    assertEquals(-752242544, DescriptorProtos.FieldDescriptorProto.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest10() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldDescriptorProto.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest10() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FieldDescriptorProto.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest10() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.FieldDescriptorProto.getDefaultInstance().isInitialized());
  }

  @Test
  public void getOptionsOrBuilderTest5() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.FieldDescriptorProto.getDefaultInstance()
        .getOptionsOrBuilder() instanceof DescriptorProtos.FieldOptions);
  }

  @Test
  public void hasOptionsTest5() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldDescriptorProto.getDefaultInstance().hasOptions());
  }

  @Test
  public void getJsonNameTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FieldDescriptorProto.getDefaultInstance().getJsonName());
  }

  @Test
  public void hasJsonNameTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldDescriptorProto.getDefaultInstance().hasJsonName());
  }

  @Test
  public void getOneofIndexTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FieldDescriptorProto.getDefaultInstance().getOneofIndex());
  }

  @Test
  public void hasOneofIndexTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldDescriptorProto.getDefaultInstance().hasOneofIndex());
  }

  @Test
  public void getDefaultValueTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FieldDescriptorProto.getDefaultInstance().getDefaultValue());
  }

  @Test
  public void hasDefaultValueTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldDescriptorProto.getDefaultInstance().hasDefaultValue());
  }

  @Test
  public void getExtendeeTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FieldDescriptorProto.getDefaultInstance().getExtendee());
  }

  @Test
  public void hasExtendeeTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldDescriptorProto.getDefaultInstance().hasExtendee());
  }

  @Test
  public void getTypeNameTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FieldDescriptorProto.getDefaultInstance().getTypeName());
  }

  @Test
  public void hasTypeNameTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldDescriptorProto.getDefaultInstance().hasTypeName());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.FieldDescriptorProto.Type.TYPE_DOUBLE,
        DescriptorProtos.FieldDescriptorProto.getDefaultInstance().getType());
  }

  @Test
  public void hasTypeTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldDescriptorProto.getDefaultInstance().hasType());
  }

  @Test
  public void getLabelTest() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL,
        DescriptorProtos.FieldDescriptorProto.getDefaultInstance().getLabel());
  }

  @Test
  public void hasLabelTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldDescriptorProto.getDefaultInstance().hasLabel());
  }

  @Test
  public void getNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.FieldDescriptorProto.getDefaultInstance().getNumber());
  }

  @Test
  public void hasNumberTest2() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldDescriptorProto.getDefaultInstance().hasNumber());
  }

  @Test
  public void getNameTest4() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.FieldDescriptorProto.getDefaultInstance().getName());
  }

  @Test
  public void hasNameTest4() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.FieldDescriptorProto.getDefaultInstance().hasName());
  }

  @Test
  public void toBuilderTest8() {
    // Arrange and Act
    DescriptorProtos.ExtensionRangeOptions.Builder actualToBuilderResult = DescriptorProtos.ExtensionRangeOptions
        .getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    int actualUninterpretedOptionCount = actualToBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualToBuilderResult.isInitialized());
  }

  @Test
  public void newBuilderTest16() {
    // Arrange and Act
    DescriptorProtos.ExtensionRangeOptions.Builder actualNewBuilderResult = DescriptorProtos.ExtensionRangeOptions
        .newBuilder(DescriptorProtos.ExtensionRangeOptions.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualNewBuilderResult.isInitialized());
  }

  @Test
  public void newBuilderTest15() {
    // Arrange and Act
    DescriptorProtos.ExtensionRangeOptions.Builder actualNewBuilderResult = DescriptorProtos.ExtensionRangeOptions
        .newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualNewBuilderResult.isInitialized());
  }

  @Test
  public void newBuilderForTypeTest8() {
    // Arrange and Act
    DescriptorProtos.ExtensionRangeOptions.Builder actualNewBuilderForTypeResult = DescriptorProtos.ExtensionRangeOptions
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderForTypeResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualNewBuilderForTypeResult.isInitialized());
  }

  @Test
  public void parseFromTest54() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.ExtensionRangeOptions.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest53() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.ExtensionRangeOptions.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    DescriptorProtos.ExtensionRangeOptions actualParseDelimitedFromResult = DescriptorProtos.ExtensionRangeOptions
        .parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    int actualMemoizedSerializedSize = actualParseDelimitedFromResult.getMemoizedSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualParseDelimitedFromResult.getInitializationErrorString());
    assertEquals(0, actualSerializedSize);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals(0, actualMemoizedSerializedSize);
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void parseDelimitedFromTest5() throws IOException {
    // Arrange and Act
    DescriptorProtos.ExtensionRangeOptions actualParseDelimitedFromResult = DescriptorProtos.ExtensionRangeOptions
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    int actualMemoizedSerializedSize = actualParseDelimitedFromResult.getMemoizedSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualParseDelimitedFromResult.getInitializationErrorString());
    assertEquals(0, actualSerializedSize);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals(0, actualMemoizedSerializedSize);
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void parseFromTest52() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.ExtensionRangeOptions.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest51() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.ExtensionRangeOptions.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest50() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.ExtensionRangeOptions.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest49() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.ExtensionRangeOptions.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest9() {
    // Arrange, Act and Assert
    assertEquals(1727999453, DescriptorProtos.ExtensionRangeOptions.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest9() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.ExtensionRangeOptions.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest9() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.ExtensionRangeOptions.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest9() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.ExtensionRangeOptions.getDefaultInstance().isInitialized());
  }

  @Test
  public void getUninterpretedOptionOrBuilderTest3() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.ExtensionRangeOptions.getDefaultInstance().getUninterpretedOptionOrBuilder(1);
  }

  @Test
  public void getUninterpretedOptionTest3() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.ExtensionRangeOptions.getDefaultInstance().getUninterpretedOption(1);
  }

  @Test
  public void getUninterpretedOptionCountTest3() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.ExtensionRangeOptions.getDefaultInstance().getUninterpretedOptionCount());
  }

  @Test
  public void getUninterpretedOptionOrBuilderListTest3() {
    // Arrange, Act and Assert
    assertEquals(0,
        DescriptorProtos.ExtensionRangeOptions.getDefaultInstance().getUninterpretedOptionOrBuilderList().size());
  }

  @Test
  public void getUninterpretedOptionListTest3() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.ExtensionRangeOptions.getDefaultInstance().getUninterpretedOptionList().size());
  }

  @Test
  public void toBuilderTest7() {
    // Arrange and Act
    DescriptorProtos.EnumValueOptions.Builder actualToBuilderResult = DescriptorProtos.EnumValueOptions
        .getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    int actualUninterpretedOptionCount = actualToBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertTrue(actualToBuilderResult.isInitialized());
    assertEquals(0, actualUninterpretedOptionCount);
  }

  @Test
  public void newBuilderTest14() {
    // Arrange and Act
    DescriptorProtos.EnumValueOptions.Builder actualNewBuilderResult = DescriptorProtos.EnumValueOptions
        .newBuilder(DescriptorProtos.EnumValueOptions.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertTrue(actualNewBuilderResult.isInitialized());
    assertEquals(0, actualUninterpretedOptionCount);
  }

  @Test
  public void newBuilderTest13() {
    // Arrange and Act
    DescriptorProtos.EnumValueOptions.Builder actualNewBuilderResult = DescriptorProtos.EnumValueOptions.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertTrue(actualNewBuilderResult.isInitialized());
    assertEquals(0, actualUninterpretedOptionCount);
  }

  @Test
  public void newBuilderForTypeTest7() {
    // Arrange and Act
    DescriptorProtos.EnumValueOptions.Builder actualNewBuilderForTypeResult = DescriptorProtos.EnumValueOptions
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderForTypeResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertTrue(actualNewBuilderForTypeResult.isInitialized());
    assertEquals(0, actualUninterpretedOptionCount);
  }

  @Test
  public void parseFromTest48() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.EnumValueOptions.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest47() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.EnumValueOptions.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    DescriptorProtos.EnumValueOptions actualParseDelimitedFromResult = DescriptorProtos.EnumValueOptions
        .parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    int actualMemoizedSerializedSize = actualParseDelimitedFromResult.getMemoizedSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    String actualInitializationErrorString = actualParseDelimitedFromResult.getInitializationErrorString();
    assertFalse(actualParseDelimitedFromResult.getDeprecated());
    assertEquals("", actualInitializationErrorString);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals(0, actualMemoizedSerializedSize);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void parseDelimitedFromTest3() throws IOException {
    // Arrange and Act
    DescriptorProtos.EnumValueOptions actualParseDelimitedFromResult = DescriptorProtos.EnumValueOptions
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    int actualMemoizedSerializedSize = actualParseDelimitedFromResult.getMemoizedSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    String actualInitializationErrorString = actualParseDelimitedFromResult.getInitializationErrorString();
    assertFalse(actualParseDelimitedFromResult.getDeprecated());
    assertEquals("", actualInitializationErrorString);
    assertEquals(0, actualUninterpretedOptionCount);
    assertEquals(0, actualMemoizedSerializedSize);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void parseFromTest46() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumValueOptions.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest45() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumValueOptions.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest44() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumValueOptions.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest43() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumValueOptions.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest8() {
    // Arrange, Act and Assert
    assertEquals(1874402608, DescriptorProtos.EnumValueOptions.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest8() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumValueOptions.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest8() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumValueOptions.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest8() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.EnumValueOptions.getDefaultInstance().isInitialized());
  }

  @Test
  public void getUninterpretedOptionOrBuilderTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.EnumValueOptions.getDefaultInstance().getUninterpretedOptionOrBuilder(1);
  }

  @Test
  public void getUninterpretedOptionTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.EnumValueOptions.getDefaultInstance().getUninterpretedOption(1);
  }

  @Test
  public void getUninterpretedOptionCountTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumValueOptions.getDefaultInstance().getUninterpretedOptionCount());
  }

  @Test
  public void getUninterpretedOptionOrBuilderListTest2() {
    // Arrange, Act and Assert
    assertEquals(0,
        DescriptorProtos.EnumValueOptions.getDefaultInstance().getUninterpretedOptionOrBuilderList().size());
  }

  @Test
  public void getUninterpretedOptionListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumValueOptions.getDefaultInstance().getUninterpretedOptionList().size());
  }

  @Test
  public void getDeprecatedTest2() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumValueOptions.getDefaultInstance().getDeprecated());
  }

  @Test
  public void hasDeprecatedTest2() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumValueOptions.getDefaultInstance().hasDeprecated());
  }

  @Test
  public void parseFromTest42() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.EnumValueDescriptorProto.parseFrom((CodedInputStream) null,
        ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest41() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.EnumValueDescriptorProto.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest40() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumValueDescriptorProto.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest39() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumValueDescriptorProto.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest38() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumValueDescriptorProto.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest37() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumValueDescriptorProto.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest7() {
    // Arrange, Act and Assert
    assertEquals(-822965704, DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest7() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest7() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest7() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance().isInitialized());
  }

  @Test
  public void getOptionsOrBuilderTest4() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance()
        .getOptionsOrBuilder() instanceof DescriptorProtos.EnumValueOptions);
  }

  @Test
  public void hasOptionsTest4() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance().hasOptions());
  }

  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance().getNumber());
  }

  @Test
  public void hasNumberTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance().hasNumber());
  }

  @Test
  public void getNameTest3() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance().getName());
  }

  @Test
  public void hasNameTest3() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance().hasName());
  }

  @Test
  public void toBuilderTest6() {
    // Arrange and Act
    DescriptorProtos.EnumOptions.Builder actualToBuilderResult = DescriptorProtos.EnumOptions.getDefaultInstance()
        .toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    int actualUninterpretedOptionCount = actualToBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualToBuilderResult.isInitialized());
  }

  @Test
  public void newBuilderTest12() {
    // Arrange and Act
    DescriptorProtos.EnumOptions.Builder actualNewBuilderResult = DescriptorProtos.EnumOptions
        .newBuilder(DescriptorProtos.EnumOptions.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualNewBuilderResult.isInitialized());
  }

  @Test
  public void newBuilderTest11() {
    // Arrange and Act
    DescriptorProtos.EnumOptions.Builder actualNewBuilderResult = DescriptorProtos.EnumOptions.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualNewBuilderResult.isInitialized());
  }

  @Test
  public void newBuilderForTypeTest6() {
    // Arrange and Act
    DescriptorProtos.EnumOptions.Builder actualNewBuilderForTypeResult = DescriptorProtos.EnumOptions
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    int actualUninterpretedOptionCount = actualNewBuilderForTypeResult.getUninterpretedOptionCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualUninterpretedOptionCount);
    assertTrue(actualNewBuilderForTypeResult.isInitialized());
  }

  @Test
  public void parseFromTest36() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.EnumOptions.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest35() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.EnumOptions.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    DescriptorProtos.EnumOptions actualParseDelimitedFromResult = DescriptorProtos.EnumOptions.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    boolean actualAllowAlias = actualParseDelimitedFromResult.getAllowAlias();
    int actualMemoizedSerializedSize = actualParseDelimitedFromResult.getMemoizedSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    String actualInitializationErrorString = actualParseDelimitedFromResult.getInitializationErrorString();
    assertFalse(actualParseDelimitedFromResult.getDeprecated());
    assertEquals("", actualInitializationErrorString);
    assertEquals(0, actualUninterpretedOptionCount);
    assertFalse(actualAllowAlias);
    assertEquals(0, actualMemoizedSerializedSize);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange and Act
    DescriptorProtos.EnumOptions actualParseDelimitedFromResult = DescriptorProtos.EnumOptions
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualUninterpretedOptionCount = actualParseDelimitedFromResult.getUninterpretedOptionCount();
    boolean actualAllowAlias = actualParseDelimitedFromResult.getAllowAlias();
    int actualMemoizedSerializedSize = actualParseDelimitedFromResult.getMemoizedSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    String actualInitializationErrorString = actualParseDelimitedFromResult.getInitializationErrorString();
    assertFalse(actualParseDelimitedFromResult.getDeprecated());
    assertEquals("", actualInitializationErrorString);
    assertEquals(0, actualUninterpretedOptionCount);
    assertFalse(actualAllowAlias);
    assertEquals(0, actualMemoizedSerializedSize);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void parseFromTest34() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumOptions.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest33() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumOptions.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest32() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumOptions.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest31() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumOptions.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest6() {
    // Arrange, Act and Assert
    assertEquals(416312095, DescriptorProtos.EnumOptions.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest6() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumOptions.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest6() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumOptions.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest6() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.EnumOptions.getDefaultInstance().isInitialized());
  }

  @Test
  public void getUninterpretedOptionOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.EnumOptions.getDefaultInstance().getUninterpretedOptionOrBuilder(1);
  }

  @Test
  public void getUninterpretedOptionTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.EnumOptions.getDefaultInstance().getUninterpretedOption(1);
  }

  @Test
  public void getUninterpretedOptionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumOptions.getDefaultInstance().getUninterpretedOptionCount());
  }

  @Test
  public void getUninterpretedOptionOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumOptions.getDefaultInstance().getUninterpretedOptionOrBuilderList().size());
  }

  @Test
  public void getUninterpretedOptionListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumOptions.getDefaultInstance().getUninterpretedOptionList().size());
  }

  @Test
  public void getDeprecatedTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumOptions.getDefaultInstance().getDeprecated());
  }

  @Test
  public void hasDeprecatedTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumOptions.getDefaultInstance().hasDeprecated());
  }

  @Test
  public void getAllowAliasTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumOptions.getDefaultInstance().getAllowAlias());
  }

  @Test
  public void hasAllowAliasTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumOptions.getDefaultInstance().hasAllowAlias());
  }

  @Test
  public void toBuilderTest5() {
    // Arrange, Act and Assert
    assertEquals("",
        DescriptorProtos.EnumDescriptorProto.EnumReservedRange.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest10() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.EnumDescriptorProto.EnumReservedRange
        .newBuilder(DescriptorProtos.EnumDescriptorProto.EnumReservedRange.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest9() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.EnumDescriptorProto.EnumReservedRange.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest5() {
    // Arrange, Act and Assert
    assertEquals("",
        DescriptorProtos.EnumDescriptorProto.EnumReservedRange.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest30() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.EnumDescriptorProto.EnumReservedRange.parseFrom((CodedInputStream) null,
        ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest29() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.EnumDescriptorProto.EnumReservedRange.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest28() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumDescriptorProto.EnumReservedRange.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest27() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumDescriptorProto.EnumReservedRange.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest26() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumDescriptorProto.EnumReservedRange.parseFrom(new byte[24],
        ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest25() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumDescriptorProto.EnumReservedRange.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest5() {
    // Arrange, Act and Assert
    assertEquals(-1268455729, DescriptorProtos.EnumDescriptorProto.EnumReservedRange.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest5() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumDescriptorProto.EnumReservedRange.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest5() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumDescriptorProto.EnumReservedRange.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest5() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.EnumDescriptorProto.EnumReservedRange.getDefaultInstance().isInitialized());
  }

  @Test
  public void getEndTest3() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumDescriptorProto.EnumReservedRange.getDefaultInstance().getEnd());
  }

  @Test
  public void hasEndTest3() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumDescriptorProto.EnumReservedRange.getDefaultInstance().hasEnd());
  }

  @Test
  public void getStartTest3() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumDescriptorProto.EnumReservedRange.getDefaultInstance().getStart());
  }

  @Test
  public void hasStartTest3() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumDescriptorProto.EnumReservedRange.getDefaultInstance().hasStart());
  }

  @Test
  public void toBuilderTest4() {
    // Arrange and Act
    DescriptorProtos.EnumDescriptorProto.Builder actualToBuilderResult = DescriptorProtos.EnumDescriptorProto
        .getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    int actualReservedRangeCount = actualToBuilderResult.getReservedRangeCount();
    int actualValueCount = actualToBuilderResult.getValueCount();
    int actualReservedNameCount = actualToBuilderResult.getReservedNameCount();
    String actualToStringResult = actualToBuilderResult.toString();
    DescriptorProtos.EnumOptions.Builder actualOptionsBuilder = actualToBuilderResult.getOptionsBuilder();
    assertEquals("", actualName);
    assertEquals(0, actualReservedRangeCount);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualValueCount);
    assertEquals(0, actualReservedNameCount);
    assertSame(actualToBuilderResult.getOptionsOrBuilder(), actualOptionsBuilder);
  }

  @Test
  public void newBuilderTest8() {
    // Arrange and Act
    DescriptorProtos.EnumDescriptorProto.Builder actualNewBuilderResult = DescriptorProtos.EnumDescriptorProto
        .newBuilder(DescriptorProtos.EnumDescriptorProto.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    int actualReservedRangeCount = actualNewBuilderResult.getReservedRangeCount();
    int actualValueCount = actualNewBuilderResult.getValueCount();
    int actualReservedNameCount = actualNewBuilderResult.getReservedNameCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    DescriptorProtos.EnumOptions.Builder actualOptionsBuilder = actualNewBuilderResult.getOptionsBuilder();
    assertEquals("", actualName);
    assertEquals(0, actualReservedRangeCount);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualValueCount);
    assertEquals(0, actualReservedNameCount);
    assertSame(actualNewBuilderResult.getOptionsOrBuilder(), actualOptionsBuilder);
  }

  @Test
  public void newBuilderTest7() {
    // Arrange and Act
    DescriptorProtos.EnumDescriptorProto.Builder actualNewBuilderResult = DescriptorProtos.EnumDescriptorProto
        .newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    int actualReservedRangeCount = actualNewBuilderResult.getReservedRangeCount();
    int actualValueCount = actualNewBuilderResult.getValueCount();
    int actualReservedNameCount = actualNewBuilderResult.getReservedNameCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    DescriptorProtos.EnumOptions.Builder actualOptionsBuilder = actualNewBuilderResult.getOptionsBuilder();
    assertEquals("", actualName);
    assertEquals(0, actualReservedRangeCount);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualValueCount);
    assertEquals(0, actualReservedNameCount);
    assertSame(actualNewBuilderResult.getOptionsOrBuilder(), actualOptionsBuilder);
  }

  @Test
  public void newBuilderForTypeTest4() {
    // Arrange and Act
    DescriptorProtos.EnumDescriptorProto.Builder actualNewBuilderForTypeResult = DescriptorProtos.EnumDescriptorProto
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    int actualReservedRangeCount = actualNewBuilderForTypeResult.getReservedRangeCount();
    int actualValueCount = actualNewBuilderForTypeResult.getValueCount();
    int actualReservedNameCount = actualNewBuilderForTypeResult.getReservedNameCount();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    DescriptorProtos.EnumOptions.Builder actualOptionsBuilder = actualNewBuilderForTypeResult.getOptionsBuilder();
    assertEquals("", actualName);
    assertEquals(0, actualReservedRangeCount);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualValueCount);
    assertEquals(0, actualReservedNameCount);
    assertSame(actualNewBuilderForTypeResult.getOptionsOrBuilder(), actualOptionsBuilder);
  }

  @Test
  public void parseFromTest24() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.EnumDescriptorProto.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest23() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.EnumDescriptorProto.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest22() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumDescriptorProto.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest21() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumDescriptorProto.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest20() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumDescriptorProto.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest19() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.EnumDescriptorProto.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest4() {
    // Arrange, Act and Assert
    assertEquals(1561627332, DescriptorProtos.EnumDescriptorProto.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest4() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumDescriptorProto.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest4() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest4() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.EnumDescriptorProto.getDefaultInstance().isInitialized());
  }

  @Test
  public void getReservedNameBytesTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getReservedNameBytes(1);
  }

  @Test
  public void getReservedNameTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getReservedName(1);
  }

  @Test
  public void getReservedNameCountTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getReservedNameCount());
  }

  @Test
  public void getReservedNameListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getReservedNameList().size());
  }

  @Test
  public void getReservedRangeOrBuilderTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getReservedRangeOrBuilder(1);
  }

  @Test
  public void getReservedRangeTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getReservedRange(1);
  }

  @Test
  public void getReservedRangeCountTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getReservedRangeCount());
  }

  @Test
  public void getReservedRangeOrBuilderListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getReservedRangeOrBuilderList().size());
  }

  @Test
  public void getReservedRangeListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getReservedRangeList().size());
  }

  @Test
  public void getOptionsOrBuilderTest3() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.EnumDescriptorProto.getDefaultInstance()
        .getOptionsOrBuilder() instanceof DescriptorProtos.EnumOptions);
  }

  @Test
  public void hasOptionsTest3() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumDescriptorProto.getDefaultInstance().hasOptions());
  }

  @Test
  public void getValueOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getValueOrBuilder(1);
  }

  @Test
  public void getValueTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getValue(1);
  }

  @Test
  public void getValueCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getValueCount());
  }

  @Test
  public void getValueOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getValueOrBuilderList().size());
  }

  @Test
  public void getValueListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getValueList().size());
  }

  @Test
  public void getNameTest2() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getName());
  }

  @Test
  public void hasNameTest2() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.EnumDescriptorProto.getDefaultInstance().hasName());
  }

  @Test
  public void toBuilderTest3() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.DescriptorProto.ReservedRange.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest6() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.DescriptorProto.ReservedRange
        .newBuilder(DescriptorProtos.DescriptorProto.ReservedRange.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest5() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.DescriptorProto.ReservedRange.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest3() {
    // Arrange, Act and Assert
    assertEquals("",
        DescriptorProtos.DescriptorProto.ReservedRange.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest18() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.DescriptorProto.ReservedRange.parseFrom((CodedInputStream) null,
        ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest17() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.DescriptorProto.ReservedRange.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest16() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.DescriptorProto.ReservedRange.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest15() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.DescriptorProto.ReservedRange.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest14() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.DescriptorProto.ReservedRange.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest13() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.DescriptorProto.ReservedRange.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(1907248695, DescriptorProtos.DescriptorProto.ReservedRange.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest3() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.DescriptorProto.ReservedRange.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest3() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.ReservedRange.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest3() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.DescriptorProto.ReservedRange.getDefaultInstance().isInitialized());
  }

  @Test
  public void getEndTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.ReservedRange.getDefaultInstance().getEnd());
  }

  @Test
  public void hasEndTest2() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.DescriptorProto.ReservedRange.getDefaultInstance().hasEnd());
  }

  @Test
  public void getStartTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.ReservedRange.getDefaultInstance().getStart());
  }

  @Test
  public void hasStartTest2() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.DescriptorProto.ReservedRange.getDefaultInstance().hasStart());
  }

  @Test
  public void toBuilderTest2() {
    // Arrange and Act
    DescriptorProtos.DescriptorProto.ExtensionRange.Builder actualToBuilderResult = DescriptorProtos.DescriptorProto.ExtensionRange
        .getDefaultInstance().toBuilder();

    // Assert
    DescriptorProtos.ExtensionRangeOptionsOrBuilder optionsOrBuilder = actualToBuilderResult.getOptionsOrBuilder();
    assertTrue(optionsOrBuilder instanceof DescriptorProtos.ExtensionRangeOptions);
    assertEquals("", actualToBuilderResult.toString());
  }

  @Test
  public void newBuilderTest4() {
    // Arrange and Act
    DescriptorProtos.DescriptorProto.ExtensionRange.Builder actualNewBuilderResult = DescriptorProtos.DescriptorProto.ExtensionRange
        .newBuilder(DescriptorProtos.DescriptorProto.ExtensionRange.getDefaultInstance());

    // Assert
    DescriptorProtos.ExtensionRangeOptionsOrBuilder optionsOrBuilder = actualNewBuilderResult.getOptionsOrBuilder();
    assertTrue(optionsOrBuilder instanceof DescriptorProtos.ExtensionRangeOptions);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderTest3() {
    // Arrange and Act
    DescriptorProtos.DescriptorProto.ExtensionRange.Builder actualNewBuilderResult = DescriptorProtos.DescriptorProto.ExtensionRange
        .newBuilder();

    // Assert
    DescriptorProtos.ExtensionRangeOptionsOrBuilder optionsOrBuilder = actualNewBuilderResult.getOptionsOrBuilder();
    assertTrue(optionsOrBuilder instanceof DescriptorProtos.ExtensionRangeOptions);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderForTypeTest2() {
    // Arrange and Act
    DescriptorProtos.DescriptorProto.ExtensionRange.Builder actualNewBuilderForTypeResult = DescriptorProtos.DescriptorProto.ExtensionRange
        .getDefaultInstance().newBuilderForType();

    // Assert
    DescriptorProtos.ExtensionRangeOptionsOrBuilder optionsOrBuilder = actualNewBuilderForTypeResult
        .getOptionsOrBuilder();
    assertTrue(optionsOrBuilder instanceof DescriptorProtos.ExtensionRangeOptions);
    assertEquals("", actualNewBuilderForTypeResult.toString());
  }

  @Test
  public void parseFromTest12() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.DescriptorProto.ExtensionRange.parseFrom((CodedInputStream) null,
        ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest11() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.DescriptorProto.ExtensionRange.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest10() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.DescriptorProto.ExtensionRange.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest9() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.DescriptorProto.ExtensionRange.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest8() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.DescriptorProto.ExtensionRange.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest7() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.DescriptorProto.ExtensionRange.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(-1399713822, DescriptorProtos.DescriptorProto.ExtensionRange.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.DescriptorProto.ExtensionRange.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.ExtensionRange.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest2() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.DescriptorProto.ExtensionRange.getDefaultInstance().isInitialized());
  }

  @Test
  public void getOptionsOrBuilderTest2() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.DescriptorProto.ExtensionRange.getDefaultInstance()
        .getOptionsOrBuilder() instanceof DescriptorProtos.ExtensionRangeOptions);
  }

  @Test
  public void hasOptionsTest2() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.DescriptorProto.ExtensionRange.getDefaultInstance().hasOptions());
  }

  @Test
  public void getEndTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.ExtensionRange.getDefaultInstance().getEnd());
  }

  @Test
  public void hasEndTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.DescriptorProto.ExtensionRange.getDefaultInstance().hasEnd());
  }

  @Test
  public void getStartTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.ExtensionRange.getDefaultInstance().getStart());
  }

  @Test
  public void hasStartTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.DescriptorProto.ExtensionRange.getDefaultInstance().hasStart());
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    DescriptorProtos.DescriptorProto.Builder actualToBuilderResult = DescriptorProtos.DescriptorProto
        .getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    int actualExtensionCount = actualToBuilderResult.getExtensionCount();
    int actualReservedRangeCount = actualToBuilderResult.getReservedRangeCount();
    DescriptorProtos.MessageOptions.Builder actualOptionsBuilder = actualToBuilderResult.getOptionsBuilder();
    int actualReservedNameCount = actualToBuilderResult.getReservedNameCount();
    int actualOneofDeclCount = actualToBuilderResult.getOneofDeclCount();
    String actualToStringResult = actualToBuilderResult.toString();
    int actualNestedTypeCount = actualToBuilderResult.getNestedTypeCount();
    int actualExtensionRangeCount = actualToBuilderResult.getExtensionRangeCount();
    assertEquals("", actualName);
    assertEquals(0, actualExtensionRangeCount);
    assertEquals(0, actualNestedTypeCount);
    assertEquals("options {\n}\n", actualToStringResult);
    assertEquals(0, actualOneofDeclCount);
    assertEquals(0, actualReservedNameCount);
    assertSame(actualToBuilderResult.getOptionsOrBuilder(), actualOptionsBuilder);
    assertEquals(0, actualReservedRangeCount);
    assertEquals(0, actualExtensionCount);
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    DescriptorProtos.DescriptorProto.Builder actualNewBuilderResult = DescriptorProtos.DescriptorProto
        .newBuilder(DescriptorProtos.DescriptorProto.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    int actualExtensionCount = actualNewBuilderResult.getExtensionCount();
    int actualReservedRangeCount = actualNewBuilderResult.getReservedRangeCount();
    DescriptorProtos.MessageOptions.Builder actualOptionsBuilder = actualNewBuilderResult.getOptionsBuilder();
    int actualReservedNameCount = actualNewBuilderResult.getReservedNameCount();
    int actualOneofDeclCount = actualNewBuilderResult.getOneofDeclCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualNestedTypeCount = actualNewBuilderResult.getNestedTypeCount();
    int actualExtensionRangeCount = actualNewBuilderResult.getExtensionRangeCount();
    assertEquals("", actualName);
    assertEquals(0, actualExtensionRangeCount);
    assertEquals(0, actualNestedTypeCount);
    assertEquals("options {\n}\n", actualToStringResult);
    assertEquals(0, actualOneofDeclCount);
    assertEquals(0, actualReservedNameCount);
    assertSame(actualNewBuilderResult.getOptionsOrBuilder(), actualOptionsBuilder);
    assertEquals(0, actualReservedRangeCount);
    assertEquals(0, actualExtensionCount);
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    DescriptorProtos.DescriptorProto.Builder actualNewBuilderResult = DescriptorProtos.DescriptorProto.newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    int actualExtensionCount = actualNewBuilderResult.getExtensionCount();
    int actualReservedRangeCount = actualNewBuilderResult.getReservedRangeCount();
    DescriptorProtos.MessageOptions.Builder actualOptionsBuilder = actualNewBuilderResult.getOptionsBuilder();
    int actualReservedNameCount = actualNewBuilderResult.getReservedNameCount();
    int actualOneofDeclCount = actualNewBuilderResult.getOneofDeclCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualNestedTypeCount = actualNewBuilderResult.getNestedTypeCount();
    int actualExtensionRangeCount = actualNewBuilderResult.getExtensionRangeCount();
    assertEquals("", actualName);
    assertEquals(0, actualExtensionRangeCount);
    assertEquals(0, actualNestedTypeCount);
    assertEquals("options {\n}\n", actualToStringResult);
    assertEquals(0, actualOneofDeclCount);
    assertEquals(0, actualReservedNameCount);
    assertSame(actualNewBuilderResult.getOptionsOrBuilder(), actualOptionsBuilder);
    assertEquals(0, actualReservedRangeCount);
    assertEquals(0, actualExtensionCount);
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    DescriptorProtos.DescriptorProto.Builder actualNewBuilderForTypeResult = DescriptorProtos.DescriptorProto
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    int actualExtensionCount = actualNewBuilderForTypeResult.getExtensionCount();
    int actualReservedRangeCount = actualNewBuilderForTypeResult.getReservedRangeCount();
    DescriptorProtos.MessageOptions.Builder actualOptionsBuilder = actualNewBuilderForTypeResult.getOptionsBuilder();
    int actualReservedNameCount = actualNewBuilderForTypeResult.getReservedNameCount();
    int actualOneofDeclCount = actualNewBuilderForTypeResult.getOneofDeclCount();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    int actualNestedTypeCount = actualNewBuilderForTypeResult.getNestedTypeCount();
    int actualExtensionRangeCount = actualNewBuilderForTypeResult.getExtensionRangeCount();
    assertEquals("", actualName);
    assertEquals(0, actualExtensionRangeCount);
    assertEquals(0, actualNestedTypeCount);
    assertEquals("options {\n}\n", actualToStringResult);
    assertEquals(0, actualOneofDeclCount);
    assertEquals(0, actualReservedNameCount);
    assertSame(actualNewBuilderForTypeResult.getOptionsOrBuilder(), actualOptionsBuilder);
    assertEquals(0, actualReservedRangeCount);
    assertEquals(0, actualExtensionCount);
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.DescriptorProto.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DescriptorProtos.DescriptorProto.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.DescriptorProto.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.DescriptorProto.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.DescriptorProto.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    DescriptorProtos.DescriptorProto.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-593605559, DescriptorProtos.DescriptorProto.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.DescriptorProto.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.DescriptorProto.getDefaultInstance().isInitialized());
  }

  @Test
  public void getReservedNameBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.DescriptorProto.getDefaultInstance().getReservedNameBytes(1);
  }

  @Test
  public void getReservedNameTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.DescriptorProto.getDefaultInstance().getReservedName(1);
  }

  @Test
  public void getReservedNameCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getReservedNameCount());
  }

  @Test
  public void getReservedNameListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getReservedNameList().size());
  }

  @Test
  public void getReservedRangeOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.DescriptorProto.getDefaultInstance().getReservedRangeOrBuilder(1);
  }

  @Test
  public void getReservedRangeTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.DescriptorProto.getDefaultInstance().getReservedRange(1);
  }

  @Test
  public void getReservedRangeCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getReservedRangeCount());
  }

  @Test
  public void getReservedRangeOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getReservedRangeOrBuilderList().size());
  }

  @Test
  public void getReservedRangeListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getReservedRangeList().size());
  }

  @Test
  public void getOptionsOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(DescriptorProtos.DescriptorProto.getDefaultInstance()
        .getOptionsOrBuilder() instanceof DescriptorProtos.MessageOptions);
  }

  @Test
  public void hasOptionsTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.DescriptorProto.getDefaultInstance().hasOptions());
  }

  @Test
  public void getOneofDeclOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.DescriptorProto.getDefaultInstance().getOneofDeclOrBuilder(1);
  }

  @Test
  public void getOneofDeclTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.DescriptorProto.getDefaultInstance().getOneofDecl(1);
  }

  @Test
  public void getOneofDeclCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getOneofDeclCount());
  }

  @Test
  public void getOneofDeclOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getOneofDeclOrBuilderList().size());
  }

  @Test
  public void getOneofDeclListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getOneofDeclList().size());
  }

  @Test
  public void getExtensionRangeOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.DescriptorProto.getDefaultInstance().getExtensionRangeOrBuilder(1);
  }

  @Test
  public void getExtensionRangeTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.DescriptorProto.getDefaultInstance().getExtensionRange(1);
  }

  @Test
  public void getExtensionRangeCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getExtensionRangeCount());
  }

  @Test
  public void getExtensionRangeOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getExtensionRangeOrBuilderList().size());
  }

  @Test
  public void getExtensionRangeListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getExtensionRangeList().size());
  }

  @Test
  public void getEnumTypeOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.DescriptorProto.getDefaultInstance().getEnumTypeOrBuilder(1);
  }

  @Test
  public void getEnumTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.DescriptorProto.getDefaultInstance().getEnumType(1);
  }

  @Test
  public void getEnumTypeCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getEnumTypeCount());
  }

  @Test
  public void getEnumTypeOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getEnumTypeOrBuilderList().size());
  }

  @Test
  public void getEnumTypeListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getEnumTypeList().size());
  }

  @Test
  public void getNestedTypeOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.DescriptorProto.getDefaultInstance().getNestedTypeOrBuilder(1);
  }

  @Test
  public void getNestedTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.DescriptorProto.getDefaultInstance().getNestedType(1);
  }

  @Test
  public void getNestedTypeCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getNestedTypeCount());
  }

  @Test
  public void getNestedTypeOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getNestedTypeOrBuilderList().size());
  }

  @Test
  public void getNestedTypeListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getNestedTypeList().size());
  }

  @Test
  public void getExtensionOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.DescriptorProto.getDefaultInstance().getExtensionOrBuilder(1);
  }

  @Test
  public void getExtensionTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.DescriptorProto.getDefaultInstance().getExtension(1);
  }

  @Test
  public void getExtensionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getExtensionCount());
  }

  @Test
  public void getExtensionOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getExtensionOrBuilderList().size());
  }

  @Test
  public void getExtensionListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getExtensionList().size());
  }

  @Test
  public void getFieldOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.DescriptorProto.getDefaultInstance().getFieldOrBuilder(1);
  }

  @Test
  public void getFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    DescriptorProtos.DescriptorProto.getDefaultInstance().getField(1);
  }

  @Test
  public void getFieldCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getFieldCount());
  }

  @Test
  public void getFieldOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getFieldOrBuilderList().size());
  }

  @Test
  public void getFieldListTest() {
    // Arrange, Act and Assert
    assertEquals(0, DescriptorProtos.DescriptorProto.getDefaultInstance().getFieldList().size());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("", DescriptorProtos.DescriptorProto.getDefaultInstance().getName());
  }

  @Test
  public void hasNameTest() {
    // Arrange, Act and Assert
    assertFalse(DescriptorProtos.DescriptorProto.getDefaultInstance().hasName());
  }
}
