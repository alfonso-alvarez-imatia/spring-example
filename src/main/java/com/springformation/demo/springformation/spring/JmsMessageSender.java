package com.springformation.demo.springformation.spring;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class JmsMessageSender implements MessageProcessor{

  public void enqueueMessage(String message) {
    if(isQueueActive()) {
      System.out.println("Message enqueued via JMS: " + message);
    }
    else {
      System.out.println("Unable to send message via Queue of JMS: " + message);
    }
  }

  public void notifyUsers() {
    System.out.println("Notificados los usuarios.");
  }

  private boolean isQueueActive() {
    return false;
  }

  @Override
  public void processMessage(String message) {
    enqueueMessage(message);
    notifyUsers();
  }
}
