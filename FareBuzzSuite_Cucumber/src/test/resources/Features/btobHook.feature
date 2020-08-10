@SmokeFeature
Feature: Test btob Login Functionality

  @smoketest
  Scenario: Check the btob Login is sucessfull 
     
    Given click on Loginlink
    When enter uname and pwd    
    And click on Login btn
    Then user is navigated to btob login page
