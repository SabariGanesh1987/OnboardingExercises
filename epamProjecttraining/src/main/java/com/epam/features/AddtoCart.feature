#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Add Products to Cart
	
#	@Login
#	Scenario: Login to ebay portal
#	Given Launch web browser
#	And Navigate to "www.ebay.com"
#	When User clicks on SignIn link
#	And User provide <email or Username> and clicks on "Continue" button
#	And User provide <password> and clicks on "SignIn" button
#	Then Verify User navigates to products home page
  
 
 Scenario Outline:
	Selection of product and Add to cart
	Given User navigates to products home page
	When User enters "<product>" name in search bar 
	And User click on Search button
	And User clicks on Addtocart button for the selected product
	Then Verify that selected "<product>" must be added to the cart
	
Examples:
|product	|
|phone		|
|laptop		|