Feature:

	Background:
		#@TRAN-254
		Given The user on the login page
		When The user enters valid credentials
		Then User should be able to login


	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to delete selected specific vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck Driver can delete selected vehicle odometer.
	@TRAN-254 @TRAN-255
	Scenario: TRAN-16 | Truck Driver can delete selected vehicle odometer.
		When User navigated to "Fleet" tab "Vehicle Odometer" module
		And User clicks on any vehicle information
		Then User verifies that information page opened
		When User clicks on Delete Vehicle Odometer button on the right top corner of the page
		Then User verifies that Delete Confirmation popup windows opened
		When User clicks to Yes, Delete button on the popup window
		#Then User verifies that selected line is deleted and Vehicle Odometer Deleted message can be seen on top of the page