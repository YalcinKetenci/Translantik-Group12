Feature:

  Background:
		#@TRAN-299
    Given The user on the login page
    When The user enters valid credentials for sales manager
    Then User should be able to login


	#{color:#00875a}*User Story :* {color}
	#
	#As a Store Manager/Sales Manager I should not be able to access the Vehicle odometer page
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	#
	#1- Only truck driver can access to vehicle odometer page
	#2- Sales manager or store manager can not access vehicle odometer page
	#h4. Checklists
  @TRAN-391 @TRAN-387
  Scenario: US-024 Sales manager Vehicle Odometer Page Access Test
    When navigate to "Fleet" tab and "Vehicle Odometer" module
    Then verify the page does not change