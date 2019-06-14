package com.lsantamaria.designpatterns.structural.decorator;

public class CarPaintingDecorator extends CarDecorator {

  public CarPaintingDecorator(StandardCar standardCar) {
    super(standardCar);
  }

  @Override
  public void produce() {
    paintCar();
    super.produce();
  }

  private void paintCar(){
    System.out.println("Painting car");
  }

}
