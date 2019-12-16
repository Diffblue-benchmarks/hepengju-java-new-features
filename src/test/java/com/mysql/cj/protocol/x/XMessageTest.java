package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class XMessageTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void addNoticesTest() {
    // Arrange
    XMessage xMessage = new XMessage(new XMessage(new XMessage(new XMessage(null))));

    // Act and Assert
    assertSame(xMessage, xMessage.addNotices(null));
  }

  @Test
  public void getNoticesTest() {
    // Arrange, Act and Assert
    assertNull((new XMessage(new XMessage(new XMessage(new XMessage(null))))).getNotices());
  }

  @Test
  public void toBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).toBuilder();
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).newBuilderForType();
  }

  @Test
  public void getParserForTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).getParserForType();
  }

  @Test
  public void hasOneofTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).hasOneof(null);
  }

  @Test
  public void hasFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).hasField(null);
  }

  @Test
  public void getUnknownFieldsTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).getUnknownFields();
  }

  @Test
  public void getRepeatedFieldCountTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).getRepeatedFieldCount(null);
  }

  @Test
  public void getRepeatedFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).getRepeatedField(null, 1);
  }

  @Test
  public void getOneofFieldDescriptorTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).getOneofFieldDescriptor(null);
  }

  @Test
  public void getInitializationErrorStringTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).getInitializationErrorString();
  }

  @Test
  public void getFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).getField(null);
  }

  @Test
  public void getDescriptorForTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).getDescriptorForType();
  }

  @Test
  public void getDefaultInstanceForTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).getDefaultInstanceForType();
  }

  @Test
  public void getAllFieldsTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).getAllFields();
  }

  @Test
  public void findInitializationErrorsTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).findInitializationErrors();
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).isInitialized();
  }

  @Test
  public void writeToTest2() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).writeTo((OutputStream) null);
  }

  @Test
  public void writeToTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).writeTo((CodedOutputStream) null);
  }

  @Test
  public void writeDelimitedToTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).writeDelimitedTo(null);
  }

  @Test
  public void toByteStringTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).toByteString();
  }

  @Test
  public void toByteArrayTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).toByteArray();
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).getSerializedSize();
  }

  @Test
  public void getPositionTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new XMessage(new XMessage(new XMessage(new XMessage(null))))).getPosition());
  }

  @Test
  public void getByteBufferTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessage(new XMessage(new XMessage(new XMessage(null))))).getByteBuffer();
  }

  @Test
  public void getMessageTest() {
    // Arrange
    XMessage xMessage = new XMessage(new XMessage(new XMessage(null)));

    // Act and Assert
    assertSame(xMessage, (new XMessage(xMessage)).getMessage());
  }

  @Test
  public void constructorTest() {
    // Arrange
    XMessage xMessage = new XMessage(null);

    // Act
    XMessage actualXMessage = new XMessage(xMessage);

    // Assert
    Message actualMessage = actualXMessage.getMessage();
    assertNull(actualXMessage.getNotices());
    assertSame(xMessage, actualMessage);
  }
}
