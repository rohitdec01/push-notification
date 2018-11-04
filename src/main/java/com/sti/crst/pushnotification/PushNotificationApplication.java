package com.sti.crst.pushnotification;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.firebase.FirebaseException;

/**
 * @author LSYSR1B
 *
 */
@SpringBootApplication
@EnableScheduling
public class PushNotificationApplication {

	public static void main(String[] args)
			throws FirebaseException, JsonParseException, JsonMappingException, IOException {
		SpringApplication.run(PushNotificationApplication.class, args);
	}

	@Bean
	public WebClient webClient() {
		return WebClient.create();
	}
}
