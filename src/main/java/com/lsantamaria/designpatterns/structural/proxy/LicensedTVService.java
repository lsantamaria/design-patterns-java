package com.lsantamaria.designpatterns.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LicensedTVService implements UKTVService {
  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public void watch(Customer customer) throws NotALicensedUserException {
    logger.info("Customer "+customer.getName()+" is watching TV service");
  }
}
