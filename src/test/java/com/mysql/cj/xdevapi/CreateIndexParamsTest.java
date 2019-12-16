package com.mysql.cj.xdevapi;

import com.mysql.cj.exceptions.WrongArgumentException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CreateIndexParamsTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest3() {
    // Arrange
    DbDocImpl dbDocImpl = new DbDocImpl();
    DbDocImpl dbDocImpl1 = new DbDocImpl();
    dbDocImpl1.put("GEOJSON", null);
    dbDocImpl.put("GEOJSON", dbDocImpl1);

    // Act and Assert
    thrown.expect(XDevAPIError.class);
    new CreateIndexParams.IndexField(dbDocImpl);
  }
  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    new CreateIndexParams("CreateIndexParams.0", "CreateIndexParams.0");
  }
  @Test
  public void constructorTest() {
    // Arrange
    DbDocImpl dbDocImpl = new DbDocImpl();
    DbDocImpl dbDocImpl1 = new DbDocImpl();
    dbDocImpl1.put("CreateIndexParams.0", null);
    dbDocImpl.put("CreateIndexParams.0", dbDocImpl1);

    // Act and Assert
    thrown.expect(XDevAPIError.class);
    new CreateIndexParams("CreateIndexParams.0", dbDocImpl);
  }
}
