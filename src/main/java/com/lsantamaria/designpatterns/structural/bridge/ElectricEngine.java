package com.lsantamaria.designpatterns.structural.bridge;

class ElectricEngine extends Engine{

  @Override
  void speedUp() {
    System.out.println("Speed up with an electric engine");
  }
}
