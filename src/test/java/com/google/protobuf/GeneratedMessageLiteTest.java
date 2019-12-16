package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GeneratedMessageLiteTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new GeneratedMessageLite.SerializedForm(null);
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new GeneratedMessageLite.HashCodeVisitor()).hashCode);
  }
}
