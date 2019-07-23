package com.lsantamaria.designpatterns.structural.adapter;

/**
 * The adapter pattern allow two incompatible interfaces to work together.
 *
 * In this example, we have two different kind of flying objects: flying vehicles and flying
 * devices, which do not belong to the same tree structure. We are taking off with flying objects by
 * using the {@link FlyingVehicle} abstraction, but we can not take off a flying device since its
 * interface is not compatible with the abstraction.
 *
 * To overcome this problem we use the adapter pattern, which brings us the possibility of creating
 * an adapter object ({@link FlyingDeviceAdapter} that allows a flying device to take off by using
 * the {@link FlyingVehicle} abstraction.
 */
public class AdapterProgram {

  public static void main(String[] args) {

    FlyingVehicle airplane = new Airplane();
    airplane.takeOff();

    FlyingVehicle helicopter = new Helicopter();
    helicopter.takeOff();

    FlyingVehicle flyingDeviceAdapter = new FlyingDeviceAdapter(new Drone());
    flyingDeviceAdapter.takeOff();

  }

}
