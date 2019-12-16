package com.mysql.cj.conf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import java.math.RoundingMode;
import org.junit.Test;

public class EnumPropertyTest {
  @Test
  public void constructorTest() {
    // Arrange
    EnumPropertyDefinition<RoundingMode> enumPropertyDefinition = new EnumPropertyDefinition<RoundingMode>(
        PropertyKey.USER, RoundingMode.UP, true, "aaaaa", "aaaaa", "aaaaa", 1);

    // Act
    EnumProperty<RoundingMode> actualEnumProperty = new EnumProperty<RoundingMode>(enumPropertyDefinition);

    // Assert
    String actualStringValue = actualEnumProperty.getStringValue();
    PropertyDefinition<RoundingMode> actualPropertyDefinition = actualEnumProperty.getPropertyDefinition();
    boolean actualIsExplicitlySetResult = actualEnumProperty.isExplicitlySet();
    assertEquals("UP", actualStringValue);
    assertEquals(RoundingMode.UP, actualEnumProperty.getInitialValue());
    assertFalse(actualIsExplicitlySetResult);
    assertSame(enumPropertyDefinition, actualPropertyDefinition);
  }
}
