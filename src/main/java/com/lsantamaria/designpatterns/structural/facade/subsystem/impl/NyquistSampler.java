package com.lsantamaria.designpatterns.structural.facade.subsystem.impl;

import com.lsantamaria.designpatterns.structural.facade.Signal;
import com.lsantamaria.designpatterns.structural.facade.subsystem.Sampler;

public class NyquistSampler implements Sampler {

  @Override
  public Signal sample(Signal inputSignal) {
    System.out.println("Sampling input signal according to Nyquist criteria...");
    return inputSignal;
  }
}
