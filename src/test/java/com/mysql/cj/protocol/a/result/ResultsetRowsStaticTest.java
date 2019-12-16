package com.mysql.cj.protocol.a.result;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;
import com.mysql.cj.protocol.a.NativePacketPayload;
import com.mysql.cj.result.Row;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResultsetRowsStaticTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void wasEmptyTest() {
    // Arrange, Act and Assert
    assertFalse((new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).wasEmpty());
  }
  @Test
  public void sizeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).size();
  }
  @Test
  public void setCurrentRowTest() {
    // Arrange
    ResultsetRowsStatic resultsetRowsStatic = new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl());

    // Act
    resultsetRowsStatic.setCurrentRow(1);

    // Assert
    assertFalse(resultsetRowsStatic.isFirst());
  }
  @Test
  public void removeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).remove();
  }
  @Test
  public void nextTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).next();
  }
  @Test
  public void moveRowRelativeTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).moveRowRelative(1);
  }
  @Test
  public void isLastTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).isLast();
  }
  @Test
  public void isFirstTest() {
    // Arrange, Act and Assert
    assertFalse((new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).isFirst());
  }
  @Test
  public void isEmptyTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).isEmpty();
  }
  @Test
  public void isDynamicTest() {
    // Arrange, Act and Assert
    assertFalse((new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).isDynamic());
  }
  @Test
  public void isBeforeFirstTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).isBeforeFirst();
  }
  @Test
  public void isAfterLastTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).isAfterLast();
  }
  @Test
  public void hasNextTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).hasNext();
  }
  @Test
  public void getPositionTest() {
    // Arrange, Act and Assert
    assertEquals(-1, (new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).getPosition());
  }
  @Test
  public void getTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).get(1);
  }
  @Test
  public void beforeLastTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).beforeLast();
  }
  @Test
  public void beforeFirstTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).beforeFirst();
  }
  @Test
  public void afterLastTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultsetRowsStatic(null, new CachedResultSetMetaDataImpl())).afterLast();
  }
  @Test
  public void addRowTest() {
    // Arrange
    CachedResultSetMetaDataImpl cachedResultSetMetaDataImpl = new CachedResultSetMetaDataImpl();
    ResultsetRowsStatic resultsetRowsStatic = new ResultsetRowsStatic(null, cachedResultSetMetaDataImpl);
    NativePacketPayload buf = new NativePacketPayload(1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    resultsetRowsStatic
        .addRow(new BinaryBufferRow(buf, cachedResultSetMetaDataImpl, null, new MysqlBinaryValueDecoder()));
  }
}
