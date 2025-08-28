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
public class orderDTO {
	
	
	private Integer orderId;
	private List<FoodItemDto> foodItemList;
	private RestaurentDTO restaurent;
	private UserDTO userDto;

}
