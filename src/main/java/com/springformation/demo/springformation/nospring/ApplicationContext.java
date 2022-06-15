package com.springformation.demo.springformation.nospring;

import java.util.ArrayList;
import java.util.List;

public class ApplicationContext {
  public static ConsoleMessagePrinter getConsoleMessagePrinter() {
    return new ConsoleMessagePrinter();
  }

  public static EmailMessageSender getEmailMessageSender() {
    return new EmailMessageSender();
  }

  public static JmsMessageSender getJmsMessageSender() {
    return new JmsMessageSender();
  }

  public static WhatsappMessageSender getWhatsappMessageSender() {
    List<String> telephoneNumbers = new ArrayList<>();
    String server = "10.12.80.195:995";
    return new WhatsappMessageSender(server, telephoneNumbers);
  }
}
