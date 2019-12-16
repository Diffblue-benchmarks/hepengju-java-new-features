package com.mysql.cj.jdbc.interceptors;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.interceptors.QueryInterceptor;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.log.Jdk14Logger;
import java.util.Properties;
import org.junit.Test;

public class SessionAssociationInterceptorTest {
  @Test
  public void initTest() {
    // Arrange
    SessionAssociationInterceptor sessionAssociationInterceptor = new SessionAssociationInterceptor();

    // Act and Assert
    assertSame(sessionAssociationInterceptor, sessionAssociationInterceptor.init(null, null, new Jdk14Logger("aaaaa")));
  }

  @Test
  public void executeTopLevelOnlyTest() {
    // Arrange, Act and Assert
    assertTrue((new SessionAssociationInterceptor()).executeTopLevelOnly());
  }

  @Test
  public void getSessionKeyTest() {
    // Arrange, Act and Assert
    assertNull(SessionAssociationInterceptor.getSessionKey());
  }
}
