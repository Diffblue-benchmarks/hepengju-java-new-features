package com.mysql.cj.x.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

public class MysqlxResultsetTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest6() {
    // Arrange and Act
    MysqlxResultset.Row.Builder actualToBuilderResult = MysqlxResultset.Row.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualToBuilderResult.getFieldCount());
  }

  @Test
  public void newBuilderTest12() {
    // Arrange and Act
    MysqlxResultset.Row.Builder actualNewBuilderResult = MysqlxResultset.Row
        .newBuilder(MysqlxResultset.Row.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getFieldCount());
  }

  @Test
  public void newBuilderTest11() {
    // Arrange and Act
    MysqlxResultset.Row.Builder actualNewBuilderResult = MysqlxResultset.Row.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getFieldCount());
  }

  @Test
  public void newBuilderForTypeTest6() {
    // Arrange and Act
    MysqlxResultset.Row.Builder actualNewBuilderForTypeResult = MysqlxResultset.Row.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderForTypeResult.getFieldCount());
  }

  @Test
  public void parseFromTest48() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.Row.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest47() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.Row.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest12() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxResultset.Row actualParseDelimitedFromResult = MysqlxResultset.Row.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualFieldCount = actualParseDelimitedFromResult.getFieldCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertEquals(0, actualFieldCount);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseDelimitedFromTest11() throws IOException {
    // Arrange and Act
    MysqlxResultset.Row actualParseDelimitedFromResult = MysqlxResultset.Row
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualFieldCount = actualParseDelimitedFromResult.getFieldCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertEquals(0, actualFieldCount);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseFromTest46() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.Row.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest45() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.Row.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest44() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.Row.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest43() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.Row.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest42() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.Row.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest41() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.Row.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest6() {
    // Arrange, Act and Assert
    assertEquals(-1324560155, MysqlxResultset.Row.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest6() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.Row.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest6() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxResultset.Row.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest6() {
    // Arrange, Act and Assert
    assertTrue(MysqlxResultset.Row.getDefaultInstance().isInitialized());
  }

  @Test
  public void getFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxResultset.Row.getDefaultInstance().getField(1);
  }

  @Test
  public void getFieldCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxResultset.Row.getDefaultInstance().getFieldCount());
  }

  @Test
  public void getFieldListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxResultset.Row.getDefaultInstance().getFieldList().size());
  }

  @Test
  public void toBuilderTest5() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxResultset.FetchSuspended.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest10() {
    // Arrange, Act and Assert
    assertEquals("",
        MysqlxResultset.FetchSuspended.newBuilder(MysqlxResultset.FetchSuspended.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest9() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxResultset.FetchSuspended.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest5() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxResultset.FetchSuspended.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest40() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.FetchSuspended.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest39() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.FetchSuspended.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest10() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxResultset.FetchSuspended actualParseDelimitedFromResult = MysqlxResultset.FetchSuspended
        .parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    assertEquals("", actualToStringResult);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals(0, actualSerializedSize);
  }

  @Test
  public void parseDelimitedFromTest9() throws IOException {
    // Arrange and Act
    MysqlxResultset.FetchSuspended actualParseDelimitedFromResult = MysqlxResultset.FetchSuspended
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    assertEquals("", actualToStringResult);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals(0, actualSerializedSize);
  }

  @Test
  public void parseFromTest38() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.FetchSuspended.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest37() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.FetchSuspended.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest36() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.FetchSuspended.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest35() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.FetchSuspended.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest34() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.FetchSuspended.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest33() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.FetchSuspended.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest5() {
    // Arrange, Act and Assert
    assertEquals(1237674251, MysqlxResultset.FetchSuspended.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest5() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.FetchSuspended.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest5() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxResultset.FetchSuspended.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest5() {
    // Arrange, Act and Assert
    assertTrue(MysqlxResultset.FetchSuspended.getDefaultInstance().isInitialized());
  }

  @Test
  public void toBuilderTest4() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxResultset.FetchDoneMoreResultsets.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest8() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxResultset.FetchDoneMoreResultsets
        .newBuilder(MysqlxResultset.FetchDoneMoreResultsets.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest7() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxResultset.FetchDoneMoreResultsets.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest4() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxResultset.FetchDoneMoreResultsets.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest32() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.FetchDoneMoreResultsets.parseFrom((CodedInputStream) null,
        ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest31() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.FetchDoneMoreResultsets.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest8() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxResultset.FetchDoneMoreResultsets actualParseDelimitedFromResult = MysqlxResultset.FetchDoneMoreResultsets
        .parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseDelimitedFromTest7() throws IOException {
    // Arrange and Act
    MysqlxResultset.FetchDoneMoreResultsets actualParseDelimitedFromResult = MysqlxResultset.FetchDoneMoreResultsets
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseFromTest30() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.FetchDoneMoreResultsets.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest29() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.FetchDoneMoreResultsets.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest28() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.FetchDoneMoreResultsets.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest27() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.FetchDoneMoreResultsets.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest26() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.FetchDoneMoreResultsets.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest25() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.FetchDoneMoreResultsets.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest4() {
    // Arrange, Act and Assert
    assertEquals(443340323, MysqlxResultset.FetchDoneMoreResultsets.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.FetchDoneMoreResultsets.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest4() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxResultset.FetchDoneMoreResultsets.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest4() {
    // Arrange, Act and Assert
    assertTrue(MysqlxResultset.FetchDoneMoreResultsets.getDefaultInstance().isInitialized());
  }

  @Test
  public void toBuilderTest3() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxResultset.FetchDoneMoreOutParams.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest6() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxResultset.FetchDoneMoreOutParams
        .newBuilder(MysqlxResultset.FetchDoneMoreOutParams.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest5() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxResultset.FetchDoneMoreOutParams.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest3() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxResultset.FetchDoneMoreOutParams.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest24() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.FetchDoneMoreOutParams.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest23() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.FetchDoneMoreOutParams.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxResultset.FetchDoneMoreOutParams actualParseDelimitedFromResult = MysqlxResultset.FetchDoneMoreOutParams
        .parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseDelimitedFromTest5() throws IOException {
    // Arrange and Act
    MysqlxResultset.FetchDoneMoreOutParams actualParseDelimitedFromResult = MysqlxResultset.FetchDoneMoreOutParams
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseFromTest22() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.FetchDoneMoreOutParams.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest21() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.FetchDoneMoreOutParams.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest20() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.FetchDoneMoreOutParams.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest19() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.FetchDoneMoreOutParams.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest18() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.FetchDoneMoreOutParams.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest17() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.FetchDoneMoreOutParams.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(1292222595, MysqlxResultset.FetchDoneMoreOutParams.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.FetchDoneMoreOutParams.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxResultset.FetchDoneMoreOutParams.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest3() {
    // Arrange, Act and Assert
    assertTrue(MysqlxResultset.FetchDoneMoreOutParams.getDefaultInstance().isInitialized());
  }

  @Test
  public void toBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxResultset.FetchDone.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest4() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxResultset.FetchDone.newBuilder(MysqlxResultset.FetchDone.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest3() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxResultset.FetchDone.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxResultset.FetchDone.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest16() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.FetchDone.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest15() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.FetchDone.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxResultset.FetchDone actualParseDelimitedFromResult = MysqlxResultset.FetchDone.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseDelimitedFromTest3() throws IOException {
    // Arrange and Act
    MysqlxResultset.FetchDone actualParseDelimitedFromResult = MysqlxResultset.FetchDone
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseFromTest14() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.FetchDone.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest13() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.FetchDone.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest12() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.FetchDone.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest11() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.FetchDone.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest10() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.FetchDone.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest9() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.FetchDone.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(561851795, MysqlxResultset.FetchDone.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.FetchDone.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxResultset.FetchDone.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest2() {
    // Arrange, Act and Assert
    assertTrue(MysqlxResultset.FetchDone.getDefaultInstance().isInitialized());
  }

  @Test
  public void valueOfTest6() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.ContentType_DATETIME.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest3() {
    // Arrange, Act and Assert
    assertEquals(MysqlxResultset.ContentType_DATETIME.DATE, MysqlxResultset.ContentType_DATETIME.forNumber(1));
  }

  @Test
  public void valueOfTest5() {
    // Arrange, Act and Assert
    assertEquals(MysqlxResultset.ContentType_DATETIME.DATE, MysqlxResultset.ContentType_DATETIME.valueOf(1));
  }

  @Test
  public void getNumberTest3() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxResultset.ContentType_DATETIME.DATE.getNumber());
  }

  @Test
  public void valueOfTest4() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.ContentType_BYTES.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(MysqlxResultset.ContentType_BYTES.GEOMETRY, MysqlxResultset.ContentType_BYTES.forNumber(1));
  }

  @Test
  public void valueOfTest3() {
    // Arrange, Act and Assert
    assertEquals(MysqlxResultset.ContentType_BYTES.GEOMETRY, MysqlxResultset.ContentType_BYTES.valueOf(1));
  }

  @Test
  public void getNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxResultset.ContentType_BYTES.GEOMETRY.getNumber());
  }

  @Test
  public void valueOfTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.ColumnMetaData.FieldType.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxResultset.ColumnMetaData.FieldType.SINT, MysqlxResultset.ColumnMetaData.FieldType.forNumber(1));
  }

  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxResultset.ColumnMetaData.FieldType.SINT, MysqlxResultset.ColumnMetaData.FieldType.valueOf(1));
  }

  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxResultset.ColumnMetaData.FieldType.SINT.getNumber());
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    MysqlxResultset.ColumnMetaData.Builder actualToBuilderResult = MysqlxResultset.ColumnMetaData.getDefaultInstance()
        .toBuilder();

    // Assert
    MysqlxResultset.ColumnMetaData.FieldType actualType = actualToBuilderResult.getType();
    assertEquals(MysqlxResultset.ColumnMetaData.FieldType.SINT, actualType);
    assertEquals("", actualToBuilderResult.toString());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    MysqlxResultset.ColumnMetaData.Builder actualNewBuilderResult = MysqlxResultset.ColumnMetaData
        .newBuilder(MysqlxResultset.ColumnMetaData.getDefaultInstance());

    // Assert
    MysqlxResultset.ColumnMetaData.FieldType actualType = actualNewBuilderResult.getType();
    assertEquals(MysqlxResultset.ColumnMetaData.FieldType.SINT, actualType);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    MysqlxResultset.ColumnMetaData.Builder actualNewBuilderResult = MysqlxResultset.ColumnMetaData.newBuilder();

    // Assert
    MysqlxResultset.ColumnMetaData.FieldType actualType = actualNewBuilderResult.getType();
    assertEquals(MysqlxResultset.ColumnMetaData.FieldType.SINT, actualType);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    MysqlxResultset.ColumnMetaData.Builder actualNewBuilderForTypeResult = MysqlxResultset.ColumnMetaData
        .getDefaultInstance().newBuilderForType();

    // Assert
    MysqlxResultset.ColumnMetaData.FieldType actualType = actualNewBuilderForTypeResult.getType();
    assertEquals(MysqlxResultset.ColumnMetaData.FieldType.SINT, actualType);
    assertEquals("", actualNewBuilderForTypeResult.toString());
  }

  @Test
  public void parseFromTest8() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.ColumnMetaData.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.ColumnMetaData.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.ColumnMetaData.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.ColumnMetaData.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.ColumnMetaData.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.ColumnMetaData.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest4() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.ColumnMetaData.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxResultset.ColumnMetaData.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.ColumnMetaData.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxResultset.ColumnMetaData.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-550465377, MysqlxResultset.ColumnMetaData.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.ColumnMetaData.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxResultset.ColumnMetaData.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.ColumnMetaData.getDefaultInstance().isInitialized());
  }

  @Test
  public void getContentTypeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxResultset.ColumnMetaData.getDefaultInstance().getContentType());
  }

  @Test
  public void hasContentTypeTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.ColumnMetaData.getDefaultInstance().hasContentType());
  }

  @Test
  public void getFlagsTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxResultset.ColumnMetaData.getDefaultInstance().getFlags());
  }

  @Test
  public void hasFlagsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.ColumnMetaData.getDefaultInstance().hasFlags());
  }

  @Test
  public void getLengthTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxResultset.ColumnMetaData.getDefaultInstance().getLength());
  }

  @Test
  public void hasLengthTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.ColumnMetaData.getDefaultInstance().hasLength());
  }

  @Test
  public void getFractionalDigitsTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxResultset.ColumnMetaData.getDefaultInstance().getFractionalDigits());
  }

  @Test
  public void hasFractionalDigitsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.ColumnMetaData.getDefaultInstance().hasFractionalDigits());
  }

  @Test
  public void getCollationTest() {
    // Arrange, Act and Assert
    assertEquals(0L, MysqlxResultset.ColumnMetaData.getDefaultInstance().getCollation());
  }

  @Test
  public void hasCollationTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.ColumnMetaData.getDefaultInstance().hasCollation());
  }

  @Test
  public void hasCatalogTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.ColumnMetaData.getDefaultInstance().hasCatalog());
  }

  @Test
  public void hasSchemaTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.ColumnMetaData.getDefaultInstance().hasSchema());
  }

  @Test
  public void hasOriginalTableTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.ColumnMetaData.getDefaultInstance().hasOriginalTable());
  }

  @Test
  public void hasTableTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.ColumnMetaData.getDefaultInstance().hasTable());
  }

  @Test
  public void hasOriginalNameTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.ColumnMetaData.getDefaultInstance().hasOriginalName());
  }

  @Test
  public void hasNameTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.ColumnMetaData.getDefaultInstance().hasName());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxResultset.ColumnMetaData.FieldType.SINT,
        MysqlxResultset.ColumnMetaData.getDefaultInstance().getType());
  }

  @Test
  public void hasTypeTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxResultset.ColumnMetaData.getDefaultInstance().hasType());
  }
}
