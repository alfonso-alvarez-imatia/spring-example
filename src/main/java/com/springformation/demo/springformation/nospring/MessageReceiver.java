package com.springformation.demo.springformation.nospring;

public class MessageReceiver {

  MessageProcessor consoleMessagePrinter = ApplicationContext.getConsoleMessagePrinter();
  MessageProcessor emailMessageSender = ApplicationContext.getEmailMessageSender();
  MessageProcessor jmsMessageSender = ApplicationContext.getJmsMessageSender();
  MessageProcessor whatsappMessageSender = ApplicationContext.getWhatsappMessageSender();

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
