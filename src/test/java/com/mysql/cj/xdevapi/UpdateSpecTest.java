package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import org.junit.Test;

public class UpdateSpecTest {
  @Test
  public void getValueTest() {
    // Arrange, Act and Assert
    assertNull((new UpdateSpec(UpdateType.SET, "aaaaa")).getValue());
  }

  @Test
  public void setValueTest() {
    // Arrange, Act and Assert
    Object value = (new UpdateSpec(UpdateType.SET, "aaaaa")).setValue("aaaaa").getValue();
    assertTrue(value instanceof MysqlxExpr.Expr);
    MysqlxExpr.ColumnIdentifierOrBuilder identifierOrBuilder = ((MysqlxExpr.Expr) value).getIdentifierOrBuilder();
    int actualPosition = ((MysqlxExpr.Expr) value).getPosition();
    int actualSerializedSize = ((MysqlxExpr.Expr) value).getSerializedSize();
    MysqlxExpr.ObjectOrBuilder objectOrBuilder = ((MysqlxExpr.Expr) value).getObjectOrBuilder();
    String actualVariable = ((MysqlxExpr.Expr) value).getVariable();
    MysqlxExpr.Expr.Type actualType = ((MysqlxExpr.Expr) value).getType();
    boolean actualHasFunctionCallResult = ((MysqlxExpr.Expr) value).hasFunctionCall();
    assertTrue(((MysqlxExpr.Expr) value).getArrayOrBuilder() instanceof MysqlxExpr.Array);
    assertFalse(actualHasFunctionCallResult);
    assertEquals(MysqlxExpr.Expr.Type.LITERAL, actualType);
    assertEquals("", actualVariable);
    assertTrue(objectOrBuilder instanceof MysqlxExpr.Object);
    assertEquals(15, actualSerializedSize);
    assertEquals(0, actualPosition);
    assertTrue(identifierOrBuilder instanceof MysqlxExpr.ColumnIdentifier);
  }

  @Test
  public void getSourceTest() {
    // Arrange, Act and Assert
    assertTrue((new UpdateSpec(UpdateType.SET, "aaaaa"))
        .getSource() instanceof com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier);
  }

  @Test
  public void getUpdateTypeTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.UpdateOperation.UpdateType.SET, (new UpdateSpec(UpdateType.SET, "aaaaa")).getUpdateType());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    UpdateSpec actualUpdateSpec = new UpdateSpec(UpdateType.SET, "aaaaa");

    // Assert
    Object source = actualUpdateSpec.getSource();
    assertTrue(source instanceof MysqlxExpr.ColumnIdentifier);
    assertTrue(
        actualUpdateSpec.getUpdateType() instanceof com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.UpdateType);
    String actualTableName = ((MysqlxExpr.ColumnIdentifier) source).getTableName();
    String actualName = ((MysqlxExpr.ColumnIdentifier) source).getName();
    int actualSerializedSize = ((MysqlxExpr.ColumnIdentifier) source).getSerializedSize();
    int actualDocumentPathCount = ((MysqlxExpr.ColumnIdentifier) source).getDocumentPathCount();
    String actualToStringResult = source.toString();
    boolean actualIsInitializedResult = ((MysqlxExpr.ColumnIdentifier) source).isInitialized();
    boolean actualHasNameResult = ((MysqlxExpr.ColumnIdentifier) source).hasName();
    String actualSchemaName = ((MysqlxExpr.ColumnIdentifier) source).getSchemaName();
    assertEquals("", actualSchemaName);
    assertFalse(actualHasNameResult);
    assertTrue(actualIsInitializedResult);
    assertEquals("", ((MysqlxExpr.ColumnIdentifier) source).getInitializationErrorString());
    assertEquals("", actualName);
    assertEquals(1, actualDocumentPathCount);
    assertEquals(11, actualSerializedSize);
    assertEquals("document_path {\n  type: MEMBER\n  value: \"aaaaa\"\n}\n", actualToStringResult);
    assertEquals("", actualTableName);
  }
}
