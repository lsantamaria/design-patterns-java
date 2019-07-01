package com.lsantamaria.designpatterns.structural.proxy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LicensedTVProxy implements UKTVService {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private UKTVService realService;

  public LicensedTVProxy(UKTVService tvLicensedService) {
    realService = tvLicensedService;
  }

  @Override
  public void watch(Customer customer) throws NotALicensedUserException {

    if (Role.PAYMENT_USER.equals(customer.getRole())) {
      realService.watch(customer);
    } else {
      throw new NotALicensedUserException(
          "Customer " + customer.getName() + " does not have a license for watching TV");
    }
  }
}
