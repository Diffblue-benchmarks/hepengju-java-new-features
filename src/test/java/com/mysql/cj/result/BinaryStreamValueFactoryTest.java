package com.mysql.cj.result;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.MysqlType;
import com.mysql.cj.conf.DefaultPropertySet;
import java.io.InputStream;
import org.junit.Test;

public class BinaryStreamValueFactoryTest {
  @Test
  public void getTargetTypeNameTest() {
    // Arrange, Act and Assert
    assertEquals("java.io.InputStream", (new BinaryStreamValueFactory(new DefaultPropertySet())).getTargetTypeName());
  }

  @Test
  public void createFromBytesTest() {
    // Arrange
    BinaryStreamValueFactory binaryStreamValueFactory = new BinaryStreamValueFactory(new DefaultPropertySet());

    // Act and Assert
    assertTrue(binaryStreamValueFactory.createFromBytes(new byte[24], 1, 1,
        new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1)) instanceof java.io.ByteArrayInputStream);
  }
}
