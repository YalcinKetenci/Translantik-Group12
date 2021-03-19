@TRAN-371
Feature: Add Event Function

	Background:
		#@TRAN-233
		Given The user on the login page
		When The user enters valid credentials
		Then User should be able to login
		

	#User Story : 
	#As a Truck Driver I should be able to add event
	#
	#Acceptance Criterias:
	#1-Truck Driver can add event by using Add Event button
	#2-Truck Driver should see the update in both general information page and Activity tab related add event.
	@TRAN-372
	Scenario: Truck Driver can add event by using Add Event button
		When the user navigates to "Fleet" "Vehicle Costs"
		And the user clicks Item 1
		Then the user verifies that information page for "Item #1" is opened
		When the user clicks Add Event button
		Then the user verifies that "Add Event" page is opened
		When the user inserts "test372" to Title input box
		And the user clicks Save button
		Then the user verifies that "Calendar event saved" message is appeared on the page
		And the user verifies that event can be seen under Activity tab with title "test372"	

	#User Story :
	#As a Truck Driver I should be able to add event
	#
	#Acceptance Criterias:
	#1-Truck Driver can add event by using Add Event button
	#2-Truck Driver should see the update in both general information page and Activity tab related add event.
	@TRAN-373
	Scenario: Truck driver can see the update in both general information page and Activity tab related add event
		When the user navigates to "Fleet" "Vehicle Costs"
		And the user clicks Item 1
		Then the user verifies that information page for "Item #1" is opened
		When the user clicks Add Event button
		Then the user verifies that "Add Event" page is opened
		When the user inserts "test372" to Title input box
		And the user clicks Save button
		Then the user verifies that "Calendar event saved" message is appeared on the page
		And the user verifies that event can be seen under Activity tab with title "test372"
		And the user verifies that "General" tab is active
		When the user clicks "Activity" tab
		Then the user verifies that "Activity" tab is active	

	#User Story :
	#As a Truck Driver I should be able to add event
	#
	#Acceptance Criterias:
	#1-Truck Driver can add event by using Add Event button
	#2-Truck Driver should see the update in both general information page and Activity tab related add event.
	@TRAN-374
	Scenario: Truck driver cannot leave mandatory areas empty while adding event
		When the user navigates to "Fleet" "Vehicle Costs"
		And the user clicks Item 1
		Then the user verifies that information page for "Item #1" is opened
		When the user clicks Add Event button
		Then the user verifies that "Add Event" page is opened
		When the user clicks Save button
		Then the user gets "This value should not be blank." under Title input box
		When the user inserts "test372" to Title input box
		And the user inserts "test372" into Organizer email input box
		Then the user gets "This value is not a valid email address." under Organizer email input box