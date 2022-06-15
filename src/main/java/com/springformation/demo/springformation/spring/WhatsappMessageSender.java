package com.springformation.demo.springformation.spring;

import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WhatsappMessageSender implements MessageProcessor{
  String server;
  List<String> telephoneNumbers;

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
