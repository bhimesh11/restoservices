package com.resto.OrderService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RestaurentDTO {

	private int id;
	private String name;
	private String address;
	private String city;
	private String restaurentDescription;
}
