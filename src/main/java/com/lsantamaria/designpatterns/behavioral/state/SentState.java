package com.lsantamaria.designpatterns.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SentState implements NotificationState {
  private static final Logger logger = LoggerFactory.getLogger(NotificationState.class);
  private static SentState instance = new SentState();

  private SentState(){}

  public static SentState getInstance(){
    return instance;
  }

  @Override
  public void sendNotification(Notification notification) {
    throw new IllegalStateException("Can not send a notification from a sent state");
  }

  @Override
  public void execute(Notification notification) {
    logger.info("Executing notification...");
    logger.info("Transitioning to executed state");
    notification.setState(ExecutedState.getInstance());
  }

}
