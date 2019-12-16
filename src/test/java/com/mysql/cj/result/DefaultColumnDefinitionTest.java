package com.mysql.cj.result;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.MysqlType;
import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import java.util.HashMap;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DefaultColumnDefinitionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void hasLargeFieldsTest() {
    // Arrange, Act and Assert
    assertFalse((new DefaultColumnDefinition()).hasLargeFields());
  }

  @Test
  public void findColumnTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new DefaultColumnDefinition()).findColumn("aaaaa", true, 1);
  }

  @Test
  public void exportToTest() {
    // Arrange
    DefaultColumnDefinition defaultColumnDefinition = new DefaultColumnDefinition();
    CachedResultSetMetaDataImpl cachedResultSetMetaDataImpl = new CachedResultSetMetaDataImpl();

    // Act
    defaultColumnDefinition.exportTo(cachedResultSetMetaDataImpl);

    // Assert
    Map<String, Integer> actualFullColumnNameToIndex = cachedResultSetMetaDataImpl.getFullColumnNameToIndex();
    boolean actualHasLargeFieldsResult = cachedResultSetMetaDataImpl.hasLargeFields();
    assertNull(cachedResultSetMetaDataImpl.getColumnNameToIndex());
    assertFalse(actualHasLargeFieldsResult);
    assertNull(actualFullColumnNameToIndex);
  }

  @Test
  public void initializeFromTest() {
    // Arrange
    DefaultColumnDefinition defaultColumnDefinition = new DefaultColumnDefinition();

    // Act
    defaultColumnDefinition.initializeFrom(new CachedResultSetMetaDataImpl());

    // Assert
    boolean actualHasBuiltIndexMappingResult = defaultColumnDefinition.hasBuiltIndexMapping();
    Map<String, Integer> actualFullColumnNameToIndex = defaultColumnDefinition.getFullColumnNameToIndex();
    boolean actualHasLargeFieldsResult = defaultColumnDefinition.hasLargeFields();
    assertTrue(actualHasBuiltIndexMappingResult);
    assertNull(defaultColumnDefinition.getColumnLabelToIndex());
    assertFalse(actualHasLargeFieldsResult);
    assertNull(actualFullColumnNameToIndex);
  }

  @Test
  public void setColumnToIndexCacheTest() {
    // Arrange
    DefaultColumnDefinition defaultColumnDefinition = new DefaultColumnDefinition();

    // Act
    defaultColumnDefinition.setColumnToIndexCache(null);

    // Assert
    assertNull(defaultColumnDefinition.getColumnToIndexCache());
  }

  @Test
  public void getColumnToIndexCacheTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DefaultColumnDefinition()).getColumnToIndexCache().size());
  }

  @Test
  public void setColumnNameToIndexTest() {
    // Arrange
    DefaultColumnDefinition defaultColumnDefinition = new DefaultColumnDefinition();

    // Act
    defaultColumnDefinition.setColumnNameToIndex(null);

    // Assert
    assertNull(defaultColumnDefinition.getColumnNameToIndex());
  }

  @Test
  public void getColumnNameToIndexTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultColumnDefinition()).getColumnNameToIndex());
  }

  @Test
  public void setFullColumnNameToIndexTest() {
    // Arrange
    DefaultColumnDefinition defaultColumnDefinition = new DefaultColumnDefinition();

    // Act
    defaultColumnDefinition.setFullColumnNameToIndex(null);

    // Assert
    assertNull(defaultColumnDefinition.getFullColumnNameToIndex());
  }

  @Test
  public void getFullColumnNameToIndexTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultColumnDefinition()).getFullColumnNameToIndex());
  }

  @Test
  public void setColumnLabelToIndexTest() {
    // Arrange
    DefaultColumnDefinition defaultColumnDefinition = new DefaultColumnDefinition();

    // Act
    defaultColumnDefinition.setColumnLabelToIndex(null);

    // Assert
    assertNull(defaultColumnDefinition.getColumnLabelToIndex());
  }

  @Test
  public void getColumnLabelToIndexTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultColumnDefinition()).getColumnLabelToIndex());
  }

  @Test
  public void hasBuiltIndexMappingTest() {
    // Arrange, Act and Assert
    assertFalse((new DefaultColumnDefinition()).hasBuiltIndexMapping());
  }

  @Test
  public void buildIndexMappingTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new DefaultColumnDefinition()).buildIndexMapping();
  }

  @Test
  public void setFieldsTest() {
    // Arrange
    DefaultColumnDefinition defaultColumnDefinition = new DefaultColumnDefinition();
    Field[] fieldArray = new Field[]{new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1), null,
        new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1)};

    // Act
    defaultColumnDefinition.setFields(fieldArray);

    // Assert
    assertSame(fieldArray, defaultColumnDefinition.getFields());
  }

  @Test
  public void getFieldsTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultColumnDefinition()).getFields());
  }

  @Test
  public void constructorTest2() {
    // Arrange
    Field field = new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1);

    // Act
    DefaultColumnDefinition actualDefaultColumnDefinition = new DefaultColumnDefinition(
        new Field[]{field, new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1), null});

    // Assert
    boolean actualHasBuiltIndexMappingResult = actualDefaultColumnDefinition.hasBuiltIndexMapping();
    Map<String, Integer> actualFullColumnNameToIndex = actualDefaultColumnDefinition.getFullColumnNameToIndex();
    Field[] fields = actualDefaultColumnDefinition.getFields();
    Map<String, Integer> actualColumnNameToIndex = actualDefaultColumnDefinition.getColumnNameToIndex();
    assertFalse(actualHasBuiltIndexMappingResult);
    assertNull(actualDefaultColumnDefinition.getColumnLabelToIndex());
    assertNull(actualColumnNameToIndex);
    assertEquals(3, fields.length);
    assertNull(actualFullColumnNameToIndex);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    DefaultColumnDefinition actualDefaultColumnDefinition = new DefaultColumnDefinition();

    // Assert
    boolean actualHasBuiltIndexMappingResult = actualDefaultColumnDefinition.hasBuiltIndexMapping();
    Map<String, Integer> actualFullColumnNameToIndex = actualDefaultColumnDefinition.getFullColumnNameToIndex();
    Map<String, Integer> actualColumnNameToIndex = actualDefaultColumnDefinition.getColumnNameToIndex();
    assertFalse(actualHasBuiltIndexMappingResult);
    assertNull(actualDefaultColumnDefinition.getColumnLabelToIndex());
    assertNull(actualColumnNameToIndex);
    assertNull(actualFullColumnNameToIndex);
  }
}
