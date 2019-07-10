package com.lsantamaria.designpatterns.behavioral.visitor.carcomponents;

import com.lsantamaria.designpatterns.behavioral.visitor.MOTVisitor;

public interface VehicleComponent {

  String getName();

  void replace(VehicleComponent newComponent);

  void acceptCheck(MOTVisitor visitor);
}
