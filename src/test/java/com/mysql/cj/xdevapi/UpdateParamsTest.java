package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UpdateParamsTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getUpdatesTest() {
    // Arrange, Act and Assert
    assertEquals(0, ((HashMap) (new UpdateParams()).getUpdates()).size());
  }
  @Test
  public void setUpdatesTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new UpdateParams()).setUpdates(null);
  }
}
