package com.mysql.cj.protocol.a;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.exceptions.WrongArgumentException;
import com.mysql.cj.jdbc.result.CachedResultSetMetaDataImpl;
import com.mysql.cj.protocol.Resultset;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResultsetFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void createFromProtocolEntityTest() {
    // Arrange
    ResultsetFactory resultsetFactory = new ResultsetFactory(Resultset.Type.FORWARD_ONLY,
        Resultset.Concurrency.READ_ONLY);

    // Act and Assert
    thrown.expect(WrongArgumentException.class);
    resultsetFactory.createFromProtocolEntity(new CachedResultSetMetaDataImpl());
  }

  @Test
  public void getResultSetConcurrencyTest() {
    // Arrange, Act and Assert
    assertEquals(Resultset.Concurrency.READ_ONLY,
        (new ResultsetFactory(Resultset.Type.FORWARD_ONLY, Resultset.Concurrency.READ_ONLY)).getResultSetConcurrency());
  }

  @Test
  public void getResultSetTypeTest() {
    // Arrange, Act and Assert
    assertEquals(Resultset.Type.FORWARD_ONLY,
        (new ResultsetFactory(Resultset.Type.FORWARD_ONLY, Resultset.Concurrency.READ_ONLY)).getResultSetType());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ResultsetFactory actualResultsetFactory = new ResultsetFactory(Resultset.Type.FORWARD_ONLY,
        Resultset.Concurrency.READ_ONLY);

    // Assert
    Resultset.Concurrency actualResultSetConcurrency = actualResultsetFactory.getResultSetConcurrency();
    assertEquals(Resultset.Concurrency.READ_ONLY, actualResultSetConcurrency);
    assertEquals(Resultset.Type.FORWARD_ONLY, actualResultsetFactory.getResultSetType());
  }
}
