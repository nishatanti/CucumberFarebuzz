# Author
# Date
# Description
@SmokeFeature
Feature: Test BTOB Login Functionality

  @smoketest
  
  Scenario: Check Login is sucessfull 
    Given user is on home page
    When click on Login link
    And enter Username and Password 
    |username| password |
    | FBTEST | FBTEST123|
    | FBUZZ25 | FBUZZ25 |
    And click on Login button
    Then user is navigated to BTOB login page
    
