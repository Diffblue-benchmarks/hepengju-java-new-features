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

public class MysqlxPrepareTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void valueOfTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Prepare.OneOfMessage.Type.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxPrepare.Prepare.OneOfMessage.Type.INSERT, MysqlxPrepare.Prepare.OneOfMessage.Type.forNumber(1));
  }

  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxPrepare.Prepare.OneOfMessage.Type.INSERT, MysqlxPrepare.Prepare.OneOfMessage.Type.valueOf(1));
  }

  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxPrepare.Prepare.OneOfMessage.Type.FIND.getNumber());
  }

  @Test
  public void parseFromTest32() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Prepare.OneOfMessage.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest31() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Prepare.OneOfMessage.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest8() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Prepare.OneOfMessage.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Prepare.OneOfMessage.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest30() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Prepare.OneOfMessage.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest29() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Prepare.OneOfMessage.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest28() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Prepare.OneOfMessage.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest27() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Prepare.OneOfMessage.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest26() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Prepare.OneOfMessage.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest25() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Prepare.OneOfMessage.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest4() {
    // Arrange, Act and Assert
    assertEquals(690446845, MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest4() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance().isInitialized());
  }

  @Test
  public void getStmtExecuteOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance()
        .getStmtExecuteOrBuilder() instanceof MysqlxSql.StmtExecute);
  }

  @Test
  public void hasStmtExecuteTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance().hasStmtExecute());
  }

  @Test
  public void getDeleteOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(
        MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance().getDeleteOrBuilder() instanceof MysqlxCrud.Delete);
  }

  @Test
  public void hasDeleteTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance().hasDelete());
  }

  @Test
  public void getUpdateOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(
        MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance().getUpdateOrBuilder() instanceof MysqlxCrud.Update);
  }

  @Test
  public void hasUpdateTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance().hasUpdate());
  }

  @Test
  public void getInsertOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(
        MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance().getInsertOrBuilder() instanceof MysqlxCrud.Insert);
  }

  @Test
  public void hasInsertTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance().hasInsert());
  }

  @Test
  public void getFindOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance().getFindOrBuilder() instanceof MysqlxCrud.Find);
  }

  @Test
  public void hasFindTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance().hasFind());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxPrepare.Prepare.OneOfMessage.Type.FIND,
        MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance().getType());
  }

  @Test
  public void hasTypeTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance().hasType());
  }

  @Test
  public void toBuilderTest3() {
    // Arrange and Act
    MysqlxPrepare.Prepare.Builder actualToBuilderResult = MysqlxPrepare.Prepare.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    MysqlxPrepare.Prepare.OneOfMessageOrBuilder actualStmtOrBuilder = actualToBuilderResult.getStmtOrBuilder();
    assertEquals("", actualToStringResult);
    assertSame(actualToBuilderResult.getStmt(), actualStmtOrBuilder);
  }

  @Test
  public void newBuilderTest6() {
    // Arrange and Act
    MysqlxPrepare.Prepare.Builder actualNewBuilderResult = MysqlxPrepare.Prepare
        .newBuilder(MysqlxPrepare.Prepare.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxPrepare.Prepare.OneOfMessageOrBuilder actualStmtOrBuilder = actualNewBuilderResult.getStmtOrBuilder();
    assertEquals("", actualToStringResult);
    assertSame(actualNewBuilderResult.getStmt(), actualStmtOrBuilder);
  }

  @Test
  public void newBuilderTest5() {
    // Arrange and Act
    MysqlxPrepare.Prepare.Builder actualNewBuilderResult = MysqlxPrepare.Prepare.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxPrepare.Prepare.OneOfMessageOrBuilder actualStmtOrBuilder = actualNewBuilderResult.getStmtOrBuilder();
    assertEquals("", actualToStringResult);
    assertSame(actualNewBuilderResult.getStmt(), actualStmtOrBuilder);
  }

  @Test
  public void newBuilderForTypeTest3() {
    // Arrange and Act
    MysqlxPrepare.Prepare.Builder actualNewBuilderForTypeResult = MysqlxPrepare.Prepare.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    MysqlxPrepare.Prepare.OneOfMessageOrBuilder actualStmtOrBuilder = actualNewBuilderForTypeResult.getStmtOrBuilder();
    assertEquals("", actualToStringResult);
    assertSame(actualNewBuilderForTypeResult.getStmt(), actualStmtOrBuilder);
  }

  @Test
  public void parseFromTest24() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Prepare.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest23() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Prepare.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Prepare.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Prepare.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest22() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Prepare.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest21() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Prepare.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest20() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Prepare.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest19() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Prepare.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest18() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Prepare.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest17() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Prepare.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(1389599826, MysqlxPrepare.Prepare.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Prepare.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxPrepare.Prepare.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Prepare.getDefaultInstance().isInitialized());
  }

  @Test
  public void getStmtOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(
        MysqlxPrepare.Prepare.getDefaultInstance().getStmtOrBuilder() instanceof MysqlxPrepare.Prepare.OneOfMessage);
  }

  @Test
  public void hasStmtTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Prepare.getDefaultInstance().hasStmt());
  }

  @Test
  public void getStmtIdTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxPrepare.Prepare.getDefaultInstance().getStmtId());
  }

  @Test
  public void hasStmtIdTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Prepare.getDefaultInstance().hasStmtId());
  }

  @Test
  public void toBuilderTest2() {
    // Arrange and Act
    MysqlxPrepare.Execute.Builder actualToBuilderResult = MysqlxPrepare.Execute.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualToBuilderResult.getArgsCount());
  }

  @Test
  public void newBuilderTest4() {
    // Arrange and Act
    MysqlxPrepare.Execute.Builder actualNewBuilderResult = MysqlxPrepare.Execute
        .newBuilder(MysqlxPrepare.Execute.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getArgsCount());
  }

  @Test
  public void newBuilderTest3() {
    // Arrange and Act
    MysqlxPrepare.Execute.Builder actualNewBuilderResult = MysqlxPrepare.Execute.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getArgsCount());
  }

  @Test
  public void newBuilderForTypeTest2() {
    // Arrange and Act
    MysqlxPrepare.Execute.Builder actualNewBuilderForTypeResult = MysqlxPrepare.Execute.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderForTypeResult.getArgsCount());
  }

  @Test
  public void parseFromTest16() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Execute.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest15() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Execute.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Execute.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Execute.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest14() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Execute.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest13() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Execute.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest12() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Execute.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest11() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Execute.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest10() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Execute.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest9() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Execute.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(-215409814, MysqlxPrepare.Execute.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Execute.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxPrepare.Execute.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Execute.getDefaultInstance().isInitialized());
  }

  @Test
  public void getCompactMetadataTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Execute.getDefaultInstance().getCompactMetadata());
  }

  @Test
  public void hasCompactMetadataTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Execute.getDefaultInstance().hasCompactMetadata());
  }

  @Test
  public void getArgsOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxPrepare.Execute.getDefaultInstance().getArgsOrBuilder(1);
  }

  @Test
  public void getArgsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxPrepare.Execute.getDefaultInstance().getArgs(1);
  }

  @Test
  public void getArgsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxPrepare.Execute.getDefaultInstance().getArgsCount());
  }

  @Test
  public void getArgsOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxPrepare.Execute.getDefaultInstance().getArgsOrBuilderList().size());
  }

  @Test
  public void getArgsListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxPrepare.Execute.getDefaultInstance().getArgsList().size());
  }

  @Test
  public void getStmtIdTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxPrepare.Execute.getDefaultInstance().getStmtId());
  }

  @Test
  public void hasStmtIdTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Execute.getDefaultInstance().hasStmtId());
  }

  @Test
  public void toBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxPrepare.Deallocate.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxPrepare.Deallocate.newBuilder(MysqlxPrepare.Deallocate.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxPrepare.Deallocate.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxPrepare.Deallocate.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest8() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Deallocate.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Deallocate.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Deallocate.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Deallocate.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Deallocate.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Deallocate.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest4() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Deallocate.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxPrepare.Deallocate.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Deallocate.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxPrepare.Deallocate.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1602398481, MysqlxPrepare.Deallocate.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Deallocate.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxPrepare.Deallocate.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Deallocate.getDefaultInstance().isInitialized());
  }

  @Test
  public void getStmtIdTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxPrepare.Deallocate.getDefaultInstance().getStmtId());
  }

  @Test
  public void hasStmtIdTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxPrepare.Deallocate.getDefaultInstance().hasStmtId());
  }
}
