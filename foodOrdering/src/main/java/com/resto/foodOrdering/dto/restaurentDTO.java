package com.resto.foodOrdering.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class restaurentDTO {

	private int id;
	private String name;
	private String address;
	private String city;
	private String restaurentDescription;
}
