Feature: 

	Background:
		#@TRAN-233
		Given The user on the login page
		When The user enters valid credentials
		Then User should be able to login
		

	#{color:#de350b}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#*1-Truck driver can use Grid Settings button for arranging demanded columns.*
	# 2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
	# 3-Truck driver can refresh the page by using Refresh button
	# 4-Truck driver can reset the filtering settings by using Reset button
	@TRAN-237 @TRAN-247
	Scenario:  US-017 | Truck driver can find and use the options by write the some valid characters.
		When the user navigates to "Fleet" "Vehicle Odometer"
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

	#{color:#de350b}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#*1-Truck driver can use Grid Settings button for arranging demanded columns.*
	# 2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
	# 3-Truck driver can refresh the page by using Refresh button
	# 4-Truck driver can reset the filtering settings by using Reset button
	@TRAN-238 @TRAN-247
	Scenario: US-017 | Truck driver can NOT filter the options by write the some INVALID characters.
		When the user navigates to "Fleet" "Vehicle Odometer"
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to enters "car" inside the Quick Search area on the "Grid Settings" window
		And the user should  be able to see No columns found on the "Grid Settings" window	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#*1-Truck driver can use Grid Settings button for arranging demanded columns.*
	#2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
	#3-Truck driver can refresh the page by using Refresh button
	#4-Truck driver can reset the filtering settings by using Reset button
	@TRAN-239 @TRAN-269 @TRAN-247
	Scenario: US-017 | Truck driver can select all options.
		When the user navigates to "Fleet" "Vehicle Odometer"
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to click "Select All" button on the "Grid Settings" window
		And the user should be able to select all given options
		| Id             |
		| Odometer Value |
		| Date           |
		| Driver         |
		| Unit           |
		| Model          |
		And the user should be able to see the selected options as headers on the table	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#*1-Truck driver can use Grid Settings button for arranging demanded columns.*
	#2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
	#3-Truck driver can refresh the page by using Refresh button
	#4-Truck driver can reset the filtering settings by using Reset button
	@TRAN-240 @TRAN-269 @TRAN-247
	Scenario: US-017 | Truck driver can see only selected options by click selected button.
		When the user navigates to "Fleet" "Vehicle Odometer"
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to click "Selected" button on the "Grid Settings" window
		And the user should be able to see the only selected options on the "Grid Settings" window	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#*1-Truck driver can use Grid Settings button for arranging demanded columns.*
	#2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
	#3-Truck driver can refresh the page by using Refresh button
	#4-Truck driver can reset the filtering settings by using Reset button
	@TRAN-241 @TRAN-247
	Scenario: US-017| Truck driver can NOT see all options by click “Selected”.
		When the user navigates to "Fleet" "Vehicle Odometer"
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to click "Selected" button on the "Grid Settings" window
		And the user should NOT be able to see the all given options on the "Grid Settings" window
		| Id             |
		| Odometer Value |
		| Date           |
		| Driver         |
		| Unit           |
		| Model          |	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#*1-Truck driver can use Grid Settings button for arranging demanded columns.*
	#2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
	#3-Truck driver can refresh the page by using Refresh button
	#4-Truck driver can reset the filtering settings by using Reset button
	@TRAN-242 @TRAN-269 @TRAN-247
	Scenario: US-017 | Truck driver can see all options by click “All” button.
		When the user navigates to "Fleet" "Vehicle Odometer"
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to click "Selected" button on the "Grid Settings" window
		And the user should be able to click "All" button on the "Grid Settings" window
		And the user should be able to see the all given options on the "Grid Settings" window
		| Id             |
		| Odometer Value |
		| Date           |
		| Driver         |
		| Unit           |
		| Model          |	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#*1-Truck driver can use Grid Settings button for arranging demanded columns.*
	#2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
	#3-Truck driver can refresh the page by using Refresh button
	#4-Truck driver can reset the filtering settings by using Reset button
	@TRAN-243 @TRAN-269 @TRAN-247
	Scenario: US-017 | Truck driver can select options. 
		When the user navigates to "Fleet" "Vehicle Odometer"
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to select(if already not) and deselect the given options
		| Id             |
		| Odometer Value |
		| Date           |
		| Driver         |
		| Unit           |
		| Model          |
		And the user should be able to see the selected options as headers on the table

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#*1-Truck driver can use Grid Settings button for arranging demanded columns.*
	#2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
	#3-Truck driver can refresh the page by using Refresh button
	#4-Truck driver can reset the filtering settings by using Reset button
	@TRAN-244 @TRAN-247
	Scenario: US-017 | Truck driver can close Grid Settings
		When the user navigates to "Fleet" "Vehicle Odometer"
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to click "x" button on the "Grid Settings" window
		And Grid Settings window should be disappear	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#*1-Truck driver can use Grid Settings button for arranging demanded columns.*
	#2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
	#3-Truck driver can refresh the page by using Refresh button
	#4-Truck driver can reset the filtering settings by using Reset button
	@TRAN-245 @TRAN-269 @TRAN-247
	Scenario: US-017 | Truck driver can use Filters sign
		When the user navigates to "Fleet" "Vehicle Odometer"
		Then the user should be able to click "Filters" button
		And the user should be able to see Manage Filters button
		And the user should be able to click Manage filters button
		And the user should be able to see "Manage filters" window	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can use Grid Settings button for arranging demanded columns.
	# *2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations*
	# 3-Truck driver can refresh the page by using Refresh button
	# 4-Truck driver can reset the filtering settings by using Reset button
	@TRAN-246 @TRAN-247
	Scenario:  US-017 | Truck driver can find and manipulate the options by write the some valid characters.
		When the user navigates to "Fleet" "Vehicle Odometer"
		Then the user should be able to click "Filters" button
		And the user should be able to see Manage Filters button
		And the user should be able to click Manage filters button
		And the user should be able to see "Manage filters" window
		And the user should be able to enters one of the given data inside the text-box on the "Manage filters" window
		| Odometer Value |
		| Date           |
		| Driver         |
		| Unit           |
		| Model          |
		And the user should be able to see the only options that includes the written character on the "Manage filters" window	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can use Grid Settings button for arranging demanded columns.
	#*2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations*
	#3-Truck driver can refresh the page by using Refresh button
	#4-Truck driver can reset the filtering settings by using Reset button
	@TRAN-248 @TRAN-247
	Scenario: US-017 | Truck driver can NOT filter the options by write the some INVALID characters
		When the user navigates to "Fleet" "Vehicle Odometer"
		Then the user should be able to click "Filters" button
		And the user should be able to see Manage Filters button
		And the user should be able to click Manage filters button
		And the user should be able to see "Manage filters" window
		And the user should be able to enters "car" inside the text-box on the "Manage filters" window
		And the user should NOT be able to see any given options on the "Manage filters" window
		| Odometer Value |
		| Date           |
		| Driver         |
		| Unit           |
		| Model          |	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can use Grid Settings button for arranging demanded columns.
	#*2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations*
	#3-Truck driver can refresh the page by using Refresh button
	#4-Truck driver can reset the filtering settings by using Reset button
	@TRAN-249 @TRAN-269 @TRAN-247
	Scenario: US-017 | Truck driver can select options
		When the user navigates to "Fleet" "Vehicle Odometer"
		Then the user should be able to click "Filters" button
		And the user should be able to see Manage Filters button
		And the user should be able to click Manage filters button
		And the user should be able to see "Manage filters" window
		And the user should be able to select(if already not) the given options
		| Odometer Value |
		| Date           |
		| Driver         |
		| Unit           |
		| Model          |
		And the user should be able to see the selected options as headers next to Manage Filters button
		And the user should be able to deselect the given options
		| Odometer Value |
		| Date           |
		| Driver         |
		| Unit           |
		| Model          |
		And the user should NOT be able to see the selected options as headers next to Manage Filters button	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can use Grid Settings button for arranging demanded columns.
	#*2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations*
	#3-Truck driver can refresh the page by using Refresh button
	#4-Truck driver can reset the filtering settings by using Reset button
	@TRAN-250 @TRAN-247
	Scenario: US-017 | Truck driver can filter the cars by using Odometer Value/Contains(with VALID data)
		When the user navigates to "Fleet" "Vehicle Odometer"
		Then the user should be able to click "Filters" button
		And the user should be able to see Manage Filters button
		And the user should be able to click Manage filters button
		And the user should be able to see "Manage filters" window
		And the user should be able to select(if already not) the given options
		| Odometer Value |
		| Date           |
		| Driver         |
		| Unit           |
		| Model          |
		And the user should be able to see the selected options as headers next to Manage Filters button
		And the user should be able to click the "Odometer Value" item
		And the user should be able to click the "Equals" option
		And the user should be able to put "125,000" "Equals" into the equals textboxes on the odometer value item
		And the user should be able to click Update button
		And the user should be able to see only include "125,000" odometers	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can use Grid Settings button for arranging demanded columns.
	#*2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations*
	#3-Truck driver can refresh the page by using Refresh button
	#4-Truck driver can reset the filtering settings by using Reset button
	@TRAN-251 @TRAN-247
	Scenario: US-017 | Truck driver can filter the cars by using Odometer Value/Contains(with INVALID data)
		When the user navigates to "Fleet" "Vehicle Odometer"
		Then the user should be able to click "Filters" button
		And the user should be able to see Manage Filters button
		And the user should be able to click Manage filters button
		And the user should be able to see "Manage filters" window
		And the user should be able to select(if already not) the given options
		| Odometer Value |
		| Date           |
		| Driver         |
		| Unit           |
		| Model          |
		And the user should be able to see the selected options as headers next to Manage Filters button
		And the user should be able to click the "Odometer Value" item
		And the user should be able to click the "Equals" option
		And the user should be able to put "999" "Equals" into the equals textboxes on the odometer value item
		And the user should be able to click Update button
		And the user should NOT be able to see any odometers	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can use Grid Settings button for arranging demanded columns.
	#2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
	#*3-Truck driver can refresh the page by using Refresh button*
	#4-Truck driver can reset the filtering settings by using Reset button
	@TRAN-252 @TRAN-247
	Scenario: US-017 | Truck driver can refresh the tablo 
		When the user navigates to "Fleet" "Vehicle Odometer"
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to select "Id" option
		And the user should be able to see the selected options as headers on the table
		And the user should be able to click "x" button on the "Grid Settings" window
		And the user should be able to click "Refresh" button
		And the page should be refreshed	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can use Grid Settings button for arranging demanded columns.
	#2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
	#3-Truck driver can refresh the page by using Refresh button
	#*4-Truck driver can reset the filtering settings by using Reset button*
	@TRAN-253 @TRAN-269 @TRAN-247
	Scenario: US-017 | Truck driver can reset the tablo 
		When the user navigates to "Fleet" "Vehicle Odometer"
		Then the user should be able to click "Grid Settings" button
		And the user should be able to see "Grid Settings" window
		And the user should be able to select "Id" option
		And the user should be able to see the selected options as headers on the table
		And the user should be able to click "x" button on the "Grid Settings" window
		And the user should be able to click "Reset" button
		And the page should be reset