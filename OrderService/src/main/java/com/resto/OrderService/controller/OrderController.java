package com.resto.OrderService.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resto.OrderService.dto.OrderDTOFromFrontEnd;
import com.resto.OrderService.dto.orderDTO;
import com.resto.OrderService.service.IOrderService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/api/order")
@AllArgsConstructor
public class OrderController {

	IOrderService iOrderService;

	
	@PostMapping("/saveOrder")
	public ResponseEntity<orderDTO> addOrder(@RequestBody OrderDTOFromFrontEnd orderDTOFromFrontEnd)
	{
orderDTO orderDto =	iOrderService.saveOrderInDB(orderDTOFromFrontEnd);
return new ResponseEntity<>(orderDto,HttpStatus.CREATED);
	}
	
}
