package com.flipkart.ecom.system.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.flipkart.ecom.system.models.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
	
}