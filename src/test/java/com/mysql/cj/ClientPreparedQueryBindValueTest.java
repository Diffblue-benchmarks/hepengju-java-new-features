package com.mysql.cj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;

public class ClientPreparedQueryBindValueTest {
  @Test
  public void isSetTest() {
    // Arrange, Act and Assert
    assertFalse((new ClientPreparedQueryBindValue()).isSet());
  }

  @Test
  public void getStreamLengthTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ClientPreparedQueryBindValue()).getStreamLength());
  }

  @Test
  public void setStreamValueTest() {
    // Arrange
    ClientPreparedQueryBindValue clientPreparedQueryBindValue = new ClientPreparedQueryBindValue();

    // Act
    clientPreparedQueryBindValue.setStreamValue(new ByteArrayInputStream(new byte[24]), 1L);

    // Assert
    long actualStreamLength = clientPreparedQueryBindValue.getStreamLength();
    byte[] actualByteValue = clientPreparedQueryBindValue.getByteValue();
    assertTrue(clientPreparedQueryBindValue.isSet());
    assertNull(actualByteValue);
    assertEquals(1L, actualStreamLength);
  }

  @Test
  public void getStreamValueTest() {
    // Arrange, Act and Assert
    assertNull((new ClientPreparedQueryBindValue()).getStreamValue());
  }

  @Test
  public void getOrigByteValueTest() {
    // Arrange, Act and Assert
    assertNull((new ClientPreparedQueryBindValue()).getOrigByteValue());
  }

  @Test
  public void setOrigByteValueTest() {
    // Arrange
    ClientPreparedQueryBindValue clientPreparedQueryBindValue = new ClientPreparedQueryBindValue();
    byte[] byteArray = new byte[24];

    // Act
    clientPreparedQueryBindValue.setOrigByteValue(byteArray);

    // Assert
    assertSame(byteArray, clientPreparedQueryBindValue.origValue);
  }

  @Test
  public void setByteValueTest() {
    // Arrange
    ClientPreparedQueryBindValue clientPreparedQueryBindValue = new ClientPreparedQueryBindValue();

    // Act
    clientPreparedQueryBindValue.setByteValue(new byte[24]);

    // Assert
    long actualStreamLength = clientPreparedQueryBindValue.getStreamLength();
    boolean actualIsStreamResult = clientPreparedQueryBindValue.isStream();
    boolean actualIsNullResult = clientPreparedQueryBindValue.isNull();
    boolean actualIsSetResult = clientPreparedQueryBindValue.isSet();
    assertNull(clientPreparedQueryBindValue.getStreamValue());
    assertTrue(actualIsSetResult);
    assertFalse(actualIsNullResult);
    assertFalse(actualIsStreamResult);
    assertEquals(0L, actualStreamLength);
  }

  @Test
  public void getByteValueTest() {
    // Arrange, Act and Assert
    assertNull((new ClientPreparedQueryBindValue()).getByteValue());
  }

  @Test
  public void setMysqlTypeTest() {
    // Arrange
    ClientPreparedQueryBindValue clientPreparedQueryBindValue = new ClientPreparedQueryBindValue();

    // Act
    clientPreparedQueryBindValue.setMysqlType(MysqlType.DECIMAL);

    // Assert
    assertEquals(MysqlType.DECIMAL, clientPreparedQueryBindValue.getMysqlType());
  }

  @Test
  public void getMysqlTypeTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlType.NULL, (new ClientPreparedQueryBindValue()).getMysqlType());
  }

  @Test
  public void setIsStreamTest() {
    // Arrange
    ClientPreparedQueryBindValue clientPreparedQueryBindValue = new ClientPreparedQueryBindValue();

    // Act
    clientPreparedQueryBindValue.setIsStream(true);

    // Assert
    assertTrue(clientPreparedQueryBindValue.isStream());
  }

  @Test
  public void isStreamTest() {
    // Arrange, Act and Assert
    assertFalse((new ClientPreparedQueryBindValue()).isStream());
  }

  @Test
  public void setNullTest() {
    // Arrange
    ClientPreparedQueryBindValue clientPreparedQueryBindValue = new ClientPreparedQueryBindValue();

    // Act
    clientPreparedQueryBindValue.setNull(true);

    // Assert
    MysqlType actualMysqlType = clientPreparedQueryBindValue.getMysqlType();
    boolean actualIsNullResult = clientPreparedQueryBindValue.isNull();
    assertEquals(MysqlType.NULL, actualMysqlType);
    assertTrue(clientPreparedQueryBindValue.isSet());
    assertTrue(actualIsNullResult);
  }

  @Test
  public void isNullTest() {
    // Arrange, Act and Assert
    assertFalse((new ClientPreparedQueryBindValue()).isNull());
  }

  @Test
  public void resetTest() {
    // Arrange
    ClientPreparedQueryBindValue clientPreparedQueryBindValue = new ClientPreparedQueryBindValue();

    // Act
    clientPreparedQueryBindValue.reset();

    // Assert
    MysqlType actualMysqlType = clientPreparedQueryBindValue.getMysqlType();
    long actualStreamLength = clientPreparedQueryBindValue.getStreamLength();
    boolean actualIsStreamResult = clientPreparedQueryBindValue.isStream();
    boolean actualIsNullResult = clientPreparedQueryBindValue.isNull();
    assertEquals(MysqlType.NULL, actualMysqlType);
    assertNull(clientPreparedQueryBindValue.origValue);
    assertNull(clientPreparedQueryBindValue.value);
    assertFalse(clientPreparedQueryBindValue.isSet());
    assertFalse(actualIsNullResult);
    assertFalse(actualIsStreamResult);
    assertEquals(0L, actualStreamLength);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ClientPreparedQueryBindValue actualClientPreparedQueryBindValue = new ClientPreparedQueryBindValue(
        new ClientPreparedQueryBindValue());

    // Assert
    MysqlType actualMysqlType = actualClientPreparedQueryBindValue.getMysqlType();
    long actualStreamLength = actualClientPreparedQueryBindValue.getStreamLength();
    boolean actualIsStreamResult = actualClientPreparedQueryBindValue.isStream();
    boolean actualIsNullResult = actualClientPreparedQueryBindValue.isNull();
    assertEquals(MysqlType.NULL, actualMysqlType);
    assertNull(actualClientPreparedQueryBindValue.value);
    assertFalse(actualClientPreparedQueryBindValue.isSet());
    assertFalse(actualIsNullResult);
    assertFalse(actualIsStreamResult);
    assertEquals(0L, actualStreamLength);
  }

  @Test
  public void cloneTest() {
    // Arrange and Act
    ClientPreparedQueryBindValue actualCloneResult = (new ClientPreparedQueryBindValue()).clone();

    // Assert
    MysqlType actualMysqlType = actualCloneResult.getMysqlType();
    long actualStreamLength = actualCloneResult.getStreamLength();
    boolean actualIsStreamResult = actualCloneResult.isStream();
    boolean actualIsNullResult = actualCloneResult.isNull();
    assertEquals(MysqlType.NULL, actualMysqlType);
    assertNull(actualCloneResult.value);
    assertFalse(actualCloneResult.isSet());
    assertFalse(actualIsNullResult);
    assertFalse(actualIsStreamResult);
    assertEquals(0L, actualStreamLength);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ClientPreparedQueryBindValue actualClientPreparedQueryBindValue = new ClientPreparedQueryBindValue();

    // Assert
    MysqlType actualMysqlType = actualClientPreparedQueryBindValue.getMysqlType();
    boolean actualIsStreamResult = actualClientPreparedQueryBindValue.isStream();
    assertEquals(MysqlType.NULL, actualMysqlType);
    assertFalse(actualClientPreparedQueryBindValue.isSet());
    assertFalse(actualIsStreamResult);
  }
}
