
@Regression
Feature: Check the functionality of ISW hotel search

Scenario: Check hotel search functionality

    Given User is on HoMepage
    And  click on hotel tab
    When Enter all the details for hotel search
    |Destination| CheckIn | CheckOut  |Rooms |Adults|Children|
    |LAX       |8/24/2020| 8/31/2020 |1     |2     |1       |
    
    And Click on search button of hotel
    Then User navigate to hotel listing page
      
  
  
   
