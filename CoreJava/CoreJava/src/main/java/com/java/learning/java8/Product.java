package com.java.learning.java8;

public class Product {
int id;
String productName;
float price;
public Product(int id, String productName, float price) {
	super();
	this.id = id;
	this.productName = productName;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}



}
