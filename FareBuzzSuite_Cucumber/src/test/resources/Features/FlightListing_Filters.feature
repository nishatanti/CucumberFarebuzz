Feature: Listing Page Filters
 Verify all the filters of flight listing page

 
  Scenario: Verify flight times filter
    Given User is On HomePage 
    And  Enter all the details of ISW 
    And  Click on search button
    And  User is navigated to listing page
    When Click on going slider from left    
    Then Slider selected time will appear in the contract
    

 