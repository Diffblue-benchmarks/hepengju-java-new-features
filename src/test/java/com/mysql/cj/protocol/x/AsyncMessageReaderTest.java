package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.GeneratedMessageV3;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.conf.RuntimeProperty;
import com.mysql.cj.exceptions.CJOperationNotSupportedException;
import com.mysql.cj.protocol.ProtocolEntity;
import com.mysql.cj.protocol.ProtocolEntityFactory;
import com.mysql.cj.protocol.SocketConnection;
import com.mysql.cj.protocol.a.NativeSocketConnection;
import com.mysql.cj.xdevapi.UpdateResultBuilder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AsyncMessageReaderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void readMessageTest2() throws IOException {
    // Arrange
    DefaultPropertySet propertySet = new DefaultPropertySet();

    // Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new AsyncMessageReader(propertySet, new NativeSocketConnection())).readMessage(null, 1);
  }

  @Test
  public void readMessageTest() throws IOException {
    // Arrange
    DefaultPropertySet propertySet = new DefaultPropertySet();
    AsyncMessageReader asyncMessageReader = new AsyncMessageReader(propertySet, new NativeSocketConnection());

    // Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    asyncMessageReader.readMessage(null, new XMessageHeader());
  }

  @Test
  public void readHeaderTest() throws IOException {
    // Arrange
    DefaultPropertySet propertySet = new DefaultPropertySet();

    // Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new AsyncMessageReader(propertySet, new NativeSocketConnection())).readHeader();
  }

  @Test
  public void onErrorTest() {
    // Arrange
    DefaultPropertySet propertySet = new DefaultPropertySet();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new AsyncMessageReader(propertySet, new NativeSocketConnection())).onError(null);
  }

//failed_compile @Test
//  public void pushMessageListenerTest() {
//    // Arrange
//    DefaultPropertySet propertySet = new DefaultPropertySet();
//    AsyncMessageReader asyncMessageReader = new AsyncMessageReader(propertySet, new NativeSocketConnection());
//
//    // Act and Assert
//    thrown.expect(CJOperationNotSupportedException.class);
//    asyncMessageReader.pushMessageListener(new ResultMessageListener(null, new UpdateResultBuilder<Object>(), null));
//  }

  @Test
  public void stopAfterNextMessageTest() {
    // Arrange
    DefaultPropertySet propertySet = new DefaultPropertySet();
    AsyncMessageReader asyncMessageReader = new AsyncMessageReader(propertySet, new NativeSocketConnection());

    // Act
    asyncMessageReader.stopAfterNextMessage();

    // Assert
    assertTrue(asyncMessageReader.stopAfterNextMessage);
  }

//failed_compile @Test
//  public void startTest() {
//    // Arrange
//    DefaultPropertySet propertySet = new DefaultPropertySet();
//    AsyncMessageReader asyncMessageReader = new AsyncMessageReader(propertySet, new NativeSocketConnection());
//
//    // Act
//    asyncMessageReader.start();
//
//    // Assert
//    AsyncMessageReader.CompletedRead completedRead = asyncMessageReader.currentReadResult;
//    GeneratedMessageV3 actualGeneratedMessageV3 = completedRead.message;
//    XMessageHeader xMessageHeader = completedRead.header;
//    int actualMessageSize = xMessageHeader.getMessageSize();
//    assertNull(actualGeneratedMessageV3);
//    assertEquals(-1, actualMessageSize);
//    assertEquals(0, xMessageHeader.getMessageType());
//  }

  @Test
  public void constructorTest() {
    // Arrange
    DefaultPropertySet propertySet = new DefaultPropertySet();
    NativeSocketConnection nativeSocketConnection = new NativeSocketConnection();

    // Act
    AsyncMessageReader actualAsyncMessageReader = new AsyncMessageReader(propertySet, nativeSocketConnection);

    // Assert
    assertTrue(actualAsyncMessageReader.asyncTimeout instanceof com.mysql.cj.conf.IntegerProperty);
    assertSame(nativeSocketConnection, actualAsyncMessageReader.sc);
    assertFalse(actualAsyncMessageReader.stopAfterNextMessage);
  }
}
