package com.springformation.demo.springformation.nospring;

public class ConsoleMessagePrinter implements MessageProcessor {
  public ConsoleMessagePrinter() {
  }

  public void printMessage(String message) {
    System.out.println("Console message printed: " + message);
  }

  @Override
  public void processMessage(String message) {
    printMessage(message);
  }
}
