package com.resto.OrderService.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "sequence")
@ToString
public class Sequence {

	@Id
	private String id;
	private int sequence;
}
