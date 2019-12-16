package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class InsertParamsTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void setFieldsAndValuesTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new InsertParams()).setFieldsAndValues(null);
  }

  @Test
  public void getRowsTest() {
    // Arrange, Act and Assert
    assertEquals(0, ((LinkedList) (new InsertParams()).getRows()).size());
  }

  @Test
  public void addRowTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new InsertParams()).addRow(null);
  }

  @Test
  public void getProjectionTest() {
    // Arrange, Act and Assert
    assertNull((new InsertParams()).getProjection());
  }

  @Test
  public void setProjectionTest() {
    // Arrange
    InsertParams insertParams = new InsertParams();

    // Act
    insertParams.setProjection(new String[]{"aaaaa", "aaaaa", "aaaaa"});

    // Assert
    Object getResult = ((ArrayList) insertParams.getProjection()).get(0);
    Object getResult1 = ((ArrayList) insertParams.getProjection()).get(2);
    String actualName = ((MysqlxCrud.Column) getResult).getName();
    String actualToStringResult = getResult.toString();
    int actualSerializedSize = ((MysqlxCrud.Column) getResult).getSerializedSize();
    int actualDocumentPathCount = ((MysqlxCrud.Column) getResult).getDocumentPathCount();
    boolean actualIsInitializedResult = ((MysqlxCrud.Column) getResult).isInitialized();
    boolean actualHasNameResult = ((MysqlxCrud.Column) getResult).hasName();
    String actualAlias = ((MysqlxCrud.Column) getResult).getAlias();
    String actualName1 = ((MysqlxCrud.Column) getResult1).getName();
    String actualToStringResult1 = getResult1.toString();
    int actualSerializedSize1 = ((MysqlxCrud.Column) getResult1).getSerializedSize();
    int actualDocumentPathCount1 = ((MysqlxCrud.Column) getResult1).getDocumentPathCount();
    boolean actualIsInitializedResult1 = ((MysqlxCrud.Column) getResult1).isInitialized();
    boolean actualHasNameResult1 = ((MysqlxCrud.Column) getResult1).hasName();
    assertTrue(actualHasNameResult1);
    assertTrue(actualIsInitializedResult1);
    assertEquals(0, actualDocumentPathCount1);
    assertEquals(7, actualSerializedSize1);
    assertEquals("name: \"aaaaa\"\n", actualToStringResult1);
    assertEquals("aaaaa", actualName1);
    assertEquals("", actualAlias);
    assertTrue(actualHasNameResult);
    assertTrue(actualIsInitializedResult);
    assertEquals(0, actualDocumentPathCount);
    assertEquals("name: \"aaaaa\"\n", actualToStringResult);
    assertEquals(7, actualSerializedSize);
    assertEquals("aaaaa", actualName);
    assertEquals("", ((MysqlxCrud.Column) getResult1).getAlias());
  }
}
