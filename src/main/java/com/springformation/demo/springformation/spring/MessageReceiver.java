package com.springformation.demo.springformation.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MessageReceiver {

  @Autowired
  @Qualifier("consoleMessagePrinter")
  MessageProcessor consoleMessagePrinter;
  @Autowired
  @Qualifier("emailMessageSender")
  MessageProcessor emailMessageSender;
  @Autowired
  @Qualifier("jmsMessageSender")
  MessageProcessor jmsMessageSender;
  @Autowired
  @Qualifier("whatsappMessageSender")
  MessageProcessor whatsappMessageSender;

  // DEPENDECY INVERSION (DI)
  public void startMessageReceiver() {
    String message = receiveMessage();
    consoleMessagePrinter.processMessage(message);
    emailMessageSender.processMessage(message);
    jmsMessageSender.processMessage(message);
    whatsappMessageSender.processMessage(message);


  }

  private static String receiveMessage() {
    return "Un mensaje de prueba";
  }
}