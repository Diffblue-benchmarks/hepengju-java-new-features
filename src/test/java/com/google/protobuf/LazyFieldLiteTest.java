package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LazyFieldLiteTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void ensureInitializedTest() {
    // Arrange
    LazyFieldLite lazyFieldLite = new LazyFieldLite();

    // Act
    lazyFieldLite.ensureInitialized(null);

    // Assert
    assertEquals(0, lazyFieldLite.getSerializedSize());
    assertNull(lazyFieldLite.value);
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new LazyFieldLite()).getSerializedSize());
  }

  @Test
  public void mergeFromTest() throws IOException {
    // Arrange
    LazyFieldLite lazyFieldLite = new LazyFieldLite();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    lazyFieldLite.mergeFrom(null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void mergeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new LazyFieldLite()).merge(null);
  }

  @Test
  public void setValueTest() {
    // Arrange
    LazyFieldLite lazyFieldLite = new LazyFieldLite();

    // Act and Assert
    assertNull(lazyFieldLite.setValue(null));
    assertEquals(0, lazyFieldLite.getSerializedSize());
    assertNull(lazyFieldLite.value);
  }

  @Test
  public void getValueTest() {
    // Arrange
    LazyFieldLite lazyFieldLite = new LazyFieldLite();

    // Act and Assert
    assertNull(lazyFieldLite.getValue(null));
    assertEquals(0, lazyFieldLite.getSerializedSize());
    assertNull(lazyFieldLite.value);
  }

  @Test
  public void setTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new LazyFieldLite()).set(null);
  }

  @Test
  public void clearTest() {
    // Arrange
    LazyFieldLite lazyFieldLite = new LazyFieldLite();

    // Act
    lazyFieldLite.clear();

    // Assert
    assertEquals(0, lazyFieldLite.getSerializedSize());
    assertNull(lazyFieldLite.value);
  }

  @Test
  public void containsDefaultInstanceTest() {
    // Arrange, Act and Assert
    assertTrue((new LazyFieldLite()).containsDefaultInstance());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new LazyFieldLite()).hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new LazyFieldLite()).equals("aaaaa"));
  }

  @Test
  public void fromValueTest() {
    // Arrange and Act
    LazyFieldLite actualFromValueResult = LazyFieldLite.fromValue(null);

    // Assert
    assertEquals(0, actualFromValueResult.getSerializedSize());
    assertNull(actualFromValueResult.value);
  }
}
