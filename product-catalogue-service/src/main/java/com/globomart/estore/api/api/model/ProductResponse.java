package com.globomart.estore.api.api.model;

import java.time.LocalDateTime;

public class ProductResponse {

	private String id;
	private String name;
	private String description;
	private Double price;
	private String currency;
	private String productType;
	private String category;
	private LocalDateTime createdTime;
	private LocalDateTime modifiedTime;

	public ProductResponse() {
	}

	public String getId() {
		return id;
	}

	public ProductResponse setId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public ProductResponse setName(String name) {
		this.name = name;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public ProductResponse setDescription(String description) {
		this.description = description;
		return this;
	}

	public Double getPrice() {
		return price;
	}

	public ProductResponse setPrice(Double price) {
		this.price = price;
		return this;
	}

	public String getProductType() {
		return productType;
	}

	public ProductResponse setProductType(String productType) {
		this.productType = productType;
		return this;
	}

	public String getCategory() {
		return category;
	}

	public ProductResponse setCategory(String category) {
		this.category = category;
		return this;
	}

	public LocalDateTime getCreatedTime() {
		return createdTime;
	}

	public ProductResponse setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
		return this;
	}

	public LocalDateTime getModifiedTime() {
		return modifiedTime;
	}

	public ProductResponse setModifiedTime(LocalDateTime modifiedTime) {
		this.modifiedTime = modifiedTime;
		return this;
	}

	public String getCurrency() {
		return currency;
	}

	public ProductResponse setCurrency(String currency) {
		this.currency = currency;
		return this;
	}

	@Override
	public String toString() {
		return "ProductResponse [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", currency=" + currency + ", productType=" + productType + ", category=" + category
				+ ", createdTime=" + createdTime + ", modifiedTime=" + modifiedTime + "]";
	}

}
