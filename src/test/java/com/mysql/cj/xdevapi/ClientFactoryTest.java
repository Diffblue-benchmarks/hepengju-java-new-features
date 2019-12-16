package com.mysql.cj.xdevapi;

import com.mysql.cj.exceptions.UnsupportedConnectionStringException;
import com.mysql.cj.exceptions.WrongArgumentException;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ClientFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getClientTest2() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedConnectionStringException.class);
    (new ClientFactory()).getClient("aaaaa", (Properties) null);
  }
  @Test
  public void getClientTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ClientFactory()).getClient("aaaaa", "aaaaa");
  }
}
