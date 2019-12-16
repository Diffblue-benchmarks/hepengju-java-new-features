package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.mysql.cj.MysqlType;
import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import com.mysql.cj.protocol.ColumnDefinition;
import com.mysql.cj.result.Field;
import java.util.Map;
import org.junit.Test;

public class ColumnDefinitionFactoryTest {
  @Test
  public void createFromFieldsTest() {
    // Arrange
    ColumnDefinitionFactory columnDefinitionFactory = new ColumnDefinitionFactory(1L,
        new CachedResultSetMetaDataImpl());

    // Act
    ColumnDefinition actualCreateFromFieldsResult = columnDefinitionFactory
        .createFromFields(new Field[]{new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1),
            new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1),
            new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1)});

    // Assert
    boolean actualHasBuiltIndexMappingResult = actualCreateFromFieldsResult.hasBuiltIndexMapping();
    Map<String, Integer> actualFullColumnNameToIndex = actualCreateFromFieldsResult.getFullColumnNameToIndex();
    Field[] fields = actualCreateFromFieldsResult.getFields();
    Map<String, Integer> actualColumnNameToIndex = actualCreateFromFieldsResult.getColumnNameToIndex();
    assertFalse(actualHasBuiltIndexMappingResult);
    assertNull(actualCreateFromFieldsResult.getColumnLabelToIndex());
    assertNull(actualColumnNameToIndex);
    assertEquals(3, fields.length);
    assertNull(actualFullColumnNameToIndex);
  }

  @Test
  public void mergeColumnDefinitionsTest() {
    // Arrange, Act and Assert
    assertFalse((new ColumnDefinitionFactory(1L, new CachedResultSetMetaDataImpl())).mergeColumnDefinitions());
  }

  @Test
  public void createFromMessageTest() {
    // Arrange
    ColumnDefinitionFactory columnDefinitionFactory = new ColumnDefinitionFactory(1L,
        new CachedResultSetMetaDataImpl());

    // Act and Assert
    assertNull(columnDefinitionFactory.createFromMessage(new NativePacketPayload(1)));
  }

  @Test
  public void getColumnDefinitionFromCacheTest() {
    // Arrange
    CachedResultSetMetaDataImpl cachedResultSetMetaDataImpl = new CachedResultSetMetaDataImpl();

    // Act and Assert
    assertSame(cachedResultSetMetaDataImpl,
        (new ColumnDefinitionFactory(1L, cachedResultSetMetaDataImpl)).getColumnDefinitionFromCache());
  }

  @Test
  public void getColumnCountTest() {
    // Arrange, Act and Assert
    assertEquals(1L, (new ColumnDefinitionFactory(1L, new CachedResultSetMetaDataImpl())).getColumnCount());
  }

  @Test
  public void constructorTest() {
    // Arrange
    CachedResultSetMetaDataImpl cachedResultSetMetaDataImpl = new CachedResultSetMetaDataImpl();

    // Act
    ColumnDefinitionFactory actualColumnDefinitionFactory = new ColumnDefinitionFactory(1L,
        cachedResultSetMetaDataImpl);

    // Assert
    long actualColumnCount = actualColumnDefinitionFactory.getColumnCount();
    assertEquals(1L, actualColumnCount);
    assertSame(cachedResultSetMetaDataImpl, actualColumnDefinitionFactory.getColumnDefinitionFromCache());
  }
}
