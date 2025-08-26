package com.resto.foodOrdering.service;

import org.springframework.stereotype.Service;

import com.resto.foodOrdering.Entity.FoodItem;
import com.resto.foodOrdering.dto.FoodItemDto;
import com.resto.foodOrdering.mapper.FoodItemMapper;
import com.resto.foodOrdering.repo.FoodCatalougeRepository;
import com.resto.foodOrdering.service.impl.IFoodCatalougeService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class FoodCatalougeService implements IFoodCatalougeService {

	private FoodCatalougeRepository foodCatalougeRepository;

	public FoodItemDto addFoodItem(FoodItemDto foodItemDto) {
	FoodItem foodItemSavedInDB = foodCatalougeRepository.save(FoodItemMapper.toEntity(foodItemDto));
	return FoodItemMapper.toDto(foodItemSavedInDB);
	}
	
}
