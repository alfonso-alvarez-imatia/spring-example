package com.springformation.demo;

import com.springformation.demo.springformation.nospring.ApplicationContext;
import com.springformation.demo.springformation.nospring.MessageReceiver;

public class DemoAppNoSpring {
  public static void main(String[] args) {
    MessageReceiver messageReceiver = new MessageReceiver();
    messageReceiver.startMessageReceiver();
  }
}
