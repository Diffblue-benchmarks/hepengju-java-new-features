package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.google.protobuf.GeneratedMessageV3;
import com.mysql.cj.exceptions.WrongArgumentException;
import com.mysql.cj.protocol.FullReadInputStream;
import com.mysql.cj.protocol.ProtocolEntity;
import com.mysql.cj.protocol.ProtocolEntityFactory;
import com.mysql.cj.xdevapi.UpdateResultBuilder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SyncMessageReaderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

//failed_compile @Test
//  public void pushMessageListenerTest() throws IOException {
//    // Arrange
//    SyncMessageReader syncMessageReader = new SyncMessageReader(
//        new FullReadInputStream(new ByteArrayInputStream(new byte[24])));
//
//    // Act
//    syncMessageReader.pushMessageListener(new ResultMessageListener(null, new UpdateResultBuilder<Object>(), null));
//
//    // Assert
//    XMessageHeader readHeaderResult = syncMessageReader.readHeader();
//    int actualMessageSize = readHeaderResult.getMessageSize();
//    assertEquals(0, readHeaderResult.getMessageType());
//    assertEquals(-1, actualMessageSize);
//  }

  @Test
  public void readMessageTest2() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new SyncMessageReader(new FullReadInputStream(new ByteArrayInputStream(new byte[24])))).readMessage(null, 1);
  }

  @Test
  public void readMessageTest() throws IOException {
    // Arrange
    SyncMessageReader syncMessageReader = new SyncMessageReader(
        new FullReadInputStream(new ByteArrayInputStream(new byte[24])));

    // Act and Assert
    thrown.expect(NegativeArraySizeException.class);
    syncMessageReader.readMessage(null, new XMessageHeader());
  }

  @Test
  public void readHeaderTest() throws IOException {
    // Arrange and Act
    XMessageHeader actualReadHeaderResult = (new SyncMessageReader(
        new FullReadInputStream(new ByteArrayInputStream(new byte[24])))).readHeader();

    // Assert
    int actualMessageSize = actualReadHeaderResult.getMessageSize();
    assertEquals(0, actualReadHeaderResult.getMessageType());
    assertEquals(-1, actualMessageSize);
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull(
        (new SyncMessageReader(new FullReadInputStream(new ByteArrayInputStream(new byte[24])))).dispatchingThread);
  }
}
