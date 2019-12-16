package com.mysql.cj.conf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.exceptions.CJException;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BooleanPropertyDefinitionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void asBooleanTest() {
    // Arrange, Act and Assert
    assertTrue(BooleanPropertyDefinition.AllowableValues.TRUE.asBoolean());
  }

  @Test
  public void getBooleanAllowableValuesTest() {
    // Arrange, Act and Assert
    assertEquals(4, BooleanPropertyDefinition.getBooleanAllowableValues().length);
  }

  @Test
  public void booleanFromTest() {
    // Arrange, Act and Assert
    thrown.expect(CJException.class);
    BooleanPropertyDefinition.booleanFrom("aaaaa", "aaaaa", null);
  }

  @Test
  public void createRuntimePropertyTest() {
    // Arrange
    BooleanPropertyDefinition booleanPropertyDefinition = new BooleanPropertyDefinition(PropertyKey.USER, null, true,
        "aaaaa", "aaaaa", "aaaaa", 1);

    // Act
    RuntimeProperty<Boolean> actualCreateRuntimePropertyResult = booleanPropertyDefinition.createRuntimeProperty();

    // Assert
    String actualStringValue = actualCreateRuntimePropertyResult.getStringValue();
    PropertyDefinition<Boolean> actualPropertyDefinition = actualCreateRuntimePropertyResult.getPropertyDefinition();
    boolean actualIsExplicitlySetResult = actualCreateRuntimePropertyResult.isExplicitlySet();
    assertNull(actualStringValue);
    assertNull(actualCreateRuntimePropertyResult.getInitialValue());
    assertFalse(actualIsExplicitlySetResult);
    assertSame(booleanPropertyDefinition, actualPropertyDefinition);
  }

  @Test
  public void parseObjectTest() {
    // Arrange, Act and Assert
    thrown.expect(CJException.class);
    (new BooleanPropertyDefinition(PropertyKey.USER, null, true, "aaaaa", "aaaaa", "aaaaa", 1)).parseObject("aaaaa",
        null);
  }

  @Test
  public void getAllowableValuesTest() {
    // Arrange, Act and Assert
    assertEquals(4, (new BooleanPropertyDefinition(PropertyKey.USER, null, true, "aaaaa", "aaaaa", "aaaaa", 1))
        .getAllowableValues().length);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    BooleanPropertyDefinition actualBooleanPropertyDefinition = new BooleanPropertyDefinition(PropertyKey.USER, null,
        true, "aaaaa", "aaaaa", "aaaaa", 1);

    // Assert
    String actualName = actualBooleanPropertyDefinition.getName();
    String actualSinceVersion = actualBooleanPropertyDefinition.getSinceVersion();
    PropertyKey actualPropertyKey = actualBooleanPropertyDefinition.getPropertyKey();
    String actualCcAlias = actualBooleanPropertyDefinition.getCcAlias();
    int actualOrder = actualBooleanPropertyDefinition.getOrder();
    String actualCategory = actualBooleanPropertyDefinition.getCategory();
    boolean actualIsRuntimeModifiableResult = actualBooleanPropertyDefinition.isRuntimeModifiable();
    String actualDescription = actualBooleanPropertyDefinition.getDescription();
    assertEquals("user", actualName);
    assertNull(actualBooleanPropertyDefinition.getDefaultValue());
    assertEquals("aaaaa", actualDescription);
    assertTrue(actualIsRuntimeModifiableResult);
    assertEquals("aaaaa", actualCategory);
    assertEquals(1, actualOrder);
    assertNull(actualCcAlias);
    assertEquals(PropertyKey.USER, actualPropertyKey);
    assertEquals("aaaaa", actualSinceVersion);
  }
}
