package com.winocencio.labelpropertietest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LabelTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabelTestApplication.class, args);
	}

	@Bean
	public MessagesResourceBundle messagesResourceBundle() {
		return new MessagesResourceBundle();
	}

}
