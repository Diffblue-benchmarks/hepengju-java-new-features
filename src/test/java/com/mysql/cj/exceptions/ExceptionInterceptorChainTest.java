package com.mysql.cj.exceptions;

import com.mysql.cj.log.Jdk14Logger;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionInterceptorChainTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    new ExceptionInterceptorChain("aaaaa", null, new Jdk14Logger("aaaaa"));
  }
}
