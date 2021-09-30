package com.seatoadgames.SampleSpringJavaAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired // This means to get the bean called userRepository
	     // Which is auto-generated by Spring, we will use it to handle the data
	private UserRepository userRepository;

	@GetMapping("/api/users")
	public Message defaultCase() {
		return new Message("User api");
	}

	@GetMapping("/api/users/list")
    public @ResponseBody Iterable<User> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return userRepository.findAll();
	}
}