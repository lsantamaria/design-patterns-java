package com.lsantamaria.designpatterns.structural.composite;

public class InputText extends FormElement {

  protected InputText(String label, String value, String name) {
    super(label, value, name);
  }

  @Override
  public FormElementType getType() {
    return FormElementType.INPUT;
  }

  @Override
  public String renderHtml() {
    return "<label for='" + getName() + "'>" + getLabel() + "</label><br>"
        + "<input name='" + getName() + "' type='text' value='" + getValue() + "'/>";
  }
}
