package com.mysql.cj.jdbc;

import com.mysql.cj.jdbc.result.ResultSetFactory;
import java.sql.SQLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DatabaseMetaDataUsingInfoSchemaTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() throws SQLException {
    // Arrange
    ConnectionImpl connToSet = new ConnectionImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new DatabaseMetaDataUsingInfoSchema(connToSet, "5.6.4", new ResultSetFactory(null, null));
  }
}
