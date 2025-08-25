package com.resto.restaurentListing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resto.restaurentListing.entity.Restaurent;

@Repository
public interface RestaurentRepository extends JpaRepository<Restaurent, Integer> {

	
}
