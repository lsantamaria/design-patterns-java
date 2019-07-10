package com.lsantamaria.designpatterns.behavioral.visitor;

import com.lsantamaria.designpatterns.behavioral.visitor.carcomponents.Engine;
import com.lsantamaria.designpatterns.behavioral.visitor.carcomponents.Wheels;
import com.lsantamaria.designpatterns.behavioral.visitor.carcomponents.Window;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MOTInspectionTestCentre implements MOTVisitor {

  private Logger logger = LoggerFactory.getLogger(this.getClass());
  private boolean result = true;

  @Override
  public String getVisitorName() {
    return "TestCentre";
  }

  @Override
  public void visitWindow(Window window) {
    logger.info("Visiting window from visitor {}", getVisitorName());
    result = result && checkWindow();
  }

  @Override
  public void visitWheels(Wheels wheels) {
    logger.info("Visiting wheels from visitor {}", getVisitorName());
    result = result && checkWheels(wheels);
  }

  @Override
  public void visitEngine(Engine engine) {
    logger.info("Visiting engine from visitor {}", getVisitorName());
    result = result && checkEngine(engine);
  }

  private boolean checkWindow() {
    return true;
  }

  private boolean checkWheels(Wheels wheels) {
    return true;
  }

  private boolean checkEngine(Engine engine) {
    return true;
  }

  public boolean getTestResult() {
    return result;
  }
}
