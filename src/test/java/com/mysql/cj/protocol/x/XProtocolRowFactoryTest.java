package com.mysql.cj.protocol.x;

import com.google.protobuf.Message;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class XProtocolRowFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void createFromMessageTest() {
    // Arrange
    XProtocolRowFactory xProtocolRowFactory = new XProtocolRowFactory();

    // Act and Assert
    thrown.expect(ClassCastException.class);
    xProtocolRowFactory.createFromMessage(new XMessage(new XMessage(new XMessage(null))));
  }
}
