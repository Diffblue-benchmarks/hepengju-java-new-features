package com.mysql.cj.protocol.a;

import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import com.mysql.cj.log.Jdk14Logger;
import com.mysql.cj.protocol.Resultset;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TextResultsetReaderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void readTest() throws IOException {
    // Arrange
    TextResultsetReader textResultsetReader = new TextResultsetReader(new NativeProtocol(new Jdk14Logger("aaaaa")));
    NativePacketPayload resultPacket = new NativePacketPayload(1);
    CachedResultSetMetaDataImpl metadata = new CachedResultSetMetaDataImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    textResultsetReader.read(1, true, resultPacket, metadata,
        new ResultsetFactory(Resultset.Type.FORWARD_ONLY, Resultset.Concurrency.READ_ONLY));
  }
}
