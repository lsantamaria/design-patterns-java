package com.lsantamaria.designpatterns.structural.decorator;

public abstract class CarDecorator implements StandardCar {
  private StandardCar standardCar;

  public CarDecorator(StandardCar standardCar) {
    this.standardCar = standardCar;
  }

  @Override
  public void produce() {
    standardCar.produce();
  }
}
