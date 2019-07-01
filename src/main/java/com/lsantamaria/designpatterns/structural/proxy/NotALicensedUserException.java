package com.lsantamaria.designpatterns.structural.proxy;

public class NotALicensedUserException extends RuntimeException {

  public NotALicensedUserException() {
    super();
  }

  public NotALicensedUserException(String message) {
    super(message);
  }

  public NotALicensedUserException(String message, Throwable cause) {
    super(message, cause);
  }
}
