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

public class MemorySizePropertyDefinitionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void createRuntimePropertyTest() {
    // Arrange
    MemorySizePropertyDefinition memorySizePropertyDefinition = new MemorySizePropertyDefinition(PropertyKey.USER, 1,
        true, "G", "G", "G", 1);

    // Act
    RuntimeProperty<Integer> actualCreateRuntimePropertyResult = memorySizePropertyDefinition.createRuntimeProperty();

    // Assert
    String actualStringValue = actualCreateRuntimePropertyResult.getStringValue();
    PropertyDefinition<Integer> actualPropertyDefinition = actualCreateRuntimePropertyResult.getPropertyDefinition();
    boolean actualIsExplicitlySetResult = actualCreateRuntimePropertyResult.isExplicitlySet();
    Integer actualInitialValue = actualCreateRuntimePropertyResult.getInitialValue();
    assertEquals("1", actualStringValue);
    assertEquals(Integer.valueOf(1), actualCreateRuntimePropertyResult.getValue());
    assertEquals(Integer.valueOf(1), actualInitialValue);
    assertFalse(actualIsExplicitlySetResult);
    assertSame(memorySizePropertyDefinition, actualPropertyDefinition);
  }

  @Test
  public void parseObjectTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new MemorySizePropertyDefinition(PropertyKey.USER, 1, true, "G", "G", "G", 1)).parseObject("G", null);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    MemorySizePropertyDefinition actualMemorySizePropertyDefinition = new MemorySizePropertyDefinition(PropertyKey.USER,
        1, true, "G", "G", "G", 1, 1, 1);

    // Assert
    String actualName = actualMemorySizePropertyDefinition.getName();
    String actualSinceVersion = actualMemorySizePropertyDefinition.getSinceVersion();
    PropertyKey actualPropertyKey = actualMemorySizePropertyDefinition.getPropertyKey();
    String actualCcAlias = actualMemorySizePropertyDefinition.getCcAlias();
    int actualOrder = actualMemorySizePropertyDefinition.getOrder();
    String actualCategory = actualMemorySizePropertyDefinition.getCategory();
    int actualUpperBound = actualMemorySizePropertyDefinition.getUpperBound();
    boolean actualIsRuntimeModifiableResult = actualMemorySizePropertyDefinition.isRuntimeModifiable();
    String actualDescription = actualMemorySizePropertyDefinition.getDescription();
    Integer actualDefaultValue = actualMemorySizePropertyDefinition.getDefaultValue();
    assertEquals("user", actualName);
    assertEquals(1, actualMemorySizePropertyDefinition.getLowerBound());
    assertEquals(Integer.valueOf(1), actualDefaultValue);
    assertEquals("G", actualDescription);
    assertTrue(actualIsRuntimeModifiableResult);
    assertEquals(1, actualUpperBound);
    assertEquals("G", actualCategory);
    assertEquals(1, actualOrder);
    assertNull(actualCcAlias);
    assertEquals(PropertyKey.USER, actualPropertyKey);
    assertEquals("G", actualSinceVersion);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    MemorySizePropertyDefinition actualMemorySizePropertyDefinition = new MemorySizePropertyDefinition(PropertyKey.USER,
        1, true, "G", "G", "G", 1);

    // Assert
    String actualName = actualMemorySizePropertyDefinition.getName();
    String actualSinceVersion = actualMemorySizePropertyDefinition.getSinceVersion();
    PropertyKey actualPropertyKey = actualMemorySizePropertyDefinition.getPropertyKey();
    String actualCcAlias = actualMemorySizePropertyDefinition.getCcAlias();
    int actualOrder = actualMemorySizePropertyDefinition.getOrder();
    String actualCategory = actualMemorySizePropertyDefinition.getCategory();
    boolean actualIsRuntimeModifiableResult = actualMemorySizePropertyDefinition.isRuntimeModifiable();
    String actualDescription = actualMemorySizePropertyDefinition.getDescription();
    assertEquals("user", actualName);
    assertEquals(Integer.valueOf(1), actualMemorySizePropertyDefinition.getDefaultValue());
    assertEquals("G", actualDescription);
    assertTrue(actualIsRuntimeModifiableResult);
    assertEquals("G", actualCategory);
    assertEquals(1, actualOrder);
    assertNull(actualCcAlias);
    assertEquals(PropertyKey.USER, actualPropertyKey);
    assertEquals("G", actualSinceVersion);
  }
}
