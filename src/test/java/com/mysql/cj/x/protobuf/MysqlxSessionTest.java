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
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysqlxSessionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest5() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSession.Reset.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest10() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSession.Reset.newBuilder(MysqlxSession.Reset.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest9() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSession.Reset.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest5() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSession.Reset.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest40() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.Reset.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest39() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.Reset.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest10() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxSession.Reset actualParseDelimitedFromResult = MysqlxSession.Reset.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    boolean actualKeepOpen = actualParseDelimitedFromResult.getKeepOpen();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertFalse(actualKeepOpen);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseDelimitedFromTest9() throws IOException {
    // Arrange and Act
    MysqlxSession.Reset actualParseDelimitedFromResult = MysqlxSession.Reset
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    boolean actualKeepOpen = actualParseDelimitedFromResult.getKeepOpen();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertFalse(actualKeepOpen);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseFromTest38() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.Reset.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest37() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.Reset.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest36() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.Reset.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest35() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.Reset.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest34() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.Reset.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest33() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.Reset.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest5() {
    // Arrange, Act and Assert
    assertEquals(-603684338, MysqlxSession.Reset.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest5() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSession.Reset.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest5() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxSession.Reset.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest5() {
    // Arrange, Act and Assert
    assertTrue(MysqlxSession.Reset.getDefaultInstance().isInitialized());
  }

  @Test
  public void getKeepOpenTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSession.Reset.getDefaultInstance().getKeepOpen());
  }

  @Test
  public void hasKeepOpenTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSession.Reset.getDefaultInstance().hasKeepOpen());
  }

  @Test
  public void toBuilderTest4() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSession.Close.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest8() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSession.Close.newBuilder(MysqlxSession.Close.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest7() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSession.Close.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest4() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSession.Close.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest32() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.Close.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest31() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.Close.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest8() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxSession.Close actualParseDelimitedFromResult = MysqlxSession.Close.parseDelimitedFrom(input,
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
    MysqlxSession.Close actualParseDelimitedFromResult = MysqlxSession.Close
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
    MysqlxSession.Close.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest29() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.Close.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest28() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.Close.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest27() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.Close.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest26() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.Close.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest25() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.Close.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest4() {
    // Arrange, Act and Assert
    assertEquals(-1425151791, MysqlxSession.Close.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSession.Close.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest4() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxSession.Close.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest4() {
    // Arrange, Act and Assert
    assertTrue(MysqlxSession.Close.getDefaultInstance().isInitialized());
  }

  @Test
  public void toBuilderTest3() {
    // Arrange and Act
    MysqlxSession.AuthenticateStart.Builder actualToBuilderResult = MysqlxSession.AuthenticateStart.getDefaultInstance()
        .toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getMechName());
  }

  @Test
  public void newBuilderTest6() {
    // Arrange and Act
    MysqlxSession.AuthenticateStart.Builder actualNewBuilderResult = MysqlxSession.AuthenticateStart
        .newBuilder(MysqlxSession.AuthenticateStart.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getMechName());
  }

  @Test
  public void newBuilderTest5() {
    // Arrange and Act
    MysqlxSession.AuthenticateStart.Builder actualNewBuilderResult = MysqlxSession.AuthenticateStart.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getMechName());
  }

  @Test
  public void newBuilderForTypeTest3() {
    // Arrange and Act
    MysqlxSession.AuthenticateStart.Builder actualNewBuilderForTypeResult = MysqlxSession.AuthenticateStart
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getMechName());
  }

  @Test
  public void parseFromTest24() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.AuthenticateStart.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest23() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.AuthenticateStart.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.AuthenticateStart.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.AuthenticateStart.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest22() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.AuthenticateStart.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest21() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.AuthenticateStart.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest20() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.AuthenticateStart.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest19() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.AuthenticateStart.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest18() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.AuthenticateStart.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest17() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.AuthenticateStart.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(2066872295, MysqlxSession.AuthenticateStart.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSession.AuthenticateStart.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxSession.AuthenticateStart.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSession.AuthenticateStart.getDefaultInstance().isInitialized());
  }

  @Test
  public void hasInitialResponseTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSession.AuthenticateStart.getDefaultInstance().hasInitialResponse());
  }

  @Test
  public void hasAuthDataTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSession.AuthenticateStart.getDefaultInstance().hasAuthData());
  }

  @Test
  public void getMechNameTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSession.AuthenticateStart.getDefaultInstance().getMechName());
  }

  @Test
  public void hasMechNameTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSession.AuthenticateStart.getDefaultInstance().hasMechName());
  }

  @Test
  public void toBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSession.AuthenticateOk.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest4() {
    // Arrange, Act and Assert
    assertEquals("",
        MysqlxSession.AuthenticateOk.newBuilder(MysqlxSession.AuthenticateOk.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest3() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSession.AuthenticateOk.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSession.AuthenticateOk.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest16() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.AuthenticateOk.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest15() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.AuthenticateOk.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxSession.AuthenticateOk actualParseDelimitedFromResult = MysqlxSession.AuthenticateOk.parseDelimitedFrom(input,
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
    MysqlxSession.AuthenticateOk actualParseDelimitedFromResult = MysqlxSession.AuthenticateOk
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
    MysqlxSession.AuthenticateOk.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest13() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.AuthenticateOk.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest12() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.AuthenticateOk.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest11() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.AuthenticateOk.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest10() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.AuthenticateOk.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest9() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.AuthenticateOk.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(1600133078, MysqlxSession.AuthenticateOk.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSession.AuthenticateOk.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxSession.AuthenticateOk.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest2() {
    // Arrange, Act and Assert
    assertTrue(MysqlxSession.AuthenticateOk.getDefaultInstance().isInitialized());
  }

  @Test
  public void hasAuthDataTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSession.AuthenticateOk.getDefaultInstance().hasAuthData());
  }

  @Test
  public void toBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSession.AuthenticateContinue.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSession.AuthenticateContinue
        .newBuilder(MysqlxSession.AuthenticateContinue.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSession.AuthenticateContinue.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxSession.AuthenticateContinue.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest8() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.AuthenticateContinue.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.AuthenticateContinue.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.AuthenticateContinue.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.AuthenticateContinue.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.AuthenticateContinue.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.AuthenticateContinue.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest4() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.AuthenticateContinue.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxSession.AuthenticateContinue.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.AuthenticateContinue.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxSession.AuthenticateContinue.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-1948051055, MysqlxSession.AuthenticateContinue.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSession.AuthenticateContinue.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxSession.AuthenticateContinue.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSession.AuthenticateContinue.getDefaultInstance().isInitialized());
  }

  @Test
  public void hasAuthDataTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxSession.AuthenticateContinue.getDefaultInstance().hasAuthData());
  }
}
