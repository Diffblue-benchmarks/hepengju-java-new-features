package com.mysql.cj.x.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysqlxSqlTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSql.StmtExecuteOk.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest4() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSql.StmtExecuteOk.newBuilder(MysqlxSql.StmtExecuteOk.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest3() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSql.StmtExecuteOk.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSql.StmtExecuteOk.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest16() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSql.StmtExecuteOk.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest15() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSql.StmtExecuteOk.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxSql.StmtExecuteOk actualParseDelimitedFromResult = MysqlxSql.StmtExecuteOk.parseDelimitedFrom(input,
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
    MysqlxSql.StmtExecuteOk actualParseDelimitedFromResult = MysqlxSql.StmtExecuteOk
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
    MysqlxSql.StmtExecuteOk.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest13() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSql.StmtExecuteOk.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest12() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSql.StmtExecuteOk.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest11() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSql.StmtExecuteOk.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest10() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSql.StmtExecuteOk.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest9() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSql.StmtExecuteOk.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(-656174953, MysqlxSql.StmtExecuteOk.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSql.StmtExecuteOk.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxSql.StmtExecuteOk.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest2() {
    // Arrange, Act and Assert
    assertTrue(MysqlxSql.StmtExecuteOk.getDefaultInstance().isInitialized());
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    MysqlxSql.StmtExecute.Builder actualToBuilderResult = MysqlxSql.StmtExecute.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    String actualNamespace = actualToBuilderResult.getNamespace();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualToBuilderResult.getArgsCount());
    assertEquals("sql", actualNamespace);
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    MysqlxSql.StmtExecute.Builder actualNewBuilderResult = MysqlxSql.StmtExecute
        .newBuilder(MysqlxSql.StmtExecute.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualNamespace = actualNewBuilderResult.getNamespace();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getArgsCount());
    assertEquals("sql", actualNamespace);
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    MysqlxSql.StmtExecute.Builder actualNewBuilderResult = MysqlxSql.StmtExecute.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualNamespace = actualNewBuilderResult.getNamespace();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getArgsCount());
    assertEquals("sql", actualNamespace);
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    MysqlxSql.StmtExecute.Builder actualNewBuilderForTypeResult = MysqlxSql.StmtExecute.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    String actualNamespace = actualNewBuilderForTypeResult.getNamespace();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderForTypeResult.getArgsCount());
    assertEquals("sql", actualNamespace);
  }

  @Test
  public void parseFromTest8() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSql.StmtExecute.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSql.StmtExecute.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSql.StmtExecute.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSql.StmtExecute.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSql.StmtExecute.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSql.StmtExecute.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest4() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSql.StmtExecute.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSql.StmtExecute.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSql.StmtExecute.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSql.StmtExecute.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-381632807, MysqlxSql.StmtExecute.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSql.StmtExecute.getDefaultInstance().equals("sql"));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxSql.StmtExecute.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSql.StmtExecute.getDefaultInstance().isInitialized());
  }

  @Test
  public void getCompactMetadataTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSql.StmtExecute.getDefaultInstance().getCompactMetadata());
  }

  @Test
  public void hasCompactMetadataTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSql.StmtExecute.getDefaultInstance().hasCompactMetadata());
  }

  @Test
  public void getArgsOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxSql.StmtExecute.getDefaultInstance().getArgsOrBuilder(1);
  }

  @Test
  public void getArgsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxSql.StmtExecute.getDefaultInstance().getArgs(1);
  }

  @Test
  public void getArgsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxSql.StmtExecute.getDefaultInstance().getArgsCount());
  }

  @Test
  public void getArgsOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxSql.StmtExecute.getDefaultInstance().getArgsOrBuilderList().size());
  }

  @Test
  public void getArgsListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxSql.StmtExecute.getDefaultInstance().getArgsList().size());
  }

  @Test
  public void hasStmtTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSql.StmtExecute.getDefaultInstance().hasStmt());
  }

  @Test
  public void getNamespaceTest() {
    // Arrange, Act and Assert
    assertEquals("sql", MysqlxSql.StmtExecute.getDefaultInstance().getNamespace());
  }

  @Test
  public void hasNamespaceTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSql.StmtExecute.getDefaultInstance().hasNamespace());
  }
}
