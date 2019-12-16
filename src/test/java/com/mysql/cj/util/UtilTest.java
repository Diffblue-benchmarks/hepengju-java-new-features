package com.mysql.cj.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.exceptions.WrongArgumentException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UtilTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void readBlockTest2() {
    // Arrange, Act and Assert
    assertEquals(1, Util.readBlock(new ByteArrayInputStream(new byte[24]), new byte[24], 1, null));
  }

  @Test
  public void readBlockTest() {
    // Arrange, Act and Assert
    assertEquals(24, Util.readBlock(new ByteArrayInputStream(new byte[24]), new byte[24], null));
  }

  @Test
  public void readFullyTest() throws IOException {
    // Arrange
    char[] charArray = new char[8];
    Arrays.fill(charArray, 'c');

    // Act and Assert
    thrown.expect(NullPointerException.class);
    Util.readFully(null, charArray, 1);
  }

  @Test
  public void isRunningOnWindowsTest() {
    // Arrange, Act and Assert
    assertFalse(Util.isRunningOnWindows());
  }

  @Test
  public void getPackageNameTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Util.getPackageName(null);
  }

  @Test
  public void truncateAndConvertToIntTest2() {
    // Arrange
    long[] longArray = new long[8];
    Arrays.fill(longArray, 1L);

    // Act and Assert
    assertEquals(8, Util.truncateAndConvertToInt(longArray).length);
  }

  @Test
  public void truncateAndConvertToIntTest() {
    // Arrange, Act and Assert
    assertEquals(1, Util.truncateAndConvertToInt(1L));
  }

  @Test
  public void secondsSinceMillisTest() {
    // Arrange, Act and Assert
    assertEquals(1576515572L, Util.secondsSinceMillis(1L));
  }

  @Test
  public void getImplementedInterfacesTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Util.getImplementedInterfaces(null);
  }

  @Test
  public void isJdbcPackageTest() {
    // Arrange, Act and Assert
    assertFalse(Util.isJdbcPackage("WINDOWS"));
  }

  @Test
  public void isJdbcInterfaceTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Util.isJdbcInterface(null);
  }

  @Test
  public void loadClassesTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    Util.<Object>loadClasses("WINDOWS", "WINDOWS", null);
  }

  @Test
  public void calculateDifferencesTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Util.calculateDifferences(null, null);
  }

  @Test
  public void interfaceExistsTest() {
    // Arrange, Act and Assert
    assertFalse(Util.interfaceExists("WINDOWS"));
  }

  @Test
  public void handleNewInstanceTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Util.handleNewInstance(null, new Object[]{"WINDOWS", null, "WINDOWS"}, null);
  }

  @Test
  public void getInstanceTest2() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    Util.getInstance("WINDOWS", new Class[]{null, null, null}, new Object[]{"WINDOWS", null, "WINDOWS"}, null);
  }

  @Test
  public void getInstanceTest() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    Util.getInstance("WINDOWS", new Class[]{null, null, null}, new Object[]{"WINDOWS", null, "WINDOWS"}, null,
        "WINDOWS");
  }

  @Test
  public void stackTraceToStringTest() {
    // Arrange, Act and Assert
    assertEquals("\n\n** BEGIN NESTED EXCEPTION ** \n\n\n\n** END NESTED EXCEPTION **\n\n",
        Util.stackTraceToString(null));
  }

  @Test
  public void isEnterpriseEditionTest() {
    // Arrange, Act and Assert
    assertFalse(Util.isEnterpriseEdition("WINDOWS"));
  }

  @Test
  public void isCommunityEditionTest() {
    // Arrange, Act and Assert
    assertTrue(Util.isCommunityEdition("WINDOWS"));
  }

  @Test
  public void getJVMUpdateNumberTest() {
    // Arrange, Act and Assert
    assertEquals(-1, Util.getJVMUpdateNumber());
  }

  @Test
  public void jvmMeetsMinimumTest() {
    // Arrange, Act and Assert
    assertFalse(Util.jvmMeetsMinimum(1, 1));
  }

  @Test
  public void getJVMVersionTest() {
    // Arrange, Act and Assert
    assertEquals(0, Util.getJVMVersion());
  }
}
