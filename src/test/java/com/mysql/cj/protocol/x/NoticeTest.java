package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertEquals;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Message;
import com.mysql.cj.exceptions.CJCommunicationsException;
import com.mysql.cj.x.protobuf.MysqlxNotice;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NoticeTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest4() {
    // Arrange, Act and Assert
    thrown.expect(CJCommunicationsException.class);
    new Notice.XWarning(MysqlxNotice.Frame.getDefaultInstance());
  }
  @Test
  public void constructorTest3() {
    // Arrange, Act and Assert
    thrown.expect(CJCommunicationsException.class);
    new Notice.XSessionVariableChanged(MysqlxNotice.Frame.getDefaultInstance());
  }
  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    thrown.expect(CJCommunicationsException.class);
    new Notice.XSessionStateChanged(MysqlxNotice.Frame.getDefaultInstance());
  }
  @Test
  public void parseNoticeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Notice.<GeneratedMessageV3>parseNotice(null, null);
  }
  @Test
  public void getScopeTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new Notice(MysqlxNotice.Frame.getDefaultInstance())).getScope());
  }
  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Notice(MysqlxNotice.Frame.getDefaultInstance())).getType());
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    Notice actualNotice = new Notice(MysqlxNotice.Frame.getDefaultInstance());

    // Assert
    int actualType = actualNotice.getType();
    assertEquals(0, actualType);
    assertEquals(1, actualNotice.getScope());
  }
  @Test
  public void getInstanceTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    Notice.getInstance(new XMessage(new XMessage(new XMessage(new XMessage(null)))));
  }
}
