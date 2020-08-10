Feature: Test MSW functionality for roundtrip at ListingPage 

  
   
  @regressiontest
  Scenario: Check start new search window for roundtrip
    Given User is on ListingPage
    When enter new source and destination city
    And  enter new depart and return date
    And  enter pax count and class
    And  click on msw search btn
    Then user navigate to listing page with new search



