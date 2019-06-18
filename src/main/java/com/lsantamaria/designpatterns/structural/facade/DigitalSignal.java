package com.lsantamaria.designpatterns.structural.facade;

public class DigitalSignal extends Signal {

  @Override
  SignalType getType() {
    return SignalType.DIGITAL;
  }
}
