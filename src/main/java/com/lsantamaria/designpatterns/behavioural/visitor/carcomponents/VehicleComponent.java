package com.lsantamaria.designpatterns.behavioural.visitor.carcomponents;

import com.lsantamaria.designpatterns.behavioural.visitor.MOTVisitor;

public interface VehicleComponent {

  String getName();

  void replace(VehicleComponent newComponent);

  void acceptCheck(MOTVisitor visitor);
}
