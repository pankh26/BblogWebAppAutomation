Feature: Verify presence and functionality of Favorite Article icon
  Number of scenarios: 5

  Scenario: Verify presence of favorite icon for articles on Global Feed screen
    Given User is on Homepage of the application
    And User navigates to login page
    And User enters username and password
    When User clicks on Global Feed tab
    Then User should see favorite icon for article

  Scenario: Verify empty screen message on Favorited Articles tab
    Given User is on Homepage of the application
    And User navigates to login page
    And User enters username and password
    And User lands on Your Feed screen
    And User clicks on username displayed on top
    When User clicks on Favorited Articles tab
    Then User should see "No articles are here... yet." text

  Scenario: Verify favorite article icon without signing into the app
    Given User is on Homepage of the application
    When User clicks on Home tab
    And User lands on Global Feed screen
    Then User should not see favorite icon for article

  Scenario: Verify favorite icon displayed for own article post on My Articles tab
    Given User is on Homepage of the application
    And User navigates to login page
    And User enters username and password
    And User lands on Your Feed screen
    And User clicks on New post button
    And User enters values in input boxes
    And User clicks on Publish Article button
    And User clicks on username displayed on top
    When User clicks on My Articles tab
    Then User should see favorite icon for article

  Scenario: Verify number of Unfavorite Post icon displayed on article details page
    Given User is on Homepage of the application
    And User navigates to login page
    And User enters username and password
    And User clicks on Global Feed tab
    And User clicks on favorite icon for any article
    When User clicks on the same article
    Then User should see Unfavorite Post icon on two places on screen