package com.lsantamaria.designpatterns.behavioural.visitor;

import com.lsantamaria.designpatterns.behavioural.visitor.carcomponents.Engine;
import com.lsantamaria.designpatterns.behavioural.visitor.carcomponents.Wheels;
import com.lsantamaria.designpatterns.behavioural.visitor.carcomponents.Window;

public interface MOTVisitor {

  String getVisitorName();

  void visitWindow(Window window);

  void visitWheels(Wheels wheels);

  void visitEngine(Engine engine);

}
