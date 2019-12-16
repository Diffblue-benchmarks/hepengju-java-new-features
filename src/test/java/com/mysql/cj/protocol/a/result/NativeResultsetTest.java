package com.mysql.cj.protocol.a.result;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import com.mysql.cj.jdbc.result.ResultSetImpl;
import com.mysql.cj.protocol.ColumnDefinition;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.protocol.ResultsetRows;
import com.mysql.cj.result.Row;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NativeResultsetTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getRowsTest() {
    // Arrange, Act and Assert
    assertNull((new NativeResultset()).getRows());
  }

  @Test
  public void getServerInfoTest() {
    // Arrange, Act and Assert
    assertNull((new NativeResultset()).getServerInfo());
  }

  @Test
  public void getUpdateIDTest() {
    // Arrange, Act and Assert
    assertEquals(-1L, (new NativeResultset()).getUpdateID());
  }

  @Test
  public void getUpdateCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new NativeResultset()).getUpdateCount());
  }

  @Test
  public void clearNextResultsetTest() {
    // Arrange
    NativeResultset nativeResultset = new NativeResultset();

    // Act
    nativeResultset.clearNextResultset();

    // Assert
    assertNull(nativeResultset.getNextResultset());
  }

  @Test
  public void getNextResultsetTest() {
    // Arrange, Act and Assert
    assertNull((new NativeResultset()).getNextResultset());
  }

  @Test
  public void setNextResultsetTest() {
    // Arrange
    NativeResultset nativeResultset = new NativeResultset();

    // Act
    nativeResultset.setNextResultset(null);

    // Assert
    assertNull(nativeResultset.getNextResultset());
  }

  @Test
  public void initRowsWithMetadataTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new NativeResultset()).initRowsWithMetadata();
  }

  @Test
  public void getResultIdTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NativeResultset()).getResultId());
  }

  @Test
  public void hasRowsTest() {
    // Arrange, Act and Assert
    assertFalse((new NativeResultset()).hasRows());
  }

  @Test
  public void getColumnDefinitionTest() {
    // Arrange, Act and Assert
    assertNull((new NativeResultset()).getColumnDefinition());
  }

  @Test
  public void setColumnDefinitionTest() {
    // Arrange
    NativeResultset nativeResultset = new NativeResultset();
    CachedResultSetMetaDataImpl cachedResultSetMetaDataImpl = new CachedResultSetMetaDataImpl();

    // Act
    nativeResultset.setColumnDefinition(cachedResultSetMetaDataImpl);

    // Assert
    assertSame(cachedResultSetMetaDataImpl, nativeResultset.getColumnDefinition());
  }

  @Test
  public void constructorTest3() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new NativeResultset((ResultsetRows) null);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    NativeResultset actualNativeResultset = new NativeResultset(new OkPacket());

    // Assert
    String actualServerInfo = actualNativeResultset.getServerInfo();
    Resultset actualNextResultset = actualNativeResultset.getNextResultset();
    ColumnDefinition columnDefinition = actualNativeResultset.getColumnDefinition();
    long actualUpdateCount = actualNativeResultset.getUpdateCount();
    assertNull(actualServerInfo);
    assertNull(actualNativeResultset.thisRow);
    assertEquals(-1L, actualNativeResultset.getUpdateID());
    assertEquals(-1L, actualUpdateCount);
    assertTrue(columnDefinition instanceof com.mysql.cj.result.DefaultColumnDefinition);
    boolean actualHasBuiltIndexMappingResult = columnDefinition.hasBuiltIndexMapping();
    Map<String, Integer> actualFullColumnNameToIndex = columnDefinition.getFullColumnNameToIndex();
    boolean actualHasLargeFieldsResult = columnDefinition.hasLargeFields();
    Map<String, Integer> actualColumnNameToIndex = columnDefinition.getColumnNameToIndex();
    assertNull(actualNextResultset);
    assertNull(actualColumnNameToIndex);
    assertFalse(actualHasLargeFieldsResult);
    assertNull(actualFullColumnNameToIndex);
    assertFalse(actualHasBuiltIndexMappingResult);
    assertNull(columnDefinition.getColumnLabelToIndex());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    NativeResultset actualNativeResultset = new NativeResultset();

    // Assert
    String actualServerInfo = actualNativeResultset.getServerInfo();
    Resultset actualNextResultset = actualNativeResultset.getNextResultset();
    assertNull(actualServerInfo);
    assertNull(actualNativeResultset.thisRow);
    assertEquals(-1L, actualNativeResultset.getUpdateID());
    assertNull(actualNextResultset);
  }
}
