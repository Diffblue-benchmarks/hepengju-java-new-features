package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.mysql.cj.conf.IntegerProperty;
import com.mysql.cj.conf.RuntimeProperty;
import com.mysql.cj.protocol.SocketConnection;
import java.io.IOException;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SimplePacketReaderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void resetMessageSequenceTest() {
    // Arrange
    SimplePacketReader simplePacketReader = new SimplePacketReader(new NativeSocketConnection(), null);

    // Act
    simplePacketReader.resetMessageSequence();

    // Assert
    assertEquals((byte) 0, simplePacketReader.getMessageSequence());
  }

  @Test
  public void getMessageSequenceTest() {
    // Arrange, Act and Assert
    assertEquals((byte) -1, (new SimplePacketReader(new NativeSocketConnection(), null)).getMessageSequence());
  }

  @Test
  public void readMessageTest() throws IOException {
    // Arrange
    SimplePacketReader simplePacketReader = new SimplePacketReader(new NativeSocketConnection(), null);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    simplePacketReader.readMessage(null, new NativePacketHeader());
  }

  @Test
  public void readHeaderTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);
    (new SimplePacketReader(new NativeSocketConnection(), null)).readHeader();
  }

  @Test
  public void constructorTest() {
    // Arrange
    NativeSocketConnection nativeSocketConnection = new NativeSocketConnection();

    // Act
    SimplePacketReader actualSimplePacketReader = new SimplePacketReader(nativeSocketConnection, null);

    // Assert
    assertEquals((byte) -1, actualSimplePacketReader.getMessageSequence());
    assertNull(actualSimplePacketReader.maxAllowedPacket);
    assertSame(nativeSocketConnection, actualSimplePacketReader.socketConnection);
  }
}
