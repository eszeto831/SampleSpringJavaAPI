package com.seatoadgames.SampleSpringJavaAPI;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

	@GetMapping("/")
	public Message defaultCase() {
		return new Message("Hello World!");
	}

	@GetMapping("/api")
	public Message defaultApiCase() {
		return new Message("Hello from server API!");
	}
}