package com.mysql.cj.result;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.conf.DefaultPropertySet;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ShortValueFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getTargetTypeNameTest() {
    // Arrange, Act and Assert
    assertEquals("java.lang.Short", (new ShortValueFactory(new DefaultPropertySet())).getTargetTypeName());
  }
  @Test
  public void createFromBitTest() {
    // Arrange, Act and Assert
    assertEquals(Short.valueOf((short) 0),
        (new ShortValueFactory(new DefaultPropertySet())).createFromBit(new byte[24], 1, 1));
  }
  @Test
  public void createFromDoubleTest() {
    // Arrange, Act and Assert
    assertEquals(Short.valueOf((short) 1), (new ShortValueFactory(new DefaultPropertySet())).createFromDouble(1.0));
  }
  @Test
  public void createFromBigDecimalTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ShortValueFactory(new DefaultPropertySet())).createFromBigDecimal(null);
  }
  @Test
  public void createFromLongTest() {
    // Arrange, Act and Assert
    assertEquals(Short.valueOf((short) 1), (new ShortValueFactory(new DefaultPropertySet())).createFromLong(1L));
  }
  @Test
  public void createFromBigIntegerTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ShortValueFactory(new DefaultPropertySet())).createFromBigInteger(null);
  }
}
