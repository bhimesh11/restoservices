package com.resto.restaurentListing.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.resto.restaurentListing.dto.RestaurentDTO;
import com.resto.restaurentListing.entity.Restaurent;


public class RestaurentMapper {

	
	public Restaurent mapRestaurentDTOtoRestaurent(RestaurentDTO dto){
		// Create a new Restaurent entity object.
				Restaurent restaurent = new Restaurent();

				// Copy data from the DTO to the entity.
				// Use a null check for the DTO to prevent NullPointerException.
				if (dto != null) {
					restaurent.setId(dto.getId());
					restaurent.setName(dto.getName());
					restaurent.setAddress(dto.getAddress());
					restaurent.setCity(dto.getCity());
					restaurent.setRestaurentDescription(dto.getRestaurentDescription());
				}
				
				// Return the populated entity.
				return restaurent;
	}
	
	public RestaurentDTO mapRestaurenttoRestaurentDTO(Restaurent restaurent) {
RestaurentDTO restaurentDTO = new RestaurentDTO();
		
		// Copy data from the entity to the DTO.
		// Use a null check for the entity to prevent NullPointerException.
		if (restaurent != null) {
			restaurentDTO.setId(restaurent.getId());
			restaurentDTO.setName(restaurent.getName());
			restaurentDTO.setAddress(restaurent.getAddress());
			restaurentDTO.setCity(restaurent.getCity());
			restaurentDTO.setRestaurentDescription(restaurent.getRestaurentDescription());
		}
		
		// Return the populated DTO.
		return restaurentDTO;	
	}
}
