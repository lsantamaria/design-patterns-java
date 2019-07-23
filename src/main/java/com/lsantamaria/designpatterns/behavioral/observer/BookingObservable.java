package com.lsantamaria.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class BookingObservable {
  private int usersViewing;
  private List<BookingsObserver> observers = new ArrayList<>();

  public void addObserver(BookingsObserver observer){
    this.observers.add(observer);
  }

  public void removeObserver(BookingsObserver observer){
    this.observers.remove(observer);
  }

  public void updateViewers(int usersViewing){
    this.usersViewing = usersViewing;
    observers.forEach(observer -> observer.update(this.usersViewing));
  }
}
