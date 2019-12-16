package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Int32ValueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", Int32Value.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", Int32Value.newBuilder(Int32Value.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", Int32Value.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange, Act and Assert
    assertEquals("", Int32Value.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Int32Value.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Int32Value.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Int32Value.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Int32Value.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Int32Value.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Int32Value.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1443157936, Int32Value.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Int32Value.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Int32Value.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Int32Value.getDefaultInstance().isInitialized());
  }

  @Test
  public void getValueTest() {
    // Arrange, Act and Assert
    assertEquals(0, Int32Value.getDefaultInstance().getValue());
  }
}
