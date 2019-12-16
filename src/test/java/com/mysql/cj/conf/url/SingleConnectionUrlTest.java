package com.mysql.cj.conf.url;

import com.mysql.cj.conf.ConnectionUrlParser;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SingleConnectionUrlTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new SingleConnectionUrl(null, null);
  }
}
