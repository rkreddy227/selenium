Feature: Login Tests
  
  This is feature file contains all the login tests

  Scenario: Verify that user able to successfully login to valid username and password
    Given A user is on store.demoqa.com
    When user clicks on MyAccount link
    And user logs in using valid username and password
    Then user is taken to the myaccount page
