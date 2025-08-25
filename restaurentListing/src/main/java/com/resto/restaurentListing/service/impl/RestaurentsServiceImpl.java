package com.resto.restaurentListing.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.netflix.discovery.provider.Serializer;
import com.resto.restaurentListing.dto.RestaurentDTO;
import com.resto.restaurentListing.entity.Restaurent;
import com.resto.restaurentListing.mapper.RestaurentMapper;
import com.resto.restaurentListing.repository.RestaurentRepository;
import com.resto.restaurentListing.service.RestaurantService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RestaurentsServiceImpl implements RestaurantService {

	private RestaurentRepository restaurentRepository;

	@Override
	public List<RestaurentDTO> findAllRestaurent() {
		// TODO Auto-generated method stub
		List<Restaurent> restaurents = restaurentRepository.findAll();
		RestaurentMapper rm = new RestaurentMapper();
		List<RestaurentDTO> restaurentDTOsList = restaurents.stream().map(res -> rm.mapRestaurenttoRestaurentDTO(res))
				.collect(Collectors.toList());
		return restaurentDTOsList;
	}

	@Override
	public RestaurentDTO addRestaurent(RestaurentDTO restaurentDTO) {
		RestaurentMapper rm = new RestaurentMapper();
		Restaurent restaurent = rm.mapRestaurentDTOtoRestaurent(restaurentDTO);
		restaurent.setCreatedAt(LocalDateTime.now());
		restaurent.setCreatedBy("Restaurant MS");
		restaurentRepository.save(restaurent);
		return rm.mapRestaurenttoRestaurentDTO(restaurent);

	}

	@Override
	public RestaurentDTO fetchRestaurentById(int id) {

		RestaurentMapper rm = new RestaurentMapper();

		Optional<Restaurent> restaurent = restaurentRepository.findById(id);

		if (restaurent.isPresent()) {
			return rm.mapRestaurenttoRestaurentDTO(restaurent.get());
		} else {
			return null;
		}
	}

}
