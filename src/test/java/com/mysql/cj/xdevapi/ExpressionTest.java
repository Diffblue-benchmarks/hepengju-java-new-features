package com.mysql.cj.xdevapi;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExpressionTest {
  @Test
  public void exprTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", Expression.expr("aaaaa").getExpressionString());
  }

  @Test
  public void getExpressionStringTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new Expression("aaaaa")).getExpressionString());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new Expression("aaaaa")).getExpressionString());
  }
}
