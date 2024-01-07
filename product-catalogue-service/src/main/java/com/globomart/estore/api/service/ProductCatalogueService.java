package com.globomart.estore.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globomart.estore.api.api.model.ProductRequest;
import com.globomart.estore.api.api.model.ProductResponse;
import com.globomart.estore.api.exception.ProductNotFoundException;

@Service
public interface ProductCatalogueService {

	List<ProductResponse> addNewProduct(ProductRequest productRequest);

	List<ProductResponse> getProductDetails(String productId) throws ProductNotFoundException;

	List<ProductResponse> getProductByType(String productType) throws ProductNotFoundException;

	void deleteProductById(String productId) throws ProductNotFoundException;

}
