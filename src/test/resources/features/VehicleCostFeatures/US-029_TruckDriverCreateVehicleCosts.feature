Feature:

  Background:
		#@TRAN-233
    Given The user on the login page
    When The user enters valid credentials
    Then User should be able to login


	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able create vehicle costs
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#*1-Truck driver can create vehicle costs by using Create Vehicle Costs button*
	#2-Truck driver can add chasis number and licence plate by using + Add buttons when creating vehicle costs"
  @TRAN-306 @TRAN-351 @wip
  Scenario: US-029_TruckDriverCreateVehicleCosts
    Given the user navigates to "Fleet" "Vehicle Costs"
    When the user clicks Create Vehicle Costs button
    Then the user should be able to click Save And Close button
    And User verifies that Entity Saved message can be seen on page