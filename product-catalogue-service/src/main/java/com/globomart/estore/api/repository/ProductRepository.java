package com.globomart.estore.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.globomart.estore.api.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

	@Query("{ 'id' : ?0}")
	Product findByProductId(String id);

	List<Product> findByProductTypeIgnoreCase(String productType);
}
