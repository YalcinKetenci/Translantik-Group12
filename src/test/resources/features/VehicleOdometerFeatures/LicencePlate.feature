@LP
Feature: Licence Plate

	Background:
		Given The user on the login page
		When The user enters valid credentials
		Then User should be able to login


	Scenario: Truck driver can create vehicle odometer
		Given User navigated to "Fleet" tab "Vehicle Odometer" module
		Then User verifies that Vehicles Odometers page opened
		When User clicks "Create Vehicle Odometer" CVO button
		Then User verifies that Create Vehicle Odometer page opened
		When User clicks Save And Close button
		Then User verifies that Entity Saved message can be seen on page



	Scenario: Truck driver can cancel creating vehicle odometer
		Given User navigated to "Fleet" tab "Vehicle Odometer" module
		Then User verifies that Vehicles Odometers page opened
		When User clicks "Create Vehicle Odometer" CVO button
		Then User verifies that Create Vehicle Odometer page opened
		When User clicks "Cancel" cncl button
		Then User verifies that Vehicles Odometers page opened



	Scenario: Creating vehicle odometer with invalid values
		Given User navigated to "Fleet" tab "Vehicle Odometer" module
		Then User verifies that Vehicles Odometers page opened
		When User clicks "Create Vehicle Odometer" CVO button
		Then User verifies that Create Vehicle Odometer page opened
		When User inserts 'character' to Odometer Value inbox
		And User clicks Save And Close button
		Then User gets 'This value is not valid.' message for Odometer Value
		When User inserts 'character' to Date inbox
		Then User gets 'This value is not valid.' message for Date



	Scenario: Truck driver can add Licence plate information
		Given User navigated to "Fleet" tab "Vehicle Odometer" module
		Then User verifies that Vehicles Odometers page opened
		When User clicks "Create Vehicle Odometer" CVO button
		Then User verifies that Create Vehicle Odometer page opened
		When User clicks +Add button on the same line of License Plate
		Then User verifies that a new window titled "Select Carreservation" opened
		When User clicks checkbox of "123456"
		And User clicks Select button
		Then User verifies that Create Vehicle Odometer page opened
		Then User verifies that selected "License Plate: 123456" can be seen on Create Vehicle Odometer page
		When User clicks Save And Close button
		Then User verifies that selected licence plate "123456" can be seen on General Information page