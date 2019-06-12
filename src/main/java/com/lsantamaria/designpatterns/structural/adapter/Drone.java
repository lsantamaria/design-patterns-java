package com.lsantamaria.designpatterns.structural.adapter;

public class Drone extends FlyingDevice{
  @Override
  public void ascend() {
    System.out.println("Ascending with drone");
  }
}
