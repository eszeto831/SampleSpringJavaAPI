package com.seatoadgames.SampleSpringJavaAPI;

public class UserListResponse {

	private final Iterable<User> data;

	private final Boolean error = false;
	private final int status = 200;
	private final String message = "User game data retrieved successfully";

	public UserListResponse(Iterable<User> data) {
		this.data = data;
	}

	public Iterable<User> getData() {
		return data;
	}
}