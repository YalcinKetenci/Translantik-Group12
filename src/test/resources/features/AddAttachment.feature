@wip
Feature: Add attachment

	Background:

		Given The user on the login page
		When The user enters valid credentials as a "Truck Driver"
		Then User should be able to login


	Scenario: Truck driver can add attachment to selected vehicle odometer (US-23)
		When User navigated to "Fleet" tab "Vehicle Odometer" module
		And User clicks on any vehicle information
		Then User verifies that information page openned
		When User clicks on Add Attachment button on the right top corner of the page
		Then User verifies that Add Attachment popup windows openned
		When User clicks to Choose File button on the popup window
		And User selects a file from computer
		And User clicks to Save button on the popup window
		Then User verifies that selected file is uploaded and can be seen under Attachments