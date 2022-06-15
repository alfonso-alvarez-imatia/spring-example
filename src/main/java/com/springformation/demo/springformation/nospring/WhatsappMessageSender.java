package com.springformation.demo.springformation.nospring;

import java.util.List;

public class WhatsappMessageSender implements MessageProcessor{
  List<String> telephoneNumbers;
  String server;

  public WhatsappMessageSender(String server, List<String> telephoneNumbers) {
    this.telephoneNumbers = telephoneNumbers;
    this.server = server;
  }

  public void sendWhatsappMessage(String message) {
    String finalMessage = concatEmoji(message);
    System.out.println("Message sent via Whatsapp: " + finalMessage);
  }

  public String concatEmoji(String message) {
    return message.concat(":-D");
  }

  public void notifyUsers() {
    System.out.println("Notificados los usuarios.");
  }

  @Override
  public void processMessage(String message) {
    sendWhatsappMessage(message);
    notifyUsers();
  }
}
