package com.mysql.cj;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ServerPreparedQueryBindingsTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new ServerPreparedQueryBindings(1, null);
  }
}
