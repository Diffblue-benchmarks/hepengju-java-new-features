package com.mysql.cj.jdbc.ha;

import static org.junit.Assert.assertEquals;
import java.sql.SQLException;
import org.junit.Test;

public class ReplicationConnectionGroupManagerTest {
  @Test
  public void getActiveConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, ReplicationConnectionGroupManager.getActiveConnectionCount(""));
  }

  @Test
  public void getTotalConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, ReplicationConnectionGroupManager.getTotalConnectionCount(""));
  }

  @Test
  public void getConnectionCountWithHostAsMasterTest() {
    // Arrange, Act and Assert
    assertEquals(0, ReplicationConnectionGroupManager.getConnectionCountWithHostAsMaster("", ""));
  }

  @Test
  public void getConnectionCountWithHostAsSlaveTest() {
    // Arrange, Act and Assert
    assertEquals(0, ReplicationConnectionGroupManager.getConnectionCountWithHostAsSlave("", ""));
  }

  @Test
  public void getNumberOfMasterPromotionTest() {
    // Arrange, Act and Assert
    assertEquals(1, ReplicationConnectionGroupManager.getNumberOfMasterPromotion(""));
  }

  @Test
  public void getRegisteredReplicationConnectionGroupsTest() {
    // Arrange, Act and Assert
    assertEquals("", ReplicationConnectionGroupManager.getRegisteredReplicationConnectionGroups());
  }

  @Test
  public void getSlavePromotionCountTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(1L, ReplicationConnectionGroupManager.getSlavePromotionCount(""));
  }
}
