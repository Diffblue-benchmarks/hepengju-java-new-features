package com.mysql.cj.jdbc.ha;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NdbLoadBalanceExceptionCheckerTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void shouldExceptionTriggerFailoverTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new NdbLoadBalanceExceptionChecker()).shouldExceptionTriggerFailover(null);
  }
}
