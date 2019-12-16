package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertFalse;
import com.mysql.cj.exceptions.DataReadException;
import com.mysql.cj.protocol.InternalDate;
import com.mysql.cj.protocol.InternalTime;
import com.mysql.cj.protocol.InternalTimestamp;
import java.math.BigInteger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysqlTextValueDecoderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getTimestampTest() {
    // Arrange, Act and Assert
    thrown.expect(DataReadException.class);
    MysqlTextValueDecoder.getTimestamp(new byte[24], 1, 1);
  }
  @Test
  public void getTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(DataReadException.class);
    MysqlTextValueDecoder.getTime(new byte[24], 1, 1);
  }
  @Test
  public void getDateTest() {
    // Arrange, Act and Assert
    thrown.expect(DataReadException.class);
    MysqlTextValueDecoder.getDate(new byte[24], 1, 1);
  }
  @Test
  public void isTimestampTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlTextValueDecoder.isTimestamp("DATE"));
  }
  @Test
  public void isTimeTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlTextValueDecoder.isTime("DATE"));
  }
  @Test
  public void isDateTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlTextValueDecoder.isDate("DATE"));
  }
  @Test
  public void getDoubleTest() {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    MysqlTextValueDecoder.getDouble(new byte[24], 1, 1);
  }
  @Test
  public void getBigIntegerTest() throws NumberFormatException {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    MysqlTextValueDecoder.getBigInteger(new byte[24], 1, 1);
  }
  @Test
  public void getLongTest() throws NumberFormatException {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    MysqlTextValueDecoder.getLong(new byte[24], 1, 1);
  }
  @Test
  public void getIntTest() throws NumberFormatException {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    MysqlTextValueDecoder.getInt(new byte[24], 1, 1);
  }
}
