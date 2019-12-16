package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FieldSetTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void computeElementSizeNoTagTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    FieldSet.computeElementSizeNoTag(WireFormat.FieldType.DOUBLE, "aaaaa");
  }

  @Test
  public void computeElementSizeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    FieldSet.computeElementSize(WireFormat.FieldType.DOUBLE, 1, "aaaaa");
  }

  @Test
  public void writeElementNoTagTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    FieldSet.writeElementNoTag(null, WireFormat.FieldType.DOUBLE, "aaaaa");
  }

  @Test
  public void writeElementTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    FieldSet.writeElement(null, WireFormat.FieldType.DOUBLE, 1, "aaaaa");
  }

  @Test
  public void readPrimitiveFieldTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    FieldSet.readPrimitiveField(null, WireFormat.FieldType.DOUBLE, true);
  }

  @Test
  public void getWireFormatForFieldTypeTest() {
    // Arrange, Act and Assert
    assertEquals(2, FieldSet.getWireFormatForFieldType(WireFormat.FieldType.DOUBLE, true));
  }
}
