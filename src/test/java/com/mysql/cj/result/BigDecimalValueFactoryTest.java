package com.mysql.cj.result;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.conf.DefaultPropertySet;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BigDecimalValueFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getTargetTypeNameTest() {
    // Arrange, Act and Assert
    assertEquals("java.math.BigDecimal", (new BigDecimalValueFactory(new DefaultPropertySet())).getTargetTypeName());
  }

  @Test
  public void createFromBigDecimalTest() {
    // Arrange, Act and Assert
    assertNull((new BigDecimalValueFactory(new DefaultPropertySet())).createFromBigDecimal(null));
  }

  @Test
  public void createFromBigIntegerTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new BigDecimalValueFactory(new DefaultPropertySet())).createFromBigInteger(null);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    BigDecimalValueFactory actualBigDecimalValueFactory = new BigDecimalValueFactory(new DefaultPropertySet(), 1);

    // Assert
    assertTrue(actualBigDecimalValueFactory.hasScale);
    assertEquals(1, actualBigDecimalValueFactory.scale);
  }
}
