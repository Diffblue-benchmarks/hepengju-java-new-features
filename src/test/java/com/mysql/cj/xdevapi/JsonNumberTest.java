package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JsonNumberTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("null", (new JsonNumber()).toString());
  }

  @Test
  public void setValueTest() {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    (new JsonNumber()).setValue("null");
  }

  @Test
  public void getBigDecimalTest() {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    (new JsonNumber()).getBigDecimal();
  }

  @Test
  public void getIntegerTest() {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    (new JsonNumber()).getInteger();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("null", (new JsonNumber()).toString());
  }
}
