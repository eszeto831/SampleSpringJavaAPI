package com.seatoadgames.SampleSpringJavaAPI;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.seatoadgames.SampleSpringJavaAPI.GameData;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface GameDataRepository extends CrudRepository<GameData, Integer> {

	List<GameData> findByUserid(int id);
}