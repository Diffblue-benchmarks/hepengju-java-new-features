package com.mysql.cj.x.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysqlxTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void valueOfTest6() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.ServerMessages.Type.valueOf((Descriptors.EnumValueDescriptor) null);
  }
  @Test
  public void forNumberTest3() {
    // Arrange, Act and Assert
    assertEquals(Mysqlx.ServerMessages.Type.ERROR, Mysqlx.ServerMessages.Type.forNumber(1));
  }
  @Test
  public void valueOfTest5() {
    // Arrange, Act and Assert
    assertEquals(Mysqlx.ServerMessages.Type.ERROR, Mysqlx.ServerMessages.Type.valueOf(1));
  }
  @Test
  public void getNumberTest3() {
    // Arrange, Act and Assert
    assertEquals(0, Mysqlx.ServerMessages.Type.OK.getNumber());
  }
  @Test
  public void toBuilderTest4() {
    // Arrange, Act and Assert
    assertEquals("", Mysqlx.ServerMessages.getDefaultInstance().toBuilder().toString());
  }
  @Test
  public void newBuilderTest8() {
    // Arrange, Act and Assert
    assertEquals("", Mysqlx.ServerMessages.newBuilder(Mysqlx.ServerMessages.getDefaultInstance()).toString());
  }
  @Test
  public void newBuilderTest7() {
    // Arrange, Act and Assert
    assertEquals("", Mysqlx.ServerMessages.newBuilder().toString());
  }
  @Test
  public void newBuilderForTypeTest4() {
    // Arrange, Act and Assert
    assertEquals("", Mysqlx.ServerMessages.getDefaultInstance().newBuilderForType().toString());
  }
  @Test
  public void parseFromTest32() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.ServerMessages.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest31() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.ServerMessages.parseFrom((CodedInputStream) null);
  }
  @Test
  public void parseDelimitedFromTest8() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    Mysqlx.ServerMessages actualParseDelimitedFromResult = Mysqlx.ServerMessages.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

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
    Mysqlx.ServerMessages actualParseDelimitedFromResult = Mysqlx.ServerMessages
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
    Mysqlx.ServerMessages.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest29() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.ServerMessages.parseFrom(new ByteArrayInputStream(new byte[24]));
  }
  @Test
  public void parseFromTest28() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.ServerMessages.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest27() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.ServerMessages.parseFrom(new byte[24]);
  }
  @Test
  public void parseFromTest26() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.ServerMessages.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest25() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.ServerMessages.parseFrom((ByteString) null);
  }
  @Test
  public void hashCodeTest4() {
    // Arrange, Act and Assert
    assertEquals(-568564542, Mysqlx.ServerMessages.getDefaultInstance().hashCode());
  }
  @Test
  public void equalsTest4() {
    // Arrange, Act and Assert
    assertFalse(Mysqlx.ServerMessages.getDefaultInstance().equals("aaaaa"));
  }
  @Test
  public void getSerializedSizeTest4() {
    // Arrange, Act and Assert
    assertEquals(0, Mysqlx.ServerMessages.getDefaultInstance().getSerializedSize());
  }
  @Test
  public void isInitializedTest4() {
    // Arrange, Act and Assert
    assertTrue(Mysqlx.ServerMessages.getDefaultInstance().isInitialized());
  }
  @Test
  public void toBuilderTest3() {
    // Arrange and Act
    Mysqlx.Ok.Builder actualToBuilderResult = Mysqlx.Ok.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getMsg());
  }
  @Test
  public void newBuilderTest6() {
    // Arrange and Act
    Mysqlx.Ok.Builder actualNewBuilderResult = Mysqlx.Ok.newBuilder(Mysqlx.Ok.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getMsg());
  }
  @Test
  public void newBuilderTest5() {
    // Arrange and Act
    Mysqlx.Ok.Builder actualNewBuilderResult = Mysqlx.Ok.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getMsg());
  }
  @Test
  public void newBuilderForTypeTest3() {
    // Arrange and Act
    Mysqlx.Ok.Builder actualNewBuilderForTypeResult = Mysqlx.Ok.getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getMsg());
  }
  @Test
  public void parseFromTest24() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.Ok.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest23() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.Ok.parseFrom((CodedInputStream) null);
  }
  @Test
  public void parseDelimitedFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    Mysqlx.Ok actualParseDelimitedFromResult = Mysqlx.Ok.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    String actualMsg = actualParseDelimitedFromResult.getMsg();
    assertEquals("", actualToStringResult);
    assertEquals("", actualMsg);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals(0, actualSerializedSize);
  }
  @Test
  public void parseDelimitedFromTest5() throws IOException {
    // Arrange and Act
    Mysqlx.Ok actualParseDelimitedFromResult = Mysqlx.Ok.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    String actualMsg = actualParseDelimitedFromResult.getMsg();
    assertEquals("", actualToStringResult);
    assertEquals("", actualMsg);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals(0, actualSerializedSize);
  }
  @Test
  public void parseFromTest22() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.Ok.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest21() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.Ok.parseFrom(new ByteArrayInputStream(new byte[24]));
  }
  @Test
  public void parseFromTest20() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.Ok.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest19() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.Ok.parseFrom(new byte[24]);
  }
  @Test
  public void parseFromTest18() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.Ok.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest17() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.Ok.parseFrom((ByteString) null);
  }
  @Test
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(386391873, Mysqlx.Ok.getDefaultInstance().hashCode());
  }
  @Test
  public void equalsTest3() {
    // Arrange, Act and Assert
    assertFalse(Mysqlx.Ok.getDefaultInstance().equals(""));
  }
  @Test
  public void getSerializedSizeTest3() {
    // Arrange, Act and Assert
    assertEquals(0, Mysqlx.Ok.getDefaultInstance().getSerializedSize());
  }
  @Test
  public void isInitializedTest3() {
    // Arrange, Act and Assert
    assertTrue(Mysqlx.Ok.getDefaultInstance().isInitialized());
  }
  @Test
  public void getMsgTest2() {
    // Arrange, Act and Assert
    assertEquals("", Mysqlx.Ok.getDefaultInstance().getMsg());
  }
  @Test
  public void hasMsgTest2() {
    // Arrange, Act and Assert
    assertFalse(Mysqlx.Ok.getDefaultInstance().hasMsg());
  }
  @Test
  public void valueOfTest4() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.Error.Severity.valueOf((Descriptors.EnumValueDescriptor) null);
  }
  @Test
  public void forNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(Mysqlx.Error.Severity.FATAL, Mysqlx.Error.Severity.forNumber(1));
  }
  @Test
  public void valueOfTest3() {
    // Arrange, Act and Assert
    assertEquals(Mysqlx.Error.Severity.FATAL, Mysqlx.Error.Severity.valueOf(1));
  }
  @Test
  public void getNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(0, Mysqlx.Error.Severity.ERROR.getNumber());
  }
  @Test
  public void toBuilderTest2() {
    // Arrange and Act
    Mysqlx.Error.Builder actualToBuilderResult = Mysqlx.Error.getDefaultInstance().toBuilder();

    // Assert
    String actualSqlState = actualToBuilderResult.getSqlState();
    String actualToStringResult = actualToBuilderResult.toString();
    Mysqlx.Error.Severity actualSeverity = actualToBuilderResult.getSeverity();
    assertEquals("", actualSqlState);
    assertEquals(Mysqlx.Error.Severity.ERROR, actualSeverity);
    assertEquals("", actualToBuilderResult.getMsg());
    assertEquals("", actualToStringResult);
  }
  @Test
  public void newBuilderTest4() {
    // Arrange and Act
    Mysqlx.Error.Builder actualNewBuilderResult = Mysqlx.Error.newBuilder(Mysqlx.Error.getDefaultInstance());

    // Assert
    String actualSqlState = actualNewBuilderResult.getSqlState();
    String actualToStringResult = actualNewBuilderResult.toString();
    Mysqlx.Error.Severity actualSeverity = actualNewBuilderResult.getSeverity();
    assertEquals("", actualSqlState);
    assertEquals(Mysqlx.Error.Severity.ERROR, actualSeverity);
    assertEquals("", actualNewBuilderResult.getMsg());
    assertEquals("", actualToStringResult);
  }
  @Test
  public void newBuilderTest3() {
    // Arrange and Act
    Mysqlx.Error.Builder actualNewBuilderResult = Mysqlx.Error.newBuilder();

    // Assert
    String actualSqlState = actualNewBuilderResult.getSqlState();
    String actualToStringResult = actualNewBuilderResult.toString();
    Mysqlx.Error.Severity actualSeverity = actualNewBuilderResult.getSeverity();
    assertEquals("", actualSqlState);
    assertEquals(Mysqlx.Error.Severity.ERROR, actualSeverity);
    assertEquals("", actualNewBuilderResult.getMsg());
    assertEquals("", actualToStringResult);
  }
  @Test
  public void newBuilderForTypeTest2() {
    // Arrange and Act
    Mysqlx.Error.Builder actualNewBuilderForTypeResult = Mysqlx.Error.getDefaultInstance().newBuilderForType();

    // Assert
    String actualSqlState = actualNewBuilderForTypeResult.getSqlState();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    Mysqlx.Error.Severity actualSeverity = actualNewBuilderForTypeResult.getSeverity();
    assertEquals("", actualSqlState);
    assertEquals(Mysqlx.Error.Severity.ERROR, actualSeverity);
    assertEquals("", actualNewBuilderForTypeResult.getMsg());
    assertEquals("", actualToStringResult);
  }
  @Test
  public void parseFromTest16() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.Error.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest15() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.Error.parseFrom((CodedInputStream) null);
  }
  @Test
  public void parseDelimitedFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.Error.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseDelimitedFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.Error.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }
  @Test
  public void parseFromTest14() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.Error.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest13() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.Error.parseFrom(new ByteArrayInputStream(new byte[24]));
  }
  @Test
  public void parseFromTest12() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.Error.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest11() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.Error.parseFrom(new byte[24]);
  }
  @Test
  public void parseFromTest10() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.Error.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest9() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.Error.parseFrom((ByteString) null);
  }
  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(748932831, Mysqlx.Error.getDefaultInstance().hashCode());
  }
  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(Mysqlx.Error.getDefaultInstance().equals(""));
  }
  @Test
  public void getSerializedSizeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, Mysqlx.Error.getDefaultInstance().getSerializedSize());
  }
  @Test
  public void isInitializedTest2() {
    // Arrange, Act and Assert
    assertFalse(Mysqlx.Error.getDefaultInstance().isInitialized());
  }
  @Test
  public void getMsgTest() {
    // Arrange, Act and Assert
    assertEquals("", Mysqlx.Error.getDefaultInstance().getMsg());
  }
  @Test
  public void hasMsgTest() {
    // Arrange, Act and Assert
    assertFalse(Mysqlx.Error.getDefaultInstance().hasMsg());
  }
  @Test
  public void getSqlStateTest() {
    // Arrange, Act and Assert
    assertEquals("", Mysqlx.Error.getDefaultInstance().getSqlState());
  }
  @Test
  public void hasSqlStateTest() {
    // Arrange, Act and Assert
    assertFalse(Mysqlx.Error.getDefaultInstance().hasSqlState());
  }
  @Test
  public void getCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Mysqlx.Error.getDefaultInstance().getCode());
  }
  @Test
  public void hasCodeTest() {
    // Arrange, Act and Assert
    assertFalse(Mysqlx.Error.getDefaultInstance().hasCode());
  }
  @Test
  public void getSeverityTest() {
    // Arrange, Act and Assert
    assertEquals(Mysqlx.Error.Severity.ERROR, Mysqlx.Error.getDefaultInstance().getSeverity());
  }
  @Test
  public void hasSeverityTest() {
    // Arrange, Act and Assert
    assertFalse(Mysqlx.Error.getDefaultInstance().hasSeverity());
  }
  @Test
  public void valueOfTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.ClientMessages.Type.valueOf((Descriptors.EnumValueDescriptor) null);
  }
  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertEquals(Mysqlx.ClientMessages.Type.CON_CAPABILITIES_GET, Mysqlx.ClientMessages.Type.forNumber(1));
  }
  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertEquals(Mysqlx.ClientMessages.Type.CON_CAPABILITIES_GET, Mysqlx.ClientMessages.Type.valueOf(1));
  }
  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(1, Mysqlx.ClientMessages.Type.CON_CAPABILITIES_GET.getNumber());
  }
  @Test
  public void toBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", Mysqlx.ClientMessages.getDefaultInstance().toBuilder().toString());
  }
  @Test
  public void newBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", Mysqlx.ClientMessages.newBuilder(Mysqlx.ClientMessages.getDefaultInstance()).toString());
  }
  @Test
  public void newBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", Mysqlx.ClientMessages.newBuilder().toString());
  }
  @Test
  public void newBuilderForTypeTest() {
    // Arrange, Act and Assert
    assertEquals("", Mysqlx.ClientMessages.getDefaultInstance().newBuilderForType().toString());
  }
  @Test
  public void parseFromTest8() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.ClientMessages.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.ClientMessages.parseFrom((CodedInputStream) null);
  }
  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    Mysqlx.ClientMessages actualParseDelimitedFromResult = Mysqlx.ClientMessages.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }
  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange and Act
    Mysqlx.ClientMessages actualParseDelimitedFromResult = Mysqlx.ClientMessages
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }
  @Test
  public void parseFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.ClientMessages.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.ClientMessages.parseFrom(new ByteArrayInputStream(new byte[24]));
  }
  @Test
  public void parseFromTest4() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.ClientMessages.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest3() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Mysqlx.ClientMessages.parseFrom(new byte[24]);
  }
  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.ClientMessages.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }
  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Mysqlx.ClientMessages.parseFrom((ByteString) null);
  }
  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-469375265, Mysqlx.ClientMessages.getDefaultInstance().hashCode());
  }
  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Mysqlx.ClientMessages.getDefaultInstance().equals("aaaaa"));
  }
  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Mysqlx.ClientMessages.getDefaultInstance().getSerializedSize());
  }
  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Mysqlx.ClientMessages.getDefaultInstance().isInitialized());
  }
  @Test
  public void registerAllExtensionsTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Mysqlx.registerAllExtensions(ExtensionRegistry.getEmptyRegistry());
  }
  @Test
  public void registerAllExtensionsTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Mysqlx.registerAllExtensions(ExtensionRegistryLite.getEmptyRegistry());
  }
}
