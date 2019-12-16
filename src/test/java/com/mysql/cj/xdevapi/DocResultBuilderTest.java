package com.mysql.cj.xdevapi;

import com.mysql.cj.MysqlxSession;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DocResultBuilderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new DocResultBuilder(null);
  }
}
