package com.lsantamaria.designpatterns.behavioral.strategy;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubstitutionStrategy extends EquationSystemStrategy {
  Logger logger = LoggerFactory.getLogger(this.getClass());

  @Override
  public Map.Entry<Integer, Integer> solveEquation(EquationSystem equationSystem) {
    logger.info("Solving equation by substitution strategy");
    return new SimpleEntry<>(3, -2);
  }
}
