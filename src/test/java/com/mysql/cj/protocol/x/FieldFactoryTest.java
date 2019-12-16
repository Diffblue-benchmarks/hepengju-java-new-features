package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertEquals;
import com.google.protobuf.Message;
import com.mysql.cj.result.Field;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FieldFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void createFromMessageTest() {
    // Arrange
    FieldFactory fieldFactory = new FieldFactory("aaaaa");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    fieldFactory.createFromMessage(new XMessage(new XMessage(new XMessage(new XMessage(null)))));
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new FieldFactory("aaaaa")).metadataCharacterSet);
  }
}
