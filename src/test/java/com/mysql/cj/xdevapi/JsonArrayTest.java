package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JsonArrayTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void addValueTest() {
    // Arrange
    JsonArray jsonArray = new JsonArray();
    DbDocImpl dbDocImpl = new DbDocImpl();
    dbDocImpl.put("[", null);
    jsonArray.add(dbDocImpl);

    // Act and Assert
    assertEquals(2, jsonArray.addValue(dbDocImpl).size());
  }

  @Test
  public void toFormattedStringTest() {
    // Arrange
    JsonArray jsonArray = new JsonArray();
    DbDocImpl dbDocImpl = new DbDocImpl();
    dbDocImpl.put("[", null);
    jsonArray.add(dbDocImpl);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    jsonArray.toFormattedString();
  }

  @Test
  public void toStringTest() {
    // Arrange
    JsonArray jsonArray = new JsonArray();
    DbDocImpl dbDocImpl = new DbDocImpl();
    dbDocImpl.put("[", null);
    jsonArray.add(dbDocImpl);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    jsonArray.toString();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new JsonArray()).size());
  }
}
