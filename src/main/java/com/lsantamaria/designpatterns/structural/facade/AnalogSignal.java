package com.lsantamaria.designpatterns.structural.facade;

public class AnalogSignal extends Signal {

  @Override
  SignalType getType() {
    return SignalType.ANALOG;
  }
}
