package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.ServerVersion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NativeCapabilitiesTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void serverSupportsFracSecsTest() {
    // Arrange, Act and Assert
    assertTrue((new NativeCapabilities()).serverSupportsFracSecs());
  }

  @Test
  public void setAuthPluginDataLengthTest() {
    // Arrange
    NativeCapabilities nativeCapabilities = new NativeCapabilities();

    // Act
    nativeCapabilities.setAuthPluginDataLength(1);

    // Assert
    assertEquals(1, nativeCapabilities.getAuthPluginDataLength());
  }

  @Test
  public void getAuthPluginDataLengthTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NativeCapabilities()).getAuthPluginDataLength());
  }

  @Test
  public void setStatusFlagsTest() {
    // Arrange
    NativeCapabilities nativeCapabilities = new NativeCapabilities();

    // Act
    nativeCapabilities.setStatusFlags(1);

    // Assert
    assertEquals(1, nativeCapabilities.getStatusFlags());
  }

  @Test
  public void getStatusFlagsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NativeCapabilities()).getStatusFlags());
  }

  @Test
  public void setServerDefaultCollationIndexTest() {
    // Arrange
    NativeCapabilities nativeCapabilities = new NativeCapabilities();

    // Act
    nativeCapabilities.setServerDefaultCollationIndex(1);

    // Assert
    assertEquals(1, nativeCapabilities.getServerDefaultCollationIndex());
  }

  @Test
  public void getServerDefaultCollationIndexTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NativeCapabilities()).getServerDefaultCollationIndex());
  }

  @Test
  public void setSeedTest() {
    // Arrange
    NativeCapabilities nativeCapabilities = new NativeCapabilities();

    // Act
    nativeCapabilities.setSeed("aaaaa");

    // Assert
    assertEquals("aaaaa", nativeCapabilities.getSeed());
  }

  @Test
  public void getSeedTest() {
    // Arrange, Act and Assert
    assertNull((new NativeCapabilities()).getSeed());
  }

  @Test
  public void setThreadIdTest() {
    // Arrange
    NativeCapabilities nativeCapabilities = new NativeCapabilities();

    // Act
    nativeCapabilities.setThreadId(1L);

    // Assert
    assertEquals(1L, nativeCapabilities.getThreadId());
  }

  @Test
  public void getThreadIdTest() {
    // Arrange, Act and Assert
    assertEquals(-1L, (new NativeCapabilities()).getThreadId());
  }

  @Test
  public void setServerVersionTest() {
    // Arrange
    NativeCapabilities nativeCapabilities = new NativeCapabilities();
    ServerVersion parseVersionResult = ServerVersion.parseVersion("aaaaa");

    // Act
    nativeCapabilities.setServerVersion(parseVersionResult);

    // Assert
    assertSame(parseVersionResult, nativeCapabilities.getServerVersion());
  }

  @Test
  public void getServerVersionTest() {
    // Arrange, Act and Assert
    assertNull((new NativeCapabilities()).getServerVersion());
  }

  @Test
  public void setProtocolVersionTest() {
    // Arrange
    NativeCapabilities nativeCapabilities = new NativeCapabilities();

    // Act
    nativeCapabilities.setProtocolVersion((byte) 0);

    // Assert
    assertEquals((byte) 0, nativeCapabilities.getProtocolVersion());
  }

  @Test
  public void getProtocolVersionTest() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, (new NativeCapabilities()).getProtocolVersion());
  }

  @Test
  public void setCapabilityFlagsTest() {
    // Arrange
    NativeCapabilities nativeCapabilities = new NativeCapabilities();

    // Act
    nativeCapabilities.setCapabilityFlags(1);

    // Assert
    assertEquals(1, nativeCapabilities.getCapabilityFlags());
  }

  @Test
  public void getCapabilityFlagsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NativeCapabilities()).getCapabilityFlags());
  }

  @Test
  public void setInitialHandshakePacketTest() {
    // Arrange
    NativeCapabilities nativeCapabilities = new NativeCapabilities();

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    nativeCapabilities.setInitialHandshakePacket(new NativePacketPayload(1));
  }

  @Test
  public void getInitialHandshakePacketTest() {
    // Arrange, Act and Assert
    assertNull((new NativeCapabilities()).getInitialHandshakePacket());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    NativeCapabilities actualNativeCapabilities = new NativeCapabilities();

    // Assert
    long actualThreadId = actualNativeCapabilities.getThreadId();
    int actualAuthPluginDataLength = actualNativeCapabilities.getAuthPluginDataLength();
    byte actualProtocolVersion = actualNativeCapabilities.getProtocolVersion();
    assertEquals(-1L, actualThreadId);
    assertEquals(0, actualNativeCapabilities.getStatusFlags());
    assertEquals((byte) 0, actualProtocolVersion);
    assertEquals(0, actualAuthPluginDataLength);
  }
}
