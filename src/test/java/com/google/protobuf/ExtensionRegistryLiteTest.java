package com.google.protobuf;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ExtensionRegistryLiteTest {
  @Test
  public void findLiteExtensionByNumberTest() {
    // Arrange, Act and Assert
    assertNull(ExtensionRegistryLite.getEmptyRegistry().<MessageLite>findLiteExtensionByNumber(null, 1));
  }

  @Test
  public void getUnmodifiableTest() {
    // Arrange, Act and Assert
    assertTrue(ExtensionRegistryLite.getEmptyRegistry().getUnmodifiable() instanceof ExtensionRegistry);
  }

  @Test
  public void getEmptyRegistryTest() {
    // Arrange, Act and Assert
    assertTrue(ExtensionRegistryLite.getEmptyRegistry() instanceof ExtensionRegistry);
  }

  @Test
  public void newInstanceTest() {
    // Arrange, Act and Assert
    assertTrue(ExtensionRegistryLite.newInstance() instanceof ExtensionRegistry);
  }

  @Test
  public void isEagerlyParseMessageSetsTest() {
    // Arrange, Act and Assert
    assertFalse(ExtensionRegistryLite.isEagerlyParseMessageSets());
  }
}
