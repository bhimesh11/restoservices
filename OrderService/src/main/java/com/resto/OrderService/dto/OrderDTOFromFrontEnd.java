package com.resto.OrderService.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDTOFromFrontEnd {
	
	
	private List<FoodItemDto> foodItemDtos;
	private Integer UserId;
	private RestaurentDTO restaurentDTO;

}
