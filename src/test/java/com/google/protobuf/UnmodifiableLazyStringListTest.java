package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UnmodifiableLazyStringListTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getUnmodifiableViewTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    assertEquals(1, (new UnmodifiableLazyStringList(lazyStringArrayList)).getUnmodifiableView().size());
  }

  @Test
  public void asByteArrayListTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    assertEquals(1, (new UnmodifiableLazyStringList(lazyStringArrayList)).asByteArrayList().size());
  }

  @Test
  public void mergeFromTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new UnmodifiableLazyStringList(lazyStringArrayList)).mergeFrom(lazyStringArrayList);
  }

  @Test
  public void getUnderlyingElementsTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    assertEquals(1, (new UnmodifiableLazyStringList(lazyStringArrayList)).getUnderlyingElements().size());
  }

  @Test
  public void addAllByteArrayTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new UnmodifiableLazyStringList(lazyStringArrayList)).addAllByteArray(null);
  }

  @Test
  public void setTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new UnmodifiableLazyStringList(lazyStringArrayList)).set(1, new byte[24]);
  }

  @Test
  public void addTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new UnmodifiableLazyStringList(lazyStringArrayList)).add(new byte[24]);
  }

  @Test
  public void getByteArrayTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    (new UnmodifiableLazyStringList(lazyStringArrayList)).getByteArray(1);
  }

  @Test
  public void addAllByteStringTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new UnmodifiableLazyStringList(lazyStringArrayList)).addAllByteString(null);
  }

  @Test
  public void getByteStringTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    (new UnmodifiableLazyStringList(lazyStringArrayList)).getByteString(1);
  }

  @Test
  public void sizeTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    assertEquals(1, (new UnmodifiableLazyStringList(lazyStringArrayList)).size());
  }

  @Test
  public void getRawTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    (new UnmodifiableLazyStringList(lazyStringArrayList)).getRaw(1);
  }

  @Test
  public void getTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    (new UnmodifiableLazyStringList(lazyStringArrayList)).get(1);
  }

  @Test
  public void constructorTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    assertEquals(1, (new UnmodifiableLazyStringList(lazyStringArrayList)).size());
  }
}
