package com.lsantamaria.designpatterns.behavioral.visitor.carcomponents;

import com.lsantamaria.designpatterns.behavioral.visitor.MOTVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wheels implements VehicleComponent {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Override
  public String getName() {
    return this.getClass().getSimpleName();
  }

  @Override
  public void replace(VehicleComponent newComponent) {
    logger.info("Replacing component {} for new component {} ...", getName(), newComponent.getName());
  }

  @Override
  public void acceptCheck(MOTVisitor visitor) {
    logger.info("Accepting check from component {} by visitor {} ...", getName(), visitor.getVisitorName());
    visitor.visitWheels(this);
  }
}
