Feature: LoggedIn User view

  Scenario:  Validate user is able to view after login
    Given User navigates to the login page
    When User successfully enters the log in details
    Then User should be able to view the product category page