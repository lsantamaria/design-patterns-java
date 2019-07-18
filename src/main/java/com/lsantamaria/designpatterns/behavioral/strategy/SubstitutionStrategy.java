package com.lsantamaria.designpatterns.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubstitutionStrategy extends EquationSystemStrategy {
  Logger logger = LoggerFactory.getLogger(this.getClass());

  @Override
  public EquationResult solveEquation(EquationSystem equationSystem) {
    logger.info("Solving equation by substitution strategy");
    return new EquationResult();
  }
}
