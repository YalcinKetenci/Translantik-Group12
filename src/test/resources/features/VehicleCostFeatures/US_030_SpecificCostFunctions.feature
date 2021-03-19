Feature: 

	Background:
		#@TRAN-233
		Given The user on the login page
		When The user enters valid credentials
		Then User should be able to login
		

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#*"1-Truck Driver can see all informations about specific vehicle cost when click on it.*
	#2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	#3-Truck Driver can refresh the activities by using refresh button
	#4-Truck Driver can reach the all activities by using Newer and Older buttons
	#5-Truck driver can change page number for getting following attachment informations
	#6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.
	#8-Truck driver can refresh the attachments by using Refresh button
	#9-Truck driver can reset the filtering settings by using Reset button for attachments"
	@TRAN-355 @TRAN-354
	Scenario: US-30 | Truck Driver can see all informations about specific vehicle cost
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click first vehicle cost
		Then the user should be able to see the given vehicle cost informations
		|General|
		|Activity|
		|Additional Information|	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck Driver can see all informations about specific vehicle cost when click on it.
	#*2-Truck Driver can filter activities by using either Activity Type button or Date Range button*
	#3-Truck Driver can refresh the activities by using refresh button
	#4-Truck Driver can reach the all activities by using Newer and Older buttons
	#5-Truck driver can change page number for getting following attachment informations
	#6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.
	#8-Truck driver can refresh the attachments by using Refresh button
	#9-Truck driver can reset the filtering settings by using Reset button for attachments"
	@TRAN-356 @TRAN-354
	Scenario: US-30 | Truck Driver can filter activities by using Date Range button
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click first vehicle cost
		Then the user should be able to click "Date Range" button
		And the user should be able to choose "later than"
		And the user should be able to put "Mar 5, 2021 "
		And the user should be able to see only activities that after "Mar 5, 2021"
			

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck Driver can see all informations about specific vehicle cost when click on it.
	#2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	#3-Truck Driver can refresh the activities by using refresh button
	#4-Truck Driver can reach the all activities by using Newer and Older buttons
	#5-Truck driver can change page number for getting following attachment informations
	#6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.
	#8-Truck driver can refresh the attachments by using Refresh button
	#9-Truck driver can reset the filtering settings by using Reset button for attachments"
	@TRAN-357 @TRAN-354
	Scenario: US-30 | Truck Driver can refresh the activities
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click first vehicle cost
		And the user should be able to reach the all activities by clicking the "Older" button
		Then the user should be able to click "Activity Refresh" button
		And the attachments should be able to refreseh
			

	#"1-Truck Driver can see all informations about specific vehicle cost when click on it.
	#2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	#3-Truck Driver can refresh the activities by using refresh button
	#*4-Truck Driver can reach the all activities by using Newer and Older buttons*
	#5-Truck driver can change page number for getting following attachment informations
	#6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.
	#8-Truck driver can refresh the attachments by using Refresh button
	#9-Truck driver can reset the filtering settings by using Reset button for attachments"
	@TRAN-358 @TRAN-354
	Scenario: US-30 | Truck Driver can use Newer Older button
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click first vehicle cost
		Then the user should be able to reach the all activities by clicking the "Older" button
		And the user should be able to reach the all activities by clicking the "Newer" button
			

	#__
	#
	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck Driver can see all informations about specific vehicle cost when click on it.
	#2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	#3-Truck Driver can refresh the activities by using refresh button
	#4-Truck Driver can reach the all activities by using Newer and Older buttons
	#*5-Truck driver can change page number for getting following attachment informations*
	#6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.
	#8-Truck driver can refresh the attachments by using Refresh button
	#9-Truck driver can reset the filtering settings by using Reset button for attachments"
	@TRAN-359 @TRAN-354
	Scenario: US-30 | Truck driver can change page number for getting following attachment informations
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click first vehicle cost
		And the user change the number of view per page as "10"
		Then the user should be able to change the page by clicking "Next Page" button
		And the user should be able to change the page by clicking "Previous Page" button	

	#*User Story :* 
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#*_Acceptance Criterias:_*
	#
	#"1-Truck Driver can see all informations about specific vehicle cost when click on it.
	# 2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	# 3-Truck Driver can refresh the activities by using refresh button
	# 4-Truck Driver can reach the all activities by using Newer and Older buttons
	# 5-Truck driver can change page number for getting following attachment informations
	# *6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)*
	# 7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.
	# 8-Truck driver can refresh the attachments by using Refresh button
	# 9-Truck driver can reset the filtering settings by using Reset button for attachments"
	@TRAN-360 @TRAN-354
	Scenario Outline: US-30 | Truck driver can change the entity number
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click first vehicle cost
		Then the user change entity number by clicking the view per page dropdown by "<page_number>"
		Examples:
		|page_number|
		|10|
		|25|
		|50|
		|100|	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck Driver can see all informations about specific vehicle cost when click on it.
	# 2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	# 3-Truck Driver can refresh the activities by using refresh button
	# 4-Truck Driver can reach the all activities by using Newer and Older buttons
	# 5-Truck driver can change page number for getting following attachment informations
	# 6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	# *7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.*
	# 8-Truck driver can refresh the attachments by using Refresh button
	# 9-Truck driver can reset the filtering settings by using Reset button for attachments"
	@TRAN-361 @TRAN-354
	Scenario: US-30 | Truck driver can find and use the options by write the some valid characters.
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click first vehicle cost
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to enters one of the given data inside the text-box on the "Grid Settings" window
		|File Name|
		|File Size|
		|Created At|
		|Comment|
		And the user should be able to see the only options that includes the written character on the "Grid Settings" window	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck Driver can see all informations about specific vehicle cost when click on it.
	#2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	#3-Truck Driver can refresh the activities by using refresh button
	#4-Truck Driver can reach the all activities by using Newer and Older buttons
	#5-Truck driver can change page number for getting following attachment informations
	#6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#*7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.*
	#8-Truck driver can refresh the attachments by using Refresh button
	#9-Truck driver can reset the filtering settings by using Reset button for attachments"
	@TRAN-362 @TRAN-354
	Scenario: US-30 | Truck driver can NOT filter the options by write the some INVALID characters.
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click first vehicle cost
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to enters "car" inside the Quick Search area on the "Grid Settings" window
		And the user should  be able to see No columns found on the "Grid Settings" window	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck Driver can see all informations about specific vehicle cost when click on it.
	#2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	#3-Truck Driver can refresh the activities by using refresh button
	#4-Truck Driver can reach the all activities by using Newer and Older buttons
	#5-Truck driver can change page number for getting following attachment informations
	#6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#*7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.*
	#8-Truck driver can refresh the attachments by using Refresh button
	#9-Truck driver can reset the filtering settings by using Reset button for attachments"
	@TRAN-363 @TRAN-354
	Scenario: US-30 | Truck driver can select all options
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click first vehicle cost
		Then the user should be able to click "Grid Settings" button
				And the user should be able to see "Grid Settings" window
				And the user should be able to unselect first two options
				And the user should be able to click "Select All" button on the "Grid Settings" window
				And the user should be able to select all given options
					|File name|
					|File size|
					|Created At|
					|Comment|	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck Driver can see all informations about specific vehicle cost when click on it.
	#2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	#3-Truck Driver can refresh the activities by using refresh button
	#4-Truck Driver can reach the all activities by using Newer and Older buttons
	#5-Truck driver can change page number for getting following attachment informations
	#6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#*7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.*
	#8-Truck driver can refresh the attachments by using Refresh button
	#9-Truck driver can reset the filtering settings by using Reset button for attachments"
	@TRAN-364 @TRAN-354
	Scenario: US-30 | Truck driver can close Grid Settings
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click first vehicle cost
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to click "x" button on the "Grid Settings" window
		And Grid Settings window should be disappear	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck Driver can see all informations about specific vehicle cost when click on it.
	#2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	#3-Truck Driver can refresh the activities by using refresh button
	#4-Truck Driver can reach the all activities by using Newer and Older buttons
	#5-Truck driver can change page number for getting following attachment informations
	#6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.
	#*8-Truck driver can refresh the attachments by using Refresh button*
	#9-Truck driver can reset the filtering settings by using Reset button for attachments"
	@TRAN-365 @TRAN-354
	Scenario: US-30 | Truck driver can refresh the attachments
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click first vehicle cost
		Then the user should be able to click "Refresh" button
		And the page should be refreshed

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck Driver can see all informations about specific vehicle cost when click on it.
	#2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	#3-Truck Driver can refresh the activities by using refresh button
	#4-Truck Driver can reach the all activities by using Newer and Older buttons
	#5-Truck driver can change page number for getting following attachment informations
	#6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.
	#8-Truck driver can refresh the attachments by using Refresh button
	#*9-Truck driver can reset the filtering settings by using Reset button for attachments"*
	@TRAN-366 @TRAN-354
	Scenario: US-30 | Truck driver can reset the filtering settings by using Reset button for attachments
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click first vehicle cost
		And the user change the number of view per page as "10"
		And the user should be able to change the page by clicking "Next Page" button
		Then the user should be able to click "Reset" button
		And the page should be reset	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck Driver can see all informations about specific vehicle cost when click on it.
	#2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	#3-Truck Driver can refresh the activities by using refresh button
	#4-Truck Driver can reach the all activities by using Newer and Older buttons
	#5-Truck driver can change page number for getting following attachment informations
	#6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#*7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.*
	#8-Truck driver can refresh the attachments by using Refresh button
	#9-Truck driver can reset the filtering settings by using Reset button for attachments"
	@TRAN-368 @TRAN-354
	Scenario: US-30 | Truck driver can unselect the options
		Given the user navigates to "Fleet" "Vehicle Costs"
		When the user click first vehicle cost
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to unselect first two options