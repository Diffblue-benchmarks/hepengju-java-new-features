package com.mysql.cj.protocol.a;

import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import com.mysql.cj.log.Jdk14Logger;
import com.mysql.cj.protocol.ColumnDefinition;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ColumnDefinitionReaderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void readTest() {
    // Arrange
    ColumnDefinitionReader columnDefinitionReader = new ColumnDefinitionReader(
        new NativeProtocol(new Jdk14Logger("aaaaa")));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    columnDefinitionReader.read(new MergingColumnDefinitionFactory(1L, new CachedResultSetMetaDataImpl()));
  }
}
