package com.mysql.cj;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MessagesTest {
  @Test
  public void getStringTest2() {
    // Arrange, Act and Assert
    assertEquals("!aaaaa!", Messages.getString("aaaaa", new Object[]{"aaaaa", "aaaaa", "aaaaa"}));
  }

  @Test
  public void getStringTest() {
    // Arrange, Act and Assert
    assertEquals("!aaaaa!", Messages.getString("aaaaa"));
  }
}
