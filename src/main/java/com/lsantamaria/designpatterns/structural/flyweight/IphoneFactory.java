package com.lsantamaria.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class IphoneFactory {

  private static Map<Model, Iphone> iphoneCache = new HashMap<>();

  private IphoneFactory(){}

  public static Iphone getIphone(Model model){
    Iphone iphone = null;

    if(iphoneCache.containsKey(model)){
      iphone = iphoneCache.get(model);
    }
    else{
      iphone = new Iphone(model);
      iphoneCache.put(model, iphone);
    }
    return iphone;
  }

}
