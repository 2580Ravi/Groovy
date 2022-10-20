package com.example.demo

class Product {
	int id;
	String producName
	double ratePerUnit
	Product(int id, String producName, double ratePerUnit) {
		
		this.id = id
		this.producName = producName
		this.ratePerUnit = ratePerUnit
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", producName=" + producName + ", ratePerUnit=" + ratePerUnit + "]";
	}
	
	
	
}
