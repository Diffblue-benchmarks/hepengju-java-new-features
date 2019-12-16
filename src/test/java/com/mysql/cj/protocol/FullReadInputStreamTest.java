package com.mysql.cj.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;

public class FullReadInputStreamTest {
  @Test
  public void skipLengthEncodedIntegerTest() throws IOException {
    // Arrange, Act and Assert
    assertEquals(1, (new FullReadInputStream(new ByteArrayInputStream(new byte[24]))).skipLengthEncodedInteger());
  }

  @Test
  public void skipFullyTest() throws IOException {
    // Arrange, Act and Assert
    assertEquals(1L, (new FullReadInputStream(new ByteArrayInputStream(new byte[24]))).skipFully(1L));
  }

  @Test
  public void readFullyTest2() throws IOException {
    // Arrange, Act and Assert
    assertEquals(1, (new FullReadInputStream(new ByteArrayInputStream(new byte[24]))).readFully(new byte[24], 1, 1));
  }

  @Test
  public void readFullyTest() throws IOException {
    // Arrange, Act and Assert
    assertEquals(24, (new FullReadInputStream(new ByteArrayInputStream(new byte[24]))).readFully(new byte[24]));
  }

  @Test
  public void getUnderlyingStreamTest() {
    // Arrange
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    assertSame(byteArrayInputStream, (new FullReadInputStream(byteArrayInputStream)).getUnderlyingStream());
  }
}
