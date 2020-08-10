
@RegressionFeature
Feature: Test ISW functionality for all trips at Homepage
  
Background:
  Given User is on HomePage
   
  @regressiontest
  Scenario: Check search window for roundtrip
   
    When select roundtrip button 
    And  enter source and destination city
    And  enter depart and return date
    And  enter passenger count and class
    And  click on enter button
    Then user is navigated to listing page

  @regressiontest
  Scenario: Check search window for onewaytrip
    
    When select onewaytrip button 
    And  enter source and destination city
    And  enter depart date
    And  enter passenger count and class
    And  click on enter button
    Then user is navigated to listing page


@regressiontest
  Scenario: Check search window for multicitytrip
    
    When select multicitytrip button 
    And  enter source and destination city for flight1 
    And  enter depart date for flight1
    And  enter source and destination city for flight2
    And  enter depart date for flight2
    And  enter passenger count and class
    And  click on enter button
    Then user is navigated to listing page
      