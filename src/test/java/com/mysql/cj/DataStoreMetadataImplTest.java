package com.mysql.cj;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DataStoreMetadataImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getTableRowCountTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new DataStoreMetadataImpl(null)).getTableRowCount("aaaaa", "aaaaa");
  }
  @Test
  public void tableExistsTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new DataStoreMetadataImpl(null)).tableExists("aaaaa", "aaaaa");
  }
  @Test
  public void schemaExistsTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new DataStoreMetadataImpl(null)).schemaExists("aaaaa");
  }
}
