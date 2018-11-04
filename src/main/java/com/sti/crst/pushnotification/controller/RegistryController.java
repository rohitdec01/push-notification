package com.sti.crst.pushnotification.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sti.crst.pushnotification.config.FcmClient;

import reactor.core.publisher.Mono;

@RestController
@CrossOrigin
public class RegistryController {

	private final FcmClient fcmClient;

	public RegistryController(FcmClient fcmClient) {
		this.fcmClient = fcmClient;
	}

	@PostMapping("/register")
	public void register(@RequestBody Mono<String> token) {
		token.subscribe(t -> this.fcmClient.subscribe("chuck", t));
	}
	
	/*@PostMapping("/register")
	public void register(@RequestParam("token") Mono<String> token) {
		token.subscribe(t -> this.fcmClient.subscribe("chuck", t));
	}*/

}
