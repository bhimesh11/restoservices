package com.resto.OrderService.mapper;

import com.resto.OrderService.dto.orderDTO;
import com.resto.OrderService.entity.Order;

public class OrderMapper {

	 public static orderDTO toDto(Order order) {
	        // Return null if the input order is null to prevent NullPointerException
	        if (order == null) {
	            return null;
	        }

	        // Create a new orderDTO object
	        orderDTO orderDto = new orderDTO();

	        // Map fields from the entity to the DTO
	        orderDto.setOrderId(order.getOrderId());
	        orderDto.setFoodItemList(order.getFoodItemList());
	        orderDto.setRestaurent(order.getRestaurent());
	        orderDto.setUserDto(order.getUserDto());

	        return orderDto;
	    }

	    /**
	     * Converts an orderDTO object to an Order entity object.
	     *
	     * @param orderDto The orderDTO to convert.
	     * @return The converted Order entity, or null if the input is null.
	     */
	    public static Order toEntity(orderDTO orderDto) {
	        // Return null if the input orderDto is null to prevent NullPointerException
	        if (orderDto == null) {
	            return null;
	        }

	        // Create a new Order entity object
	        Order order = new Order();

	        // Map fields from the DTO to the entity
	        order.setOrderId(orderDto.getOrderId());
	        order.setFoodItemList(orderDto.getFoodItemList());
	        order.setRestaurent(orderDto.getRestaurent());
	        order.setUserDto(orderDto.getUserDto());

	        return order;
	    }
	
}
