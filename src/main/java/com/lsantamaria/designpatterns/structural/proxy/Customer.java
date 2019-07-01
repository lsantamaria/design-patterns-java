package com.lsantamaria.designpatterns.structural.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
  private String name;
  private Role role;
}
