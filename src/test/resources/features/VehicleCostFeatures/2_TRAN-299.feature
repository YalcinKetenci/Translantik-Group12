Feature: 

	Background:
		#@TRAN-299
		Given The user on the login page
		When The user enters valid credentials for sales manager
		Then User should be able to login
		

	#{color:#ff0000}*User Story :* {color}
	#
	#As a Store manager/Sales Manager I should be able to use all filtering functions
	#  
	#
	#{color:#ff0000}*_Acceptance Criterias:_*{color}
	#
	#+_*1*_+{color:#172b4d} Store{color} {color:#172b4d}Manage{color}r*{color:#172b4d}/*Sales Manager*{color}**_ +_**ca*n use Grid Settings button for arranging demanded columns._+*
	# 2-Store Manager/Sales Manager can use Filters sign with opening Manage Filters button for filtering informations
	# 3-Store Manager/Sales Manager can refresh the page by using Refresh button
	# 4-Store Manager/Sales Manager can reset the filtering settings by using Reset button
	@TRAN-289 @TRAN-296
	Scenario: US-34 Sales manager grid settings button on vehicle costs test
		Given the user navigates to "Fleet" "Vehicle Costs"
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to enters one of the given data inside the text-box on the "Grid Settings" window
		| Id             |
		| Odometer Value |
		| Date           |
		| Driver         |
		| Unit           |
		| Model          |
		And the user should be able to see the only options that includes the written character on the "Grid Settings" window	

	#1-Store Manager/Sales Manager can use Grid Settings button for arranging demanded columns.
	# 2-Store Manager/_*Sales Manager*_{color:#172b4d} *_can use Filters sign with opening Manage Filters button for filtering informations_*{color}
	# 3-Store Manager/Sales Manager can refresh the page by using Refresh button
	# 4-Store Manager/Sales Manager can reset the filtering settings by using Reset button
	@TRAN-291 @TRAN-296
	Scenario: US-34 Sales manager use filter sign Vehicle costs module
		When the user navigates to "Fleet" "Vehicle Costs"
		Then the user should be able to click "Filters" button
		And the user should be able to see Manage Filters button
		And the user should be able to click Manage filters button
		And the user should be able to see "Manage filters" window		

	#{color:#de350b}*User Story :* {color}
	#
	#As a Store manager/Sales Manager I should be able to use all filtering functions
	#  
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Store Manager/Sales Manager can use Grid Settings button for arranging demanded columns.
	# 2-Store Manager/Sales Manager can use Filters sign with opening Manage Filters button for filtering informations
	# 3-Store Manager/_*Sales Manager*_ +_*can refresh the page by using Refresh button*_+
	# 4-Store Manager/Sales Manager can reset the filtering settings by using Reset button
	@TRAN-293 @TRAN-296
	Scenario: US-34 Slaes manager use refresh button in Vehicle costs module Test
		When the user navigates to "Fleet" "Vehicle Cost"
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to select "Id" option
		And the user should be able to see the selected options as headers on the table
		And the user should be able to click "x" button on the "Grid Settings" window
		And the user should be able to click "Refresh" button
		And the page should be refreshed	

	#{color:#de350b}*User Story :* {color}
	#
	#As a Store manager/Sales Manager I should be able to use all filtering functions
	#  
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Store Manager/Sales Manager can use Grid Settings button for arranging demanded columns.
	# 2-Store Manager/Sales Manager can use Filters sign with opening Manage Filters button for filtering informations
	# 3-Store Manager/Sales Manager can refresh the page by using Refresh button
	# 4-Store Manager/_*Sales Manager*_ _*can reset the filtering settings by using Reset button*_
	@TRAN-295 @TRAN-296 @truckdriver
	Scenario: US-34 Sales manager use reset button in Vehicle costs module Test
		When the user navigates to "Fleet" "Vehicle Costs"
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to select "Id" option
		And the user should be able to see the selected options as headers on the table
		And the user should be able to click "x" button on the "Grid Settings" window
		And the user should be able to click "Reset" button
		And the page should be reset