package com.mysql.cj.jdbc.exceptions;

import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.log.Jdk14Logger;
import com.mysql.cj.protocol.a.MultiPacketReader;
import com.mysql.cj.protocol.a.TimeTrackingPacketReader;
import com.mysql.cj.protocol.a.TimeTrackingPacketSender;
import com.mysql.cj.protocol.a.TracingPacketSender;
import java.sql.SQLException;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SQLErrorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void createBatchUpdateExceptionTest() throws SQLException {
    // Arrange
    long[] longArray = new long[8];
    Arrays.fill(longArray, 1L);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    SQLError.createBatchUpdateException(null, longArray, null);
  }
  @Test
  public void createCommunicationsExceptionTest() {
    // Arrange
    TracingPacketSender packetSender = new TracingPacketSender(null, null, "08", 1L);
    Jdk14Logger jdk14Logger = new Jdk14Logger("08");
    TimeTrackingPacketSender packetSentTimeHolder = new TimeTrackingPacketSender(
        new TracingPacketSender(new TracingPacketSender(packetSender, jdk14Logger, "08", 1L), jdk14Logger, "08", 1L));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    SQLError.createCommunicationsException(null, packetSentTimeHolder,
        new TimeTrackingPacketReader(new MultiPacketReader(new MultiPacketReader(new MultiPacketReader(null)))), null,
        null);
  }
}
