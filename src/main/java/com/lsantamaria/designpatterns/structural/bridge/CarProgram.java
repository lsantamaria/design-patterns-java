package com.lsantamaria.designpatterns.structural.bridge;

/**
 * In this program we show the use of Bridge design pattern. That pattern allow us to decouple an
 * abstraction from their implementations.
 *
 * In our case, our first abstraction is the {@link Car} class, which has different implementations
 * based on the manufacturer brand. Since the cars can work with different kind of engines, we have
 * created the second abstraction named {@link Engine}. This second abstraction structure is acting
 * as a bridge because it will be injected to the main abstraction and the underlying implementation
 * could vary in runtime.
 *
 * The bridge pattern allow to add new implementations without having to modify the original
 * abstraction. For instance, we could add a new kind of engine without modifying any of the
 * existing code nor recompiling it again.
 */
public class CarProgram {

  public static void main(String... args) {
    Engine dieselEngine = new DieselEngine();
    Engine electricEngine = new ElectricEngine();

    Car honda = new Honda(electricEngine);
    Car bmw = new BMW(dieselEngine);

    honda.accelerate();
    bmw.accelerate();

  }

}
