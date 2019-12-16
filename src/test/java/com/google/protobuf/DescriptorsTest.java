package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DescriptorsTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest2() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new Descriptors.FileDescriptor("\".", null);
  }

  @Test
  public void internalUpdateFileDescriptorTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Descriptors.FileDescriptor.internalUpdateFileDescriptor(null, ExtensionRegistry.getEmptyRegistry());
  }

  @Test
  public void buildFromTest2() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Descriptors.FileDescriptor.buildFrom(DescriptorProtos.FileDescriptorProto.getDefaultInstance(),
        new Descriptors.FileDescriptor[]{null, null, null}, true);
  }

  @Test
  public void buildFromTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Descriptors.FileDescriptor.buildFrom(DescriptorProtos.FileDescriptorProto.getDefaultInstance(),
        new Descriptors.FileDescriptor[]{null, null, null});
  }

  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertEquals(Descriptors.FieldDescriptor.Type.DOUBLE,
        Descriptors.FieldDescriptor.Type.valueOf(DescriptorProtos.FieldDescriptorProto.Type.TYPE_DOUBLE));
  }

  @Test
  public void getJavaTypeTest() {
    // Arrange, Act and Assert
    assertEquals(Descriptors.FieldDescriptor.JavaType.DOUBLE, Descriptors.FieldDescriptor.Type.DOUBLE.getJavaType());
  }

  @Test
  public void toProtoTest() {
    // Arrange, Act and Assert
    assertEquals(DescriptorProtos.FieldDescriptorProto.Type.TYPE_DOUBLE,
        Descriptors.FieldDescriptor.Type.DOUBLE.toProto());
  }

  @Test
  public void constructorTest() throws Descriptors.DescriptorValidationException {
    // Arrange and Act
    Descriptors.Descriptor actualDescriptor = new Descriptors.Descriptor("aaaaa");

    // Assert
    DescriptorProtos.DescriptorProto toProtoResult = actualDescriptor.toProto();
    String actualName = actualDescriptor.getName();
    int actualIndex = actualDescriptor.getIndex();
    DescriptorProtos.MessageOptions expectedOptions = actualDescriptor.getOptions();
    String actualFullName = actualDescriptor.getFullName();
    Descriptors.Descriptor actualContainingType = actualDescriptor.getContainingType();
    String actualName1 = toProtoResult.getName();
    int actualEnumTypeCount = toProtoResult.getEnumTypeCount();
    int actualSerializedSize = toProtoResult.getSerializedSize();
    int actualExtensionCount = toProtoResult.getExtensionCount();
    boolean actualHasOptionsResult = toProtoResult.hasOptions();
    int actualReservedRangeCount = toProtoResult.getReservedRangeCount();
    DescriptorProtos.MessageOptions actualOptions = toProtoResult.getOptions();
    int actualReservedNameCount = toProtoResult.getReservedNameCount();
    int actualNestedTypeCount = toProtoResult.getNestedTypeCount();
    int actualExtensionRangeCount = toProtoResult.getExtensionRangeCount();
    int actualOneofDeclCount = toProtoResult.getOneofDeclCount();
    assertNull(actualContainingType);
    assertEquals("aaaaa", actualName);
    assertEquals(0, actualIndex);
    assertEquals("aaaaa", actualFullName);
    assertEquals(0, actualNestedTypeCount);
    assertEquals(0, actualReservedNameCount);
    assertSame(expectedOptions, actualOptions);
    assertEquals(0, actualReservedRangeCount);
    assertFalse(actualHasOptionsResult);
    assertEquals(0, actualExtensionCount);
    assertEquals(17, actualSerializedSize);
    assertEquals(0, actualEnumTypeCount);
    assertEquals("aaaaa", actualName1);
    assertEquals(1, actualExtensionRangeCount);
    assertEquals("name: \"aaaaa\"\nextension_range {\n  start: 1\n  end: 536870912\n}\n", toProtoResult.toString());
    assertEquals(0, actualOneofDeclCount);
  }

  @Test
  public void findEnumTypeByNameTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertNull((new Descriptors.Descriptor("aaaaa")).findEnumTypeByName("aaaaa"));
  }

  @Test
  public void findNestedTypeByNameTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertNull((new Descriptors.Descriptor("aaaaa")).findNestedTypeByName("aaaaa"));
  }

  @Test
  public void findFieldByNumberTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertNull((new Descriptors.Descriptor("aaaaa")).findFieldByNumber(1));
  }

  @Test
  public void findFieldByNameTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertNull((new Descriptors.Descriptor("aaaaa")).findFieldByName("aaaaa"));
  }

  @Test
  public void isExtendableTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertTrue((new Descriptors.Descriptor("aaaaa")).isExtendable());
  }

  @Test
  public void isReservedNameTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertFalse((new Descriptors.Descriptor("aaaaa")).isReservedName("aaaaa"));
  }

  @Test
  public void isReservedNumberTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertFalse((new Descriptors.Descriptor("aaaaa")).isReservedNumber(1));
  }

  @Test
  public void isExtensionNumberTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertTrue((new Descriptors.Descriptor("aaaaa")).isExtensionNumber(1));
  }

  @Test
  public void getEnumTypesTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertEquals(0, (new Descriptors.Descriptor("aaaaa")).getEnumTypes().size());
  }

  @Test
  public void getNestedTypesTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertEquals(0, (new Descriptors.Descriptor("aaaaa")).getNestedTypes().size());
  }

  @Test
  public void getExtensionsTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertEquals(0, (new Descriptors.Descriptor("aaaaa")).getExtensions().size());
  }

  @Test
  public void getOneofsTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertEquals(0, (new Descriptors.Descriptor("aaaaa")).getOneofs().size());
  }

  @Test
  public void getFieldsTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertEquals(0, (new Descriptors.Descriptor("aaaaa")).getFields().size());
  }

  @Test
  public void getContainingTypeTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertNull((new Descriptors.Descriptor("aaaaa")).getContainingType());
  }

  @Test
  public void getFullNameTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new Descriptors.Descriptor("aaaaa")).getFullName());
  }

  @Test
  public void getNameTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new Descriptors.Descriptor("aaaaa")).getName());
  }

  @Test
  public void getIndexTest() throws Descriptors.DescriptorValidationException {
    // Arrange, Act and Assert
    assertEquals(0, (new Descriptors.Descriptor("aaaaa")).getIndex());
  }
}
