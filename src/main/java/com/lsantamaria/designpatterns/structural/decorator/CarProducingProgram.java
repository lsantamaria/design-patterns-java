package com.lsantamaria.designpatterns.structural.decorator;

/**
 * This is a program that shows an example of the decorator pattern (recursive). This pattern allow
 * to add additional functionality to an existing class in a transparent way.
 *
 * There are two decorators conforming the {@link CarDecorator} contract, which implements the same
 * interface that the class to decorate {@link StandardCar}. This allow us to add different new
 * features to the car without modifying its original behaviour.
 */
public class CarProducingProgram {

  public static void main(String... args) {
    StandardCar car = new CarImpl();
    StandardCar carPainted = new CarPaintingDecorator(car);
    StandardCar carWithMirrorsPainted = new CarMirrorsDecorator(carPainted);

    carWithMirrorsPainted.produce();
  }
}
