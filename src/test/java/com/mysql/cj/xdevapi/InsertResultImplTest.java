package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertNull;
import com.mysql.cj.protocol.x.StatementExecuteOk;
import org.junit.Test;

public class InsertResultImplTest {
  @Test
  public void getAutoIncrementValueTest() {
    // Arrange, Act and Assert
    assertNull((new InsertResultImpl(new StatementExecuteOk())).getAutoIncrementValue());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new InsertResultImpl(new StatementExecuteOk())).getAutoIncrementValue());
  }
}
