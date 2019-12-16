package com.diffblue.deeptestutils;

import static org.junit.Assert.assertEquals;
import java.lang.reflect.InvocationTargetException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ReflectorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getInstanceTest2() throws InvocationTargetException {
    // Arrange, Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    Reflector.<Object>getInstance("");
  }
  @Test
  public void getInstanceTest() throws InvocationTargetException {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Reflector.<Object>getInstance((Class<Object>) null);
  }
  @Test
  public void removePackageFromNameTest() {
    // Arrange, Act and Assert
    assertEquals("", Reflector.removePackageFromName(""));
  }
  @Test
  public void toThrowableClassTest() {
    // Arrange, Act and Assert
    thrown.expect(DeeptestUtilsRuntimeException.class);
    Reflector.toThrowableClass("");
  }
  @Test
  public void forNameTest() {
    // Arrange, Act and Assert
    thrown.expect(DeeptestUtilsRuntimeException.class);
    Reflector.forName("");
  }
  @Test
  public void getInstanceFieldTest2() {
    // Arrange, Act and Assert
    thrown.expect(DeeptestUtilsRuntimeException.class);
    Reflector.getInstanceField("", "");
  }
  @Test
  public void getInstanceFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(DeeptestUtilsRuntimeException.class);
    Reflector.<Object>getInstanceField(null, "", "");
  }
}
