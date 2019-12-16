package com.mysql.cj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppendingBatchVisitorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("", (new AppendingBatchVisitor()).toString());
  }

  @Test
  public void getStaticSqlStringsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new AppendingBatchVisitor()).getStaticSqlStrings().length);
  }

  @Test
  public void mergeWithLastTest() {
    // Arrange, Act and Assert
    assertEquals(1, ((AppendingBatchVisitor) (new AppendingBatchVisitor()).mergeWithLast(new byte[24]))
        .getStaticSqlStrings().length);
  }

  @Test
  public void mergeTest() {
    // Arrange, Act and Assert
    assertEquals(1, ((AppendingBatchVisitor) (new AppendingBatchVisitor()).merge(new byte[24], new byte[24]))
        .getStaticSqlStrings().length);
  }

  @Test
  public void decrementTest() {
    // Arrange, Act and Assert
    thrown.expect(NoSuchElementException.class);
    (new AppendingBatchVisitor()).decrement();
  }

  @Test
  public void incrementTest() {
    // Arrange
    AppendingBatchVisitor appendingBatchVisitor = new AppendingBatchVisitor();

    // Act and Assert
    assertSame(appendingBatchVisitor, appendingBatchVisitor.increment());
  }

  @Test
  public void appendTest() {
    // Arrange, Act and Assert
    assertEquals(1,
        ((AppendingBatchVisitor) (new AppendingBatchVisitor()).append(new byte[24])).getStaticSqlStrings().length);
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new AppendingBatchVisitor()).statementComponents.size());
  }
}
