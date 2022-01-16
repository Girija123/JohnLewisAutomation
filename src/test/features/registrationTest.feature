Feature: Verify create account

  As a user
  I should be creating account and use the application

  @reg
  Scenario Outline: Verify user could create account with valid/invalid/no data

    Given I'm on Home Page "http://www.johnlewis.com"
    When I click on sign in link
    And I click on Create account button
    And I enter email address "<username>"
    And I enter password "<password>"
    And I opt for subscription
    And I click sign up button
    Then I should get re-directed to profile page

    Examples:
      | username               | password |
      | GeorgeLynn@example.com | Lynn123@ |
      | TomAndrews@sample.com  | Tom123@  |
      | JohnAdams@sample.com   |          |

