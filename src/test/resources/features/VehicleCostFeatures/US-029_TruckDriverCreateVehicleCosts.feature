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
  @TRAN-306 @TRAN-351
  Scenario: US-029_TruckDriverCreateVehicleCosts
    When navigate to "Fleet" tab and "Vehicle Costs" module
    Then verify 'Vehicles Costs' page title
    When click Create Vehicle Costs button
    And click Save And Close button
    Then User verifies that Entity Saved message can be seen on page