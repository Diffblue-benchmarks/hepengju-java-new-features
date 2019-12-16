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

public class MysqlxConnectionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest4() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxConnection.Close.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest8() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxConnection.Close.newBuilder(MysqlxConnection.Close.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest7() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxConnection.Close.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest4() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxConnection.Close.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest40() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.Close.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest39() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.Close.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest10() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxConnection.Close actualParseDelimitedFromResult = MysqlxConnection.Close.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseDelimitedFromTest9() throws IOException {
    // Arrange and Act
    MysqlxConnection.Close actualParseDelimitedFromResult = MysqlxConnection.Close
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseFromTest38() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.Close.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest37() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.Close.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest36() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.Close.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest35() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.Close.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest34() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.Close.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest33() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.Close.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest5() {
    // Arrange, Act and Assert
    assertEquals(184805240, MysqlxConnection.Close.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest5() {
    // Arrange, Act and Assert
    assertFalse(MysqlxConnection.Close.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest5() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxConnection.Close.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest5() {
    // Arrange, Act and Assert
    assertTrue(MysqlxConnection.Close.getDefaultInstance().isInitialized());
  }

  @Test
  public void toBuilderTest3() {
    // Arrange and Act
    MysqlxConnection.Capability.Builder actualToBuilderResult = MysqlxConnection.Capability.getDefaultInstance()
        .toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    MysqlxDatatypes.AnyOrBuilder valueOrBuilder = actualToBuilderResult.getValueOrBuilder();
    assertEquals("", actualName);
    assertEquals("", actualToBuilderResult.toString());
    assertTrue(valueOrBuilder instanceof MysqlxDatatypes.Any);
  }

  @Test
  public void newBuilderTest6() {
    // Arrange and Act
    MysqlxConnection.Capability.Builder actualNewBuilderResult = MysqlxConnection.Capability
        .newBuilder(MysqlxConnection.Capability.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    MysqlxDatatypes.AnyOrBuilder valueOrBuilder = actualNewBuilderResult.getValueOrBuilder();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.toString());
    assertTrue(valueOrBuilder instanceof MysqlxDatatypes.Any);
  }

  @Test
  public void newBuilderTest5() {
    // Arrange and Act
    MysqlxConnection.Capability.Builder actualNewBuilderResult = MysqlxConnection.Capability.newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    MysqlxDatatypes.AnyOrBuilder valueOrBuilder = actualNewBuilderResult.getValueOrBuilder();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.toString());
    assertTrue(valueOrBuilder instanceof MysqlxDatatypes.Any);
  }

  @Test
  public void newBuilderForTypeTest3() {
    // Arrange and Act
    MysqlxConnection.Capability.Builder actualNewBuilderForTypeResult = MysqlxConnection.Capability.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    MysqlxDatatypes.AnyOrBuilder valueOrBuilder = actualNewBuilderForTypeResult.getValueOrBuilder();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderForTypeResult.toString());
    assertTrue(valueOrBuilder instanceof MysqlxDatatypes.Any);
  }

  @Test
  public void parseFromTest32() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.Capability.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest31() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.Capability.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest8() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.Capability.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.Capability.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest30() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.Capability.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest29() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.Capability.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest28() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.Capability.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest27() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.Capability.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest26() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.Capability.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest25() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.Capability.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest4() {
    // Arrange, Act and Assert
    assertEquals(810977025, MysqlxConnection.Capability.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxConnection.Capability.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest4() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxConnection.Capability.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxConnection.Capability.getDefaultInstance().isInitialized());
  }

  @Test
  public void getValueOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxConnection.Capability.getDefaultInstance().getValueOrBuilder() instanceof MysqlxDatatypes.Any);
  }

  @Test
  public void hasValueTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxConnection.Capability.getDefaultInstance().hasValue());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxConnection.Capability.getDefaultInstance().getName());
  }

  @Test
  public void hasNameTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxConnection.Capability.getDefaultInstance().hasName());
  }

  @Test
  public void parseFromTest24() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.CapabilitiesSet.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest23() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.CapabilitiesSet.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.CapabilitiesSet.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.CapabilitiesSet.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest22() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.CapabilitiesSet.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest21() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.CapabilitiesSet.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest20() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.CapabilitiesSet.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest19() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.CapabilitiesSet.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest18() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.CapabilitiesSet.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest17() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.CapabilitiesSet.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(-1344304627, MysqlxConnection.CapabilitiesSet.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxConnection.CapabilitiesSet.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxConnection.CapabilitiesSet.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxConnection.CapabilitiesSet.getDefaultInstance().isInitialized());
  }

  @Test
  public void getCapabilitiesOrBuilderTest2() {
    // Arrange, Act and Assert
    assertTrue(MysqlxConnection.CapabilitiesSet.getDefaultInstance()
        .getCapabilitiesOrBuilder() instanceof MysqlxConnection.Capabilities);
  }

  @Test
  public void hasCapabilitiesTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxConnection.CapabilitiesSet.getDefaultInstance().hasCapabilities());
  }

  @Test
  public void toBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxConnection.CapabilitiesGet.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest4() {
    // Arrange, Act and Assert
    assertEquals("",
        MysqlxConnection.CapabilitiesGet.newBuilder(MysqlxConnection.CapabilitiesGet.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest3() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxConnection.CapabilitiesGet.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxConnection.CapabilitiesGet.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest16() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.CapabilitiesGet.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest15() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.CapabilitiesGet.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxConnection.CapabilitiesGet actualParseDelimitedFromResult = MysqlxConnection.CapabilitiesGet
        .parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    assertEquals("", actualToStringResult);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals(0, actualSerializedSize);
  }

  @Test
  public void parseDelimitedFromTest3() throws IOException {
    // Arrange and Act
    MysqlxConnection.CapabilitiesGet actualParseDelimitedFromResult = MysqlxConnection.CapabilitiesGet
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    assertEquals("", actualToStringResult);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals(0, actualSerializedSize);
  }

  @Test
  public void parseFromTest14() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.CapabilitiesGet.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest13() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.CapabilitiesGet.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest12() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.CapabilitiesGet.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest11() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.CapabilitiesGet.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest10() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.CapabilitiesGet.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest9() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.CapabilitiesGet.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(-1826963379, MysqlxConnection.CapabilitiesGet.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxConnection.CapabilitiesGet.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxConnection.CapabilitiesGet.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest2() {
    // Arrange, Act and Assert
    assertTrue(MysqlxConnection.CapabilitiesGet.getDefaultInstance().isInitialized());
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    MysqlxConnection.Capabilities.Builder actualToBuilderResult = MysqlxConnection.Capabilities.getDefaultInstance()
        .toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualToBuilderResult.getCapabilitiesCount());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    MysqlxConnection.Capabilities.Builder actualNewBuilderResult = MysqlxConnection.Capabilities
        .newBuilder(MysqlxConnection.Capabilities.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getCapabilitiesCount());
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    MysqlxConnection.Capabilities.Builder actualNewBuilderResult = MysqlxConnection.Capabilities.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderResult.getCapabilitiesCount());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    MysqlxConnection.Capabilities.Builder actualNewBuilderForTypeResult = MysqlxConnection.Capabilities
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualNewBuilderForTypeResult.getCapabilitiesCount());
  }

  @Test
  public void parseFromTest8() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.Capabilities.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.Capabilities.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxConnection.Capabilities actualParseDelimitedFromResult = MysqlxConnection.Capabilities
        .parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualCapabilitiesCount = actualParseDelimitedFromResult.getCapabilitiesCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals(0, actualCapabilitiesCount);
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange and Act
    MysqlxConnection.Capabilities actualParseDelimitedFromResult = MysqlxConnection.Capabilities
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualCapabilitiesCount = actualParseDelimitedFromResult.getCapabilitiesCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals(0, actualCapabilitiesCount);
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.Capabilities.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.Capabilities.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest4() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.Capabilities.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxConnection.Capabilities.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.Capabilities.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxConnection.Capabilities.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1767183267, MysqlxConnection.Capabilities.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxConnection.Capabilities.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxConnection.Capabilities.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxConnection.Capabilities.getDefaultInstance().isInitialized());
  }

  @Test
  public void getCapabilitiesOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxConnection.Capabilities.getDefaultInstance().getCapabilitiesOrBuilder(1);
  }

  @Test
  public void getCapabilitiesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxConnection.Capabilities.getDefaultInstance().getCapabilities(1);
  }

  @Test
  public void getCapabilitiesCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxConnection.Capabilities.getDefaultInstance().getCapabilitiesCount());
  }

  @Test
  public void getCapabilitiesOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxConnection.Capabilities.getDefaultInstance().getCapabilitiesOrBuilderList().size());
  }

  @Test
  public void getCapabilitiesListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxConnection.Capabilities.getDefaultInstance().getCapabilitiesList().size());
  }
}
