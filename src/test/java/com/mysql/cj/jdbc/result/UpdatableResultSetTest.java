package com.mysql.cj.jdbc.result;

import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.StatementImpl;
import com.mysql.cj.protocol.a.result.ResultsetRowsCursor;
import java.sql.SQLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UpdatableResultSetTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new UpdatableResultSet(null, null, null);
  }
}
