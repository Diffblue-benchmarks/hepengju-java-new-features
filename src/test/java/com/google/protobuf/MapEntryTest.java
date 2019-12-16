package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MapEntryTest {
  @Test
  public void newDefaultInstanceTest() throws Descriptors.DescriptorValidationException {
    // Arrange and Act
    MapEntry<Object, Object> actualNewDefaultInstanceResult = MapEntry.<Object, Object>newDefaultInstance(
        new Descriptors.Descriptor("aaaaa"), WireFormat.FieldType.DOUBLE, "aaaaa", WireFormat.FieldType.DOUBLE, null);

    // Assert
    MapEntry<Object, Object> defaultInstanceForType = actualNewDefaultInstanceResult.getDefaultInstanceForType();
    Object actualValue = actualNewDefaultInstanceResult.getValue();
    int actualMemoizedSerializedSize = actualNewDefaultInstanceResult.getMemoizedSerializedSize();
    Object key = actualNewDefaultInstanceResult.getKey();
    assertEquals("", actualNewDefaultInstanceResult.getInitializationErrorString());
    boolean actualIsInitializedResult = defaultInstanceForType.isInitialized();
    assertNull(actualValue);
    assertEquals(-1, actualMemoizedSerializedSize);
    assertTrue(key instanceof String);
    assertEquals("", defaultInstanceForType.getInitializationErrorString());
    assertTrue(actualIsInitializedResult);
  }
}
