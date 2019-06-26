package com.lsantamaria.designpatterns.structural.flyweight;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@EqualsAndHashCode
@RequiredArgsConstructor
public final class Iphone {
  private final Model model;
}
