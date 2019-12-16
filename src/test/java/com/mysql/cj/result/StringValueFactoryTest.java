package com.mysql.cj.result;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.mysql.cj.MysqlType;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.conf.PropertySet;
import com.mysql.cj.protocol.InternalDate;
import com.mysql.cj.protocol.InternalTime;
import com.mysql.cj.protocol.InternalTimestamp;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringValueFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getTargetTypeNameTest() {
    // Arrange, Act and Assert
    assertEquals("java.lang.String", (new StringValueFactory(new DefaultPropertySet())).getTargetTypeName());
  }

  @Test
  public void createFromNullTest() {
    // Arrange, Act and Assert
    assertNull((new StringValueFactory(new DefaultPropertySet())).createFromNull());
  }

  @Test
  public void createFromYearTest() {
    // Arrange, Act and Assert
    assertEquals("2001-01-01", (new StringValueFactory(new DefaultPropertySet())).createFromYear(1L));
  }

  @Test
  public void createFromBitTest() {
    // Arrange, Act and Assert
    assertEquals("0", (new StringValueFactory(new DefaultPropertySet())).createFromBit(new byte[24], 1, 1));
  }

  @Test
  public void createFromBytesTest() {
    // Arrange
    StringValueFactory stringValueFactory = new StringValueFactory(new DefaultPropertySet());

    // Act and Assert
    assertEquals("\u0000", stringValueFactory.createFromBytes(new byte[24], 1, 1,
        new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1)));
  }

  @Test
  public void createFromBigDecimalTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new StringValueFactory(new DefaultPropertySet())).createFromBigDecimal(null);
  }

  @Test
  public void createFromDoubleTest() {
    // Arrange, Act and Assert
    assertEquals("1.0", (new StringValueFactory(new DefaultPropertySet())).createFromDouble(1.0));
  }

  @Test
  public void createFromBigIntegerTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new StringValueFactory(new DefaultPropertySet())).createFromBigInteger(null);
  }

  @Test
  public void createFromLongTest() {
    // Arrange, Act and Assert
    assertEquals("1", (new StringValueFactory(new DefaultPropertySet())).createFromLong(1L));
  }

  @Test
  public void createFromTimestampTest() {
    // Arrange
    StringValueFactory stringValueFactory = new StringValueFactory(new DefaultPropertySet());

    // Act and Assert
    assertEquals("0000-00-00 00:00:00", stringValueFactory.createFromTimestamp(new InternalTimestamp()));
  }

  @Test
  public void createFromTimeTest() {
    // Arrange
    StringValueFactory stringValueFactory = new StringValueFactory(new DefaultPropertySet());

    // Act and Assert
    assertEquals("00:00:00", stringValueFactory.createFromTime(new InternalTime()));
  }

  @Test
  public void createFromDateTest() {
    // Arrange
    StringValueFactory stringValueFactory = new StringValueFactory(new DefaultPropertySet());

    // Act and Assert
    assertEquals("0000-00-00", stringValueFactory.createFromDate(new InternalDate()));
  }

  @Test
  public void setPropertySetTest() {
    // Arrange
    DefaultPropertySet defaultPropertySet = new DefaultPropertySet();
    StringValueFactory stringValueFactory = new StringValueFactory(defaultPropertySet);

    // Act
    stringValueFactory.setPropertySet(defaultPropertySet);

    // Assert
    assertSame(defaultPropertySet, stringValueFactory.pset);
  }

  @Test
  public void constructorTest() {
    // Arrange
    DefaultPropertySet defaultPropertySet = new DefaultPropertySet();

    // Act and Assert
    assertSame(defaultPropertySet, (new StringValueFactory(defaultPropertySet)).pset);
  }
}
