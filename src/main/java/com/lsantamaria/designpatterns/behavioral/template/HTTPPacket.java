package com.lsantamaria.designpatterns.behavioral.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class HTTPPacket {
  private String src;
  private String dst;
}
