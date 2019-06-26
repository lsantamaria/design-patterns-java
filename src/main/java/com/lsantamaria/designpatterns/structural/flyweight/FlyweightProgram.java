package com.lsantamaria.designpatterns.structural.flyweight;

/**
 * Flyweight pattern helps reducing the amount of memory consumed by a program due to the object
 * instantiation. When our application has to create a huge quantity of objects with the same
 * properties, it is worth to cache that objects and not instantiate them twice.
 *
 * In this example we will show the pattern applied to the iphone production. If a factory need to
 * produce several units of the same iphone model, these objects should be in a cache and be
 * delivered as soon as they are requested. In this simple program we will demonstrate that no
 * matter how many objects of the same type we are requesting, the provided instance will be the
 * same.
 */
public class FlyweightProgram {

  public static void main(String... args) {

    Iphone iphoneEightOne = IphoneFactory.getIphone(Model.EIGHT);
    Iphone iphoneEightTwo = IphoneFactory.getIphone(Model.EIGHT);
    Iphone iphoneEightThree = IphoneFactory.getIphone(Model.EIGHT);

    System.out.println(iphoneEightOne == iphoneEightTwo);
    System.out.println(iphoneEightTwo == iphoneEightThree);
  }

}
