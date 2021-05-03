package com.epam.java8;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class PrintPremiumGradeList extends ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList = getProductList();
		Consumer<List<Product>> updatedProductList = PrintPremiumGradeList::getPremiumProducts;
		updatedProductList.accept(productList);
		productList= productList.stream().filter(a->a.getProdName().contains("*")&&a.getProdGrade().equalsIgnoreCase("Premium")).collect(Collectors.toList());
		System.out.println(productList);
	}

	static void getPremiumProducts(List<Product> products) {
		for(Product p: products) {
			if(p.getProdPrice() > 1000) {
				p.setProdGrade("Premium");
			}
		}
		for (Product product : products) {
			if (product.getProdPrice() > 3000) {
				product.setProdName(product.getProdName()+"*");
			}

		}


	}

}
