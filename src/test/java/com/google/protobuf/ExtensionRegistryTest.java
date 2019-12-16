package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.Set;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExtensionRegistryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void addTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    ExtensionRegistry.getEmptyRegistry().add(null, null);
  }

  @Test
  public void addTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    ExtensionRegistry.getEmptyRegistry().add((Descriptors.FieldDescriptor) null);
  }

  @Test
  public void getAllImmutableExtensionsByExtendedTypeTest() {
    // Arrange, Act and Assert
    assertEquals(0, ExtensionRegistry.getEmptyRegistry().getAllImmutableExtensionsByExtendedType("aaaaa").size());
  }

  @Test
  public void getAllMutableExtensionsByExtendedTypeTest() {
    // Arrange, Act and Assert
    assertEquals(0, ExtensionRegistry.getEmptyRegistry().getAllMutableExtensionsByExtendedType("aaaaa").size());
  }

  @Test
  public void findMutableExtensionByNumberTest() throws Descriptors.DescriptorValidationException {
    // Arrange
    ExtensionRegistry emptyRegistry = ExtensionRegistry.getEmptyRegistry();

    // Act and Assert
    assertNull(emptyRegistry.findMutableExtensionByNumber(new Descriptors.Descriptor("aaaaa"), 1));
  }

  @Test
  public void findImmutableExtensionByNumberTest() throws Descriptors.DescriptorValidationException {
    // Arrange
    ExtensionRegistry emptyRegistry = ExtensionRegistry.getEmptyRegistry();

    // Act and Assert
    assertNull(emptyRegistry.findImmutableExtensionByNumber(new Descriptors.Descriptor("aaaaa"), 1));
  }

  @Test
  public void findExtensionByNumberTest() throws Descriptors.DescriptorValidationException {
    // Arrange
    ExtensionRegistry emptyRegistry = ExtensionRegistry.getEmptyRegistry();

    // Act and Assert
    assertNull(emptyRegistry.findExtensionByNumber(new Descriptors.Descriptor("aaaaa"), 1));
  }

  @Test
  public void findMutableExtensionByNameTest() {
    // Arrange, Act and Assert
    assertNull(ExtensionRegistry.getEmptyRegistry().findMutableExtensionByName("aaaaa"));
  }

  @Test
  public void findImmutableExtensionByNameTest() {
    // Arrange, Act and Assert
    assertNull(ExtensionRegistry.getEmptyRegistry().findImmutableExtensionByName("aaaaa"));
  }

  @Test
  public void findExtensionByNameTest() {
    // Arrange, Act and Assert
    assertNull(ExtensionRegistry.getEmptyRegistry().findExtensionByName("aaaaa"));
  }
}
