package com.lsantamaria.designpatterns.structural.adapter;

import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.mockito.Mockito;

public class FlyingDeviceAdapterTest {

  @Test
  public void testAdapter(){
    FlyingVehicle airplane = new Airplane();
    airplane.takeOff();

    FlyingVehicle helicopter = new Helicopter();
    helicopter.takeOff();

    Drone drone = mock(Drone.class);
    FlyingDeviceAdapter flyingDeviceAdapter = new FlyingDeviceAdapter(drone);
    flyingDeviceAdapter.takeOff();

    //Verify that internally the adaptee object is called from the adapter
    Mockito.verify(drone).ascend();
  }

}
