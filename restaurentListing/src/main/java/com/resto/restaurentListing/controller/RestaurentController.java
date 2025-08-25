package com.resto.restaurentListing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.resto.restaurentListing.dto.RestaurentDTO;
import com.resto.restaurentListing.entity.Restaurent;
import com.resto.restaurentListing.service.RestaurantService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/restaurent")
public class RestaurentController {

	private RestaurantService restaurentService;
	
	@GetMapping("/fetchAllRestaurents")
	public ResponseEntity<List<RestaurentDTO>> fetchAllRestaurents()
	{
	List<RestaurentDTO> allRestaurents =	restaurentService.findAllRestaurent();
		return new ResponseEntity<>(allRestaurents,HttpStatus.OK);
	}
	
	@PostMapping("/addRestaurant")
	public ResponseEntity<RestaurentDTO> saveRestaurent(@RequestBody RestaurentDTO restaurentDTO)
	{
		RestaurentDTO resDto = restaurentService.addRestaurent(restaurentDTO);
		return new ResponseEntity<>(resDto,HttpStatus.CREATED);
	}
	
	@GetMapping("/fetchAllRestaurentById/{id}")
	public ResponseEntity<RestaurentDTO> fecthById(@PathVariable int id)
	{
		RestaurentDTO restaurentDTO  = restaurentService.fetchRestaurentById(id);
		if(restaurentDTO!=null)
		{
			return new ResponseEntity<>(restaurentDTO,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(restaurentDTO,HttpStatus.NOT_FOUND);
		}
	}
}
