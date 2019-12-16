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

public class LongPropertyDefinitionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void createRuntimePropertyTest() {
    // Arrange
    LongPropertyDefinition longPropertyDefinition = new LongPropertyDefinition(PropertyKey.USER, 1L, true, "aaaaa",
        "aaaaa", "aaaaa", 1);

    // Act
    RuntimeProperty<Long> actualCreateRuntimePropertyResult = longPropertyDefinition.createRuntimeProperty();

    // Assert
    String actualStringValue = actualCreateRuntimePropertyResult.getStringValue();
    PropertyDefinition<Long> actualPropertyDefinition = actualCreateRuntimePropertyResult.getPropertyDefinition();
    boolean actualIsExplicitlySetResult = actualCreateRuntimePropertyResult.isExplicitlySet();
    assertEquals("1", actualStringValue);
    assertEquals(Long.valueOf(1L), actualCreateRuntimePropertyResult.getInitialValue());
    assertFalse(actualIsExplicitlySetResult);
    assertSame(longPropertyDefinition, actualPropertyDefinition);
  }

  @Test
  public void isRangeBasedTest() {
    // Arrange, Act and Assert
    assertFalse((new LongPropertyDefinition(PropertyKey.USER, 1L, true, "aaaaa", "aaaaa", "aaaaa", 1)).isRangeBased());
  }

  @Test
  public void parseObjectTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new LongPropertyDefinition(PropertyKey.USER, 1L, true, "aaaaa", "aaaaa", "aaaaa", 1)).parseObject("aaaaa", null);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    LongPropertyDefinition actualLongPropertyDefinition = new LongPropertyDefinition(PropertyKey.USER, 1L, true,
        "aaaaa", "aaaaa", "aaaaa", 1, 1L, 1L);

    // Assert
    String actualName = actualLongPropertyDefinition.getName();
    String actualSinceVersion = actualLongPropertyDefinition.getSinceVersion();
    PropertyKey actualPropertyKey = actualLongPropertyDefinition.getPropertyKey();
    String actualCcAlias = actualLongPropertyDefinition.getCcAlias();
    int actualOrder = actualLongPropertyDefinition.getOrder();
    String actualCategory = actualLongPropertyDefinition.getCategory();
    int actualUpperBound = actualLongPropertyDefinition.getUpperBound();
    boolean actualIsRuntimeModifiableResult = actualLongPropertyDefinition.isRuntimeModifiable();
    String actualDescription = actualLongPropertyDefinition.getDescription();
    Long actualDefaultValue = actualLongPropertyDefinition.getDefaultValue();
    assertEquals("user", actualName);
    assertEquals(1, actualLongPropertyDefinition.getLowerBound());
    assertEquals(Long.valueOf(1L), actualDefaultValue);
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
    LongPropertyDefinition actualLongPropertyDefinition = new LongPropertyDefinition(PropertyKey.USER, 1L, true,
        "aaaaa", "aaaaa", "aaaaa", 1);

    // Assert
    String actualName = actualLongPropertyDefinition.getName();
    String actualSinceVersion = actualLongPropertyDefinition.getSinceVersion();
    PropertyKey actualPropertyKey = actualLongPropertyDefinition.getPropertyKey();
    String actualCcAlias = actualLongPropertyDefinition.getCcAlias();
    int actualOrder = actualLongPropertyDefinition.getOrder();
    String actualCategory = actualLongPropertyDefinition.getCategory();
    boolean actualIsRuntimeModifiableResult = actualLongPropertyDefinition.isRuntimeModifiable();
    String actualDescription = actualLongPropertyDefinition.getDescription();
    assertEquals("user", actualName);
    assertEquals(Long.valueOf(1L), actualLongPropertyDefinition.getDefaultValue());
    assertEquals("aaaaa", actualDescription);
    assertTrue(actualIsRuntimeModifiableResult);
    assertEquals("aaaaa", actualCategory);
    assertEquals(1, actualOrder);
    assertNull(actualCcAlias);
    assertEquals(PropertyKey.USER, actualPropertyKey);
    assertEquals("aaaaa", actualSinceVersion);
  }
}
