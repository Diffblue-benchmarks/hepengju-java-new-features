package com.mysql.cj.protocol;

import static org.junit.Assert.assertEquals;
import com.mysql.cj.exceptions.WrongArgumentException;
import java.security.DigestException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SecurityTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void scrambleCachingSha2Test() throws DigestException {
    // Arrange and Act
    byte[] actualScrambleCachingSha2Result = Security.scrambleCachingSha2(new byte[24], new byte[24]);

    // Assert
    assertEquals(32, actualScrambleCachingSha2Result.length);
    assertEquals((byte) -27, actualScrambleCachingSha2Result[0]);
    assertEquals((byte) 53, actualScrambleCachingSha2Result[1]);
    assertEquals((byte) 7, actualScrambleCachingSha2Result[2]);
    assertEquals((byte) 50, actualScrambleCachingSha2Result[3]);
    assertEquals((byte) 105, actualScrambleCachingSha2Result[4]);
    assertEquals((byte) 105, actualScrambleCachingSha2Result[5]);
    assertEquals((byte) 121, actualScrambleCachingSha2Result[26]);
    assertEquals((byte) 14, actualScrambleCachingSha2Result[27]);
    assertEquals((byte) -96, actualScrambleCachingSha2Result[28]);
    assertEquals((byte) -79, actualScrambleCachingSha2Result[29]);
    assertEquals((byte) 25, actualScrambleCachingSha2Result[30]);
    assertEquals((byte) -32, actualScrambleCachingSha2Result[31]);
  }
  @Test
  public void scramble411Test2() {
    // Arrange and Act
    byte[] actualScramble411Result = Security.scramble411(new byte[24], new byte[24]);

    // Assert
    assertEquals(20, actualScramble411Result.length);
    assertEquals((byte) 30, actualScramble411Result[0]);
    assertEquals((byte) -40, actualScramble411Result[1]);
    assertEquals((byte) -13, actualScramble411Result[2]);
    assertEquals((byte) -127, actualScramble411Result[3]);
    assertEquals((byte) -30, actualScramble411Result[4]);
    assertEquals((byte) 120, actualScramble411Result[5]);
    assertEquals((byte) 115, actualScramble411Result[14]);
    assertEquals((byte) -91, actualScramble411Result[15]);
    assertEquals((byte) 119, actualScramble411Result[16]);
    assertEquals((byte) 84, actualScramble411Result[17]);
    assertEquals((byte) 0, actualScramble411Result[18]);
    assertEquals((byte) -13, actualScramble411Result[19]);
  }
  @Test
  public void scramble411Test() {
    // Arrange, Act and Assert
    thrown.expect(WrongArgumentException.class);
    Security.scramble411("aaaaa", new byte[24], "aaaaa");
  }
}
