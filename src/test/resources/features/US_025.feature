Feature: 

	Background:
		#@TRAN-233
		Given The user on the login page
		When The user enters valid credentials
		Then User should be able to login
		

	#*User Story :* 
	#
	#As a Truck Driver I should be able to get Vehicle Costs informations
	#
	# 
	#
	#*_Acceptance Criterias:_*
	#
	#{color:#de350b}*{color:#de350b}*1-Truck driver can see vehicle costs informations once navigate to vehicle page{color}**{color}
	# 2-Truck driver can change page number for getting following vehicle costs informations
	# 3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	# 4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	@TRAN-259 @TRAN-269 @TRAN-264
	Scenario:  US-025 Truck Driver Vehicle Costs Page Test
		When the user navigates to "Fleet" tab and "Vehicle Cost" module
		Then the user able to see information on "Vehıcle Cost" page	

	#*User Story :* 
	#
	#As a Truck Driver I should be able to get Vehicle Costs informations
	#
	# 
	#
	#*_Acceptance Criterias:_*
	#
	#{color:#172b4d}1-Truck driver can see vehicle costs informations once navigate to vehicle page{color}
	# *{color:#de350b}2-Truck driver can change page number for getting following vehicle costs informations{color}*
	# 3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	# 4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	@TRAN-261 @TRAN-264
	Scenario:  US-025 Truck Driver Change Page Number on Vehicle Costs Page Test
		When the user change page on "Vehicle Cost" module
		Then the user able to get following vehicle costs informations	

	#*User Story :* 
	#
	#As a Truck Driver I should be able to get Vehicle Costs informations
	#
	# 
	#
	#*_Acceptance Criterias:_*
	#
	#{color:#172b4d}1-Truck driver can see vehicle costs informations once navigate to vehicle page{color}
	# 2-Truck driver can change page number for getting following vehicle costs informations
	# {color:#de350b}*3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)*{color}
	# 4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	@TRAN-262 @TRAN-264
	Scenario Outline:  US-025 Truck Driver Change the Entity Number by Dropdown(10,25,50,100) on Vehicle Costs Page Test
		When the user change page on "Vehicle Costs" module
		Then the user change entity number by clicking the view per page dropdown by "<page_number>"
		Examples:
		|page_number|
		|10|
		|25|
		|50|
		|100|
		#Then the user able to see the number of selected dropdown

	#*User Story :* 
	#
	#As a Truck Driver I should be able to get Vehicle Costs informations
	#
	# 
	#
	#*_Acceptance Criterias:_*
	#
	#{color:#172b4d}1-Truck driver can see vehicle costs informations once navigate to vehicle page{color}
	# 2-Truck driver can change page number for getting following vehicle costs informations
	# 3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	# {color:#de350b}*4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats*{color}
	@TRAN-263 @TRAN-264
	Scenario:  US-025 Truck Driver Use Export Grid Button in csv and xlsx Formats on Vehicle Costs Page Test
		When the user click export grid 
		Then the user able to select "CSV" "XLSX
		Then the user can get all information via e-mail