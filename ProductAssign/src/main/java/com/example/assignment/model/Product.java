package com.example.assignment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Product")
@Entity
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq")
private long id;

private String productName;
private String productType;
private String productCategory;
private int minPrice;
private int maxPrice;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductType() {
	return productType;
}
public void setProductType(String productType) {
	this.productType = productType;
}
public String getProductCategory() {
	return productCategory;
}
public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}
public int getMinPrice() {
	return minPrice;
}
public void setMinPrice(int minPrice) {
	this.minPrice = minPrice;
}
public int getMaxPrice() {
	return maxPrice;
}
public void setMaxPrice(int maxPrice) {
	this.maxPrice = maxPrice;
}


public Product(long id, String productName, String productType, String productCategory, int minPrice, int maxPrice) {
	super();
	this.id = id;
	this.productName = productName;
	this.productType = productType;
	this.productCategory = productCategory;
	this.minPrice = minPrice;
	this.maxPrice = maxPrice;
}

@Override
public String toString() {
	return "Product [id=" + id + ", productName=" + productName + ", productType=" + productType + ", productCategory="
			+ productCategory + ", minPrice=" + minPrice + ", maxPrice=" + maxPrice + "]";
}
public Product() {
	super();
}

}
