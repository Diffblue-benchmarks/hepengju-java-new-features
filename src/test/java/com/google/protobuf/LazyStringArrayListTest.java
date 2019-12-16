package com.google.protobuf;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LazyStringArrayListTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getUnmodifiableViewTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    assertEquals(1, lazyStringArrayList.getUnmodifiableView().size());
  }

  @Test
  public void asByteArrayListTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    assertEquals(1, lazyStringArrayList.asByteArrayList().size());
  }

  @Test
  public void getUnderlyingElementsTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    assertEquals(1, lazyStringArrayList.getUnderlyingElements().size());
  }

  @Test
  public void setTest2() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    lazyStringArrayList.set(1, new byte[24]);
  }

  @Test
  public void getByteArrayTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    lazyStringArrayList.getByteArray(1);
  }

  @Test
  public void getByteStringTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    lazyStringArrayList.getByteString(1);
  }

  @Test
  public void getRawTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    lazyStringArrayList.getRaw(1);
  }

  @Test
  public void removeTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    lazyStringArrayList.remove(1);
  }

  @Test
  public void addAllByteArrayTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    lazyStringArrayList.addAllByteArray(null);
  }

  @Test
  public void addAllByteStringTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    lazyStringArrayList.addAllByteString(null);
  }

  @Test
  public void addAllTest2() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    lazyStringArrayList.addAll(1, null);
  }

  @Test
  public void addAllTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    lazyStringArrayList.addAll(null);
  }

  @Test
  public void setTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    lazyStringArrayList.set(1, "aaaaa");
  }

  @Test
  public void sizeTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    assertEquals(1, lazyStringArrayList.size());
  }

  @Test
  public void getTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    lazyStringArrayList.get(1);
  }

  @Test
  public void mutableCopyWithCapacityTest() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    assertEquals(1, lazyStringArrayList.mutableCopyWithCapacity(1).size());
  }

  @Test
  public void constructorTest4() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    new LazyStringArrayList((List<String>) null);
  }

  @Test
  public void constructorTest3() {
    // Arrange
    LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
    lazyStringArrayList.add("aaaaa");

    // Act and Assert
    assertEquals(1, (new LazyStringArrayList((LazyStringList) lazyStringArrayList)).size());
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new LazyStringArrayList(1)).size());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new LazyStringArrayList()).size());
  }

  @Test
  public void emptyListTest() {
    // Arrange, Act and Assert
    assertEquals(0, LazyStringArrayList.emptyList().size());
  }
}
