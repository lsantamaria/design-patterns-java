package com.lsantamaria.designpatterns.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Strategy pattern pretend to encapsulate different algorithms for performing a concrete operation
 * so they can be selected separately at runtime.
 *
 * In this example we will use this pattern to solve equations systems. The user will select the
 * algorithm to be used so the corresponding strategy object will be applied to the equation
 * solving. Although in this case the result is the same because the three methods do the same
 * function, it could be used for different algorithms that not get the same result.
 *
 * We can find an example of strategy in the Java package
 */
public class StrategyProgram {

  private static Map<Integer, EquationSystemStrategy> strategies = new HashMap<>() {{
    put(1, new GraphStrategy());
    put(2, new SubstitutionStrategy());
    put(3, new EliminationStrategy());

  }};

  public static void main(String... args) {
    Equation equation1 = new Equation(4, 2, 0, 8);
    Equation equation2 = new Equation(5, 3, -9, 0);
    EquationSystem equationSystem = new EquationSystem(equation1, equation2);

    while (true) {
      Scanner scanner = new Scanner(System.in);
      System.out.println(
                "=====================\n "
              + "How do you want to solve the equation? "
              + "\n - 1:Graph "
              + "\n - 2:Substitution "
              + "\n - 3:Elimination"
      );
      int strategy = scanner.nextInt();
      EquationSystemStrategy selectedStrategy = strategies.get(strategy);
      EquationSystemSolver equationSystemSolver = new EquationSystemSolver(selectedStrategy);

      Map.Entry<Integer, Integer> result = equationSystemSolver.solveSystem(equationSystem);

      System.out
          .println("Equation result: x = " + result.getKey() + ", y=" + result.getValue() + "\n\n");
    }
  }

}
