package com.epam.java8;

import java.util.List;
import java.util.function.Consumer;

public class UpdateProduct extends ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList = getProductList();
		Consumer<List<Product>> updatedProductList = UpdateProduct::updateGrade;
		updatedProductList.accept(productList);
		System.out.println(productList);

	}

	static void updateGrade(List<Product> products) {
		for (Product product : products) {
			if (product.getProdPrice() > 3000) {
				product.setProdGrade(product.getProdName()+"*");
			}

		}
	}

}
