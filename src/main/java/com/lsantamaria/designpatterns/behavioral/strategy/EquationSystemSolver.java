package com.lsantamaria.designpatterns.behavioral.strategy;

public class EquationSystemSolver {
  private EquationSystemStrategy equationSystemStrategy;

  public EquationSystemSolver(
      EquationSystemStrategy equationSystemStrategy) {
    this.equationSystemStrategy = equationSystemStrategy;
  }

  public EquationResult solveSystem(EquationSystem equationSystem){
    return this.equationSystemStrategy.solveEquation(equationSystem);
  }
}
