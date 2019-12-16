package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TimestampTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", Timestamp.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", Timestamp.newBuilder(Timestamp.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", Timestamp.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange, Act and Assert
    assertEquals("", Timestamp.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Timestamp.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Timestamp.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Timestamp.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Timestamp.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Timestamp.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Timestamp.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(937578035, Timestamp.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Timestamp.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Timestamp.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Timestamp.getDefaultInstance().isInitialized());
  }

  @Test
  public void getNanosTest() {
    // Arrange, Act and Assert
    assertEquals(0, Timestamp.getDefaultInstance().getNanos());
  }

  @Test
  public void getSecondsTest() {
    // Arrange, Act and Assert
    assertEquals(0L, Timestamp.getDefaultInstance().getSeconds());
  }
}
