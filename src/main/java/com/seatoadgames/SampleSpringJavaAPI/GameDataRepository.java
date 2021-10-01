package com.seatoadgames.SampleSpringJavaAPI;

import org.springframework.data.repository.CrudRepository;

import com.seatoadgames.SampleSpringJavaAPI.GameData;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface GameDataRepository extends CrudRepository<GameData, Integer> {

	GameData findByUserid(int id);
}