Feature: Check the functionality of Car search window

@smoketest
Scenario: Verify the Car search window

Given User is on HomepagE
When Click on car tab
And  Enter pickup location
And  Enter pickup and dropoff date and time
And  Click search button
Then User navigate to the car listing page