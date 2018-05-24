package com.java.learning.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {
public static void main(String[] args) {
	List<Product> productList = new ArrayList<>();
	
	//Adding products
	productList.add(new Product(1,"Laptop",20000.00F));
	productList.add(new Product(2,"Camera",15000.00F));
	productList.add(new Product(3,"Mobile",15000.00F));
	productList.add(new Product(4,"Printer",10000.00F));
	
	List<Float> productPriceList = productList.stream().filter(p -> p.price > 10000)
			                       .map(p -> p.price)
                                   .collect(Collectors.toList());
	System.out.println(productPriceList);
	
	productList.stream().forEach(product -> System.out.println(product.productName));
	
	
}

}