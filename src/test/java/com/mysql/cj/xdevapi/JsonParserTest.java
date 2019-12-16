package com.mysql.cj.xdevapi;

import com.mysql.cj.exceptions.WrongArgumentException;
import java.io.IOException;
import java.io.StringReader;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JsonParserTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void parseLiteralTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    JsonParser.parseLiteral(null);
  }
  @Test
  public void parseNumberTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    JsonParser.parseNumber(null);
  }
  @Test
  public void parseStringTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    JsonParser.parseString(null);
  }
  @Test
  public void parseArrayTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    JsonParser.parseArray(null);
  }
  @Test
  public void parseDocTest2() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    JsonParser.parseDoc((StringReader) null);
  }
  @Test
  public void parseDocTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    JsonParser.parseDoc("aaaaa");
  }
}
