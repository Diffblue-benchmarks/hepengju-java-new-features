package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertSame;
import com.mysql.cj.log.Jdk14Logger;
import com.mysql.cj.protocol.MessageReader;
import java.io.IOException;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TracingPacketReaderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void undecorateTest() {
    // Arrange
    MultiPacketReader multiPacketReader = new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null)));

    // Act and Assert
    assertSame(multiPacketReader, (new TracingPacketReader(multiPacketReader, new Jdk14Logger("aaaaa"))).undecorate());
  }

  @Test
  public void undecorateAllTest() {
    // Arrange
    MultiPacketReader packetReader = new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null)));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new TracingPacketReader(packetReader, new Jdk14Logger("aaaaa"))).undecorateAll();
  }

  @Test
  public void resetMessageSequenceTest() {
    // Arrange
    MultiPacketReader packetReader = new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null)));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new TracingPacketReader(packetReader, new Jdk14Logger("aaaaa"))).resetMessageSequence();
  }

  @Test
  public void getMessageSequenceTest() {
    // Arrange
    MultiPacketReader packetReader = new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null)));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new TracingPacketReader(packetReader, new Jdk14Logger("aaaaa"))).getMessageSequence();
  }

  @Test
  public void readMessageTest() throws IOException {
    // Arrange
    MultiPacketReader packetReader = new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null)));
    TracingPacketReader tracingPacketReader = new TracingPacketReader(packetReader, new Jdk14Logger("aaaaa"));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tracingPacketReader.readMessage(null, new NativePacketHeader());
  }

  @Test
  public void readHeaderTest() throws IOException {
    // Arrange
    MultiPacketReader packetReader = new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null)));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new TracingPacketReader(packetReader, new Jdk14Logger("aaaaa"))).readHeader();
  }

  @Test
  public void constructorTest() {
    // Arrange
    MultiPacketReader multiPacketReader = new MultiPacketReader(
        new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null))));

    // Act and Assert
    assertSame(multiPacketReader, (new TracingPacketReader(multiPacketReader, new Jdk14Logger("aaaaa"))).undecorate());
  }
}
