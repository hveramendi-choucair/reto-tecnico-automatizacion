#Autor Henry

Feature: Exito Store app automation
  As a customer, I want to add one product to the shopping cart

  Scenario: As a customer I want to view my added product on the shopping cart
    Given that Juan is on the app store
    When he login with username "hveramendi@choucairtesting.com" and the password "Pruebas123"
    And he selects one category page
    And he adds one products to the cart
    And he goes to view his shopping cart
    Then he should see the added products in the shopping cart