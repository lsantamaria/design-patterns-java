package com.lsantamaria.designpatterns.structural.composite;

import java.util.Collections;
import java.util.List;

/**
 * This class represents the abstraction of an HTML form element. An HTML form is composed by
 * different form elements that can be represented in this composite structure.
 *
 * In order to preserve transparency, this interface exposes methods to deal with children in
 * composite implementations. Hence, this implementations must implement them to work properly.
 */

public abstract class FormElement {

  protected FormElement(String label, String value, String name) {
    this.label = label;
    this.value = value;
    this.name = name;
  }
  private String label;
  private String value;
  private String name;

  public abstract FormElementType getType();

  public abstract String renderHtml();

  public String getLabel(){
    return label;
  }

  public String getValue(){
    return value;
  }

  public String getName(){
    return name;
  }

  public List<FormElement> getChildren() {
    return Collections.emptyList();
  }

  public void addElement(FormElement element) {
    throw new UnsupportedOperationException("Operation not compatible");
  }

  public void removeElement(FormElement element) {
    throw new UnsupportedOperationException("Operation not compatible");
  }

}
