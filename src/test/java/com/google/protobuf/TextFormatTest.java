package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TextFormatTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getUnknownFieldTest() {
    // Arrange, Act and Assert
    assertEquals("", (new TextFormat.UnknownFieldParseException("")).getUnknownField());
  }
  @Test
  public void constructorTest4() {
    // Arrange and Act
    TextFormat.UnknownFieldParseException actualUnknownFieldParseException = new TextFormat.UnknownFieldParseException(
        1, 1, "", "");

    // Assert
    int actualColumn = actualUnknownFieldParseException.getColumn();
    String actualUnknownField = actualUnknownFieldParseException.getUnknownField();
    assertEquals(1, actualColumn);
    assertEquals(1, actualUnknownFieldParseException.getLine());
    assertEquals("", actualUnknownField);
  }
  @Test
  public void constructorTest3() {
    // Arrange and Act
    TextFormat.UnknownFieldParseException actualUnknownFieldParseException = new TextFormat.UnknownFieldParseException(
        "");

    // Assert
    int actualColumn = actualUnknownFieldParseException.getColumn();
    String actualUnknownField = actualUnknownFieldParseException.getUnknownField();
    assertEquals(-1, actualColumn);
    assertEquals(-1, actualUnknownFieldParseException.getLine());
    assertEquals("", actualUnknownField);
  }
  @Test
  public void getColumnTest() {
    // Arrange, Act and Assert
    assertEquals(-1, (new TextFormat.ParseException(":")).getColumn());
  }
  @Test
  public void getLineTest() {
    // Arrange, Act and Assert
    assertEquals(-1, (new TextFormat.ParseException(":")).getLine());
  }
  @Test
  public void constructorTest2() {
    // Arrange and Act
    TextFormat.ParseException actualParseException = new TextFormat.ParseException(1, 1, ":");

    // Assert
    int actualColumn = actualParseException.getColumn();
    assertEquals(1, actualColumn);
    assertEquals(1, actualParseException.getLine());
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    TextFormat.ParseException actualParseException = new TextFormat.ParseException(":");

    // Assert
    int actualColumn = actualParseException.getColumn();
    assertEquals(-1, actualColumn);
    assertEquals(-1, actualParseException.getLine());
  }
  @Test
  public void parseUInt64Test() throws NumberFormatException {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    TextFormat.parseUInt64("-");
  }
  @Test
  public void parseInt64Test() throws NumberFormatException {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    TextFormat.parseInt64("-");
  }
  @Test
  public void parseUInt32Test() throws NumberFormatException {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    TextFormat.parseUInt32("-");
  }
  @Test
  public void parseInt32Test() throws NumberFormatException {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    TextFormat.parseInt32("-");
  }
  @Test
  public void unescapeTextTest() throws TextFormat.InvalidEscapeSequenceException {
    // Arrange, Act and Assert
    assertEquals("-", TextFormat.unescapeText("-"));
  }
  @Test
  public void escapeDoubleQuotesAndBackslashesTest() {
    // Arrange, Act and Assert
    assertEquals("-", TextFormat.escapeDoubleQuotesAndBackslashes("-"));
  }
  @Test
  public void escapeTextTest() {
    // Arrange, Act and Assert
    assertEquals("-", TextFormat.escapeText("-"));
  }
  @Test
  public void escapeBytesTest() {
    // Arrange, Act and Assert
    assertEquals(
        "\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000",
        TextFormat.escapeBytes(new byte[24]));
  }
  @Test
  public void unsignedToStringTest2() {
    // Arrange, Act and Assert
    assertEquals("1", TextFormat.unsignedToString(1L));
  }
  @Test
  public void unsignedToStringTest() {
    // Arrange, Act and Assert
    assertEquals("1", TextFormat.unsignedToString(1));
  }
  @Test
  public void printFieldToStringTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    TextFormat.printFieldToString(null, "-");
  }
  @Test
  public void printToUnicodeStringTest2() {
    // Arrange, Act and Assert
    assertEquals("", TextFormat.printToUnicodeString(UnknownFieldSet.getDefaultInstance()));
  }
  @Test
  public void printToUnicodeStringTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    TextFormat.printToUnicodeString((MessageOrBuilder) null);
  }
  @Test
  public void printToStringTest2() {
    // Arrange, Act and Assert
    assertEquals("", TextFormat.printToString(UnknownFieldSet.getDefaultInstance()));
  }
  @Test
  public void printToStringTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    TextFormat.printToString((MessageOrBuilder) null);
  }
  @Test
  public void shortDebugStringTest3() {
    // Arrange, Act and Assert
    assertEquals("", TextFormat.shortDebugString(UnknownFieldSet.getDefaultInstance()));
  }
  @Test
  public void shortDebugStringTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    TextFormat.shortDebugString(null, "-");
  }
  @Test
  public void shortDebugStringTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    TextFormat.shortDebugString((MessageOrBuilder) null);
  }
}
