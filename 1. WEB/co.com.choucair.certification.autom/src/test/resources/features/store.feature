#Autor Henry

  @storie
  Feature: Exito Store
    As a customer, I want to add products to the shopping cart
  @scenario1
  Scenario: As a customer I want to view my added products on the cart
    Given a customer is on the online store
    When he selects one category page
    And he adds the products to the cart
    And he goes to view his cart
    Then he should see the added products in the shopping car
    And the total price should be correct
    And the products added should be correct