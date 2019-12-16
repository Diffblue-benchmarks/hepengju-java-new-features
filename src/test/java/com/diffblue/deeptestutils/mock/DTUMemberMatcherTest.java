package com.diffblue.deeptestutils.mock;

import java.lang.reflect.Method;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DTUMemberMatcherTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void methodUsingWholeSignatureTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    DTUMemberMatcher.methodUsingWholeSignature(null, "aaaaa", new Class[]{null, null, null});
  }
  @Test
  public void methodTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    DTUMemberMatcher.method(null, "aaaaa", new Class[]{null, null, null});
  }
}
