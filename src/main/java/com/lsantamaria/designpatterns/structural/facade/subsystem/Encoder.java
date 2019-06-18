package com.lsantamaria.designpatterns.structural.facade.subsystem;

import com.lsantamaria.designpatterns.structural.facade.Signal;

public interface Encoder {
  Signal encode(Signal inputSignal);
}
