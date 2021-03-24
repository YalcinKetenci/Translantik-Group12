Feature: 
	#by HARUN
	Background:
		#@TRAN-298
		Given The user on the login page
		When The user enters valid credentials for store manager
		Then User should be able to login
		

	#{color:#FF0000}*User Story :* {color}
	#
	#As a Store manager/Sales Manager I should be able to use all filtering functions
	#  
	#
	#{color:#FF0000}*_Acceptance Criterias:_*{color}
	#
	#+_*1-{color:#FF0000}Store Manager{color}/*_+Sales Manager +_*can use Grid Settings button for arranging demanded columns.*_+
	# 2-Store Manager/Sales Manager can use Filters sign with opening Manage Filters button for filtering informations
	# 3-Store Manager/Sales Manager can refresh the page by using Refresh button
	# 4-Store Manager/Sales Manager can reset the filtering settings by using Reset button
	@TRAN-288 @TRAN-296 @US-034
	Scenario: US-34 Store manager grid settings button on vehicle costs test
		Given the user navigates to "Fleet" "Vehicle Costs"
		Then the user click "Grid Settings" button on "Vehicle Costs" page
		And the user should be able to see "Grid Settings" window on "Vehicle Costs" page
		Then user should be able to enters one of the given data inside the text-box on the "Grid Settings" window
		| Id             |
		| Odometer Value |
		| Date           |
		| Driver         |
		| Unit           |
		| Model          |
		And the user should be able to see the only options includes the written character on the "Grid Settings" window

	#1-Store Manager/Sales Manager can use Grid Settings button for arranging demanded columns.
	#2-_*Store Manager*_/Sales Manager{color:#172b4d} *_can use Filters sign with opening Manage Filters button for filtering informations_*{color}
	#3-Store Manager/Sales Manager can refresh the page by using Refresh button
	#4-Store Manager/Sales Manager can reset the filtering settings by using Reset button
	@TRAN-290 @TRAN-296 @US-034
	Scenario:  US-34 Store manager use filter sign Vehicle costs module
		Given the user navigates to "Fleet" "Vehicle Costs"
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
	# 3-+_*Store Manager*_+/Sales Manager +_*can refresh the page by using Refresh button*_+
	# 4-Store Manager/Sales Manager can reset the filtering settings by using Reset button
	@TRAN-292 @TRAN-296 @US-034
	Scenario:  US-34 Store manager use refresh button in Vehicle costs module Test
		Given the user navigates to "Fleet" "Vehicle Costs"
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
	# 4-_*Store Manager*_/Sales Manager _*can reset the filtering settings by using Reset button*_
	@TRAN-294 @TRAN-296 @US-034
	Scenario:  US-34 Store manager use reset button in Vehicle costs module Test
		Given the user navigates to "Fleet" "Vehicle Costs"
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to select "Id" option
		And the user should be able to see the selected options as headers on the table
		And the user should be able to click "x" button on the "Grid Settings" window
		And the user should be able to click "Reset" button
		And the page should be reset