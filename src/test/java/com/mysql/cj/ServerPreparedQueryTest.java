package com.mysql.cj;

import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.conf.HostInfo;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ServerPreparedQueryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new ServerPreparedQuery(new NativeSession(hostInfo, new DefaultPropertySet()));
  }
  @Test
  public void getInstanceTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ServerPreparedQuery.getInstance(new NativeSession(hostInfo, new DefaultPropertySet()));
  }
}
