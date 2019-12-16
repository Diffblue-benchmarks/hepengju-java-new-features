package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.UninitializedMessageException;
import com.mysql.cj.exceptions.WrongArgumentException;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.util.List;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExprParserTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getPlaceholderNameToPositionMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ExprParser("!=")).getPlaceholderNameToPositionMap().size());
  }

  @Test
  public void getPositionalPlaceholderCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ExprParser("!=")).getPositionalPlaceholderCount());
  }

  @Test
  public void parseExprListTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).parseExprList();
  }

  @Test
  public void parseDocumentProjectionTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).parseDocumentProjection();
  }

  @Test
  public void parseTableUpdateFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).parseTableUpdateField();
  }

  @Test
  public void parseTableInsertFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).parseTableInsertField();
  }

  @Test
  public void parseTableSelectProjectionTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).parseTableSelectProjection();
  }

  @Test
  public void parseOrderSpecTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).parseOrderSpec();
  }

  @Test
  public void parseTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).parse();
  }

  @Test
  public void exprTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).expr();
  }

  @Test
  public void orExprTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).orExpr();
  }

  @Test
  public void andExprTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).andExpr();
  }

  @Test
  public void ilriExprTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).ilriExpr();
  }

  @Test
  public void compExprTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).compExpr();
  }

  @Test
  public void bitExprTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).bitExpr();
  }

  @Test
  public void shiftExprTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).shiftExpr();
  }

  @Test
  public void addSubExprTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).addSubExpr();
  }

  @Test
  public void mulDivExprTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).mulDivExpr();
  }

  @Test
  public void addSubIntervalExprTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).addSubIntervalExpr();
  }

  @Test
  public void atomicExprTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).atomicExpr();
  }

  @Test
  public void buildUnaryOpTest() {
    // Arrange
    ExprParser exprParser = new ExprParser("!=");

    // Act and Assert
    thrown.expect(UninitializedMessageException.class);
    exprParser.buildUnaryOp("!=", MysqlxExpr.Expr.getDefaultInstance());
  }

  @Test
  public void columnIdentifierTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).columnIdentifier();
  }

  @Test
  public void documentFieldTest() {
    // Arrange and Act
    MysqlxExpr.Expr actualDocumentFieldResult = (new ExprParser("!=")).documentField();

    // Assert
    boolean actualHasOperatorResult = actualDocumentFieldResult.hasOperator();
    int actualPosition = actualDocumentFieldResult.getPosition();
    int actualSerializedSize = actualDocumentFieldResult.getSerializedSize();
    MysqlxExpr.ObjectOrBuilder actualObjectOrBuilder = actualDocumentFieldResult.getObjectOrBuilder();
    String actualVariable = actualDocumentFieldResult.getVariable();
    MysqlxExpr.Expr.Type actualType = actualDocumentFieldResult.getType();
    MysqlxDatatypes.ScalarOrBuilder actualLiteralOrBuilder = actualDocumentFieldResult.getLiteralOrBuilder();
    MysqlxDatatypes.Scalar expectedLiteralOrBuilder = actualDocumentFieldResult.getLiteral();
    MysqlxExpr.Array expectedArrayOrBuilder = actualDocumentFieldResult.getArray();
    MysqlxExpr.ArrayOrBuilder actualArrayOrBuilder = actualDocumentFieldResult.getArrayOrBuilder();
    MysqlxExpr.OperatorOrBuilder actualOperatorOrBuilder = actualDocumentFieldResult.getOperatorOrBuilder();
    MysqlxExpr.FunctionCall actualFunctionCall = actualDocumentFieldResult.getFunctionCall();
    String actualToStringResult = actualDocumentFieldResult.toString();
    MysqlxExpr.FunctionCallOrBuilder functionCallOrBuilder = actualDocumentFieldResult.getFunctionCallOrBuilder();
    boolean actualIsInitializedResult = actualDocumentFieldResult.isInitialized();
    MysqlxExpr.Operator expectedOperatorOrBuilder = actualDocumentFieldResult.getOperator();
    String actualInitializationErrorString = actualDocumentFieldResult.getInitializationErrorString();
    assertFalse(actualHasOperatorResult);
    assertEquals(4, actualSerializedSize);
    assertSame(expectedArrayOrBuilder, actualArrayOrBuilder);
    assertEquals("", actualInitializationErrorString);
    assertSame(expectedOperatorOrBuilder, actualOperatorOrBuilder);
    assertTrue(actualIsInitializedResult);
    assertEquals("type: IDENT\nidentifier {\n}\n", actualToStringResult);
    assertSame(functionCallOrBuilder, actualFunctionCall);
    assertSame(actualDocumentFieldResult.getObject(), actualObjectOrBuilder);
    assertEquals(MysqlxExpr.Expr.Type.IDENT, actualType);
    assertEquals(0, actualPosition);
    assertSame(expectedLiteralOrBuilder, actualLiteralOrBuilder);
    assertEquals("", actualVariable);
  }

  @Test
  public void documentPathTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ExprParser("!=")).documentPath().size());
  }

  @Test
  public void docPathArrayLocTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).docPathArrayLoc();
  }

  @Test
  public void docPathMemberTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).docPathMember();
  }

  @Test
  public void identifierTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).identifier();
  }

  @Test
  public void starOperatorTest() {
    // Arrange and Act
    MysqlxExpr.Expr actualStarOperatorResult = (new ExprParser("!=")).starOperator();

    // Assert
    MysqlxExpr.ColumnIdentifierOrBuilder identifierOrBuilder = actualStarOperatorResult.getIdentifierOrBuilder();
    boolean actualHasOperatorResult = actualStarOperatorResult.hasOperator();
    int actualPosition = actualStarOperatorResult.getPosition();
    int actualSerializedSize = actualStarOperatorResult.getSerializedSize();
    MysqlxExpr.ObjectOrBuilder actualObjectOrBuilder = actualStarOperatorResult.getObjectOrBuilder();
    String actualVariable = actualStarOperatorResult.getVariable();
    MysqlxExpr.Expr.Type actualType = actualStarOperatorResult.getType();
    MysqlxDatatypes.ScalarOrBuilder actualLiteralOrBuilder = actualStarOperatorResult.getLiteralOrBuilder();
    MysqlxDatatypes.Scalar expectedLiteralOrBuilder = actualStarOperatorResult.getLiteral();
    MysqlxExpr.Array expectedArrayOrBuilder = actualStarOperatorResult.getArray();
    MysqlxExpr.ArrayOrBuilder actualArrayOrBuilder = actualStarOperatorResult.getArrayOrBuilder();
    MysqlxExpr.FunctionCall actualFunctionCall = actualStarOperatorResult.getFunctionCall();
    String actualToStringResult = actualStarOperatorResult.toString();
    MysqlxExpr.ColumnIdentifier actualIdentifier = actualStarOperatorResult.getIdentifier();
    MysqlxExpr.FunctionCallOrBuilder functionCallOrBuilder = actualStarOperatorResult.getFunctionCallOrBuilder();
    boolean actualIsInitializedResult = actualStarOperatorResult.isInitialized();
    String actualInitializationErrorString = actualStarOperatorResult.getInitializationErrorString();
    assertTrue(actualHasOperatorResult);
    assertEquals(7, actualSerializedSize);
    assertSame(expectedArrayOrBuilder, actualArrayOrBuilder);
    assertEquals("", actualInitializationErrorString);
    assertTrue(actualIsInitializedResult);
    assertSame(identifierOrBuilder, actualIdentifier);
    assertEquals("type: OPERATOR\noperator {\n  name: \"*\"\n}\n", actualToStringResult);
    assertSame(functionCallOrBuilder, actualFunctionCall);
    assertSame(actualStarOperatorResult.getObject(), actualObjectOrBuilder);
    assertEquals(MysqlxExpr.Expr.Type.OPERATOR, actualType);
    assertEquals(0, actualPosition);
    assertSame(expectedLiteralOrBuilder, actualLiteralOrBuilder);
    assertEquals("", actualVariable);
  }

  @Test
  public void functionCallTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).functionCall();
  }

  @Test
  public void parenExprListTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new ExprParser("!=")).parenExprList();
  }

//failed_compile @Test
//  public void lexTest() {
//    // Arrange
//    ExprParser exprParser = new ExprParser("!=");
//
//    // Act
//    exprParser.lex();
//
//    // Assert
//    ExprParser.Token getResult = exprParser.tokens.get(1);
//    assertEquals(ExprParser.TokenType.NE, getResult.type);
//    assertEquals("!=", getResult.value);
//  }

  @Test
  public void nextCharEqualsTest() {
    // Arrange, Act and Assert
    assertFalse((new ExprParser("!=")).nextCharEquals(1, 'c'));
  }

//failed_compile @Test
//  public void constructorTest2() {
//    // Arrange and Act
//    ExprParser actualExprParser = new ExprParser("!=", true);
//
//    // Assert
//    assertEquals(0, actualExprParser.getPositionalPlaceholderCount());
//    assertEquals("!=", actualExprParser.string);
//    assertEquals(0, actualExprParser.tokenPos);
//    ExprParser.Token getResult = actualExprParser.tokens.get(0);
//    assertEquals(ExprParser.TokenType.NE, getResult.type);
//    assertEquals("!=", getResult.value);
//  }

//failed_compile @Test
//  public void constructorTest() {
//    // Arrange and Act
//    ExprParser actualExprParser = new ExprParser("!=");
//
//    // Assert
//    assertEquals(0, actualExprParser.getPositionalPlaceholderCount());
//    assertEquals("!=", actualExprParser.string);
//    assertEquals(0, actualExprParser.tokenPos);
//    ExprParser.Token getResult = actualExprParser.tokens.get(0);
//    assertEquals(ExprParser.TokenType.NE, getResult.type);
//    assertEquals("!=", getResult.value);
//  }
}
