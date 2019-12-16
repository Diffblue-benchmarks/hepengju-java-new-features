package com.mysql.cj.jdbc.result;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import java.sql.ResultSetMetaData;
import java.util.Map;
import org.junit.Test;

public class CachedResultSetMetaDataImplTest {
  @Test
  public void getMetadataTest() {
    // Arrange, Act and Assert
    assertNull((new CachedResultSetMetaDataImpl()).getMetadata());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    CachedResultSetMetaDataImpl actualCachedResultSetMetaDataImpl = new CachedResultSetMetaDataImpl();

    // Assert
    boolean actualHasBuiltIndexMappingResult = actualCachedResultSetMetaDataImpl.hasBuiltIndexMapping();
    Map<String, Integer> actualFullColumnNameToIndex = actualCachedResultSetMetaDataImpl.getFullColumnNameToIndex();
    Map<String, Integer> actualColumnNameToIndex = actualCachedResultSetMetaDataImpl.getColumnNameToIndex();
    assertFalse(actualHasBuiltIndexMappingResult);
    assertNull(actualCachedResultSetMetaDataImpl.getColumnLabelToIndex());
    assertNull(actualColumnNameToIndex);
    assertNull(actualFullColumnNameToIndex);
  }
}
