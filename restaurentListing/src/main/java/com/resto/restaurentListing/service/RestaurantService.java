package com.resto.restaurentListing.service;

import java.util.List;

import com.resto.restaurentListing.dto.RestaurentDTO;

public interface RestaurantService {

	List<RestaurentDTO> findAllRestaurent();

	RestaurentDTO addRestaurent(RestaurentDTO restaurentDTO);

	 RestaurentDTO fetchRestaurentById(int id);

}
