package com.google.protobuf;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ExtensionRegistryFactoryTest {
  @Test
  public void isFullRegistryTest() {
    // Arrange, Act and Assert
    assertTrue(ExtensionRegistryFactory.isFullRegistry(ExtensionRegistryLite.getEmptyRegistry()));
  }

  @Test
  public void createEmptyTest() {
    // Arrange, Act and Assert
    assertTrue(ExtensionRegistryFactory.createEmpty() instanceof ExtensionRegistry);
  }
}
