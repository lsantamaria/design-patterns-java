package com.lsantamaria.designpatterns.behavioral.state;

public class Notification {

  private NotificationState notificationState;

  public Notification(NotificationState notificationState) {
    this.notificationState = notificationState;
  }

  void sendNotification() {
    notificationState.sendNotification(this);
  }

  void execute() {
    notificationState.execute(this);
  }

  public void setState(NotificationState notificationState) {
    this.notificationState = notificationState;
  }

}
