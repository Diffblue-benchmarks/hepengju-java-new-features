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

public class MysqlxNoticeTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void valueOfTest10() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.Warning.Level.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest5() {
    // Arrange, Act and Assert
    assertEquals(MysqlxNotice.Warning.Level.NOTE, MysqlxNotice.Warning.Level.forNumber(1));
  }

  @Test
  public void valueOfTest9() {
    // Arrange, Act and Assert
    assertEquals(MysqlxNotice.Warning.Level.NOTE, MysqlxNotice.Warning.Level.valueOf(1));
  }

  @Test
  public void getNumberTest5() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxNotice.Warning.Level.NOTE.getNumber());
  }

  @Test
  public void toBuilderTest6() {
    // Arrange and Act
    MysqlxNotice.Warning.Builder actualToBuilderResult = MysqlxNotice.Warning.getDefaultInstance().toBuilder();

    // Assert
    MysqlxNotice.Warning.Level actualLevel = actualToBuilderResult.getLevel();
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals(MysqlxNotice.Warning.Level.WARNING, actualLevel);
    assertEquals("", actualToBuilderResult.getMsg());
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderTest12() {
    // Arrange and Act
    MysqlxNotice.Warning.Builder actualNewBuilderResult = MysqlxNotice.Warning
        .newBuilder(MysqlxNotice.Warning.getDefaultInstance());

    // Assert
    MysqlxNotice.Warning.Level actualLevel = actualNewBuilderResult.getLevel();
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals(MysqlxNotice.Warning.Level.WARNING, actualLevel);
    assertEquals("", actualNewBuilderResult.getMsg());
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderTest11() {
    // Arrange and Act
    MysqlxNotice.Warning.Builder actualNewBuilderResult = MysqlxNotice.Warning.newBuilder();

    // Assert
    MysqlxNotice.Warning.Level actualLevel = actualNewBuilderResult.getLevel();
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals(MysqlxNotice.Warning.Level.WARNING, actualLevel);
    assertEquals("", actualNewBuilderResult.getMsg());
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderForTypeTest6() {
    // Arrange and Act
    MysqlxNotice.Warning.Builder actualNewBuilderForTypeResult = MysqlxNotice.Warning.getDefaultInstance()
        .newBuilderForType();

    // Assert
    MysqlxNotice.Warning.Level actualLevel = actualNewBuilderForTypeResult.getLevel();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals(MysqlxNotice.Warning.Level.WARNING, actualLevel);
    assertEquals("", actualNewBuilderForTypeResult.getMsg());
    assertEquals("", actualToStringResult);
  }

  @Test
  public void parseFromTest48() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.Warning.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest47() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.Warning.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest12() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.Warning.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest11() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.Warning.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest46() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.Warning.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest45() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.Warning.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest44() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.Warning.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest43() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.Warning.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest42() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.Warning.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest41() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.Warning.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest6() {
    // Arrange, Act and Assert
    assertEquals(544349728, MysqlxNotice.Warning.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest6() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.Warning.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest6() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxNotice.Warning.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest6() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.Warning.getDefaultInstance().isInitialized());
  }

  @Test
  public void getMsgTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxNotice.Warning.getDefaultInstance().getMsg());
  }

  @Test
  public void hasMsgTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.Warning.getDefaultInstance().hasMsg());
  }

  @Test
  public void getCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxNotice.Warning.getDefaultInstance().getCode());
  }

  @Test
  public void hasCodeTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.Warning.getDefaultInstance().hasCode());
  }

  @Test
  public void getLevelTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxNotice.Warning.Level.WARNING, MysqlxNotice.Warning.getDefaultInstance().getLevel());
  }

  @Test
  public void hasLevelTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.Warning.getDefaultInstance().hasLevel());
  }

  @Test
  public void toBuilderTest5() {
    // Arrange and Act
    MysqlxNotice.SessionVariableChanged.Builder actualToBuilderResult = MysqlxNotice.SessionVariableChanged
        .getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    String actualParam = actualToBuilderResult.getParam();
    MysqlxDatatypes.Scalar.Builder actualValueBuilder = actualToBuilderResult.getValueBuilder();
    assertEquals("", actualToStringResult);
    assertEquals("", actualParam);
    assertSame(actualToBuilderResult.getValueOrBuilder(), actualValueBuilder);
  }

  @Test
  public void newBuilderTest10() {
    // Arrange and Act
    MysqlxNotice.SessionVariableChanged.Builder actualNewBuilderResult = MysqlxNotice.SessionVariableChanged
        .newBuilder(MysqlxNotice.SessionVariableChanged.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualParam = actualNewBuilderResult.getParam();
    MysqlxDatatypes.Scalar.Builder actualValueBuilder = actualNewBuilderResult.getValueBuilder();
    assertEquals("", actualToStringResult);
    assertEquals("", actualParam);
    assertSame(actualNewBuilderResult.getValueOrBuilder(), actualValueBuilder);
  }

  @Test
  public void newBuilderTest9() {
    // Arrange and Act
    MysqlxNotice.SessionVariableChanged.Builder actualNewBuilderResult = MysqlxNotice.SessionVariableChanged
        .newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualParam = actualNewBuilderResult.getParam();
    MysqlxDatatypes.Scalar.Builder actualValueBuilder = actualNewBuilderResult.getValueBuilder();
    assertEquals("", actualToStringResult);
    assertEquals("", actualParam);
    assertSame(actualNewBuilderResult.getValueOrBuilder(), actualValueBuilder);
  }

  @Test
  public void newBuilderForTypeTest5() {
    // Arrange and Act
    MysqlxNotice.SessionVariableChanged.Builder actualNewBuilderForTypeResult = MysqlxNotice.SessionVariableChanged
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    String actualParam = actualNewBuilderForTypeResult.getParam();
    MysqlxDatatypes.Scalar.Builder actualValueBuilder = actualNewBuilderForTypeResult.getValueBuilder();
    assertEquals("", actualToStringResult);
    assertEquals("", actualParam);
    assertSame(actualNewBuilderForTypeResult.getValueOrBuilder(), actualValueBuilder);
  }

  @Test
  public void parseFromTest40() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.SessionVariableChanged.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest39() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.SessionVariableChanged.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest10() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.SessionVariableChanged.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest9() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.SessionVariableChanged.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest38() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.SessionVariableChanged.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest37() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.SessionVariableChanged.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest36() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.SessionVariableChanged.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest35() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.SessionVariableChanged.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest34() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.SessionVariableChanged.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest33() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.SessionVariableChanged.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest5() {
    // Arrange, Act and Assert
    assertEquals(351869854, MysqlxNotice.SessionVariableChanged.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest5() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.SessionVariableChanged.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest5() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxNotice.SessionVariableChanged.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest5() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.SessionVariableChanged.getDefaultInstance().isInitialized());
  }

  @Test
  public void getValueOrBuilderTest2() {
    // Arrange, Act and Assert
    assertTrue(
        MysqlxNotice.SessionVariableChanged.getDefaultInstance().getValueOrBuilder() instanceof MysqlxDatatypes.Scalar);
  }

  @Test
  public void hasValueTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.SessionVariableChanged.getDefaultInstance().hasValue());
  }

  @Test
  public void getParamTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxNotice.SessionVariableChanged.getDefaultInstance().getParam());
  }

  @Test
  public void hasParamTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.SessionVariableChanged.getDefaultInstance().hasParam());
  }

  @Test
  public void valueOfTest8() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.SessionStateChanged.Parameter.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest4() {
    // Arrange, Act and Assert
    assertEquals(MysqlxNotice.SessionStateChanged.Parameter.CURRENT_SCHEMA,
        MysqlxNotice.SessionStateChanged.Parameter.forNumber(1));
  }

  @Test
  public void valueOfTest7() {
    // Arrange, Act and Assert
    assertEquals(MysqlxNotice.SessionStateChanged.Parameter.CURRENT_SCHEMA,
        MysqlxNotice.SessionStateChanged.Parameter.valueOf(1));
  }

  @Test
  public void getNumberTest4() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxNotice.SessionStateChanged.Parameter.CURRENT_SCHEMA.getNumber());
  }

  @Test
  public void toBuilderTest4() {
    // Arrange and Act
    MysqlxNotice.SessionStateChanged.Builder actualToBuilderResult = MysqlxNotice.SessionStateChanged
        .getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxNotice.SessionStateChanged.Parameter.CURRENT_SCHEMA, actualToBuilderResult.getParam());
  }

  @Test
  public void newBuilderTest8() {
    // Arrange and Act
    MysqlxNotice.SessionStateChanged.Builder actualNewBuilderResult = MysqlxNotice.SessionStateChanged
        .newBuilder(MysqlxNotice.SessionStateChanged.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxNotice.SessionStateChanged.Parameter.CURRENT_SCHEMA, actualNewBuilderResult.getParam());
  }

  @Test
  public void newBuilderTest7() {
    // Arrange and Act
    MysqlxNotice.SessionStateChanged.Builder actualNewBuilderResult = MysqlxNotice.SessionStateChanged.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxNotice.SessionStateChanged.Parameter.CURRENT_SCHEMA, actualNewBuilderResult.getParam());
  }

  @Test
  public void newBuilderForTypeTest4() {
    // Arrange and Act
    MysqlxNotice.SessionStateChanged.Builder actualNewBuilderForTypeResult = MysqlxNotice.SessionStateChanged
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxNotice.SessionStateChanged.Parameter.CURRENT_SCHEMA, actualNewBuilderForTypeResult.getParam());
  }

  @Test
  public void parseFromTest32() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.SessionStateChanged.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest31() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.SessionStateChanged.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest8() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.SessionStateChanged.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.SessionStateChanged.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest30() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.SessionStateChanged.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest29() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.SessionStateChanged.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest28() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.SessionStateChanged.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest27() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.SessionStateChanged.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest26() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.SessionStateChanged.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest25() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.SessionStateChanged.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest4() {
    // Arrange, Act and Assert
    assertEquals(56630630, MysqlxNotice.SessionStateChanged.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.SessionStateChanged.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest4() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxNotice.SessionStateChanged.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.SessionStateChanged.getDefaultInstance().isInitialized());
  }

  @Test
  public void getValueOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxNotice.SessionStateChanged.getDefaultInstance().getValueOrBuilder(1);
  }

  @Test
  public void getValueTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxNotice.SessionStateChanged.getDefaultInstance().getValue(1);
  }

  @Test
  public void getValueCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxNotice.SessionStateChanged.getDefaultInstance().getValueCount());
  }

  @Test
  public void getValueOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxNotice.SessionStateChanged.getDefaultInstance().getValueOrBuilderList().size());
  }

  @Test
  public void getValueListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxNotice.SessionStateChanged.getDefaultInstance().getValueList().size());
  }

  @Test
  public void getParamTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxNotice.SessionStateChanged.Parameter.CURRENT_SCHEMA,
        MysqlxNotice.SessionStateChanged.getDefaultInstance().getParam());
  }

  @Test
  public void hasParamTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.SessionStateChanged.getDefaultInstance().hasParam());
  }

  @Test
  public void toBuilderTest3() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxNotice.ServerHello.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest6() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxNotice.ServerHello.newBuilder(MysqlxNotice.ServerHello.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest5() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxNotice.ServerHello.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest3() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxNotice.ServerHello.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest24() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.ServerHello.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest23() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.ServerHello.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxNotice.ServerHello actualParseDelimitedFromResult = MysqlxNotice.ServerHello.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

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
    MysqlxNotice.ServerHello actualParseDelimitedFromResult = MysqlxNotice.ServerHello
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
    MysqlxNotice.ServerHello.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest21() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.ServerHello.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest20() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.ServerHello.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest19() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.ServerHello.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest18() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.ServerHello.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest17() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.ServerHello.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(402808164, MysqlxNotice.ServerHello.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.ServerHello.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxNotice.ServerHello.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest3() {
    // Arrange, Act and Assert
    assertTrue(MysqlxNotice.ServerHello.getDefaultInstance().isInitialized());
  }

  @Test
  public void valueOfTest6() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.GroupReplicationStateChanged.Type.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest3() {
    // Arrange, Act and Assert
    assertEquals(MysqlxNotice.GroupReplicationStateChanged.Type.MEMBERSHIP_QUORUM_LOSS,
        MysqlxNotice.GroupReplicationStateChanged.Type.forNumber(1));
  }

  @Test
  public void valueOfTest5() {
    // Arrange, Act and Assert
    assertEquals(MysqlxNotice.GroupReplicationStateChanged.Type.MEMBERSHIP_QUORUM_LOSS,
        MysqlxNotice.GroupReplicationStateChanged.Type.valueOf(1));
  }

  @Test
  public void getNumberTest3() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxNotice.GroupReplicationStateChanged.Type.MEMBERSHIP_QUORUM_LOSS.getNumber());
  }

  @Test
  public void toBuilderTest2() {
    // Arrange and Act
    MysqlxNotice.GroupReplicationStateChanged.Builder actualToBuilderResult = MysqlxNotice.GroupReplicationStateChanged
        .getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getViewId());
  }

  @Test
  public void newBuilderTest4() {
    // Arrange and Act
    MysqlxNotice.GroupReplicationStateChanged.Builder actualNewBuilderResult = MysqlxNotice.GroupReplicationStateChanged
        .newBuilder(MysqlxNotice.GroupReplicationStateChanged.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getViewId());
  }

  @Test
  public void newBuilderTest3() {
    // Arrange and Act
    MysqlxNotice.GroupReplicationStateChanged.Builder actualNewBuilderResult = MysqlxNotice.GroupReplicationStateChanged
        .newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getViewId());
  }

  @Test
  public void newBuilderForTypeTest2() {
    // Arrange and Act
    MysqlxNotice.GroupReplicationStateChanged.Builder actualNewBuilderForTypeResult = MysqlxNotice.GroupReplicationStateChanged
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getViewId());
  }

  @Test
  public void parseFromTest16() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.GroupReplicationStateChanged.parseFrom((CodedInputStream) null,
        ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest15() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.GroupReplicationStateChanged.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.GroupReplicationStateChanged.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.GroupReplicationStateChanged.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest14() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.GroupReplicationStateChanged.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest13() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.GroupReplicationStateChanged.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest12() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.GroupReplicationStateChanged.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest11() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.GroupReplicationStateChanged.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest10() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.GroupReplicationStateChanged.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest9() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.GroupReplicationStateChanged.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(1522780437, MysqlxNotice.GroupReplicationStateChanged.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.GroupReplicationStateChanged.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxNotice.GroupReplicationStateChanged.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.GroupReplicationStateChanged.getDefaultInstance().isInitialized());
  }

  @Test
  public void getViewIdTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxNotice.GroupReplicationStateChanged.getDefaultInstance().getViewId());
  }

  @Test
  public void hasViewIdTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.GroupReplicationStateChanged.getDefaultInstance().hasViewId());
  }

  @Test
  public void getTypeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxNotice.GroupReplicationStateChanged.getDefaultInstance().getType());
  }

  @Test
  public void hasTypeTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.GroupReplicationStateChanged.getDefaultInstance().hasType());
  }

  @Test
  public void valueOfTest4() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.Frame.Type.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(MysqlxNotice.Frame.Type.WARNING, MysqlxNotice.Frame.Type.forNumber(1));
  }

  @Test
  public void valueOfTest3() {
    // Arrange, Act and Assert
    assertEquals(MysqlxNotice.Frame.Type.WARNING, MysqlxNotice.Frame.Type.valueOf(1));
  }

  @Test
  public void getNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxNotice.Frame.Type.WARNING.getNumber());
  }

  @Test
  public void valueOfTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.Frame.Scope.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxNotice.Frame.Scope.GLOBAL, MysqlxNotice.Frame.Scope.forNumber(1));
  }

  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxNotice.Frame.Scope.GLOBAL, MysqlxNotice.Frame.Scope.valueOf(1));
  }

  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxNotice.Frame.Scope.GLOBAL.getNumber());
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    MysqlxNotice.Frame.Builder actualToBuilderResult = MysqlxNotice.Frame.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxNotice.Frame.Scope.GLOBAL, actualToBuilderResult.getScope());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    MysqlxNotice.Frame.Builder actualNewBuilderResult = MysqlxNotice.Frame
        .newBuilder(MysqlxNotice.Frame.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxNotice.Frame.Scope.GLOBAL, actualNewBuilderResult.getScope());
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    MysqlxNotice.Frame.Builder actualNewBuilderResult = MysqlxNotice.Frame.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxNotice.Frame.Scope.GLOBAL, actualNewBuilderResult.getScope());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    MysqlxNotice.Frame.Builder actualNewBuilderForTypeResult = MysqlxNotice.Frame.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxNotice.Frame.Scope.GLOBAL, actualNewBuilderForTypeResult.getScope());
  }

  @Test
  public void parseFromTest8() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.Frame.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.Frame.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.Frame.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.Frame.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.Frame.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.Frame.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest4() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.Frame.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxNotice.Frame.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.Frame.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxNotice.Frame.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-653680360, MysqlxNotice.Frame.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.Frame.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxNotice.Frame.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.Frame.getDefaultInstance().isInitialized());
  }

  @Test
  public void hasPayloadTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.Frame.getDefaultInstance().hasPayload());
  }

  @Test
  public void getScopeTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxNotice.Frame.Scope.GLOBAL, MysqlxNotice.Frame.getDefaultInstance().getScope());
  }

  @Test
  public void hasScopeTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.Frame.getDefaultInstance().hasScope());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxNotice.Frame.getDefaultInstance().getType());
  }

  @Test
  public void hasTypeTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxNotice.Frame.getDefaultInstance().hasType());
  }
}
