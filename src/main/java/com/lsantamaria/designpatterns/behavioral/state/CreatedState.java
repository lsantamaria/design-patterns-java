package com.lsantamaria.designpatterns.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreatedState implements NotificationState {
  private static final Logger logger = LoggerFactory.getLogger(NotificationState.class);
  private static CreatedState instance = new CreatedState();

  private CreatedState(){}

  public static CreatedState getInstance(){
    return instance;
  }

  @Override
  public void sendNotification(Notification notification) {
    logger.info("Sending notification...");
    logger.info("Transitioning to sent state");
    notification.setState(SentState.getInstance());
  }

  @Override
  public void execute(Notification notification) {
    throw new IllegalStateException("Can not execute from a created state");
  }

}
