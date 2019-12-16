package com.mysql.cj.result;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.MysqlType;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.exceptions.DataConversionException;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BooleanValueFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void createFromBytesTest() {
    // Arrange
    BooleanValueFactory booleanValueFactory = new BooleanValueFactory(new DefaultPropertySet());

    // Act and Assert
    thrown.expect(DataConversionException.class);
    booleanValueFactory.createFromBytes(new byte[24], 1, 1,
        new Field("-?(\\d+)?\\.\\d+", "-?(\\d+)?\\.\\d+", 1, "-?(\\d+)?\\.\\d+", MysqlType.DECIMAL, 1));
  }

  @Test
  public void getTargetTypeNameTest() {
    // Arrange, Act and Assert
    assertEquals("java.lang.Boolean", (new BooleanValueFactory(new DefaultPropertySet())).getTargetTypeName());
  }

  @Test
  public void createFromYearTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new BooleanValueFactory(new DefaultPropertySet())).createFromYear(1L));
  }

  @Test
  public void createFromBitTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(false),
        (new BooleanValueFactory(new DefaultPropertySet())).createFromBit(new byte[24], 1, 1));
  }

  @Test
  public void createFromBigDecimalTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new BooleanValueFactory(new DefaultPropertySet())).createFromBigDecimal(null);
  }

  @Test
  public void createFromDoubleTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new BooleanValueFactory(new DefaultPropertySet())).createFromDouble(1.0));
  }

  @Test
  public void createFromBigIntegerTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new BooleanValueFactory(new DefaultPropertySet())).createFromBigInteger(null);
  }

  @Test
  public void createFromLongTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new BooleanValueFactory(new DefaultPropertySet())).createFromLong(1L));
  }
}
