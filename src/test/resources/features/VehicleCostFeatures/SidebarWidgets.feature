@TRAN-348
Feature: Truck driver can use sidebar widget, pins and favorite pages (US-14)

	Background:
		#@TRAN-233
		Given The user on the login page
		When The user enters valid credentials
		Then User should be able to login
		

	#User Story
	#As a Truck Driver I should be able to use sidebar widget, pins and favorite pages
	#
	#Acceptance Criterias:
	#1-Truck driver can add Recent Email, Sticky Note, Task List Widgets by using  plus sign
	#2-Truck driver can pin the page by using pin sign
	#3-Truck driver can make the page favorite by using favorite sign
	@TRAN-349
	Scenario Outline: Truck driver can add Recent Email, Sticky Note, Task List Widgets
		When the user navigates to "Fleet" "Vehicle Costs"
		And the user clicks plus button1
		Then the user verifies that sidebar widgets page opened
		When the user clicks add button for "<Widgets>"
		Then the user verifies that "Added (1)" message is enclosed near "<Widgets>" element
		When the user clicks close button
		Then the user verifies that "<Widgets>" icon is visible on the right sidebar
		Examples:
		      | Widgets       |
		      | Recent emails |
		      | Sticky Note   |
		      | Task list     |	

	#User Story
	#As a Truck Driver I should be able to use sidebar widget, pins and favorite pages
	#
	#Acceptance Criterias:
	#1-Truck driver can add Recent Email, Sticky Note, Task List Widgets by using plus sign
	#2-Truck driver can pin the page by using pin sign
	#3-Truck driver can make the page favorite by using favorite sign
	@TRAN-350
	Scenario: Truck driver can pin the page
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click pin button1
		Then the user verifies that color of pin icon changed to gold
		And the user verifies that Vehicle Costs page is pinned to pin bar	

	#User Story
	#As a Truck Driver I should be able to use sidebar widget, pins and favorite pages
	#
	#Acceptance Criterias:
	#1-Truck driver can add Recent Email, Sticky Note, Task List Widgets by using  plus sign
	#2-Truck driver can pin the page by using pin sign
	#3-Truck driver can make the page favorite by using favorite sign
	@TRAN-352
	Scenario: Truck driver can make the page favorite
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click star button1
		Then the user verifies that color of star icon changed to gold
		When the user clicks fa-bars button
		Then the user verifies that Vehicle Costs page title is seen as favorite page