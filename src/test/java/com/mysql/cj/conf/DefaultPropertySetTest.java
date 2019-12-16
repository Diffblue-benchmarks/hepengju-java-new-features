package com.mysql.cj.conf;

import static org.junit.Assert.assertTrue;
import java.math.RoundingMode;
import org.junit.Test;

public class DefaultPropertySetTest {
//failed_compile @Test
//  public void getEnumPropertyTest() {
//    // Arrange, Act and Assert
//    assertTrue((new DefaultPropertySet()).<RoundingMode>getEnumProperty(PropertyKey.USER) instanceof StringProperty);
//  }

  @Test
  public void getStringPropertyTest() {
    // Arrange, Act and Assert
    assertTrue((new DefaultPropertySet()).getStringProperty(PropertyKey.USER) instanceof StringProperty);
  }

//failed_compile @Test
//  public void getMemorySizePropertyTest() {
//    // Arrange, Act and Assert
//    assertTrue((new DefaultPropertySet()).getMemorySizeProperty(PropertyKey.USER) instanceof StringProperty);
//  }

//failed_compile @Test
//  public void getLongPropertyTest() {
//    // Arrange, Act and Assert
//    assertTrue((new DefaultPropertySet()).getLongProperty(PropertyKey.USER) instanceof StringProperty);
//  }

//failed_compile @Test
//  public void getIntegerPropertyTest() {
//    // Arrange, Act and Assert
//    assertTrue((new DefaultPropertySet()).getIntegerProperty(PropertyKey.USER) instanceof StringProperty);
//  }

//failed_compile @Test
//  public void getBooleanPropertyTest() {
//    // Arrange, Act and Assert
//    assertTrue((new DefaultPropertySet()).getBooleanProperty(PropertyKey.USER) instanceof StringProperty);
//  }

//failed_compile @Test
//  public void getPropertyTest() {
//    // Arrange, Act and Assert
//    assertTrue((new DefaultPropertySet()).<Object>getProperty(PropertyKey.USER) instanceof StringProperty);
//  }
}
