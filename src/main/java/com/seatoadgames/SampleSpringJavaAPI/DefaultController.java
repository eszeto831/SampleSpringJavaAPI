package com.seatoadgames.SampleSpringJavaAPI;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
	
	@GetMapping("/api")
	public MessageResponse defaultApiCase() {
		return new MessageResponse("Hello from server API!");
	}
}