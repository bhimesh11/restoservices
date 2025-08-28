package com.resto.foodOrdering.dto;

import java.util.List;

import com.resto.foodOrdering.Entity.FoodItem;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodCatalougePage {

	private List<FoodItem> FoodItemList;
	private restaurentDTO Restaurent;
}
