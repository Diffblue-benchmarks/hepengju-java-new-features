package com.mysql.cj.jdbc.result;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.exceptions.WrongArgumentException;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.StatementImpl;
import com.mysql.cj.protocol.Resultset;
import java.sql.SQLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResultSetFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void createFromProtocolEntityTest() throws SQLException {
    // Arrange
    ResultSetFactory resultSetFactory = new ResultSetFactory(null, null);

    // Act and Assert
    thrown.expect(WrongArgumentException.class);
    resultSetFactory.createFromProtocolEntity(new CachedResultSetMetaDataImpl());
  }

  @Test
  public void getFetchSizeTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new ResultSetFactory(null, null)).getFetchSize();
  }

  @Test
  public void getResultSetConcurrencyTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(Resultset.Concurrency.READ_ONLY, (new ResultSetFactory(null, null)).getResultSetConcurrency());
  }

  @Test
  public void getResultSetTypeTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(Resultset.Type.FORWARD_ONLY, (new ResultSetFactory(null, null)).getResultSetType());
  }

  @Test
  public void constructorTest() throws SQLException {
    // Arrange and Act
    ResultSetFactory actualResultSetFactory = new ResultSetFactory(null, null);

    // Assert
    Resultset.Concurrency actualResultSetConcurrency = actualResultSetFactory.getResultSetConcurrency();
    assertEquals(Resultset.Concurrency.READ_ONLY, actualResultSetConcurrency);
    assertEquals(Resultset.Type.FORWARD_ONLY, actualResultSetFactory.getResultSetType());
  }
}
