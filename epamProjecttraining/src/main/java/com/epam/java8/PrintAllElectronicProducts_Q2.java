package com.epam.java8;

import java.util.List;
import java.util.stream.Collectors;

public class PrintAllElectronicProducts_Q2 extends ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> electronicProducts = getProductList()
				.stream()
				.filter(a->a.getProdCategory()
				.equals("Electronics"))
				.collect(Collectors.toList());
		System.out.println(electronicProducts.toString());

	}

}
