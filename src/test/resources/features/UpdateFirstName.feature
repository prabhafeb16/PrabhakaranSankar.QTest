Feature: Order Item

  Scenario: Update First name
    Given  User navigate to DummySite Login page
    Then He Login as a registered 'prabhafeb16@gmail.com' and 'Test@1234' successfully

    When User select Personal Informaiton option from my Account page
    Then He updates First Name field
    And He Validated the change




