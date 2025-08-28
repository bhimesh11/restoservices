package com.resto.foodOrdering.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resto.foodOrdering.dto.FoodCatalougePage;
import com.resto.foodOrdering.dto.FoodItemDto;
import com.resto.foodOrdering.service.FoodCatalougeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/api/food-catlouge")
@AllArgsConstructor
public class FoodCatalougeController {
	
	private FoodCatalougeService foodCatalougeService;
	
	@PostMapping("/addFoodItem")
	public ResponseEntity<FoodItemDto> addFoodItem(@RequestBody FoodItemDto foodItemDto)
	{
		FoodItemDto fooDto = foodCatalougeService.addFoodItem(foodItemDto);
		return new ResponseEntity<>(fooDto,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/fetchRestaurantAndFoodItemById/{restaurentId}")
	public ResponseEntity<FoodCatalougePage>fetchRestauDetailsWithFoodMenu(@PathVariable Integer restaurentId)
	{
		FoodCatalougePage foodCatalougePage = foodCatalougeService.fetchFoodCataloguePageDetails(restaurentId);
		return new ResponseEntity<>(foodCatalougePage,HttpStatus.OK);
		
	}

}
