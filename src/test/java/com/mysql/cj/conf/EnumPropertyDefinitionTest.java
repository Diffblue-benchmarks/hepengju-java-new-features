package com.mysql.cj.conf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.exceptions.CJException;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import java.math.RoundingMode;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EnumPropertyDefinitionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void createRuntimePropertyTest() {
    // Arrange
    EnumPropertyDefinition<RoundingMode> enumPropertyDefinition = new EnumPropertyDefinition<RoundingMode>(
        PropertyKey.USER, RoundingMode.UP, true, "aaaaa", "aaaaa", "aaaaa", 1);

    // Act
    RuntimeProperty<RoundingMode> actualCreateRuntimePropertyResult = enumPropertyDefinition.createRuntimeProperty();

    // Assert
    String actualStringValue = actualCreateRuntimePropertyResult.getStringValue();
    PropertyDefinition<RoundingMode> actualPropertyDefinition = actualCreateRuntimePropertyResult
        .getPropertyDefinition();
    boolean actualIsExplicitlySetResult = actualCreateRuntimePropertyResult.isExplicitlySet();
    assertEquals("UP", actualStringValue);
    assertEquals(RoundingMode.UP, actualCreateRuntimePropertyResult.getInitialValue());
    assertFalse(actualIsExplicitlySetResult);
    assertSame(enumPropertyDefinition, actualPropertyDefinition);
  }

  @Test
  public void parseObjectTest() {
    // Arrange, Act and Assert
    thrown.expect(CJException.class);
    (new EnumPropertyDefinition<RoundingMode>(PropertyKey.USER, RoundingMode.UP, true, "aaaaa", "aaaaa", "aaaaa", 1))
        .parseObject("aaaaa", null);
  }

  @Test
  public void getAllowableValuesTest() {
    // Arrange, Act and Assert
    assertEquals(8, (new EnumPropertyDefinition<RoundingMode>(PropertyKey.USER, RoundingMode.UP, true, "aaaaa", "aaaaa",
        "aaaaa", 1)).getAllowableValues().length);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    EnumPropertyDefinition<RoundingMode> actualEnumPropertyDefinition = new EnumPropertyDefinition<RoundingMode>(
        PropertyKey.USER, RoundingMode.UP, true, "aaaaa", "aaaaa", "aaaaa", 1);

    // Assert
    String actualName = actualEnumPropertyDefinition.getName();
    String actualSinceVersion = actualEnumPropertyDefinition.getSinceVersion();
    PropertyKey actualPropertyKey = actualEnumPropertyDefinition.getPropertyKey();
    String actualCcAlias = actualEnumPropertyDefinition.getCcAlias();
    int actualOrder = actualEnumPropertyDefinition.getOrder();
    String actualCategory = actualEnumPropertyDefinition.getCategory();
    String[] allowableValues = actualEnumPropertyDefinition.getAllowableValues();
    boolean actualIsRuntimeModifiableResult = actualEnumPropertyDefinition.isRuntimeModifiable();
    String actualDescription = actualEnumPropertyDefinition.getDescription();
    assertEquals("user", actualName);
    assertEquals(RoundingMode.UP, actualEnumPropertyDefinition.getDefaultValue());
    assertEquals("aaaaa", actualDescription);
    assertTrue(actualIsRuntimeModifiableResult);
    assertEquals(8, allowableValues.length);
    assertEquals("aaaaa", actualCategory);
    assertEquals(1, actualOrder);
    assertNull(actualCcAlias);
    assertEquals(PropertyKey.USER, actualPropertyKey);
    assertEquals("aaaaa", actualSinceVersion);
  }
}
