package com.mysql.cj.xdevapi;

import com.mysql.cj.conf.ConnectionUrl;
import com.mysql.cj.conf.url.FailoverConnectionUrl;
import com.mysql.cj.exceptions.UnsupportedConnectionStringException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SessionFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getSessionTest2() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedConnectionStringException.class);
    (new SessionFactory()).getSession("aaaaa");
  }
  @Test
  public void getSessionTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SessionFactory()).getSession((ConnectionUrl) null);
  }
  @Test
  public void parseUrlTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedConnectionStringException.class);
    (new SessionFactory()).parseUrl("aaaaa");
  }
}
