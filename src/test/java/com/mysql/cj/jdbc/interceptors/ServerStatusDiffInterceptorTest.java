package com.mysql.cj.jdbc.interceptors;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.interceptors.QueryInterceptor;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.log.Jdk14Logger;
import java.util.Properties;
import org.junit.Test;

public class ServerStatusDiffInterceptorTest {
  @Test
  public void executeTopLevelOnlyTest() {
    // Arrange, Act and Assert
    assertTrue((new ServerStatusDiffInterceptor()).executeTopLevelOnly());
  }

  @Test
  public void initTest() {
    // Arrange
    ServerStatusDiffInterceptor serverStatusDiffInterceptor = new ServerStatusDiffInterceptor();

    // Act and Assert
    assertSame(serverStatusDiffInterceptor, serverStatusDiffInterceptor.init(null, null, new Jdk14Logger("aaaaa")));
  }
}
