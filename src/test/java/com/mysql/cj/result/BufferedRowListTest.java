package com.mysql.cj.result;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class BufferedRowListTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(-1, (new BufferedRowList((List<Row>) null)).getPosition());
  }
}
