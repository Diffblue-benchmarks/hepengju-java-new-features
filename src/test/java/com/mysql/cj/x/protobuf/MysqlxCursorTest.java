package com.mysql.cj.x.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysqlxCursorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void valueOfTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Open.OneOfMessage.Type.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertNull(MysqlxCursor.Open.OneOfMessage.Type.forNumber(1));
  }

  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertNull(MysqlxCursor.Open.OneOfMessage.Type.valueOf(1));
  }

  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCursor.Open.OneOfMessage.Type.PREPARE_EXECUTE.getNumber());
  }

  @Test
  public void toBuilderTest4() {
    // Arrange and Act
    MysqlxCursor.Open.OneOfMessage.Builder actualToBuilderResult = MysqlxCursor.Open.OneOfMessage.getDefaultInstance()
        .toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    MysqlxPrepare.Execute.Builder actualPrepareExecuteBuilder = actualToBuilderResult.getPrepareExecuteBuilder();
    MysqlxCursor.Open.OneOfMessage.Type actualType = actualToBuilderResult.getType();
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxCursor.Open.OneOfMessage.Type.PREPARE_EXECUTE, actualType);
    assertSame(actualToBuilderResult.getPrepareExecuteOrBuilder(), actualPrepareExecuteBuilder);
  }

  @Test
  public void newBuilderTest8() {
    // Arrange and Act
    MysqlxCursor.Open.OneOfMessage.Builder actualNewBuilderResult = MysqlxCursor.Open.OneOfMessage
        .newBuilder(MysqlxCursor.Open.OneOfMessage.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxPrepare.Execute.Builder actualPrepareExecuteBuilder = actualNewBuilderResult.getPrepareExecuteBuilder();
    MysqlxCursor.Open.OneOfMessage.Type actualType = actualNewBuilderResult.getType();
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxCursor.Open.OneOfMessage.Type.PREPARE_EXECUTE, actualType);
    assertSame(actualNewBuilderResult.getPrepareExecuteOrBuilder(), actualPrepareExecuteBuilder);
  }

  @Test
  public void newBuilderTest7() {
    // Arrange and Act
    MysqlxCursor.Open.OneOfMessage.Builder actualNewBuilderResult = MysqlxCursor.Open.OneOfMessage.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxPrepare.Execute.Builder actualPrepareExecuteBuilder = actualNewBuilderResult.getPrepareExecuteBuilder();
    MysqlxCursor.Open.OneOfMessage.Type actualType = actualNewBuilderResult.getType();
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxCursor.Open.OneOfMessage.Type.PREPARE_EXECUTE, actualType);
    assertSame(actualNewBuilderResult.getPrepareExecuteOrBuilder(), actualPrepareExecuteBuilder);
  }

  @Test
  public void newBuilderForTypeTest4() {
    // Arrange and Act
    MysqlxCursor.Open.OneOfMessage.Builder actualNewBuilderForTypeResult = MysqlxCursor.Open.OneOfMessage
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    MysqlxPrepare.Execute.Builder actualPrepareExecuteBuilder = actualNewBuilderForTypeResult
        .getPrepareExecuteBuilder();
    MysqlxCursor.Open.OneOfMessage.Type actualType = actualNewBuilderForTypeResult.getType();
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxCursor.Open.OneOfMessage.Type.PREPARE_EXECUTE, actualType);
    assertSame(actualNewBuilderForTypeResult.getPrepareExecuteOrBuilder(), actualPrepareExecuteBuilder);
  }

  @Test
  public void parseFromTest32() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Open.OneOfMessage.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest31() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Open.OneOfMessage.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest8() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Open.OneOfMessage.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Open.OneOfMessage.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest30() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Open.OneOfMessage.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest29() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Open.OneOfMessage.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest28() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Open.OneOfMessage.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest27() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Open.OneOfMessage.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest26() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Open.OneOfMessage.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest25() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Open.OneOfMessage.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest4() {
    // Arrange, Act and Assert
    assertEquals(-464823512, MysqlxCursor.Open.OneOfMessage.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCursor.Open.OneOfMessage.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest4() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCursor.Open.OneOfMessage.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCursor.Open.OneOfMessage.getDefaultInstance().isInitialized());
  }

  @Test
  public void getPrepareExecuteOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCursor.Open.OneOfMessage.getDefaultInstance()
        .getPrepareExecuteOrBuilder() instanceof MysqlxPrepare.Execute);
  }

  @Test
  public void hasPrepareExecuteTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCursor.Open.OneOfMessage.getDefaultInstance().hasPrepareExecute());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCursor.Open.OneOfMessage.Type.PREPARE_EXECUTE,
        MysqlxCursor.Open.OneOfMessage.getDefaultInstance().getType());
  }

  @Test
  public void hasTypeTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCursor.Open.OneOfMessage.getDefaultInstance().hasType());
  }

  @Test
  public void toBuilderTest3() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCursor.Open.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest6() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCursor.Open.newBuilder(MysqlxCursor.Open.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest5() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCursor.Open.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest3() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCursor.Open.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest24() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Open.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest23() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Open.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Open.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Open.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest22() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Open.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest21() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Open.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest20() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Open.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest19() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Open.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest18() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Open.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest17() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Open.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(-1316667276, MysqlxCursor.Open.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCursor.Open.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCursor.Open.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCursor.Open.getDefaultInstance().isInitialized());
  }

  @Test
  public void getFetchRowsTest2() {
    // Arrange, Act and Assert
    assertEquals(0L, MysqlxCursor.Open.getDefaultInstance().getFetchRows());
  }

  @Test
  public void hasFetchRowsTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCursor.Open.getDefaultInstance().hasFetchRows());
  }

  @Test
  public void getStmtOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCursor.Open.getDefaultInstance().getStmtOrBuilder() instanceof MysqlxCursor.Open.OneOfMessage);
  }

  @Test
  public void hasStmtTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCursor.Open.getDefaultInstance().hasStmt());
  }

  @Test
  public void getCursorIdTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCursor.Open.getDefaultInstance().getCursorId());
  }

  @Test
  public void hasCursorIdTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCursor.Open.getDefaultInstance().hasCursorId());
  }

  @Test
  public void toBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCursor.Fetch.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest4() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCursor.Fetch.newBuilder(MysqlxCursor.Fetch.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest3() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCursor.Fetch.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCursor.Fetch.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest16() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Fetch.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest15() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Fetch.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Fetch.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Fetch.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest14() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Fetch.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest13() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Fetch.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest12() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Fetch.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest11() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Fetch.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest10() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Fetch.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest9() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Fetch.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(950060674, MysqlxCursor.Fetch.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCursor.Fetch.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCursor.Fetch.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCursor.Fetch.getDefaultInstance().isInitialized());
  }

  @Test
  public void getFetchRowsTest() {
    // Arrange, Act and Assert
    assertEquals(0L, MysqlxCursor.Fetch.getDefaultInstance().getFetchRows());
  }

  @Test
  public void hasFetchRowsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCursor.Fetch.getDefaultInstance().hasFetchRows());
  }

  @Test
  public void getCursorIdTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCursor.Fetch.getDefaultInstance().getCursorId());
  }

  @Test
  public void hasCursorIdTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCursor.Fetch.getDefaultInstance().hasCursorId());
  }

  @Test
  public void toBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCursor.Close.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCursor.Close.newBuilder(MysqlxCursor.Close.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCursor.Close.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCursor.Close.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest8() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Close.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Close.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Close.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Close.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Close.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Close.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest4() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Close.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCursor.Close.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Close.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCursor.Close.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1953661858, MysqlxCursor.Close.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCursor.Close.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCursor.Close.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCursor.Close.getDefaultInstance().isInitialized());
  }

  @Test
  public void getCursorIdTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCursor.Close.getDefaultInstance().getCursorId());
  }

  @Test
  public void hasCursorIdTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCursor.Close.getDefaultInstance().hasCursorId());
  }
}
