package com.lsantamaria.designpatterns.structural.adapter;

public class Airplane extends FlyingVehicle{
  @Override
  public void takeOff() {
    System.out.println("Taking off with airplane");
  }
}
