package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.protocol.x.StatementExecuteOk;
import java.util.List;
import org.junit.Test;

public class AddResultImplTest {
  @Test
  public void getGeneratedIdsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new AddResultImpl(new StatementExecuteOk())).getGeneratedIds().size());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new AddResultImpl(new StatementExecuteOk())).getAffectedItemsCount());
  }
}
