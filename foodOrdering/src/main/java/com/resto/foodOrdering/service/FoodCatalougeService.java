package com.resto.foodOrdering.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.resto.foodOrdering.Entity.FoodItem;
import com.resto.foodOrdering.dto.FoodCatalougePage;
import com.resto.foodOrdering.dto.FoodItemDto;
import com.resto.foodOrdering.dto.restaurentDTO;
import com.resto.foodOrdering.mapper.FoodItemMapper;
import com.resto.foodOrdering.repo.FoodCatalougeRepository;
import com.resto.foodOrdering.service.impl.IFoodCatalougeService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class FoodCatalougeService implements IFoodCatalougeService {

	private FoodCatalougeRepository foodCatalougeRepository;
	private RestTemplate restTemplate;
	
	public FoodItemDto addFoodItem(FoodItemDto foodItemDto) {
	FoodItem foodItemSavedInDB = foodCatalougeRepository.save(FoodItemMapper.toEntity(foodItemDto));
	return FoodItemMapper.toDto(foodItemSavedInDB);
	}

	public FoodCatalougePage fetchFoodCataloguePageDetails(Integer restaurentId) {
		List<FoodItem> foodItemList = fetchFoodItemList(restaurentId);
		restaurentDTO restaurentDTO = fetchRestaurentDetails(restaurentId);
		return createFoodCatalougePage(foodItemList,restaurentDTO);
	}

	private FoodCatalougePage createFoodCatalougePage(List<FoodItem> foodItemList, restaurentDTO restaurentDTO) {
		FoodCatalougePage foodCatalougePage = new FoodCatalougePage();
		foodCatalougePage.setFoodItemList(foodItemList);
		foodCatalougePage.setRestaurent(restaurentDTO);
		return foodCatalougePage;
	}

	private restaurentDTO fetchRestaurentDetails(Integer restaurentId) {
		String url = "http://restaurentListing/api/restaurent/fetchAllRestaurentById/{id}";
		restaurentDTO response = restTemplate.getForObject(url,restaurentDTO.class,restaurentId);
		return response;
	}
		
	private List<FoodItem> fetchFoodItemList(Integer restaurentId) {
		return foodCatalougeRepository.findByRestaurentId(restaurentId);
	}
	
}
