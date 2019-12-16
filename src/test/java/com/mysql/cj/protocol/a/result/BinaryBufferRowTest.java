package com.mysql.cj.protocol.a.result;

import static org.junit.Assert.assertTrue;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;
import com.mysql.cj.protocol.a.NativePacketPayload;
import com.mysql.cj.result.Row;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BinaryBufferRowTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void setBytesTest() {
    // Arrange
    NativePacketPayload buf = new NativePacketPayload(1);
    CachedResultSetMetaDataImpl cd = new CachedResultSetMetaDataImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new BinaryBufferRow(buf, cd, null, new MysqlBinaryValueDecoder())).setBytes(1, new byte[24]);
  }

  @Test
  public void setMetadataTest() {
    // Arrange
    NativePacketPayload buf = new NativePacketPayload(1);
    CachedResultSetMetaDataImpl cachedResultSetMetaDataImpl = new CachedResultSetMetaDataImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new BinaryBufferRow(buf, cachedResultSetMetaDataImpl, null, new MysqlBinaryValueDecoder()))
        .setMetadata(cachedResultSetMetaDataImpl);
  }

  @Test
  public void getNullTest() {
    // Arrange
    NativePacketPayload buf = new NativePacketPayload(1);
    CachedResultSetMetaDataImpl cd = new CachedResultSetMetaDataImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new BinaryBufferRow(buf, cd, null, new MysqlBinaryValueDecoder())).getNull(1);
  }

  @Test
  public void getBytesTest() {
    // Arrange
    NativePacketPayload buf = new NativePacketPayload(1);
    CachedResultSetMetaDataImpl cd = new CachedResultSetMetaDataImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new BinaryBufferRow(buf, cd, null, new MysqlBinaryValueDecoder())).getBytes(1);
  }

  @Test
  public void findAndSeekToOffsetTest() {
    // Arrange
    NativePacketPayload buf = new NativePacketPayload(1);
    CachedResultSetMetaDataImpl cd = new CachedResultSetMetaDataImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new BinaryBufferRow(buf, cd, null, new MysqlBinaryValueDecoder())).findAndSeekToOffset(1);
  }

  @Test
  public void isBinaryEncodedTest() {
    // Arrange
    NativePacketPayload buf = new NativePacketPayload(1);
    CachedResultSetMetaDataImpl cd = new CachedResultSetMetaDataImpl();

    // Act and Assert
    assertTrue((new BinaryBufferRow(buf, cd, null, new MysqlBinaryValueDecoder())).isBinaryEncoded());
  }
}
