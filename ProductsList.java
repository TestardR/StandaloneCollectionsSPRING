package com.romain.spring.springcoreadvanced.standalone.collections;

import java.util.List;

public class ProductsList {

	List<String> ProductNames;

	public List<String> getProductNames() {
		return ProductNames;
	}

	public void setProductNames(List<String> productNames) {
		ProductNames = productNames;
	}

	@Override
	public String toString() {
		return "ProductsList [ProductNames=" + ProductNames + "]";
	}

}
