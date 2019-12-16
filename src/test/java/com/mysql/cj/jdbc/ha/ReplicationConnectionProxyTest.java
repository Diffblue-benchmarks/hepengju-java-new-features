package com.mysql.cj.jdbc.ha;

import com.mysql.cj.conf.url.ReplicationConnectionUrl;
import java.sql.SQLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ReplicationConnectionProxyTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void createProxyInstanceTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    ReplicationConnectionProxy.createProxyInstance(null);
  }
}
