package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.jdbc.result.ResultSetFactory;
import java.sql.SQLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DatabaseMetaDataTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getTableTypeCompliantWithTest() {
    // Arrange, Act and Assert
    assertEquals(DatabaseMetaData.TableType.UNKNOWN,
        DatabaseMetaData.TableType.getTableTypeCompliantWith("LOCAL_TEMPORARY"));
  }
  @Test
  public void getTableTypeEqualToTest() {
    // Arrange, Act and Assert
    assertEquals(DatabaseMetaData.TableType.UNKNOWN, DatabaseMetaData.TableType.getTableTypeEqualTo("LOCAL_TEMPORARY"));
  }
  @Test
  public void getProcedureOrFunctionColumnTypeTest() {
    // Arrange, Act and Assert
    assertEquals(2, DatabaseMetaData.getProcedureOrFunctionColumnType(true, true, true, true));
  }
  @Test
  public void constructorTest() throws SQLException {
    // Arrange
    ConnectionImpl connToSet = new ConnectionImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new DatabaseMetaData(connToSet, "", new ResultSetFactory(null, null));
  }
  @Test
  public void getInstanceTest() throws SQLException {
    // Arrange
    ConnectionImpl connToSet = new ConnectionImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    DatabaseMetaData.getInstance(connToSet, "", true, new ResultSetFactory(null, null));
  }
}
