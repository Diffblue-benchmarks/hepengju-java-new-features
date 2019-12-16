package com.mysql.cj.jdbc;

import static org.junit.Assert.assertTrue;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import java.io.InputStream;
import java.sql.SQLException;
import org.junit.Test;

public class NClobTest {
  @Test
  public void constructorTest2() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new NClob("aaaaa", null)).getAsciiStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void constructorTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new NClob(null)).getAsciiStream() instanceof java.io.ByteArrayInputStream);
  }
}
