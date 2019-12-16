package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExprUnparserTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void exprToStringTest() {
    // Arrange, Act and Assert
    assertEquals("$", ExprUnparser.exprToString(MysqlxExpr.Expr.getDefaultInstance()));
  }

  @Test
  public void quoteDocumentPathMemberTest() {
    // Arrange, Act and Assert
    assertEquals("", ExprUnparser.quoteDocumentPathMember(""));
  }

  @Test
  public void quoteJsonKeyTest() {
    // Arrange, Act and Assert
    assertEquals("", ExprUnparser.quoteJsonKey(""));
  }

  @Test
  public void quoteIdentifierTest() {
    // Arrange, Act and Assert
    assertEquals("", ExprUnparser.quoteIdentifier(""));
  }

  @Test
  public void escapeLiteralTest() {
    // Arrange, Act and Assert
    assertEquals("", ExprUnparser.escapeLiteral(""));
  }

  @Test
  public void objectToStringTest() {
    // Arrange, Act and Assert
    assertEquals("{}", ExprUnparser.objectToString(MysqlxExpr.Object.getDefaultInstance()));
  }

  @Test
  public void operatorToStringTest() {
    // Arrange, Act and Assert
    assertEquals("", ExprUnparser.operatorToString(MysqlxExpr.Operator.getDefaultInstance()));
  }

  @Test
  public void paramListToStringTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    ExprUnparser.paramListToString(null);
  }

  @Test
  public void arrayToStringTest() {
    // Arrange, Act and Assert
    assertEquals("[]", ExprUnparser.arrayToString(MysqlxExpr.Array.getDefaultInstance()));
  }

  @Test
  public void functionCallToStringTest() {
    // Arrange, Act and Assert
    assertEquals("()", ExprUnparser.functionCallToString(MysqlxExpr.FunctionCall.getDefaultInstance()));
  }

  @Test
  public void columnIdentifierToStringTest() {
    // Arrange, Act and Assert
    assertEquals("$", ExprUnparser.columnIdentifierToString(MysqlxExpr.ColumnIdentifier.getDefaultInstance()));
  }

  @Test
  public void documentPathToStringTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    ExprUnparser.documentPathToString(null);
  }

  @Test
  public void scalarToStringTest() {
    // Arrange, Act and Assert
    assertEquals("0", ExprUnparser.scalarToString(MysqlxDatatypes.Scalar.getDefaultInstance()));
  }
}
