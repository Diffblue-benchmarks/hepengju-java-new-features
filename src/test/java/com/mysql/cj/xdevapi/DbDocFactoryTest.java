package com.mysql.cj.xdevapi;

import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DbDocFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void createFromProtocolEntityTest() {
    // Arrange
    DbDocFactory dbDocFactory = new DbDocFactory(new DefaultPropertySet());

    // Act and Assert
    thrown.expect(ClassCastException.class);
    dbDocFactory.createFromProtocolEntity(new CachedResultSetMetaDataImpl());
  }
}
