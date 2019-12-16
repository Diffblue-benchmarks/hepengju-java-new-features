package com.mysql.cj.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DataTruncationExceptionTest {
  @Test
  public void setTransferSizeTest() {
    // Arrange
    DataTruncationException dataTruncationException = new DataTruncationException();

    // Act
    dataTruncationException.setTransferSize(1);

    // Assert
    assertEquals(1, dataTruncationException.getTransferSize());
  }

  @Test
  public void getTransferSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DataTruncationException()).getTransferSize());
  }

  @Test
  public void setDataSizeTest() {
    // Arrange
    DataTruncationException dataTruncationException = new DataTruncationException();

    // Act
    dataTruncationException.setDataSize(1);

    // Assert
    assertEquals(1, dataTruncationException.getDataSize());
  }

  @Test
  public void getDataSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DataTruncationException()).getDataSize());
  }

  @Test
  public void setReadTest() {
    // Arrange
    DataTruncationException dataTruncationException = new DataTruncationException();

    // Act
    dataTruncationException.setRead(true);

    // Assert
    assertTrue(dataTruncationException.isRead());
  }

  @Test
  public void isReadTest() {
    // Arrange, Act and Assert
    assertFalse((new DataTruncationException()).isRead());
  }

  @Test
  public void setParameterTest() {
    // Arrange
    DataTruncationException dataTruncationException = new DataTruncationException();

    // Act
    dataTruncationException.setParameter(true);

    // Assert
    assertTrue(dataTruncationException.isParameter());
  }

  @Test
  public void isParameterTest() {
    // Arrange, Act and Assert
    assertFalse((new DataTruncationException()).isParameter());
  }

  @Test
  public void setIndexTest() {
    // Arrange
    DataTruncationException dataTruncationException = new DataTruncationException();

    // Act
    dataTruncationException.setIndex(1);

    // Assert
    assertEquals(1, dataTruncationException.getIndex());
  }

  @Test
  public void getIndexTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DataTruncationException()).getIndex());
  }

  @Test
  public void constructorTest6() {
    // Arrange and Act
    DataTruncationException actualDataTruncationException = new DataTruncationException("aaaaa", 1, true, true, 1, 1,
        1);

    // Assert
    boolean actualIsReadResult = actualDataTruncationException.isRead();
    String actualSQLState = actualDataTruncationException.getSQLState();
    int actualVendorCode = actualDataTruncationException.getVendorCode();
    boolean actualIsParameterResult = actualDataTruncationException.isParameter();
    boolean actualIsTransientResult = actualDataTruncationException.isTransient();
    int actualIndex = actualDataTruncationException.getIndex();
    int actualDataSize = actualDataTruncationException.getDataSize();
    assertTrue(actualIsReadResult);
    assertEquals(1, actualDataTruncationException.getTransferSize());
    assertEquals(1, actualDataSize);
    assertEquals(1, actualIndex);
    assertFalse(actualIsTransientResult);
    assertTrue(actualIsParameterResult);
    assertEquals(1, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest5() {
    // Arrange and Act
    DataTruncationException actualDataTruncationException = new DataTruncationException("aaaaa", null, true, true);

    // Assert
    String actualSQLState = actualDataTruncationException.getSQLState();
    int actualVendorCode = actualDataTruncationException.getVendorCode();
    assertFalse(actualDataTruncationException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    DataTruncationException actualDataTruncationException = new DataTruncationException((Throwable) null);

    // Assert
    String actualSQLState = actualDataTruncationException.getSQLState();
    int actualVendorCode = actualDataTruncationException.getVendorCode();
    assertFalse(actualDataTruncationException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    DataTruncationException actualDataTruncationException = new DataTruncationException("aaaaa", null);

    // Assert
    String actualSQLState = actualDataTruncationException.getSQLState();
    int actualVendorCode = actualDataTruncationException.getVendorCode();
    assertFalse(actualDataTruncationException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    DataTruncationException actualDataTruncationException = new DataTruncationException("aaaaa");

    // Assert
    String actualSQLState = actualDataTruncationException.getSQLState();
    int actualVendorCode = actualDataTruncationException.getVendorCode();
    assertFalse(actualDataTruncationException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    DataTruncationException actualDataTruncationException = new DataTruncationException();

    // Assert
    String actualSQLState = actualDataTruncationException.getSQLState();
    int actualVendorCode = actualDataTruncationException.getVendorCode();
    assertFalse(actualDataTruncationException.isTransient());
    assertEquals(0, actualVendorCode);
    assertEquals("S1000", actualSQLState);
  }
}
