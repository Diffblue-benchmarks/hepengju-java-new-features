package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.exceptions.WrongArgumentException;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DocFilterParamsTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void setFieldsTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new DocFilterParams("aaaaa", "aaaaa")).setFields(new String[]{"aaaaa", "aaaaa", "aaaaa"});
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    DocFilterParams actualDocFilterParams = new DocFilterParams("aaaaa", "aaaaa", true);

    // Assert
    Object collection = actualDocFilterParams.getCollection();
    assertFalse(actualDocFilterParams.isRelational());
    assertTrue(collection instanceof MysqlxCrud.Collection);
    String actualName = ((MysqlxCrud.Collection) collection).getName();
    String actualToStringResult = collection.toString();
    int actualSerializedSize = ((MysqlxCrud.Collection) collection).getSerializedSize();
    String actualSchema = ((MysqlxCrud.Collection) collection).getSchema();
    boolean actualIsInitializedResult = ((MysqlxCrud.Collection) collection).isInitialized();
    assertTrue(((MysqlxCrud.Collection) collection).hasName());
    assertEquals("name: \"aaaaa\"\nschema: \"aaaaa\"\n", actualToStringResult);
    assertEquals(14, actualSerializedSize);
    assertEquals("aaaaa", actualSchema);
    assertEquals("aaaaa", actualName);
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    DocFilterParams actualDocFilterParams = new DocFilterParams("aaaaa", "aaaaa");

    // Assert
    Object collection = actualDocFilterParams.getCollection();
    assertFalse(actualDocFilterParams.isRelational());
    assertTrue(collection instanceof MysqlxCrud.Collection);
    String actualName = ((MysqlxCrud.Collection) collection).getName();
    String actualToStringResult = collection.toString();
    int actualSerializedSize = ((MysqlxCrud.Collection) collection).getSerializedSize();
    String actualSchema = ((MysqlxCrud.Collection) collection).getSchema();
    boolean actualIsInitializedResult = ((MysqlxCrud.Collection) collection).isInitialized();
    assertTrue(((MysqlxCrud.Collection) collection).hasName());
    assertEquals("name: \"aaaaa\"\nschema: \"aaaaa\"\n", actualToStringResult);
    assertEquals(14, actualSerializedSize);
    assertEquals("aaaaa", actualSchema);
    assertEquals("aaaaa", actualName);
    assertTrue(actualIsInitializedResult);
  }
}
