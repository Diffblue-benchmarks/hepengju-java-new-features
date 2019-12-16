package com.mysql.cj.jdbc.jmx;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReplicationGroupManagerTest {
  @Test
  public void getActiveLogicalConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ReplicationGroupManager()).getActiveLogicalConnectionCount(""));
  }

  @Test
  public void getTotalLogicalConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ReplicationGroupManager()).getTotalLogicalConnectionCount(""));
  }

  @Test
  public void getSlavePromotionCountTest() {
    // Arrange, Act and Assert
    assertEquals(2, (new ReplicationGroupManager()).getSlavePromotionCount(""));
  }

  @Test
  public void getActiveSlaveHostCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ReplicationGroupManager()).getActiveSlaveHostCount(""));
  }

  @Test
  public void getActiveMasterHostCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ReplicationGroupManager()).getActiveMasterHostCount(""));
  }

  @Test
  public void getRegisteredConnectionGroupsTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ReplicationGroupManager()).getRegisteredConnectionGroups());
  }

  @Test
  public void getSlaveHostsListTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ReplicationGroupManager()).getSlaveHostsList(""));
  }

  @Test
  public void getMasterHostsListTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ReplicationGroupManager()).getMasterHostsList(""));
  }
}
