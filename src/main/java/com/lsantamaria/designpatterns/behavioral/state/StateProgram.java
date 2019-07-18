package com.lsantamaria.designpatterns.behavioral.state;

/**
 * The state pattern objective is to decouple the internal state of a class moving it to an external
 * object. This allows to add/remove new states without having to modify the original class.
 *
 * In this example we are going to change the state of a notification. The notification can be in
 * one of this states: "created", "sent" and "executed". After being created, the notification is
 * sent, and after being sent it is executed, the last state. When it reaches the last state is not
 * possible to go back.
 *
 * In this case, the context object is the {@link Notification} class and its state is represented
 * with {@link NotificationState} class.
 *
 * We can see examples of the State pattern in the Java classes
 */
public class StateProgram {

  public static void main(String... args) {
    NotificationState createdState = CreatedState.getInstance();

    Notification notification = new Notification(createdState);

    notification.sendNotification();

    notification.execute();

  }

}
