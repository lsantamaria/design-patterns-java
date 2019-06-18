package com.lsantamaria.designpatterns.structural.facade.subsystem;

import com.lsantamaria.designpatterns.structural.facade.Signal;

public interface Sampler {
  Signal sample(Signal inputSignal);
}
