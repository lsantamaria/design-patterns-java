package com.lsantamaria.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListGroup extends FormElement {

  private List<FormElement> children = new ArrayList<>();

  protected ListGroup(String label, String value, String name) {
    super(label, value, name);
  }

  @Override
  public FormElementType getType() {
    return FormElementType.GROUP;
  }

  @Override
  public String renderHtml() {
    String childrenHtml =
        getChildren()
            .stream()
            .map(FormElement::renderHtml)
            .collect(Collectors.joining());

    return "<label for='" + getName()+ "'>" + getLabel() + "</label>"
        + childrenHtml;
  }

  @Override
  public void addElement(FormElement element){
    this.children.add(element);
  }

  @Override
  public void removeElement(FormElement element) {
    this.children.remove(element);
  }

  @Override
  public List<FormElement> getChildren(){
    return children;
  }
}
