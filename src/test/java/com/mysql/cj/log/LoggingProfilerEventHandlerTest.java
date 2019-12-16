package com.mysql.cj.log;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LoggingProfilerEventHandlerTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void consumeEventTest() {
    // Arrange
    LoggingProfilerEventHandler loggingProfilerEventHandler = new LoggingProfilerEventHandler();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    loggingProfilerEventHandler
        .consumeEvent(new ProfilerEventImpl((byte) 0, "aaaaa", "aaaaa", 1L, 1, 1, 1L, "aaaaa", null, "aaaaa"));
  }
}
