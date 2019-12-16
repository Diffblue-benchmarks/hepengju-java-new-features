package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SyntaxTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void valueOfTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Syntax.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertEquals(Syntax.SYNTAX_PROTO3, Syntax.forNumber(1));
  }

  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertEquals(Syntax.SYNTAX_PROTO3, Syntax.valueOf(1));
  }

  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(0, Syntax.SYNTAX_PROTO2.getNumber());
  }
}
