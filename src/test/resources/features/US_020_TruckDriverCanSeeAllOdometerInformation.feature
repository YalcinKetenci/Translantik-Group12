Feature:

	Background:
		#@TRAN-233
		Given The user on the login page
		When The user enters valid credentials
		Then User should be able to login


	#*User Story :* 
	#
	#As a Truck Driver When I click on any vehicle odometers in the grid, I should be able to see general informations.
	#
	# 
	#
	#*_Acceptance Criterias:_*
	#
	#1-Truck Driver can see all informations about specific vehicle odometer.
	@TRAN-234
	Scenario: US-20 Truck driver can see al odometer informations test
		When the user navigates to "Fleet" "Vehicle Odometer"
		Then the user able to see information on Vehicle Odometer