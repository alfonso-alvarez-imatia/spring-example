package com.springformation.demo.springformation.spring;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

  @Bean("consoleMessagePrinter")
  public ConsoleMessagePrinter getConsoleMessagePrinter() {
    return new ConsoleMessagePrinter();
  }

  @Bean("emailMessageSender")
  public EmailMessageSender getEmailMessageSender() {
    return new EmailMessageSender();
  }

  @Bean("jmsMessageSender")
  public JmsMessageSender getJmsMessageSender() {
    return new JmsMessageSender();
  }

  @Bean("whatsappMessageSender")
  public WhatsappMessageSender getWhatsappMessageSender() {
    List<String> telephoneNumbers = new ArrayList<>();
    String server = "10.12.80.195:995";
    return new WhatsappMessageSender(server, telephoneNumbers);
  }
}
