package com.springformation.demo.springformation.spring;


import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailMessageSender implements MessageProcessor {

  List<String> inCopy = new ArrayList<>();
  List<String> inBlindCopy = new ArrayList<>();

  public void sendMailMessage(String message) {
    System.out.println("Mail message sent: " + message);
  }

  @Override
  public void processMessage(String message) {
    sendMailMessage(message);
  }
}