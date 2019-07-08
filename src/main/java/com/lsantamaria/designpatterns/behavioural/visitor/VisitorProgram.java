package com.lsantamaria.designpatterns.behavioural.visitor;

import com.lsantamaria.designpatterns.behavioural.visitor.carcomponents.Engine;
import com.lsantamaria.designpatterns.behavioural.visitor.carcomponents.Vehicle;
import com.lsantamaria.designpatterns.behavioural.visitor.carcomponents.VehicleComponent;
import com.lsantamaria.designpatterns.behavioural.visitor.carcomponents.Wheels;
import com.lsantamaria.designpatterns.behavioural.visitor.carcomponents.Window;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Visitor pattern allows to apply new operations on the elements of an object structure without
 * having to modify their classes. It basically defines a set of operations to be performed on an
 * object structure. These operations are defined in a class called visitor which is sent through
 * that structure in order to apply every concrete operation in every element.
 *
 * In this example we are going to illustrate it with the example of a MOT vehicle check. The MOT
 * contains different operations for different vehicle components, so what would be better than
 * creating a visitor for that purpose. The {@link VehicleComponent} contract accepts a visitor as
 * an argument so the component will execute the corresponding operation defined in the visitor.
 *
 * It would be possible to create another visitor implementations to perform that operations
 * differently.
 *
 * This way, if the vehicle now has a new component, we will only need to define its particular
 * operation in the visitor, without modifying the car components classes.
 */
public class VisitorProgram {

  private static Logger logger = LoggerFactory.getLogger(VisitorProgram.class);

  public static void main(String... args) {
    Wheels wheels = new Wheels();
    Window window = new Window();
    Engine engine = new Engine();

    Vehicle vehicle = new Vehicle();
    vehicle.addComponent(wheels);
    vehicle.addComponent(window);
    vehicle.addComponent(engine);

    MOTInspectionTestCentre testCentreVisitor = new MOTInspectionTestCentre();

    for (VehicleComponent component : vehicle.getComponents()) {
      component.acceptCheck(testCentreVisitor);
    }

    logger.info("Result of the check: " + testCentreVisitor.getTestResult());
  }

}
