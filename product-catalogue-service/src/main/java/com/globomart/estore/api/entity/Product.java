package com.globomart.estore.api.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "product")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1037316813178725327L;

	@Id
	private String id;

	@Field("name")
	private String name;

	@Field("description")
	private String description;

	@Field("price")
	private Double price;

	@Field("currency")
	private String currency;

	@Field("productType")
	private String productType;

	@Field("category")
	private String category;

	@Field("createdTime")
	private LocalDateTime createdTime;

	@Field("modifiedTime")
	private LocalDateTime modifiedTime;

	public String getId() {
		return id;
	}

	public Product setId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Product setName(String name) {
		this.name = name;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Product setDescription(String description) {
		this.description = description;
		return this;
	}

	public Double getPrice() {
		return price;
	}

	public Product setPrice(Double price) {
		this.price = price;
		return this;
	}

	public String getProductType() {
		return productType;
	}

	public Product setProductType(String productType) {
		this.productType = productType;
		return this;
	}

	public String getCategory() {
		return category;
	}

	public Product setCategory(String category) {
		this.category = category;
		return this;
	}

	public LocalDateTime getCreatedTime() {
		return createdTime;
	}

	public Product setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
		return this;
	}

	public LocalDateTime getModifiedTime() {
		return modifiedTime;
	}

	public Product setModifiedTime(LocalDateTime modifiedTime) {
		this.modifiedTime = modifiedTime;
		return this;
	}

	public String getCurrency() {
		return currency;
	}

	public Product setCurrency(String currency) {
		this.currency = currency;
		return this;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", currency=" + currency + ", productType=" + productType + ", category=" + category
				+ ", createdTime=" + createdTime + ", modifiedTime=" + modifiedTime + "]";
	}

}
