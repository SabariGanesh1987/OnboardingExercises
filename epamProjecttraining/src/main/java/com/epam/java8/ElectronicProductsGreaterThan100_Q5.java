package com.epam.java8;

import java.util.List;
import java.util.stream.Collectors;

public class ElectronicProductsGreaterThan100_Q5 extends ProductList {

	public static void main(String[] args) {
		
		List<Product> productList = getProductList()
				.stream()
				.filter(a->a.getProdCategory().equalsIgnoreCase("Electronics")&&a.getProdPrice()<100)
				.collect(Collectors.toList());
		
		System.out.println(productList.toString());

	}

}
