package com.lsantamaria.designpatterns.behavioral.strategy;

import java.util.Map;

public abstract class EquationSystemStrategy {
  public abstract Map.Entry<Integer, Integer> solveEquation(EquationSystem equationSystem);
}
