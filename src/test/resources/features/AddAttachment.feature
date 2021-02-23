@addAttach
Feature: Add attachment

	Background:

		Given The user on the login page
		When The user enters valid credentials
		Then User should be able to login

	@smoke
	Scenario: Truck driver can add attachment to selected vehicle odometer (US-23)
		When User navigated to "Fleet" tab "Vehicle Odometer" module
		Then User verifies that Vehicles Odometers page opened
		And User clicks on any vehicle information
		Then User verifies that information page opened
		When User clicks on Add Attachment button on the right top corner of the page
		Then User verifies that "Add Attachment" popup windows opened
		When User clicks to Choose File button on the popup window and selects a file from computer
		And User clicks to Save button on the popup window
		Then User verifies that selected file is uploaded and can be seen under Attachments