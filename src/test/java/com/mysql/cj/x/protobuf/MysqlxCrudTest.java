package com.mysql.cj.x.protobuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ProtocolStringList;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysqlxCrudTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void valueOfTest16() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.ViewSqlSecurity.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest8() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.ViewSqlSecurity.INVOKER, MysqlxCrud.ViewSqlSecurity.forNumber(1));
  }

  @Test
  public void valueOfTest15() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.ViewSqlSecurity.INVOKER, MysqlxCrud.ViewSqlSecurity.valueOf(1));
  }

  @Test
  public void getNumberTest8() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxCrud.ViewSqlSecurity.INVOKER.getNumber());
  }

  @Test
  public void valueOfTest14() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.ViewCheckOption.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest7() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.ViewCheckOption.LOCAL, MysqlxCrud.ViewCheckOption.forNumber(1));
  }

  @Test
  public void valueOfTest13() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.ViewCheckOption.LOCAL, MysqlxCrud.ViewCheckOption.valueOf(1));
  }

  @Test
  public void getNumberTest7() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxCrud.ViewCheckOption.LOCAL.getNumber());
  }

  @Test
  public void valueOfTest12() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.ViewAlgorithm.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest6() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.ViewAlgorithm.UNDEFINED, MysqlxCrud.ViewAlgorithm.forNumber(1));
  }

  @Test
  public void valueOfTest11() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.ViewAlgorithm.UNDEFINED, MysqlxCrud.ViewAlgorithm.valueOf(1));
  }

  @Test
  public void getNumberTest6() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxCrud.ViewAlgorithm.UNDEFINED.getNumber());
  }

  @Test
  public void valueOfTest10() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.UpdateOperation.UpdateType.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest5() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.UpdateOperation.UpdateType.SET, MysqlxCrud.UpdateOperation.UpdateType.forNumber(1));
  }

  @Test
  public void valueOfTest9() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.UpdateOperation.UpdateType.SET, MysqlxCrud.UpdateOperation.UpdateType.valueOf(1));
  }

  @Test
  public void getNumberTest5() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxCrud.UpdateOperation.UpdateType.SET.getNumber());
  }

  @Test
  public void parseFromTest120() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.UpdateOperation.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest119() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.UpdateOperation.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest30() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.UpdateOperation.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest29() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.UpdateOperation.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest118() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.UpdateOperation.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest117() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.UpdateOperation.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest116() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.UpdateOperation.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest115() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.UpdateOperation.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest114() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.UpdateOperation.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest113() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.UpdateOperation.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest15() {
    // Arrange, Act and Assert
    assertEquals(-1741478497, MysqlxCrud.UpdateOperation.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest15() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.UpdateOperation.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest15() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.UpdateOperation.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest15() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.UpdateOperation.getDefaultInstance().isInitialized());
  }

  @Test
  public void getValueOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.UpdateOperation.getDefaultInstance().getValueOrBuilder() instanceof MysqlxExpr.Expr);
  }

  @Test
  public void hasValueTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.UpdateOperation.getDefaultInstance().hasValue());
  }

  @Test
  public void getOperationTest2() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.UpdateOperation.UpdateType.SET,
        MysqlxCrud.UpdateOperation.getDefaultInstance().getOperation());
  }

  @Test
  public void hasOperationTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.UpdateOperation.getDefaultInstance().hasOperation());
  }

  @Test
  public void getSourceOrBuilderTest2() {
    // Arrange, Act and Assert
    assertTrue(
        MysqlxCrud.UpdateOperation.getDefaultInstance().getSourceOrBuilder() instanceof MysqlxExpr.ColumnIdentifier);
  }

  @Test
  public void hasSourceTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.UpdateOperation.getDefaultInstance().hasSource());
  }

  @Test
  public void parseFromTest112() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Update.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest111() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Update.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest28() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Update.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest27() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Update.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest110() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Update.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest109() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Update.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest108() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Update.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest107() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Update.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest106() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Update.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest105() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Update.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest14() {
    // Arrange, Act and Assert
    assertEquals(-644455953, MysqlxCrud.Update.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest14() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Update.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest14() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Update.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest14() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Update.getDefaultInstance().isInitialized());
  }

  @Test
  public void getLimitExprOrBuilderTest3() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Update.getDefaultInstance().getLimitExprOrBuilder() instanceof MysqlxCrud.LimitExpr);
  }

  @Test
  public void hasLimitExprTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Update.getDefaultInstance().hasLimitExpr());
  }

  @Test
  public void getLimitOrBuilderTest3() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Update.getDefaultInstance().getLimitOrBuilder() instanceof MysqlxCrud.Limit);
  }

  @Test
  public void hasLimitTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Update.getDefaultInstance().hasLimit());
  }

  @Test
  public void getOperationOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Update.getDefaultInstance().getOperationOrBuilder(1);
  }

  @Test
  public void getOperationTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Update.getDefaultInstance().getOperation(1);
  }

  @Test
  public void getOperationCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Update.getDefaultInstance().getOperationCount());
  }

  @Test
  public void getOperationOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Update.getDefaultInstance().getOperationOrBuilderList().size());
  }

  @Test
  public void getOperationListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Update.getDefaultInstance().getOperationList().size());
  }

  @Test
  public void getOrderOrBuilderTest3() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Update.getDefaultInstance().getOrderOrBuilder(1);
  }

  @Test
  public void getOrderTest3() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Update.getDefaultInstance().getOrder(1);
  }

  @Test
  public void getOrderCountTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Update.getDefaultInstance().getOrderCount());
  }

  @Test
  public void getOrderOrBuilderListTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Update.getDefaultInstance().getOrderOrBuilderList().size());
  }

  @Test
  public void getOrderListTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Update.getDefaultInstance().getOrderList().size());
  }

  @Test
  public void getArgsOrBuilderTest4() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Update.getDefaultInstance().getArgsOrBuilder(1);
  }

  @Test
  public void getArgsTest4() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Update.getDefaultInstance().getArgs(1);
  }

  @Test
  public void getArgsCountTest4() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Update.getDefaultInstance().getArgsCount());
  }

  @Test
  public void getArgsOrBuilderListTest4() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Update.getDefaultInstance().getArgsOrBuilderList().size());
  }

  @Test
  public void getArgsListTest4() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Update.getDefaultInstance().getArgsList().size());
  }

  @Test
  public void getCriteriaOrBuilderTest3() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Update.getDefaultInstance().getCriteriaOrBuilder() instanceof MysqlxExpr.Expr);
  }

  @Test
  public void hasCriteriaTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Update.getDefaultInstance().hasCriteria());
  }

  @Test
  public void getDataModelTest4() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.DataModel.DOCUMENT, MysqlxCrud.Update.getDefaultInstance().getDataModel());
  }

  @Test
  public void hasDataModelTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Update.getDefaultInstance().hasDataModel());
  }

  @Test
  public void getCollectionOrBuilderTest7() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Update.getDefaultInstance().getCollectionOrBuilder() instanceof MysqlxCrud.Collection);
  }

  @Test
  public void hasCollectionTest7() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Update.getDefaultInstance().hasCollection());
  }

  @Test
  public void toBuilderTest11() {
    // Arrange and Act
    MysqlxCrud.Projection.Builder actualToBuilderResult = MysqlxCrud.Projection.getDefaultInstance().toBuilder();

    // Assert
    MysqlxExpr.Expr expectedSourceOrBuilder = actualToBuilderResult.getSource();
    String actualToStringResult = actualToBuilderResult.toString();
    MysqlxExpr.ExprOrBuilder actualSourceOrBuilder = actualToBuilderResult.getSourceOrBuilder();
    assertSame(expectedSourceOrBuilder, actualSourceOrBuilder);
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getAlias());
  }

  @Test
  public void newBuilderTest22() {
    // Arrange and Act
    MysqlxCrud.Projection.Builder actualNewBuilderResult = MysqlxCrud.Projection
        .newBuilder(MysqlxCrud.Projection.getDefaultInstance());

    // Assert
    MysqlxExpr.Expr expectedSourceOrBuilder = actualNewBuilderResult.getSource();
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxExpr.ExprOrBuilder actualSourceOrBuilder = actualNewBuilderResult.getSourceOrBuilder();
    assertSame(expectedSourceOrBuilder, actualSourceOrBuilder);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getAlias());
  }

  @Test
  public void newBuilderTest21() {
    // Arrange and Act
    MysqlxCrud.Projection.Builder actualNewBuilderResult = MysqlxCrud.Projection.newBuilder();

    // Assert
    MysqlxExpr.Expr expectedSourceOrBuilder = actualNewBuilderResult.getSource();
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxExpr.ExprOrBuilder actualSourceOrBuilder = actualNewBuilderResult.getSourceOrBuilder();
    assertSame(expectedSourceOrBuilder, actualSourceOrBuilder);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getAlias());
  }

  @Test
  public void newBuilderForTypeTest11() {
    // Arrange and Act
    MysqlxCrud.Projection.Builder actualNewBuilderForTypeResult = MysqlxCrud.Projection.getDefaultInstance()
        .newBuilderForType();

    // Assert
    MysqlxExpr.Expr expectedSourceOrBuilder = actualNewBuilderForTypeResult.getSource();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    MysqlxExpr.ExprOrBuilder actualSourceOrBuilder = actualNewBuilderForTypeResult.getSourceOrBuilder();
    assertSame(expectedSourceOrBuilder, actualSourceOrBuilder);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getAlias());
  }

  @Test
  public void parseFromTest104() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Projection.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest103() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Projection.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest26() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Projection.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest25() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Projection.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest102() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Projection.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest101() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Projection.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest100() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Projection.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest99() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Projection.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest98() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Projection.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest97() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Projection.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest13() {
    // Arrange, Act and Assert
    assertEquals(-1383380323, MysqlxCrud.Projection.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest13() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Projection.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest13() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Projection.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest13() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Projection.getDefaultInstance().isInitialized());
  }

  @Test
  public void getAliasTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCrud.Projection.getDefaultInstance().getAlias());
  }

  @Test
  public void hasAliasTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Projection.getDefaultInstance().hasAlias());
  }

  @Test
  public void getSourceOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Projection.getDefaultInstance().getSourceOrBuilder() instanceof MysqlxExpr.Expr);
  }

  @Test
  public void hasSourceTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Projection.getDefaultInstance().hasSource());
  }

  @Test
  public void valueOfTest8() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Order.Direction.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest4() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.Order.Direction.ASC, MysqlxCrud.Order.Direction.forNumber(1));
  }

  @Test
  public void valueOfTest7() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.Order.Direction.ASC, MysqlxCrud.Order.Direction.valueOf(1));
  }

  @Test
  public void getNumberTest4() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxCrud.Order.Direction.ASC.getNumber());
  }

  @Test
  public void toBuilderTest10() {
    // Arrange and Act
    MysqlxCrud.Order.Builder actualToBuilderResult = MysqlxCrud.Order.getDefaultInstance().toBuilder();

    // Assert
    MysqlxCrud.Order.Direction actualDirection = actualToBuilderResult.getDirection();
    assertEquals(MysqlxCrud.Order.Direction.ASC, actualDirection);
    assertEquals("", actualToBuilderResult.toString());
  }

  @Test
  public void newBuilderTest20() {
    // Arrange and Act
    MysqlxCrud.Order.Builder actualNewBuilderResult = MysqlxCrud.Order
        .newBuilder(MysqlxCrud.Order.getDefaultInstance());

    // Assert
    MysqlxCrud.Order.Direction actualDirection = actualNewBuilderResult.getDirection();
    assertEquals(MysqlxCrud.Order.Direction.ASC, actualDirection);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderTest19() {
    // Arrange and Act
    MysqlxCrud.Order.Builder actualNewBuilderResult = MysqlxCrud.Order.newBuilder();

    // Assert
    MysqlxCrud.Order.Direction actualDirection = actualNewBuilderResult.getDirection();
    assertEquals(MysqlxCrud.Order.Direction.ASC, actualDirection);
    assertEquals("", actualNewBuilderResult.toString());
  }

  @Test
  public void newBuilderForTypeTest10() {
    // Arrange and Act
    MysqlxCrud.Order.Builder actualNewBuilderForTypeResult = MysqlxCrud.Order.getDefaultInstance().newBuilderForType();

    // Assert
    MysqlxCrud.Order.Direction actualDirection = actualNewBuilderForTypeResult.getDirection();
    assertEquals(MysqlxCrud.Order.Direction.ASC, actualDirection);
    assertEquals("", actualNewBuilderForTypeResult.toString());
  }

  @Test
  public void parseFromTest96() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Order.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest95() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Order.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest24() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Order.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest23() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Order.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest94() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Order.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest93() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Order.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest92() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Order.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest91() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Order.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest90() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Order.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest89() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Order.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest12() {
    // Arrange, Act and Assert
    assertEquals(-1741556400, MysqlxCrud.Order.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest12() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Order.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest12() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Order.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest12() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Order.getDefaultInstance().isInitialized());
  }

  @Test
  public void getDirectionTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.Order.Direction.ASC, MysqlxCrud.Order.getDefaultInstance().getDirection());
  }

  @Test
  public void hasDirectionTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Order.getDefaultInstance().hasDirection());
  }

  @Test
  public void getExprOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Order.getDefaultInstance().getExprOrBuilder() instanceof MysqlxExpr.Expr);
  }

  @Test
  public void hasExprTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Order.getDefaultInstance().hasExpr());
  }

  @Test
  public void toBuilderTest9() {
    // Arrange and Act
    MysqlxCrud.ModifyView.Builder actualToBuilderResult = MysqlxCrud.ModifyView.getDefaultInstance().toBuilder();

    // Assert
    MysqlxCrud.FindOrBuilder stmtOrBuilder = actualToBuilderResult.getStmtOrBuilder();
    MysqlxCrud.Collection actualCollection = actualToBuilderResult.getCollection();
    MysqlxCrud.Find actualStmt = actualToBuilderResult.getStmt();
    int actualColumnCount = actualToBuilderResult.getColumnCount();
    String actualToStringResult = actualToBuilderResult.toString();
    MysqlxCrud.ViewCheckOption actualCheck = actualToBuilderResult.getCheck();
    MysqlxCrud.ViewAlgorithm actualAlgorithm = actualToBuilderResult.getAlgorithm();
    MysqlxCrud.ViewSqlSecurity actualSecurity = actualToBuilderResult.getSecurity();
    MysqlxCrud.CollectionOrBuilder collectionOrBuilder = actualToBuilderResult.getCollectionOrBuilder();
    assertEquals("", actualToBuilderResult.getDefiner());
    assertEquals(MysqlxCrud.ViewAlgorithm.UNDEFINED, actualAlgorithm);
    assertEquals(MysqlxCrud.ViewSqlSecurity.INVOKER, actualSecurity);
    assertSame(stmtOrBuilder, actualStmt);
    assertEquals(0, actualColumnCount);
    assertSame(collectionOrBuilder, actualCollection);
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxCrud.ViewCheckOption.LOCAL, actualCheck);
  }

  @Test
  public void newBuilderTest18() {
    // Arrange and Act
    MysqlxCrud.ModifyView.Builder actualNewBuilderResult = MysqlxCrud.ModifyView
        .newBuilder(MysqlxCrud.ModifyView.getDefaultInstance());

    // Assert
    MysqlxCrud.FindOrBuilder stmtOrBuilder = actualNewBuilderResult.getStmtOrBuilder();
    MysqlxCrud.Collection actualCollection = actualNewBuilderResult.getCollection();
    MysqlxCrud.Find actualStmt = actualNewBuilderResult.getStmt();
    int actualColumnCount = actualNewBuilderResult.getColumnCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxCrud.ViewCheckOption actualCheck = actualNewBuilderResult.getCheck();
    MysqlxCrud.ViewAlgorithm actualAlgorithm = actualNewBuilderResult.getAlgorithm();
    MysqlxCrud.ViewSqlSecurity actualSecurity = actualNewBuilderResult.getSecurity();
    MysqlxCrud.CollectionOrBuilder collectionOrBuilder = actualNewBuilderResult.getCollectionOrBuilder();
    assertEquals("", actualNewBuilderResult.getDefiner());
    assertEquals(MysqlxCrud.ViewAlgorithm.UNDEFINED, actualAlgorithm);
    assertEquals(MysqlxCrud.ViewSqlSecurity.INVOKER, actualSecurity);
    assertSame(stmtOrBuilder, actualStmt);
    assertEquals(0, actualColumnCount);
    assertSame(collectionOrBuilder, actualCollection);
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxCrud.ViewCheckOption.LOCAL, actualCheck);
  }

  @Test
  public void newBuilderTest17() {
    // Arrange and Act
    MysqlxCrud.ModifyView.Builder actualNewBuilderResult = MysqlxCrud.ModifyView.newBuilder();

    // Assert
    MysqlxCrud.FindOrBuilder stmtOrBuilder = actualNewBuilderResult.getStmtOrBuilder();
    MysqlxCrud.Collection actualCollection = actualNewBuilderResult.getCollection();
    MysqlxCrud.Find actualStmt = actualNewBuilderResult.getStmt();
    int actualColumnCount = actualNewBuilderResult.getColumnCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxCrud.ViewCheckOption actualCheck = actualNewBuilderResult.getCheck();
    MysqlxCrud.ViewAlgorithm actualAlgorithm = actualNewBuilderResult.getAlgorithm();
    MysqlxCrud.ViewSqlSecurity actualSecurity = actualNewBuilderResult.getSecurity();
    MysqlxCrud.CollectionOrBuilder collectionOrBuilder = actualNewBuilderResult.getCollectionOrBuilder();
    assertEquals("", actualNewBuilderResult.getDefiner());
    assertEquals(MysqlxCrud.ViewAlgorithm.UNDEFINED, actualAlgorithm);
    assertEquals(MysqlxCrud.ViewSqlSecurity.INVOKER, actualSecurity);
    assertSame(stmtOrBuilder, actualStmt);
    assertEquals(0, actualColumnCount);
    assertSame(collectionOrBuilder, actualCollection);
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxCrud.ViewCheckOption.LOCAL, actualCheck);
  }

  @Test
  public void newBuilderForTypeTest9() {
    // Arrange and Act
    MysqlxCrud.ModifyView.Builder actualNewBuilderForTypeResult = MysqlxCrud.ModifyView.getDefaultInstance()
        .newBuilderForType();

    // Assert
    MysqlxCrud.FindOrBuilder stmtOrBuilder = actualNewBuilderForTypeResult.getStmtOrBuilder();
    MysqlxCrud.Collection actualCollection = actualNewBuilderForTypeResult.getCollection();
    MysqlxCrud.Find actualStmt = actualNewBuilderForTypeResult.getStmt();
    int actualColumnCount = actualNewBuilderForTypeResult.getColumnCount();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    MysqlxCrud.ViewCheckOption actualCheck = actualNewBuilderForTypeResult.getCheck();
    MysqlxCrud.ViewAlgorithm actualAlgorithm = actualNewBuilderForTypeResult.getAlgorithm();
    MysqlxCrud.ViewSqlSecurity actualSecurity = actualNewBuilderForTypeResult.getSecurity();
    MysqlxCrud.CollectionOrBuilder collectionOrBuilder = actualNewBuilderForTypeResult.getCollectionOrBuilder();
    assertEquals("", actualNewBuilderForTypeResult.getDefiner());
    assertEquals(MysqlxCrud.ViewAlgorithm.UNDEFINED, actualAlgorithm);
    assertEquals(MysqlxCrud.ViewSqlSecurity.INVOKER, actualSecurity);
    assertSame(stmtOrBuilder, actualStmt);
    assertEquals(0, actualColumnCount);
    assertSame(collectionOrBuilder, actualCollection);
    assertEquals("", actualToStringResult);
    assertEquals(MysqlxCrud.ViewCheckOption.LOCAL, actualCheck);
  }

  @Test
  public void parseFromTest88() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.ModifyView.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest87() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.ModifyView.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest22() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.ModifyView.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest21() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.ModifyView.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest86() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.ModifyView.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest85() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.ModifyView.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest84() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.ModifyView.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest83() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.ModifyView.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest82() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.ModifyView.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest81() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.ModifyView.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest11() {
    // Arrange, Act and Assert
    assertEquals(-587963438, MysqlxCrud.ModifyView.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest11() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.ModifyView.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest11() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.ModifyView.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest11() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.ModifyView.getDefaultInstance().isInitialized());
  }

  @Test
  public void getStmtOrBuilderTest2() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.ModifyView.getDefaultInstance().getStmtOrBuilder() instanceof MysqlxCrud.Find);
  }

  @Test
  public void hasStmtTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.ModifyView.getDefaultInstance().hasStmt());
  }

  @Test
  public void getColumnBytesTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.ModifyView.getDefaultInstance().getColumnBytes(1);
  }

  @Test
  public void getColumnTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.ModifyView.getDefaultInstance().getColumn(1);
  }

  @Test
  public void getColumnCountTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.ModifyView.getDefaultInstance().getColumnCount());
  }

  @Test
  public void getColumnListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.ModifyView.getDefaultInstance().getColumnList().size());
  }

  @Test
  public void getCheckTest2() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.ViewCheckOption.LOCAL, MysqlxCrud.ModifyView.getDefaultInstance().getCheck());
  }

  @Test
  public void hasCheckTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.ModifyView.getDefaultInstance().hasCheck());
  }

  @Test
  public void getSecurityTest2() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.ViewSqlSecurity.INVOKER, MysqlxCrud.ModifyView.getDefaultInstance().getSecurity());
  }

  @Test
  public void hasSecurityTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.ModifyView.getDefaultInstance().hasSecurity());
  }

  @Test
  public void getAlgorithmTest2() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.ViewAlgorithm.UNDEFINED, MysqlxCrud.ModifyView.getDefaultInstance().getAlgorithm());
  }

  @Test
  public void hasAlgorithmTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.ModifyView.getDefaultInstance().hasAlgorithm());
  }

  @Test
  public void getDefinerTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCrud.ModifyView.getDefaultInstance().getDefiner());
  }

  @Test
  public void hasDefinerTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.ModifyView.getDefaultInstance().hasDefiner());
  }

  @Test
  public void getCollectionOrBuilderTest6() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.ModifyView.getDefaultInstance().getCollectionOrBuilder() instanceof MysqlxCrud.Collection);
  }

  @Test
  public void hasCollectionTest6() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.ModifyView.getDefaultInstance().hasCollection());
  }

  @Test
  public void toBuilderTest8() {
    // Arrange and Act
    MysqlxCrud.LimitExpr.Builder actualToBuilderResult = MysqlxCrud.LimitExpr.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    MysqlxExpr.Expr.Builder actualRowCountBuilder = actualToBuilderResult.getRowCountBuilder();
    MysqlxExpr.Expr actualOffset = actualToBuilderResult.getOffset();
    MysqlxExpr.Expr expectedOffset = actualToBuilderResult.getRowCount();
    assertEquals("", actualToStringResult);
    assertSame(actualToBuilderResult.getRowCountOrBuilder(), actualRowCountBuilder);
    assertSame(expectedOffset, actualOffset);
  }

  @Test
  public void newBuilderTest16() {
    // Arrange and Act
    MysqlxCrud.LimitExpr.Builder actualNewBuilderResult = MysqlxCrud.LimitExpr
        .newBuilder(MysqlxCrud.LimitExpr.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxExpr.Expr.Builder actualRowCountBuilder = actualNewBuilderResult.getRowCountBuilder();
    MysqlxExpr.Expr actualOffset = actualNewBuilderResult.getOffset();
    MysqlxExpr.Expr expectedOffset = actualNewBuilderResult.getRowCount();
    assertEquals("", actualToStringResult);
    assertSame(actualNewBuilderResult.getRowCountOrBuilder(), actualRowCountBuilder);
    assertSame(expectedOffset, actualOffset);
  }

  @Test
  public void newBuilderTest15() {
    // Arrange and Act
    MysqlxCrud.LimitExpr.Builder actualNewBuilderResult = MysqlxCrud.LimitExpr.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxExpr.Expr.Builder actualRowCountBuilder = actualNewBuilderResult.getRowCountBuilder();
    MysqlxExpr.Expr actualOffset = actualNewBuilderResult.getOffset();
    MysqlxExpr.Expr expectedOffset = actualNewBuilderResult.getRowCount();
    assertEquals("", actualToStringResult);
    assertSame(actualNewBuilderResult.getRowCountOrBuilder(), actualRowCountBuilder);
    assertSame(expectedOffset, actualOffset);
  }

  @Test
  public void newBuilderForTypeTest8() {
    // Arrange and Act
    MysqlxCrud.LimitExpr.Builder actualNewBuilderForTypeResult = MysqlxCrud.LimitExpr.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    MysqlxExpr.Expr.Builder actualRowCountBuilder = actualNewBuilderForTypeResult.getRowCountBuilder();
    MysqlxExpr.Expr actualOffset = actualNewBuilderForTypeResult.getOffset();
    MysqlxExpr.Expr expectedOffset = actualNewBuilderForTypeResult.getRowCount();
    assertEquals("", actualToStringResult);
    assertSame(actualNewBuilderForTypeResult.getRowCountOrBuilder(), actualRowCountBuilder);
    assertSame(expectedOffset, actualOffset);
  }

  @Test
  public void parseFromTest80() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.LimitExpr.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest79() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.LimitExpr.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest20() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.LimitExpr.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest19() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.LimitExpr.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest78() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.LimitExpr.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest77() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.LimitExpr.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest76() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.LimitExpr.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest75() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.LimitExpr.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest74() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.LimitExpr.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest73() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.LimitExpr.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest10() {
    // Arrange, Act and Assert
    assertEquals(1132129187, MysqlxCrud.LimitExpr.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest10() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.LimitExpr.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest10() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.LimitExpr.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest10() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.LimitExpr.getDefaultInstance().isInitialized());
  }

  @Test
  public void getOffsetOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.LimitExpr.getDefaultInstance().getOffsetOrBuilder() instanceof MysqlxExpr.Expr);
  }

  @Test
  public void hasOffsetTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.LimitExpr.getDefaultInstance().hasOffset());
  }

  @Test
  public void getRowCountOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.LimitExpr.getDefaultInstance().getRowCountOrBuilder() instanceof MysqlxExpr.Expr);
  }

  @Test
  public void hasRowCountTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.LimitExpr.getDefaultInstance().hasRowCount());
  }

  @Test
  public void toBuilderTest7() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCrud.Limit.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest14() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCrud.Limit.newBuilder(MysqlxCrud.Limit.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest13() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCrud.Limit.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest7() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCrud.Limit.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest72() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Limit.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest71() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Limit.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest18() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Limit.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest17() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Limit.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest70() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Limit.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest69() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Limit.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest68() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Limit.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest67() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Limit.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest66() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Limit.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest65() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Limit.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest9() {
    // Arrange, Act and Assert
    assertEquals(47506580, MysqlxCrud.Limit.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest9() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Limit.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest9() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Limit.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest9() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Limit.getDefaultInstance().isInitialized());
  }

  @Test
  public void getOffsetTest() {
    // Arrange, Act and Assert
    assertEquals(0L, MysqlxCrud.Limit.getDefaultInstance().getOffset());
  }

  @Test
  public void hasOffsetTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Limit.getDefaultInstance().hasOffset());
  }

  @Test
  public void getRowCountTest2() {
    // Arrange, Act and Assert
    assertEquals(0L, MysqlxCrud.Limit.getDefaultInstance().getRowCount());
  }

  @Test
  public void hasRowCountTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Limit.getDefaultInstance().hasRowCount());
  }

  @Test
  public void toBuilderTest6() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCrud.Insert.TypedRow.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void newBuilderTest12() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCrud.Insert.TypedRow.newBuilder(MysqlxCrud.Insert.TypedRow.getDefaultInstance()).toString());
  }

  @Test
  public void newBuilderTest11() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCrud.Insert.TypedRow.newBuilder().toString());
  }

  @Test
  public void newBuilderForTypeTest6() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCrud.Insert.TypedRow.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void parseFromTest64() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Insert.TypedRow.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest63() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Insert.TypedRow.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest16() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxCrud.Insert.TypedRow actualParseDelimitedFromResult = MysqlxCrud.Insert.TypedRow.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualFieldCount = actualParseDelimitedFromResult.getFieldCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertEquals(0, actualFieldCount);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseDelimitedFromTest15() throws IOException {
    // Arrange and Act
    MysqlxCrud.Insert.TypedRow actualParseDelimitedFromResult = MysqlxCrud.Insert.TypedRow
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualFieldCount = actualParseDelimitedFromResult.getFieldCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertEquals(0, actualFieldCount);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void parseFromTest62() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Insert.TypedRow.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest61() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Insert.TypedRow.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest60() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Insert.TypedRow.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest59() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Insert.TypedRow.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest58() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Insert.TypedRow.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest57() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Insert.TypedRow.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest8() {
    // Arrange, Act and Assert
    assertEquals(694723270, MysqlxCrud.Insert.TypedRow.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest8() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Insert.TypedRow.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest8() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Insert.TypedRow.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest8() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Insert.TypedRow.getDefaultInstance().isInitialized());
  }

  @Test
  public void getFieldOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Insert.TypedRow.getDefaultInstance().getFieldOrBuilder(1);
  }

  @Test
  public void getFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Insert.TypedRow.getDefaultInstance().getField(1);
  }

  @Test
  public void getFieldCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Insert.TypedRow.getDefaultInstance().getFieldCount());
  }

  @Test
  public void getFieldOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Insert.TypedRow.getDefaultInstance().getFieldOrBuilderList().size());
  }

  @Test
  public void getFieldListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Insert.TypedRow.getDefaultInstance().getFieldList().size());
  }

  @Test
  public void toBuilderTest5() {
    // Arrange and Act
    MysqlxCrud.Insert.Builder actualToBuilderResult = MysqlxCrud.Insert.getDefaultInstance().toBuilder();

    // Assert
    MysqlxCrud.DataModel actualDataModel = actualToBuilderResult.getDataModel();
    int actualRowCount = actualToBuilderResult.getRowCount();
    int actualArgsCount = actualToBuilderResult.getArgsCount();
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals(MysqlxCrud.DataModel.DOCUMENT, actualDataModel);
    assertTrue(actualToBuilderResult.getCollectionOrBuilder() instanceof MysqlxCrud.Collection);
    assertEquals(0, actualArgsCount);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualRowCount);
  }

  @Test
  public void newBuilderTest10() {
    // Arrange and Act
    MysqlxCrud.Insert.Builder actualNewBuilderResult = MysqlxCrud.Insert
        .newBuilder(MysqlxCrud.Insert.getDefaultInstance());

    // Assert
    MysqlxCrud.DataModel actualDataModel = actualNewBuilderResult.getDataModel();
    int actualRowCount = actualNewBuilderResult.getRowCount();
    int actualArgsCount = actualNewBuilderResult.getArgsCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals(MysqlxCrud.DataModel.DOCUMENT, actualDataModel);
    assertTrue(actualNewBuilderResult.getCollectionOrBuilder() instanceof MysqlxCrud.Collection);
    assertEquals(0, actualArgsCount);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualRowCount);
  }

  @Test
  public void newBuilderTest9() {
    // Arrange and Act
    MysqlxCrud.Insert.Builder actualNewBuilderResult = MysqlxCrud.Insert.newBuilder();

    // Assert
    MysqlxCrud.DataModel actualDataModel = actualNewBuilderResult.getDataModel();
    int actualRowCount = actualNewBuilderResult.getRowCount();
    int actualArgsCount = actualNewBuilderResult.getArgsCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals(MysqlxCrud.DataModel.DOCUMENT, actualDataModel);
    assertTrue(actualNewBuilderResult.getCollectionOrBuilder() instanceof MysqlxCrud.Collection);
    assertEquals(0, actualArgsCount);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualRowCount);
  }

  @Test
  public void newBuilderForTypeTest5() {
    // Arrange and Act
    MysqlxCrud.Insert.Builder actualNewBuilderForTypeResult = MysqlxCrud.Insert.getDefaultInstance()
        .newBuilderForType();

    // Assert
    MysqlxCrud.DataModel actualDataModel = actualNewBuilderForTypeResult.getDataModel();
    int actualRowCount = actualNewBuilderForTypeResult.getRowCount();
    int actualArgsCount = actualNewBuilderForTypeResult.getArgsCount();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals(MysqlxCrud.DataModel.DOCUMENT, actualDataModel);
    assertTrue(actualNewBuilderForTypeResult.getCollectionOrBuilder() instanceof MysqlxCrud.Collection);
    assertEquals(0, actualArgsCount);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualRowCount);
  }

  @Test
  public void parseFromTest56() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Insert.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest55() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Insert.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest14() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Insert.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest13() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Insert.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest54() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Insert.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest53() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Insert.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest52() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Insert.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest51() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Insert.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest50() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Insert.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest49() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Insert.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest7() {
    // Arrange, Act and Assert
    assertEquals(-1551515533, MysqlxCrud.Insert.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest7() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Insert.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest7() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Insert.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest7() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Insert.getDefaultInstance().isInitialized());
  }

  @Test
  public void getUpsertTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Insert.getDefaultInstance().getUpsert());
  }

  @Test
  public void hasUpsertTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Insert.getDefaultInstance().hasUpsert());
  }

  @Test
  public void getArgsOrBuilderTest3() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Insert.getDefaultInstance().getArgsOrBuilder(1);
  }

  @Test
  public void getArgsTest3() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Insert.getDefaultInstance().getArgs(1);
  }

  @Test
  public void getArgsCountTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Insert.getDefaultInstance().getArgsCount());
  }

  @Test
  public void getArgsOrBuilderListTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Insert.getDefaultInstance().getArgsOrBuilderList().size());
  }

  @Test
  public void getArgsListTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Insert.getDefaultInstance().getArgsList().size());
  }

  @Test
  public void getRowOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Insert.getDefaultInstance().getRowOrBuilder(1);
  }

  @Test
  public void getRowTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Insert.getDefaultInstance().getRow(1);
  }

  @Test
  public void getRowCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Insert.getDefaultInstance().getRowCount());
  }

  @Test
  public void getRowOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Insert.getDefaultInstance().getRowOrBuilderList().size());
  }

  @Test
  public void getRowListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Insert.getDefaultInstance().getRowList().size());
  }

  @Test
  public void getProjectionOrBuilderTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Insert.getDefaultInstance().getProjectionOrBuilder(1);
  }

  @Test
  public void getProjectionTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Insert.getDefaultInstance().getProjection(1);
  }

  @Test
  public void getProjectionCountTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Insert.getDefaultInstance().getProjectionCount());
  }

  @Test
  public void getProjectionOrBuilderListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Insert.getDefaultInstance().getProjectionOrBuilderList().size());
  }

  @Test
  public void getProjectionListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Insert.getDefaultInstance().getProjectionList().size());
  }

  @Test
  public void getDataModelTest3() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.DataModel.DOCUMENT, MysqlxCrud.Insert.getDefaultInstance().getDataModel());
  }

  @Test
  public void hasDataModelTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Insert.getDefaultInstance().hasDataModel());
  }

  @Test
  public void getCollectionOrBuilderTest5() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Insert.getDefaultInstance().getCollectionOrBuilder() instanceof MysqlxCrud.Collection);
  }

  @Test
  public void hasCollectionTest5() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Insert.getDefaultInstance().hasCollection());
  }

  @Test
  public void valueOfTest6() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Find.RowLockOptions.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest3() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.Find.RowLockOptions.NOWAIT, MysqlxCrud.Find.RowLockOptions.forNumber(1));
  }

  @Test
  public void valueOfTest5() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.Find.RowLockOptions.NOWAIT, MysqlxCrud.Find.RowLockOptions.valueOf(1));
  }

  @Test
  public void getNumberTest3() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxCrud.Find.RowLockOptions.NOWAIT.getNumber());
  }

  @Test
  public void valueOfTest4() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Find.RowLock.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.Find.RowLock.SHARED_LOCK, MysqlxCrud.Find.RowLock.forNumber(1));
  }

  @Test
  public void valueOfTest3() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.Find.RowLock.SHARED_LOCK, MysqlxCrud.Find.RowLock.valueOf(1));
  }

  @Test
  public void getNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxCrud.Find.RowLock.SHARED_LOCK.getNumber());
  }

  @Test
  public void parseFromTest48() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Find.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest47() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Find.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest12() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Find.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest11() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Find.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest46() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Find.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest45() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Find.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest44() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Find.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest43() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Find.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest42() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Find.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest41() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Find.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest6() {
    // Arrange, Act and Assert
    assertEquals(567841571, MysqlxCrud.Find.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest6() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Find.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest6() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Find.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest6() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Find.getDefaultInstance().isInitialized());
  }

  @Test
  public void getLimitExprOrBuilderTest2() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Find.getDefaultInstance().getLimitExprOrBuilder() instanceof MysqlxCrud.LimitExpr);
  }

  @Test
  public void hasLimitExprTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Find.getDefaultInstance().hasLimitExpr());
  }

  @Test
  public void getLimitOrBuilderTest2() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Find.getDefaultInstance().getLimitOrBuilder() instanceof MysqlxCrud.Limit);
  }

  @Test
  public void hasLimitTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Find.getDefaultInstance().hasLimit());
  }

  @Test
  public void getLockingOptionsTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.Find.RowLockOptions.NOWAIT, MysqlxCrud.Find.getDefaultInstance().getLockingOptions());
  }

  @Test
  public void hasLockingOptionsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Find.getDefaultInstance().hasLockingOptions());
  }

  @Test
  public void getLockingTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.Find.RowLock.SHARED_LOCK, MysqlxCrud.Find.getDefaultInstance().getLocking());
  }

  @Test
  public void hasLockingTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Find.getDefaultInstance().hasLocking());
  }

  @Test
  public void getGroupingCriteriaOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Find.getDefaultInstance().getGroupingCriteriaOrBuilder() instanceof MysqlxExpr.Expr);
  }

  @Test
  public void hasGroupingCriteriaTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Find.getDefaultInstance().hasGroupingCriteria());
  }

  @Test
  public void getGroupingOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Find.getDefaultInstance().getGroupingOrBuilder(1);
  }

  @Test
  public void getGroupingTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Find.getDefaultInstance().getGrouping(1);
  }

  @Test
  public void getGroupingCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Find.getDefaultInstance().getGroupingCount());
  }

  @Test
  public void getGroupingOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Find.getDefaultInstance().getGroupingOrBuilderList().size());
  }

  @Test
  public void getGroupingListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Find.getDefaultInstance().getGroupingList().size());
  }

  @Test
  public void getOrderOrBuilderTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Find.getDefaultInstance().getOrderOrBuilder(1);
  }

  @Test
  public void getOrderTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Find.getDefaultInstance().getOrder(1);
  }

  @Test
  public void getOrderCountTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Find.getDefaultInstance().getOrderCount());
  }

  @Test
  public void getOrderOrBuilderListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Find.getDefaultInstance().getOrderOrBuilderList().size());
  }

  @Test
  public void getOrderListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Find.getDefaultInstance().getOrderList().size());
  }

  @Test
  public void getArgsOrBuilderTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Find.getDefaultInstance().getArgsOrBuilder(1);
  }

  @Test
  public void getArgsTest2() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Find.getDefaultInstance().getArgs(1);
  }

  @Test
  public void getArgsCountTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Find.getDefaultInstance().getArgsCount());
  }

  @Test
  public void getArgsOrBuilderListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Find.getDefaultInstance().getArgsOrBuilderList().size());
  }

  @Test
  public void getArgsListTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Find.getDefaultInstance().getArgsList().size());
  }

  @Test
  public void getCriteriaOrBuilderTest2() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Find.getDefaultInstance().getCriteriaOrBuilder() instanceof MysqlxExpr.Expr);
  }

  @Test
  public void hasCriteriaTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Find.getDefaultInstance().hasCriteria());
  }

  @Test
  public void getProjectionOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Find.getDefaultInstance().getProjectionOrBuilder(1);
  }

  @Test
  public void getProjectionTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Find.getDefaultInstance().getProjection(1);
  }

  @Test
  public void getProjectionCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Find.getDefaultInstance().getProjectionCount());
  }

  @Test
  public void getProjectionOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Find.getDefaultInstance().getProjectionOrBuilderList().size());
  }

  @Test
  public void getProjectionListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Find.getDefaultInstance().getProjectionList().size());
  }

  @Test
  public void getDataModelTest2() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.DataModel.DOCUMENT, MysqlxCrud.Find.getDefaultInstance().getDataModel());
  }

  @Test
  public void hasDataModelTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Find.getDefaultInstance().hasDataModel());
  }

  @Test
  public void getCollectionOrBuilderTest4() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Find.getDefaultInstance().getCollectionOrBuilder() instanceof MysqlxCrud.Collection);
  }

  @Test
  public void hasCollectionTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Find.getDefaultInstance().hasCollection());
  }

  @Test
  public void toBuilderTest4() {
    // Arrange and Act
    MysqlxCrud.DropView.Builder actualToBuilderResult = MysqlxCrud.DropView.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    MysqlxCrud.Collection expectedCollectionOrBuilder = actualToBuilderResult.getCollection();
    assertEquals("", actualToStringResult);
    assertSame(expectedCollectionOrBuilder, actualToBuilderResult.getCollectionOrBuilder());
  }

  @Test
  public void newBuilderTest8() {
    // Arrange and Act
    MysqlxCrud.DropView.Builder actualNewBuilderResult = MysqlxCrud.DropView
        .newBuilder(MysqlxCrud.DropView.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxCrud.Collection expectedCollectionOrBuilder = actualNewBuilderResult.getCollection();
    assertEquals("", actualToStringResult);
    assertSame(expectedCollectionOrBuilder, actualNewBuilderResult.getCollectionOrBuilder());
  }

  @Test
  public void newBuilderTest7() {
    // Arrange and Act
    MysqlxCrud.DropView.Builder actualNewBuilderResult = MysqlxCrud.DropView.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxCrud.Collection expectedCollectionOrBuilder = actualNewBuilderResult.getCollection();
    assertEquals("", actualToStringResult);
    assertSame(expectedCollectionOrBuilder, actualNewBuilderResult.getCollectionOrBuilder());
  }

  @Test
  public void newBuilderForTypeTest4() {
    // Arrange and Act
    MysqlxCrud.DropView.Builder actualNewBuilderForTypeResult = MysqlxCrud.DropView.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    MysqlxCrud.Collection expectedCollectionOrBuilder = actualNewBuilderForTypeResult.getCollection();
    assertEquals("", actualToStringResult);
    assertSame(expectedCollectionOrBuilder, actualNewBuilderForTypeResult.getCollectionOrBuilder());
  }

  @Test
  public void parseFromTest40() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.DropView.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest39() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.DropView.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest10() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.DropView.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest9() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.DropView.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest38() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.DropView.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest37() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.DropView.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest36() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.DropView.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest35() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.DropView.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest34() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.DropView.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest33() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.DropView.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest5() {
    // Arrange, Act and Assert
    assertEquals(-1411625907, MysqlxCrud.DropView.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest5() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.DropView.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest5() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.DropView.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest5() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.DropView.getDefaultInstance().isInitialized());
  }

  @Test
  public void getIfExistsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.DropView.getDefaultInstance().getIfExists());
  }

  @Test
  public void hasIfExistsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.DropView.getDefaultInstance().hasIfExists());
  }

  @Test
  public void getCollectionOrBuilderTest3() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.DropView.getDefaultInstance().getCollectionOrBuilder() instanceof MysqlxCrud.Collection);
  }

  @Test
  public void hasCollectionTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.DropView.getDefaultInstance().hasCollection());
  }

  @Test
  public void parseFromTest32() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Delete.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest31() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Delete.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest8() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Delete.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Delete.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest30() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Delete.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest29() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Delete.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest28() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Delete.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest27() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Delete.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest26() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Delete.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest25() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Delete.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest4() {
    // Arrange, Act and Assert
    assertEquals(-1243211068, MysqlxCrud.Delete.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Delete.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void getSerializedSizeTest4() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Delete.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest4() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Delete.getDefaultInstance().isInitialized());
  }

  @Test
  public void getLimitExprOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Delete.getDefaultInstance().getLimitExprOrBuilder() instanceof MysqlxCrud.LimitExpr);
  }

  @Test
  public void hasLimitExprTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Delete.getDefaultInstance().hasLimitExpr());
  }

  @Test
  public void getLimitOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Delete.getDefaultInstance().getLimitOrBuilder() instanceof MysqlxCrud.Limit);
  }

  @Test
  public void hasLimitTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Delete.getDefaultInstance().hasLimit());
  }

  @Test
  public void getOrderOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Delete.getDefaultInstance().getOrderOrBuilder(1);
  }

  @Test
  public void getOrderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Delete.getDefaultInstance().getOrder(1);
  }

  @Test
  public void getOrderCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Delete.getDefaultInstance().getOrderCount());
  }

  @Test
  public void getOrderOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Delete.getDefaultInstance().getOrderOrBuilderList().size());
  }

  @Test
  public void getOrderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Delete.getDefaultInstance().getOrderList().size());
  }

  @Test
  public void getArgsOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Delete.getDefaultInstance().getArgsOrBuilder(1);
  }

  @Test
  public void getArgsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Delete.getDefaultInstance().getArgs(1);
  }

  @Test
  public void getArgsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Delete.getDefaultInstance().getArgsCount());
  }

  @Test
  public void getArgsOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Delete.getDefaultInstance().getArgsOrBuilderList().size());
  }

  @Test
  public void getArgsListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Delete.getDefaultInstance().getArgsList().size());
  }

  @Test
  public void getCriteriaOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Delete.getDefaultInstance().getCriteriaOrBuilder() instanceof MysqlxExpr.Expr);
  }

  @Test
  public void hasCriteriaTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Delete.getDefaultInstance().hasCriteria());
  }

  @Test
  public void getDataModelTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.DataModel.DOCUMENT, MysqlxCrud.Delete.getDefaultInstance().getDataModel());
  }

  @Test
  public void hasDataModelTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Delete.getDefaultInstance().hasDataModel());
  }

  @Test
  public void getCollectionOrBuilderTest2() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Delete.getDefaultInstance().getCollectionOrBuilder() instanceof MysqlxCrud.Collection);
  }

  @Test
  public void hasCollectionTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Delete.getDefaultInstance().hasCollection());
  }

  @Test
  public void valueOfTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.DataModel.valueOf((Descriptors.EnumValueDescriptor) null);
  }

  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.DataModel.DOCUMENT, MysqlxCrud.DataModel.forNumber(1));
  }

  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.DataModel.DOCUMENT, MysqlxCrud.DataModel.valueOf(1));
  }

  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(1, MysqlxCrud.DataModel.DOCUMENT.getNumber());
  }

  @Test
  public void toBuilderTest3() {
    // Arrange and Act
    MysqlxCrud.CreateView.Builder actualToBuilderResult = MysqlxCrud.CreateView.getDefaultInstance().toBuilder();

    // Assert
    MysqlxCrud.FindOrBuilder stmtOrBuilder = actualToBuilderResult.getStmtOrBuilder();
    MysqlxCrud.Collection expectedCollectionOrBuilder = actualToBuilderResult.getCollection();
    int actualColumnCount = actualToBuilderResult.getColumnCount();
    String actualToStringResult = actualToBuilderResult.toString();
    MysqlxCrud.ViewCheckOption actualCheck = actualToBuilderResult.getCheck();
    MysqlxCrud.ViewAlgorithm actualAlgorithm = actualToBuilderResult.getAlgorithm();
    MysqlxCrud.ViewSqlSecurity actualSecurity = actualToBuilderResult.getSecurity();
    MysqlxCrud.CollectionOrBuilder actualCollectionOrBuilder = actualToBuilderResult.getCollectionOrBuilder();
    assertEquals(MysqlxCrud.ViewCheckOption.LOCAL, actualCheck);
    assertEquals(MysqlxCrud.ViewAlgorithm.UNDEFINED, actualAlgorithm);
    assertEquals(MysqlxCrud.ViewSqlSecurity.DEFINER, actualSecurity);
    assertSame(expectedCollectionOrBuilder, actualCollectionOrBuilder);
    assertEquals("", actualToBuilderResult.getDefiner());
    assertTrue(stmtOrBuilder instanceof MysqlxCrud.Find);
    assertEquals(0, actualColumnCount);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderTest6() {
    // Arrange and Act
    MysqlxCrud.CreateView.Builder actualNewBuilderResult = MysqlxCrud.CreateView
        .newBuilder(MysqlxCrud.CreateView.getDefaultInstance());

    // Assert
    MysqlxCrud.FindOrBuilder stmtOrBuilder = actualNewBuilderResult.getStmtOrBuilder();
    MysqlxCrud.Collection expectedCollectionOrBuilder = actualNewBuilderResult.getCollection();
    int actualColumnCount = actualNewBuilderResult.getColumnCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxCrud.ViewCheckOption actualCheck = actualNewBuilderResult.getCheck();
    MysqlxCrud.ViewAlgorithm actualAlgorithm = actualNewBuilderResult.getAlgorithm();
    MysqlxCrud.ViewSqlSecurity actualSecurity = actualNewBuilderResult.getSecurity();
    MysqlxCrud.CollectionOrBuilder actualCollectionOrBuilder = actualNewBuilderResult.getCollectionOrBuilder();
    assertEquals(MysqlxCrud.ViewCheckOption.LOCAL, actualCheck);
    assertEquals(MysqlxCrud.ViewAlgorithm.UNDEFINED, actualAlgorithm);
    assertEquals(MysqlxCrud.ViewSqlSecurity.DEFINER, actualSecurity);
    assertSame(expectedCollectionOrBuilder, actualCollectionOrBuilder);
    assertEquals("", actualNewBuilderResult.getDefiner());
    assertTrue(stmtOrBuilder instanceof MysqlxCrud.Find);
    assertEquals(0, actualColumnCount);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderTest5() {
    // Arrange and Act
    MysqlxCrud.CreateView.Builder actualNewBuilderResult = MysqlxCrud.CreateView.newBuilder();

    // Assert
    MysqlxCrud.FindOrBuilder stmtOrBuilder = actualNewBuilderResult.getStmtOrBuilder();
    MysqlxCrud.Collection expectedCollectionOrBuilder = actualNewBuilderResult.getCollection();
    int actualColumnCount = actualNewBuilderResult.getColumnCount();
    String actualToStringResult = actualNewBuilderResult.toString();
    MysqlxCrud.ViewCheckOption actualCheck = actualNewBuilderResult.getCheck();
    MysqlxCrud.ViewAlgorithm actualAlgorithm = actualNewBuilderResult.getAlgorithm();
    MysqlxCrud.ViewSqlSecurity actualSecurity = actualNewBuilderResult.getSecurity();
    MysqlxCrud.CollectionOrBuilder actualCollectionOrBuilder = actualNewBuilderResult.getCollectionOrBuilder();
    assertEquals(MysqlxCrud.ViewCheckOption.LOCAL, actualCheck);
    assertEquals(MysqlxCrud.ViewAlgorithm.UNDEFINED, actualAlgorithm);
    assertEquals(MysqlxCrud.ViewSqlSecurity.DEFINER, actualSecurity);
    assertSame(expectedCollectionOrBuilder, actualCollectionOrBuilder);
    assertEquals("", actualNewBuilderResult.getDefiner());
    assertTrue(stmtOrBuilder instanceof MysqlxCrud.Find);
    assertEquals(0, actualColumnCount);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderForTypeTest3() {
    // Arrange and Act
    MysqlxCrud.CreateView.Builder actualNewBuilderForTypeResult = MysqlxCrud.CreateView.getDefaultInstance()
        .newBuilderForType();

    // Assert
    MysqlxCrud.FindOrBuilder stmtOrBuilder = actualNewBuilderForTypeResult.getStmtOrBuilder();
    MysqlxCrud.Collection expectedCollectionOrBuilder = actualNewBuilderForTypeResult.getCollection();
    int actualColumnCount = actualNewBuilderForTypeResult.getColumnCount();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    MysqlxCrud.ViewCheckOption actualCheck = actualNewBuilderForTypeResult.getCheck();
    MysqlxCrud.ViewAlgorithm actualAlgorithm = actualNewBuilderForTypeResult.getAlgorithm();
    MysqlxCrud.ViewSqlSecurity actualSecurity = actualNewBuilderForTypeResult.getSecurity();
    MysqlxCrud.CollectionOrBuilder actualCollectionOrBuilder = actualNewBuilderForTypeResult.getCollectionOrBuilder();
    assertEquals(MysqlxCrud.ViewCheckOption.LOCAL, actualCheck);
    assertEquals(MysqlxCrud.ViewAlgorithm.UNDEFINED, actualAlgorithm);
    assertEquals(MysqlxCrud.ViewSqlSecurity.DEFINER, actualSecurity);
    assertSame(expectedCollectionOrBuilder, actualCollectionOrBuilder);
    assertEquals("", actualNewBuilderForTypeResult.getDefiner());
    assertTrue(stmtOrBuilder instanceof MysqlxCrud.Find);
    assertEquals(0, actualColumnCount);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void parseFromTest24() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.CreateView.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest23() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.CreateView.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.CreateView.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.CreateView.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest22() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.CreateView.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest21() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.CreateView.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest20() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.CreateView.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest19() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.CreateView.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest18() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.CreateView.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest17() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.CreateView.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(-1345954676, MysqlxCrud.CreateView.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.CreateView.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest3() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.CreateView.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest3() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.CreateView.getDefaultInstance().isInitialized());
  }

  @Test
  public void getReplaceExistingTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.CreateView.getDefaultInstance().getReplaceExisting());
  }

  @Test
  public void hasReplaceExistingTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.CreateView.getDefaultInstance().hasReplaceExisting());
  }

  @Test
  public void getStmtOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.CreateView.getDefaultInstance().getStmtOrBuilder() instanceof MysqlxCrud.Find);
  }

  @Test
  public void hasStmtTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.CreateView.getDefaultInstance().hasStmt());
  }

  @Test
  public void getColumnBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.CreateView.getDefaultInstance().getColumnBytes(1);
  }

  @Test
  public void getColumnTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.CreateView.getDefaultInstance().getColumn(1);
  }

  @Test
  public void getColumnCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.CreateView.getDefaultInstance().getColumnCount());
  }

  @Test
  public void getColumnListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.CreateView.getDefaultInstance().getColumnList().size());
  }

  @Test
  public void getCheckTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.ViewCheckOption.LOCAL, MysqlxCrud.CreateView.getDefaultInstance().getCheck());
  }

  @Test
  public void hasCheckTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.CreateView.getDefaultInstance().hasCheck());
  }

  @Test
  public void getSecurityTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.ViewSqlSecurity.DEFINER, MysqlxCrud.CreateView.getDefaultInstance().getSecurity());
  }

  @Test
  public void hasSecurityTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.CreateView.getDefaultInstance().hasSecurity());
  }

  @Test
  public void getAlgorithmTest() {
    // Arrange, Act and Assert
    assertEquals(MysqlxCrud.ViewAlgorithm.UNDEFINED, MysqlxCrud.CreateView.getDefaultInstance().getAlgorithm());
  }

  @Test
  public void hasAlgorithmTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.CreateView.getDefaultInstance().hasAlgorithm());
  }

  @Test
  public void getDefinerTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCrud.CreateView.getDefaultInstance().getDefiner());
  }

  @Test
  public void hasDefinerTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.CreateView.getDefaultInstance().hasDefiner());
  }

  @Test
  public void getCollectionOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.CreateView.getDefaultInstance().getCollectionOrBuilder() instanceof MysqlxCrud.Collection);
  }

  @Test
  public void hasCollectionTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.CreateView.getDefaultInstance().hasCollection());
  }

  @Test
  public void toBuilderTest2() {
    // Arrange and Act
    MysqlxCrud.Column.Builder actualToBuilderResult = MysqlxCrud.Column.getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    String actualToStringResult = actualToBuilderResult.toString();
    int actualDocumentPathCount = actualToBuilderResult.getDocumentPathCount();
    assertEquals("", actualName);
    assertEquals("", actualToBuilderResult.getAlias());
    assertEquals("", actualToStringResult);
    assertEquals(0, actualDocumentPathCount);
  }

  @Test
  public void newBuilderTest4() {
    // Arrange and Act
    MysqlxCrud.Column.Builder actualNewBuilderResult = MysqlxCrud.Column
        .newBuilder(MysqlxCrud.Column.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualDocumentPathCount = actualNewBuilderResult.getDocumentPathCount();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.getAlias());
    assertEquals("", actualToStringResult);
    assertEquals(0, actualDocumentPathCount);
  }

  @Test
  public void newBuilderTest3() {
    // Arrange and Act
    MysqlxCrud.Column.Builder actualNewBuilderResult = MysqlxCrud.Column.newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualDocumentPathCount = actualNewBuilderResult.getDocumentPathCount();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.getAlias());
    assertEquals("", actualToStringResult);
    assertEquals(0, actualDocumentPathCount);
  }

  @Test
  public void newBuilderForTypeTest2() {
    // Arrange and Act
    MysqlxCrud.Column.Builder actualNewBuilderForTypeResult = MysqlxCrud.Column.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    int actualDocumentPathCount = actualNewBuilderForTypeResult.getDocumentPathCount();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderForTypeResult.getAlias());
    assertEquals("", actualToStringResult);
    assertEquals(0, actualDocumentPathCount);
  }

  @Test
  public void parseFromTest16() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Column.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest15() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Column.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest4() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act
    MysqlxCrud.Column actualParseDelimitedFromResult = MysqlxCrud.Column.parseDelimitedFrom(input,
        ExtensionRegistryLite.getEmptyRegistry());

    // Assert
    String actualName = actualParseDelimitedFromResult.getName();
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualDocumentPathCount = actualParseDelimitedFromResult.getDocumentPathCount();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualName);
    assertEquals("", actualParseDelimitedFromResult.getAlias());
    assertEquals("", actualToStringResult);
    assertEquals(0, actualDocumentPathCount);
    assertTrue(actualIsInitializedResult);
    assertEquals(0, actualSerializedSize);
  }

  @Test
  public void parseDelimitedFromTest3() throws IOException {
    // Arrange and Act
    MysqlxCrud.Column actualParseDelimitedFromResult = MysqlxCrud.Column
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualName = actualParseDelimitedFromResult.getName();
    String actualToStringResult = actualParseDelimitedFromResult.toString();
    int actualSerializedSize = actualParseDelimitedFromResult.getSerializedSize();
    int actualDocumentPathCount = actualParseDelimitedFromResult.getDocumentPathCount();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualName);
    assertEquals("", actualParseDelimitedFromResult.getAlias());
    assertEquals("", actualToStringResult);
    assertEquals(0, actualDocumentPathCount);
    assertTrue(actualIsInitializedResult);
    assertEquals(0, actualSerializedSize);
  }

  @Test
  public void parseFromTest14() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Column.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest13() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Column.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest12() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Column.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest11() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Column.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest10() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Column.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest9() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Column.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(-746959965, MysqlxCrud.Column.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Column.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Column.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest2() {
    // Arrange, Act and Assert
    assertTrue(MysqlxCrud.Column.getDefaultInstance().isInitialized());
  }

  @Test
  public void getDocumentPathOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Column.getDefaultInstance().getDocumentPathOrBuilder(1);
  }

  @Test
  public void getDocumentPathTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MysqlxCrud.Column.getDefaultInstance().getDocumentPath(1);
  }

  @Test
  public void getDocumentPathCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Column.getDefaultInstance().getDocumentPathCount());
  }

  @Test
  public void getDocumentPathOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Column.getDefaultInstance().getDocumentPathOrBuilderList().size());
  }

  @Test
  public void getDocumentPathListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Column.getDefaultInstance().getDocumentPathList().size());
  }

  @Test
  public void getAliasTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCrud.Column.getDefaultInstance().getAlias());
  }

  @Test
  public void hasAliasTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Column.getDefaultInstance().hasAlias());
  }

  @Test
  public void getNameTest2() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCrud.Column.getDefaultInstance().getName());
  }

  @Test
  public void hasNameTest2() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Column.getDefaultInstance().hasName());
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    MysqlxCrud.Collection.Builder actualToBuilderResult = MysqlxCrud.Collection.getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getSchema());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    MysqlxCrud.Collection.Builder actualNewBuilderResult = MysqlxCrud.Collection
        .newBuilder(MysqlxCrud.Collection.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getSchema());
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    MysqlxCrud.Collection.Builder actualNewBuilderResult = MysqlxCrud.Collection.newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getSchema());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    MysqlxCrud.Collection.Builder actualNewBuilderForTypeResult = MysqlxCrud.Collection.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getSchema());
  }

  @Test
  public void parseFromTest8() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Collection.parseFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Collection.parseFrom((CodedInputStream) null);
  }

  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Collection.parseDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Collection.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest6() throws IOException {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(new byte[24]);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Collection.parseFrom(input, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Collection.parseFrom(new ByteArrayInputStream(new byte[24]));
  }

  @Test
  public void parseFromTest4() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Collection.parseFrom(new byte[24], ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest3() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MysqlxCrud.Collection.parseFrom(new byte[24]);
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Collection.parseFrom((ByteString) null, ExtensionRegistryLite.getEmptyRegistry());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    MysqlxCrud.Collection.parseFrom((ByteString) null);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-1508357969, MysqlxCrud.Collection.getDefaultInstance().hashCode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Collection.getDefaultInstance().equals(""));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MysqlxCrud.Collection.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Collection.getDefaultInstance().isInitialized());
  }

  @Test
  public void getSchemaTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCrud.Collection.getDefaultInstance().getSchema());
  }

  @Test
  public void hasSchemaTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Collection.getDefaultInstance().hasSchema());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("", MysqlxCrud.Collection.getDefaultInstance().getName());
  }

  @Test
  public void hasNameTest() {
    // Arrange, Act and Assert
    assertFalse(MysqlxCrud.Collection.getDefaultInstance().hasName());
  }
}
