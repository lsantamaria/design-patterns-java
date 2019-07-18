package com.lsantamaria.designpatterns.behavioral.state;


public class ExecutedState implements NotificationState {
  private static ExecutedState instance = new ExecutedState();

  private ExecutedState(){}

  public static ExecutedState getInstance(){
    return instance;
  }

  @Override
  public void sendNotification(Notification notification) {
    throw new IllegalStateException("Can not send a notification from an executed state");
  }

  @Override
  public void execute(Notification notification) {
    throw new IllegalStateException("Can not execute a notification from an executed state");
  }


}
