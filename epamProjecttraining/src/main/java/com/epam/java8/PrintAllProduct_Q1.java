package com.epam.java8;

import java.util.List;
import java.util.stream.Collectors;

public class PrintAllProduct_Q1  extends ProductList{

	public static void main(String[] args) {

		List<Product> productisGreaterThan1000 = 
				getProductList()
				.stream()
				.filter(a -> a.getProdPrice() > 1000)
				.collect(Collectors.toList());

		System.out.println(productisGreaterThan1000.toString());

	}
}
