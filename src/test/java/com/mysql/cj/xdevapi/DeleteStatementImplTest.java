package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertTrue;
import com.mysql.cj.MysqlxSession;
import com.mysql.cj.protocol.x.XMessage;
import java.util.concurrent.CompletableFuture;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DeleteStatementImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void executeAsyncTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new DeleteStatementImpl(null, "aaaaa", "aaaaa")).executeAsync();
  }

  @Test
  public void executePreparedStatementTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new DeleteStatementImpl(null, "aaaaa", "aaaaa")).executePreparedStatement();
  }

  @Test
  public void getPrepareStatementXMessageTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new DeleteStatementImpl(null, "aaaaa", "aaaaa")).getPrepareStatementXMessage();
  }

  @Test
  public void executeStatementTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new DeleteStatementImpl(null, "aaaaa", "aaaaa")).executeStatement();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new DeleteStatementImpl(null, "aaaaa", "aaaaa")).isRelational());
  }
}
