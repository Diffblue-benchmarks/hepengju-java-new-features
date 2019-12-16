package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertSame;
import com.mysql.cj.protocol.MessageReader;
import java.io.IOException;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MultiPacketReaderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void undecorateTest() {
    // Arrange
    MultiPacketReader multiPacketReader = new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null)));

    // Act and Assert
    assertSame(multiPacketReader, (new MultiPacketReader(multiPacketReader)).undecorate());
  }

  @Test
  public void undecorateAllTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null))))).undecorateAll();
  }

  @Test
  public void resetMessageSequenceTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null)))))
        .resetMessageSequence();
  }

  @Test
  public void getMessageSequenceTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null)))))
        .getMessageSequence();
  }

  @Test
  public void readMessageTest() throws IOException {
    // Arrange
    MultiPacketReader multiPacketReader = new MultiPacketReader(
        new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null))));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    multiPacketReader.readMessage(null, new NativePacketHeader());
  }

  @Test
  public void readHeaderTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null))))).readHeader();
  }

  @Test
  public void constructorTest() {
    // Arrange
    MultiPacketReader multiPacketReader = new MultiPacketReader(
        new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null))));

    // Act and Assert
    assertSame(multiPacketReader, (new MultiPacketReader(multiPacketReader)).undecorate());
  }
}
