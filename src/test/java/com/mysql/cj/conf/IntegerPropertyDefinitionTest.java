package com.mysql.cj.conf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.exceptions.WrongArgumentException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class IntegerPropertyDefinitionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void integerFromTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    IntegerPropertyDefinition.integerFrom("aaaaa", "aaaaa", 1, null);
  }

  @Test
  public void createRuntimePropertyTest() {
    // Arrange
    IntegerPropertyDefinition integerPropertyDefinition = new IntegerPropertyDefinition(PropertyKey.USER, 1, true,
        "aaaaa", "aaaaa", "aaaaa", 1);

    // Act
    RuntimeProperty<Integer> actualCreateRuntimePropertyResult = integerPropertyDefinition.createRuntimeProperty();

    // Assert
    String actualStringValue = actualCreateRuntimePropertyResult.getStringValue();
    PropertyDefinition<Integer> actualPropertyDefinition = actualCreateRuntimePropertyResult.getPropertyDefinition();
    boolean actualIsExplicitlySetResult = actualCreateRuntimePropertyResult.isExplicitlySet();
    assertEquals("1", actualStringValue);
    assertEquals(Integer.valueOf(1), actualCreateRuntimePropertyResult.getInitialValue());
    assertFalse(actualIsExplicitlySetResult);
    assertSame(integerPropertyDefinition, actualPropertyDefinition);
  }

  @Test
  public void parseObjectTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new IntegerPropertyDefinition(PropertyKey.USER, 1, true, "aaaaa", "aaaaa", "aaaaa", 1)).parseObject("aaaaa", null);
  }

  @Test
  public void isRangeBasedTest() {
    // Arrange, Act and Assert
    assertFalse(
        (new IntegerPropertyDefinition(PropertyKey.USER, 1, true, "aaaaa", "aaaaa", "aaaaa", 1)).isRangeBased());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    IntegerPropertyDefinition actualIntegerPropertyDefinition = new IntegerPropertyDefinition(PropertyKey.USER, 1, true,
        "aaaaa", "aaaaa", "aaaaa", 1, 1, 1);

    // Assert
    String actualName = actualIntegerPropertyDefinition.getName();
    String actualSinceVersion = actualIntegerPropertyDefinition.getSinceVersion();
    PropertyKey actualPropertyKey = actualIntegerPropertyDefinition.getPropertyKey();
    String actualCcAlias = actualIntegerPropertyDefinition.getCcAlias();
    int actualOrder = actualIntegerPropertyDefinition.getOrder();
    String actualCategory = actualIntegerPropertyDefinition.getCategory();
    int actualUpperBound = actualIntegerPropertyDefinition.getUpperBound();
    boolean actualIsRuntimeModifiableResult = actualIntegerPropertyDefinition.isRuntimeModifiable();
    String actualDescription = actualIntegerPropertyDefinition.getDescription();
    Integer actualDefaultValue = actualIntegerPropertyDefinition.getDefaultValue();
    assertEquals("user", actualName);
    assertEquals(1, actualIntegerPropertyDefinition.multiplier);
    assertEquals(1, actualIntegerPropertyDefinition.getLowerBound());
    assertEquals(Integer.valueOf(1), actualDefaultValue);
    assertEquals("aaaaa", actualDescription);
    assertTrue(actualIsRuntimeModifiableResult);
    assertEquals(1, actualUpperBound);
    assertEquals("aaaaa", actualCategory);
    assertEquals(1, actualOrder);
    assertNull(actualCcAlias);
    assertEquals(PropertyKey.USER, actualPropertyKey);
    assertEquals("aaaaa", actualSinceVersion);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    IntegerPropertyDefinition actualIntegerPropertyDefinition = new IntegerPropertyDefinition(PropertyKey.USER, 1, true,
        "aaaaa", "aaaaa", "aaaaa", 1);

    // Assert
    String actualName = actualIntegerPropertyDefinition.getName();
    String actualSinceVersion = actualIntegerPropertyDefinition.getSinceVersion();
    PropertyKey actualPropertyKey = actualIntegerPropertyDefinition.getPropertyKey();
    String actualCcAlias = actualIntegerPropertyDefinition.getCcAlias();
    int actualOrder = actualIntegerPropertyDefinition.getOrder();
    String actualCategory = actualIntegerPropertyDefinition.getCategory();
    boolean actualIsRuntimeModifiableResult = actualIntegerPropertyDefinition.isRuntimeModifiable();
    String actualDescription = actualIntegerPropertyDefinition.getDescription();
    assertEquals("user", actualName);
    assertEquals(1, actualIntegerPropertyDefinition.multiplier);
    assertEquals(Integer.valueOf(1), actualIntegerPropertyDefinition.getDefaultValue());
    assertEquals("aaaaa", actualDescription);
    assertTrue(actualIsRuntimeModifiableResult);
    assertEquals("aaaaa", actualCategory);
    assertEquals(1, actualOrder);
    assertNull(actualCcAlias);
    assertEquals(PropertyKey.USER, actualPropertyKey);
    assertEquals("aaaaa", actualSinceVersion);
  }
}
