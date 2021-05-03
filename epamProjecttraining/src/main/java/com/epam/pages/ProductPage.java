package com.epam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "gh-ac")
	private WebElement searchBox;

	@FindBy(how = How.ID, using = "gh-btn")
	private WebElement searchButton;

	@FindBy(how = How.XPATH, using = "(//li[normalize-space(@class)='s-item']//a[not(contains(@_sp,'p2351460.m4114.l8597'))][not(contains(@tabindex,'-1'))][not(contains(@class,'gallery'))])[1]")
	private WebElement productItem;

	@FindBy(how = How.ID, using = "isCartBtn_btn")
	private WebElement addToCartBtn;
	
	public void enterProduct(String product) {
		System.out.println(product);
		searchBox.sendKeys(product);
	}
	
	public void clickOnSearchBtn() {
		searchButton.click();
	}
	
	public void clickonProductItem() {
		productItem.click();
	}
	
	public void clickonAddtoCartBtn() {
		addToCartBtn.click();
	}

}
