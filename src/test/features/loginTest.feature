Feature: Login
  Login Test

  @reg
  Scenario: Verify Login with invalid data

    Given I'm on Home Page "http://www.next.co.uk"
    When I click on My Account link
    And I enter invalid username
    And I enter invalid password
    And I click login button
    Then I should get "Sorry, we have been unable to sign you in." message.