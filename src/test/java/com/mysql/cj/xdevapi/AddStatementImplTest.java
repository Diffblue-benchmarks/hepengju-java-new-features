package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.MysqlxSession;
import com.mysql.cj.exceptions.WrongArgumentException;
import java.util.concurrent.CompletableFuture;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AddStatementImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void setUpsertTest() {
    // Arrange
    DbDocImpl dbDocImpl = new DbDocImpl();
    DbDocImpl dbDocImpl1 = new DbDocImpl();
    dbDocImpl1.put("aaaaa", null);
    dbDocImpl.put("aaaaa", dbDocImpl1);

    // Act and Assert
    assertTrue((new AddStatementImpl(null, "aaaaa", "aaaaa", dbDocImpl)).setUpsert(true).isUpsert());
  }

  @Test
  public void isUpsertTest() {
    // Arrange
    DbDocImpl dbDocImpl = new DbDocImpl();
    DbDocImpl dbDocImpl1 = new DbDocImpl();
    dbDocImpl1.put("aaaaa", null);
    dbDocImpl.put("aaaaa", dbDocImpl1);

    // Act and Assert
    assertFalse((new AddStatementImpl(null, "aaaaa", "aaaaa", dbDocImpl)).isUpsert());
  }

  @Test
  public void executeAsyncTest() {
    // Arrange
    DbDocImpl dbDocImpl = new DbDocImpl();
    DbDocImpl dbDocImpl1 = new DbDocImpl();
    dbDocImpl1.put("aaaaa", null);
    dbDocImpl.put("aaaaa", dbDocImpl1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new AddStatementImpl(null, "aaaaa", "aaaaa", dbDocImpl)).executeAsync();
  }

  @Test
  public void executeTest() {
    // Arrange
    DbDocImpl dbDocImpl = new DbDocImpl();
    DbDocImpl dbDocImpl1 = new DbDocImpl();
    dbDocImpl1.put("aaaaa", null);
    dbDocImpl.put("aaaaa", dbDocImpl1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new AddStatementImpl(null, "aaaaa", "aaaaa", dbDocImpl)).execute();
  }

  @Test
  public void addTest2() {
    // Arrange
    DbDocImpl dbDocImpl = new DbDocImpl();
    DbDocImpl dbDocImpl1 = new DbDocImpl();
    dbDocImpl1.put("aaaaa", null);
    dbDocImpl.put("aaaaa", dbDocImpl1);
    AddStatementImpl addStatementImpl = new AddStatementImpl(null, "aaaaa", "aaaaa", dbDocImpl);
    DbDocImpl dbDocImpl2 = new DbDocImpl();
    DbDocImpl dbDocImpl3 = new DbDocImpl();
    dbDocImpl3.put("aaaaa", null);
    dbDocImpl2.put("aaaaa", dbDocImpl3);

    // Act and Assert
    assertSame(addStatementImpl, addStatementImpl.add(new DbDoc[]{null, dbDocImpl, dbDocImpl2}));
  }

  @Test
  public void addTest() {
    // Arrange
    DbDocImpl dbDocImpl = new DbDocImpl();
    DbDocImpl dbDocImpl1 = new DbDocImpl();
    dbDocImpl1.put("aaaaa", null);
    dbDocImpl.put("aaaaa", dbDocImpl1);

    // Act and Assert
    thrown.expect(WrongArgumentException.class);
    (new AddStatementImpl(null, "aaaaa", "aaaaa", dbDocImpl)).add("aaaaa");
  }

  @Test
  public void constructorTest2() {
    // Arrange
    DbDocImpl dbDocImpl = new DbDocImpl();
    DbDocImpl dbDocImpl1 = new DbDocImpl();
    dbDocImpl1.put("aaaaa", null);
    dbDocImpl.put("aaaaa", dbDocImpl1);

    // Act and Assert
    assertFalse(
        (new AddStatementImpl(null, "aaaaa", "aaaaa", new DbDoc[]{dbDocImpl, dbDocImpl, dbDocImpl})).isUpsert());
  }

  @Test
  public void constructorTest() {
    // Arrange
    DbDocImpl dbDocImpl = new DbDocImpl();
    DbDocImpl dbDocImpl1 = new DbDocImpl();
    dbDocImpl1.put("aaaaa", null);
    dbDocImpl.put("aaaaa", dbDocImpl1);

    // Act and Assert
    assertFalse((new AddStatementImpl(null, "aaaaa", "aaaaa", dbDocImpl)).isUpsert());
  }
}
