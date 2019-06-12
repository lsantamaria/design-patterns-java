package com.lsantamaria.designpatterns.structural.bridge;

import org.junit.Test;
import org.mockito.Mockito;

public class EngineBridgeTest {


  @Test
  public void testBridge(){
    Engine dieselEngine = Mockito.spy(DieselEngine.class);
    Engine electricEngine = Mockito.spy(ElectricEngine.class);

    Car honda = new Honda(electricEngine);
    Car bmw = new BMW(dieselEngine);

    honda.accelerate();
    bmw.accelerate();

    //Verify that the decoupled implementations are called when invoking the main abstraction
    Mockito.verify(dieselEngine).speedUp();
    Mockito.verify(electricEngine).speedUp();
  }



}
