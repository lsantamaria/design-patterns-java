package com.lsantamaria.designpatterns.behavioral.strategy;

import java.util.Map;

public class EquationSystemSolver {
  private EquationSystemStrategy equationSystemStrategy;

  public EquationSystemSolver(
      EquationSystemStrategy equationSystemStrategy) {
    this.equationSystemStrategy = equationSystemStrategy;
  }

  public Map.Entry<Integer, Integer> solveSystem(EquationSystem equationSystem){
    return this.equationSystemStrategy.solveEquation(equationSystem);
  }
}
