package com.mysql.cj.xdevapi;

import com.mysql.cj.MysqlxSession;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ModifyStatementImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(XDevAPIError.class);
    new ModifyStatementImpl(null, "", "", "");
  }
}
