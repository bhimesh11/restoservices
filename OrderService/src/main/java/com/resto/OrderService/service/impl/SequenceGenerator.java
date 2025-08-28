package com.resto.OrderService.service.impl;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.resto.OrderService.entity.Sequence;


import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Query.query;
import org.springframework.data.mongodb.core.query.Update;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SequenceGenerator {
	
	private MongoOperations mongoOperations;
	
	public int generateNextOrderId()
	{
		Sequence counter = mongoOperations.findAndModify(
				  query(where("_id").is("sequence")),
	                new Update().inc("sequence", 1),
	                options().returnNew(true).upsert(true),
	                Sequence.class);
	        return counter.getSequence();
	}

}
