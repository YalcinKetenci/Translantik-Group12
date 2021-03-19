@US_020
Feature:

	#by HARUN
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
	@TRAN-234 @smoke
	Scenario: US-20 Truck driver can see all odometer informations test
		When The user click "Fleet" tab and "Vehicle Odometer"
		Then User should be able to see all information on page