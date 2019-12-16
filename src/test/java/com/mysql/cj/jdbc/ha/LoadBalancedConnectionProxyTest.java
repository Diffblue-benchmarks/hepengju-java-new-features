package com.mysql.cj.jdbc.ha;

import com.mysql.cj.conf.url.LoadbalanceConnectionUrl;
import java.sql.SQLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LoadBalancedConnectionProxyTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new LoadBalancedConnectionProxy(null);
  }
  @Test
  public void createProxyInstanceTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    LoadBalancedConnectionProxy.createProxyInstance(null);
  }
}
