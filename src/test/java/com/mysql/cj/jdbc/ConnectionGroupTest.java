package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ConnectionGroupTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void addHostTest2() {
    // Arrange
    ConnectionGroup connectionGroup = new ConnectionGroup("aaaaa");

    // Act
    connectionGroup.addHost("aaaaa", true);

    // Assert
    assertEquals(1, connectionGroup.getActiveHostCount());
  }

  @Test
  public void addHostTest() {
    // Arrange
    ConnectionGroup connectionGroup = new ConnectionGroup("aaaaa");

    // Act
    connectionGroup.addHost("aaaaa");

    // Assert
    assertEquals(1, connectionGroup.getActiveHostCount());
  }

  @Test
  public void removeHostTest3() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new ConnectionGroup("aaaaa")).removeHost("aaaaa", true, true);
  }

  @Test
  public void removeHostTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new ConnectionGroup("aaaaa")).removeHost("aaaaa", true);
  }

  @Test
  public void removeHostTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new ConnectionGroup("aaaaa")).removeHost("aaaaa");
  }

  @Test
  public void closeConnectionProxyTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionGroup("aaaaa")).closeConnectionProxy(null);
  }

  @Test
  public void getTotalTransactionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConnectionGroup("aaaaa")).getTotalTransactionCount());
  }

  @Test
  public void getTotalPhysicalConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConnectionGroup("aaaaa")).getTotalPhysicalConnectionCount());
  }

  @Test
  public void getActivePhysicalConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConnectionGroup("aaaaa")).getActivePhysicalConnectionCount());
  }

  @Test
  public void getActiveLogicalConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConnectionGroup("aaaaa")).getActiveLogicalConnectionCount());
  }

  @Test
  public void getTotalLogicalConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConnectionGroup("aaaaa")).getTotalLogicalConnectionCount());
  }

  @Test
  public void getClosedHostsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ConnectionGroup("aaaaa")).getClosedHosts().size());
  }

  @Test
  public void getActiveHostCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ConnectionGroup("aaaaa")).getActiveHostCount());
  }

  @Test
  public void getInitialHostsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ConnectionGroup("aaaaa")).getInitialHosts().size());
  }

  @Test
  public void getGroupNameTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new ConnectionGroup("aaaaa")).getGroupName());
  }

  @Test
  public void registerConnectionProxyTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ConnectionGroup("aaaaa")).registerConnectionProxy(null, null);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConnectionGroup actualConnectionGroup = new ConnectionGroup("aaaaa");

    // Assert
    String actualGroupName = actualConnectionGroup.getGroupName();
    long actualActiveLogicalConnectionCount = actualConnectionGroup.getActiveLogicalConnectionCount();
    long actualTotalTransactionCount = actualConnectionGroup.getTotalTransactionCount();
    long actualActivePhysicalConnectionCount = actualConnectionGroup.getActivePhysicalConnectionCount();
    int actualActiveHostCount = actualConnectionGroup.getActiveHostCount();
    long actualTotalLogicalConnectionCount = actualConnectionGroup.getTotalLogicalConnectionCount();
    assertEquals("aaaaa", actualGroupName);
    assertEquals(0L, actualConnectionGroup.getTotalPhysicalConnectionCount());
    assertEquals(0L, actualTotalLogicalConnectionCount);
    assertEquals(0, actualActiveHostCount);
    assertEquals(0L, actualActivePhysicalConnectionCount);
    assertEquals(0L, actualTotalTransactionCount);
    assertEquals(0L, actualActiveLogicalConnectionCount);
  }
}
