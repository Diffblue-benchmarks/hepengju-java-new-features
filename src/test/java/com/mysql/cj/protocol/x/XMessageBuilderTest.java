package com.mysql.cj.protocol.x;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.Message;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxExpect;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import com.mysql.cj.x.protobuf.MysqlxPrepare;
import com.mysql.cj.x.protobuf.MysqlxSession;
import com.mysql.cj.x.protobuf.MysqlxSql;
import com.mysql.cj.xdevapi.CreateIndexParams;
import com.mysql.cj.xdevapi.DbDocImpl;
import com.mysql.cj.xdevapi.DocFilterParams;
import com.mysql.cj.xdevapi.InsertParams;
import com.mysql.cj.xdevapi.JsonValue;
import com.mysql.cj.xdevapi.UpdateParams;
import com.mysql.cj.xdevapi.UpdateSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class XMessageBuilderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildExpectOpenTest() {
    // Arrange and Act
    XMessage actualBuildExpectOpenResult = (new XMessageBuilder()).buildExpectOpen();

    // Assert
    int actualSerializedSize = actualBuildExpectOpenResult.getSerializedSize();
    Message message = actualBuildExpectOpenResult.getMessage();
    List<Notice> actualNotices = actualBuildExpectOpenResult.getNotices();
    boolean actualIsInitializedResult = actualBuildExpectOpenResult.isInitialized();
    assertEquals(9, actualSerializedSize);
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    MysqlxExpect.Open.CtxOperation actualOp = ((MysqlxExpect.Open) message).getOp();
    int actualSerializedSize1 = message.getSerializedSize();
    boolean actualIsInitializedResult1 = message.isInitialized();
    boolean actualHasOpResult = ((MysqlxExpect.Open) message).hasOp();
    String actualInitializationErrorString = message.getInitializationErrorString();
    assertTrue(actualIsInitializedResult);
    assertEquals(9, actualSerializedSize1);
    assertEquals(MysqlxExpect.Open.CtxOperation.EXPECT_CTX_COPY_PREV, actualOp);
    assertEquals("cond {\n  condition_key: 2\n  condition_value: \"6.1\"\n}\n", actualToStringResult);
    assertFalse(actualHasOpResult);
    assertEquals(1, ((MysqlxExpect.Open) message).getCondCount());
    assertEquals("", actualInitializationErrorString);
    assertTrue(actualIsInitializedResult1);
  }

  @Test
  public void buildSessionResetKeepOpenTest() {
    // Arrange and Act
    XMessage actualBuildSessionResetKeepOpenResult = (new XMessageBuilder()).buildSessionResetKeepOpen();

    // Assert
    Message message = actualBuildSessionResetKeepOpenResult.getMessage();
    List<Notice> actualNotices = actualBuildSessionResetKeepOpenResult.getNotices();
    boolean actualIsInitializedResult = actualBuildSessionResetKeepOpenResult.isInitialized();
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    int actualSerializedSize = message.getSerializedSize();
    boolean actualHasKeepOpenResult = ((MysqlxSession.Reset) message).hasKeepOpen();
    boolean actualKeepOpen = ((MysqlxSession.Reset) message).getKeepOpen();
    assertTrue(actualIsInitializedResult);
    assertTrue(message.isInitialized());
    assertTrue(actualKeepOpen);
    assertTrue(actualHasKeepOpenResult);
    assertEquals(2, actualSerializedSize);
    assertEquals("keep_open: true\n", actualToStringResult);
  }

  @Test
  public void buildSessionResetAndCloseTest() {
    // Arrange and Act
    XMessage actualBuildSessionResetAndCloseResult = (new XMessageBuilder()).buildSessionResetAndClose();

    // Assert
    Message message = actualBuildSessionResetAndCloseResult.getMessage();
    List<Notice> actualNotices = actualBuildSessionResetAndCloseResult.getNotices();
    boolean actualIsInitializedResult = actualBuildSessionResetAndCloseResult.isInitialized();
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    int actualSerializedSize = message.getSerializedSize();
    boolean actualHasKeepOpenResult = ((MysqlxSession.Reset) message).hasKeepOpen();
    boolean actualKeepOpen = ((MysqlxSession.Reset) message).getKeepOpen();
    assertTrue(actualIsInitializedResult);
    assertTrue(message.isInitialized());
    assertFalse(actualKeepOpen);
    assertFalse(actualHasKeepOpenResult);
    assertEquals(0, actualSerializedSize);
    assertEquals("", actualToStringResult);
  }

  @Test
  public void buildExternalAuthStartTest() {
    // Arrange and Act
    XMessage actualBuildExternalAuthStartResult = (new XMessageBuilder()).buildExternalAuthStart("*%040x");

    // Assert
    Message message = actualBuildExternalAuthStartResult.getMessage();
    List<Notice> actualNotices = actualBuildExternalAuthStartResult.getNotices();
    boolean actualIsInitializedResult = actualBuildExternalAuthStartResult.isInitialized();
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    int actualSerializedSize = message.getSerializedSize();
    boolean actualHasMechNameResult = ((MysqlxSession.AuthenticateStart) message).hasMechName();
    boolean actualIsInitializedResult1 = message.isInitialized();
    String actualInitializationErrorString = message.getInitializationErrorString();
    assertTrue(actualIsInitializedResult);
    assertTrue(actualIsInitializedResult1);
    assertTrue(actualHasMechNameResult);
    assertEquals(18, actualSerializedSize);
    assertEquals("mech_name: \"EXTERNAL\"\nauth_data: \"*%040x\"\n", actualToStringResult);
    assertEquals("EXTERNAL", ((MysqlxSession.AuthenticateStart) message).getMechName());
    assertEquals("", actualInitializationErrorString);
  }

  @Test
  public void buildPlainAuthStartTest() {
    // Arrange and Act
    XMessage actualBuildPlainAuthStartResult = (new XMessageBuilder()).buildPlainAuthStart("*%040x", "*%040x",
        "*%040x");

    // Assert
    Message message = actualBuildPlainAuthStartResult.getMessage();
    List<Notice> actualNotices = actualBuildPlainAuthStartResult.getNotices();
    boolean actualIsInitializedResult = actualBuildPlainAuthStartResult.isInitialized();
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    int actualSerializedSize = message.getSerializedSize();
    boolean actualHasMechNameResult = ((MysqlxSession.AuthenticateStart) message).hasMechName();
    boolean actualIsInitializedResult1 = message.isInitialized();
    String actualInitializationErrorString = message.getInitializationErrorString();
    assertTrue(actualIsInitializedResult);
    assertTrue(actualIsInitializedResult1);
    assertTrue(actualHasMechNameResult);
    assertEquals(29, actualSerializedSize);
    assertEquals("mech_name: \"PLAIN\"\nauth_data: \"*%040x\\000*%040x\\000*%040x\"\n", actualToStringResult);
    assertEquals("PLAIN", ((MysqlxSession.AuthenticateStart) message).getMechName());
    assertEquals("", actualInitializationErrorString);
  }

  @Test
  public void buildMysql41AuthContinueTest() {
    // Arrange and Act
    XMessage actualBuildMysql41AuthContinueResult = (new XMessageBuilder()).buildMysql41AuthContinue("*%040x", "*%040x",
        new byte[24], "*%040x");

    // Assert
    Message message = actualBuildMysql41AuthContinueResult.getMessage();
    Message.Builder toBuilderResult = actualBuildMysql41AuthContinueResult.toBuilder();
    List<Notice> actualNotices = actualBuildMysql41AuthContinueResult.getNotices();
    boolean actualIsInitializedResult = actualBuildMysql41AuthContinueResult.isInitialized();
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    int actualSerializedSize = message.getSerializedSize();
    boolean actualIsInitializedResult1 = message.isInitialized();
    String actualInitializationErrorString = message.getInitializationErrorString();
    boolean actualHasAuthDataResult = ((MysqlxSession.AuthenticateContinue) message).hasAuthData();
    assertTrue(actualIsInitializedResult);
    assertTrue(actualIsInitializedResult1);
    assertEquals(57, actualSerializedSize);
    assertEquals("auth_data: \"*%040x\\000*%040x\\000*94e6bed909b35709765aac70f3b851c7c4f60141\"\n",
        actualToStringResult);
    assertEquals("", actualInitializationErrorString);
    assertTrue(actualHasAuthDataResult);
    assertEquals("auth_data: \"*%040x\\000*%040x\\000*94e6bed909b35709765aac70f3b851c7c4f60141\"\n",
        ((MysqlxSession.AuthenticateContinue.Builder) toBuilderResult).toString());
  }

  @Test
  public void buildMysql41AuthStartTest() {
    // Arrange and Act
    XMessage actualBuildMysql41AuthStartResult = (new XMessageBuilder()).buildMysql41AuthStart();

    // Assert
    Message message = actualBuildMysql41AuthStartResult.getMessage();
    List<Notice> actualNotices = actualBuildMysql41AuthStartResult.getNotices();
    boolean actualIsInitializedResult = actualBuildMysql41AuthStartResult.isInitialized();
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    int actualSerializedSize = message.getSerializedSize();
    boolean actualHasMechNameResult = ((MysqlxSession.AuthenticateStart) message).hasMechName();
    boolean actualIsInitializedResult1 = message.isInitialized();
    assertTrue(actualIsInitializedResult);
    assertTrue(actualIsInitializedResult1);
    assertTrue(actualHasMechNameResult);
    assertEquals(9, actualSerializedSize);
    assertEquals("mech_name: \"MYSQL41\"\n", actualToStringResult);
    assertEquals("MYSQL41", ((MysqlxSession.AuthenticateStart) message).getMechName());
  }

  @Test
  public void buildSha256MemoryAuthContinueTest() {
    // Arrange and Act
    XMessage actualBuildSha256MemoryAuthContinueResult = (new XMessageBuilder()).buildSha256MemoryAuthContinue("*%040x",
        "*%040x", new byte[24], "*%040x");

    // Assert
    Message message = actualBuildSha256MemoryAuthContinueResult.getMessage();
    Message.Builder toBuilderResult = actualBuildSha256MemoryAuthContinueResult.toBuilder();
    List<Notice> actualNotices = actualBuildSha256MemoryAuthContinueResult.getNotices();
    boolean actualIsInitializedResult = actualBuildSha256MemoryAuthContinueResult.isInitialized();
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    int actualSerializedSize = message.getSerializedSize();
    boolean actualIsInitializedResult1 = message.isInitialized();
    String actualInitializationErrorString = message.getInitializationErrorString();
    boolean actualHasAuthDataResult = ((MysqlxSession.AuthenticateContinue) message).hasAuthData();
    assertTrue(actualIsInitializedResult);
    assertTrue(actualIsInitializedResult1);
    assertEquals(80, actualSerializedSize);
    assertEquals(
        "auth_data: \"*%040x\\000*%040x\\00001d082f503ef5670f72e3a270417238b50f404371b3c6417f3882da2b2459777\"\n",
        actualToStringResult);
    assertEquals("", actualInitializationErrorString);
    assertTrue(actualHasAuthDataResult);
    assertEquals(
        "auth_data: \"*%040x\\000*%040x\\00001d082f503ef5670f72e3a270417238b50f404371b3c6417f3882da2b2459777\"\n",
        ((MysqlxSession.AuthenticateContinue.Builder) toBuilderResult).toString());
  }

  @Test
  public void buildSha256MemoryAuthStartTest() {
    // Arrange and Act
    XMessage actualBuildSha256MemoryAuthStartResult = (new XMessageBuilder()).buildSha256MemoryAuthStart();

    // Assert
    Message message = actualBuildSha256MemoryAuthStartResult.getMessage();
    List<Notice> actualNotices = actualBuildSha256MemoryAuthStartResult.getNotices();
    boolean actualIsInitializedResult = actualBuildSha256MemoryAuthStartResult.isInitialized();
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    int actualSerializedSize = message.getSerializedSize();
    boolean actualHasMechNameResult = ((MysqlxSession.AuthenticateStart) message).hasMechName();
    boolean actualIsInitializedResult1 = message.isInitialized();
    assertTrue(actualIsInitializedResult);
    assertTrue(actualIsInitializedResult1);
    assertTrue(actualHasMechNameResult);
    assertEquals(15, actualSerializedSize);
    assertEquals("mech_name: \"SHA256_MEMORY\"\n", actualToStringResult);
    assertEquals("SHA256_MEMORY", ((MysqlxSession.AuthenticateStart) message).getMechName());
  }

  @Test
  public void buildDropCollectionIndexTest() {
    // Arrange and Act
    XMessage actualBuildDropCollectionIndexResult = (new XMessageBuilder()).buildDropCollectionIndex("*%040x", "*%040x",
        "*%040x");

    // Assert
    int actualSerializedSize = actualBuildDropCollectionIndexResult.getSerializedSize();
    Message message = actualBuildDropCollectionIndexResult.getMessage();
    List<Notice> actualNotices = actualBuildDropCollectionIndexResult.getNotices();
    boolean actualIsInitializedResult = actualBuildDropCollectionIndexResult.isInitialized();
    assertEquals("", actualBuildDropCollectionIndexResult.getInitializationErrorString());
    assertEquals(123, actualSerializedSize);
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    boolean actualHasStmtResult = ((MysqlxSql.StmtExecute) message).hasStmt();
    int actualSerializedSize1 = message.getSerializedSize();
    String actualNamespace = ((MysqlxSql.StmtExecute) message).getNamespace();
    int actualArgsCount = ((MysqlxSql.StmtExecute) message).getArgsCount();
    assertTrue(actualIsInitializedResult);
    assertEquals("mysqlx", actualNamespace);
    assertEquals(123, actualSerializedSize1);
    assertTrue(actualHasStmtResult);
    assertEquals(
        "stmt: \"drop_collection_index\"\nargs {\n  type: OBJECT\n  obj {\n    fld {\n      key: \"name\"\n      value {\n        type: SCALAR\n        scalar {\n          type: V_STRING\n          v_string {\n            value: \"*%040x\"\n          }\n        }\n      }\n    }\n    fld {\n      key: \"collection\"\n      value {\n        type: SCALAR\n        scalar {\n          type: V_STRING\n          v_string {\n            value: \"*%040x\"\n          }\n        }\n      }\n    }\n    fld {\n      key: \"schema\"\n      value {\n        type: SCALAR\n        scalar {\n          type: V_STRING\n          v_string {\n            value: \"*%040x\"\n          }\n        }\n      }\n    }\n  }\n}\nnamespace: \"mysqlx\"\n",
        actualToStringResult);
    assertTrue(message.isInitialized());
    assertEquals(1, actualArgsCount);
  }

  @Test
  public void buildCreateCollectionIndexTest() {
    // Arrange
    XMessageBuilder xMessageBuilder = new XMessageBuilder();
    DbDocImpl dbDocImpl = new DbDocImpl();
    DbDocImpl dbDocImpl1 = new DbDocImpl();
    dbDocImpl1.put("*%040x", null);
    dbDocImpl.put("*%040x", dbDocImpl1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    xMessageBuilder.buildCreateCollectionIndex("*%040x", "*%040x", null);
  }

  @Test
  public void buildListNoticesTest() {
    // Arrange and Act
    XMessage actualBuildListNoticesResult = (new XMessageBuilder()).buildListNotices();

    // Assert
    Message message = actualBuildListNoticesResult.getMessage();
    List<Notice> actualNotices = actualBuildListNoticesResult.getNotices();
    boolean actualIsInitializedResult = actualBuildListNoticesResult.isInitialized();
    assertEquals("", actualBuildListNoticesResult.getInitializationErrorString());
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    boolean actualHasStmtResult = ((MysqlxSql.StmtExecute) message).hasStmt();
    int actualSerializedSize = message.getSerializedSize();
    String actualNamespace = ((MysqlxSql.StmtExecute) message).getNamespace();
    int actualArgsCount = ((MysqlxSql.StmtExecute) message).getArgsCount();
    assertTrue(actualIsInitializedResult);
    assertEquals("mysqlx", actualNamespace);
    assertEquals(22, actualSerializedSize);
    assertTrue(actualHasStmtResult);
    assertEquals("stmt: \"list_notices\"\nnamespace: \"mysqlx\"\n", actualToStringResult);
    assertTrue(message.isInitialized());
    assertEquals(0, actualArgsCount);
  }

  @Test
  public void buildDisableNoticesTest() {
    // Arrange and Act
    XMessage actualBuildDisableNoticesResult = (new XMessageBuilder())
        .buildDisableNotices(new String[]{"*%040x", "*%040x", "*%040x"});

    // Assert
    int actualSerializedSize = actualBuildDisableNoticesResult.getSerializedSize();
    Message message = actualBuildDisableNoticesResult.getMessage();
    List<Notice> actualNotices = actualBuildDisableNoticesResult.getNotices();
    boolean actualIsInitializedResult = actualBuildDisableNoticesResult.isInitialized();
    assertEquals("", actualBuildDisableNoticesResult.getInitializationErrorString());
    assertEquals(101, actualSerializedSize);
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    boolean actualHasStmtResult = ((MysqlxSql.StmtExecute) message).hasStmt();
    int actualSerializedSize1 = message.getSerializedSize();
    String actualNamespace = ((MysqlxSql.StmtExecute) message).getNamespace();
    int actualArgsCount = ((MysqlxSql.StmtExecute) message).getArgsCount();
    assertTrue(actualIsInitializedResult);
    assertEquals("mysqlx", actualNamespace);
    assertEquals(101, actualSerializedSize1);
    assertTrue(actualHasStmtResult);
    assertEquals(
        "stmt: \"disable_notices\"\nargs {\n  type: OBJECT\n  obj {\n    fld {\n      key: \"notice\"\n      value {\n        type: ARRAY\n        array {\n          value {\n            type: SCALAR\n            scalar {\n              type: V_STRING\n              v_string {\n                value: \"*%040x\"\n              }\n            }\n          }\n          value {\n            type: SCALAR\n            scalar {\n              type: V_STRING\n              v_string {\n                value: \"*%040x\"\n              }\n            }\n          }\n          value {\n            type: SCALAR\n            scalar {\n              type: V_STRING\n              v_string {\n                value: \"*%040x\"\n              }\n            }\n          }\n        }\n      }\n    }\n  }\n}\nnamespace: \"mysqlx\"\n",
        actualToStringResult);
    assertTrue(message.isInitialized());
    assertEquals(1, actualArgsCount);
  }

  @Test
  public void buildEnableNoticesTest() {
    // Arrange and Act
    XMessage actualBuildEnableNoticesResult = (new XMessageBuilder())
        .buildEnableNotices(new String[]{"*%040x", "*%040x", "*%040x"});

    // Assert
    int actualSerializedSize = actualBuildEnableNoticesResult.getSerializedSize();
    Message message = actualBuildEnableNoticesResult.getMessage();
    List<Notice> actualNotices = actualBuildEnableNoticesResult.getNotices();
    boolean actualIsInitializedResult = actualBuildEnableNoticesResult.isInitialized();
    assertEquals("", actualBuildEnableNoticesResult.getInitializationErrorString());
    assertEquals(100, actualSerializedSize);
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    int actualSerializedSize1 = message.getSerializedSize();
    String actualNamespace = ((MysqlxSql.StmtExecute) message).getNamespace();
    int actualArgsCount = ((MysqlxSql.StmtExecute) message).getArgsCount();
    boolean actualIsInitializedResult1 = message.isInitialized();
    assertTrue(actualIsInitializedResult);
    assertEquals("mysqlx", actualNamespace);
    assertEquals(100, actualSerializedSize1);
    assertEquals(
        "stmt: \"enable_notices\"\nargs {\n  type: OBJECT\n  obj {\n    fld {\n      key: \"notice\"\n      value {\n        type: ARRAY\n        array {\n          value {\n            type: SCALAR\n            scalar {\n              type: V_STRING\n              v_string {\n                value: \"*%040x\"\n              }\n            }\n          }\n          value {\n            type: SCALAR\n            scalar {\n              type: V_STRING\n              v_string {\n                value: \"*%040x\"\n              }\n            }\n          }\n          value {\n            type: SCALAR\n            scalar {\n              type: V_STRING\n              v_string {\n                value: \"*%040x\"\n              }\n            }\n          }\n        }\n      }\n    }\n  }\n}\nnamespace: \"mysqlx\"\n",
        actualToStringResult);
    assertTrue(actualIsInitializedResult1);
    assertFalse(((MysqlxSql.StmtExecute) message).hasCompactMetadata());
    assertEquals(1, actualArgsCount);
  }

  @Test
  public void buildListObjectsTest() {
    // Arrange and Act
    XMessage actualBuildListObjectsResult = (new XMessageBuilder()).buildListObjects("*%040x", "*%040x");

    // Assert
    int actualSerializedSize = actualBuildListObjectsResult.getSerializedSize();
    Message message = actualBuildListObjectsResult.getMessage();
    List<Notice> actualNotices = actualBuildListObjectsResult.getNotices();
    boolean actualIsInitializedResult = actualBuildListObjectsResult.isInitialized();
    assertEquals("", actualBuildListObjectsResult.getInitializationErrorString());
    assertEquals(85, actualSerializedSize);
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    boolean actualHasStmtResult = ((MysqlxSql.StmtExecute) message).hasStmt();
    int actualSerializedSize1 = message.getSerializedSize();
    String actualNamespace = ((MysqlxSql.StmtExecute) message).getNamespace();
    int actualArgsCount = ((MysqlxSql.StmtExecute) message).getArgsCount();
    assertTrue(actualIsInitializedResult);
    assertEquals("mysqlx", actualNamespace);
    assertEquals(85, actualSerializedSize1);
    assertTrue(actualHasStmtResult);
    assertEquals(
        "stmt: \"list_objects\"\nargs {\n  type: OBJECT\n  obj {\n    fld {\n      key: \"schema\"\n      value {\n        type: SCALAR\n        scalar {\n          type: V_STRING\n          v_string {\n            value: \"*%040x\"\n          }\n        }\n      }\n    }\n    fld {\n      key: \"pattern\"\n      value {\n        type: SCALAR\n        scalar {\n          type: V_STRING\n          v_string {\n            value: \"*%040x\"\n          }\n        }\n      }\n    }\n  }\n}\nnamespace: \"mysqlx\"\n",
        actualToStringResult);
    assertTrue(message.isInitialized());
    assertEquals(1, actualArgsCount);
  }

  @Test
  public void buildCloseTest() {
    // Arrange and Act
    XMessage actualBuildCloseResult = (new XMessageBuilder()).buildClose();

    // Assert
    List<Notice> actualNotices = actualBuildCloseResult.getNotices();
    assertNull(actualNotices);
    assertTrue(actualBuildCloseResult.isInitialized());
  }

  @Test
  public void buildDropCollectionTest() {
    // Arrange and Act
    XMessage actualBuildDropCollectionResult = (new XMessageBuilder()).buildDropCollection("*%040x", "*%040x");

    // Assert
    int actualSerializedSize = actualBuildDropCollectionResult.getSerializedSize();
    Message message = actualBuildDropCollectionResult.getMessage();
    List<Notice> actualNotices = actualBuildDropCollectionResult.getNotices();
    boolean actualIsInitializedResult = actualBuildDropCollectionResult.isInitialized();
    assertEquals("", actualBuildDropCollectionResult.getInitializationErrorString());
    assertEquals(85, actualSerializedSize);
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    boolean actualHasStmtResult = ((MysqlxSql.StmtExecute) message).hasStmt();
    int actualSerializedSize1 = message.getSerializedSize();
    String actualNamespace = ((MysqlxSql.StmtExecute) message).getNamespace();
    int actualArgsCount = ((MysqlxSql.StmtExecute) message).getArgsCount();
    assertTrue(actualIsInitializedResult);
    assertEquals("mysqlx", actualNamespace);
    assertEquals(85, actualSerializedSize1);
    assertTrue(actualHasStmtResult);
    assertEquals(
        "stmt: \"drop_collection\"\nargs {\n  type: OBJECT\n  obj {\n    fld {\n      key: \"name\"\n      value {\n        type: SCALAR\n        scalar {\n          type: V_STRING\n          v_string {\n            value: \"*%040x\"\n          }\n        }\n      }\n    }\n    fld {\n      key: \"schema\"\n      value {\n        type: SCALAR\n        scalar {\n          type: V_STRING\n          v_string {\n            value: \"*%040x\"\n          }\n        }\n      }\n    }\n  }\n}\nnamespace: \"mysqlx\"\n",
        actualToStringResult);
    assertTrue(message.isInitialized());
    assertEquals(1, actualArgsCount);
  }

  @Test
  public void buildCreateCollectionTest() {
    // Arrange and Act
    XMessage actualBuildCreateCollectionResult = (new XMessageBuilder()).buildCreateCollection("*%040x", "*%040x");

    // Assert
    int actualSerializedSize = actualBuildCreateCollectionResult.getSerializedSize();
    Message message = actualBuildCreateCollectionResult.getMessage();
    List<Notice> actualNotices = actualBuildCreateCollectionResult.getNotices();
    boolean actualIsInitializedResult = actualBuildCreateCollectionResult.isInitialized();
    assertEquals("", actualBuildCreateCollectionResult.getInitializationErrorString());
    assertEquals(87, actualSerializedSize);
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    boolean actualHasStmtResult = ((MysqlxSql.StmtExecute) message).hasStmt();
    int actualSerializedSize1 = message.getSerializedSize();
    String actualNamespace = ((MysqlxSql.StmtExecute) message).getNamespace();
    int actualArgsCount = ((MysqlxSql.StmtExecute) message).getArgsCount();
    assertTrue(actualIsInitializedResult);
    assertEquals("mysqlx", actualNamespace);
    assertEquals(87, actualSerializedSize1);
    assertTrue(actualHasStmtResult);
    assertEquals(
        "stmt: \"create_collection\"\nargs {\n  type: OBJECT\n  obj {\n    fld {\n      key: \"name\"\n      value {\n        type: SCALAR\n        scalar {\n          type: V_STRING\n          v_string {\n            value: \"*%040x\"\n          }\n        }\n      }\n    }\n    fld {\n      key: \"schema\"\n      value {\n        type: SCALAR\n        scalar {\n          type: V_STRING\n          v_string {\n            value: \"*%040x\"\n          }\n        }\n      }\n    }\n  }\n}\nnamespace: \"mysqlx\"\n",
        actualToStringResult);
    assertTrue(message.isInitialized());
    assertEquals(1, actualArgsCount);
  }

  @Test
  public void buildPrepareDeallocateTest() {
    // Arrange and Act
    XMessage actualBuildPrepareDeallocateResult = (new XMessageBuilder()).buildPrepareDeallocate(1);

    // Assert
    Message message = actualBuildPrepareDeallocateResult.getMessage();
    List<Notice> actualNotices = actualBuildPrepareDeallocateResult.getNotices();
    boolean actualIsInitializedResult = actualBuildPrepareDeallocateResult.isInitialized();
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    boolean actualHasStmtIdResult = ((MysqlxPrepare.Deallocate) message).hasStmtId();
    int actualSerializedSize = message.getSerializedSize();
    int actualStmtId = ((MysqlxPrepare.Deallocate) message).getStmtId();
    assertTrue(actualIsInitializedResult);
    assertTrue(message.isInitialized());
    assertEquals(1, actualStmtId);
    assertEquals(2, actualSerializedSize);
    assertTrue(actualHasStmtIdResult);
    assertEquals("stmt_id: 1\n", actualToStringResult);
  }

  @Test
  public void buildPrepareExecuteTest() {
    // Arrange
    XMessageBuilder xMessageBuilder = new XMessageBuilder();

    // Act
    XMessage actualBuildPrepareExecuteResult = xMessageBuilder.buildPrepareExecute(1,
        new DocFilterParams("*%040x", "*%040x"));

    // Assert
    Message message = actualBuildPrepareExecuteResult.getMessage();
    List<Notice> actualNotices = actualBuildPrepareExecuteResult.getNotices();
    boolean actualIsInitializedResult = actualBuildPrepareExecuteResult.isInitialized();
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    boolean actualHasStmtIdResult = ((MysqlxPrepare.Execute) message).hasStmtId();
    int actualSerializedSize = message.getSerializedSize();
    int actualArgsCount = ((MysqlxPrepare.Execute) message).getArgsCount();
    int actualStmtId = ((MysqlxPrepare.Execute) message).getStmtId();
    boolean actualIsInitializedResult1 = message.isInitialized();
    assertTrue(actualIsInitializedResult);
    assertEquals(1, actualStmtId);
    assertEquals(0, actualArgsCount);
    assertEquals(2, actualSerializedSize);
    assertTrue(actualHasStmtIdResult);
    assertEquals("stmt_id: 1\n", actualToStringResult);
    assertTrue(actualIsInitializedResult1);
    assertFalse(((MysqlxPrepare.Execute) message).getCompactMetadata());
  }

  @Test
  public void buildPrepareSqlStatementTest() {
    // Arrange and Act
    XMessage actualBuildPrepareSqlStatementResult = (new XMessageBuilder()).buildPrepareSqlStatement(1, "*%040x");

    // Assert
    int actualSerializedSize = actualBuildPrepareSqlStatementResult.getSerializedSize();
    Message message = actualBuildPrepareSqlStatementResult.getMessage();
    Message.Builder toBuilderResult = actualBuildPrepareSqlStatementResult.toBuilder();
    List<Notice> actualNotices = actualBuildPrepareSqlStatementResult.getNotices();
    boolean actualIsInitializedResult = actualBuildPrepareSqlStatementResult.isInitialized();
    assertEquals(16, actualSerializedSize);
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    boolean actualHasStmtResult = ((MysqlxPrepare.Prepare) message).hasStmt();
    int actualSerializedSize1 = message.getSerializedSize();
    int actualStmtId = ((MysqlxPrepare.Prepare) message).getStmtId();
    boolean actualIsInitializedResult1 = message.isInitialized();
    String actualInitializationErrorString = message.getInitializationErrorString();
    assertTrue(actualIsInitializedResult);
    assertEquals(1, actualStmtId);
    assertEquals(16, actualSerializedSize1);
    assertTrue(actualHasStmtResult);
    assertEquals("stmt_id: 1\nstmt {\n  type: STMT\n  stmt_execute {\n    stmt: \"*%040x\"\n  }\n}\n",
        actualToStringResult);
    assertTrue(actualIsInitializedResult1);
    assertEquals("", actualInitializationErrorString);
    assertEquals("stmt_id: 1\nstmt {\n  type: STMT\n  stmt_execute {\n    stmt: \"*%040x\"\n  }\n}\n",
        ((MysqlxPrepare.Prepare.Builder) toBuilderResult).toString());
  }

  @Test
  public void buildSqlStatementTest2() {
    // Arrange and Act
    XMessage actualBuildSqlStatementResult = (new XMessageBuilder()).buildSqlStatement("*%040x", null);

    // Assert
    Message message = actualBuildSqlStatementResult.getMessage();
    List<Notice> actualNotices = actualBuildSqlStatementResult.getNotices();
    boolean actualIsInitializedResult = actualBuildSqlStatementResult.isInitialized();
    assertEquals("", actualBuildSqlStatementResult.getInitializationErrorString());
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    boolean actualHasStmtResult = ((MysqlxSql.StmtExecute) message).hasStmt();
    int actualSerializedSize = message.getSerializedSize();
    String actualNamespace = ((MysqlxSql.StmtExecute) message).getNamespace();
    int actualArgsCount = ((MysqlxSql.StmtExecute) message).getArgsCount();
    assertTrue(actualIsInitializedResult);
    assertEquals("sql", actualNamespace);
    assertEquals(8, actualSerializedSize);
    assertTrue(actualHasStmtResult);
    assertEquals("stmt: \"*%040x\"\n", actualToStringResult);
    assertTrue(message.isInitialized());
    assertEquals(0, actualArgsCount);
  }

  @Test
  public void buildSqlStatementTest() {
    // Arrange and Act
    XMessage actualBuildSqlStatementResult = (new XMessageBuilder()).buildSqlStatement("*%040x");

    // Assert
    Message message = actualBuildSqlStatementResult.getMessage();
    List<Notice> actualNotices = actualBuildSqlStatementResult.getNotices();
    boolean actualIsInitializedResult = actualBuildSqlStatementResult.isInitialized();
    assertEquals("", actualBuildSqlStatementResult.getInitializationErrorString());
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    boolean actualHasStmtResult = ((MysqlxSql.StmtExecute) message).hasStmt();
    int actualSerializedSize = message.getSerializedSize();
    String actualNamespace = ((MysqlxSql.StmtExecute) message).getNamespace();
    int actualArgsCount = ((MysqlxSql.StmtExecute) message).getArgsCount();
    assertTrue(actualIsInitializedResult);
    assertEquals("sql", actualNamespace);
    assertEquals(8, actualSerializedSize);
    assertTrue(actualHasStmtResult);
    assertEquals("stmt: \"*%040x\"\n", actualToStringResult);
    assertTrue(message.isInitialized());
    assertEquals(0, actualArgsCount);
  }

  @Test
  public void buildPrepareDeleteTest() {
    // Arrange
    XMessageBuilder xMessageBuilder = new XMessageBuilder();

    // Act
    XMessage actualBuildPrepareDeleteResult = xMessageBuilder.buildPrepareDelete(1,
        new DocFilterParams("*%040x", "*%040x"));

    // Assert
    int actualSerializedSize = actualBuildPrepareDeleteResult.getSerializedSize();
    Message message = actualBuildPrepareDeleteResult.getMessage();
    Message.Builder toBuilderResult = actualBuildPrepareDeleteResult.toBuilder();
    List<Notice> actualNotices = actualBuildPrepareDeleteResult.getNotices();
    boolean actualIsInitializedResult = actualBuildPrepareDeleteResult.isInitialized();
    assertEquals(26, actualSerializedSize);
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    boolean actualHasStmtResult = ((MysqlxPrepare.Prepare) message).hasStmt();
    int actualSerializedSize1 = message.getSerializedSize();
    int actualStmtId = ((MysqlxPrepare.Prepare) message).getStmtId();
    boolean actualIsInitializedResult1 = message.isInitialized();
    String actualInitializationErrorString = message.getInitializationErrorString();
    assertTrue(actualIsInitializedResult);
    assertEquals(1, actualStmtId);
    assertEquals(26, actualSerializedSize1);
    assertTrue(actualHasStmtResult);
    assertEquals(
        "stmt_id: 1\nstmt {\n  type: DELETE\n  delete {\n    collection {\n      name: \"*%040x\"\n      schema: \"*%040x\"\n    }\n  }\n}\n",
        actualToStringResult);
    assertTrue(actualIsInitializedResult1);
    assertEquals("", actualInitializationErrorString);
    assertEquals(
        "stmt_id: 1\nstmt {\n  type: DELETE\n  delete {\n    collection {\n      name: \"*%040x\"\n      schema: \"*%040x\"\n    }\n  }\n}\n",
        ((MysqlxPrepare.Prepare.Builder) toBuilderResult).toString());
  }

  @Test
  public void buildDeleteTest() {
    // Arrange
    XMessageBuilder xMessageBuilder = new XMessageBuilder();

    // Act
    XMessage actualBuildDeleteResult = xMessageBuilder.buildDelete(new DocFilterParams("*%040x", "*%040x"));

    // Assert
    int actualSerializedSize = actualBuildDeleteResult.getSerializedSize();
    Message message = actualBuildDeleteResult.getMessage();
    List<Notice> actualNotices = actualBuildDeleteResult.getNotices();
    boolean actualIsInitializedResult = actualBuildDeleteResult.isInitialized();
    assertEquals("", actualBuildDeleteResult.getInitializationErrorString());
    assertEquals(18, actualSerializedSize);
    assertNull(actualNotices);
    MysqlxCrud.DataModel actualDataModel = ((MysqlxCrud.Delete) message).getDataModel();
    int actualSerializedSize1 = message.getSerializedSize();
    int actualOrderCount = ((MysqlxCrud.Delete) message).getOrderCount();
    MysqlxCrud.Limit actualLimit = ((MysqlxCrud.Delete) message).getLimit();
    MysqlxExpr.Expr expectedCriteriaOrBuilder = ((MysqlxCrud.Delete) message).getCriteria();
    MysqlxCrud.LimitOrBuilder limitOrBuilder = ((MysqlxCrud.Delete) message).getLimitOrBuilder();
    boolean actualHasLimitExprResult = ((MysqlxCrud.Delete) message).hasLimitExpr();
    int actualArgsCount = ((MysqlxCrud.Delete) message).getArgsCount();
    assertTrue(actualIsInitializedResult);
    assertFalse(actualHasLimitExprResult);
    assertSame(limitOrBuilder, actualLimit);
    assertEquals(0, actualOrderCount);
    assertEquals(18, actualSerializedSize1);
    assertEquals(MysqlxCrud.DataModel.DOCUMENT, actualDataModel);
    assertSame(expectedCriteriaOrBuilder, ((MysqlxCrud.Delete) message).getCriteriaOrBuilder());
    assertEquals(0, actualArgsCount);
  }

  @Test
  public void buildPrepareFindTest() {
    // Arrange
    XMessageBuilder xMessageBuilder = new XMessageBuilder();

    // Act
    XMessage actualBuildPrepareFindResult = xMessageBuilder.buildPrepareFind(1,
        new DocFilterParams("*%040x", "*%040x"));

    // Assert
    int actualSerializedSize = actualBuildPrepareFindResult.getSerializedSize();
    Message message = actualBuildPrepareFindResult.getMessage();
    Message.Builder toBuilderResult = actualBuildPrepareFindResult.toBuilder();
    List<Notice> actualNotices = actualBuildPrepareFindResult.getNotices();
    boolean actualIsInitializedResult = actualBuildPrepareFindResult.isInitialized();
    assertEquals(28, actualSerializedSize);
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    boolean actualHasStmtResult = ((MysqlxPrepare.Prepare) message).hasStmt();
    int actualSerializedSize1 = message.getSerializedSize();
    int actualStmtId = ((MysqlxPrepare.Prepare) message).getStmtId();
    boolean actualIsInitializedResult1 = message.isInitialized();
    String actualInitializationErrorString = message.getInitializationErrorString();
    assertTrue(actualIsInitializedResult);
    assertEquals(1, actualStmtId);
    assertEquals(28, actualSerializedSize1);
    assertTrue(actualHasStmtResult);
    assertEquals(
        "stmt_id: 1\nstmt {\n  type: FIND\n  find {\n    collection {\n      name: \"*%040x\"\n      schema: \"*%040x\"\n    }\n    data_model: DOCUMENT\n  }\n}\n",
        actualToStringResult);
    assertTrue(actualIsInitializedResult1);
    assertEquals("", actualInitializationErrorString);
    assertEquals(
        "stmt_id: 1\nstmt {\n  type: FIND\n  find {\n    collection {\n      name: \"*%040x\"\n      schema: \"*%040x\"\n    }\n    data_model: DOCUMENT\n  }\n}\n",
        ((MysqlxPrepare.Prepare.Builder) toBuilderResult).toString());
  }

  @Test
  public void buildFindTest() {
    // Arrange
    XMessageBuilder xMessageBuilder = new XMessageBuilder();

    // Act
    XMessage actualBuildFindResult = xMessageBuilder.buildFind(new DocFilterParams("*%040x", "*%040x"));

    // Assert
    int actualSerializedSize = actualBuildFindResult.getSerializedSize();
    Message message = actualBuildFindResult.getMessage();
    List<Notice> actualNotices = actualBuildFindResult.getNotices();
    boolean actualIsInitializedResult = actualBuildFindResult.isInitialized();
    assertEquals("", actualBuildFindResult.getInitializationErrorString());
    assertEquals(20, actualSerializedSize);
    assertNull(actualNotices);
    boolean actualHasGroupingCriteriaResult = ((MysqlxCrud.Find) message).hasGroupingCriteria();
    MysqlxCrud.DataModel actualDataModel = ((MysqlxCrud.Find) message).getDataModel();
    int actualSerializedSize1 = message.getSerializedSize();
    int actualOrderCount = ((MysqlxCrud.Find) message).getOrderCount();
    MysqlxCrud.Limit actualLimit = ((MysqlxCrud.Find) message).getLimit();
    MysqlxExpr.Expr expectedGroupingCriteria = ((MysqlxCrud.Find) message).getCriteria();
    MysqlxCrud.LimitOrBuilder limitOrBuilder = ((MysqlxCrud.Find) message).getLimitOrBuilder();
    int actualArgsCount = ((MysqlxCrud.Find) message).getArgsCount();
    assertTrue(actualIsInitializedResult);
    assertSame(limitOrBuilder, actualLimit);
    assertEquals(0, actualOrderCount);
    assertEquals(20, actualSerializedSize1);
    assertEquals(MysqlxCrud.DataModel.DOCUMENT, actualDataModel);
    assertFalse(actualHasGroupingCriteriaResult);
    assertEquals(0, actualArgsCount);
    assertSame(expectedGroupingCriteria, ((MysqlxCrud.Find) message).getGroupingCriteria());
  }

  @Test
  public void buildPrepareRowUpdateTest() {
    // Arrange
    XMessageBuilder xMessageBuilder = new XMessageBuilder();
    DocFilterParams filterParams = new DocFilterParams("*%040x", "*%040x");

    // Act
    XMessage actualBuildPrepareRowUpdateResult = xMessageBuilder.buildPrepareRowUpdate(1, filterParams,
        new UpdateParams());

    // Assert
    int actualSerializedSize = actualBuildPrepareRowUpdateResult.getSerializedSize();
    Message message = actualBuildPrepareRowUpdateResult.getMessage();
    Message.Builder toBuilderResult = actualBuildPrepareRowUpdateResult.toBuilder();
    List<Notice> actualNotices = actualBuildPrepareRowUpdateResult.getNotices();
    boolean actualIsInitializedResult = actualBuildPrepareRowUpdateResult.isInitialized();
    assertEquals(28, actualSerializedSize);
    assertNull(actualNotices);
    String actualToStringResult = message.toString();
    boolean actualHasStmtResult = ((MysqlxPrepare.Prepare) message).hasStmt();
    int actualSerializedSize1 = message.getSerializedSize();
    int actualStmtId = ((MysqlxPrepare.Prepare) message).getStmtId();
    boolean actualIsInitializedResult1 = message.isInitialized();
    String actualInitializationErrorString = message.getInitializationErrorString();
    assertTrue(actualIsInitializedResult);
    assertEquals(1, actualStmtId);
    assertEquals(28, actualSerializedSize1);
    assertTrue(actualHasStmtResult);
    assertEquals(
        "stmt_id: 1\nstmt {\n  type: UPDATE\n  update {\n    collection {\n      name: \"*%040x\"\n      schema: \"*%040x\"\n    }\n    data_model: TABLE\n  }\n}\n",
        actualToStringResult);
    assertTrue(actualIsInitializedResult1);
    assertEquals("", actualInitializationErrorString);
    assertEquals(
        "stmt_id: 1\nstmt {\n  type: UPDATE\n  update {\n    collection {\n      name: \"*%040x\"\n      schema: \"*%040x\"\n    }\n    data_model: TABLE\n  }\n}\n",
        ((MysqlxPrepare.Prepare.Builder) toBuilderResult).toString());
  }

  @Test
  public void buildRowUpdateTest() {
    // Arrange
    XMessageBuilder xMessageBuilder = new XMessageBuilder();
    DocFilterParams filterParams = new DocFilterParams("*%040x", "*%040x");

    // Act
    XMessage actualBuildRowUpdateResult = xMessageBuilder.buildRowUpdate(filterParams, new UpdateParams());

    // Assert
    int actualSerializedSize = actualBuildRowUpdateResult.getSerializedSize();
    Message message = actualBuildRowUpdateResult.getMessage();
    List<Notice> actualNotices = actualBuildRowUpdateResult.getNotices();
    boolean actualIsInitializedResult = actualBuildRowUpdateResult.isInitialized();
    assertEquals("", actualBuildRowUpdateResult.getInitializationErrorString());
    assertEquals(20, actualSerializedSize);
    assertNull(actualNotices);
    MysqlxCrud.DataModel actualDataModel = ((MysqlxCrud.Update) message).getDataModel();
    int actualSerializedSize1 = message.getSerializedSize();
    int actualOrderCount = ((MysqlxCrud.Update) message).getOrderCount();
    MysqlxCrud.Limit actualLimit = ((MysqlxCrud.Update) message).getLimit();
    MysqlxCrud.LimitOrBuilder limitOrBuilder = ((MysqlxCrud.Update) message).getLimitOrBuilder();
    boolean actualHasLimitExprResult = ((MysqlxCrud.Update) message).hasLimitExpr();
    int actualArgsCount = ((MysqlxCrud.Update) message).getArgsCount();
    assertTrue(actualIsInitializedResult);
    assertSame(limitOrBuilder, actualLimit);
    assertEquals(0, actualOrderCount);
    assertEquals(20, actualSerializedSize1);
    assertEquals(MysqlxCrud.DataModel.TABLE, actualDataModel);
    assertEquals(0, actualArgsCount);
    assertEquals(0, ((MysqlxCrud.Update) message).getOperationCount());
    assertFalse(actualHasLimitExprResult);
  }

  @Test
  public void buildPrepareDocUpdateTest() {
    // Arrange
    XMessageBuilder xMessageBuilder = new XMessageBuilder();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    xMessageBuilder.buildPrepareDocUpdate(1, new DocFilterParams("*%040x", "*%040x"), null);
  }

  @Test
  public void buildDocUpdateTest() {
    // Arrange
    XMessageBuilder xMessageBuilder = new XMessageBuilder();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    xMessageBuilder.buildDocUpdate(new DocFilterParams("*%040x", "*%040x"), null);
  }

  @Test
  public void buildRowInsertTest() {
    // Arrange
    XMessageBuilder xMessageBuilder = new XMessageBuilder();

    // Act
    XMessage actualBuildRowInsertResult = xMessageBuilder.buildRowInsert("*%040x", "*%040x", new InsertParams());

    // Assert
    int actualSerializedSize = actualBuildRowInsertResult.getSerializedSize();
    Message message = actualBuildRowInsertResult.getMessage();
    List<Notice> actualNotices = actualBuildRowInsertResult.getNotices();
    boolean actualIsInitializedResult = actualBuildRowInsertResult.isInitialized();
    assertEquals("", actualBuildRowInsertResult.getInitializationErrorString());
    assertEquals(20, actualSerializedSize);
    assertNull(actualNotices);
    MysqlxCrud.DataModel actualDataModel = ((MysqlxCrud.Insert) message).getDataModel();
    int actualSerializedSize1 = message.getSerializedSize();
    int actualRowCount = ((MysqlxCrud.Insert) message).getRowCount();
    int actualArgsCount = ((MysqlxCrud.Insert) message).getArgsCount();
    boolean actualHasCollectionResult = ((MysqlxCrud.Insert) message).hasCollection();
    boolean actualUpsert = ((MysqlxCrud.Insert) message).getUpsert();
    assertTrue(actualIsInitializedResult);
    assertTrue(actualHasCollectionResult);
    assertEquals(0, actualArgsCount);
    assertEquals(0, actualRowCount);
    assertEquals(20, actualSerializedSize1);
    assertEquals(MysqlxCrud.DataModel.TABLE, actualDataModel);
    assertFalse(actualUpsert);
    assertEquals("collection {\n  name: \"*%040x\"\n  schema: \"*%040x\"\n}\ndata_model: TABLE\n", message.toString());
  }

  @Test
  public void buildDocInsertTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessageBuilder()).buildDocInsert("*%040x", "*%040x", null, true);
  }

  @Test
  public void buildCapabilitiesSetTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new XMessageBuilder()).buildCapabilitiesSet(null);
  }

  @Test
  public void buildCapabilitiesGetTest() {
    // Arrange and Act
    XMessage actualBuildCapabilitiesGetResult = (new XMessageBuilder()).buildCapabilitiesGet();

    // Assert
    List<Notice> actualNotices = actualBuildCapabilitiesGetResult.getNotices();
    assertNull(actualNotices);
    assertTrue(actualBuildCapabilitiesGetResult.isInitialized());
  }
}
