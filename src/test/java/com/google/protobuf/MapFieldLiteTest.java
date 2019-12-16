package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MapFieldLiteTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void calculateHashCodeForMapTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MapFieldLite.<Object, Object>calculateHashCodeForMap(null);
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertTrue(MapFieldLite.<Object, Object>equals(null, null));
  }

  @Test
  public void emptyMapFieldTest() {
    // Arrange, Act and Assert
    assertEquals(0, MapFieldLite.<Object, Object>emptyMapField().size());
  }
}
