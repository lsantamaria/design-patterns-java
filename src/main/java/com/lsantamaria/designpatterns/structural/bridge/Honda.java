package com.lsantamaria.designpatterns.structural.bridge;

class Honda extends Car{

  Honda(Engine engine){
    super(engine);
  }

  @Override
  public void accelerate() {
    System.out.println("Accelerating from Honda...");
    engine.speedUp();
  }
}
