package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ClientTest {
  @Test
  public void getKeyNameTest() {
    // Arrange, Act and Assert
    assertEquals("pooling.enabled", Client.ClientProperty.POOLING_ENABLED.getKeyName());
  }
}
