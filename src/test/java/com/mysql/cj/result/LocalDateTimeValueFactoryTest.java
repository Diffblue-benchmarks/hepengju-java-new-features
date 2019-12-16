package com.mysql.cj.result;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.exceptions.DataReadException;
import com.mysql.cj.protocol.InternalDate;
import com.mysql.cj.protocol.InternalTimestamp;
import java.time.LocalDateTime;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LocalDateTimeValueFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getTargetTypeNameTest() {
    // Arrange, Act and Assert
    assertEquals("java.time.LocalDateTime",
        (new LocalDateTimeValueFactory(new DefaultPropertySet())).getTargetTypeName());
  }
  @Test
  public void localCreateFromTimestampTest() {
    // Arrange
    LocalDateTimeValueFactory localDateTimeValueFactory = new LocalDateTimeValueFactory(new DefaultPropertySet());

    // Act and Assert
    thrown.expect(DataReadException.class);
    localDateTimeValueFactory.localCreateFromTimestamp(new InternalTimestamp());
  }
  @Test
  public void localCreateFromDateTest() {
    // Arrange
    LocalDateTimeValueFactory localDateTimeValueFactory = new LocalDateTimeValueFactory(new DefaultPropertySet());

    // Act and Assert
    thrown.expect(DataReadException.class);
    localDateTimeValueFactory.localCreateFromDate(new InternalDate());
  }
}
