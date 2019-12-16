package com.mysql.cj.conf.url;

import com.mysql.cj.conf.ConnectionUrlParser;
import com.mysql.cj.conf.HostInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ReplicationConnectionUrlTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new ReplicationConnectionUrl(null, null, null);
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new ReplicationConnectionUrl(null, null);
  }
}
