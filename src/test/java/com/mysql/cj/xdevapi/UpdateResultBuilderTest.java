package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.mysql.cj.exceptions.WrongArgumentException;
import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import com.mysql.cj.protocol.x.StatementExecuteOk;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UpdateResultBuilderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange and Act
    Result actualBuildResult = (new UpdateResultBuilder<Result>()).build();

    // Assert
    long actualAffectedItemsCount = actualBuildResult.getAffectedItemsCount();
    StatementExecuteOk statementExecuteOk = ((UpdateResult) actualBuildResult).ok;
    Long actualLastInsertId = statementExecuteOk.getLastInsertId();
    int actualWarningsCount = statementExecuteOk.getWarningsCount();
    assertEquals(0L, actualAffectedItemsCount);
    assertEquals(0L, statementExecuteOk.getAffectedItemsCount());
    assertEquals(0, actualWarningsCount);
    assertNull(actualLastInsertId);
  }
  @Test
  public void addProtocolEntityTest() {
    // Arrange
    UpdateResultBuilder<Result> updateResultBuilder = new UpdateResultBuilder<Result>();

    // Act and Assert
    thrown.expect(WrongArgumentException.class);
    updateResultBuilder.addProtocolEntity(new CachedResultSetMetaDataImpl());
  }
}
