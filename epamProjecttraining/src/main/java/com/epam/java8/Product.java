package com.epam.java8;

public class Product {
	
	private String prodName;
	private double prodPrice;
	private String prodCategory;
	private String prodGrade;
	
	public Product(String prodName, double prodPrice, String prodCategory, String prodGrade) {
		super();
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodCategory = prodCategory;
		this.prodGrade = prodGrade;
	}
	
	public Product() {}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public String getProdGrade() {
		return prodGrade;
	}

	public void setProdGrade(String prodGrade) {
		this.prodGrade = prodGrade;
	}

	@Override
	public String toString() {
		return "Product [prodName=" + prodName + ", prodPrice=" + prodPrice + ", prodCategory=" + prodCategory
				+ ", prodGrade=" + prodGrade + "]";
	}

}
