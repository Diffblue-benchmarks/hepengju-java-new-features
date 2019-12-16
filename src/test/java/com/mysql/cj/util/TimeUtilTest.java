package com.mysql.cj.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.exceptions.InvalidConnectionAttributeException;
import java.io.IOException;
import java.sql.Timestamp;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TimeUtilTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getDateTimePatternTest() throws IOException {
    // Arrange, Act and Assert
    assertEquals("HH:mm:ss", TimeUtil.getDateTimePattern("000000000", true));
  }

  @Test
  public void truncateFractionalSecondsTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    TimeUtil.truncateFractionalSeconds(null);
  }

  @Test
  public void formatNanosTest() {
    // Arrange, Act and Assert
    assertEquals("0", TimeUtil.formatNanos(1, 1));
  }

  @Test
  public void adjustTimestampNanosPrecisionTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    TimeUtil.adjustTimestampNanosPrecision(null, 1, true);
  }

  @Test
  public void getCanonicalTimezoneTest() {
    // Arrange, Act and Assert
    thrown.expect(InvalidConnectionAttributeException.class);
    TimeUtil.getCanonicalTimezone("000000000", null);
  }

  @Test
  public void nanoTimeAvailableTest() {
    // Arrange, Act and Assert
    assertTrue(TimeUtil.nanoTimeAvailable());
  }
}
