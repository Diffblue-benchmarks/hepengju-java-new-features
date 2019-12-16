package com.mysql.cj.jdbc.ha;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class StandardLoadBalanceExceptionCheckerTest {
  @Test
  public void shouldExceptionTriggerFailoverTest() {
    // Arrange, Act and Assert
    assertFalse((new StandardLoadBalanceExceptionChecker()).shouldExceptionTriggerFailover(null));
  }
}
