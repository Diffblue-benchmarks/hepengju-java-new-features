package com.mysql.cj.conf;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MemorySizePropertyTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new MemorySizeProperty(null);
  }
}
