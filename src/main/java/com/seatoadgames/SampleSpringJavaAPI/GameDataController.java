package com.seatoadgames.SampleSpringJavaAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameDataController {
	@Autowired // This means to get the bean called userRepository
	     // Which is auto-generated by Spring, we will use it to handle the data
	private GameDataRepository gameDataRepository;

	@GetMapping("/api/gamedata")
	public MessageResponse defaultCase() {
		return new MessageResponse("GameData api");
	}

	@GetMapping("/api/gamedata/{userId}")
    public GameDataResponse getUserGameData(@PathVariable(value="userId") int userId) {
	    // This returns a JSON or XML with the users
	    return new GameDataResponse(gameDataRepository.findByUserid(userId));
	}
	
}