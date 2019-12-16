package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NullValueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void valueOfTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    NullValue.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertNull(NullValue.forNumber(1));
  }

  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertNull(NullValue.valueOf(1));
  }

  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(0, NullValue.NULL_VALUE.getNumber());
  }
}
