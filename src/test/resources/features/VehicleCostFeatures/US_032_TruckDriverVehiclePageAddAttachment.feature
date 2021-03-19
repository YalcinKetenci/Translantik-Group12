Feature:

  Background:
		#@TRAN-233
    Given The user on the login page
    When The user enters valid credentials
    Then User should be able to login


	#{color:#de350b}+_*User Story :*_+{color} 
	#
	#As a Truck Driver I should be able to add attachment in vehicle costs
	#
	# 
	#
	#{color:#de350b}+*_Acceptance Criterias:_*+{color}
	#
	#1-Truck Driver can add attachment by using Add Attachment button
	# 2-Truck Driver should see the update in vehicle cost general information page
  @TRAN-389 @TRAN-281
  Scenario: TRAN-29 Truck Driver Vehicle Costs Add Attachment function test
    Given the user navigates to "Fleet" "Vehicle Costs"
    When the user clicks any cost
    And the user clicks Add Attachment button
    And the user clicks Choose File button
    And User clicks to Save button on the popup window
    Then User verifies that Attachment created successfully