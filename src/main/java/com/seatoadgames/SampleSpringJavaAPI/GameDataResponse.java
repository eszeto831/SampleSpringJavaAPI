package com.seatoadgames.SampleSpringJavaAPI;

import java.util.List;

public class GameDataResponse {

	private final GameData data;

	private final Boolean error = false;
	private final int status = 200;
	private final String message = "User game data retrieved successfully";

	public GameDataResponse(GameData data) {
		this.data = data;
	}

	public GameData getData() {
		return data;
	}
}