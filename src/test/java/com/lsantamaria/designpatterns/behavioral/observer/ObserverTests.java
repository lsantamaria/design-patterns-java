package com.lsantamaria.designpatterns.behavioral.observer;

import static org.mockito.Mockito.times;

import org.junit.Test;
import org.mockito.Mockito;

public class ObserverTests {

  @Test
  public void testObserverViewersAdded(){
    int numberOfObservers = 2;
    BookingsObserver mobile = Mockito.mock(MobileAppObserver.class);
    BookingsObserver browser = Mockito.mock(BrowserObserver.class);

    BookingObservable bookingObservable = new BookingObservable();
    bookingObservable.addObserver(mobile);
    bookingObservable.addObserver(browser);

    bookingObservable.updateViewers(numberOfObservers);

    Mockito.verify(mobile, times(1)).update(numberOfObservers);
    Mockito.verify(browser, times(1)).update(numberOfObservers);
  }

  @Test
  public void testObserverViewersRemoved(){
    int afterDeleteObserversNumber = 1;
    BookingsObserver mobile = Mockito.mock(MobileAppObserver.class);
    BookingsObserver browser = Mockito.mock(BrowserObserver.class);

    BookingObservable bookingObservable = new BookingObservable();
    bookingObservable.addObserver(mobile);
    bookingObservable.addObserver(browser);

    bookingObservable.removeObserver(mobile);
    bookingObservable.updateViewers(afterDeleteObserversNumber);

    Mockito.verify(mobile, times(0)).update(afterDeleteObserversNumber);
    Mockito.verify(browser, times(1)).update(afterDeleteObserversNumber);
  }
}
