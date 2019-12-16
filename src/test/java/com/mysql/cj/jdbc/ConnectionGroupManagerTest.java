package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConnectionGroupManagerTest {
  @Test
  public void getRegisteredConnectionGroupsTest() {
    // Arrange, Act and Assert
    assertEquals("", ConnectionGroupManager.getRegisteredConnectionGroups());
  }

  @Test
  public void getActiveHostListsTest() {
    // Arrange, Act and Assert
    assertEquals("(1)", ConnectionGroupManager.getActiveHostLists(""));
  }

  @Test
  public void getTotalTransactionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, ConnectionGroupManager.getTotalTransactionCount(""));
  }

  @Test
  public void getTotalPhysicalConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, ConnectionGroupManager.getTotalPhysicalConnectionCount(""));
  }

  @Test
  public void getTotalLogicalConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, ConnectionGroupManager.getTotalLogicalConnectionCount(""));
  }

  @Test
  public void getTotalHostCountTest() {
    // Arrange, Act and Assert
    assertEquals(1, ConnectionGroupManager.getTotalHostCount(""));
  }

  @Test
  public void getActivePhysicalConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, ConnectionGroupManager.getActivePhysicalConnectionCount(""));
  }

  @Test
  public void getActiveLogicalConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, ConnectionGroupManager.getActiveLogicalConnectionCount(""));
  }

  @Test
  public void getActiveHostCountTest() {
    // Arrange, Act and Assert
    assertEquals(1, ConnectionGroupManager.getActiveHostCount(""));
  }
}
