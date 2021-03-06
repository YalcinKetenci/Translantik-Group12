Feature:

  Background:
		#@TRAN-233
    Given The user on the login page
    When The user enters valid credentials for sales manager
    Then User should be able to login

#  Background:
		#@TRAN-299
#    Given Vytrack URL: "http://qa.translantik.com/"
#    When I am on Vytrack login page: "http://qa.translantik.com/user/login"
#    Then I should be able to log in with valid credentials
#    And enter username: "salesmanager101"
#    And password:"UserUser123"
#    Then I should be able to see home page



	#_{color:#de350b}+*User Story :*+{color}_ 
	#
	#As a Sales Manager I should be able to use sidebar widget
	#
	# 
	#
	#{color:#de350b}+*_Acceptance Criterias:_*+{color}
	#
	#Sales Manager can add Recent Email, Sticky Note, Task List Widgets by using (+) plus sign
  @TRAN-300 @TRAN-282
  Scenario: TRAN-29 Sales Manager sidebar widgets test
    When the user clicks plus button
    And sidebar widgets page opened
    And the user click add button
    Then the widget is added

	#{color:#de350b}+_*User Story :*_+{color} 
	#
	#As a Sales Manager I should be able to use pins and pages
	#
	# 
	#
	#{color:#de350b}+*_Acceptance Criterias:_*+{color}
	#
	#Sales Manager can pin the page by using pin sign
  @TRAN-301 @TRAN-282
  Scenario: TRAN-29 Sales Manager pins pages test
    Given the user navigates to "Customers" "Contacts"
    When the user click pin button
    Then the user made the page pinned

	#{color:#de350b}+_*User Story :*_+{color} 
	#
	#As a Sales Manager I should be able to use favourite pages
	#
	# 
	#
	#{color:#de350b}+*_Acceptance Criterias:_*+{color}
	#
	#Sales Manager can make the page favourite by using favourite sign
  @TRAN-302 @TRAN-282
  Scenario: TRAN-29 Sales Manager favourite pages test
    Given the user navigates to "Customers" "Contacts"
    When the user click star button
    Then the user made the page favorite