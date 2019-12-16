package com.mysql.cj.jdbc.exceptions;

import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import java.sql.SQLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SQLExceptionsMappingTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void translateExceptionTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    SQLExceptionsMapping.translateException(null);
  }
  @Test
  public void translateExceptionTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    SQLExceptionsMapping.translateException(null, null);
  }
}
