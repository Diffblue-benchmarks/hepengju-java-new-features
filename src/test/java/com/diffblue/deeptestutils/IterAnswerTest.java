package com.diffblue.deeptestutils;

import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.internal.invocation.InvocationImpl;

public class IterAnswerTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void answerTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new IterAnswer<Object>("aaaaa", "aaaaa", null, null)).answer(null);
  }
}
