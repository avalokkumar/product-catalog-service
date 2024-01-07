package com.globomart.estore.api.util;

public enum ProductType {

	BEVERAGES(1, "Beverages"),
	BAKERY(2, "Bakery"),
	DAIRY(3, "Dairy"),
	FROZEN_FOOD(4, "Frozen Foods"),
	MEAT(5, "Meat"),
	CLEANERS(6, "Cleaners"),
	PERSONAL_CARE(7, "Personal Care"),
	PAPER_GOODS(8, "Paper Goods"),
	OTHERS(9, "Other");
	
	private long productTypeId;
	private String productTypeDesc;
	
	private ProductType() {
	}
	
	private ProductType(long productTypeId, String productTypeDesc) {
		this.productTypeId = productTypeId;
		this.productTypeDesc = productTypeDesc;
	}

	public long getProductTypeId() {
		return productTypeId;
	}

	public String getProductTypeDesc() {
		return productTypeDesc;
	}
	
	public boolean checkProductId(int id) {
		for (ProductType productType : ProductType.values()) {
			if(id == productType.productTypeId) {
				return true;
			}
		}
		return false;
	}
	
}
