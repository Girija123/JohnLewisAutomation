Feature: Create Account Test

  DEsc..

  @reg
    Scenario: Verify Create Account feature with valid data

    Given I'm on Home Page "http://www.next.co.uk"
    When I click on My Account link
    And I click on Register now button
    And I select title "Mr"
    And I enter firstname "George"
