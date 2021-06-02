Feature: Order Item

  Scenario: Place order for T-Shirt
    Given  User navigate to DummySite Login page
    Then He Login as a registered 'prabhafeb16@gmail.com' and 'Test@1234' successfully
    And He should be in login page

    When User search for a 'Dress' with a 'T-shirts > Faded Short Sleeve T-shirts' from home page
    Then He add the product to basket
    And He proceed to checkout

    When User in checkout page he proceed to billing address page
    Then From billing address page he proceed to shipping Page
    And From shipping page he proceed to payment page

    When User in Payment page he selects payment option as Bank transfer
    Then From Order Summary page user place the order
    And He will be in OrderConfirmation page

    Given User navigate to MyAccount page
    When He selects Order history option
    Then He will be navigate to OrderHistory page
    And He see the place order reference number


