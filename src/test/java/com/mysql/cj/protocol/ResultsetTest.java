package com.mysql.cj.protocol;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ResultsetTest {
  @Test
  public void fromValueTest2() {
    // Arrange, Act and Assert
    assertEquals(Resultset.Type.FORWARD_ONLY, Resultset.Type.fromValue(1, Resultset.Type.FORWARD_ONLY));
  }

  @Test
  public void getIntValueTest2() {
    // Arrange, Act and Assert
    assertEquals(1003, Resultset.Type.FORWARD_ONLY.getIntValue());
  }

  @Test
  public void fromValueTest() {
    // Arrange, Act and Assert
    assertEquals(Resultset.Concurrency.READ_ONLY, Resultset.Concurrency.fromValue(1, Resultset.Concurrency.READ_ONLY));
  }

  @Test
  public void getIntValueTest() {
    // Arrange, Act and Assert
    assertEquals(1007, Resultset.Concurrency.READ_ONLY.getIntValue());
  }
}
