package com.mysql.cj.log;

import com.mysql.cj.exceptions.WrongArgumentException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LogFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getLoggerTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    LogFactory.getLogger("aaaaa", "aaaaa");
  }
}
