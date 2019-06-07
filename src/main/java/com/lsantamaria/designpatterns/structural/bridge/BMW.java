package com.lsantamaria.designpatterns.structural.bridge;

class BMW extends Car{

  BMW(Engine engine){
    super(engine);
  }

  @Override
  public void accelerate() {
    System.out.println("Accelerating from BMW...");
    engine.speedUp();
  }
}
