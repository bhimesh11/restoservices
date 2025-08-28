package com.resto.OrderService.service;



import com.resto.OrderService.dto.OrderDTOFromFrontEnd;
import com.resto.OrderService.dto.orderDTO;

public interface IOrderService {

	orderDTO saveOrderInDB(OrderDTOFromFrontEnd orderDTOFromFrontEnd);

}
