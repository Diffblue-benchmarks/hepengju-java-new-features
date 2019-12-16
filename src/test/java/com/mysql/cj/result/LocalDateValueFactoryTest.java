package com.mysql.cj.result;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.exceptions.DataConversionException;
import com.mysql.cj.exceptions.DataReadException;
import com.mysql.cj.protocol.InternalDate;
import com.mysql.cj.protocol.InternalTime;
import com.mysql.cj.protocol.InternalTimestamp;
import java.time.LocalDate;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LocalDateValueFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getTargetTypeNameTest() {
    // Arrange, Act and Assert
    assertEquals("java.time.LocalDate", (new LocalDateValueFactory(new DefaultPropertySet())).getTargetTypeName());
  }
  @Test
  public void localCreateFromTimeTest() {
    // Arrange
    LocalDateValueFactory localDateValueFactory = new LocalDateValueFactory(new DefaultPropertySet());

    // Act and Assert
    thrown.expect(DataConversionException.class);
    localDateValueFactory.localCreateFromTime(new InternalTime());
  }
  @Test
  public void localCreateFromTimestampTest() {
    // Arrange
    LocalDateValueFactory localDateValueFactory = new LocalDateValueFactory(new DefaultPropertySet());

    // Act and Assert
    thrown.expect(DataReadException.class);
    localDateValueFactory.localCreateFromTimestamp(new InternalTimestamp());
  }
  @Test
  public void localCreateFromDateTest() {
    // Arrange
    LocalDateValueFactory localDateValueFactory = new LocalDateValueFactory(new DefaultPropertySet());

    // Act and Assert
    thrown.expect(DataReadException.class);
    localDateValueFactory.localCreateFromDate(new InternalDate());
  }
}
