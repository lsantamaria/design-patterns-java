package com.lsantamaria.designpatterns.structural.facade.subsystem.impl;

import com.lsantamaria.designpatterns.structural.facade.Signal;
import com.lsantamaria.designpatterns.structural.facade.subsystem.Encoder;

public class Encoder8Bits implements Encoder {

  @Override
  public Signal encode(Signal inputSignal) {
    System.out.println("Encoding signal with 8 bits encoder...");
    return inputSignal;
  }
}
