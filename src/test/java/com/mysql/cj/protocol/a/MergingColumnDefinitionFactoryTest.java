package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.MysqlType;
import com.mysql.cj.exceptions.WrongArgumentException;
import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import com.mysql.cj.protocol.ColumnDefinition;
import com.mysql.cj.result.Field;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MergingColumnDefinitionFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void createFromFieldsTest() {
    // Arrange
    MergingColumnDefinitionFactory mergingColumnDefinitionFactory = new MergingColumnDefinitionFactory(1L,
        new CachedResultSetMetaDataImpl());

    // Act and Assert
    thrown.expect(WrongArgumentException.class);
    mergingColumnDefinitionFactory
        .createFromFields(new Field[]{new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1),
            new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1),
            new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1)});
  }

  @Test
  public void mergeColumnDefinitionsTest() {
    // Arrange, Act and Assert
    assertTrue((new MergingColumnDefinitionFactory(1L, new CachedResultSetMetaDataImpl())).mergeColumnDefinitions());
  }

  @Test
  public void constructorTest() {
    // Arrange
    CachedResultSetMetaDataImpl cachedResultSetMetaDataImpl = new CachedResultSetMetaDataImpl();

    // Act
    MergingColumnDefinitionFactory actualMergingColumnDefinitionFactory = new MergingColumnDefinitionFactory(1L,
        cachedResultSetMetaDataImpl);

    // Assert
    long actualColumnCount = actualMergingColumnDefinitionFactory.getColumnCount();
    assertEquals(1L, actualColumnCount);
    assertSame(cachedResultSetMetaDataImpl, actualMergingColumnDefinitionFactory.getColumnDefinitionFromCache());
  }
}
