package com.lsantamaria.designpatterns.structural.decorator;

public class CarMirrorsDecorator extends CarDecorator {

  public CarMirrorsDecorator(StandardCar standardCar) {
    super(standardCar);
  }

  @Override
  public void produce() {
    addMirrors();
    super.produce();
  }

  private void addMirrors(){
    System.out.println("Adding mirrors to standard car");
  }
}
