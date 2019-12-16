package com.mysql.cj.jdbc.jmx;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LoadBalanceConnectionGroupManagerTest {
  @Test
  public void getRegisteredConnectionGroupsTest() {
    // Arrange, Act and Assert
    assertEquals("", (new LoadBalanceConnectionGroupManager()).getRegisteredConnectionGroups());
  }

  @Test
  public void getActiveHostsListTest() {
    // Arrange, Act and Assert
    assertEquals("", (new LoadBalanceConnectionGroupManager())
        .getActiveHostsList("com.mysql.cj.jdbc.jmx:type=LoadBalanceConnectionGroupManager"));
  }

  @Test
  public void getTotalTransactionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new LoadBalanceConnectionGroupManager())
        .getTotalTransactionCount("com.mysql.cj.jdbc.jmx:type=LoadBalanceConnectionGroupManager"));
  }

  @Test
  public void getTotalPhysicalConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new LoadBalanceConnectionGroupManager())
        .getTotalPhysicalConnectionCount("com.mysql.cj.jdbc.jmx:type=LoadBalanceConnectionGroupManager"));
  }

  @Test
  public void getTotalLogicalConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new LoadBalanceConnectionGroupManager())
        .getTotalLogicalConnectionCount("com.mysql.cj.jdbc.jmx:type=LoadBalanceConnectionGroupManager"));
  }

  @Test
  public void getTotalHostCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new LoadBalanceConnectionGroupManager())
        .getTotalHostCount("com.mysql.cj.jdbc.jmx:type=LoadBalanceConnectionGroupManager"));
  }

  @Test
  public void getActivePhysicalConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new LoadBalanceConnectionGroupManager())
        .getActivePhysicalConnectionCount("com.mysql.cj.jdbc.jmx:type=LoadBalanceConnectionGroupManager"));
  }

  @Test
  public void getActiveLogicalConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new LoadBalanceConnectionGroupManager())
        .getActiveLogicalConnectionCount("com.mysql.cj.jdbc.jmx:type=LoadBalanceConnectionGroupManager"));
  }

  @Test
  public void getActiveHostCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new LoadBalanceConnectionGroupManager())
        .getActiveHostCount("com.mysql.cj.jdbc.jmx:type=LoadBalanceConnectionGroupManager"));
  }
}
