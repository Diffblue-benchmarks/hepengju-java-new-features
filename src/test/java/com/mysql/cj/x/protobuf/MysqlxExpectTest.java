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

public class MysqlxExpectTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void valueOfTest6() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpect.Open.CtxOperation.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest3() {
    // Arrange, Act and Assert
    assertEquals(MysqlxExpect.Open.CtxOperation.EXPECT_CTX_EMPTY, MysqlxExpect.Open.CtxOperation.forNumber(1));
  }

  @Test
  public void valueOfTest5() {
    // Arrange, Act and Assert
    assertEquals(MysqlxExpect.Open.CtxOperation.EXPECT_CTX_EMPTY, MysqlxExpect.Open.CtxOperation.valueOf(1));
  }

  @Test
  public void getNumberTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpect.Open.CtxOperation.EXPECT_CTX_COPY_PREV.getNumber());
  }

  @Test
  public void valueOfTest4() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpect.Open.Condition.Key.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(MysqlxExpect.Open.Condition.Key.EXPECT_NO_ERROR, MysqlxExpect.Open.Condition.Key.forNumber(1));
  }

  @Test
  public void valueOfTest3() {
    // Arrange, Act and Assert
    assertEquals(MysqlxExpect.Open.Condition.Key.EXPECT_NO_ERROR, MysqlxExpect.Open.Condition.Key.valueOf(1));
  }

  @Test
  public void getNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxExpect.Open.Condition.Key.EXPECT_NO_ERROR.getNumber());
  }

  @Test
  public void valueOfTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpect.Open.Condition.ConditionOperation.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxExpect.Open.Condition.ConditionOperation.EXPECT_OP_UNSET,
        MysqlxExpect.Open.Condition.ConditionOperation.forNumber(1));
  }

  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxExpect.Open.Condition.ConditionOperation.EXPECT_OP_UNSET,
        MysqlxExpect.Open.Condition.ConditionOperation.valueOf(1));
  }

  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpect.Open.Condition.ConditionOperation.EXPECT_OP_SET.getNumber());
  }

  @Test
  public void toBuilderTest3() {
    // Arrange and Act
    MysqlxExpect.Open.Condition.Builder actualToBuilderResult = MysqlxExpect.Open.Condition.getDefaultInstance()
        .toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxExpect.Open.Condition.ConditionOperation.EXPECT_OP_SET, actualToBuilderResult.getOp());
  }

  @Test
  public void newBuilderTest6() {
    // Arrange and Act
    MysqlxExpect.Open.Condition.Builder actualNewBuilderResult = MysqlxExpect.Open.Condition
        .newBuilder(MysqlxExpect.Open.Condition.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxExpect.Open.Condition.ConditionOperation.EXPECT_OP_SET, actualNewBuilderResult.getOp());
  }

  @Test
  public void newBuilderTest5() {
    // Arrange and Act
    MysqlxExpect.Open.Condition.Builder actualNewBuilderResult = MysqlxExpect.Open.Condition.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxExpect.Open.Condition.ConditionOperation.EXPECT_OP_SET, actualNewBuilderResult.getOp());
  }

  @Test
  public void newBuilderForTypeTest3() {
    // Arrange and Act
    MysqlxExpect.Open.Condition.Builder actualNewBuilderForTypeResult = MysqlxExpect.Open.Condition.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxExpect.Open.Condition.ConditionOperation.EXPECT_OP_SET, actualNewBuilderForTypeResult.getOp());
  }

  @Test
  public void parseFromTest24() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpect.Open.Condition.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest23() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpect.Open.Condition.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpect.Open.Condition.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpect.Open.Condition.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest22() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpect.Open.Condition.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest21() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpect.Open.Condition.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest20() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpect.Open.Condition.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest19() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpect.Open.Condition.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest18() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpect.Open.Condition.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest17() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpect.Open.Condition.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(776005829, MysqlxExpect.Open.Condition.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpect.Open.Condition.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpect.Open.Condition.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpect.Open.Condition.getDefaultInstance().isInitialized());
  }

  @Test
  public void getOpTest2() {
    // Arrange, Act and Assert
    assertEquals(MysqlxExpect.Open.Condition.ConditionOperation.EXPECT_OP_SET,
        MysqlxExpect.Open.Condition.getDefaultInstance().getOp());
  }

  @Test
  public void hasOpTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpect.Open.Condition.getDefaultInstance().hasOp());
  }

  @Test
  public void hasConditionValueTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpect.Open.Condition.getDefaultInstance().hasConditionValue());
  }

  @Test
  public void getConditionKeyTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpect.Open.Condition.getDefaultInstance().getConditionKey());
  }

  @Test
  public void hasConditionKeyTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpect.Open.Condition.getDefaultInstance().hasConditionKey());
  }

  @Test
  public void toBuilderTest2() {
    // Arrange and Act
    MysqlxExpect.Open.Builder actualToBuilderResult = MysqlxExpect.Open.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    MysqlxExpect.Open.CtxOperation actualOp = actualToBuilderResult.getOp();
    assertEquals("", actualToStringResult);
    assertTrue(actualToBuilderResult.isInitialized());
    assertEquals(MysqlxExpect.Open.CtxOperation.EXPECT_CTX_COPY_PREV, actualOp);
  }

  @Test
  public void newBuilderTest4() {
    // Arrange and Act
    MysqlxExpect.Open.Builder actualNewBuilderResult = MysqlxExpect.Open
        .newBuilder(MysqlxExpect.Open.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxExpect.Open.CtxOperation actualOp = actualNewBuilderResult.getOp();
    assertEquals("", actualToStringResult);
    assertTrue(actualNewBuilderResult.isInitialized());
    assertEquals(MysqlxExpect.Open.CtxOperation.EXPECT_CTX_COPY_PREV, actualOp);
  }

  @Test
  public void newBuilderTest3() {
    // Arrange and Act
    MysqlxExpect.Open.Builder actualNewBuilderResult = MysqlxExpect.Open.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxExpect.Open.CtxOperation actualOp = actualNewBuilderResult.getOp();
    assertEquals("", actualToStringResult);
    assertTrue(actualNewBuilderResult.isInitialized());
    assertEquals(MysqlxExpect.Open.CtxOperation.EXPECT_CTX_COPY_PREV, actualOp);
  }

  @Test
  public void newBuilderForTypeTest2() {
    // Arrange and Act
    MysqlxExpect.Open.Builder actualNewBuilderForTypeResult = MysqlxExpect.Open.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    MysqlxExpect.Open.CtxOperation actualOp = actualNewBuilderForTypeResult.getOp();
    assertEquals("", actualToStringResult);
    assertTrue(actualNewBuilderForTypeResult.isInitialized());
    assertEquals(MysqlxExpect.Open.CtxOperation.EXPECT_CTX_COPY_PREV, actualOp);
  }

  @Test
  public void parseFromTest16() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpect.Open.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest15() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpect.Open.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxExpect.Open actualParseDelimitedFromResult = MysqlxExpect.Open.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    MysqlxExpect.Open.CtxOperation actualOp = actualParseDelimitedFromResult.getOp();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualParseDelimitedFromResult.getCondCount());
    assertTrue(actualIsInitializedResult);
    assertEquals(MysqlxExpect.Open.CtxOperation.EXPECT_CTX_COPY_PREV, actualOp);
    assertEquals(0, actualSerializedSize);
  }

  @Test
  public void parseDelimitedFromTest3() throws IOException {
    // Arrange and Act
    MysqlxExpect.Open actualParseDelimitedFromResult = MysqlxExpect.Open
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    MysqlxExpect.Open.CtxOperation actualOp = actualParseDelimitedFromResult.getOp();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualParseDelimitedFromResult.getCondCount());
    assertTrue(actualIsInitializedResult);
    assertEquals(MysqlxExpect.Open.CtxOperation.EXPECT_CTX_COPY_PREV, actualOp);
    assertEquals(0, actualSerializedSize);
  }

  @Test
  public void parseFromTest14() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpect.Open.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest13() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpect.Open.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest12() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpect.Open.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest11() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpect.Open.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest10() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpect.Open.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest9() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpect.Open.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(-983887053, MysqlxExpect.Open.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpect.Open.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpect.Open.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest2() {
    // Arrange, Act and Assert
    assertTrue(MysqlxExpect.Open.getDefaultInstance().isInitialized());
  }

  @Test
  public void getCondOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxExpect.Open.getDefaultInstance().getCondOrBuilder(1);
  }

  @Test
  public void getCondTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxExpect.Open.getDefaultInstance().getCond(1);
  }

  @Test
  public void getCondCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpect.Open.getDefaultInstance().getCondCount());
  }

  @Test
  public void getCondOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpect.Open.getDefaultInstance().getCondOrBuilderList().size());
  }

  @Test
  public void getCondListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpect.Open.getDefaultInstance().getCondList().size());
  }

  @Test
  public void getOpTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxExpect.Open.CtxOperation.EXPECT_CTX_COPY_PREV, MysqlxExpect.Open.getDefaultInstance().getOp());
  }

  @Test
  public void hasOpTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpect.Open.getDefaultInstance().hasOp());
  }

  @Test
  public void toBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpect.Close.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpect.Close.newBuilder(MysqlxExpect.Close.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpect.Close.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxExpect.Close.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest8() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpect.Close.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpect.Close.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxExpect.Close actualParseDelimitedFromResult = MysqlxExpect.Close.parseDelimitedFrom(input,
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
    MysqlxExpect.Close actualParseDelimitedFromResult = MysqlxExpect.Close
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
    MysqlxExpect.Close.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpect.Close.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest4() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpect.Close.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxExpect.Close.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpect.Close.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxExpect.Close.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1458887370, MysqlxExpect.Close.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxExpect.Close.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxExpect.Close.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxExpect.Close.getDefaultInstance().isInitialized());
  }
}
