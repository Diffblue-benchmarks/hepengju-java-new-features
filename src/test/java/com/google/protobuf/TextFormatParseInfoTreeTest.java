package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Map;
import org.junit.Test;

public class TextFormatParseInfoTreeTest {
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    assertEquals(0, TextFormatParseInfoTree.builder().build().subtreesFromField.size());
  }
}
