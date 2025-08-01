Feature: Login Functionality

  @loginSuccess #TC-001
  Scenario Outline: Login with correct credentials
    Given a user, goes to the login page
    When the user enters "<username>" and "<password>"
    Then the user should see the home page with the products

    Examples:
      |username			        | password	    |
      | standard_user		    | secret_sauce	|
      | locked_out_user         | secret_sauce	|
      | problem_user			| secret_sauce	|
      | performance_glitch_user	| secret_sauce	|
      | error_user			    | secret_sauce	|
      | visual_user			    | secret_sauce	|

  @loginFail #TC-003
  Scenario Outline: Login with placeholders empty
    Given a user, goes to the login page
    When the user enters "<username>" and "<password>"
    Then the user should see an alert message that said "<errorMessage>"

    Examples:
      | username	  | password      | errorMessage 	                    |
      |		          |	              | Epic sadface: Username is required  |
      | standard_user | 	          | Epic sadface: Password is required  |
      | 		      | secret_sauce  | Epic sadface: Username is required  |
