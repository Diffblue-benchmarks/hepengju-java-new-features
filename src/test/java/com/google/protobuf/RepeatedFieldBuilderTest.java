package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RepeatedFieldBuilderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true,
        new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true, null, true),
        true)).build();
  }
  @Test
  public void clearTest() {
    // Arrange
    RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder> repeatedFieldBuilder = new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(
        null, true,
        new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true, null, true),
        true);

    // Act
    repeatedFieldBuilder.clear();

    // Assert
    assertEquals(0, repeatedFieldBuilder.getCount());
  }
  @Test
  public void removeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true,
        new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true, null, true),
        true)).remove(1);
  }
  @Test
  public void addBuilderTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true,
        new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true, null, true),
        true)).addBuilder(1, null);
  }
  @Test
  public void addBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true,
        new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true, null, true),
        true)).addBuilder(null);
  }
  @Test
  public void addAllMessagesTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true,
        new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true, null, true),
        true)).addAllMessages(null);
  }
  @Test
  public void addMessageTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true,
        new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true, null, true),
        true)).addMessage(1, null);
  }
  @Test
  public void addMessageTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true,
        new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true, null, true),
        true)).addMessage(null);
  }
  @Test
  public void setMessageTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true,
        new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true, null, true),
        true)).setMessage(1, null);
  }
  @Test
  public void getMessageOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true,
        new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true, null, true),
        true)).getMessageOrBuilder(1);
  }
  @Test
  public void getBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true,
        new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true, null, true),
        true)).getBuilder(1);
  }
  @Test
  public void getMessageTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true,
        new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true, null, true),
        true)).getMessage(1);
  }
  @Test
  public void isEmptyTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true,
        new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true, null, true),
        true)).isEmpty();
  }
  @Test
  public void getCountTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true,
        new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true, null, true),
        true)).getCount();
  }
}
