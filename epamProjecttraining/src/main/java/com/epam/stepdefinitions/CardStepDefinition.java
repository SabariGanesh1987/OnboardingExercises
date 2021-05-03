package com.epam.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.epam.pages.HomePage;
import com.epam.pages.ProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CardStepDefinition {
	WebDriver driver;
	ProductPage productPage;
	HomePage homepage;

@Given("User navigates to products home page")
public void user_navigates_to_products_home_page() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	homepage = new HomePage(driver);
	homepage.navigateTo_HomePage();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@When("User enters {string} name in search bar")
public void user_enters_name_in_search_bar(String string) {
	productPage = new ProductPage(driver);
	productPage.enterProduct(string);
	
}

@When("User click on Search button")
public void user_click_on_search_button() {
	productPage.clickOnSearchBtn();
}

@When("User clicks on Addtocart button for the selected product")
public void user_clicks_on_addtocart_button_for_the_selected_product() {
	productPage.clickonProductItem();
	productPage.clickonAddtoCartBtn();
}

@Then("Verify that selected {string} must be added to the cart")
public void verify_that_selected_must_be_added_to_the_cart(String string) {
}

}
