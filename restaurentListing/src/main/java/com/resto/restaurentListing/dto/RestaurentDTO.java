package com.resto.restaurentListing.dto;

import com.resto.restaurentListing.entity.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RestaurentDTO  {
	
	private int id;
	private String name;
	private String address;
	private String city;
	private String restaurentDescription;

}
