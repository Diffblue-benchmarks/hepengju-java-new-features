package com.mysql.cj.protocol.a.result;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;
import com.mysql.cj.protocol.a.NativePacketPayload;
import com.mysql.cj.result.Row;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TextBufferRowTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void setMetadataTest() {
    // Arrange
    NativePacketPayload buf = new NativePacketPayload(1);
    CachedResultSetMetaDataImpl cachedResultSetMetaDataImpl = new CachedResultSetMetaDataImpl();
    TextBufferRow textBufferRow = new TextBufferRow(buf, cachedResultSetMetaDataImpl, null,
        new MysqlBinaryValueDecoder());

    // Act and Assert
    assertSame(textBufferRow, textBufferRow.setMetadata(cachedResultSetMetaDataImpl));
  }

  @Test
  public void getNullTest() {
    // Arrange
    NativePacketPayload buf = new NativePacketPayload(1);
    CachedResultSetMetaDataImpl cd = new CachedResultSetMetaDataImpl();

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    (new TextBufferRow(buf, cd, null, new MysqlBinaryValueDecoder())).getNull(1);
  }

  @Test
  public void getBytesTest() {
    // Arrange
    NativePacketPayload buf = new NativePacketPayload(1);
    CachedResultSetMetaDataImpl cd = new CachedResultSetMetaDataImpl();

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    (new TextBufferRow(buf, cd, null, new MysqlBinaryValueDecoder())).getBytes(1);
  }

  @Test
  public void findAndSeekToOffsetTest() {
    // Arrange
    NativePacketPayload buf = new NativePacketPayload(1);
    CachedResultSetMetaDataImpl cd = new CachedResultSetMetaDataImpl();

    // Act and Assert
    assertEquals(1, (new TextBufferRow(buf, cd, null, new MysqlBinaryValueDecoder())).findAndSeekToOffset(1));
  }
}
