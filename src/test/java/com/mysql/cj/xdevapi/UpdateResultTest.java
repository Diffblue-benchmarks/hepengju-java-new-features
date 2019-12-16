package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.protocol.x.StatementExecuteOk;
import org.junit.Test;

public class UpdateResultTest {
  @Test
  public void getWarningsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new UpdateResult(new StatementExecuteOk())).getWarningsCount());
  }

  @Test
  public void getAffectedItemsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new UpdateResult(new StatementExecuteOk())).getAffectedItemsCount());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new UpdateResult(new StatementExecuteOk())).getAffectedItemsCount());
  }
}
