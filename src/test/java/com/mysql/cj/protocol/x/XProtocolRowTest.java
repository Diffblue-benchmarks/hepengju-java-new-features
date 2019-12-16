package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import com.mysql.cj.result.Row;
import com.mysql.cj.x.protobuf.MysqlxResultset;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class XProtocolRowTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void wasNullTest() {
    // Arrange, Act and Assert
    assertFalse((new XProtocolRow(MysqlxResultset.Row.getDefaultInstance())).wasNull());
  }

  @Test
  public void getNullTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    (new XProtocolRow(MysqlxResultset.Row.getDefaultInstance())).getNull(1);
  }

  @Test
  public void setMetadataTest() {
    // Arrange
    XProtocolRow xProtocolRow = new XProtocolRow(MysqlxResultset.Row.getDefaultInstance());

    // Act and Assert
    assertSame(xProtocolRow, xProtocolRow.setMetadata(new CachedResultSetMetaDataImpl()));
  }
}
