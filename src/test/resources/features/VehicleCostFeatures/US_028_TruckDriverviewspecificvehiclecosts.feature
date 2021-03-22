Feature:
	#by HARUN
	Background:
		#@TRAN-233
		Given The user on the login page
		When The user enters valid credentials
		Then User should be able to login
		

	#{color:#de350b}*User Story :* {color}
	#
	#As a Truck Driver I should be able to view any vehicle costs in the grid.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck Driver can view any vehicle costs in the grid by using eye sign inside … sign.
	# +_*2-Truck Driver can not delete vehicle costs in the grid by using recycle bin inside … sign.*_+
	# 3-Truck Driver can not edit vehicle costs in the grid by using edit inside ... sign."

	@TRAN-284 @TRAN-286 @US-028
	Scenario: US-028 Truck Driver use recycle pin on vehicle costs page Test
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click recyle sign
		Then the user can't delete item

	#{color:#de350b}*User Story :* {color}
	#
	#As a Truck Driver I should be able to view any vehicle costs in the grid.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#+_*1-Truck Driver can view any vehicle costs in the grid by using eye sign inside … sign.*_+
	# 2-Truck Driver can not delete vehicle costs in the grid by using recycle bin inside … sign.
	# 3-Truck Driver can not edit vehicle costs in the grid by using edit inside ... sign.
	@TRAN-283 @TRAN-286 @US-028
	Scenario: US-028 Truck Driver using eye sign on  vehicle costs page test
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click eye sign 
		Then the user see item's information	

	#{color:#de350b}*User Story :* {color}
	#
	#As a Truck Driver, I should be able to view any vehicle costs in the grid.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck Driver can view any vehicle costs in the grid by using eye sign inside … sign.
	# 2-Truck Drivers can not delete vehicle costs in the grid by using recycle bin inside … sign.
	# _*3-Truck Driver can not edit vehicle costs in the grid by using edit inside ... sign."*_
	@TRAN-285 @TRAN-286 @US-028
	Scenario: US-028Truck Driver can not edit vehicle cost on vehicle costs  page test 
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click edit sign 
		Then the user can't edit item