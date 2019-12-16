package com.mysql.cj.xdevapi;

import com.mysql.cj.MysqlxSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class InsertStatementImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
//failed_compile @Test
//  public void valuesTest() {
//    // Arrange, Act and Assert
//    thrown.expect(NullPointerException.class);
//    (new InsertStatementImpl(null, "aaaaa", "aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"})).values(null);
//  }
  @Test
  public void executeAsyncTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new InsertStatementImpl(null, "aaaaa", "aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"})).executeAsync();
  }
  @Test
  public void executeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new InsertStatementImpl(null, "aaaaa", "aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"})).execute();
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new InsertStatementImpl(null, "aaaaa", "aaaaa", (Map<String, Object>) null);
  }
}
