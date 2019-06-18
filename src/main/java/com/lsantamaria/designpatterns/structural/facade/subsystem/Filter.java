package com.lsantamaria.designpatterns.structural.facade.subsystem;

import com.lsantamaria.designpatterns.structural.facade.Signal;

public interface Filter {
  Signal filter(Signal inputSignal);
}
