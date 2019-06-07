package com.lsantamaria.designpatterns.structural.adapter;

class Helicopter implements FlyingVehicle{

  @Override
  public void takeOff() {
    System.out.println("Taking off with helicopter");
  }
}
