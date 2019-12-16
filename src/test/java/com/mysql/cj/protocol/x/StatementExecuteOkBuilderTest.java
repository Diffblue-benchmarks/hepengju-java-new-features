package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.mysql.cj.exceptions.WrongArgumentException;
import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StatementExecuteOkBuilderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange and Act
    StatementExecuteOk actualBuildResult = (new StatementExecuteOkBuilder()).build();

    // Assert
    Long actualLastInsertId = actualBuildResult.getLastInsertId();
    int actualWarningsCount = actualBuildResult.getWarningsCount();
    assertNull(actualLastInsertId);
    assertEquals(0L, actualBuildResult.getAffectedItemsCount());
    assertEquals(0, actualWarningsCount);
  }
  @Test
  public void addProtocolEntityTest() {
    // Arrange
    StatementExecuteOkBuilder statementExecuteOkBuilder = new StatementExecuteOkBuilder();

    // Act and Assert
    thrown.expect(WrongArgumentException.class);
    statementExecuteOkBuilder.addProtocolEntity(new CachedResultSetMetaDataImpl());
  }
}
