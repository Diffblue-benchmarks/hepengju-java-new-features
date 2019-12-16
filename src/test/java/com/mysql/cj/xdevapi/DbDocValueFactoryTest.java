package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.mysql.cj.MysqlType;
import com.mysql.cj.conf.DefaultPropertySet;
import com.mysql.cj.exceptions.WrongArgumentException;
import com.mysql.cj.result.Field;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DbDocValueFactoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getTargetTypeNameTest() {
    // Arrange, Act and Assert
    assertEquals("com.mysql.cj.xdevapi.DbDoc", (new DbDocValueFactory(new DefaultPropertySet())).getTargetTypeName());
  }
  @Test
  public void createFromNullTest() {
    // Arrange, Act and Assert
    assertNull((new DbDocValueFactory(new DefaultPropertySet())).createFromNull());
  }
  @Test
  public void createFromBytesTest() {
    // Arrange
    DbDocValueFactory dbDocValueFactory = new DbDocValueFactory(new DefaultPropertySet());

    // Act and Assert
    thrown.expect(WrongArgumentException.class);
    dbDocValueFactory.createFromBytes(new byte[24], 1, 1,
        new Field("aaaaa", "aaaaa", 1, "aaaaa", MysqlType.DECIMAL, 1));
  }
}
