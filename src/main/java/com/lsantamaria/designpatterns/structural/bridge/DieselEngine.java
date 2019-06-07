package com.lsantamaria.designpatterns.structural.bridge;

class DieselEngine extends Engine{

  @Override
  void speedUp() {
    System.out.println("Speed up with a diesel engine");
  }
}
