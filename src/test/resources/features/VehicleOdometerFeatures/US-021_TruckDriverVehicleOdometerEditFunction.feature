Feature: 

	Background:
		#@TRAN-233
		Given The user on the login page
		When The user enters valid credentials
		Then User should be able to login
		

	#{color:#00875a}*User Story :* {color}
	#

	#As a Truck Driver I should be able to edit selected specific vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck Driver can edit selected vehicle odometer.
	@TRAN-394 @TRAN-395
	Scenario: US-021 | Truck Driver can edit selected vehicle odometer.
		When the user navigates to "Fleet" "Vehicle Odometer"
		And the user clicks first odometer
		And the user click edit sign
		Then the user should be able to edit cost information