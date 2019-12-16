package com.google.protobuf;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class AndroidTest {
  @Test
  public void isOnAndroidDeviceTest() {
    // Arrange, Act and Assert
    assertFalse(Android.isOnAndroidDevice());
  }
}
