package com.lsantamaria.designpatterns.structural.composite;

import java.util.Arrays;
import java.util.List;

/**
 * The composite pattern allow us to define structures of objects in which we can treat composite or
 * individual objects in the same way.
 *
 * Below we show an example of that pattern. The main abstraction, {@link FormElement}, represents
 * an HTML form element. It has three implementations, two of them are "leaves"(checkbox,input) and
 * the other is a composite(listgroup) which can contain several form elements. The main abstraction
 * contain methods that must only be invoked from a composite object, like <code>addElement()</code>
 * and <code>removeElement()</code>. These methods are there to provide transparency across the
 * object tree.
 *
 * This example shows how to render the HTML of both composite and individual elements without
 * distinguish them.
 */
public class FormsProgram {

  public static void main(String... args) {
    FormElement checkbox = new Checkbox("Are you married?", "true", "marriage");
    FormElement inputText = new InputText("How old are you?", "45", "age");

    FormElement personalQuestionsGroup = new ListGroup("Personal questions", "", "questions");
    personalQuestionsGroup.addElement(checkbox);
    personalQuestionsGroup.addElement(inputText);

    FormElement singleQuestion = new Checkbox("Do you smoke?", "true", "smoke");

    List<FormElement> formElementList = Arrays.asList(personalQuestionsGroup, singleQuestion);

    renderHtml(formElementList);
  }

  private static void renderHtml(List<FormElement> elements) {
    System.out.println("Rendered HTML:");
    elements.forEach(x -> System.out.println(x.renderHtml()));
  }

}
