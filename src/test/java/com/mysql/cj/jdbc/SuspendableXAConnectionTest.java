package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.exceptions.ExceptionInterceptor;
import java.sql.Connection;
import java.sql.SQLException;
import javax.transaction.xa.XAException;
import javax.transaction.xa.XAResource;
import javax.transaction.xa.Xid;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SuspendableXAConnectionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void closeTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    SuspendableXAConnection.getInstance(new ConnectionImpl()).close();
  }

  @Test
  public void getConnectionTest() throws SQLException {
    // Arrange and Act
    Connection actualConnection = SuspendableXAConnection.getInstance(new ConnectionImpl()).getConnection();

    // Assert
    boolean actualIsMasterConnectionResult = ((ConnectionWrapper) actualConnection).isMasterConnection();
    ExceptionInterceptor actualExceptionInterceptor = ((ConnectionWrapper) actualConnection).getExceptionInterceptor();
    int actualHoldability = actualConnection.getHoldability();
    assertEquals(2, actualHoldability);
    assertNull(actualExceptionInterceptor);
    assertFalse(actualIsMasterConnectionResult);
    assertFalse(((ConnectionWrapper) actualConnection).mc.isInGlobalTx());
  }

  @Test
  public void setTransactionTimeoutTest() throws SQLException, XAException {
    // Arrange, Act and Assert
    assertFalse(SuspendableXAConnection.getInstance(new ConnectionImpl()).setTransactionTimeout(1));
  }

  @Test
  public void recoverTest() throws SQLException, XAException {
    // Arrange, Act and Assert
    thrown.expect(MysqlXAException.class);
    SuspendableXAConnection.getInstance(new ConnectionImpl()).recover(1);
  }

  @Test
  public void getTransactionTimeoutTest() throws SQLException, XAException {
    // Arrange, Act and Assert
    assertEquals(0, SuspendableXAConnection.getInstance(new ConnectionImpl()).getTransactionTimeout());
  }

  @Test
  public void getXAResourceTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue(
        SuspendableXAConnection.getInstance(new ConnectionImpl()).getXAResource() instanceof SuspendableXAConnection);
  }

  @Test
  public void constructorTest() throws SQLException {
    // Arrange and Act
    SuspendableXAConnection actualSuspendableXAConnection = new SuspendableXAConnection(new ConnectionImpl());

    // Assert
    ExceptionInterceptor actualExceptionInterceptor = actualSuspendableXAConnection.getExceptionInterceptor();
    assertTrue(actualSuspendableXAConnection.getConnection() instanceof ConnectionWrapper);
    assertNull(actualExceptionInterceptor);
  }

  @Test
  public void getInstanceTest() throws SQLException {
    // Arrange and Act
    SuspendableXAConnection actualInstance = SuspendableXAConnection.getInstance(new ConnectionImpl());

    // Assert
    ExceptionInterceptor actualExceptionInterceptor = actualInstance.getExceptionInterceptor();
    assertTrue(actualInstance.getConnection() instanceof ConnectionWrapper);
    assertNull(actualExceptionInterceptor);
  }
}
