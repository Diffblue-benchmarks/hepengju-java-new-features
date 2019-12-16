package com.mysql.cj.xdevapi;

import com.mysql.cj.MysqlxSession;
import com.mysql.cj.exceptions.FeatureNotAvailableException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SqlStatementImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void bindTest2() {
    // Arrange, Act and Assert
    thrown.expect(FeatureNotAvailableException.class);
    (new SqlStatementImpl(null, "aaaaa")).bind((Map<String, Object>) null);
  }
  @Test
  public void bindTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SqlStatementImpl(null, "aaaaa")).bind((List<Object>) null);
  }
  @Test
  public void executeAsyncTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SqlStatementImpl(null, "aaaaa")).executeAsync();
  }
  @Test
  public void executeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new SqlStatementImpl(null, "aaaaa")).execute();
  }
}
