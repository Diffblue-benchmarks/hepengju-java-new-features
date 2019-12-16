package com.mysql.cj.admin;

import static org.junit.Assert.assertEquals;
import java.util.Properties;
import org.junit.Test;

public class ServerControllerTest {
  @Test
  public void getServerPropsTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new ServerController("WINDOWS")).getServerProps().size());
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServerController("WINDOWS", "WINDOWS")).getServerProps().size());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new ServerController("WINDOWS")).getServerProps().size());
  }
}
