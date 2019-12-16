package com.mysql.cj.jdbc.ha;

import static org.junit.Assert.assertNull;
import java.sql.SQLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LoadBalancedMySQLConnectionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void unwrapTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new LoadBalancedMySQLConnection(null)).<Object>unwrap(null);
  }

  @Test
  public void isWrapperForTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new LoadBalancedMySQLConnection(null)).isWrapperFor(null);
  }

  @Test
  public void removeHostWhenNotInUseTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new LoadBalancedMySQLConnection(null)).removeHostWhenNotInUse("aaaaa");
  }

  @Test
  public void removeHostTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new LoadBalancedMySQLConnection(null)).removeHost("aaaaa");
  }

  @Test
  public void addHostTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new LoadBalancedMySQLConnection(null)).addHost("aaaaa");
  }

  @Test
  public void pingTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new LoadBalancedMySQLConnection(null)).ping(true);
  }

  @Test
  public void pingTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new LoadBalancedMySQLConnection(null)).ping();
  }

  @Test
  public void closeTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new LoadBalancedMySQLConnection(null)).close();
  }

  @Test
  public void getThisAsProxyTest() {
    // Arrange, Act and Assert
    assertNull((new LoadBalancedMySQLConnection(null)).getThisAsProxy());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new LoadBalancedMySQLConnection(null)).getThisAsProxy());
  }
}
