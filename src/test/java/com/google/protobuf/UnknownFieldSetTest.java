package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UnknownFieldSetTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void parsePartialFromTest() throws InvalidProtocolBufferException {
    // Arrange
    UnknownFieldSet.Parser parser = new UnknownFieldSet.Parser();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    parser.parsePartialFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void getSerializedSizeAsMessageSetExtensionTest() {
    // Arrange, Act and Assert
    assertEquals(0, UnknownFieldSet.Field.getDefaultInstance().getSerializedSizeAsMessageSetExtension(1));
  }

  @Test
  public void getSerializedSizeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, UnknownFieldSet.Field.getDefaultInstance().getSerializedSize(1));
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(29583456, UnknownFieldSet.Field.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(UnknownFieldSet.Field.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getGroupListTest() {
    // Arrange, Act and Assert
    assertEquals(0, UnknownFieldSet.Field.getDefaultInstance().getGroupList().size());
  }

  @Test
  public void getLengthDelimitedListTest() {
    // Arrange, Act and Assert
    assertEquals(0, UnknownFieldSet.Field.getDefaultInstance().getLengthDelimitedList().size());
  }

  @Test
  public void getFixed64ListTest() {
    // Arrange, Act and Assert
    assertEquals(0, UnknownFieldSet.Field.getDefaultInstance().getFixed64List().size());
  }

  @Test
  public void getFixed32ListTest() {
    // Arrange, Act and Assert
    assertEquals(0, UnknownFieldSet.Field.getDefaultInstance().getFixed32List().size());
  }

  @Test
  public void getVarintListTest() {
    // Arrange, Act and Assert
    assertEquals(0, UnknownFieldSet.Field.getDefaultInstance().getVarintList().size());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    UnknownFieldSet.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    UnknownFieldSet.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnknownFieldSet.parseFrom((CodedInputStream) null);
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(UnknownFieldSet.getDefaultInstance().isInitialized());
  }

  @Test
  public void getSerializedSizeAsMessageSetTest() {
    // Arrange, Act and Assert
    assertEquals(0, UnknownFieldSet.getDefaultInstance().getSerializedSizeAsMessageSet());
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, UnknownFieldSet.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void writeDelimitedToTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnknownFieldSet.getDefaultInstance().writeDelimitedTo(null);
  }

  @Test
  public void writeToTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    UnknownFieldSet.getDefaultInstance().writeTo((OutputStream) null);
  }

  @Test
  public void toByteArrayTest() {
    // Arrange, Act and Assert
    assertEquals(0, UnknownFieldSet.getDefaultInstance().toByteArray().length);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("", UnknownFieldSet.getDefaultInstance().toString());
  }

  @Test
  public void hasFieldTest() {
    // Arrange, Act and Assert
    assertFalse(UnknownFieldSet.getDefaultInstance().hasField(1));
  }

  @Test
  public void asMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, UnknownFieldSet.getDefaultInstance().asMap().size());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, UnknownFieldSet.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(UnknownFieldSet.getDefaultInstance().equals("aaaaa"));
  }
}
