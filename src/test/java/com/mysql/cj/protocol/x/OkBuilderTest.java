package com.mysql.cj.protocol.x;

import com.mysql.cj.exceptions.WrongArgumentException;
import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OkBuilderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void addProtocolEntityTest() {
    // Arrange
    OkBuilder okBuilder = new OkBuilder();

    // Act and Assert
    thrown.expect(WrongArgumentException.class);
    okBuilder.addProtocolEntity(new CachedResultSetMetaDataImpl());
  }
}
