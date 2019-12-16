package com.mysql.cj.jdbc.ha;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ServerAffinityStrategyTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServerAffinityStrategy(",")).affinityOrderedServers.length);
  }
}
