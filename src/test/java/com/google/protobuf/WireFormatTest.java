package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WireFormatTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getDefaultDefaultTest() {
    // Arrange, Act and Assert
    assertEquals(Integer.valueOf(0), WireFormat.JavaType.INT.getDefaultDefault());
  }

  @Test
  public void isPackableTest() {
    // Arrange, Act and Assert
    assertTrue(WireFormat.FieldType.DOUBLE.isPackable());
  }

  @Test
  public void getWireTypeTest() {
    // Arrange, Act and Assert
    assertEquals(1, WireFormat.FieldType.DOUBLE.getWireType());
  }

  @Test
  public void getJavaTypeTest() {
    // Arrange, Act and Assert
    assertEquals(WireFormat.JavaType.DOUBLE, WireFormat.FieldType.DOUBLE.getJavaType());
  }

  @Test
  public void readPrimitiveFieldTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    WireFormat.readPrimitiveField(null, WireFormat.FieldType.DOUBLE, WireFormat.Utf8Validation.LOOSE);
  }

  @Test
  public void makeTagTest() {
    // Arrange, Act and Assert
    assertEquals(9, WireFormat.makeTag(1, 1));
  }

  @Test
  public void getTagFieldNumberTest() {
    // Arrange, Act and Assert
    assertEquals(0, WireFormat.getTagFieldNumber(1));
  }

  @Test
  public void getTagWireTypeTest() {
    // Arrange, Act and Assert
    assertEquals(1, WireFormat.getTagWireType(1));
  }
}
