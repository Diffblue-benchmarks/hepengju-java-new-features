package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import java.util.ArrayList;
import org.junit.Test;

public class TableFilterParamsTest {
  @Test
  public void setFieldsTest() {
    // Arrange
    TableFilterParams tableFilterParams = new TableFilterParams("aaaaa", "aaaaa");

    // Act
    tableFilterParams.setFields(new String[]{"aaaaa", "aaaaa", "aaaaa"});

    // Assert
    Object getResult = ((ArrayList) tableFilterParams.getFields()).get(2);
    String actualToStringResult = getResult.toString();
    int actualSerializedSize = ((MysqlxCrud.Projection) getResult).getSerializedSize();
    boolean actualHasSourceResult = ((MysqlxCrud.Projection) getResult).hasSource();
    assertEquals("source {\n  type: IDENT\n  identifier {\n    name: \"aaaaa\"\n  }\n}\n", actualToStringResult);
    assertEquals(13, actualSerializedSize);
    assertTrue(actualHasSourceResult);
    assertTrue(((MysqlxCrud.Projection) getResult).isInitialized());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    TableFilterParams actualTableFilterParams = new TableFilterParams("aaaaa", "aaaaa", true);

    // Assert
    Object collection = actualTableFilterParams.getCollection();
    assertTrue(actualTableFilterParams.isRelational());
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
    TableFilterParams actualTableFilterParams = new TableFilterParams("aaaaa", "aaaaa");

    // Assert
    Object collection = actualTableFilterParams.getCollection();
    assertTrue(actualTableFilterParams.isRelational());
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
