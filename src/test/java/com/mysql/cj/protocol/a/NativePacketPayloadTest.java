package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.exceptions.WrongArgumentException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NativePacketPayloadTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void extractSqlFromPacketTest() {
    // Arrange, Act and Assert
    assertEquals("a ... (truncated)",
        NativePacketPayload.extractSqlFromPacket("aaaaa", new NativePacketPayload(1), 1, 1));
  }

  @Test
  public void readStringTest2() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new NativePacketPayload(1)).readString(NativeConstants.StringLengthDataType.STRING_FIXED, "aaaaa", 1);
  }

  @Test
  public void readStringTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new NativePacketPayload(1)).readString(NativeConstants.StringSelfDataType.STRING_TERM, "aaaaa");
  }

  @Test
  public void readBytesTest2() {
    // Arrange
    NativePacketPayload nativePacketPayload = new NativePacketPayload(1);

    // Act and Assert
    assertEquals(1, nativePacketPayload.readBytes(NativeConstants.StringLengthDataType.STRING_FIXED, 1).length);
    assertEquals(1, nativePacketPayload.getPosition());
  }

  @Test
  public void skipBytesTest() {
    // Arrange
    NativePacketPayload nativePacketPayload = new NativePacketPayload(1);

    // Act
    nativePacketPayload.skipBytes(NativeConstants.StringSelfDataType.STRING_TERM);

    // Assert
    assertEquals(1, nativePacketPayload.getPosition());
  }

  @Test
  public void readBytesTest() {
    // Arrange
    NativePacketPayload nativePacketPayload = new NativePacketPayload(1);

    // Act and Assert
    assertEquals(0, nativePacketPayload.readBytes(NativeConstants.StringSelfDataType.STRING_TERM).length);
    assertEquals(1, nativePacketPayload.getPosition());
  }

  @Test
  public void writeBytesTest4() {
    // Arrange
    NativePacketPayload nativePacketPayload = new NativePacketPayload(1);

    // Act
    nativePacketPayload.writeBytes(NativeConstants.StringLengthDataType.STRING_FIXED, new byte[24], 1, 1);

    // Assert
    assertEquals(1, nativePacketPayload.getPosition());
  }

  @Test
  public void writeBytesTest3() {
    // Arrange
    NativePacketPayload nativePacketPayload = new NativePacketPayload(1);

    // Act
    nativePacketPayload.writeBytes(NativeConstants.StringSelfDataType.STRING_TERM, new byte[24], 1, 1);

    // Assert
    int actualCapacity = nativePacketPayload.getCapacity();
    int actualPosition = nativePacketPayload.getPosition();
    assertEquals(3, actualCapacity);
    assertEquals(2, nativePacketPayload.getPayloadLength());
    assertEquals(2, actualPosition);
  }

  @Test
  public void writeBytesTest2() {
    // Arrange
    NativePacketPayload nativePacketPayload = new NativePacketPayload(1);

    // Act
    nativePacketPayload.writeBytes(NativeConstants.StringLengthDataType.STRING_FIXED, new byte[24]);

    // Assert
    int actualCapacity = nativePacketPayload.getCapacity();
    int actualPosition = nativePacketPayload.getPosition();
    assertEquals(31, actualCapacity);
    assertEquals(24, nativePacketPayload.getPayloadLength());
    assertEquals(24, actualPosition);
  }

  @Test
  public void writeBytesTest() {
    // Arrange
    NativePacketPayload nativePacketPayload = new NativePacketPayload(1);

    // Act
    nativePacketPayload.writeBytes(NativeConstants.StringSelfDataType.STRING_TERM, new byte[24]);

    // Assert
    int actualCapacity = nativePacketPayload.getCapacity();
    int actualPosition = nativePacketPayload.getPosition();
    assertEquals(32, actualCapacity);
    assertEquals(25, nativePacketPayload.getPayloadLength());
    assertEquals(25, actualPosition);
  }

  @Test
  public void readIntegerTest() {
    // Arrange
    NativePacketPayload nativePacketPayload = new NativePacketPayload(1);

    // Act and Assert
    assertEquals(0L, nativePacketPayload.readInteger(NativeConstants.IntegerDataType.INT1));
    assertEquals(1, nativePacketPayload.getPosition());
  }

  @Test
  public void writeIntegerTest() {
    // Arrange
    NativePacketPayload nativePacketPayload = new NativePacketPayload(1);

    // Act
    nativePacketPayload.writeInteger(NativeConstants.IntegerDataType.INT1, 1L);

    // Assert
    int actualPosition = nativePacketPayload.getPosition();
    assertFalse(nativePacketPayload.isResultSetOKPacket());
    assertEquals(1, actualPosition);
  }

  @Test
  public void isAuthMoreDataTest() {
    // Arrange, Act and Assert
    assertFalse((new NativePacketPayload(1)).isAuthMoreData());
  }

  @Test
  public void isResultSetOKPacketTest() {
    // Arrange, Act and Assert
    assertFalse((new NativePacketPayload(1)).isResultSetOKPacket());
  }

  @Test
  public void isOKPacketTest() {
    // Arrange, Act and Assert
    assertTrue((new NativePacketPayload(1)).isOKPacket());
  }

  @Test
  public void isAuthMethodSwitchRequestPacketTest() {
    // Arrange, Act and Assert
    assertFalse((new NativePacketPayload(1)).isAuthMethodSwitchRequestPacket());
  }

  @Test
  public void isEOFPacketTest() {
    // Arrange, Act and Assert
    assertFalse((new NativePacketPayload(1)).isEOFPacket());
  }

  @Test
  public void isErrorPacketTest() {
    // Arrange, Act and Assert
    assertFalse((new NativePacketPayload(1)).isErrorPacket());
  }

  @Test
  public void setPositionTest() {
    // Arrange
    NativePacketPayload nativePacketPayload = new NativePacketPayload(1);

    // Act
    nativePacketPayload.setPosition(1);

    // Assert
    assertEquals(1, nativePacketPayload.getPosition());
  }

  @Test
  public void getPositionTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NativePacketPayload(1)).getPosition());
  }

  @Test
  public void setPayloadLengthTest() {
    // Arrange
    NativePacketPayload nativePacketPayload = new NativePacketPayload(1);

    // Act
    nativePacketPayload.setPayloadLength(1);

    // Assert
    assertEquals(1, nativePacketPayload.getPayloadLength());
  }

  @Test
  public void getPayloadLengthTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new NativePacketPayload(1)).getPayloadLength());
  }

  @Test
  public void setByteBufferTest() {
    // Arrange
    NativePacketPayload nativePacketPayload = new NativePacketPayload(1);

    // Act
    nativePacketPayload.setByteBuffer(new byte[24]);

    // Assert
    assertEquals(24, nativePacketPayload.getCapacity());
  }

  @Test
  public void getByteBufferTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new NativePacketPayload(1)).getByteBuffer().length);
  }

  @Test
  public void getCapacityTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new NativePacketPayload(1)).getCapacity());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    NativePacketPayload actualNativePacketPayload = new NativePacketPayload(1);

    // Assert
    int actualCapacity = actualNativePacketPayload.getCapacity();
    int actualPosition = actualNativePacketPayload.getPosition();
    assertEquals(1, actualCapacity);
    assertEquals(1, actualNativePacketPayload.getPayloadLength());
    assertEquals(0, actualPosition);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    NativePacketPayload actualNativePacketPayload = new NativePacketPayload(new byte[24]);

    // Assert
    int actualCapacity = actualNativePacketPayload.getCapacity();
    int actualPosition = actualNativePacketPayload.getPosition();
    assertEquals(24, actualCapacity);
    assertEquals(24, actualNativePacketPayload.getPayloadLength());
    assertEquals(0, actualPosition);
  }

  @Test
  public void toStringTest() {
    // Arrange
    NativePacketPayload nativePacketPayload = new NativePacketPayload(1);

    // Act and Assert
    assertEquals("", nativePacketPayload.toString());
    assertEquals(0, nativePacketPayload.getPosition());
  }
}
