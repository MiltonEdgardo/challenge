Feature: Login Functionality

  @MLService
  Scenario: Getting the response from ML url
    Given a user, goes to the ML url
    When the user receive the response from the page
      Then the user should see the departments options in it