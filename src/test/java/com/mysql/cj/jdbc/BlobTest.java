package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.jdbc.result.ResultSetImpl;
import com.mysql.cj.protocol.WatchableOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BlobTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getBinaryStreamTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new Blob(null)).getBinaryStream(1L, 1L);
  }

  @Test
  public void truncateTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new Blob(null)).truncate(1L);
  }

  @Test
  public void streamClosedTest2() throws SQLException {
    // Arrange
    Blob blob = new Blob(null);

    // Act
    blob.streamClosed(new WatchableOutputStream());

    // Assert
    assertTrue(blob.getBinaryStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void streamClosedTest() throws SQLException {
    // Arrange
    Blob blob = new Blob(null);

    // Act
    blob.streamClosed(new byte[24]);

    // Assert
    assertTrue(blob.getBinaryStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void setBytesTest2() throws SQLException {
    // Arrange
    Blob blob = new Blob(null);

    // Act and Assert
    assertEquals(1, blob.setBytes(1L, new byte[24], 1, 1));
    assertTrue(blob.getBinaryStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void setBytesTest() throws SQLException {
    // Arrange
    Blob blob = new Blob(null);

    // Act and Assert
    assertEquals(24, blob.setBytes(1L, new byte[24]));
    assertTrue(blob.getBinaryStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void setBinaryStreamTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new Blob(null)).setBinaryStream(1L) instanceof com.mysql.cj.protocol.WatchableOutputStream);
  }

  @Test
  public void positionTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLFeatureNotSupportedException.class);
    (new Blob(null)).position(new byte[24], 1L);
  }

  @Test
  public void lengthTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0L, (new Blob(null)).length());
  }

  @Test
  public void getBytesTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new Blob(null)).getBytes(1L, 1);
  }

  @Test
  public void getBinaryStreamTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new Blob(null)).getBinaryStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void constructorTest3() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new Blob(new byte[24], null, 1)).getBinaryStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void constructorTest2() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new Blob(new byte[24], null)).getBinaryStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void constructorTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new Blob(null)).getBinaryStream() instanceof java.io.ByteArrayInputStream);
  }
}
