package com.springformation.demo.springformation.spring;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ConsoleMessagePrinter implements MessageProcessor{

  public void printMessage(String message) {
    System.out.println("Console message printed: " + message);
  }

  @Override
  public void processMessage(String message) {
    printMessage(message);
  }
}
