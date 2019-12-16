package com.diffblue.deeptestutils;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class FieldListTest {
  @Test
  public void getFieldsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FieldList()).getFields().size());
  }
}
