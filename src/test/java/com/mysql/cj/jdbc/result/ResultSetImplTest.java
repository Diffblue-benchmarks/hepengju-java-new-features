package com.mysql.cj.jdbc.result;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.NativeSession;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.jdbc.StatementImpl;
import com.mysql.cj.log.ProfilerEventHandler;
import com.mysql.cj.protocol.ColumnDefinition;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.protocol.ResultsetRows;
import com.mysql.cj.protocol.a.result.OkPacket;
import com.mysql.cj.protocol.a.result.ResultsetRowsCursor;
import com.mysql.cj.result.DefaultColumnDefinition;
import com.mysql.cj.result.Field;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.util.Calendar;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResultSetImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new ResultSetImpl((ResultsetRows) null, null, null);
  }

  @Test
  public void constructorTest() throws SQLException {
    // Arrange and Act
    ResultSetImpl actualResultSetImpl = new ResultSetImpl(new OkPacket(), null, null);

    // Assert
    int actualType = actualResultSetImpl.getType();
    long actualUpdateCount = actualResultSetImpl.getUpdateCount();
    ColumnDefinition actualMetadata = actualResultSetImpl.getMetadata();
    String actualServerInfo = actualResultSetImpl.getServerInfo();
    Resultset actualNextResultset = actualResultSetImpl.getNextResultset();
    StatementImpl actualOwningStatement = actualResultSetImpl.getOwningStatement();
    ColumnDefinition columnDefinition = actualResultSetImpl.getColumnDefinition();
    long actualUpdateID = actualResultSetImpl.getUpdateID();
    assertEquals(0, actualType);
    assertFalse(actualResultSetImpl.gatherPerfMetrics);
    assertNull(actualResultSetImpl.fastClientCal);
    assertTrue(actualResultSetImpl.yearIsDateType);
    assertNull(actualResultSetImpl.db);
    assertNull(actualResultSetImpl.fastDefaultCal);
    assertNull(actualResultSetImpl.columnUsed);
    assertNull(actualResultSetImpl.eventSink);
    assertFalse(actualResultSetImpl.isClosed);
    assertFalse(actualResultSetImpl.useUsageAdvisor);
    assertEquals(-1, actualResultSetImpl.currentRow);
    assertEquals(1000, actualResultSetImpl.fetchDirection);
    assertNull(actualResultSetImpl.warningChain);
    assertEquals(0, actualResultSetImpl.resultSetConcurrency);
    assertEquals(0, actualResultSetImpl.fetchSize);
    assertNull(actualResultSetImpl.session);
    assertNull(actualResultSetImpl.getConnection());
    assertEquals(-1L, actualUpdateID);
    assertNull(actualOwningStatement);
    boolean actualHasBuiltIndexMappingResult = columnDefinition.hasBuiltIndexMapping();
    Map<String, Integer> actualFullColumnNameToIndex = columnDefinition.getFullColumnNameToIndex();
    Field[] fields = columnDefinition.getFields();
    Map<String, Integer> actualColumnNameToIndex = columnDefinition.getColumnNameToIndex();
    assertEquals(-1L, actualUpdateCount);
    assertSame(columnDefinition, actualMetadata);
    assertNull(actualServerInfo);
    assertNull(actualNextResultset);
    assertEquals(0, fields.length);
    assertNull(actualFullColumnNameToIndex);
    assertFalse(actualHasBuiltIndexMappingResult);
    assertNull(actualColumnNameToIndex);
    assertNull(columnDefinition.getColumnLabelToIndex());
  }
}
