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
public class FoodItemDto {
	private int id;
	private String itemName;
	private String itemDescription;
	private boolean isVeg;
	private Long price;
	private Integer restaurentId;
	private Integer quantity;
}
