package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SourceContextTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    SourceContext.Builder actualToBuilderResult = SourceContext.getDefaultInstance().toBuilder();

    // Assert
    String actualFileName = actualToBuilderResult.getFileName();
    assertEquals("", actualFileName);
    assertEquals("", actualToBuilderResult.toString());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    SourceContext.Builder actualNewBuilderResult = SourceContext.newBuilder(SourceContext.getDefaultInstance());

    // Assert
    String actualFileName = actualNewBuilderResult.getFileName();
    assertEquals("", actualFileName);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    SourceContext.Builder actualNewBuilderResult = SourceContext.newBuilder();

    // Assert
    String actualFileName = actualNewBuilderResult.getFileName();
    assertEquals("", actualFileName);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    SourceContext.Builder actualNewBuilderForTypeResult = SourceContext.getDefaultInstance().newBuilderForType();

    // Assert
    String actualFileName = actualNewBuilderForTypeResult.getFileName();
    assertEquals("", actualFileName);
    assertEquals("", actualNewBuilderForTypeResult.toString());
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    SourceContext.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    SourceContext.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    SourceContext.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    SourceContext.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    SourceContext.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    SourceContext.parseFrom(new byte[24]);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(233872964, SourceContext.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(SourceContext.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, SourceContext.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(SourceContext.getDefaultInstance().isInitialized());
  }

  @Test
  public void getFileNameTest() {
    // Arrange, Act and Assert
    assertEquals("", SourceContext.getDefaultInstance().getFileName());
  }
}
