package com.lsantamaria.designpatterns.structural.adapter;

public class Airplane implements FlyingVehicle{
  @Override
  public void takeOff() {
    System.out.println("Taking off with airplane");
  }
}
