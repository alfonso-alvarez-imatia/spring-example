package com.springformation.demo;

import com.springformation.demo.springformation.spring.MessageReceiver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		MessageReceiver messageReceiver = applicationContext.getBean(MessageReceiver.class);
		messageReceiver.startMessageReceiver();
	}

}
