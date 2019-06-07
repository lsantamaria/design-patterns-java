package com.lsantamaria.designpatterns.structural.bridge;

abstract class Car{
  protected Engine engine;

  Car(Engine engine){
    this.engine = engine;
  }

  public abstract void accelerate();
}
