package com.globomart.estore.api.util;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.globomart.estore.api.api.model.ProductRequest;
import com.globomart.estore.api.api.model.ProductResponse;
import com.globomart.estore.api.entity.Product;

@Service
public class ProductMapper {

	public Product mapProductResposeToProduct(ProductResponse productResponse) {
		Product product = new Product();
		product.setName(productResponse.getName()).setPrice(productResponse.getPrice())
				.setCurrency(productResponse.getCurrency()).setDescription(productResponse.getDescription())
				.setProductType(productResponse.getProductType()).setCategory(productResponse.getCategory())
				.setCreatedTime(LocalDateTime.now()).setModifiedTime(LocalDateTime.now());
		return product;
	}

	public Product mapProductRequestToProduct(ProductRequest productRequest) {
		Product product = new Product();
		product.setName(productRequest.getName()).setPrice(productRequest.getPrice())
				.setCurrency(productRequest.getCurrency()).setDescription(productRequest.getDescription())
				.setCategory(productRequest.getCategory()).setProductType(productRequest.getProductType())
				.setCreatedTime(LocalDateTime.now()).setModifiedTime(LocalDateTime.now());
		return product;
	}

	public ProductResponse mapProductToProductResponse(Product product) {

		ProductResponse response = new ProductResponse();
		response.setId(product.getId()).setName(product.getName()).setPrice(product.getPrice())
				.setCurrency(product.getCurrency()).setDescription(product.getDescription())
				.setProductType(product.getProductType()).setCategory(product.getCategory())
				.setCreatedTime(LocalDateTime.now()).setModifiedTime(LocalDateTime.now());
		return response;
	}
	
	public List<ProductResponse> mapProductToProductResponse(List<Product> productList) {
		return productList.stream().filter(Objects::nonNull)
				.map(this::mapProductToProductResponse).collect(Collectors.toList());
	}
}
