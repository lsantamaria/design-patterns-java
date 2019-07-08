package com.lsantamaria.designpatterns.behavioural.visitor.carcomponents;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

  private List<VehicleComponent> components = new ArrayList<>();

  public void addComponent(VehicleComponent component){
    this.components.add(component);
  }

  public void removeComponent(VehicleComponent component){
    this.components.remove(component);
  }

  public List<VehicleComponent> getComponents(){
    return components;
  }

}
