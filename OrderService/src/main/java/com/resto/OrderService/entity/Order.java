package com.resto.OrderService.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.resto.OrderService.dto.FoodItemDto;
import com.resto.OrderService.dto.RestaurentDTO;
import com.resto.OrderService.dto.UserDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {

	private Integer orderId;
	private List<FoodItemDto> foodItemList;
	private RestaurentDTO restaurent;
	private UserDTO userDto;
}
