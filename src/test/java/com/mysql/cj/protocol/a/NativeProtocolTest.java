package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.MysqlType;
import com.mysql.cj.MysqlxSession;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.exceptions.CJCommunicationsException;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.log.Jdk14Logger;
import com.mysql.cj.protocol.ResultsetRows;
import com.mysql.cj.util.LazyString;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NativeProtocolTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void findMysqlTypeTest() {
    // Arrange
    DefaultPropertySet propertySet = new DefaultPropertySet();

    // Act and Assert
    assertEquals(MysqlType.BIT, NativeProtocol.findMysqlType(propertySet, 1, (short) 1, 1L, new LazyString("#sql_"),
        new LazyString("#sql_"), 1, "#sql_"));
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    NativeProtocol actualNativeProtocol = new NativeProtocol(new Jdk14Logger("#sql_"));

    // Assert
    int actualCommandCount = actualNativeProtocol.getCommandCount();
    String actualQueryComment = actualNativeProtocol.getQueryComment();
    NativePacketPayload actualSharedSendPacket = actualNativeProtocol.getSharedSendPacket();
    int actualWarningCount = actualNativeProtocol.getWarningCount();
    ResultsetRows actualStreamingData = actualNativeProtocol.getStreamingData();
    assertTrue(actualNativeProtocol.platformDbCharsetMatches);
    assertFalse(actualNativeProtocol.useCompression);
    assertEquals((byte) 0, actualNativeProtocol.packetSequence);
    assertFalse(actualNativeProtocol.hadWarnings);
    assertNull(actualStreamingData);
    assertSame(actualNativeProtocol.sharedSendPacket, actualSharedSendPacket);
    assertNull(actualNativeProtocol.getReusablePacket());
    assertEquals(0, actualWarningCount);
    assertEquals(0, actualCommandCount);
    assertNull(actualQueryComment);
  }
  @Test
  public void getInstanceTest() {
    // Arrange
    NativeSocketConnection socketConnection = new NativeSocketConnection();
    DefaultPropertySet propertySet = new DefaultPropertySet();

    // Act and Assert
    thrown.expect(CJCommunicationsException.class);
    NativeProtocol.getInstance(null, socketConnection, propertySet, new Jdk14Logger("#sql_"), null);
  }
}
