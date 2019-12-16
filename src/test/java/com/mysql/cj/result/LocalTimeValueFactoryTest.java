package com.mysql.cj.result;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.exceptions.DataConversionException;
import com.mysql.cj.protocol.InternalDate;
import java.time.LocalTime;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LocalTimeValueFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getTargetTypeNameTest() {
    // Arrange, Act and Assert
    assertEquals("java.time.LocalTime", (new LocalTimeValueFactory(new DefaultPropertySet())).getTargetTypeName());
  }
  @Test
  public void createFromYearTest() {
    // Arrange, Act and Assert
    thrown.expect(DataConversionException.class);
    (new LocalTimeValueFactory(new DefaultPropertySet())).createFromYear(1L);
  }
  @Test
  public void localCreateFromDateTest() {
    // Arrange
    LocalTimeValueFactory localTimeValueFactory = new LocalTimeValueFactory(new DefaultPropertySet());

    // Act and Assert
    thrown.expect(DataConversionException.class);
    localTimeValueFactory.localCreateFromDate(new InternalDate());
  }
}
