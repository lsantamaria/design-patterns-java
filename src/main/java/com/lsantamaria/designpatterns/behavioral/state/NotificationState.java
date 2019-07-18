package com.lsantamaria.designpatterns.behavioral.state;


public interface NotificationState {
  void sendNotification(Notification notification);
  void execute(Notification notification);

}
