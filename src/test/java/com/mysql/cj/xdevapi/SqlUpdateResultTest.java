package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.mysql.cj.exceptions.FeatureNotAvailableException;
import com.mysql.cj.protocol.x.StatementExecuteOk;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SqlUpdateResultTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getAutoIncrementValueTest() {
    // Arrange, Act and Assert
    assertNull((new SqlUpdateResult(new StatementExecuteOk())).getAutoIncrementValue());
  }

  @Test
  public void countTest() {
    // Arrange, Act and Assert
    thrown.expect(FeatureNotAvailableException.class);
    (new SqlUpdateResult(new StatementExecuteOk())).count();
  }

  @Test
  public void getColumnNamesTest() {
    // Arrange, Act and Assert
    thrown.expect(FeatureNotAvailableException.class);
    (new SqlUpdateResult(new StatementExecuteOk())).getColumnNames();
  }

  @Test
  public void getColumnsTest() {
    // Arrange, Act and Assert
    thrown.expect(FeatureNotAvailableException.class);
    (new SqlUpdateResult(new StatementExecuteOk())).getColumns();
  }

  @Test
  public void getColumnCountTest() {
    // Arrange, Act and Assert
    thrown.expect(FeatureNotAvailableException.class);
    (new SqlUpdateResult(new StatementExecuteOk())).getColumnCount();
  }

  @Test
  public void hasNextTest() {
    // Arrange, Act and Assert
    thrown.expect(FeatureNotAvailableException.class);
    (new SqlUpdateResult(new StatementExecuteOk())).hasNext();
  }

  @Test
  public void nextTest() {
    // Arrange, Act and Assert
    thrown.expect(FeatureNotAvailableException.class);
    (new SqlUpdateResult(new StatementExecuteOk())).next();
  }

  @Test
  public void fetchAllTest() {
    // Arrange, Act and Assert
    thrown.expect(FeatureNotAvailableException.class);
    (new SqlUpdateResult(new StatementExecuteOk())).fetchAll();
  }

  @Test
  public void nextResultTest() {
    // Arrange, Act and Assert
    thrown.expect(FeatureNotAvailableException.class);
    (new SqlUpdateResult(new StatementExecuteOk())).nextResult();
  }

  @Test
  public void hasDataTest() {
    // Arrange, Act and Assert
    assertFalse((new SqlUpdateResult(new StatementExecuteOk())).hasData());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new SqlUpdateResult(new StatementExecuteOk())).getAffectedItemsCount());
  }
}
