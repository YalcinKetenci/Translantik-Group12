Feature:

  Background:
		#@TRAN-299
    Given The user on the login page
    When The user enters valid credentials for sales manager
    Then User should be able to login


	#{color:#00875a}*User Story :* {color}
	#
	#As a Store Manager/Sales Manager I should be able to get Vehicle Costs
	#information
	# 
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	#
	#*1-Store manager/Sales Manager can see vehicle costs information once navigate to a vehicle page*
	#2-Store manager/Sales Manager can change page number for getting following vehicle costs information
	#3-Store manager/Sales Manager can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#4-Store manager/Sales Manager can get all information to her/his own email address by using the Export Grid button in CSV and xlsx formats
  @TRAN-381 @TRAN-380
  Scenario:  US-033 Sales Manager Vehicle Costs Page Navigation Test
    When navigate to "Fleet" tab and "Vehicle Costs" module
    Then verify 'Vehicles Costs' page title

	#{color:#00875a}*User Story :* {color}
	#
	#As a Store Manager/Sales Manager I should be able to get Vehicle Costs
	#information
	# 
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	#
	#1-Store manager/Sales Manager can see vehicle costs information once navigate to a vehicle page
	#*2-Store manager/Sales Manager can change page number for getting following vehicle costs information*
	#3-Store manager/Sales Manager can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#4-Store manager/Sales Manager can get all information to her/his own email address by using the Export Grid button in CSV and xlsx formats
  @TRAN-382 @TRAN-380
  Scenario: US-033 Sales manager can change page number in vehicle costs information
    When navigate to "Fleet" tab and "Vehicle Costs" module
    Then verify 'Vehicles Costs' page title
    When click right button
    Then verify the page number
    When click left button
    Then verify the page number

	#{color:#00875a}*User Story :* {color}
	#
	#As a Store Manager/Sales Manager I should be able to get Vehicle Costs
	#information
	# 
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	#
	#1-Store manager/Sales Manager can see vehicle costs information once navigate to a vehicle page
	#2-Store manager/Sales Manager can change page number for getting following vehicle costs information
	#*3-Store manager/Sales Manager can change the entity number by clicking the View Per Page dropdown(10,25,50,100)*
	#4-Store manager/Sales Manager can get all information to her/his own email address by using the Export Grid button in CSV and xlsx formats
  @TRAN-383 @TRAN-380
  Scenario Outline: US-033 Sales manager can change the entity number on Vehicle Costs Page
    When navigate to "Fleet" tab and "Vehicle Costs" module
    Then verify 'All Vehicle Costs' page title
    When the user change entity number by clicking the view per page dropdown by "<page_number>"
    Then verify view numbers
    Examples:
      |page_number|
      |10|
      |25|
      |50|
      |100|

	#{color:#00875a}*User Story :* {color}
	#
	#As a Store Manager/Sales Manager I should be able to get Vehicle Costs
	#information
	# 
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	#
	#1-Store manager/Sales Manager can see vehicle costs information once navigate to a vehicle page
	#2-Store manager/Sales Manager can change page number for getting following vehicle costs information
	#3-Store manager/Sales Manager can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#*4-Store manager/Sales Manager can get all information to her/his own email address by using the Export Grid button in CSV and xlsx formats*
  @TRAN-384 @TRAN-380
  Scenario Outline: US-033 Sales manager can send CSV and xlsx formats to email
    When navigate to "Fleet" tab and "Vehicle Costs" module
    Then verify 'Vehicles Costs' page title
    Then the user able to select by "<export_type>"
    Examples:
      |export_type|
      |CSV|
      |XLSX|