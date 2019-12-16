package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.google.protobuf.Message;
import org.junit.Test;

public class StatementExecuteOkFactoryTest {
  @Test
  public void createFromMessageTest() {
    // Arrange
    StatementExecuteOkFactory statementExecuteOkFactory = new StatementExecuteOkFactory();

    // Act
    StatementExecuteOk actualCreateFromMessageResult = statementExecuteOkFactory
        .createFromMessage(new XMessage(new XMessage(new XMessage(null))));

    // Assert
    Long actualLastInsertId = actualCreateFromMessageResult.getLastInsertId();
    int actualWarningsCount = actualCreateFromMessageResult.getWarningsCount();
    assertNull(actualLastInsertId);
    assertEquals(0L, actualCreateFromMessageResult.getAffectedItemsCount());
    assertEquals(0, actualWarningsCount);
  }
}
