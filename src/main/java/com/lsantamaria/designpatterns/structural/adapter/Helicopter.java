package com.lsantamaria.designpatterns.structural.adapter;

class Helicopter extends FlyingVehicle{

  @Override
  public void takeOff() {
    System.out.println("Taking off with helicopter");
  }
}
