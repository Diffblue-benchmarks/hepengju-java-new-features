package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class MysqlXidTest {
  @Test
  public void hashCodeTest() {
    // Arrange
    MysqlXid mysqlXid = new MysqlXid(new byte[24], new byte[24], 1);

    // Act and Assert
    assertEquals(0, mysqlXid.hashCode());
    assertEquals(0, mysqlXid.hash);
  }

  @Test
  public void getGlobalTransactionIdTest() {
    // Arrange and Act
    byte[] actualGlobalTransactionId = (new MysqlXid(new byte[24], new byte[24], 1)).getGlobalTransactionId();

    // Assert
    assertEquals(24, actualGlobalTransactionId.length);
    assertEquals((byte) 0, actualGlobalTransactionId[0]);
    assertEquals((byte) 0, actualGlobalTransactionId[1]);
    assertEquals((byte) 0, actualGlobalTransactionId[2]);
    assertEquals((byte) 0, actualGlobalTransactionId[3]);
    assertEquals((byte) 0, actualGlobalTransactionId[4]);
    assertEquals((byte) 0, actualGlobalTransactionId[5]);
    assertEquals((byte) 0, actualGlobalTransactionId[18]);
    assertEquals((byte) 0, actualGlobalTransactionId[19]);
    assertEquals((byte) 0, actualGlobalTransactionId[20]);
    assertEquals((byte) 0, actualGlobalTransactionId[21]);
    assertEquals((byte) 0, actualGlobalTransactionId[22]);
    assertEquals((byte) 0, actualGlobalTransactionId[23]);
  }

  @Test
  public void getFormatIdTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new MysqlXid(new byte[24], new byte[24], 1)).getFormatId());
  }

  @Test
  public void getBranchQualifierTest() {
    // Arrange and Act
    byte[] actualBranchQualifier = (new MysqlXid(new byte[24], new byte[24], 1)).getBranchQualifier();

    // Assert
    assertEquals(24, actualBranchQualifier.length);
    assertEquals((byte) 0, actualBranchQualifier[0]);
    assertEquals((byte) 0, actualBranchQualifier[1]);
    assertEquals((byte) 0, actualBranchQualifier[2]);
    assertEquals((byte) 0, actualBranchQualifier[3]);
    assertEquals((byte) 0, actualBranchQualifier[4]);
    assertEquals((byte) 0, actualBranchQualifier[5]);
    assertEquals((byte) 0, actualBranchQualifier[18]);
    assertEquals((byte) 0, actualBranchQualifier[19]);
    assertEquals((byte) 0, actualBranchQualifier[20]);
    assertEquals((byte) 0, actualBranchQualifier[21]);
    assertEquals((byte) 0, actualBranchQualifier[22]);
    assertEquals((byte) 0, actualBranchQualifier[23]);
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new MysqlXid(new byte[24], new byte[24], 1)).equals("aaaaa"));
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    MysqlXid actualMysqlXid = new MysqlXid(new byte[24], new byte[24], 1);

    // Assert
    byte[] globalTransactionId = actualMysqlXid.getGlobalTransactionId();
    int actualFormatId = actualMysqlXid.getFormatId();
    assertEquals(24, globalTransactionId.length);
    assertEquals(0, actualMysqlXid.hash);
    assertEquals(24, actualMysqlXid.getBranchQualifier().length);
    assertEquals(1, actualFormatId);
  }
}
