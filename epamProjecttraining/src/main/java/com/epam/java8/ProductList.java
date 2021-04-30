package com.epam.java8;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

	public static List<Product> getProductList() {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product("Mobile", 5000.00, "Electronics", "Top"));
		productsList.add(new Product("BackCase", 1800.00, "Plastics", "High"));
		productsList.add(new Product("Charger", 999.00, "Electronics", "Medium"));
		productsList.add(new Product("ChargerCable", 99.00, "Electronics", "Medium"));
		productsList.add(new Product("ScreenGuard", 199.00, "Accessories", "Low"));
		productsList.add(new Product("EarPhones", 99.00, "Accessories", "Low"));
		return productsList;
	}
}
