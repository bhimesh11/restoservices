package com.resto.foodOrdering.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resto.foodOrdering.Entity.FoodItem;

public interface FoodCatalougeRepository extends JpaRepository<FoodItem,Integer> {

	List<FoodItem> findByRestaurentId(Integer restaurentId);

}
