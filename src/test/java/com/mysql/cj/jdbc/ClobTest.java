package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.protocol.WatchableOutputStream;
import com.mysql.cj.protocol.WatchableWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.sql.SQLException;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ClobTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getCharacterStreamTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new Clob(null)).getCharacterStream(1L, 1L);
  }

  @Test
  public void freeTest() throws SQLException {
    // Arrange
    Clob clob = new Clob(null);

    // Act
    clob.free();

    // Assert
    assertNull(clob.getAsciiStream());
  }

  @Test
  public void writerClosedTest2() throws SQLException {
    // Arrange
    Clob clob = new Clob(null);

    // Act
    clob.writerClosed(new WatchableWriter());

    // Assert
    assertTrue(clob.getAsciiStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void writerClosedTest() throws SQLException {
    // Arrange
    Clob clob = new Clob(null);
    char[] charArray = new char[8];
    Arrays.fill(charArray, 'c');

    // Act
    clob.writerClosed(charArray);

    // Assert
    assertTrue(clob.getAsciiStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void truncateTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new Clob(null)).truncate(1L);
  }

  @Test
  public void streamClosedTest() throws SQLException {
    // Arrange
    Clob clob = new Clob(null);

    // Act
    clob.streamClosed(new WatchableOutputStream());

    // Assert
    assertTrue(clob.getAsciiStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void setStringTest2() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new Clob(null)).setString(1L, "", 1, 1);
  }

  @Test
  public void setStringTest() throws SQLException {
    // Arrange
    Clob clob = new Clob(null);

    // Act and Assert
    assertEquals(0, clob.setString(1L, ""));
    assertTrue(clob.getAsciiStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void setCharacterStreamTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new Clob(null)).setCharacterStream(1L) instanceof com.mysql.cj.protocol.WatchableWriter);
  }

  @Test
  public void setAsciiStreamTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new Clob(null)).setAsciiStream(1L) instanceof com.mysql.cj.protocol.WatchableOutputStream);
  }

  @Test
  public void positionTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(1L, (new Clob(null)).position("", 1L));
  }

  @Test
  public void lengthTest() throws SQLException {
    // Arrange, Act and Assert
    assertEquals(0L, (new Clob(null)).length());
  }

  @Test
  public void getSubStringTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new Clob(null)).getSubString(1L, 1);
  }

  @Test
  public void getCharacterStreamTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new Clob(null)).getCharacterStream() instanceof java.io.StringReader);
  }

  @Test
  public void getAsciiStreamTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new Clob(null)).getAsciiStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void constructorTest2() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new Clob("", null)).getAsciiStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void constructorTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new Clob(null)).getAsciiStream() instanceof java.io.ByteArrayInputStream);
  }
}
