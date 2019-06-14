package com.lsantamaria.designpatterns.structural.decorator;

public class CarImpl implements StandardCar {

  @Override
  public void produce() {
    System.out.println("Producing car...");
  }
}
