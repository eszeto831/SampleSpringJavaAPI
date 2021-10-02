package com.seatoadgames.SampleSpringJavaAPI;

import java.util.List;
import java.util.ArrayList;

public class GameDataResponse {

	private final GameData data;

	private final Boolean error = false;
	private final int status = 200;
	private final String message = "User game data retrieved successfully";

	public GameDataResponse(GameData data) {
		this.data = data;
	}

	public Iterable<GameData> getData() {
		List<GameData> list = new ArrayList<GameData>();
        list.add(data);
		return list;
	}

	public Boolean getError() {
		return error;
	}

	public int getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}
}