package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.mysql.cj.protocol.Warning;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StatementExecuteOkTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getWarningsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new StatementExecuteOk()).getWarningsCount());
  }

  @Test
  public void getGeneratedIdsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new StatementExecuteOk()).getGeneratedIds().size());
  }

  @Test
  public void getLastInsertIdTest() {
    // Arrange, Act and Assert
    assertNull((new StatementExecuteOk()).getLastInsertId());
  }

  @Test
  public void getAffectedItemsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new StatementExecuteOk()).getAffectedItemsCount());
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new StatementExecuteOk(1L, null, null, null);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    StatementExecuteOk actualStatementExecuteOk = new StatementExecuteOk();

    // Assert
    Long actualLastInsertId = actualStatementExecuteOk.getLastInsertId();
    int actualWarningsCount = actualStatementExecuteOk.getWarningsCount();
    assertNull(actualLastInsertId);
    assertEquals(0L, actualStatementExecuteOk.getAffectedItemsCount());
    assertEquals(0, actualWarningsCount);
  }
}
