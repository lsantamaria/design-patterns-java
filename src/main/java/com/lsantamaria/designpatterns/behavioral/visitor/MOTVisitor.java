package com.lsantamaria.designpatterns.behavioral.visitor;

import com.lsantamaria.designpatterns.behavioral.visitor.carcomponents.Engine;
import com.lsantamaria.designpatterns.behavioral.visitor.carcomponents.Wheels;
import com.lsantamaria.designpatterns.behavioral.visitor.carcomponents.Window;

public interface MOTVisitor {

  String getVisitorName();

  void visitWindow(Window window);

  void visitWheels(Wheels wheels);

  void visitEngine(Engine engine);

}
