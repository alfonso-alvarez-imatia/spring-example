package com.springformation.demo.springformation.nospring;

import java.util.ArrayList;
import java.util.List;

public class EmailMessageSender implements MessageProcessor {

   List<String> inCopy = new ArrayList<>();
   List<String> inBlindCopy = new ArrayList<>();

   public EmailMessageSender(List<String> inCopy, List<String> inBlindCopy) {
      this.inCopy = inCopy;
      this.inBlindCopy = inBlindCopy;
   }

   public EmailMessageSender() {
   }

   public void sendMailMessage(String message) {
      System.out.println("Mail message sent: " + message);
   }

   public List<String> getInCopy() {
      return inCopy;
   }

   public void setInCopy(List<String> inCopy) {
      this.inCopy = inCopy;
   }

   public List<String> getInBlindCopy() {
      return inBlindCopy;
   }

   public void setInBlindCopy(List<String> inBlindCopy) {
      this.inBlindCopy = inBlindCopy;
   }

   @Override
   public void processMessage(String message) {
      sendMailMessage(message);
   }
}
