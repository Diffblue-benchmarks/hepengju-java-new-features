package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertNull;
import com.mysql.cj.MysqlxSession;
import com.mysql.cj.conf.HostInfo;
import com.mysql.cj.protocol.x.XProtocol;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SessionImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getSessionTest() {
    // Arrange, Act and Assert
    assertNull((new SessionImpl()).getSession());
  }
  @Test
  public void closeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SessionImpl()).close();
  }
  @Test
  public void isOpenTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SessionImpl()).isOpen();
  }
  @Test
  public void getUriTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SessionImpl()).getUri();
  }
  @Test
  public void releaseSavepointTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SessionImpl()).releaseSavepoint("COMMIT");
  }
  @Test
  public void rollbackToTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SessionImpl()).rollbackTo("COMMIT");
  }
  @Test
  public void setSavepointTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SessionImpl()).setSavepoint("COMMIT");
  }
  @Test
  public void setSavepointTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SessionImpl()).setSavepoint();
  }
  @Test
  public void rollbackTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SessionImpl()).rollback();
  }
  @Test
  public void commitTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SessionImpl()).commit();
  }
  @Test
  public void startTransactionTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SessionImpl()).startTransaction();
  }
  @Test
  public void dropSchemaTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SessionImpl()).dropSchema("COMMIT");
  }
  @Test
  public void createSchemaTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SessionImpl()).createSchema("COMMIT", true);
  }
  @Test
  public void createSchemaTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SessionImpl()).createSchema("COMMIT");
  }
  @Test
  public void getDefaultSchemaTest() {
    // Arrange, Act and Assert
    assertNull((new SessionImpl()).getDefaultSchema());
  }
  @Test
  public void getDefaultSchemaNameTest() {
    // Arrange, Act and Assert
    assertNull((new SessionImpl()).getDefaultSchemaName());
  }
  @Test
  public void getSchemaTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SessionImpl()).getSchema("COMMIT");
  }
  @Test
  public void getSchemasTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SessionImpl()).getSchemas();
  }
  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new SessionImpl((XProtocol) null);
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new SessionImpl(new HostInfo());
  }
}
