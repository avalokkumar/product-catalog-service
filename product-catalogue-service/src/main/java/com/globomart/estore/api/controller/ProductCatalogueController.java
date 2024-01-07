package com.globomart.estore.api.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globomart.estore.api.api.model.CustomResponse;
import com.globomart.estore.api.api.model.ProductRequest;
import com.globomart.estore.api.api.model.ProductResponse;
import com.globomart.estore.api.exception.ProductCatalogueBaseException;
import com.globomart.estore.api.service.ProductCatalogueService;
import com.globomart.estore.api.util.ResponseBuilder;

/**
 * Controller to perform retrieve, create, delete and  product(s)
 * 
 * @author avishwakarma
 *
 */
@RestController
@RequestMapping("/estore/v1")
public class ProductCatalogueController {

	@Autowired
	private ResponseBuilder<ProductResponse> responseBuilder;

	@Autowired
	private ProductCatalogueService productCatalogueService;

	/**
	 * Method to add a new product
	 * 
	 * @param productRequest
	 * @return
	 * @throws ProductCatalogueBaseException
	 * @throws URISyntaxException
	 */
	@PostMapping("/product")
	public ResponseEntity<CustomResponse<ProductResponse>> addNewProduct(@RequestBody ProductRequest productRequest)
			throws ProductCatalogueBaseException, URISyntaxException {

		return ResponseEntity.created(new URI("/api/dev/estore/v1/product/")).body(responseBuilder
				.buildResponse(productCatalogueService.addNewProduct(productRequest), Collections.emptyList()));
	}

	/**
	 * Method to retrieve product by id
	 * 
	 * @param productId
	 * @return
	 * @throws ProductCatalogueBaseException
	 */
	@GetMapping("/product/{productId}")
	public ResponseEntity<CustomResponse<ProductResponse>> getProductById(@PathVariable("productId") String productId)
			throws ProductCatalogueBaseException {

		return ResponseEntity.ok().body(responseBuilder
				.buildResponse(productCatalogueService.getProductDetails(productId), Collections.emptyList()));
	}

	/**
	 * Method to retrieve product by product type
	 * 
	 * @param productType
	 * @return
	 * @throws ProductCatalogueBaseException
	 */
	@GetMapping("/product/type/{productType}")
	public ResponseEntity<CustomResponse<ProductResponse>> getProductByType(
			@PathVariable("productType") String productType) throws ProductCatalogueBaseException {

		return ResponseEntity.ok().body(responseBuilder
				.buildResponse(productCatalogueService.getProductByType(productType), Collections.emptyList()));
	}

	/**
	 * Method to delete product by id
	 * 
	 * @param productId
	 * @return
	 * @throws ProductCatalogueBaseException
	 */
	@DeleteMapping("/product/{productId}")
	public ResponseEntity<CustomResponse<ProductResponse>> deleteProductById(
			@PathVariable("productId") String productId) throws ProductCatalogueBaseException {
		productCatalogueService.deleteProductById(productId);
		return ResponseEntity.noContent().build();
	}

}