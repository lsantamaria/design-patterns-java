package com.lsantamaria.designpatterns.structural.facade.subsystem.impl;

import com.lsantamaria.designpatterns.structural.facade.Signal;
import com.lsantamaria.designpatterns.structural.facade.subsystem.Filter;

public class AntialiasingFilter implements Filter {

  @Override
  public Signal filter(Signal inputSignal) {
    System.out.println("Filtering signal to avoid aliasing...");
    return inputSignal;
  }
}
