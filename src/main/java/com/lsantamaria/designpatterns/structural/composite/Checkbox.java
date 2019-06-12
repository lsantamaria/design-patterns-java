package com.lsantamaria.designpatterns.structural.composite;

public class Checkbox extends FormElement {

  protected Checkbox(String label, String value, String name) {
    super(label, value, name);
  }

  @Override
  public FormElementType getType() {
    return FormElementType.CHECKBOX;
  }

  @Override
  public String renderHtml() {
    return "<label for='" + getName() + "'>" + getLabel() + "</label><br> "
        + "<input name='" + getName() + "' type='checkbox' value='" + getValue() + "'/>";
  }
}
