package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ByteStringTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void resetTest() {
    // Arrange
    ByteString.Output output = new ByteString.Output(1);

    // Act
    output.reset();

    // Assert
    assertEquals(0, output.size());
  }

  @Test
  public void sizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ByteString.Output(1)).size());
  }

  @Test
  public void writeToTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ByteString.Output(1)).writeTo(null);
  }

  @Test
  public void writeTest2() {
    // Arrange
    ByteString.Output output = new ByteString.Output(1);

    // Act
    output.write(new byte[24], 1, 1);

    // Assert
    assertEquals(1, output.size());
  }

  @Test
  public void writeTest() {
    // Arrange
    ByteString.Output output = new ByteString.Output(1);

    // Act
    output.write(1);

    // Assert
    assertEquals(1, output.size());
  }
}
