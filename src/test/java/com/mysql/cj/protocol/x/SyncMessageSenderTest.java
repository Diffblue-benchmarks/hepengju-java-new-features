package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertEquals;
import com.google.protobuf.Message;
import com.mysql.cj.exceptions.WrongArgumentException;
import java.io.BufferedOutputStream;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SyncMessageSenderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getPreviousPacketSentTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new SyncMessageSender(null)).getPreviousPacketSentTime());
  }

  @Test
  public void getLastPacketSentTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new SyncMessageSender(null)).getLastPacketSentTime());
  }

  @Test
  public void sendTest() {
    // Arrange
    SyncMessageSender syncMessageSender = new SyncMessageSender(null);

    // Act and Assert
    thrown.expect(WrongArgumentException.class);
    syncMessageSender.send(new XMessage(new XMessage(null)));
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    SyncMessageSender actualSyncMessageSender = new SyncMessageSender(null);

    // Assert
    long actualLastPacketSentTime = actualSyncMessageSender.getLastPacketSentTime();
    assertEquals(0L, actualLastPacketSentTime);
    assertEquals(0L, actualSyncMessageSender.getPreviousPacketSentTime());
  }
}
