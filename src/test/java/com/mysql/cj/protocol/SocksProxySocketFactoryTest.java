package com.mysql.cj.protocol;

import com.mysql.cj.conf.DefaultPropertySet;
import java.net.Socket;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SocksProxySocketFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void createSocketTest() {
    // Arrange
    SocksProxySocketFactory socksProxySocketFactory = new SocksProxySocketFactory();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    socksProxySocketFactory.createSocket(new DefaultPropertySet());
  }
}
