package com.mysql.cj;

import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.conf.HostInfo;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ClientPreparedQueryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    HostInfo hostInfo = new HostInfo();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new ClientPreparedQuery(new NativeSession(hostInfo, new DefaultPropertySet()));
  }
}
