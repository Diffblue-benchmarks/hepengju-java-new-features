package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.MysqlxSession;
import com.mysql.cj.protocol.x.XMessage;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UpdateStatementImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void setTest2() {
    // Arrange
    UpdateStatementImpl updateStatementImpl = new UpdateStatementImpl(null, "aaaaa", "aaaaa");

    // Act and Assert
    assertSame(updateStatementImpl, updateStatementImpl.set("aaaaa", "aaaaa"));
  }

  @Test
  public void setTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new UpdateStatementImpl(null, "aaaaa", "aaaaa")).set(null);
  }

  @Test
  public void executeAsyncTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new UpdateStatementImpl(null, "aaaaa", "aaaaa")).executeAsync();
  }

  @Test
  public void executePreparedStatementTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new UpdateStatementImpl(null, "aaaaa", "aaaaa")).executePreparedStatement();
  }

  @Test
  public void getPrepareStatementXMessageTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new UpdateStatementImpl(null, "aaaaa", "aaaaa")).getPrepareStatementXMessage();
  }

  @Test
  public void executeStatementTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new UpdateStatementImpl(null, "aaaaa", "aaaaa")).executeStatement();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new UpdateStatementImpl(null, "aaaaa", "aaaaa")).isRelational());
  }
}
