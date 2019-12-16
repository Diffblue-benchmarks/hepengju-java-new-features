package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MapEntryLiteTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange and Act
    MapEntryLite.Metadata<Object, Object> actualMetadata = new MapEntryLite.Metadata<Object, Object>(
        WireFormat.FieldType.DOUBLE, "aaaaa", WireFormat.FieldType.DOUBLE, null);

    // Assert
    assertTrue(actualMetadata.defaultKey instanceof String);
    assertNull(actualMetadata.defaultValue);
    assertEquals(WireFormat.FieldType.DOUBLE, actualMetadata.valueType);
    assertEquals(WireFormat.FieldType.DOUBLE, actualMetadata.keyType);
  }
  @Test
  public void parseFieldTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MapEntryLite.<Object>parseField(null, ExtensionRegistryLite.getEmptyRegistry(), WireFormat.FieldType.DOUBLE,
        "aaaaa");
  }
  @Test
  public void computeSerializedSizeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    MapEntryLite.<Object, Object>computeSerializedSize(new MapEntryLite.Metadata<Object, Object>(
        WireFormat.FieldType.DOUBLE, "aaaaa", WireFormat.FieldType.DOUBLE, "aaaaa"), "aaaaa", "aaaaa");
  }
  @Test
  public void writeToTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MapEntryLite.<Object, Object>writeTo(null, new MapEntryLite.Metadata<Object, Object>(WireFormat.FieldType.DOUBLE,
        "aaaaa", WireFormat.FieldType.DOUBLE, "aaaaa"), null, "aaaaa");
  }
}
