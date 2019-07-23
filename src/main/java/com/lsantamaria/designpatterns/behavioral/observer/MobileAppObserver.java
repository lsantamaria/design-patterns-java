package com.lsantamaria.designpatterns.behavioral.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MobileAppObserver implements BookingsObserver {
  private int numberOfViewers;
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  public void update(int numberOfViewers) {
    this.numberOfViewers = numberOfViewers;
    logger.info("Mobile observer: There are {} people viewing that booking", this.numberOfViewers);
  }
}
