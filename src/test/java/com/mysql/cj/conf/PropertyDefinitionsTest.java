package com.mysql.cj.conf;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PropertyDefinitionsTest {
  @Test
  public void getPropertyDefinitionTest() {
    // Arrange, Act and Assert
    assertTrue(PropertyDefinitions.getPropertyDefinition(PropertyKey.USER) instanceof StringPropertyDefinition);
  }
}
