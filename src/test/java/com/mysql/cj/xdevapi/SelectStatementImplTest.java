package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.MysqlxSession;
import com.mysql.cj.protocol.x.XMessage;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SelectStatementImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void lockExclusiveTest2() {
    // Arrange, Act and Assert
    assertEquals(FilterParams.RowLock.EXCLUSIVE_LOCK,
        (new SelectStatementImpl(null, "aaaaa", "aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"}))
            .lockExclusive(Statement.LockContention.DEFAULT).getFilterParams().getLock());
  }

  @Test
  public void lockExclusiveTest() {
    // Arrange, Act and Assert
    assertEquals(FilterParams.RowLock.EXCLUSIVE_LOCK,
        (new SelectStatementImpl(null, "aaaaa", "aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"})).lockExclusive()
            .getFilterParams().getLock());
  }

  @Test
  public void lockSharedTest2() {
    // Arrange, Act and Assert
    assertEquals(FilterParams.RowLock.SHARED_LOCK,
        (new SelectStatementImpl(null, "aaaaa", "aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"}))
            .lockShared(Statement.LockContention.DEFAULT).getFilterParams().getLock());
  }

  @Test
  public void lockSharedTest() {
    // Arrange, Act and Assert
    assertEquals(FilterParams.RowLock.SHARED_LOCK,
        (new SelectStatementImpl(null, "aaaaa", "aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"})).lockShared()
            .getFilterParams().getLock());
  }

  @Test
  public void getFilterParamsTest() {
    // Arrange, Act and Assert
    assertTrue((new SelectStatementImpl(null, "aaaaa", "aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"}))
        .getFilterParams() instanceof TableFilterParams);
  }

  @Test
  public void havingTest() {
    // Arrange, Act and Assert
    Object groupingCriteria = (new SelectStatementImpl(null, "aaaaa", "aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"}))
        .having("aaaaa").getFilterParams().getGroupingCriteria();
    assertTrue(groupingCriteria instanceof MysqlxExpr.Expr);
    int actualPosition = ((MysqlxExpr.Expr) groupingCriteria).getPosition();
    int actualSerializedSize = ((MysqlxExpr.Expr) groupingCriteria).getSerializedSize();
    MysqlxExpr.ObjectOrBuilder objectOrBuilder = ((MysqlxExpr.Expr) groupingCriteria).getObjectOrBuilder();
    String actualVariable = ((MysqlxExpr.Expr) groupingCriteria).getVariable();
    MysqlxExpr.Expr.Type actualType = ((MysqlxExpr.Expr) groupingCriteria).getType();
    MysqlxDatatypes.ScalarOrBuilder actualLiteralOrBuilder = ((MysqlxExpr.Expr) groupingCriteria).getLiteralOrBuilder();
    MysqlxDatatypes.Scalar expectedLiteralOrBuilder = ((MysqlxExpr.Expr) groupingCriteria).getLiteral();
    MysqlxExpr.ArrayOrBuilder arrayOrBuilder = ((MysqlxExpr.Expr) groupingCriteria).getArrayOrBuilder();
    MysqlxExpr.OperatorOrBuilder operatorOrBuilder = ((MysqlxExpr.Expr) groupingCriteria).getOperatorOrBuilder();
    String actualToStringResult = groupingCriteria.toString();
    assertFalse(((MysqlxExpr.Expr) groupingCriteria).hasPosition());
    assertEquals("type: IDENT\nidentifier {\n  name: \"aaaaa\"\n}\n", actualToStringResult);
    assertTrue(operatorOrBuilder instanceof MysqlxExpr.Operator);
    assertTrue(arrayOrBuilder instanceof MysqlxExpr.Array);
    assertSame(expectedLiteralOrBuilder, actualLiteralOrBuilder);
    assertEquals(MysqlxExpr.Expr.Type.IDENT, actualType);
    assertEquals("", actualVariable);
    assertTrue(objectOrBuilder instanceof MysqlxExpr.Object);
    assertEquals(11, actualSerializedSize);
    assertEquals(0, actualPosition);
  }

  @Test
  public void groupByTest() {
    // Arrange
    SelectStatementImpl selectStatementImpl = new SelectStatementImpl(null, "aaaaa", "aaaaa",
        new String[]{"aaaaa", "aaaaa", "aaaaa"});

    // Act and Assert
    assertSame(selectStatementImpl, selectStatementImpl.groupBy(new String[]{"aaaaa", "aaaaa", "aaaaa"}));
  }

  @Test
  public void executeAsyncTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SelectStatementImpl(null, "aaaaa", "aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"})).executeAsync();
  }

  @Test
  public void executePreparedStatementTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SelectStatementImpl(null, "aaaaa", "aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"}))
        .executePreparedStatement();
  }

  @Test
  public void getPrepareStatementXMessageTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SelectStatementImpl(null, "aaaaa", "aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"}))
        .getPrepareStatementXMessage();
  }

  @Test
  public void executeStatementTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SelectStatementImpl(null, "aaaaa", "aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"})).executeStatement();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    SelectStatementImpl actualSelectStatementImpl = new SelectStatementImpl(null, "aaaaa", "aaaaa",
        new String[]{"aaaaa", "aaaaa", "aaaaa"});

    // Assert
    FilterParams filterParams = actualSelectStatementImpl.getFilterParams();
    assertTrue(actualSelectStatementImpl.isRelational());
    Object collection = filterParams.getCollection();
    Object fields = filterParams.getFields();
    assertTrue(filterParams.isRelational());
    Object getResult = ((ArrayList) fields).get(2);
    assertTrue(collection instanceof MysqlxCrud.Collection);
    String actualName = ((MysqlxCrud.Collection) collection).getName();
    String actualToStringResult = collection.toString();
    int actualSerializedSize = ((MysqlxCrud.Collection) collection).getSerializedSize();
    String actualSchema = ((MysqlxCrud.Collection) collection).getSchema();
    boolean actualIsInitializedResult = ((MysqlxCrud.Collection) collection).isInitialized();
    boolean actualHasNameResult = ((MysqlxCrud.Collection) collection).hasName();
    String actualToStringResult1 = getResult.toString();
    int actualSerializedSize1 = ((MysqlxCrud.Projection) getResult).getSerializedSize();
    assertEquals("aaaaa", actualName);
    assertTrue(actualHasNameResult);
    assertEquals("name: \"aaaaa\"\nschema: \"aaaaa\"\n", actualToStringResult);
    assertEquals(14, actualSerializedSize);
    assertEquals("aaaaa", actualSchema);
    assertTrue(actualIsInitializedResult);
    assertEquals(13, actualSerializedSize1);
    assertTrue(((MysqlxCrud.Projection) getResult).hasSource());
    assertEquals("source {\n  type: IDENT\n  identifier {\n    name: \"aaaaa\"\n  }\n}\n", actualToStringResult1);
  }
}
