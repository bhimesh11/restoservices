package com.resto.foodOrdering.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resto.foodOrdering.Entity.FoodItem;

public interface FoodCatalougeRepository extends JpaRepository<FoodItem,Integer> {

}
