package com.mysql.cj.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.log.Jdk14Logger;
import com.mysql.cj.log.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Test;

public class ReadAheadInputStreamTest {
  @Test
  public void skipTest() throws IOException {
    // Arrange
    ByteArrayInputStream toBuffer = new ByteArrayInputStream(new byte[24]);
    ReadAheadInputStream readAheadInputStream = new ReadAheadInputStream(toBuffer, true, new Jdk14Logger(")"));

    // Act and Assert
    assertEquals(1L, readAheadInputStream.skip(1L));
    assertEquals(24, readAheadInputStream.endOfCurrentData);
    assertEquals(1, readAheadInputStream.currentPosition);
  }

  @Test
  public void markSupportedTest() {
    // Arrange
    ByteArrayInputStream toBuffer = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    assertFalse((new ReadAheadInputStream(toBuffer, true, new Jdk14Logger(")"))).markSupported());
  }

  @Test
  public void closeTest() throws IOException {
    // Arrange
    ByteArrayInputStream toBuffer = new ByteArrayInputStream(new byte[24]);
    ReadAheadInputStream readAheadInputStream = new ReadAheadInputStream(toBuffer, true, new Jdk14Logger(")"));

    // Act
    readAheadInputStream.close();

    // Assert
    assertNull(readAheadInputStream.log);
  }

  @Test
  public void constructorTest2() {
    // Arrange
    ByteArrayInputStream toBuffer = new ByteArrayInputStream(new byte[24]);
    Jdk14Logger jdk14Logger = new Jdk14Logger(")");

    // Act
    ReadAheadInputStream actualReadAheadInputStream = new ReadAheadInputStream(toBuffer, 1, true, jdk14Logger);

    // Assert
    assertSame(jdk14Logger, actualReadAheadInputStream.log);
    assertTrue(actualReadAheadInputStream.doDebug);
  }

  @Test
  public void constructorTest() {
    // Arrange
    ByteArrayInputStream toBuffer = new ByteArrayInputStream(new byte[24]);
    Jdk14Logger jdk14Logger = new Jdk14Logger(")");

    // Act
    ReadAheadInputStream actualReadAheadInputStream = new ReadAheadInputStream(toBuffer, true, jdk14Logger);

    // Assert
    assertSame(jdk14Logger, actualReadAheadInputStream.log);
    assertTrue(actualReadAheadInputStream.doDebug);
  }

  @Test
  public void availableTest() throws IOException {
    // Arrange
    ByteArrayInputStream toBuffer = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    assertEquals(24, (new ReadAheadInputStream(toBuffer, true, new Jdk14Logger(")"))).available());
  }

  @Test
  public void readTest2() throws IOException {
    // Arrange
    ByteArrayInputStream toBuffer = new ByteArrayInputStream(new byte[24]);
    ReadAheadInputStream readAheadInputStream = new ReadAheadInputStream(toBuffer, true, new Jdk14Logger(")"));

    // Act and Assert
    assertEquals(0, readAheadInputStream.read());
    assertEquals(24, readAheadInputStream.endOfCurrentData);
    assertEquals(1, readAheadInputStream.currentPosition);
  }

  @Test
  public void readTest() throws IOException {
    // Arrange
    ByteArrayInputStream toBuffer = new ByteArrayInputStream(new byte[24]);
    ReadAheadInputStream readAheadInputStream = new ReadAheadInputStream(toBuffer, true, new Jdk14Logger(")"));

    // Act and Assert
    assertEquals(1, readAheadInputStream.read(new byte[24], 1, 1));
    assertEquals(24, readAheadInputStream.endOfCurrentData);
    assertEquals(1, readAheadInputStream.currentPosition);
  }
}
