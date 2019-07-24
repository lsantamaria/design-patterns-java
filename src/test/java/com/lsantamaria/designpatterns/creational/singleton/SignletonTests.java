package com.lsantamaria.designpatterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SignletonTests {

  @Test
  public void testUniqueInstance() {
    ApplicationConfig applicationConfig1 = ApplicationConfig.getInstance();
    ApplicationConfig applicationConfig2 = ApplicationConfig.getInstance();

    assertEquals(applicationConfig1, applicationConfig2);
  }

}
