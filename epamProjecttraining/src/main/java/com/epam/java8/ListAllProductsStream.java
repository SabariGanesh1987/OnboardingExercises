package com.epam.java8;

import java.util.List;
import java.util.stream.Collectors;

public class ListAllProductsStream extends ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> prodList = getProductList()
				.stream()
				.filter(product -> product.getProdPrice() > 1000)
				.collect(Collectors.toList());
		System.out.println("All products greater than 1000:::" +prodList.toString());
		
		List<Product> electronicProducts = 
				getProductList()
				.stream()
				.filter(product -> product.getProdCategory().toLowerCase().equalsIgnoreCase("electronics"))
				.collect(Collectors.toList());
		System.out.println("All electronic  products:::" +electronicProducts.toString());
		
		List<Product> electronicProductsGreaterThan1000 =  
		getProductList()
				.stream()
				.filter(product -> product.getProdPrice() > 1000&&product.getProdCategory().toLowerCase().equalsIgnoreCase("electronics"))
				.collect(Collectors.toList());
			
		for(Product product:electronicProductsGreaterThan1000 ) {
			System.out.println("ProductName:::"+product.getProdName().toUpperCase());
			System.out.println("ProductCategeory::"+product.getProdCategory());
			System.out.println("ProductPrice::"+product.getProdPrice());
			System.out.println("Product Grade:::"+product.getProdGrade());
		}
		
		Long countOfElectronicProducts = getProductList().stream()
				.filter(a -> a.getProdCategory().toLowerCase().equalsIgnoreCase("electronics")).count();
		System.out.println("Count of Electronic Products:::"+countOfElectronicProducts);

	//	System.out.println("Procucts belong to Electronics Categeory and Greater than 1000:::"+electronicProductsGreaterThan1000.toString().toUpperCase());
		
		

	}

}
