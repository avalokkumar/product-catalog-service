package com.globomart.estore.api.service.impl;

import static org.zalando.problem.Status.BAD_REQUEST;

import java.net.URI;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zalando.problem.Problem;
import org.zalando.problem.ThrowableProblem;

import com.globomart.estore.api.api.model.ProductRequest;
import com.globomart.estore.api.api.model.ProductResponse;
import com.globomart.estore.api.entity.Product;
import com.globomart.estore.api.exception.ProductNotFoundException;
import com.globomart.estore.api.repository.ProductRepository;
import com.globomart.estore.api.service.ProductCatalogueService;
import com.globomart.estore.api.util.ProductMapper;

/**
 * Service to retrieve, create and delete product
 * 
 * @author avishwakarma
 *
 */
@Service
public class ProductCatalogueServiceImpl implements ProductCatalogueService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductMapper mapper;

	@Override
	public List<ProductResponse> addNewProduct(ProductRequest productRequest) {
		ProductResponse response = mapper
				.mapProductToProductResponse(productRepository.save(mapper.mapProductRequestToProduct(productRequest)));
		return Collections.singletonList(response);
	}

	@Override
	public List<ProductResponse> getProductDetails(String productId) throws ProductNotFoundException {
		if (null == productRepository.findByProductId(productId)) {
			throw new ProductNotFoundException(Collections.singletonList(getProductNotFoundException()));
		}
		ProductResponse response = mapper.mapProductToProductResponse(productRepository.findByProductId(productId));
		return Collections.singletonList(response);
	}

	@Override
	public List<ProductResponse> getProductByType(String productType) throws ProductNotFoundException {
		List<Product> products = productRepository.findByProductTypeIgnoreCase(productType);
		if (products.isEmpty()) {
			throw new ProductNotFoundException(Collections.singletonList(getProductNotFoundException()));
		}
		return mapper.mapProductToProductResponse(products);
	}

	@Override
	public void deleteProductById(String productId) throws ProductNotFoundException {
		if (null == productRepository.findByProductId(productId)) {
			throw new ProductNotFoundException(Collections.singletonList(getProductNotFoundException()));
		}
		productRepository.deleteById(productId);
	}

	private ThrowableProblem getProductNotFoundException() {

		return Problem.builder().withType(URI.create("api/dev/estore/v1/product")).withStatus(BAD_REQUEST)
				.with("code", "ER36").with("message", "Product Not Found").build();

	}
}