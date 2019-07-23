package com.lsantamaria.designpatterns.behavioral.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Observer pattern's objective is to define a one-to-many relation of objects with the less
 * coupling possible. Since it is a relationship, when the one side is updated, all the decoupled
 * objects of the "many" side are notified. Observer patMobileAppObservertern define the "one" side
 * as the subject or observable and the "many" side as the observers.
 *
 * In this example we will show its usage implementing a holiday booking use case. In this scenario,
 * the subject will  be the booking advert whereas the observers will be all the different devices
 * that are observing it. When the system decides to update the number of viewers of the same
 * booking, it will update the subject and this will notify that change to all the observers.
 */
public class ObserverProgram {

  private static final Logger logger = LoggerFactory.getLogger(ObserverProgram.class);

  public static void main(String... args){
    MobileAppObserver mobile1 = new MobileAppObserver();
    BrowserObserver browser1 = new BrowserObserver();

    BookingObservable booking = new BookingObservable();

    //Adding first observers
    booking.addObserver(mobile1);
    booking.addObserver(browser1);

    logger.info("Updating viewers to 2...");
    booking.updateViewers(2);

    booking.removeObserver(mobile1);

    logger.info("Updating viewers to 1...");
    booking.updateViewers(1);
  }

}
