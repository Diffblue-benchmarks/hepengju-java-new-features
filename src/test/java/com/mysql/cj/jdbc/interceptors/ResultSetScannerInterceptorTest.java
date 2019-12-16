package com.mysql.cj.jdbc.interceptors;

import static org.junit.Assert.assertFalse;
import com.mysql.cj.interceptors.QueryInterceptor;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.log.Jdk14Logger;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResultSetScannerInterceptorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void executeTopLevelOnlyTest() {
    // Arrange, Act and Assert
    assertFalse((new ResultSetScannerInterceptor()).executeTopLevelOnly());
  }
  @Test
  public void initTest() {
    // Arrange
    ResultSetScannerInterceptor resultSetScannerInterceptor = new ResultSetScannerInterceptor();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    resultSetScannerInterceptor.init(null, null, new Jdk14Logger("resultSetScannerRegex"));
  }
}
