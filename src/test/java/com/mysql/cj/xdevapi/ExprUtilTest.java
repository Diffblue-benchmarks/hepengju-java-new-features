package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.UninitializedMessageException;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExprUtilTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void argObjectToExprTest() {
    // Arrange and Act
    MysqlxExpr.Expr actualArgObjectToExprResult = ExprUtil.argObjectToExpr("yyyy-MM-dd'T'HH:mm:ss.S", true);

    // Assert
    MysqlxExpr.ColumnIdentifierOrBuilder identifierOrBuilder = actualArgObjectToExprResult.getIdentifierOrBuilder();
    boolean actualHasOperatorResult = actualArgObjectToExprResult.hasOperator();
    int actualPosition = actualArgObjectToExprResult.getPosition();
    int actualSerializedSize = actualArgObjectToExprResult.getSerializedSize();
    MysqlxExpr.ObjectOrBuilder actualObjectOrBuilder = actualArgObjectToExprResult.getObjectOrBuilder();
    String actualVariable = actualArgObjectToExprResult.getVariable();
    MysqlxExpr.Expr.Type actualType = actualArgObjectToExprResult.getType();
    MysqlxExpr.Array expectedArrayOrBuilder = actualArgObjectToExprResult.getArray();
    MysqlxExpr.ArrayOrBuilder actualArrayOrBuilder = actualArgObjectToExprResult.getArrayOrBuilder();
    MysqlxExpr.OperatorOrBuilder actualOperatorOrBuilder = actualArgObjectToExprResult.getOperatorOrBuilder();
    MysqlxExpr.FunctionCall actualFunctionCall = actualArgObjectToExprResult.getFunctionCall();
    String actualToStringResult = actualArgObjectToExprResult.toString();
    MysqlxExpr.ColumnIdentifier actualIdentifier = actualArgObjectToExprResult.getIdentifier();
    MysqlxExpr.FunctionCallOrBuilder functionCallOrBuilder = actualArgObjectToExprResult.getFunctionCallOrBuilder();
    boolean actualIsInitializedResult = actualArgObjectToExprResult.isInitialized();
    MysqlxExpr.Operator expectedOperatorOrBuilder = actualArgObjectToExprResult.getOperator();
    String actualInitializationErrorString = actualArgObjectToExprResult.getInitializationErrorString();
    assertFalse(actualHasOperatorResult);
    assertEquals(33, actualSerializedSize);
    assertSame(expectedArrayOrBuilder, actualArrayOrBuilder);
    assertEquals("", actualInitializationErrorString);
    assertSame(expectedOperatorOrBuilder, actualOperatorOrBuilder);
    assertTrue(actualIsInitializedResult);
    assertSame(identifierOrBuilder, actualIdentifier);
    assertEquals(
        "type: LITERAL\nliteral {\n  type: V_STRING\n  v_string {\n    value: \"yyyy-MM-dd\\'T\\'HH:mm:ss.S\"\n  }\n}\n",
        actualToStringResult);
    assertSame(functionCallOrBuilder, actualFunctionCall);
    assertSame(actualArgObjectToExprResult.getObject(), actualObjectOrBuilder);
    assertEquals(MysqlxExpr.Expr.Type.LITERAL, actualType);
    assertEquals(0, actualPosition);
    assertEquals("", actualVariable);
  }

  @Test
  public void argObjectToScalarAnyTest() {
    // Arrange and Act
    MysqlxDatatypes.Any actualArgObjectToScalarAnyResult = ExprUtil.argObjectToScalarAny("yyyy-MM-dd'T'HH:mm:ss.S");

    // Assert
    MysqlxDatatypes.Object expectedObjOrBuilder = actualArgObjectToScalarAnyResult.getObj();
    int actualSerializedSize = actualArgObjectToScalarAnyResult.getSerializedSize();
    boolean actualHasObjResult = actualArgObjectToScalarAnyResult.hasObj();
    MysqlxDatatypes.ObjectOrBuilder actualObjOrBuilder = actualArgObjectToScalarAnyResult.getObjOrBuilder();
    String actualToStringResult = actualArgObjectToScalarAnyResult.toString();
    MysqlxDatatypes.Any.Type actualType = actualArgObjectToScalarAnyResult.getType();
    MysqlxDatatypes.ArrayOrBuilder actualArrayOrBuilder = actualArgObjectToScalarAnyResult.getArrayOrBuilder();
    boolean actualIsInitializedResult = actualArgObjectToScalarAnyResult.isInitialized();
    String actualInitializationErrorString = actualArgObjectToScalarAnyResult.getInitializationErrorString();
    assertEquals(33, actualSerializedSize);
    assertSame(actualArgObjectToScalarAnyResult.getArray(), actualArrayOrBuilder);
    assertFalse(actualHasObjResult);
    assertTrue(actualIsInitializedResult);
    assertSame(expectedObjOrBuilder, actualObjOrBuilder);
    assertEquals("", actualInitializationErrorString);
    assertEquals(
        "type: SCALAR\nscalar {\n  type: V_STRING\n  v_string {\n    value: \"yyyy-MM-dd\\'T\\'HH:mm:ss.S\"\n  }\n}\n",
        actualToStringResult);
    assertEquals(MysqlxDatatypes.Any.Type.SCALAR, actualType);
  }

  @Test
  public void argObjectToScalarTest() {
    // Arrange and Act
    MysqlxDatatypes.Scalar actualArgObjectToScalarResult = ExprUtil.argObjectToScalar("yyyy-MM-dd'T'HH:mm:ss.S");

    // Assert
    boolean actualHasVStringResult = actualArgObjectToScalarResult.hasVString();
    int actualSerializedSize = actualArgObjectToScalarResult.getSerializedSize();
    double actualVDouble = actualArgObjectToScalarResult.getVDouble();
    long actualVUnsignedInt = actualArgObjectToScalarResult.getVUnsignedInt();
    MysqlxDatatypes.Scalar.Type actualType = actualArgObjectToScalarResult.getType();
    long actualVSignedInt = actualArgObjectToScalarResult.getVSignedInt();
    String actualToStringResult = actualArgObjectToScalarResult.toString();
    float actualVFloat = actualArgObjectToScalarResult.getVFloat();
    MysqlxDatatypes.Scalar.Octets actualVOctets = actualArgObjectToScalarResult.getVOctets();
    boolean actualIsInitializedResult = actualArgObjectToScalarResult.isInitialized();
    boolean actualVBool = actualArgObjectToScalarResult.getVBool();
    String actualInitializationErrorString = actualArgObjectToScalarResult.getInitializationErrorString();
    assertTrue(actualHasVStringResult);
    assertEquals("", actualInitializationErrorString);
    assertEquals(MysqlxDatatypes.Scalar.Type.V_STRING, actualType);
    assertEquals("type: V_STRING\nv_string {\n  value: \"yyyy-MM-dd\\'T\\'HH:mm:ss.S\"\n}\n", actualToStringResult);
    assertEquals(0.0, actualVDouble, 0.0);
    assertEquals(0.0f, actualVFloat, 0.0f);
    assertFalse(actualVBool);
    assertTrue(actualIsInitializedResult);
    assertSame(actualArgObjectToScalarResult.getVOctetsOrBuilder(), actualVOctets);
    assertEquals(29, actualSerializedSize);
    assertEquals(0L, actualVUnsignedInt);
    assertEquals(0L, actualVSignedInt);
  }

  @Test
  public void buildCollectionTest() {
    // Arrange and Act
    MysqlxCrud.Collection actualBuildCollectionResult = ExprUtil.buildCollection("yyyy-MM-dd'T'HH:mm:ss.S",
        "yyyy-MM-dd'T'HH:mm:ss.S");

    // Assert
    String actualName = actualBuildCollectionResult.getName();
    String actualToStringResult = actualBuildCollectionResult.toString();
    int actualSerializedSize = actualBuildCollectionResult.getSerializedSize();
    String actualSchema = actualBuildCollectionResult.getSchema();
    boolean actualIsInitializedResult = actualBuildCollectionResult.isInitialized();
    assertEquals("yyyy-MM-dd'T'HH:mm:ss.S", actualName);
    assertTrue(actualBuildCollectionResult.hasName());
    assertEquals("name: \"yyyy-MM-dd\\'T\\'HH:mm:ss.S\"\nschema: \"yyyy-MM-dd\\'T\\'HH:mm:ss.S\"\n",
        actualToStringResult);
    assertEquals("yyyy-MM-dd'T'HH:mm:ss.S", actualSchema);
    assertTrue(actualIsInitializedResult);
    assertEquals(50, actualSerializedSize);
  }

  @Test
  public void buildAnyTest2() {
    // Arrange and Act
    MysqlxDatatypes.Any actualBuildAnyResult = ExprUtil.buildAny(true);

    // Assert
    MysqlxDatatypes.Object expectedObjOrBuilder = actualBuildAnyResult.getObj();
    int actualSerializedSize = actualBuildAnyResult.getSerializedSize();
    boolean actualHasObjResult = actualBuildAnyResult.hasObj();
    MysqlxDatatypes.ObjectOrBuilder actualObjOrBuilder = actualBuildAnyResult.getObjOrBuilder();
    String actualToStringResult = actualBuildAnyResult.toString();
    MysqlxDatatypes.Any.Type actualType = actualBuildAnyResult.getType();
    MysqlxDatatypes.ArrayOrBuilder actualArrayOrBuilder = actualBuildAnyResult.getArrayOrBuilder();
    boolean actualIsInitializedResult = actualBuildAnyResult.isInitialized();
    String actualInitializationErrorString = actualBuildAnyResult.getInitializationErrorString();
    assertEquals(8, actualSerializedSize);
    assertSame(actualBuildAnyResult.getArray(), actualArrayOrBuilder);
    assertFalse(actualHasObjResult);
    assertTrue(actualIsInitializedResult);
    assertSame(expectedObjOrBuilder, actualObjOrBuilder);
    assertEquals("", actualInitializationErrorString);
    assertEquals("type: SCALAR\nscalar {\n  type: V_BOOL\n  v_bool: true\n}\n", actualToStringResult);
    assertEquals(MysqlxDatatypes.Any.Type.SCALAR, actualType);
  }

  @Test
  public void buildAnyTest() {
    // Arrange and Act
    MysqlxDatatypes.Any actualBuildAnyResult = ExprUtil.buildAny("yyyy-MM-dd'T'HH:mm:ss.S");

    // Assert
    MysqlxDatatypes.Object expectedObjOrBuilder = actualBuildAnyResult.getObj();
    int actualSerializedSize = actualBuildAnyResult.getSerializedSize();
    boolean actualHasObjResult = actualBuildAnyResult.hasObj();
    MysqlxDatatypes.ObjectOrBuilder actualObjOrBuilder = actualBuildAnyResult.getObjOrBuilder();
    String actualToStringResult = actualBuildAnyResult.toString();
    MysqlxDatatypes.Any.Type actualType = actualBuildAnyResult.getType();
    MysqlxDatatypes.ArrayOrBuilder actualArrayOrBuilder = actualBuildAnyResult.getArrayOrBuilder();
    boolean actualIsInitializedResult = actualBuildAnyResult.isInitialized();
    String actualInitializationErrorString = actualBuildAnyResult.getInitializationErrorString();
    assertEquals(33, actualSerializedSize);
    assertSame(actualBuildAnyResult.getArray(), actualArrayOrBuilder);
    assertFalse(actualHasObjResult);
    assertTrue(actualIsInitializedResult);
    assertSame(expectedObjOrBuilder, actualObjOrBuilder);
    assertEquals("", actualInitializationErrorString);
    assertEquals(
        "type: SCALAR\nscalar {\n  type: V_STRING\n  v_string {\n    value: \"yyyy-MM-dd\\'T\\'HH:mm:ss.S\"\n  }\n}\n",
        actualToStringResult);
    assertEquals(MysqlxDatatypes.Any.Type.SCALAR, actualType);
  }

  @Test
  public void anyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UninitializedMessageException.class);
    ExprUtil.anyOf(MysqlxDatatypes.Scalar.getDefaultInstance());
  }

  @Test
  public void scalarOfTest5() {
    // Arrange and Act
    MysqlxDatatypes.Scalar actualScalarOfResult = ExprUtil.scalarOf(true);

    // Assert
    boolean actualHasVStringResult = actualScalarOfResult.hasVString();
    int actualSerializedSize = actualScalarOfResult.getSerializedSize();
    double actualVDouble = actualScalarOfResult.getVDouble();
    long actualVUnsignedInt = actualScalarOfResult.getVUnsignedInt();
    MysqlxDatatypes.Scalar.Type actualType = actualScalarOfResult.getType();
    MysqlxDatatypes.Scalar.StringOrBuilder vStringOrBuilder = actualScalarOfResult.getVStringOrBuilder();
    long actualVSignedInt = actualScalarOfResult.getVSignedInt();
    MysqlxDatatypes.Scalar.String actualVString = actualScalarOfResult.getVString();
    String actualToStringResult = actualScalarOfResult.toString();
    float actualVFloat = actualScalarOfResult.getVFloat();
    MysqlxDatatypes.Scalar.Octets actualVOctets = actualScalarOfResult.getVOctets();
    boolean actualIsInitializedResult = actualScalarOfResult.isInitialized();
    boolean actualVBool = actualScalarOfResult.getVBool();
    assertFalse(actualHasVStringResult);
    assertEquals(MysqlxDatatypes.Scalar.Type.V_BOOL, actualType);
    assertEquals("type: V_BOOL\nv_bool: true\n", actualToStringResult);
    assertEquals(0.0, actualVDouble, 0.0);
    assertEquals(0.0f, actualVFloat, 0.0f);
    assertTrue(actualVBool);
    assertTrue(actualIsInitializedResult);
    assertSame(actualScalarOfResult.getVOctetsOrBuilder(), actualVOctets);
    assertEquals(4, actualSerializedSize);
    assertEquals(0L, actualVUnsignedInt);
    assertEquals(0L, actualVSignedInt);
    assertSame(vStringOrBuilder, actualVString);
  }

  @Test
  public void scalarOfTest4() {
    // Arrange and Act
    MysqlxDatatypes.Scalar actualScalarOfResult = ExprUtil.scalarOf(new byte[24]);

    // Assert
    boolean actualHasVStringResult = actualScalarOfResult.hasVString();
    int actualSerializedSize = actualScalarOfResult.getSerializedSize();
    double actualVDouble = actualScalarOfResult.getVDouble();
    long actualVUnsignedInt = actualScalarOfResult.getVUnsignedInt();
    MysqlxDatatypes.Scalar.Type actualType = actualScalarOfResult.getType();
    MysqlxDatatypes.Scalar.StringOrBuilder vStringOrBuilder = actualScalarOfResult.getVStringOrBuilder();
    long actualVSignedInt = actualScalarOfResult.getVSignedInt();
    MysqlxDatatypes.Scalar.String actualVString = actualScalarOfResult.getVString();
    String actualToStringResult = actualScalarOfResult.toString();
    float actualVFloat = actualScalarOfResult.getVFloat();
    boolean actualIsInitializedResult = actualScalarOfResult.isInitialized();
    boolean actualVBool = actualScalarOfResult.getVBool();
    String actualInitializationErrorString = actualScalarOfResult.getInitializationErrorString();
    MysqlxDatatypes.Scalar.OctetsOrBuilder vOctetsOrBuilder = actualScalarOfResult.getVOctetsOrBuilder();
    assertFalse(actualHasVStringResult);
    assertEquals("", actualInitializationErrorString);
    int actualContentType = vOctetsOrBuilder.getContentType();
    String actualToStringResult1 = ((MysqlxDatatypes.Scalar.Octets) vOctetsOrBuilder).toString();
    int actualSerializedSize1 = ((MysqlxDatatypes.Scalar.Octets) vOctetsOrBuilder).getSerializedSize();
    boolean actualHasValueResult = vOctetsOrBuilder.hasValue();
    assertEquals(MysqlxDatatypes.Scalar.Type.V_OCTETS, actualType);
    assertEquals(
        "type: V_OCTETS\nv_octets {\n  value: \"\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\"\n}\n",
        actualToStringResult);
    assertEquals(0.0, actualVDouble, 0.0);
    assertEquals(0.0f, actualVFloat, 0.0f);
    assertFalse(actualVBool);
    assertTrue(actualIsInitializedResult);
    assertEquals(30, actualSerializedSize);
    assertEquals(0L, actualVUnsignedInt);
    assertEquals(0L, actualVSignedInt);
    assertSame(vStringOrBuilder, actualVString);
    assertTrue(actualHasValueResult);
    assertEquals(
        "value: \"\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\"\n",
        actualToStringResult1);
    assertTrue(vOctetsOrBuilder.isInitialized());
    assertEquals(0, actualContentType);
    assertEquals(26, actualSerializedSize1);
  }

  @Test
  public void scalarOfTest3() {
    // Arrange and Act
    MysqlxDatatypes.Scalar actualScalarOfResult = ExprUtil.scalarOf("yyyy-MM-dd'T'HH:mm:ss.S");

    // Assert
    boolean actualHasVStringResult = actualScalarOfResult.hasVString();
    int actualSerializedSize = actualScalarOfResult.getSerializedSize();
    double actualVDouble = actualScalarOfResult.getVDouble();
    long actualVUnsignedInt = actualScalarOfResult.getVUnsignedInt();
    MysqlxDatatypes.Scalar.Type actualType = actualScalarOfResult.getType();
    long actualVSignedInt = actualScalarOfResult.getVSignedInt();
    String actualToStringResult = actualScalarOfResult.toString();
    float actualVFloat = actualScalarOfResult.getVFloat();
    MysqlxDatatypes.Scalar.Octets actualVOctets = actualScalarOfResult.getVOctets();
    boolean actualIsInitializedResult = actualScalarOfResult.isInitialized();
    boolean actualVBool = actualScalarOfResult.getVBool();
    String actualInitializationErrorString = actualScalarOfResult.getInitializationErrorString();
    assertTrue(actualHasVStringResult);
    assertEquals("", actualInitializationErrorString);
    assertEquals(MysqlxDatatypes.Scalar.Type.V_STRING, actualType);
    assertEquals("type: V_STRING\nv_string {\n  value: \"yyyy-MM-dd\\'T\\'HH:mm:ss.S\"\n}\n", actualToStringResult);
    assertEquals(0.0, actualVDouble, 0.0);
    assertEquals(0.0f, actualVFloat, 0.0f);
    assertFalse(actualVBool);
    assertTrue(actualIsInitializedResult);
    assertSame(actualScalarOfResult.getVOctetsOrBuilder(), actualVOctets);
    assertEquals(29, actualSerializedSize);
    assertEquals(0L, actualVUnsignedInt);
    assertEquals(0L, actualVSignedInt);
  }

  @Test
  public void scalarOfTest2() {
    // Arrange and Act
    MysqlxDatatypes.Scalar actualScalarOfResult = ExprUtil.scalarOf(1L);

    // Assert
    boolean actualHasVStringResult = actualScalarOfResult.hasVString();
    int actualSerializedSize = actualScalarOfResult.getSerializedSize();
    double actualVDouble = actualScalarOfResult.getVDouble();
    long actualVUnsignedInt = actualScalarOfResult.getVUnsignedInt();
    MysqlxDatatypes.Scalar.Type actualType = actualScalarOfResult.getType();
    MysqlxDatatypes.Scalar.StringOrBuilder vStringOrBuilder = actualScalarOfResult.getVStringOrBuilder();
    long actualVSignedInt = actualScalarOfResult.getVSignedInt();
    MysqlxDatatypes.Scalar.String actualVString = actualScalarOfResult.getVString();
    String actualToStringResult = actualScalarOfResult.toString();
    float actualVFloat = actualScalarOfResult.getVFloat();
    MysqlxDatatypes.Scalar.Octets actualVOctets = actualScalarOfResult.getVOctets();
    boolean actualIsInitializedResult = actualScalarOfResult.isInitialized();
    boolean actualVBool = actualScalarOfResult.getVBool();
    assertFalse(actualHasVStringResult);
    assertEquals(MysqlxDatatypes.Scalar.Type.V_SINT, actualType);
    assertEquals("type: V_SINT\nv_signed_int: 1\n", actualToStringResult);
    assertEquals(0.0, actualVDouble, 0.0);
    assertEquals(0.0f, actualVFloat, 0.0f);
    assertFalse(actualVBool);
    assertTrue(actualIsInitializedResult);
    assertSame(actualScalarOfResult.getVOctetsOrBuilder(), actualVOctets);
    assertEquals(4, actualSerializedSize);
    assertEquals(0L, actualVUnsignedInt);
    assertEquals(1L, actualVSignedInt);
    assertSame(vStringOrBuilder, actualVString);
  }

  @Test
  public void scalarOfTest() {
    // Arrange and Act
    MysqlxDatatypes.Scalar actualScalarOfResult = ExprUtil.scalarOf(1.0);

    // Assert
    boolean actualHasVStringResult = actualScalarOfResult.hasVString();
    int actualSerializedSize = actualScalarOfResult.getSerializedSize();
    double actualVDouble = actualScalarOfResult.getVDouble();
    long actualVUnsignedInt = actualScalarOfResult.getVUnsignedInt();
    MysqlxDatatypes.Scalar.Type actualType = actualScalarOfResult.getType();
    MysqlxDatatypes.Scalar.StringOrBuilder vStringOrBuilder = actualScalarOfResult.getVStringOrBuilder();
    long actualVSignedInt = actualScalarOfResult.getVSignedInt();
    MysqlxDatatypes.Scalar.String actualVString = actualScalarOfResult.getVString();
    String actualToStringResult = actualScalarOfResult.toString();
    float actualVFloat = actualScalarOfResult.getVFloat();
    MysqlxDatatypes.Scalar.Octets actualVOctets = actualScalarOfResult.getVOctets();
    boolean actualIsInitializedResult = actualScalarOfResult.isInitialized();
    boolean actualVBool = actualScalarOfResult.getVBool();
    assertFalse(actualHasVStringResult);
    assertEquals(MysqlxDatatypes.Scalar.Type.V_DOUBLE, actualType);
    assertEquals("type: V_DOUBLE\nv_double: 1.0\n", actualToStringResult);
    assertEquals(1.0, actualVDouble, 0.0);
    assertEquals(0.0f, actualVFloat, 0.0f);
    assertFalse(actualVBool);
    assertTrue(actualIsInitializedResult);
    assertSame(actualScalarOfResult.getVOctetsOrBuilder(), actualVOctets);
    assertEquals(11, actualSerializedSize);
    assertEquals(0L, actualVUnsignedInt);
    assertEquals(0L, actualVSignedInt);
    assertSame(vStringOrBuilder, actualVString);
  }

  @Test
  public void nullScalarTest() {
    // Arrange and Act
    MysqlxDatatypes.Scalar actualNullScalarResult = ExprUtil.nullScalar();

    // Assert
    boolean actualHasVStringResult = actualNullScalarResult.hasVString();
    int actualSerializedSize = actualNullScalarResult.getSerializedSize();
    double actualVDouble = actualNullScalarResult.getVDouble();
    long actualVUnsignedInt = actualNullScalarResult.getVUnsignedInt();
    MysqlxDatatypes.Scalar.Type actualType = actualNullScalarResult.getType();
    MysqlxDatatypes.Scalar.StringOrBuilder vStringOrBuilder = actualNullScalarResult.getVStringOrBuilder();
    long actualVSignedInt = actualNullScalarResult.getVSignedInt();
    MysqlxDatatypes.Scalar.String actualVString = actualNullScalarResult.getVString();
    String actualToStringResult = actualNullScalarResult.toString();
    float actualVFloat = actualNullScalarResult.getVFloat();
    MysqlxDatatypes.Scalar.Octets actualVOctets = actualNullScalarResult.getVOctets();
    boolean actualIsInitializedResult = actualNullScalarResult.isInitialized();
    boolean actualVBool = actualNullScalarResult.getVBool();
    assertFalse(actualHasVStringResult);
    assertEquals(MysqlxDatatypes.Scalar.Type.V_NULL, actualType);
    assertEquals("type: V_NULL\n", actualToStringResult);
    assertEquals(0.0, actualVDouble, 0.0);
    assertEquals(0.0f, actualVFloat, 0.0f);
    assertFalse(actualVBool);
    assertTrue(actualIsInitializedResult);
    assertSame(actualNullScalarResult.getVOctetsOrBuilder(), actualVOctets);
    assertEquals(2, actualSerializedSize);
    assertEquals(0L, actualVUnsignedInt);
    assertEquals(0L, actualVSignedInt);
    assertSame(vStringOrBuilder, actualVString);
  }

  @Test
  public void buildPlaceholderExprTest() {
    // Arrange and Act
    MysqlxExpr.Expr actualBuildPlaceholderExprResult = ExprUtil.buildPlaceholderExpr(1);

    // Assert
    MysqlxExpr.ColumnIdentifierOrBuilder identifierOrBuilder = actualBuildPlaceholderExprResult
        .getIdentifierOrBuilder();
    boolean actualHasOperatorResult = actualBuildPlaceholderExprResult.hasOperator();
    int actualPosition = actualBuildPlaceholderExprResult.getPosition();
    int actualSerializedSize = actualBuildPlaceholderExprResult.getSerializedSize();
    MysqlxExpr.ObjectOrBuilder actualObjectOrBuilder = actualBuildPlaceholderExprResult.getObjectOrBuilder();
    String actualVariable = actualBuildPlaceholderExprResult.getVariable();
    MysqlxExpr.Expr.Type actualType = actualBuildPlaceholderExprResult.getType();
    MysqlxDatatypes.ScalarOrBuilder actualLiteralOrBuilder = actualBuildPlaceholderExprResult.getLiteralOrBuilder();
    MysqlxDatatypes.Scalar expectedLiteralOrBuilder = actualBuildPlaceholderExprResult.getLiteral();
    MysqlxExpr.Array expectedArrayOrBuilder = actualBuildPlaceholderExprResult.getArray();
    MysqlxExpr.ArrayOrBuilder actualArrayOrBuilder = actualBuildPlaceholderExprResult.getArrayOrBuilder();
    MysqlxExpr.OperatorOrBuilder actualOperatorOrBuilder = actualBuildPlaceholderExprResult.getOperatorOrBuilder();
    MysqlxExpr.FunctionCall actualFunctionCall = actualBuildPlaceholderExprResult.getFunctionCall();
    String actualToStringResult = actualBuildPlaceholderExprResult.toString();
    MysqlxExpr.ColumnIdentifier actualIdentifier = actualBuildPlaceholderExprResult.getIdentifier();
    MysqlxExpr.FunctionCallOrBuilder functionCallOrBuilder = actualBuildPlaceholderExprResult
        .getFunctionCallOrBuilder();
    boolean actualIsInitializedResult = actualBuildPlaceholderExprResult.isInitialized();
    MysqlxExpr.Operator expectedOperatorOrBuilder = actualBuildPlaceholderExprResult.getOperator();
    assertFalse(actualHasOperatorResult);
    assertEquals(4, actualSerializedSize);
    assertSame(expectedArrayOrBuilder, actualArrayOrBuilder);
    assertSame(expectedOperatorOrBuilder, actualOperatorOrBuilder);
    assertTrue(actualIsInitializedResult);
    assertSame(identifierOrBuilder, actualIdentifier);
    assertEquals("type: PLACEHOLDER\nposition: 1\n", actualToStringResult);
    assertSame(functionCallOrBuilder, actualFunctionCall);
    assertSame(actualBuildPlaceholderExprResult.getObject(), actualObjectOrBuilder);
    assertEquals(MysqlxExpr.Expr.Type.PLACEHOLDER, actualType);
    assertEquals(1, actualPosition);
    assertSame(expectedLiteralOrBuilder, actualLiteralOrBuilder);
    assertEquals("", actualVariable);
  }

  @Test
  public void buildLiteralExprTest() {
    // Arrange, Act and Assert
    thrown.expect(UninitializedMessageException.class);
    ExprUtil.buildLiteralExpr(MysqlxDatatypes.Scalar.getDefaultInstance());
  }

  @Test
  public void buildLiteralScalarTest5() {
    // Arrange and Act
    MysqlxExpr.Expr actualBuildLiteralScalarResult = ExprUtil.buildLiteralScalar(true);

    // Assert
    MysqlxExpr.ColumnIdentifierOrBuilder identifierOrBuilder = actualBuildLiteralScalarResult.getIdentifierOrBuilder();
    boolean actualHasOperatorResult = actualBuildLiteralScalarResult.hasOperator();
    int actualPosition = actualBuildLiteralScalarResult.getPosition();
    int actualSerializedSize = actualBuildLiteralScalarResult.getSerializedSize();
    MysqlxExpr.ObjectOrBuilder actualObjectOrBuilder = actualBuildLiteralScalarResult.getObjectOrBuilder();
    String actualVariable = actualBuildLiteralScalarResult.getVariable();
    MysqlxExpr.Expr.Type actualType = actualBuildLiteralScalarResult.getType();
    MysqlxExpr.Array expectedArrayOrBuilder = actualBuildLiteralScalarResult.getArray();
    MysqlxExpr.ArrayOrBuilder actualArrayOrBuilder = actualBuildLiteralScalarResult.getArrayOrBuilder();
    MysqlxExpr.OperatorOrBuilder actualOperatorOrBuilder = actualBuildLiteralScalarResult.getOperatorOrBuilder();
    MysqlxExpr.FunctionCall actualFunctionCall = actualBuildLiteralScalarResult.getFunctionCall();
    String actualToStringResult = actualBuildLiteralScalarResult.toString();
    MysqlxExpr.ColumnIdentifier actualIdentifier = actualBuildLiteralScalarResult.getIdentifier();
    MysqlxExpr.FunctionCallOrBuilder functionCallOrBuilder = actualBuildLiteralScalarResult.getFunctionCallOrBuilder();
    boolean actualIsInitializedResult = actualBuildLiteralScalarResult.isInitialized();
    MysqlxExpr.Operator expectedOperatorOrBuilder = actualBuildLiteralScalarResult.getOperator();
    String actualInitializationErrorString = actualBuildLiteralScalarResult.getInitializationErrorString();
    assertFalse(actualHasOperatorResult);
    assertEquals(8, actualSerializedSize);
    assertSame(expectedArrayOrBuilder, actualArrayOrBuilder);
    assertEquals("", actualInitializationErrorString);
    assertSame(expectedOperatorOrBuilder, actualOperatorOrBuilder);
    assertTrue(actualIsInitializedResult);
    assertSame(identifierOrBuilder, actualIdentifier);
    assertEquals("type: LITERAL\nliteral {\n  type: V_BOOL\n  v_bool: true\n}\n", actualToStringResult);
    assertSame(functionCallOrBuilder, actualFunctionCall);
    assertSame(actualBuildLiteralScalarResult.getObject(), actualObjectOrBuilder);
    assertEquals(MysqlxExpr.Expr.Type.LITERAL, actualType);
    assertEquals(0, actualPosition);
    assertEquals("", actualVariable);
  }

  @Test
  public void buildLiteralScalarTest4() {
    // Arrange and Act
    MysqlxExpr.Expr actualBuildLiteralScalarResult = ExprUtil.buildLiteralScalar(new byte[24]);

    // Assert
    MysqlxExpr.ColumnIdentifierOrBuilder identifierOrBuilder = actualBuildLiteralScalarResult.getIdentifierOrBuilder();
    boolean actualHasOperatorResult = actualBuildLiteralScalarResult.hasOperator();
    int actualPosition = actualBuildLiteralScalarResult.getPosition();
    int actualSerializedSize = actualBuildLiteralScalarResult.getSerializedSize();
    MysqlxExpr.ObjectOrBuilder actualObjectOrBuilder = actualBuildLiteralScalarResult.getObjectOrBuilder();
    String actualVariable = actualBuildLiteralScalarResult.getVariable();
    MysqlxExpr.Expr.Type actualType = actualBuildLiteralScalarResult.getType();
    MysqlxExpr.Array expectedArrayOrBuilder = actualBuildLiteralScalarResult.getArray();
    MysqlxExpr.ArrayOrBuilder actualArrayOrBuilder = actualBuildLiteralScalarResult.getArrayOrBuilder();
    MysqlxExpr.OperatorOrBuilder actualOperatorOrBuilder = actualBuildLiteralScalarResult.getOperatorOrBuilder();
    MysqlxExpr.FunctionCall actualFunctionCall = actualBuildLiteralScalarResult.getFunctionCall();
    String actualToStringResult = actualBuildLiteralScalarResult.toString();
    MysqlxExpr.ColumnIdentifier actualIdentifier = actualBuildLiteralScalarResult.getIdentifier();
    MysqlxExpr.FunctionCallOrBuilder functionCallOrBuilder = actualBuildLiteralScalarResult.getFunctionCallOrBuilder();
    boolean actualIsInitializedResult = actualBuildLiteralScalarResult.isInitialized();
    MysqlxExpr.Operator expectedOperatorOrBuilder = actualBuildLiteralScalarResult.getOperator();
    String actualInitializationErrorString = actualBuildLiteralScalarResult.getInitializationErrorString();
    assertFalse(actualHasOperatorResult);
    assertEquals(34, actualSerializedSize);
    assertSame(expectedArrayOrBuilder, actualArrayOrBuilder);
    assertEquals("", actualInitializationErrorString);
    assertSame(expectedOperatorOrBuilder, actualOperatorOrBuilder);
    assertTrue(actualIsInitializedResult);
    assertSame(identifierOrBuilder, actualIdentifier);
    assertEquals(
        "type: LITERAL\nliteral {\n  type: V_OCTETS\n  v_octets {\n    value: \"\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\\000\"\n  }\n}\n",
        actualToStringResult);
    assertSame(functionCallOrBuilder, actualFunctionCall);
    assertSame(actualBuildLiteralScalarResult.getObject(), actualObjectOrBuilder);
    assertEquals(MysqlxExpr.Expr.Type.LITERAL, actualType);
    assertEquals(0, actualPosition);
    assertEquals("", actualVariable);
  }

  @Test
  public void buildLiteralScalarTest3() {
    // Arrange and Act
    MysqlxExpr.Expr actualBuildLiteralScalarResult = ExprUtil.buildLiteralScalar("yyyy-MM-dd'T'HH:mm:ss.S");

    // Assert
    MysqlxExpr.ColumnIdentifierOrBuilder identifierOrBuilder = actualBuildLiteralScalarResult.getIdentifierOrBuilder();
    boolean actualHasOperatorResult = actualBuildLiteralScalarResult.hasOperator();
    int actualPosition = actualBuildLiteralScalarResult.getPosition();
    int actualSerializedSize = actualBuildLiteralScalarResult.getSerializedSize();
    MysqlxExpr.ObjectOrBuilder actualObjectOrBuilder = actualBuildLiteralScalarResult.getObjectOrBuilder();
    String actualVariable = actualBuildLiteralScalarResult.getVariable();
    MysqlxExpr.Expr.Type actualType = actualBuildLiteralScalarResult.getType();
    MysqlxExpr.Array expectedArrayOrBuilder = actualBuildLiteralScalarResult.getArray();
    MysqlxExpr.ArrayOrBuilder actualArrayOrBuilder = actualBuildLiteralScalarResult.getArrayOrBuilder();
    MysqlxExpr.OperatorOrBuilder actualOperatorOrBuilder = actualBuildLiteralScalarResult.getOperatorOrBuilder();
    MysqlxExpr.FunctionCall actualFunctionCall = actualBuildLiteralScalarResult.getFunctionCall();
    String actualToStringResult = actualBuildLiteralScalarResult.toString();
    MysqlxExpr.ColumnIdentifier actualIdentifier = actualBuildLiteralScalarResult.getIdentifier();
    MysqlxExpr.FunctionCallOrBuilder functionCallOrBuilder = actualBuildLiteralScalarResult.getFunctionCallOrBuilder();
    boolean actualIsInitializedResult = actualBuildLiteralScalarResult.isInitialized();
    MysqlxExpr.Operator expectedOperatorOrBuilder = actualBuildLiteralScalarResult.getOperator();
    String actualInitializationErrorString = actualBuildLiteralScalarResult.getInitializationErrorString();
    assertFalse(actualHasOperatorResult);
    assertEquals(33, actualSerializedSize);
    assertSame(expectedArrayOrBuilder, actualArrayOrBuilder);
    assertEquals("", actualInitializationErrorString);
    assertSame(expectedOperatorOrBuilder, actualOperatorOrBuilder);
    assertTrue(actualIsInitializedResult);
    assertSame(identifierOrBuilder, actualIdentifier);
    assertEquals(
        "type: LITERAL\nliteral {\n  type: V_STRING\n  v_string {\n    value: \"yyyy-MM-dd\\'T\\'HH:mm:ss.S\"\n  }\n}\n",
        actualToStringResult);
    assertSame(functionCallOrBuilder, actualFunctionCall);
    assertSame(actualBuildLiteralScalarResult.getObject(), actualObjectOrBuilder);
    assertEquals(MysqlxExpr.Expr.Type.LITERAL, actualType);
    assertEquals(0, actualPosition);
    assertEquals("", actualVariable);
  }

  @Test
  public void buildLiteralScalarTest2() {
    // Arrange and Act
    MysqlxExpr.Expr actualBuildLiteralScalarResult = ExprUtil.buildLiteralScalar(1L);

    // Assert
    MysqlxExpr.ColumnIdentifierOrBuilder identifierOrBuilder = actualBuildLiteralScalarResult.getIdentifierOrBuilder();
    boolean actualHasOperatorResult = actualBuildLiteralScalarResult.hasOperator();
    int actualPosition = actualBuildLiteralScalarResult.getPosition();
    int actualSerializedSize = actualBuildLiteralScalarResult.getSerializedSize();
    MysqlxExpr.ObjectOrBuilder actualObjectOrBuilder = actualBuildLiteralScalarResult.getObjectOrBuilder();
    String actualVariable = actualBuildLiteralScalarResult.getVariable();
    MysqlxExpr.Expr.Type actualType = actualBuildLiteralScalarResult.getType();
    MysqlxExpr.Array expectedArrayOrBuilder = actualBuildLiteralScalarResult.getArray();
    MysqlxExpr.ArrayOrBuilder actualArrayOrBuilder = actualBuildLiteralScalarResult.getArrayOrBuilder();
    MysqlxExpr.OperatorOrBuilder actualOperatorOrBuilder = actualBuildLiteralScalarResult.getOperatorOrBuilder();
    MysqlxExpr.FunctionCall actualFunctionCall = actualBuildLiteralScalarResult.getFunctionCall();
    String actualToStringResult = actualBuildLiteralScalarResult.toString();
    MysqlxExpr.ColumnIdentifier actualIdentifier = actualBuildLiteralScalarResult.getIdentifier();
    MysqlxExpr.FunctionCallOrBuilder functionCallOrBuilder = actualBuildLiteralScalarResult.getFunctionCallOrBuilder();
    boolean actualIsInitializedResult = actualBuildLiteralScalarResult.isInitialized();
    MysqlxExpr.Operator expectedOperatorOrBuilder = actualBuildLiteralScalarResult.getOperator();
    String actualInitializationErrorString = actualBuildLiteralScalarResult.getInitializationErrorString();
    assertFalse(actualHasOperatorResult);
    assertEquals(8, actualSerializedSize);
    assertSame(expectedArrayOrBuilder, actualArrayOrBuilder);
    assertEquals("", actualInitializationErrorString);
    assertSame(expectedOperatorOrBuilder, actualOperatorOrBuilder);
    assertTrue(actualIsInitializedResult);
    assertSame(identifierOrBuilder, actualIdentifier);
    assertEquals("type: LITERAL\nliteral {\n  type: V_SINT\n  v_signed_int: 1\n}\n", actualToStringResult);
    assertSame(functionCallOrBuilder, actualFunctionCall);
    assertSame(actualBuildLiteralScalarResult.getObject(), actualObjectOrBuilder);
    assertEquals(MysqlxExpr.Expr.Type.LITERAL, actualType);
    assertEquals(0, actualPosition);
    assertEquals("", actualVariable);
  }

  @Test
  public void buildLiteralScalarTest() {
    // Arrange and Act
    MysqlxExpr.Expr actualBuildLiteralScalarResult = ExprUtil.buildLiteralScalar(1.0);

    // Assert
    MysqlxExpr.ColumnIdentifierOrBuilder identifierOrBuilder = actualBuildLiteralScalarResult.getIdentifierOrBuilder();
    boolean actualHasOperatorResult = actualBuildLiteralScalarResult.hasOperator();
    int actualPosition = actualBuildLiteralScalarResult.getPosition();
    int actualSerializedSize = actualBuildLiteralScalarResult.getSerializedSize();
    MysqlxExpr.ObjectOrBuilder actualObjectOrBuilder = actualBuildLiteralScalarResult.getObjectOrBuilder();
    String actualVariable = actualBuildLiteralScalarResult.getVariable();
    MysqlxExpr.Expr.Type actualType = actualBuildLiteralScalarResult.getType();
    MysqlxExpr.Array expectedArrayOrBuilder = actualBuildLiteralScalarResult.getArray();
    MysqlxExpr.ArrayOrBuilder actualArrayOrBuilder = actualBuildLiteralScalarResult.getArrayOrBuilder();
    MysqlxExpr.OperatorOrBuilder actualOperatorOrBuilder = actualBuildLiteralScalarResult.getOperatorOrBuilder();
    MysqlxExpr.FunctionCall actualFunctionCall = actualBuildLiteralScalarResult.getFunctionCall();
    String actualToStringResult = actualBuildLiteralScalarResult.toString();
    MysqlxExpr.ColumnIdentifier actualIdentifier = actualBuildLiteralScalarResult.getIdentifier();
    MysqlxExpr.FunctionCallOrBuilder functionCallOrBuilder = actualBuildLiteralScalarResult.getFunctionCallOrBuilder();
    boolean actualIsInitializedResult = actualBuildLiteralScalarResult.isInitialized();
    MysqlxExpr.Operator expectedOperatorOrBuilder = actualBuildLiteralScalarResult.getOperator();
    String actualInitializationErrorString = actualBuildLiteralScalarResult.getInitializationErrorString();
    assertFalse(actualHasOperatorResult);
    assertEquals(15, actualSerializedSize);
    assertSame(expectedArrayOrBuilder, actualArrayOrBuilder);
    assertEquals("", actualInitializationErrorString);
    assertSame(expectedOperatorOrBuilder, actualOperatorOrBuilder);
    assertTrue(actualIsInitializedResult);
    assertSame(identifierOrBuilder, actualIdentifier);
    assertEquals("type: LITERAL\nliteral {\n  type: V_DOUBLE\n  v_double: 1.0\n}\n", actualToStringResult);
    assertSame(functionCallOrBuilder, actualFunctionCall);
    assertSame(actualBuildLiteralScalarResult.getObject(), actualObjectOrBuilder);
    assertEquals(MysqlxExpr.Expr.Type.LITERAL, actualType);
    assertEquals(0, actualPosition);
    assertEquals("", actualVariable);
  }

  @Test
  public void buildLiteralNullScalarTest() {
    // Arrange and Act
    MysqlxExpr.Expr actualBuildLiteralNullScalarResult = ExprUtil.buildLiteralNullScalar();

    // Assert
    MysqlxExpr.ColumnIdentifierOrBuilder identifierOrBuilder = actualBuildLiteralNullScalarResult
        .getIdentifierOrBuilder();
    boolean actualHasOperatorResult = actualBuildLiteralNullScalarResult.hasOperator();
    int actualPosition = actualBuildLiteralNullScalarResult.getPosition();
    int actualSerializedSize = actualBuildLiteralNullScalarResult.getSerializedSize();
    MysqlxExpr.ObjectOrBuilder actualObjectOrBuilder = actualBuildLiteralNullScalarResult.getObjectOrBuilder();
    String actualVariable = actualBuildLiteralNullScalarResult.getVariable();
    MysqlxExpr.Expr.Type actualType = actualBuildLiteralNullScalarResult.getType();
    MysqlxExpr.Array expectedArrayOrBuilder = actualBuildLiteralNullScalarResult.getArray();
    MysqlxExpr.ArrayOrBuilder actualArrayOrBuilder = actualBuildLiteralNullScalarResult.getArrayOrBuilder();
    MysqlxExpr.OperatorOrBuilder actualOperatorOrBuilder = actualBuildLiteralNullScalarResult.getOperatorOrBuilder();
    MysqlxExpr.FunctionCall actualFunctionCall = actualBuildLiteralNullScalarResult.getFunctionCall();
    String actualToStringResult = actualBuildLiteralNullScalarResult.toString();
    MysqlxExpr.ColumnIdentifier actualIdentifier = actualBuildLiteralNullScalarResult.getIdentifier();
    MysqlxExpr.FunctionCallOrBuilder functionCallOrBuilder = actualBuildLiteralNullScalarResult
        .getFunctionCallOrBuilder();
    boolean actualIsInitializedResult = actualBuildLiteralNullScalarResult.isInitialized();
    MysqlxExpr.Operator expectedOperatorOrBuilder = actualBuildLiteralNullScalarResult.getOperator();
    String actualInitializationErrorString = actualBuildLiteralNullScalarResult.getInitializationErrorString();
    assertFalse(actualHasOperatorResult);
    assertEquals(6, actualSerializedSize);
    assertSame(expectedArrayOrBuilder, actualArrayOrBuilder);
    assertEquals("", actualInitializationErrorString);
    assertSame(expectedOperatorOrBuilder, actualOperatorOrBuilder);
    assertTrue(actualIsInitializedResult);
    assertSame(identifierOrBuilder, actualIdentifier);
    assertEquals("type: LITERAL\nliteral {\n  type: V_NULL\n}\n", actualToStringResult);
    assertSame(functionCallOrBuilder, actualFunctionCall);
    assertSame(actualBuildLiteralNullScalarResult.getObject(), actualObjectOrBuilder);
    assertEquals(MysqlxExpr.Expr.Type.LITERAL, actualType);
    assertEquals(0, actualPosition);
    assertEquals("", actualVariable);
  }
}
