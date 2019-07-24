package com.lsantamaria.designpatterns.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Singleton pattern is meant to use it when we want to ensure that a class is instantiated only
 * once. At the same time the pattern ensures that that unique instance is accessed through the same
 * point in the code.
 *
 * In this example we will show the use of that pattern by implementing it through an application
 * configuration class. When the class is instantiated the first time, the DB and Locale
 * configuration are loaded. This pattern is really useful in situations where an expensive
 * operation has to be executed only once. This can be seen in this example.
 *
 * We can find an example of singleton instance in the Spring's framework beans configured with that
 * scope.
 */
public class SingletonProgram {

  public static void main(String... args) {
    Logger logger = LoggerFactory.getLogger(SingletonProgram.class);

    ApplicationConfig applicationConfig1 = ApplicationConfig.getInstance();
    ApplicationConfig applicationConfig2 = ApplicationConfig.getInstance();

    int hashCodeInstance1 = applicationConfig1.hashCode();
    int hashCodeInstance2 = applicationConfig2.hashCode();

    logger.info("Hashcode instance 1: " + hashCodeInstance1);
    logger.info("Hashcode instance 2: " + hashCodeInstance2);

    logger.info("Instances are equal? "+ (hashCodeInstance1 == hashCodeInstance2));
  }
}
