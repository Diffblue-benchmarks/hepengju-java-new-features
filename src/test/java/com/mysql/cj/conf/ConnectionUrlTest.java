package com.mysql.cj.conf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.mysql.cj.exceptions.UnsupportedConnectionStringException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ConnectionUrlTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void isSupportedTest() {
    // Arrange, Act and Assert
    assertFalse(ConnectionUrl.Type.isSupported("FAILOVER_CONNECTION"));
  }

  @Test
  public void fromValueTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedConnectionStringException.class);
    ConnectionUrl.Type.fromValue("FAILOVER_CONNECTION", 1);
  }

  @Test
  public void getCardinalityTest() {
    // Arrange, Act and Assert
    assertEquals(ConnectionUrl.HostsCardinality.SINGLE, ConnectionUrl.Type.SINGLE_CONNECTION.getCardinality());
  }

  @Test
  public void getSchemeTest() {
    // Arrange, Act and Assert
    assertEquals("jdbc:mysql:", ConnectionUrl.Type.SINGLE_CONNECTION.getScheme());
  }
}
