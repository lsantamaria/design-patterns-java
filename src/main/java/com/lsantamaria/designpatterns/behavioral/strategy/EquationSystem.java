package com.lsantamaria.designpatterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EquationSystem {
  private Equation equation1;
  private Equation equation2;
}
