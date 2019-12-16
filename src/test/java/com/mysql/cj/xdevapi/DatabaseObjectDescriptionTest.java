package com.mysql.cj.xdevapi;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DatabaseObjectDescriptionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new DatabaseObjectDescription("aaaaa", "aaaaa");
  }
}
