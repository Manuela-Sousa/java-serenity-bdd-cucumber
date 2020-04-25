Feature: Login Action

  Scenario Outline: Login scenarios with credentials

  Make login with valid email and valid password

    Given I open opensourcecms website
    When Makes login with valid <user> and <password>
    Then Sees user logged in menu

    Examples:
      | user          | password      |
      | opensourcecms | opensourcecms |


