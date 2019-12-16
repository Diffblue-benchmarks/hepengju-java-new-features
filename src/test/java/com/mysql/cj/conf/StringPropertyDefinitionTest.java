package com.mysql.cj.conf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import org.junit.Test;

public class StringPropertyDefinitionTest {
  @Test
  public void createRuntimePropertyTest() {
    // Arrange
    StringPropertyDefinition stringPropertyDefinition = new StringPropertyDefinition(PropertyKey.USER, "aaaaa", true,
        "aaaaa", "aaaaa", "aaaaa", 1);

    // Act
    RuntimeProperty<String> actualCreateRuntimePropertyResult = stringPropertyDefinition.createRuntimeProperty();

    // Assert
    String actualStringValue = actualCreateRuntimePropertyResult.getStringValue();
    PropertyDefinition<String> actualPropertyDefinition = actualCreateRuntimePropertyResult.getPropertyDefinition();
    boolean actualIsExplicitlySetResult = actualCreateRuntimePropertyResult.isExplicitlySet();
    assertEquals("aaaaa", actualStringValue);
    assertEquals("aaaaa", actualCreateRuntimePropertyResult.getInitialValue());
    assertFalse(actualIsExplicitlySetResult);
    assertSame(stringPropertyDefinition, actualPropertyDefinition);
  }

  @Test
  public void parseObjectTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new StringPropertyDefinition(PropertyKey.USER, "aaaaa", true, "aaaaa", "aaaaa", "aaaaa", 1))
        .parseObject("aaaaa", null));
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    StringPropertyDefinition actualStringPropertyDefinition = new StringPropertyDefinition(PropertyKey.USER, "aaaaa",
        true, "aaaaa", "aaaaa", "aaaaa", 1);

    // Assert
    String actualName = actualStringPropertyDefinition.getName();
    String actualSinceVersion = actualStringPropertyDefinition.getSinceVersion();
    PropertyKey actualPropertyKey = actualStringPropertyDefinition.getPropertyKey();
    String actualCcAlias = actualStringPropertyDefinition.getCcAlias();
    int actualOrder = actualStringPropertyDefinition.getOrder();
    String actualCategory = actualStringPropertyDefinition.getCategory();
    boolean actualIsRuntimeModifiableResult = actualStringPropertyDefinition.isRuntimeModifiable();
    String actualDescription = actualStringPropertyDefinition.getDescription();
    assertEquals("user", actualName);
    assertEquals("aaaaa", actualStringPropertyDefinition.getDefaultValue());
    assertEquals("aaaaa", actualDescription);
    assertTrue(actualIsRuntimeModifiableResult);
    assertEquals("aaaaa", actualCategory);
    assertEquals(1, actualOrder);
    assertNull(actualCcAlias);
    assertEquals(PropertyKey.USER, actualPropertyKey);
    assertEquals("aaaaa", actualSinceVersion);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    StringPropertyDefinition actualStringPropertyDefinition = new StringPropertyDefinition("aaaaa", "aaaaa", "aaaaa",
        true, "aaaaa", "aaaaa", "aaaaa", 1);

    // Assert
    String actualName = actualStringPropertyDefinition.getName();
    String actualSinceVersion = actualStringPropertyDefinition.getSinceVersion();
    PropertyKey actualPropertyKey = actualStringPropertyDefinition.getPropertyKey();
    String actualCcAlias = actualStringPropertyDefinition.getCcAlias();
    int actualOrder = actualStringPropertyDefinition.getOrder();
    String actualCategory = actualStringPropertyDefinition.getCategory();
    boolean actualIsRuntimeModifiableResult = actualStringPropertyDefinition.isRuntimeModifiable();
    String actualDescription = actualStringPropertyDefinition.getDescription();
    assertEquals("aaaaa", actualName);
    assertEquals("aaaaa", actualStringPropertyDefinition.getDefaultValue());
    assertEquals("aaaaa", actualDescription);
    assertTrue(actualIsRuntimeModifiableResult);
    assertEquals("aaaaa", actualCategory);
    assertEquals(1, actualOrder);
    assertEquals("aaaaa", actualCcAlias);
    assertNull(actualPropertyKey);
    assertEquals("aaaaa", actualSinceVersion);
  }
}
