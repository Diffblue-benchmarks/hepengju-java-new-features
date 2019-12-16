package com.mysql.cj.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.AbstractMap;
import org.junit.Test;

public class LRUCacheTest {
  @Test
  public void removeEldestEntryTest() {
    // Arrange
    LRUCache<Object, Object> objectObjectMap = new LRUCache<Object, Object>(1);
    objectObjectMap.put("aaaaa", "aaaaa");

    // Act and Assert
    assertFalse(objectObjectMap.removeEldestEntry(null));
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new LRUCache<Object, Object>(1)).size());
  }
}
