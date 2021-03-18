Feature:

  Background:
		#@TRAN-298
    Given The user on the login page
    When The user enters valid credentials for store manager
    Then User should be able to login


	#{color:#00875a}*User Story :* {color}
	#
	#As a Store Manager/Sales Manager I should be able to get Vehicle Costs
	# information
	#  
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	#
	#*1-Store manager/Sales Manager can see vehicle costs information once navigate to a vehicle page*
	# 2-Store manager/Sales Manager can change page number for getting following vehicle costs information
	# 3-Store manager/Sales Manager can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	# 4-Store manager/Sales Manager can get all information to her/his own email address by using the Export Grid button in CSV and xlsx formats
  @TRAN-376 @TRAN-375
  Scenario:  US-033 Store Manager Vehicle Costs Page Navigation Test
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
  @TRAN-377 @TRAN-375
  Scenario: US-033 Store manager can change page number in vehicle costs information
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
  @TRAN-378 @TRAN-375
  Scenario Outline: US-033 Store manager can change the entity number
    When navigate to "Fleet" tab and "Vehicle Costs" module
    Then verify 'Vehicles Costs' page title
    When the user change entity number by clicking the view per page dropdown by "<page_number>"

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
  @TRAN-379 @TRAN-375
  Scenario Outline: US-033 Store manager can send CSV and xlsx formats to email
    When navigate to "Fleet" tab and "Vehicle Costs" module
    Then verify 'Vehicles Costs' page title
    When the user able to select by "<export_type>"

    Examples:
      |export_type|
      |CSV|
      |XLSX|