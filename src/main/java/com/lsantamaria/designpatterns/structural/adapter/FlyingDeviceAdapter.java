package com.lsantamaria.designpatterns.structural.adapter;

class FlyingDeviceAdapter extends FlyingVehicle {

  private FlyingDevice flyingDevice;

  FlyingDeviceAdapter(FlyingDevice flyingDevice) {
    this.flyingDevice = flyingDevice;
  }

  @Override
  public void takeOff() {
    System.out.println("Taking off with adapted flying device: " + flyingDevice.getClass().getSimpleName());
    flyingDevice.ascend();
  }
}
