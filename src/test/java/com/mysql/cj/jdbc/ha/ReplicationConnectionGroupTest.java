package com.mysql.cj.jdbc.ha;

import static org.junit.Assert.assertEquals;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ReplicationConnectionGroupTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ReplicationConnectionGroup[groupName=aaaaa,masterHostList=[],slaveHostList=[]]",
        (new ReplicationConnectionGroup("aaaaa")).toString());
  }

  @Test
  public void getActiveConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ReplicationConnectionGroup("aaaaa")).getActiveConnectionCount());
  }

  @Test
  public void getTotalConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ReplicationConnectionGroup("aaaaa")).getTotalConnectionCount());
  }

  @Test
  public void getNumberOfSlavePromotionsTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ReplicationConnectionGroup("aaaaa")).getNumberOfSlavePromotions());
  }

  @Test
  public void getNumberOfSlavesRemovedTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ReplicationConnectionGroup("aaaaa")).getNumberOfSlavesRemoved());
  }

  @Test
  public void getNumberOfSlavesAddedTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ReplicationConnectionGroup("aaaaa")).getNumberOfSlavesAdded());
  }

  @Test
  public void getConnectionCountWithHostAsMasterTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ReplicationConnectionGroup("aaaaa")).getConnectionCountWithHostAsMaster("aaaaa"));
  }

  @Test
  public void getConnectionCountWithHostAsSlaveTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ReplicationConnectionGroup("aaaaa")).getConnectionCountWithHostAsSlave("aaaaa"));
  }

  @Test
  public void promoteSlaveToMasterTest() throws SQLException {
    // Arrange
    ReplicationConnectionGroup replicationConnectionGroup = new ReplicationConnectionGroup("aaaaa");

    // Act
    replicationConnectionGroup.promoteSlaveToMaster("aaaaa");

    // Assert
    assertEquals(1L, replicationConnectionGroup.getNumberOfSlavePromotions());
  }

  @Test
  public void handleCloseConnectionTest() {
    // Arrange
    ReplicationConnectionGroup replicationConnectionGroup = new ReplicationConnectionGroup("aaaaa");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    replicationConnectionGroup.handleCloseConnection(new ReplicationMySQLConnection(null));
  }

  @Test
  public void addSlaveHostTest() throws SQLException {
    // Arrange
    ReplicationConnectionGroup replicationConnectionGroup = new ReplicationConnectionGroup("aaaaa");

    // Act
    replicationConnectionGroup.addSlaveHost("aaaaa");

    // Assert
    assertEquals(1L, replicationConnectionGroup.getNumberOfSlavesAdded());
  }

  @Test
  public void getSlaveHostsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ReplicationConnectionGroup("aaaaa")).getSlaveHosts().size());
  }

  @Test
  public void getMasterHostsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ReplicationConnectionGroup("aaaaa")).getMasterHosts().size());
  }

  @Test
  public void getGroupNameTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new ReplicationConnectionGroup("aaaaa")).getGroupName());
  }

  @Test
  public void registerReplicationConnectionTest() {
    // Arrange
    ReplicationConnectionGroup replicationConnectionGroup = new ReplicationConnectionGroup("aaaaa");

    // Act and Assert
    assertEquals(1L,
        replicationConnectionGroup.registerReplicationConnection(new ReplicationMySQLConnection(null), null, null));
  }

  @Test
  public void getConnectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ReplicationConnectionGroup("aaaaa")).getConnectionCount());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ReplicationConnectionGroup actualReplicationConnectionGroup = new ReplicationConnectionGroup("aaaaa");

    // Assert
    String actualGroupName = actualReplicationConnectionGroup.getGroupName();
    long actualNumberOfSlavesRemoved = actualReplicationConnectionGroup.getNumberOfSlavesRemoved();
    long actualNumberOfSlavePromotions = actualReplicationConnectionGroup.getNumberOfSlavePromotions();
    String actualToStringResult = actualReplicationConnectionGroup.toString();
    long actualActiveConnectionCount = actualReplicationConnectionGroup.getActiveConnectionCount();
    long actualTotalConnectionCount = actualReplicationConnectionGroup.getTotalConnectionCount();
    assertEquals("aaaaa", actualGroupName);
    assertEquals(0L, actualReplicationConnectionGroup.getNumberOfSlavesAdded());
    assertEquals(0L, actualTotalConnectionCount);
    assertEquals(0L, actualActiveConnectionCount);
    assertEquals("ReplicationConnectionGroup[groupName=aaaaa,masterHostList=[],slaveHostList=[]]",
        actualToStringResult);
    assertEquals(0L, actualNumberOfSlavePromotions);
    assertEquals(0L, actualNumberOfSlavesRemoved);
  }
}
