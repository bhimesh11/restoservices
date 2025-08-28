package com.resto.OrderService.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.resto.OrderService.dto.OrderDTOFromFrontEnd;
import com.resto.OrderService.dto.UserDTO;
import com.resto.OrderService.dto.orderDTO;
import com.resto.OrderService.entity.Order;
import com.resto.OrderService.mapper.OrderMapper;
import com.resto.OrderService.repositoryu.OrderRepo;
import com.resto.OrderService.service.IOrderService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderserviceImpl implements IOrderService {

	OrderRepo orderRepo;
	SequenceGenerator sequenceGenerator;
	RestTemplate restTemplate;

	@Override
	public orderDTO saveOrderInDB(OrderDTOFromFrontEnd orderDTOFromFrontEnd) {
		Integer newOrderid = sequenceGenerator.generateNextOrderId();
		UserDTO userDTO = fetchUserDetailsFromUserId(orderDTOFromFrontEnd.getUserId());
		Order orderTobeSaved = new Order(newOrderid,orderDTOFromFrontEnd.getFoodItemDtos(),orderDTOFromFrontEnd.getRestaurentDTO(),userDTO);
		orderRepo.save(orderTobeSaved);
		return OrderMapper.toDto(orderTobeSaved);
	}
	
	private UserDTO fetchUserDetailsFromUserId(Integer userId)
	{
		String url = "http://localhost:9092/api/users/fetchUser/{id}";
		return restTemplate.getForObject(url, UserDTO.class,userId);
	}
	
	
}
