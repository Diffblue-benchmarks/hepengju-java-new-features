package com.mysql.cj.protocol.x;

import com.google.protobuf.Message;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NoticeFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void createFromMessageTest() {
    // Arrange
    NoticeFactory noticeFactory = new NoticeFactory();

    // Act and Assert
    thrown.expect(ClassCastException.class);
    noticeFactory.createFromMessage(new XMessage(new XMessage(new XMessage(null))));
  }
}
