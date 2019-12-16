package com.mysql.cj.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.sql.SQLException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MysqlSQLXMLTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertTrue(((new MysqlSQLXML(null)).new SimpleSaxToReader()).toReader() instanceof java.io.StringReader);
  }

  @Test
  public void serializeAsStringTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlSQLXML(null)).serializeAsString();
  }

  @Test
  public void domSourceToStringTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(SQLException.class);
    (new MysqlSQLXML(null)).domSourceToString();
  }

  @Test
  public void serializeAsCharacterStreamTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlSQLXML(null)).serializeAsCharacterStream();
  }

  @Test
  public void readerToStringTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlSQLXML(null)).readerToString(null);
  }

  @Test
  public void setResultTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlSQLXML(null)).<Result>setResult(null) instanceof javax.xml.transform.sax.SAXResult);
  }

  @Test
  public void setCharacterStreamTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlSQLXML(null)).setCharacterStream() instanceof java.io.StringWriter);
  }

  @Test
  public void setBinaryStreamTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlSQLXML(null)).setBinaryStream() instanceof java.io.ByteArrayOutputStream);
  }

  @Test
  public void getSourceTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlSQLXML(null)).<Source>getSource(null);
  }

  @Test
  public void getCharacterStreamTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlSQLXML(null)).getCharacterStream();
  }

  @Test
  public void getBinaryStreamTest() throws SQLException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new MysqlSQLXML(null)).getBinaryStream();
  }

  @Test
  public void isEmptyTest() throws SQLException {
    // Arrange, Act and Assert
    assertTrue((new MysqlSQLXML(null)).isEmpty());
  }

  @Test
  public void setStringTest() throws SQLException {
    // Arrange
    MysqlSQLXML mysqlSQLXML = new MysqlSQLXML(null);

    // Act
    mysqlSQLXML.setString("UTF-8");

    // Assert
    assertEquals("UTF-8", mysqlSQLXML.getString());
  }

  @Test
  public void getStringTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlSQLXML(null)).getString());
  }

  @Test
  public void constructorTest() throws SQLException {
    // Arrange, Act and Assert
    assertNull((new MysqlSQLXML(null)).getString());
  }
}
