package com.mysql.jdbc;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SocketFactoryWrapperTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    new SocketFactoryWrapper("aaaaa");
  }
}
