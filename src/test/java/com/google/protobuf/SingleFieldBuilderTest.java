package com.google.protobuf;

import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SingleFieldBuilderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new SingleFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null,
        new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true,
            new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true,
                new RepeatedFieldBuilder<GeneratedMessage, GeneratedMessage.Builder, MessageOrBuilder>(null, true, null,
                    true),
                true),
            true),
        true);
  }
}
