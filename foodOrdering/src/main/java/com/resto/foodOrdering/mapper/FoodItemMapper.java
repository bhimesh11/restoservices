package com.resto.foodOrdering.mapper;

import org.springframework.stereotype.Component;

import org.springframework.stereotype.Component;

import com.resto.foodOrdering.Entity.FoodItem;
import com.resto.foodOrdering.dto.FoodItemDto;

@Component
public class FoodItemMapper {

	// Convert DTO to Entity
	public static FoodItem toEntity(FoodItemDto dto) {
		if (dto == null) {
			return null;
		}
		FoodItem foodItem = new FoodItem();
		foodItem.setId(dto.getId());
		foodItem.setItemName(dto.getItemName());
		foodItem.setItemDescription(dto.getItemDescription());
		foodItem.setVeg(dto.isVeg());
		foodItem.setPrice(dto.getPrice());
		foodItem.setRestaurentId(dto.getRestaurentId());
		foodItem.setQuantity(dto.getQuantity() != null ? dto.getQuantity() : 0); // Default 0 if null
		return foodItem;
	}

	// Convert Entity to DTO
	public static FoodItemDto toDto(FoodItem entity) {
		if (entity == null) {
			return null;
		}
		FoodItemDto dto = new FoodItemDto();
		dto.setId(entity.getId());
		dto.setItemName(entity.getItemName());
		dto.setItemDescription(entity.getItemDescription());
		dto.setVeg(entity.isVeg());
		dto.setPrice(entity.getPrice());
		dto.setRestaurentId(entity.getRestaurentId());
		dto.setQuantity(entity.getQuantity());
		return dto;
	}

}
