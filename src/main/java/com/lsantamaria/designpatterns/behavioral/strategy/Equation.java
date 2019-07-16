package com.lsantamaria.designpatterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Equation {
  private int x;
  private int y;
  private int isolated;
  private int result;

}
