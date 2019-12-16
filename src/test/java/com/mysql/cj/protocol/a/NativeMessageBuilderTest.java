package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.mysql.cj.exceptions.CJOperationNotSupportedException;
import com.mysql.cj.exceptions.WrongArgumentException;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NativeMessageBuilderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildComStmtSendLongDataTest() {
    // Arrange
    NativeMessageBuilder nativeMessageBuilder = new NativeMessageBuilder();

    // Act
    NativePacketPayload actualBuildComStmtSendLongDataResult = nativeMessageBuilder
        .buildComStmtSendLongData(new NativePacketPayload(1), 1L, 1, new byte[24]);

    // Assert
    int actualCapacity = actualBuildComStmtSendLongDataResult.getCapacity();
    int actualPosition = actualBuildComStmtSendLongDataResult.getPosition();
    assertEquals(38, actualCapacity);
    assertEquals(31, actualBuildComStmtSendLongDataResult.getPayloadLength());
    assertEquals(31, actualPosition);
  }
  @Test
  public void buildComStmtFetchTest() {
    // Arrange
    NativeMessageBuilder nativeMessageBuilder = new NativeMessageBuilder();

    // Act
    NativePacketPayload actualBuildComStmtFetchResult = nativeMessageBuilder
        .buildComStmtFetch(new NativePacketPayload(1), 1L, 1L);

    // Assert
    int actualCapacity = actualBuildComStmtFetchResult.getCapacity();
    int actualPosition = actualBuildComStmtFetchResult.getPosition();
    assertEquals(11, actualCapacity);
    assertEquals(9, actualBuildComStmtFetchResult.getPayloadLength());
    assertEquals(9, actualPosition);
  }
  @Test
  public void buildComStmtResetTest() {
    // Arrange
    NativeMessageBuilder nativeMessageBuilder = new NativeMessageBuilder();

    // Act
    NativePacketPayload actualBuildComStmtResetResult = nativeMessageBuilder
        .buildComStmtReset(new NativePacketPayload(1), 1L);

    // Assert
    int actualCapacity = actualBuildComStmtResetResult.getCapacity();
    int actualPosition = actualBuildComStmtResetResult.getPosition();
    assertEquals(6, actualCapacity);
    assertEquals(5, actualBuildComStmtResetResult.getPayloadLength());
    assertEquals(5, actualPosition);
  }
  @Test
  public void buildComStmtCloseTest() {
    // Arrange
    NativeMessageBuilder nativeMessageBuilder = new NativeMessageBuilder();

    // Act
    NativePacketPayload actualBuildComStmtCloseResult = nativeMessageBuilder
        .buildComStmtClose(new NativePacketPayload(1), 1L);

    // Assert
    int actualCapacity = actualBuildComStmtCloseResult.getCapacity();
    int actualPosition = actualBuildComStmtCloseResult.getPosition();
    assertEquals(6, actualCapacity);
    assertEquals(5, actualBuildComStmtCloseResult.getPayloadLength());
    assertEquals(5, actualPosition);
  }
  @Test
  public void buildComStmtPrepareTest2() {
    // Arrange
    NativeMessageBuilder nativeMessageBuilder = new NativeMessageBuilder();

    // Act and Assert
    thrown.expect(WrongArgumentException.class);
    nativeMessageBuilder.buildComStmtPrepare(new NativePacketPayload(1), "aaaaa", "aaaaa");
  }
  @Test
  public void buildComStmtPrepareTest() {
    // Arrange
    NativeMessageBuilder nativeMessageBuilder = new NativeMessageBuilder();

    // Act
    NativePacketPayload actualBuildComStmtPrepareResult = nativeMessageBuilder
        .buildComStmtPrepare(new NativePacketPayload(1), new byte[24]);

    // Assert
    int actualCapacity = actualBuildComStmtPrepareResult.getCapacity();
    int actualPosition = actualBuildComStmtPrepareResult.getPosition();
    assertEquals(31, actualCapacity);
    assertEquals(25, actualBuildComStmtPrepareResult.getPayloadLength());
    assertEquals(25, actualPosition);
  }
  @Test
  public void buildComQuitTest() {
    // Arrange
    NativeMessageBuilder nativeMessageBuilder = new NativeMessageBuilder();

    // Act
    NativePacketPayload actualBuildComQuitResult = nativeMessageBuilder.buildComQuit(new NativePacketPayload(1));

    // Assert
    int actualPosition = actualBuildComQuitResult.getPosition();
    assertFalse(actualBuildComQuitResult.isResultSetOKPacket());
    assertEquals(1, actualPosition);
  }
  @Test
  public void buildComPingTest() {
    // Arrange
    NativeMessageBuilder nativeMessageBuilder = new NativeMessageBuilder();

    // Act
    NativePacketPayload actualBuildComPingResult = nativeMessageBuilder.buildComPing(new NativePacketPayload(1));

    // Assert
    int actualPosition = actualBuildComPingResult.getPosition();
    assertFalse(actualBuildComPingResult.isResultSetOKPacket());
    assertEquals(1, actualPosition);
  }
  @Test
  public void buildComSetOptionTest() {
    // Arrange
    NativeMessageBuilder nativeMessageBuilder = new NativeMessageBuilder();

    // Act
    NativePacketPayload actualBuildComSetOptionResult = nativeMessageBuilder
        .buildComSetOption(new NativePacketPayload(1), 1);

    // Assert
    int actualCapacity = actualBuildComSetOptionResult.getCapacity();
    int actualPosition = actualBuildComSetOptionResult.getPosition();
    assertEquals(3, actualCapacity);
    assertEquals(3, actualBuildComSetOptionResult.getPayloadLength());
    assertEquals(3, actualPosition);
  }
  @Test
  public void buildComShutdownTest() {
    // Arrange
    NativeMessageBuilder nativeMessageBuilder = new NativeMessageBuilder();

    // Act
    NativePacketPayload actualBuildComShutdownResult = nativeMessageBuilder
        .buildComShutdown(new NativePacketPayload(1));

    // Assert
    int actualPosition = actualBuildComShutdownResult.getPosition();
    assertFalse(actualBuildComShutdownResult.isResultSetOKPacket());
    assertEquals(1, actualPosition);
  }
  @Test
  public void buildComInitDbTest2() {
    // Arrange
    NativeMessageBuilder nativeMessageBuilder = new NativeMessageBuilder();

    // Act
    NativePacketPayload actualBuildComInitDbResult = nativeMessageBuilder.buildComInitDb(new NativePacketPayload(1),
        "aaaaa");

    // Assert
    int actualCapacity = actualBuildComInitDbResult.getCapacity();
    int actualPosition = actualBuildComInitDbResult.getPosition();
    assertEquals(7, actualCapacity);
    assertEquals(6, actualBuildComInitDbResult.getPayloadLength());
    assertEquals(6, actualPosition);
  }
  @Test
  public void buildComInitDbTest() {
    // Arrange
    NativeMessageBuilder nativeMessageBuilder = new NativeMessageBuilder();

    // Act
    NativePacketPayload actualBuildComInitDbResult = nativeMessageBuilder.buildComInitDb(new NativePacketPayload(1),
        new byte[24]);

    // Assert
    int actualCapacity = actualBuildComInitDbResult.getCapacity();
    int actualPosition = actualBuildComInitDbResult.getPosition();
    assertEquals(31, actualCapacity);
    assertEquals(25, actualBuildComInitDbResult.getPayloadLength());
    assertEquals(25, actualPosition);
  }
  @Test
  public void buildComQueryTest3() {
    // Arrange
    NativeMessageBuilder nativeMessageBuilder = new NativeMessageBuilder();

    // Act and Assert
    thrown.expect(WrongArgumentException.class);
    nativeMessageBuilder.buildComQuery(new NativePacketPayload(1), "aaaaa", "aaaaa");
  }
  @Test
  public void buildComQueryTest2() {
    // Arrange
    NativeMessageBuilder nativeMessageBuilder = new NativeMessageBuilder();

    // Act
    NativePacketPayload actualBuildComQueryResult = nativeMessageBuilder.buildComQuery(new NativePacketPayload(1),
        "aaaaa");

    // Assert
    int actualCapacity = actualBuildComQueryResult.getCapacity();
    int actualPosition = actualBuildComQueryResult.getPosition();
    assertEquals(7, actualCapacity);
    assertEquals(6, actualBuildComQueryResult.getPayloadLength());
    assertEquals(6, actualPosition);
  }
  @Test
  public void buildComQueryTest() {
    // Arrange
    NativeMessageBuilder nativeMessageBuilder = new NativeMessageBuilder();

    // Act
    NativePacketPayload actualBuildComQueryResult = nativeMessageBuilder.buildComQuery(new NativePacketPayload(1),
        new byte[24]);

    // Assert
    int actualCapacity = actualBuildComQueryResult.getCapacity();
    int actualPosition = actualBuildComQueryResult.getPosition();
    assertEquals(31, actualCapacity);
    assertEquals(25, actualBuildComQueryResult.getPayloadLength());
    assertEquals(25, actualPosition);
  }
  @Test
  public void buildCloseTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new NativeMessageBuilder()).buildClose();
  }
  @Test
  public void buildSqlStatementTest2() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new NativeMessageBuilder()).buildSqlStatement("aaaaa", null);
  }
  @Test
  public void buildSqlStatementTest() {
    // Arrange, Act and Assert
    thrown.expect(CJOperationNotSupportedException.class);
    (new NativeMessageBuilder()).buildSqlStatement("aaaaa");
  }
}
