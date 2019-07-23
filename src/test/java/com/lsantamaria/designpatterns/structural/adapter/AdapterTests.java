package com.lsantamaria.designpatterns.structural.adapter;

import org.junit.Test;
import org.mockito.Mockito;

public class AdapterTests {

  @Test
  public void testAdapter(){
    FlyingVehicle airplane = new Airplane();
    airplane.takeOff();

    FlyingVehicle helicopter = new Helicopter();
    helicopter.takeOff();

    Drone drone = Mockito.mock(Drone.class);
    FlyingDeviceAdapter flyingDeviceAdapter = new FlyingDeviceAdapter(drone);
    flyingDeviceAdapter.takeOff();

    //Verify that internally the adaptee object is called from the adapter
    Mockito.verify(drone).ascend();
  }

}
