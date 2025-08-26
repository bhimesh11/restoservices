package com.resto.foodOrdering.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class FoodItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String itemName;
	private String itemDescription;
	private boolean isVeg;
	private Long price;
	private Integer restaurentId;
	@Column(nullable = false,columnDefinition = "INT DEFAULT 0 ")
	private Integer quantity;
}
