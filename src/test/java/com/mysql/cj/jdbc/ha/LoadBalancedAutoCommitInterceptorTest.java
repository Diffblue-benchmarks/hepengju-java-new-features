package com.mysql.cj.jdbc.ha;

import static org.junit.Assert.assertFalse;
import com.mysql.cj.interceptors.QueryInterceptor;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.log.Jdk14Logger;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LoadBalancedAutoCommitInterceptorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void initTest() {
    // Arrange
    LoadBalancedAutoCommitInterceptor loadBalancedAutoCommitInterceptor = new LoadBalancedAutoCommitInterceptor();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    loadBalancedAutoCommitInterceptor.init(null, null, new Jdk14Logger(""));
  }

  @Test
  public void executeTopLevelOnlyTest() {
    // Arrange, Act and Assert
    assertFalse((new LoadBalancedAutoCommitInterceptor()).executeTopLevelOnly());
  }
}
