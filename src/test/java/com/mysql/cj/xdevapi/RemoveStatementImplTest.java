package com.mysql.cj.xdevapi;

import com.mysql.cj.MysqlxSession;
import com.mysql.cj.exceptions.WrongArgumentException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RemoveStatementImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    new RemoveStatementImpl(null, "RemoveStatement.0", "RemoveStatement.0", "RemoveStatement.0");
  }
}
