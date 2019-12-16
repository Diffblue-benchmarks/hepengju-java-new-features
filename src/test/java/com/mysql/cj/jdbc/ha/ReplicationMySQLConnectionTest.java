package com.mysql.cj.jdbc.ha;

import static org.junit.Assert.assertNull;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.JdbcConnection;
import java.sql.SQLException;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ReplicationMySQLConnectionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void clearHasTriedMasterTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).clearHasTriedMaster();
  }

  @Test
  public void unwrapTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).<Object>unwrap(null);
  }

  @Test
  public void isWrapperForTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).isWrapperFor(null);
  }

  @Test
  public void setProxyTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).setProxy(null);
  }

  @Test
  public void abortInternalTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).abortInternal();
  }

  @Test
  public void getPropertiesTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).getProperties();
  }

  @Test
  public void hasSamePropertiesTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).hasSameProperties(null);
  }

  @Test
  public void setStatementCommentTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).setStatementComment("aaaaa");
  }

  @Test
  public void changeUserTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).changeUser("aaaaa", "aaaaa");
  }

  @Test
  public void pingTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).ping();
  }

  @Test
  public void isReadOnlyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).isReadOnly();
  }

  @Test
  public void setReadOnlyTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).setReadOnly(true);
  }

  @Test
  public void isHostSlaveTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).isHostSlave("aaaaa");
  }

  @Test
  public void removeSlaveTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).removeSlave("aaaaa", true);
  }

  @Test
  public void removeSlaveTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).removeSlave("aaaaa");
  }

  @Test
  public void addSlaveHostTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).addSlaveHost("aaaaa");
  }

  @Test
  public void getSlavesConnectionTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).getSlavesConnection();
  }

  @Test
  public void isHostMasterTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).isHostMaster("aaaaa");
  }

  @Test
  public void removeMasterHostTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).removeMasterHost("aaaaa", true);
  }

  @Test
  public void removeMasterHostTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).removeMasterHost("aaaaa");
  }

  @Test
  public void promoteSlaveToMasterTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).promoteSlaveToMaster("aaaaa");
  }

  @Test
  public void getMasterConnectionTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).getMasterConnection();
  }

  @Test
  public void getConnectionGroupIdTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).getConnectionGroupId();
  }

  @Test
  public void getCurrentConnectionTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).getCurrentConnection();
  }

  @Test
  public void getActiveMySQLConnectionTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ReplicationMySQLConnection(null)).getActiveMySQLConnection();
  }

  @Test
  public void getThisAsProxyTest() {
    // Arrange, Act and Assert
    assertNull((new ReplicationMySQLConnection(null)).getThisAsProxy());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ReplicationMySQLConnection(null)).getThisAsProxy());
  }
}
