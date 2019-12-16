package com.mysql.cj.xdevapi;

import com.mysql.cj.exceptions.UnsupportedConnectionStringException;
import com.mysql.cj.exceptions.WrongArgumentException;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ClientImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedConnectionStringException.class);
    new ClientImpl("aaaaa", (Properties) null);
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    new ClientImpl("aaaaa", "aaaaa");
  }
}
