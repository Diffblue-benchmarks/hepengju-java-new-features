package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Test;

public class AbstractMessageLiteTest {
  @Test
  public void constructorTest() throws IOException {
    // Arrange, Act and Assert
    assertEquals(1,
        (new AbstractMessageLite.Builder.LimitedInputStream(new ByteArrayInputStream(new byte[24]), 1)).available());
  }
}
