Feature:

  Background:
		#@TRAN-233
    Given The user on the login page
    When The user enters valid credentials
    Then User should be able to login
		
	#1_TRAN-233
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
  Scenario: TRAN- 8 | Truck driver can find and use the options by write the some valid characters.
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
    And the user should be able to see the only  options that includes the written character on the "Grid Settings" window

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
  Scenario: TRAN-8 | Truck driver can NOT filter the options by write the some INVALID characters.
    When the user navigates to "Fleet" "Vehicle Odometer"
    Then the user should be able to click "Grid Settings" button
    And the user should be able to see "Grid Settings" window
    And the user should be able to enters "car" inside the "Quick Search" area on the "Grid Settings" window
    And the user should be able to put the data
    And the user should NOT be able to see any given options on the "Grid Settings" window
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
  @TRAN-239 @TRAN-247
  Scenario: TRAN-8 | Truck driver can select all options.
    When the user navigates to "Fleet" "Vehicle Odometer"
    Then the user should be able to click "Grid Settings" button
    And the user should be able to see "Grid Settings" window
    And the user should be able to click "Select all" button on the "Grid Settings" window
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
  @TRAN-240 @TRAN-247
  Scenario: TRAN-8 | Truck driver can see only selected options by click selected button.
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
  Scenario: TRAN- 8 | Truck driver can NOT see all options by click “Selected”.
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
  @TRAN-242 @TRAN-247
  Scenario: TRAN-8 | Truck driver can see all options by click All button.
    When the user navigates to "Fleet" "Vehicle Odometer"
    Then the user should be able to click "Grid Settings" button
    And the user should be able to see "Grid Settings" window
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
  @TRAN-243 @TRAN-247
  Scenario: TRAN-8 | Truck driver can select options.
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
  @TRAN-244 @TRAN-157 @TRAN-247
  Scenario: TRAN-8 | Truck driver can close Grid Settings
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
  @TRAN-245 @TRAN-247
  Scenario: TRAN-8 | Truck driver can use Filters sign
    When the user navigates to "Fleet" "Vehicle Odometer"
    Then the user should be able to click "Filters" button
    And the user should be able to see Manage Filters button
    And the user should be able to click "Manage Filters" button
    And the user should be able to see "Manage Filters" window

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
  Scenario: TRAN-8 | Truck driver can find and manipulate the options by write the some valid characters.
    When the user navigates to "Fleet" "Vehicle Odometer"
    Then the user should be able to click "Filters" button
    And the user should be able to see Manage Filters button
    And the user should be able to click "Manage Filters" button
    And the user should be able to see "Manage Filters" window
    And the user should be able to click "Manage Filters" button
    And the user should be able to enters one of the given data inside the text-box on the "Manage Filters" window
      | Odometer Value |
      | Date           |
      | Driver         |
      | Unit           |
      | Model          |
    And the user should be able to see the only  options that includes the written character on the "Manage Filters" window

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
  Scenario: TRAN-8 | Truck driver can NOT filter the options by write the some INVALID characters
    When the user navigates to "Fleet" "Vehicle Odometer"
    Then the user should be able to click "Filters" button
    And the user should be able to see Manage Filters button
    And the user should be able to click "Manage Filters" button
    And the user should be able to see "Manage Filters" window
    And the user should be able to click "Manage Filters" button
    And the user should be able to enters "car" inside the text-box on the "Manage Filters" window
    And the user should NOT be able to see any given options on the "Manage Filters" window
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
  @TRAN-249 @TRAN-247
  Scenario: TRAN-8 | Truck driver can select options
    When the user navigates to "Fleet" "Vehicle Odometer"
    Then the user should be able to click "Filters" button
    And the user should be able to see Manage Filters button
    And the user should be able to click "Manage Filters" button
    And the user should be able to see "Manage Filters" window
    And the user should be able to click "Manage Filters" button
    And the user should be able to enters "car" inside the text-box on the "Manage Filters" window
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
  Scenario: TRAN-8 | Truck driver can filter the cars by using Odometer Value/Contains(with VALID data)
    When the user navigates to "Fleet" "Vehicle Odometer"
    Then the user should be able to click "Filters" button
    And the user should be able to see Manage Filters button
    And the user should be able to click "Manage Filters" button
    And the user should be able to see "Manage Filters" window
    And the user should be able to click "Manage Filters" button
    And the user should be able to enters "car" inside the text-box on the "Manage Filters" window
    And the user should be able to select(if already not) the given options
      | Odometer Value |
      | Date           |
      | Driver         |
      | Unit           |
      | Model          |
    And the user should be able to see the selected options as headers next to Manage Filters button
    And the user should be able to click the "Odometer Value" option
    And the user should be able to click the "Equals" option
    And the user should be able to put "123"
    And the user should be able to put Update button
    And the user should be able to see only include "123" odometers

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
  Scenario: TRAN- 8 | Truck driver can filter the cars by using Odometer Value/Contains(with INVALID data)
    When the user navigates to "Fleet" "Vehicle Odometer"
    Then the user should be able to click "Filters" button
    And the user should be able to see Manage Filters button
    And the user should be able to click "Manage Filters" button
    And the user should be able to see "Manage Filters" window
    And the user should be able to click "Manage Filters" button
    And the user should be able to enters "car" inside the text-box on the "Manage Filters" window
    And the user should be able to select(if already not) the given options
      | Odometer Value |
      | Date           |
      | Driver         |
      | Unit           |
      | Model          |
    And the user should be able to see the selected options as headers next to Manage Filters button
    And the user should be able to click the "Odometer Value" option
    And the user should be able to click the "Equals" option
    And the user should be able to put "999"
    And the user should be able to click "Update" button
    And the user should NOT be able to see only include "123" odometers

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
  Scenario: TRAN-8 | Truck driver can refresh the tablo
    When the user navigates to "Fleet" "Vehicle Odometer"
    Then the user should be able to click "Grid Settings" button
    And the user should be able to see "Grid Settings" window
    And the user should be able to select "Id" option
    And the user should be able to click "x" button on the "Grid Settings" window
    And the user should be able to see the selected options as headers on the table
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
  @TRAN-253 @TRAN-247
  Scenario: TRAN-8 | Truck driver can reset the table
    When the user navigates to "Fleet" "Vehicle Odometer"
    Then the user should be able to click "Grid Settings" button
    And the user should be able to see "Grid Settings" window
    And the user should be able to select "Id" option
    And the user should be able to click "x" button on the "Grid Settings" window
    And the user should be able to see the selected options as headers on the table
    And the user should be able to click "Refresh" button
    And the page should be refreshed