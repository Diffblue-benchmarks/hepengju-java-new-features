package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertSame;
import com.mysql.cj.conf.IntegerProperty;
import com.mysql.cj.protocol.MessageReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DebugBufferingPacketReaderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void undecorateTest() {
    // Arrange
    MultiPacketReader multiPacketReader = new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null)));

    // Act and Assert
    assertSame(multiPacketReader, (new DebugBufferingPacketReader(multiPacketReader, null, null)).undecorate());
  }

  @Test
  public void undecorateAllTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new DebugBufferingPacketReader(new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null))), null,
        null)).undecorateAll();
  }

  @Test
  public void resetMessageSequenceTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new DebugBufferingPacketReader(new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null))), null,
        null)).resetMessageSequence();
  }

  @Test
  public void getMessageSequenceTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new DebugBufferingPacketReader(new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null))), null,
        null)).getMessageSequence();
  }

  @Test
  public void readMessageTest() throws IOException {
    // Arrange
    DebugBufferingPacketReader debugBufferingPacketReader = new DebugBufferingPacketReader(
        new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null))), null, null);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    debugBufferingPacketReader.readMessage(null, new NativePacketHeader());
  }

  @Test
  public void readHeaderTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new DebugBufferingPacketReader(new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null))), null,
        null)).readHeader();
  }

  @Test
  public void constructorTest() {
    // Arrange
    MultiPacketReader multiPacketReader = new MultiPacketReader(
        new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null))));

    // Act and Assert
    assertSame(multiPacketReader, (new DebugBufferingPacketReader(multiPacketReader, null, null)).undecorate());
  }
}
