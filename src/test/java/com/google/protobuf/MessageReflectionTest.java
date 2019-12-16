package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MessageReflectionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void mergeFieldFromTest() throws Descriptors.DescriptorValidationException, IOException {
    // Arrange
    ExtensionRegistryLite extensionRegistry = ExtensionRegistryLite.getEmptyRegistry();
    Descriptors.Descriptor type = new Descriptors.Descriptor("aaaaa");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    MessageReflection.mergeFieldFrom(null, null, extensionRegistry, type, new MessageReflection.BuilderAdapter(null),
        1);
  }
  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MessageReflection.isInitialized(null);
  }
  @Test
  public void delimitWithCommasTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MessageReflection.delimitWithCommas(null);
  }
  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MessageReflection.getSerializedSize(null, null);
  }
}
