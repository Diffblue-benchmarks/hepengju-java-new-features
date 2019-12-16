package com.mysql.cj.xdevapi;

import com.mysql.cj.protocol.x.Notice;
import com.mysql.cj.x.protobuf.MysqlxNotice;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WarningImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getMessageTest() {
    // Arrange
    MysqlxNotice.Frame.getDefaultInstance();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new WarningImpl(null)).getMessage();
  }
  @Test
  public void getCodeTest() {
    // Arrange
    MysqlxNotice.Frame.getDefaultInstance();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new WarningImpl(null)).getCode();
  }
  @Test
  public void getLevelTest() {
    // Arrange
    MysqlxNotice.Frame.getDefaultInstance();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new WarningImpl(null)).getLevel();
  }
}
