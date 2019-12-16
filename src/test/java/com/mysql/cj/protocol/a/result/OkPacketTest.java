package com.mysql.cj.protocol.a.result;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.mysql.cj.protocol.a.NativePacketPayload;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OkPacketTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void setWarningCountTest() {
    // Arrange
    OkPacket okPacket = new OkPacket();

    // Act
    okPacket.setWarningCount(1);

    // Assert
    assertEquals(1, okPacket.getWarningCount());
  }

  @Test
  public void getWarningCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new OkPacket()).getWarningCount());
  }

  @Test
  public void setStatusFlagsTest() {
    // Arrange
    OkPacket okPacket = new OkPacket();

    // Act
    okPacket.setStatusFlags(1);

    // Assert
    assertEquals(1, okPacket.getStatusFlags());
  }

  @Test
  public void getStatusFlagsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new OkPacket()).getStatusFlags());
  }

  @Test
  public void setInfoTest() {
    // Arrange
    OkPacket okPacket = new OkPacket();

    // Act
    okPacket.setInfo("aaaaa");

    // Assert
    assertEquals("aaaaa", okPacket.getInfo());
  }

  @Test
  public void getInfoTest() {
    // Arrange, Act and Assert
    assertNull((new OkPacket()).getInfo());
  }

  @Test
  public void setUpdateIDTest() {
    // Arrange
    OkPacket okPacket = new OkPacket();

    // Act
    okPacket.setUpdateID(1L);

    // Assert
    assertEquals(1L, okPacket.getUpdateID());
  }

  @Test
  public void getUpdateIDTest() {
    // Arrange, Act and Assert
    assertEquals(-1L, (new OkPacket()).getUpdateID());
  }

  @Test
  public void setUpdateCountTest() {
    // Arrange
    OkPacket okPacket = new OkPacket();

    // Act
    okPacket.setUpdateCount(1L);

    // Assert
    assertEquals(1L, okPacket.getUpdateCount());
  }

  @Test
  public void getUpdateCountTest() {
    // Arrange, Act and Assert
    assertEquals(-1L, (new OkPacket()).getUpdateCount());
  }

  @Test
  public void parseTest() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    OkPacket.parse(new NativePacketPayload(1), "aaaaa");
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    OkPacket actualOkPacket = new OkPacket();

    // Assert
    int actualStatusFlags = actualOkPacket.getStatusFlags();
    int actualWarningCount = actualOkPacket.getWarningCount();
    long actualUpdateCount = actualOkPacket.getUpdateCount();
    long actualUpdateID = actualOkPacket.getUpdateID();
    assertEquals(0, actualStatusFlags);
    assertNull(actualOkPacket.getInfo());
    assertEquals(-1L, actualUpdateID);
    assertEquals(-1L, actualUpdateCount);
    assertEquals(0, actualWarningCount);
  }
}
