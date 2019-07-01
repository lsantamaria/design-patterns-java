package com.lsantamaria.designpatterns.structural.proxy;

/**
 * Proxy pattern provides a replacement custom class. This is useful in situations when we want to
 * execute some operations before invoking the real class. There are four kind of proxy pattern
 * usages: remote, virtual, protection proxy and smart reference.
 *
 * In this example we will show a simple usage of a protection proxy for protecting access to
 * licensed TV. The client will use a proxied instance of the tv service which will have the control
 * of allowing the tv to be watched.
 */
public class ProxyProgram {

  public static void main(String... args){
    UKTVService uktvService = new LicensedTVProxy(new LicensedTVService());
    Customer freeUser = new Customer("Free user", Role.FREE_USER);
    Customer paymentUser = new Customer("Payment user", Role.PAYMENT_USER);

    uktvService.watch(paymentUser);

    try {
      uktvService.watch(freeUser);
    }
    catch(NotALicensedUserException e){
      e.printStackTrace();
    }

  }

}
