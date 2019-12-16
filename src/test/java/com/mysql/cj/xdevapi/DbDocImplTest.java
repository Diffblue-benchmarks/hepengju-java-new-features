package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DbDocImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void addTest() {
    // Arrange
    DbDocImpl dbDocImpl = new DbDocImpl();
    DbDocImpl dbDocImpl1 = new DbDocImpl();
    dbDocImpl1.put("{", null);
    dbDocImpl.put("{", dbDocImpl1);

    // Act and Assert
    assertEquals(1, dbDocImpl.add("{", null).size());
  }

  @Test
  public void toFormattedStringTest() {
    // Arrange
    DbDocImpl dbDocImpl = new DbDocImpl();
    DbDocImpl dbDocImpl1 = new DbDocImpl();
    dbDocImpl1.put("{", null);
    dbDocImpl.put("{", dbDocImpl1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    dbDocImpl.toFormattedString();
  }

  @Test
  public void toStringTest() {
    // Arrange
    DbDocImpl dbDocImpl = new DbDocImpl();
    DbDocImpl dbDocImpl1 = new DbDocImpl();
    dbDocImpl1.put("{", null);
    dbDocImpl.put("{", dbDocImpl1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    dbDocImpl.toString();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DbDocImpl()).size());
  }
}
