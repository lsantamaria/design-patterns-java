package com.lsantamaria.designpatterns.structural.facade.subsystem.impl;

import com.lsantamaria.designpatterns.structural.facade.Signal;
import com.lsantamaria.designpatterns.structural.facade.subsystem.Quantifier;

public class NormalizedQuantifier implements Quantifier {

  @Override
  public Signal quantify(Signal inputSignal) {
    System.out.println("Quantifying input signal...");
    return inputSignal;
  }
}
